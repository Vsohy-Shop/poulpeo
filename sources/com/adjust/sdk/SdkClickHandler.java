package com.adjust.sdk;

import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class SdkClickHandler implements ISdkClickHandler {
    private static final double MILLISECONDS_TO_SECONDS_DIVISOR = 1000.0d;
    private static final String SCHEDULED_EXECUTOR_SOURCE = "SdkClickHandler";
    private static final String SOURCE_INSTALL_REFERRER = "install_referrer";
    private static final String SOURCE_REFTAG = "reftag";
    /* access modifiers changed from: private */
    public WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private BackoffStrategy backoffStrategy = AdjustFactory.getSdkClickBackoffStrategy();
    /* access modifiers changed from: private */
    public ILogger logger = AdjustFactory.getLogger();
    /* access modifiers changed from: private */
    public List<ActivityPackage> packageQueue;
    private boolean paused;
    private ThreadScheduler scheduler = new SingleThreadCachedScheduler(SCHEDULED_EXECUTOR_SOURCE);

    public SdkClickHandler(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, z, iActivityPackageSender);
    }

    private Map<String, String> generateSendingParametersI() {
        HashMap hashMap = new HashMap();
        PackageBuilder.addString(hashMap, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.packageQueue.size() - 1;
        if (size > 0) {
            PackageBuilder.addLong(hashMap, "queue_size", (long) size);
        }
        return hashMap;
    }

    private void logErrorMessageI(ActivityPackage activityPackage, String str, Throwable th) {
        this.logger.error(Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th)), new Object[0]);
    }

    private void retrySendingI(ActivityPackage activityPackage) {
        int increaseRetries = activityPackage.increaseRetries();
        this.logger.error("Retrying sdk_click package for the %d time", Integer.valueOf(increaseRetries));
        sendSdkClick(activityPackage);
    }

    /* access modifiers changed from: private */
    public void sendNextSdkClick() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                SdkClickHandler.this.sendNextSdkClickI();
            }
        });
    }

    /* access modifiers changed from: private */
    public void sendNextSdkClickI() {
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler.getActivityState() != null && !iActivityHandler.getActivityState().isGdprForgotten && !this.paused && !this.packageQueue.isEmpty()) {
            final ActivityPackage remove = this.packageQueue.remove(0);
            int retries = remove.getRetries();
            C41285 r3 = new Runnable() {
                public void run() {
                    SdkClickHandler.this.sendSdkClickI(remove);
                    SdkClickHandler.this.sendNextSdkClick();
                }
            };
            if (retries <= 0) {
                r3.run();
                return;
            }
            long waitingTime = Util.getWaitingTime(retries, this.backoffStrategy);
            String format = Util.SecondsDisplayFormat.format(((double) waitingTime) / 1000.0d);
            this.logger.verbose("Waiting for %s seconds before retrying sdk_click for the %d time", format, Integer.valueOf(retries));
            this.scheduler.schedule(r3, waitingTime);
        }
    }

    /* access modifiers changed from: private */
    public void sendSdkClickI(ActivityPackage activityPackage) {
        boolean z;
        boolean z2;
        Boolean bool;
        String str;
        String str2;
        long j;
        String str3;
        long j2;
        long j3;
        long j4;
        boolean z3;
        long j5;
        String str4;
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        String str5 = activityPackage.getParameters().get(APIParams.SOURCE);
        if (str5 == null || !str5.equals("reftag")) {
            z = false;
        } else {
            z = true;
        }
        String str6 = activityPackage.getParameters().get("raw_referrer");
        if (!z || new SharedPreferencesManager(iActivityHandler.getContext()).getRawReferrer(str6, activityPackage.getClickTimeInMilliseconds()) != null) {
            if (str5 == null || !str5.equals("install_referrer")) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                j3 = activityPackage.getClickTimeInSeconds();
                j2 = activityPackage.getInstallBeginTimeInSeconds();
                str3 = activityPackage.getParameters().get(Constants.REFERRER);
                j = activityPackage.getClickTimeServerInSeconds();
                long installBeginTimeServerInSeconds = activityPackage.getInstallBeginTimeServerInSeconds();
                String installVersion = activityPackage.getInstallVersion();
                bool = activityPackage.getGooglePlayInstant();
                str = activityPackage.getParameters().get("referrer_api");
                j4 = installBeginTimeServerInSeconds;
                str2 = installVersion;
            } else {
                str3 = null;
                j3 = -1;
                j4 = -1;
                j2 = -1;
                j = -1;
                str2 = null;
                str = null;
                bool = null;
            }
            String str7 = str2;
            if (str5 == null || !str5.equals(Constants.PREINSTALL)) {
                z3 = false;
            } else {
                z3 = true;
            }
            ResponseData sendActivityPackageSync = this.activityPackageSender.sendActivityPackageSync(activityPackage, generateSendingParametersI());
            if (sendActivityPackageSync instanceof SdkClickResponseData) {
                SdkClickResponseData sdkClickResponseData = (SdkClickResponseData) sendActivityPackageSync;
                if (sdkClickResponseData.willRetry) {
                    retrySendingI(activityPackage);
                } else if (iActivityHandler != null) {
                    if (sdkClickResponseData.trackingState == TrackingState.OPTED_OUT) {
                        iActivityHandler.gotOptOutResponse();
                        return;
                    }
                    if (z) {
                        j5 = j4;
                        new SharedPreferencesManager(iActivityHandler.getContext()).removeRawReferrer(str6, activityPackage.getClickTimeInMilliseconds());
                    } else {
                        j5 = j4;
                    }
                    if (z2) {
                        sdkClickResponseData.clickTime = j3;
                        sdkClickResponseData.installBegin = j2;
                        sdkClickResponseData.installReferrer = str3;
                        sdkClickResponseData.clickTimeServer = j;
                        sdkClickResponseData.installBeginServer = j5;
                        sdkClickResponseData.installVersion = str7;
                        sdkClickResponseData.googlePlayInstant = bool;
                        sdkClickResponseData.referrerApi = str;
                        sdkClickResponseData.isInstallReferrer = true;
                    }
                    if (z3 && (str4 = activityPackage.getParameters().get("found_location")) != null && !str4.isEmpty()) {
                        SharedPreferencesManager sharedPreferencesManager = new SharedPreferencesManager(iActivityHandler.getContext());
                        if (Constants.SYSTEM_INSTALLER_REFERRER.equalsIgnoreCase(str4)) {
                            sharedPreferencesManager.removePreinstallReferrer();
                        } else {
                            sharedPreferencesManager.setPreinstallPayloadReadStatus(PreinstallUtil.markAsRead(str4, sharedPreferencesManager.getPreinstallPayloadReadStatus()));
                        }
                    }
                    iActivityHandler.finishedTrackingActivity(sdkClickResponseData);
                }
            }
        }
    }

    public void init(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        this.paused = !z;
        this.packageQueue = new ArrayList();
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.activityPackageSender = iActivityPackageSender;
    }

    public void pauseSending() {
        this.paused = true;
    }

    public void resumeSending() {
        this.paused = false;
        sendNextSdkClick();
    }

    public void sendPreinstallPayload(final String str, final String str2) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) SdkClickHandler.this.activityHandlerWeakRef.get();
                if (iActivityHandler != null) {
                    SdkClickHandler.this.sendSdkClick(PackageFactory.buildPreinstallSdkClickPackage(str, str2, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getSessionParameters()));
                }
            }
        });
    }

    public void sendReftagReferrers() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                IActivityHandler iActivityHandler = (IActivityHandler) SdkClickHandler.this.activityHandlerWeakRef.get();
                SharedPreferencesManager sharedPreferencesManager = new SharedPreferencesManager(iActivityHandler.getContext());
                try {
                    JSONArray rawReferrerArray = sharedPreferencesManager.getRawReferrerArray();
                    boolean z = false;
                    for (int i = 0; i < rawReferrerArray.length(); i++) {
                        JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                        if (jSONArray.optInt(2, -1) == 0) {
                            String optString = jSONArray.optString(0, (String) null);
                            long optLong = jSONArray.optLong(1, -1);
                            jSONArray.put(2, 1);
                            SdkClickHandler.this.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(optString, optLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getSessionParameters()));
                            z = true;
                        }
                    }
                    if (z) {
                        sharedPreferencesManager.saveRawReferrerArray(rawReferrerArray);
                    }
                } catch (JSONException e) {
                    SdkClickHandler.this.logger.error("Send saved raw referrers error (%s)", e.getMessage());
                }
            }
        });
    }

    public void sendSdkClick(final ActivityPackage activityPackage) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                SdkClickHandler.this.packageQueue.add(activityPackage);
                SdkClickHandler.this.logger.debug("Added sdk_click %d", Integer.valueOf(SdkClickHandler.this.packageQueue.size()));
                SdkClickHandler.this.logger.verbose("%s", activityPackage.getExtendedString());
                SdkClickHandler.this.sendNextSdkClick();
            }
        });
    }

    public void teardown() {
        this.logger.verbose("SdkClickHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.logger = null;
        this.packageQueue = null;
        this.backoffStrategy = null;
        this.scheduler = null;
    }
}
