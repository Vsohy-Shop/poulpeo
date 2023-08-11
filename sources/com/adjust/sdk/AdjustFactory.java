package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class AdjustFactory {
    private static IActivityHandler activityHandler = null;
    private static IAttributionHandler attributionHandler = null;
    private static String baseUrl = null;
    private static UtilNetworking.IConnectionOptions connectionOptions = null;
    private static String gdprUrl = null;
    private static UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = null;
    private static BackoffStrategy installSessionBackoffStrategy = null;
    private static ILogger logger = null;
    private static long maxDelayStart = -1;
    private static IPackageHandler packageHandler = null;
    private static BackoffStrategy packageHandlerBackoffStrategy = null;
    private static BackoffStrategy sdkClickBackoffStrategy = null;
    private static ISdkClickHandler sdkClickHandler = null;
    private static long sessionInterval = -1;
    private static String subscriptionUrl = null;
    private static long subsessionInterval = -1;
    private static long timerInterval = -1;
    private static long timerStart = -1;
    private static boolean tryInstallReferrer = true;

    public static class URLGetConnection {
        HttpsURLConnection httpsURLConnection;
        URL url;

        URLGetConnection(HttpsURLConnection httpsURLConnection2, URL url2) {
            this.httpsURLConnection = httpsURLConnection2;
            this.url = url2;
        }
    }

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte hexString : bArr) {
            String hexString2 = Integer.toHexString(hexString);
            int length = hexString2.length();
            if (length == 1) {
                hexString2 = "0" + hexString2;
            }
            if (length > 2) {
                hexString2 = hexString2.substring(length - 2, length);
            }
            sb.append(hexString2.toUpperCase());
        }
        return sb.toString();
    }

    public static void disableSigning() {
        AdjustSigner.disableSigning(getLogger());
    }

    public static void enableSigning() {
        AdjustSigner.enableSigning(getLogger());
    }

    public static IActivityHandler getActivityHandler(AdjustConfig adjustConfig) {
        IActivityHandler iActivityHandler = activityHandler;
        if (iActivityHandler == null) {
            return ActivityHandler.getInstance(adjustConfig);
        }
        iActivityHandler.init(adjustConfig);
        return activityHandler;
    }

    public static IAttributionHandler getAttributionHandler(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        IAttributionHandler iAttributionHandler = attributionHandler;
        if (iAttributionHandler == null) {
            return new AttributionHandler(iActivityHandler, z, iActivityPackageSender);
        }
        iAttributionHandler.init(iActivityHandler, z, iActivityPackageSender);
        return attributionHandler;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static UtilNetworking.IConnectionOptions getConnectionOptions() {
        UtilNetworking.IConnectionOptions iConnectionOptions = connectionOptions;
        if (iConnectionOptions == null) {
            return UtilNetworking.createDefaultConnectionOptions();
        }
        return iConnectionOptions;
    }

    public static String getGdprUrl() {
        return gdprUrl;
    }

    public static UtilNetworking.IHttpsURLConnectionProvider getHttpsURLConnectionProvider() {
        UtilNetworking.IHttpsURLConnectionProvider iHttpsURLConnectionProvider = httpsURLConnectionProvider;
        if (iHttpsURLConnectionProvider == null) {
            return UtilNetworking.createDefaultHttpsURLConnectionProvider();
        }
        return iHttpsURLConnectionProvider;
    }

    public static BackoffStrategy getInstallSessionBackoffStrategy() {
        BackoffStrategy backoffStrategy = installSessionBackoffStrategy;
        if (backoffStrategy == null) {
            return BackoffStrategy.SHORT_WAIT;
        }
        return backoffStrategy;
    }

    public static ILogger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public static long getMaxDelayStart() {
        long j = maxDelayStart;
        if (j == -1) {
            return 10000;
        }
        return j;
    }

    public static IPackageHandler getPackageHandler(IActivityHandler iActivityHandler, Context context, boolean z, IActivityPackageSender iActivityPackageSender) {
        IPackageHandler iPackageHandler = packageHandler;
        if (iPackageHandler == null) {
            return new PackageHandler(iActivityHandler, context, z, iActivityPackageSender);
        }
        iPackageHandler.init(iActivityHandler, context, z, iActivityPackageSender);
        return packageHandler;
    }

    public static BackoffStrategy getPackageHandlerBackoffStrategy() {
        BackoffStrategy backoffStrategy = packageHandlerBackoffStrategy;
        if (backoffStrategy == null) {
            return BackoffStrategy.LONG_WAIT;
        }
        return backoffStrategy;
    }

    public static BackoffStrategy getSdkClickBackoffStrategy() {
        BackoffStrategy backoffStrategy = sdkClickBackoffStrategy;
        if (backoffStrategy == null) {
            return BackoffStrategy.SHORT_WAIT;
        }
        return backoffStrategy;
    }

    public static ISdkClickHandler getSdkClickHandler(IActivityHandler iActivityHandler, boolean z, IActivityPackageSender iActivityPackageSender) {
        ISdkClickHandler iSdkClickHandler = sdkClickHandler;
        if (iSdkClickHandler == null) {
            return new SdkClickHandler(iActivityHandler, z, iActivityPackageSender);
        }
        iSdkClickHandler.init(iActivityHandler, z, iActivityPackageSender);
        return sdkClickHandler;
    }

    public static long getSessionInterval() {
        long j = sessionInterval;
        if (j == -1) {
            return 1800000;
        }
        return j;
    }

    public static String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public static long getSubsessionInterval() {
        long j = subsessionInterval;
        if (j == -1) {
            return 1000;
        }
        return j;
    }

    public static long getTimerInterval() {
        long j = timerInterval;
        if (j == -1) {
            return 60000;
        }
        return j;
    }

    public static long getTimerStart() {
        long j = timerStart;
        if (j == -1) {
            return 60000;
        }
        return j;
    }

    public static boolean getTryInstallReferrer() {
        return tryInstallReferrer;
    }

    public static void setActivityHandler(IActivityHandler iActivityHandler) {
        activityHandler = iActivityHandler;
    }

    public static void setAttributionHandler(IAttributionHandler iAttributionHandler) {
        attributionHandler = iAttributionHandler;
    }

    public static void setBaseUrl(String str) {
        baseUrl = str;
    }

    public static void setConnectionOptions(UtilNetworking.IConnectionOptions iConnectionOptions) {
        connectionOptions = iConnectionOptions;
    }

    public static void setGdprUrl(String str) {
        gdprUrl = str;
    }

    public static void setHttpsURLConnectionProvider(UtilNetworking.IHttpsURLConnectionProvider iHttpsURLConnectionProvider) {
        httpsURLConnectionProvider = iHttpsURLConnectionProvider;
    }

    public static void setLogger(ILogger iLogger) {
        logger = iLogger;
    }

    public static void setPackageHandler(IPackageHandler iPackageHandler) {
        packageHandler = iPackageHandler;
    }

    public static void setPackageHandlerBackoffStrategy(BackoffStrategy backoffStrategy) {
        packageHandlerBackoffStrategy = backoffStrategy;
    }

    public static void setSdkClickBackoffStrategy(BackoffStrategy backoffStrategy) {
        sdkClickBackoffStrategy = backoffStrategy;
    }

    public static void setSdkClickHandler(ISdkClickHandler iSdkClickHandler) {
        sdkClickHandler = iSdkClickHandler;
    }

    public static void setSessionInterval(long j) {
        sessionInterval = j;
    }

    public static void setSubscriptionUrl(String str) {
        subscriptionUrl = str;
    }

    public static void setSubsessionInterval(long j) {
        subsessionInterval = j;
    }

    public static void setTimerInterval(long j) {
        timerInterval = j;
    }

    public static void setTimerStart(long j) {
        timerStart = j;
    }

    public static void setTryInstallReferrer(boolean z) {
        tryInstallReferrer = z;
    }

    public static void teardown(Context context) {
        if (context != null) {
            ActivityHandler.deleteState(context);
            PackageHandler.deleteState(context);
        }
        packageHandler = null;
        attributionHandler = null;
        activityHandler = null;
        logger = null;
        sdkClickHandler = null;
        timerInterval = -1;
        timerStart = -1;
        sessionInterval = -1;
        subsessionInterval = -1;
        sdkClickBackoffStrategy = null;
        packageHandlerBackoffStrategy = null;
        maxDelayStart = -1;
        baseUrl = Constants.BASE_URL;
        gdprUrl = Constants.GDPR_URL;
        subscriptionUrl = Constants.SUBSCRIPTION_URL;
        connectionOptions = null;
        httpsURLConnectionProvider = null;
        tryInstallReferrer = true;
    }
}
