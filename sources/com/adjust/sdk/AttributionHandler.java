package com.adjust.sdk;

import android.net.Uri;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import com.adjust.sdk.scheduler.TimerOnce;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AttributionHandler implements IAttributionHandler, IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final String ATTRIBUTION_TIMER_NAME = "Attribution timer";
    /* access modifiers changed from: private */
    public WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    /* access modifiers changed from: private */
    public String lastInitiatedBy;
    private ILogger logger = AdjustFactory.getLogger();
    private boolean paused;
    private ThreadScheduler scheduler = new SingleThreadCachedScheduler("AttributionHandler");
    private TimerOnce timer = new TimerOnce(new Runnable() {
        public void run() {
            AttributionHandler.this.sendAttributionRequest();
        }
    }, ATTRIBUTION_TIMER_NAME);

    public AttributionHandler(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
    }

    private ActivityPackage buildAndGetAttributionPackage() {
        long currentTimeMillis = System.currentTimeMillis();
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        ActivityPackage buildAttributionPackage = new PackageBuilder(iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getActivityState(), iActivityHandler.getSessionParameters(), currentTimeMillis).buildAttributionPackage(this.lastInitiatedBy);
        this.lastInitiatedBy = null;
        return buildAttributionPackage;
    }

    private void checkAttributionI(IActivityHandler iActivityHandler, ResponseData responseData) {
        if (responseData.jsonResponse != null) {
            Long l = responseData.askIn;
            if (l == null || l.longValue() < 0) {
                iActivityHandler.setAskingAttribution(false);
                return;
            }
            iActivityHandler.setAskingAttribution(true);
            this.lastInitiatedBy = "backend";
            getAttributionI(l.longValue());
        }
    }

    /* access modifiers changed from: private */
    public void checkAttributionResponseI(IActivityHandler iActivityHandler, AttributionResponseData attributionResponseData) {
        checkAttributionI(iActivityHandler, attributionResponseData);
        checkDeeplinkI(attributionResponseData);
        iActivityHandler.launchAttributionResponseTasks(attributionResponseData);
    }

    private void checkDeeplinkI(AttributionResponseData attributionResponseData) {
        JSONObject optJSONObject;
        String optString;
        JSONObject jSONObject = attributionResponseData.jsonResponse;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("attribution")) != null && (optString = optJSONObject.optString(Constants.DEEPLINK, (String) null)) != null) {
            attributionResponseData.deeplink = Uri.parse(optString);
        }
    }

    /* access modifiers changed from: private */
    public void checkSdkClickResponseI(IActivityHandler iActivityHandler, SdkClickResponseData sdkClickResponseData) {
        checkAttributionI(iActivityHandler, sdkClickResponseData);
        iActivityHandler.launchSdkClickResponseTasks(sdkClickResponseData);
    }

    /* access modifiers changed from: private */
    public void checkSessionResponseI(IActivityHandler iActivityHandler, SessionResponseData sessionResponseData) {
        checkAttributionI(iActivityHandler, sessionResponseData);
        iActivityHandler.launchSessionResponseTasks(sessionResponseData);
    }

    private Map<String, String> generateSendingParametersI() {
        HashMap hashMap = new HashMap();
        PackageBuilder.addString(hashMap, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public void getAttributionI(long j) {
        if (this.timer.getFireIn() <= j) {
            if (j != 0) {
                String format = Util.SecondsDisplayFormat.format(((double) j) / 1000.0d);
                this.logger.debug("Waiting to query attribution in %s seconds", format);
            }
            this.timer.startIn(j);
        }
    }

    /* access modifiers changed from: private */
    public void sendAttributionRequest() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                AttributionHandler.this.sendAttributionRequestI();
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendAttributionRequestI() {
        if (!this.activityHandlerWeakRef.get().getActivityState().isGdprForgotten) {
            if (this.paused) {
                this.logger.debug("Attribution handler is paused", new Object[0]);
                return;
            }
            ActivityPackage buildAndGetAttributionPackage = buildAndGetAttributionPackage();
            this.logger.verbose("%s", buildAndGetAttributionPackage.getExtendedString());
            this.activityPackageSender.sendActivityPackage(buildAndGetAttributionPackage, generateSendingParametersI(), this);
        }
    }

    public void checkAttributionResponse(final AttributionResponseData attributionResponseData) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    AttributionHandler.this.checkAttributionResponseI(iActivityHandler, attributionResponseData);
                }
            }
        });
    }

    public void checkSdkClickResponse(final SdkClickResponseData sdkClickResponseData) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    AttributionHandler.this.checkSdkClickResponseI(iActivityHandler, sdkClickResponseData);
                }
            }
        });
    }

    public void checkSessionResponse(final SessionResponseData sessionResponseData) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    AttributionHandler.this.checkSessionResponseI(iActivityHandler, sessionResponseData);
                }
            }
        });
    }

    public void getAttribution() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                String unused = AttributionHandler.this.lastInitiatedBy = "sdk";
                AttributionHandler.this.getAttributionI(0);
            }
        });
    }

    public void init(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.paused = !z;
        this.activityPackageSender = iActivityPackageSender;
    }

    public void onResponseDataCallback(final ResponseData responseData) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) AttributionHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    ResponseData responseData = responseData;
                    if (responseData.trackingState == TrackingState.OPTED_OUT) {
                        iActivityHandler.gotOptOutResponse();
                    } else if (responseData instanceof AttributionResponseData) {
                        AttributionHandler.this.checkAttributionResponseI(iActivityHandler, (AttributionResponseData) responseData);
                    }
                }
            }
        });
    }

    public void pauseSending() {
        this.paused = true;
    }

    public void resumeSending() {
        this.paused = false;
    }

    public void teardown() {
        this.logger.verbose("AttributionHandler teardown", new Object[0]);
        TimerOnce timerOnce = this.timer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.timer = null;
        this.logger = null;
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
    }
}
