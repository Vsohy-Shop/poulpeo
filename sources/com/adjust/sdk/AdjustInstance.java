package com.adjust.sdk;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class AdjustInstance {
    private IActivityHandler activityHandler;
    private String basePath;
    private String gdprPath;
    private PreLaunchActions preLaunchActions = new PreLaunchActions();
    private String pushToken;
    private Boolean startEnabled = null;
    private boolean startOffline = false;
    private String subscriptionPath;

    public static class PreLaunchActions {
        public Boolean lastMeasurementConsentTracked = null;
        public List<IRunActivityHandler> preLaunchActionsArray = new ArrayList();
        public List<AdjustThirdPartySharing> preLaunchAdjustThirdPartySharingArray = new ArrayList();
    }

    private boolean checkActivityHandler() {
        return checkActivityHandler((String) null);
    }

    private boolean isInstanceEnabled() {
        Boolean bool = this.startEnabled;
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    private void saveDisableThirdPartySharing(final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).setDisableThirdPartySharing();
            }
        });
    }

    private void saveGdprForgetMe(final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).setGdprForgetMe();
            }
        });
    }

    private void savePreinstallReferrer(final String str, final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).savePreinstallReferrer(str);
            }
        });
    }

    private void savePushToken(final String str, final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).savePushToken(str);
            }
        });
    }

    private void saveRawReferrer(String str, long j, Context context) {
        final Context context2 = context;
        final String str2 = str;
        final long j2 = j;
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context2).saveRawReferrer(str2, j2);
            }
        });
    }

    private void setSendingReferrersAsNotSent(final Context context) {
        Util.runInBackground(new Runnable() {
            public void run() {
                new SharedPreferencesManager(context).setSendingReferrersAsNotSent();
            }
        });
    }

    public void addSessionCallbackParameter(final String str, final String str2) {
        if (checkActivityHandler("adding session callback parameter")) {
            this.activityHandler.addSessionCallbackParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() {
                public void run(ActivityHandler activityHandler) {
                    activityHandler.addSessionCallbackParameterI(str, str2);
                }
            });
        }
    }

    public void addSessionPartnerParameter(final String str, final String str2) {
        if (checkActivityHandler("adding session partner parameter")) {
            this.activityHandler.addSessionPartnerParameter(str, str2);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() {
                public void run(ActivityHandler activityHandler) {
                    activityHandler.addSessionPartnerParameterI(str, str2);
                }
            });
        }
    }

    public void appWillOpenUrl(Uri uri) {
        if (checkActivityHandler()) {
            this.activityHandler.readOpenUrl(uri, System.currentTimeMillis());
        }
    }

    public void disableThirdPartySharing(Context context) {
        if (!checkActivityHandler("disable third party sharing")) {
            saveDisableThirdPartySharing(context);
        } else {
            this.activityHandler.disableThirdPartySharing();
        }
    }

    public void gdprForgetMe(Context context) {
        saveGdprForgetMe(context);
        if (checkActivityHandler("gdpr") && this.activityHandler.isEnabled()) {
            this.activityHandler.gdprForgetMe();
        }
    }

    public String getAdid() {
        if (!checkActivityHandler()) {
            return null;
        }
        return this.activityHandler.getAdid();
    }

    public AdjustAttribution getAttribution() {
        if (!checkActivityHandler()) {
            return null;
        }
        return this.activityHandler.getAttribution();
    }

    public String getSdkVersion() {
        return Util.getSdkVersion();
    }

    public boolean isEnabled() {
        if (!checkActivityHandler()) {
            return isInstanceEnabled();
        }
        return this.activityHandler.isEnabled();
    }

    public void onCreate(AdjustConfig adjustConfig) {
        if (adjustConfig == null) {
            AdjustFactory.getLogger().error("AdjustConfig missing", new Object[0]);
        } else if (!adjustConfig.isValid()) {
            AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new Object[0]);
        } else if (this.activityHandler != null) {
            AdjustFactory.getLogger().error("Adjust already initialized", new Object[0]);
        } else {
            adjustConfig.preLaunchActions = this.preLaunchActions;
            adjustConfig.pushToken = this.pushToken;
            adjustConfig.startEnabled = this.startEnabled;
            adjustConfig.startOffline = this.startOffline;
            adjustConfig.basePath = this.basePath;
            adjustConfig.gdprPath = this.gdprPath;
            adjustConfig.subscriptionPath = this.subscriptionPath;
            this.activityHandler = AdjustFactory.getActivityHandler(adjustConfig);
            setSendingReferrersAsNotSent(adjustConfig.context);
        }
    }

    public void onPause() {
        if (checkActivityHandler()) {
            this.activityHandler.onPause();
        }
    }

    public void onResume() {
        if (checkActivityHandler()) {
            this.activityHandler.onResume();
        }
    }

    public void removeSessionCallbackParameter(final String str) {
        if (checkActivityHandler("removing session callback parameter")) {
            this.activityHandler.removeSessionCallbackParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() {
                public void run(ActivityHandler activityHandler) {
                    activityHandler.removeSessionCallbackParameterI(str);
                }
            });
        }
    }

    public void removeSessionPartnerParameter(final String str) {
        if (checkActivityHandler("removing session partner parameter")) {
            this.activityHandler.removeSessionPartnerParameter(str);
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() {
                public void run(ActivityHandler activityHandler) {
                    activityHandler.removeSessionPartnerParameterI(str);
                }
            });
        }
    }

    public void resetSessionCallbackParameters() {
        if (checkActivityHandler("resetting session callback parameters")) {
            this.activityHandler.resetSessionCallbackParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() {
                public void run(ActivityHandler activityHandler) {
                    activityHandler.resetSessionCallbackParametersI();
                }
            });
        }
    }

    public void resetSessionPartnerParameters() {
        if (checkActivityHandler("resetting session partner parameters")) {
            this.activityHandler.resetSessionPartnerParameters();
        } else {
            this.preLaunchActions.preLaunchActionsArray.add(new IRunActivityHandler() {
                public void run(ActivityHandler activityHandler) {
                    activityHandler.resetSessionPartnerParametersI();
                }
            });
        }
    }

    public void sendFirstPackages() {
        if (checkActivityHandler()) {
            this.activityHandler.sendFirstPackages();
        }
    }

    public void sendPreinstallReferrer(String str, Context context) {
        if (str != null && str.length() != 0) {
            savePreinstallReferrer(str, context);
            if (checkActivityHandler("preinstall referrer") && this.activityHandler.isEnabled()) {
                this.activityHandler.sendPreinstallReferrer();
            }
        }
    }

    public void sendReferrer(String str, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            saveRawReferrer(str, currentTimeMillis, context);
            if (checkActivityHandler(Constants.REFERRER) && this.activityHandler.isEnabled()) {
                this.activityHandler.sendReftagReferrer();
            }
        }
    }

    public void setEnabled(boolean z) {
        this.startEnabled = Boolean.valueOf(z);
        if (checkActivityHandler(z, "enabled mode", "disabled mode")) {
            this.activityHandler.setEnabled(z);
        }
    }

    public void setOfflineMode(boolean z) {
        if (!checkActivityHandler(z, "offline mode", "online mode")) {
            this.startOffline = z;
        } else {
            this.activityHandler.setOfflineMode(z);
        }
    }

    public void setPushToken(String str) {
        if (!checkActivityHandler("push token")) {
            this.pushToken = str;
        } else {
            this.activityHandler.setPushToken(str, false);
        }
    }

    public void setTestOptions(AdjustTestOptions adjustTestOptions) {
        String str = adjustTestOptions.basePath;
        if (str != null) {
            this.basePath = str;
        }
        String str2 = adjustTestOptions.gdprPath;
        if (str2 != null) {
            this.gdprPath = str2;
        }
        String str3 = adjustTestOptions.subscriptionPath;
        if (str3 != null) {
            this.subscriptionPath = str3;
        }
        String str4 = adjustTestOptions.baseUrl;
        if (str4 != null) {
            AdjustFactory.setBaseUrl(str4);
        }
        String str5 = adjustTestOptions.gdprUrl;
        if (str5 != null) {
            AdjustFactory.setGdprUrl(str5);
        }
        String str6 = adjustTestOptions.subscriptionUrl;
        if (str6 != null) {
            AdjustFactory.setSubscriptionUrl(str6);
        }
        Long l = adjustTestOptions.timerIntervalInMilliseconds;
        if (l != null) {
            AdjustFactory.setTimerInterval(l.longValue());
        }
        if (adjustTestOptions.timerStartInMilliseconds != null) {
            AdjustFactory.setTimerStart(adjustTestOptions.timerIntervalInMilliseconds.longValue());
        }
        Long l2 = adjustTestOptions.sessionIntervalInMilliseconds;
        if (l2 != null) {
            AdjustFactory.setSessionInterval(l2.longValue());
        }
        Long l3 = adjustTestOptions.subsessionIntervalInMilliseconds;
        if (l3 != null) {
            AdjustFactory.setSubsessionInterval(l3.longValue());
        }
        Boolean bool = adjustTestOptions.tryInstallReferrer;
        if (bool != null) {
            AdjustFactory.setTryInstallReferrer(bool.booleanValue());
        }
        if (adjustTestOptions.noBackoffWait != null) {
            BackoffStrategy backoffStrategy = BackoffStrategy.NO_WAIT;
            AdjustFactory.setPackageHandlerBackoffStrategy(backoffStrategy);
            AdjustFactory.setSdkClickBackoffStrategy(backoffStrategy);
        }
        Boolean bool2 = adjustTestOptions.enableSigning;
        if (bool2 != null && bool2.booleanValue()) {
            AdjustFactory.enableSigning();
        }
        Boolean bool3 = adjustTestOptions.disableSigning;
        if (bool3 != null && bool3.booleanValue()) {
            AdjustFactory.disableSigning();
        }
    }

    public void teardown() {
        if (checkActivityHandler()) {
            this.activityHandler.teardown();
            this.activityHandler = null;
        }
    }

    public void trackAdRevenue(String str, JSONObject jSONObject) {
        if (checkActivityHandler()) {
            this.activityHandler.trackAdRevenue(str, jSONObject);
        }
    }

    public void trackEvent(AdjustEvent adjustEvent) {
        if (checkActivityHandler()) {
            this.activityHandler.trackEvent(adjustEvent);
        }
    }

    public void trackMeasurementConsent(boolean z) {
        if (!checkActivityHandler("measurement consent")) {
            this.preLaunchActions.lastMeasurementConsentTracked = Boolean.valueOf(z);
            return;
        }
        this.activityHandler.trackMeasurementConsent(z);
    }

    public void trackPlayStoreSubscription(AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityHandler()) {
            this.activityHandler.trackPlayStoreSubscription(adjustPlayStoreSubscription);
        }
    }

    public void trackThirdPartySharing(AdjustThirdPartySharing adjustThirdPartySharing) {
        if (!checkActivityHandler("third party sharing")) {
            this.preLaunchActions.preLaunchAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
        } else {
            this.activityHandler.trackThirdPartySharing(adjustThirdPartySharing);
        }
    }

    private boolean checkActivityHandler(boolean z, String str, String str2) {
        if (z) {
            return checkActivityHandler(str);
        }
        return checkActivityHandler(str2);
    }

    public void trackAdRevenue(AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityHandler()) {
            this.activityHandler.trackAdRevenue(adjustAdRevenue);
        }
    }

    private boolean checkActivityHandler(String str) {
        if (this.activityHandler != null) {
            return true;
        }
        if (str != null) {
            AdjustFactory.getLogger().warn("Adjust not initialized, but %s saved for launch", str);
        } else {
            AdjustFactory.getLogger().error("Adjust not initialized correctly", new Object[0]);
        }
        return false;
    }

    public void appWillOpenUrl(Uri uri, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!checkActivityHandler()) {
            new SharedPreferencesManager(context).saveDeeplink(uri, currentTimeMillis);
        } else {
            this.activityHandler.readOpenUrl(uri, currentTimeMillis);
        }
    }

    public void setPushToken(String str, Context context) {
        savePushToken(str, context);
        if (checkActivityHandler("push token") && this.activityHandler.isEnabled()) {
            this.activityHandler.setPushToken(str, true);
        }
    }
}
