package androidx.webkit.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p378kg.C12660a;

public enum WebViewFeatureInternal implements ConditionallySupportedFeature {
    VISUAL_STATE_CALLBACK(WebViewFeature.VISUAL_STATE_CALLBACK, WebViewFeature.VISUAL_STATE_CALLBACK, 23),
    OFF_SCREEN_PRERASTER(WebViewFeature.OFF_SCREEN_PRERASTER, WebViewFeature.OFF_SCREEN_PRERASTER, 23),
    SAFE_BROWSING_ENABLE(WebViewFeature.SAFE_BROWSING_ENABLE, WebViewFeature.SAFE_BROWSING_ENABLE, 26),
    DISABLED_ACTION_MODE_MENU_ITEMS(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS, WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS, 24),
    START_SAFE_BROWSING(WebViewFeature.START_SAFE_BROWSING, WebViewFeature.START_SAFE_BROWSING, 27),
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED(WebViewFeature.SAFE_BROWSING_WHITELIST, WebViewFeature.SAFE_BROWSING_WHITELIST, 27),
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED(WebViewFeature.SAFE_BROWSING_WHITELIST, WebViewFeature.SAFE_BROWSING_ALLOWLIST, 27),
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED(WebViewFeature.SAFE_BROWSING_ALLOWLIST, WebViewFeature.SAFE_BROWSING_WHITELIST, 27),
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED(WebViewFeature.SAFE_BROWSING_ALLOWLIST, WebViewFeature.SAFE_BROWSING_ALLOWLIST, 27),
    SAFE_BROWSING_PRIVACY_POLICY_URL(WebViewFeature.SAFE_BROWSING_PRIVACY_POLICY_URL, WebViewFeature.SAFE_BROWSING_PRIVACY_POLICY_URL, 27),
    SERVICE_WORKER_BASIC_USAGE(WebViewFeature.SERVICE_WORKER_BASIC_USAGE, WebViewFeature.SERVICE_WORKER_BASIC_USAGE, 24),
    SERVICE_WORKER_CACHE_MODE(WebViewFeature.SERVICE_WORKER_CACHE_MODE, WebViewFeature.SERVICE_WORKER_CACHE_MODE, 24),
    SERVICE_WORKER_CONTENT_ACCESS(WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS, WebViewFeature.SERVICE_WORKER_CONTENT_ACCESS, 24),
    SERVICE_WORKER_FILE_ACCESS(WebViewFeature.SERVICE_WORKER_FILE_ACCESS, WebViewFeature.SERVICE_WORKER_FILE_ACCESS, 24),
    SERVICE_WORKER_BLOCK_NETWORK_LOADS(WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS, WebViewFeature.SERVICE_WORKER_BLOCK_NETWORK_LOADS, 24),
    SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST(WebViewFeature.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, WebViewFeature.SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST, 24),
    RECEIVE_WEB_RESOURCE_ERROR(WebViewFeature.RECEIVE_WEB_RESOURCE_ERROR, WebViewFeature.RECEIVE_WEB_RESOURCE_ERROR, 23),
    RECEIVE_HTTP_ERROR(WebViewFeature.RECEIVE_HTTP_ERROR, WebViewFeature.RECEIVE_HTTP_ERROR, 23),
    SHOULD_OVERRIDE_WITH_REDIRECTS(WebViewFeature.SHOULD_OVERRIDE_WITH_REDIRECTS, WebViewFeature.SHOULD_OVERRIDE_WITH_REDIRECTS, 24),
    SAFE_BROWSING_HIT(WebViewFeature.SAFE_BROWSING_HIT, WebViewFeature.SAFE_BROWSING_HIT, 27),
    WEB_RESOURCE_REQUEST_IS_REDIRECT(WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT, WebViewFeature.WEB_RESOURCE_REQUEST_IS_REDIRECT, 24),
    WEB_RESOURCE_ERROR_GET_DESCRIPTION(WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION, WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION, 23),
    WEB_RESOURCE_ERROR_GET_CODE(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE, WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE, 23),
    SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY(WebViewFeature.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, WebViewFeature.SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY, 27),
    SAFE_BROWSING_RESPONSE_PROCEED(WebViewFeature.SAFE_BROWSING_RESPONSE_PROCEED, WebViewFeature.SAFE_BROWSING_RESPONSE_PROCEED, 27),
    SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL(WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL, 27),
    WEB_MESSAGE_PORT_POST_MESSAGE(WebViewFeature.WEB_MESSAGE_PORT_POST_MESSAGE, WebViewFeature.WEB_MESSAGE_PORT_POST_MESSAGE, 23),
    WEB_MESSAGE_PORT_CLOSE(WebViewFeature.WEB_MESSAGE_PORT_CLOSE, WebViewFeature.WEB_MESSAGE_PORT_CLOSE, 23),
    WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK(WebViewFeature.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, WebViewFeature.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK, 23),
    CREATE_WEB_MESSAGE_CHANNEL(WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL, WebViewFeature.CREATE_WEB_MESSAGE_CHANNEL, 23),
    POST_WEB_MESSAGE(WebViewFeature.POST_WEB_MESSAGE, WebViewFeature.POST_WEB_MESSAGE, 23),
    WEB_MESSAGE_CALLBACK_ON_MESSAGE(WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE, WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE, 23),
    GET_WEB_VIEW_CLIENT(WebViewFeature.GET_WEB_VIEW_CLIENT, WebViewFeature.GET_WEB_VIEW_CLIENT, 26),
    GET_WEB_CHROME_CLIENT(WebViewFeature.GET_WEB_CHROME_CLIENT, WebViewFeature.GET_WEB_CHROME_CLIENT, 26),
    GET_WEB_VIEW_RENDERER(WebViewFeature.GET_WEB_VIEW_RENDERER, WebViewFeature.GET_WEB_VIEW_RENDERER, 29),
    WEB_VIEW_RENDERER_TERMINATE(WebViewFeature.WEB_VIEW_RENDERER_TERMINATE, WebViewFeature.WEB_VIEW_RENDERER_TERMINATE, 29),
    TRACING_CONTROLLER_BASIC_USAGE(WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE, WebViewFeature.TRACING_CONTROLLER_BASIC_USAGE, 28),
    WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE(WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, WebViewFeature.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE, 29),
    PROXY_OVERRIDE(WebViewFeature.PROXY_OVERRIDE, "PROXY_OVERRIDE:3"),
    SUPPRESS_ERROR_PAGE(WebViewFeature.SUPPRESS_ERROR_PAGE, WebViewFeature.SUPPRESS_ERROR_PAGE),
    MULTI_PROCESS(WebViewFeature.MULTI_PROCESS, "MULTI_PROCESS_QUERY"),
    FORCE_DARK(WebViewFeature.FORCE_DARK, WebViewFeature.FORCE_DARK),
    FORCE_DARK_STRATEGY(WebViewFeature.FORCE_DARK_STRATEGY, "FORCE_DARK_BEHAVIOR"),
    WEB_MESSAGE_LISTENER(WebViewFeature.WEB_MESSAGE_LISTENER, WebViewFeature.WEB_MESSAGE_LISTENER),
    DOCUMENT_START_SCRIPT(WebViewFeature.DOCUMENT_START_SCRIPT, "DOCUMENT_START_SCRIPT:1");
    
    private static final int NOT_SUPPORTED_BY_FRAMEWORK = -1;
    private final String mInternalFeatureValue;
    private final int mOsVersion;
    private final String mPublicFeatureValue;

    private static class LAZY_HOLDER {
        static final Set<String> WEBVIEW_APK_FEATURES = null;

        static {
            WEBVIEW_APK_FEATURES = new HashSet(Arrays.asList(WebViewGlueCommunicator.getFactory().getWebViewFeatures()));
        }

        private LAZY_HOLDER() {
        }
    }

    private WebViewFeatureInternal(@NonNull String str, @NonNull String str2) {
        this(r7, r8, str, str2, -1);
    }

    @NonNull
    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @NonNull
    public static Set<String> getWebViewApkFeaturesForTesting() {
        return LAZY_HOLDER.WEBVIEW_APK_FEATURES;
    }

    public static boolean isSupported(@NonNull String str) {
        HashSet hashSet = new HashSet();
        for (WebViewFeatureInternal add : values()) {
            hashSet.add(add);
        }
        return isSupported(str, hashSet);
    }

    @NonNull
    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }

    public boolean isSupportedByFramework() {
        int i = this.mOsVersion;
        if (i != -1 && Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }

    public boolean isSupportedByWebView() {
        return C12660a.m28163b(LAZY_HOLDER.WEBVIEW_APK_FEATURES, this.mInternalFeatureValue);
    }

    private WebViewFeatureInternal(@NonNull String str, @NonNull String str2, int i) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str2;
        this.mOsVersion = i;
    }

    @VisibleForTesting
    public static boolean isSupported(@NonNull String str, @NonNull Collection<ConditionallySupportedFeature> collection) {
        HashSet<ConditionallySupportedFeature> hashSet = new HashSet<>();
        for (ConditionallySupportedFeature next : collection) {
            if (next.getPublicFeatureName().equals(str)) {
                hashSet.add(next);
            }
        }
        if (!hashSet.isEmpty()) {
            for (ConditionallySupportedFeature isSupported : hashSet) {
                if (isSupported.isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    public boolean isSupported() {
        return isSupportedByFramework() || isSupportedByWebView();
    }
}
