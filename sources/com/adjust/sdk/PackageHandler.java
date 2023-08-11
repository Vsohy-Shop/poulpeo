package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadScheduler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class PackageHandler implements IPackageHandler, IActivityPackageSender.ResponseDataCallbackSubscriber {
    private static final String PACKAGE_QUEUE_FILENAME = "AdjustIoPackageQueue";
    private static final String PACKAGE_QUEUE_NAME = "Package queue";
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private IActivityPackageSender activityPackageSender;
    private BackoffStrategy backoffStrategy = AdjustFactory.getPackageHandlerBackoffStrategy();
    private BackoffStrategy backoffStrategyForInstallSession = AdjustFactory.getInstallSessionBackoffStrategy();
    private Context context;
    /* access modifiers changed from: private */
    public AtomicBoolean isSending;
    /* access modifiers changed from: private */
    public ILogger logger = AdjustFactory.getLogger();
    private List<ActivityPackage> packageQueue;
    private boolean paused;
    private ThreadScheduler scheduler = new SingleThreadCachedScheduler("PackageHandler");

    public PackageHandler(IActivityHandler iActivityHandler, Context context2, boolean z, IActivityPackageSender iActivityPackageSender) {
        init(iActivityHandler, context2, z, iActivityPackageSender);
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.initI();
            }
        });
    }

    /* access modifiers changed from: private */
    public void addI(ActivityPackage activityPackage) {
        this.packageQueue.add(activityPackage);
        this.logger.debug("Added package %d (%s)", Integer.valueOf(this.packageQueue.size()), activityPackage);
        this.logger.verbose("%s", activityPackage.getExtendedString());
        writePackageQueueI();
    }

    public static Boolean deletePackageQueue(Context context2) {
        return Boolean.valueOf(context2.deleteFile(PACKAGE_QUEUE_FILENAME));
    }

    static void deleteState(Context context2) {
        deletePackageQueue(context2);
    }

    /* access modifiers changed from: private */
    public void flushI() {
        this.packageQueue.clear();
        writePackageQueueI();
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

    /* access modifiers changed from: private */
    public void initI() {
        this.isSending = new AtomicBoolean();
        readPackageQueueI();
    }

    private void readPackageQueueI() {
        try {
            this.packageQueue = (List) Util.readObject(this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME, List.class);
        } catch (Exception e) {
            this.logger.error("Failed to read %s file (%s)", PACKAGE_QUEUE_NAME, e.getMessage());
            this.packageQueue = null;
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            this.logger.debug("Package handler read %d packages", Integer.valueOf(list.size()));
            return;
        }
        this.packageQueue = new ArrayList();
    }

    /* access modifiers changed from: private */
    public void sendFirstI() {
        if (!this.packageQueue.isEmpty()) {
            if (this.paused) {
                this.logger.debug("Package handler is paused", new Object[0]);
            } else if (this.isSending.getAndSet(true)) {
                this.logger.verbose("Package handler is already sending", new Object[0]);
            } else {
                Map<String, String> generateSendingParametersI = generateSendingParametersI();
                this.activityPackageSender.sendActivityPackage(this.packageQueue.get(0), generateSendingParametersI, this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendNextI() {
        if (!this.packageQueue.isEmpty()) {
            this.packageQueue.remove(0);
            writePackageQueueI();
            this.isSending.set(false);
            this.logger.verbose("Package handler can send", new Object[0]);
            sendFirstI();
        }
    }

    private void writePackageQueueI() {
        Util.writeObject(this.packageQueue, this.context, PACKAGE_QUEUE_FILENAME, PACKAGE_QUEUE_NAME);
        this.logger.debug("Package handler wrote %d packages", Integer.valueOf(this.packageQueue.size()));
    }

    public void addPackage(final ActivityPackage activityPackage) {
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.addI(activityPackage);
            }
        });
    }

    public void flush() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.flushI();
            }
        });
    }

    public void init(IActivityHandler iActivityHandler, Context context2, boolean z, IActivityPackageSender iActivityPackageSender) {
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
        this.context = context2;
        this.paused = !z;
        this.activityPackageSender = iActivityPackageSender;
    }

    public void onResponseDataCallback(ResponseData responseData) {
        long j;
        this.logger.debug("Got response in PackageHandler", new Object[0]);
        IActivityHandler iActivityHandler = this.activityHandlerWeakRef.get();
        if (iActivityHandler != null && responseData.trackingState == TrackingState.OPTED_OUT) {
            iActivityHandler.gotOptOutResponse();
        }
        if (!responseData.willRetry) {
            this.scheduler.submit(new Runnable() {
                public void run() {
                    PackageHandler.this.sendNextI();
                }
            });
            if (iActivityHandler != null) {
                iActivityHandler.finishedTrackingActivity(responseData);
                return;
            }
            return;
        }
        if (iActivityHandler != null) {
            iActivityHandler.finishedTrackingActivity(responseData);
        }
        C41205 r0 = new Runnable() {
            public void run() {
                PackageHandler.this.logger.verbose("Package handler can send", new Object[0]);
                PackageHandler.this.isSending.set(false);
                PackageHandler.this.sendFirstPackage();
            }
        };
        ActivityPackage activityPackage = responseData.activityPackage;
        if (activityPackage == null) {
            r0.run();
            return;
        }
        int increaseRetries = activityPackage.increaseRetries();
        SharedPreferencesManager sharedPreferencesManager = new SharedPreferencesManager(this.context);
        if (responseData.activityPackage.getActivityKind() != ActivityKind.SESSION || sharedPreferencesManager.getInstallTracked()) {
            j = Util.getWaitingTime(increaseRetries, this.backoffStrategy);
        } else {
            j = Util.getWaitingTime(increaseRetries, this.backoffStrategyForInstallSession);
        }
        String format = Util.SecondsDisplayFormat.format(((double) j) / 1000.0d);
        this.logger.verbose("Waiting for %s seconds before retrying the %d time", format, Integer.valueOf(increaseRetries));
        this.scheduler.schedule(r0, j);
    }

    public void pauseSending() {
        this.paused = true;
    }

    public void resumeSending() {
        this.paused = false;
    }

    public void sendFirstPackage() {
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.sendFirstI();
            }
        });
    }

    public void teardown() {
        this.logger.verbose("PackageHandler teardown", new Object[0]);
        ThreadScheduler threadScheduler = this.scheduler;
        if (threadScheduler != null) {
            threadScheduler.teardown();
        }
        WeakReference<IActivityHandler> weakReference = this.activityHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        List<ActivityPackage> list = this.packageQueue;
        if (list != null) {
            list.clear();
        }
        this.scheduler = null;
        this.activityHandlerWeakRef = null;
        this.packageQueue = null;
        this.isSending = null;
        this.context = null;
        this.logger = null;
        this.backoffStrategy = null;
    }

    public void updatePackages(SessionParameters sessionParameters) {
        final SessionParameters sessionParameters2;
        if (sessionParameters != null) {
            sessionParameters2 = sessionParameters.deepCopy();
        } else {
            sessionParameters2 = null;
        }
        this.scheduler.submit(new Runnable() {
            public void run() {
                PackageHandler.this.updatePackagesI(sessionParameters2);
            }
        });
    }

    public void updatePackagesI(SessionParameters sessionParameters) {
        if (sessionParameters != null) {
            this.logger.debug("Updating package handler queue", new Object[0]);
            this.logger.verbose("Session callback parameters: %s", sessionParameters.callbackParameters);
            this.logger.verbose("Session partner parameters: %s", sessionParameters.partnerParameters);
            for (ActivityPackage next : this.packageQueue) {
                Map<String, String> parameters = next.getParameters();
                PackageBuilder.addMapJson(parameters, Constants.CALLBACK_PARAMETERS, Util.mergeParameters(sessionParameters.callbackParameters, next.getCallbackParameters(), "Callback"));
                PackageBuilder.addMapJson(parameters, Constants.PARTNER_PARAMETERS, Util.mergeParameters(sessionParameters.partnerParameters, next.getPartnerParameters(), "Partner"));
            }
            writePackageQueueI();
        }
    }
}
