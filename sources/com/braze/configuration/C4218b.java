package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appboy.enums.DeviceKey;
import com.appboy.enums.LocationProviderName;
import com.appboy.enums.SdkFlavor;
import com.appboy.support.PackageUtils;
import com.braze.configuration.C4236c;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p042bo.app.C3215i;
import p042bo.app.C3724u0;
import p042bo.app.C3744v0;
import p126j0.C8266c;
import p292z.C10732c;
import p404of.C13074a;

/* renamed from: com.braze.configuration.b */
public class C4218b extends C4236c {
    public static final C4219a Companion = new C4219a((DefaultConstructorMarker) null);
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = ((int) TimeUnit.SECONDS.toMillis(15));
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    private static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final int MAX_ALLOWED_EPHEMERAL_EVENTS = 12;
    private final Context context;

    /* renamed from: com.braze.configuration.b$a */
    public static final class C4219a {
        public /* synthetic */ C4219a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4219a() {
        }
    }

    /* renamed from: com.braze.configuration.b$b */
    public enum C4220b {
        EPHEMERAL_EVENTS_ENABLED("com_braze_ephemeral_events_enabled"),
        EPHEMERAL_EVENTS_KEYS("com_braze_ephemeral_events_keys"),
        API_KEY("com_braze_api_key"),
        SERVER_TARGET_KEY("com_braze_server_target"),
        ADM_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_push_adm_messaging_registration_enabled"),
        SMALL_NOTIFICATION_ICON_KEY("com_braze_push_small_notification_icon"),
        LARGE_NOTIFICATION_ICON_KEY("com_braze_push_large_notification_icon"),
        SESSION_TIMEOUT_KEY("com_braze_session_timeout"),
        ENABLE_LOCATION_COLLECTION_KEY("com_braze_enable_location_collection"),
        DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY("com_braze_default_notification_accent_color"),
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS("com_braze_trigger_action_minimum_time_interval_seconds"),
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY("com_braze_handle_push_deep_links_automatically"),
        NEWSFEED_UNREAD_VISUAL_INDICATOR_ON("com_braze_newsfeed_unread_visual_indicator_on"),
        SDK_FLAVOR("com_braze_sdk_flavor"),
        CUSTOM_ENDPOINT("com_braze_custom_endpoint"),
        DEFAULT_NOTIFICATION_CHANNEL_NAME("com_braze_default_notification_channel_name"),
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION("com_braze_default_notification_channel_description"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY("com_braze_push_deep_link_back_stack_activity_enabled"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY("com_braze_push_deep_link_back_stack_activity_class_name"),
        SESSION_START_BASED_TIMEOUT_ENABLED_KEY("com_braze_session_start_based_timeout_enabled"),
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_firebase_cloud_messaging_registration_enabled"),
        FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY("com_braze_firebase_cloud_messaging_sender_id"),
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED("com_braze_content_cards_unread_visual_indicator_enabled"),
        DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY("com_braze_device_object_whitelisting_enabled"),
        DEVICE_OBJECT_ALLOWLIST_VALUE("com_braze_device_object_whitelist"),
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled"),
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED("com_braze_push_wake_screen_for_notification_enabled"),
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED("com_braze_push_notification_html_rendering_enabled"),
        GEOFENCES_ENABLED("com_braze_geofences_enabled"),
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY("com_braze_in_app_message_push_test_eager_display_enabled"),
        LOGGER_INITIAL_LOG_LEVEL("com_braze_logger_initial_log_level"),
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY("com_braze_custom_html_webview_activity_class_name"),
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY("com_braze_automatic_geofence_requests_enabled"),
        CUSTOM_LOCATION_PROVIDERS_LIST_KEY("com_braze_custom_location_providers_list"),
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms"),
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY("com_braze_firebase_messaging_service_automatically_register_on_new_token"),
        SDK_AUTH_ENABLED("com_braze_sdk_authentication_enabled"),
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY("com_braze_require_touch_mode_for_html_in_app_messages"),
        DATA_SYNC_BAD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_bad_network"),
        DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_good_network"),
        DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_great_network"),
        SDK_METADATA_INTERNAL_KEY("com_braze_internal_sdk_metadata"),
        SDK_METADATA_PUBLIC_KEY("com_braze_sdk_metadata"),
        HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS("com_braze_html_in_app_message_apply_insets");
        

        /* renamed from: b */
        private final String f3470b;

        private C4220b(String str) {
            this.f3470b = str;
        }

        /* renamed from: b */
        public final String mo30938b() {
            return this.f3470b;
        }
    }

    /* renamed from: com.braze.configuration.b$c */
    static final class C4221c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f3471g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4221c(String str) {
            super(0);
            this.f3471g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Couldn't find application icon for package: ", this.f3471g);
        }
    }

    /* renamed from: com.braze.configuration.b$d */
    static final class C4222d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4222d f3472g = new C4222d();

        C4222d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "****************************************************";
        }
    }

    /* renamed from: com.braze.configuration.b$e */
    static final class C4223e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4223e f3473g = new C4223e();

        C4223e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Found an override api key. Using it to configure the Braze SDK";
        }
    }

    /* renamed from: com.braze.configuration.b$f */
    static final class C4224f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4224f f3474g = new C4224f();

        C4224f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "****************************************************";
        }
    }

    /* renamed from: com.braze.configuration.b$g */
    static final class C4225g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4225g f3475g = new C4225g();

        C4225g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    /* renamed from: com.braze.configuration.b$h */
    static final class C4226h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4226h f3476g = new C4226h();

        C4226h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                 !! WARNING !!                  **";
        }
    }

    /* renamed from: com.braze.configuration.b$i */
    static final class C4227i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4227i f3477g = new C4227i();

        C4227i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    /* renamed from: com.braze.configuration.b$j */
    static final class C4228j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4228j f3478g = new C4228j();

        C4228j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**     No API key set in res/values/braze.xml     **";
        }
    }

    /* renamed from: com.braze.configuration.b$k */
    static final class C4229k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4229k f3479g = new C4229k();

        C4229k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "** No cached API Key found from Braze.configure   **";
        }
    }

    /* renamed from: com.braze.configuration.b$l */
    static final class C4230l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4230l f3480g = new C4230l();

        C4230l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**          Braze functionality disabled          **";
        }
    }

    /* renamed from: com.braze.configuration.b$m */
    static final class C4231m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4231m f3481g = new C4231m();

        C4231m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "**                                                **";
        }
    }

    /* renamed from: com.braze.configuration.b$n */
    static final class C4232n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4232n f3482g = new C4232n();

        C4232n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Using default notification accent color found in resources";
        }
    }

    /* renamed from: com.braze.configuration.b$o */
    static final class C4233o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4233o f3483g = new C4233o();

        C4233o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
        }
    }

    /* renamed from: com.braze.configuration.b$p */
    static final class C4234p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4234p f3484g = new C4234p();

        C4234p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while parsing stored SDK flavor. Returning null.";
        }
    }

    /* renamed from: com.braze.configuration.b$q */
    static final class C4235q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4235q f3485g = new C4235q();

        C4235q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to read the version code.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4218b(Context context2) {
        super(context2, false, (C4245d) null, 6, (DefaultConstructorMarker) null);
        C12775o.m28639i(context2, "context");
        Context applicationContext = context2.getApplicationContext();
        C12775o.m28638h(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> cls, C4220b bVar) {
        String b = bVar.mo30938b();
        if (getConfigurationCache().containsKey(b)) {
            Object obj = getConfigurationCache().get(b);
            if (obj != null) {
                return (EnumSet) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
        }
        Set stringSetValue = getStringSetValue(bVar.mo30938b(), new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet();
        }
        EnumSet<E> a = C3724u0.m3969a(cls, (Set<String>) stringSetValue);
        getConfigurationCache().put(b, a);
        return a;
    }

    private final String getServerTarget() {
        String stringValue = getStringValue(C4220b.SERVER_TARGET_KEY.mo30938b(), "PROD");
        if (stringValue == null) {
            return "PROD";
        }
        return stringValue;
    }

    public final void clear() {
        getConfigurationCache().clear();
        getRuntimeAppConfigurationProvider().mo30980g().edit().clear().apply();
    }

    public final int getApplicationIconResourceId() {
        int i;
        ApplicationInfo applicationInfo;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        String packageName = this.context.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = this.context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0));
            } else {
                applicationInfo = this.context.getPackageManager().getApplicationInfo(packageName, 0);
            }
            C12775o.m28638h(applicationInfo, "if (Build.VERSION.SDK_IN… 0)\n                    }");
            i = applicationInfo.icon;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C4221c(packageName), 4, (Object) null);
            i = 0;
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i));
        return i;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale locale = Locale.US;
        C12775o.m28638h(locale, "US");
        String upperCase = serverTarget.toUpperCase(locale);
        C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (C12775o.m28634d("STAGING", upperCase)) {
            return "https://sondheim.braze.com/api/v3/";
        }
        return "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final C3215i getBrazeApiKey() {
        String b = C4220b.API_KEY.mo30938b();
        String str = (String) getConfigurationCache().get(b);
        if (str == null) {
            str = getRuntimeAppConfigurationProvider().mo30982i(b, (String) null);
            if (str != null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C4223e.f3473g, 6, (Object) null);
            } else {
                str = getStringValue(b, (String) null);
            }
            if (str != null) {
                getConfigurationCache().put(b, str);
            }
        }
        if (str != null) {
            return new C3215i(str);
        }
        C8266c cVar = C8266c.f11641a;
        C8266c cVar2 = cVar;
        C8266c.C8267a aVar = C8266c.C8267a.f11651g;
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4224f.f3474g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4225g.f3475g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4226h.f3476g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4227i.f3477g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4228j.f3478g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4229k.f3479g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4230l.f3480g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4231m.f3481g, 6, (Object) null);
        C8266c.m16396e(cVar2, this, aVar, (Throwable) null, false, C4222d.f3472g, 6, (Object) null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final Context getContext$android_sdk_base_release() {
        return this.context;
    }

    public final String getCustomEndpoint() {
        return getStringValue(C4220b.CUSTOM_ENDPOINT.mo30938b(), (String) null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        return getStringValue(C4220b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.mo30938b(), "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, C4220b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue(C4220b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.mo30938b());
        if (colorValue == null) {
            return 0;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4232n.f3482g, 7, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        String stringValue = getStringValue(C4220b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.mo30938b(), "");
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        String stringValue = getStringValue(C4220b.DEFAULT_NOTIFICATION_CHANNEL_NAME.mo30938b(), DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
        if (stringValue == null) {
            return DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE;
        }
        return stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, C4220b.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final EnumSet<DeviceKey> getDeviceObjectWhitelist() {
        return getDeviceObjectAllowlist();
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        return getBooleanValue(C4220b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.mo30938b(), false);
    }

    public final Set<String> getEphemeralEventKeys() {
        Set<String> stringSetValue = getStringSetValue(C4220b.EPHEMERAL_EVENTS_KEYS.mo30938b(), C12731y0.m28551e());
        if (stringSetValue == null) {
            stringSetValue = C12731y0.m28551e();
        }
        if (stringSetValue.size() > 12) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4233o.f3483g, 6, (Object) null);
        }
        return C12686e0.m28209F0(C12686e0.m28244w0(stringSetValue, 12));
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue(C4220b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.mo30938b(), (String) null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue(C4220b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.mo30938b(), DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        return getDrawableValue(C4220b.LARGE_NOTIFICATION_ICON_KEY.mo30938b(), 0);
    }

    public final int getLoggerInitialLogLevel() {
        return getIntValue(C4220b.LOGGER_INITIAL_LOG_LEVEL.mo30938b(), 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue(C4220b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.mo30938b(), "");
    }

    public final SdkFlavor getSdkFlavor() {
        boolean z;
        String stringValue = getStringValue(C4220b.SDK_FLAVOR.mo30938b(), (String) null);
        if (stringValue == null || C13754v.m31532t(stringValue)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            Locale locale = Locale.US;
            C12775o.m28638h(locale, "US");
            String upperCase = stringValue.toUpperCase(locale);
            C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return SdkFlavor.valueOf(upperCase);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4234p.f3484g, 4, (Object) null);
            return null;
        }
    }

    public final EnumSet<C10732c> getSdkMetadata() {
        String b = C4220b.SDK_METADATA_INTERNAL_KEY.mo30938b();
        C4236c.C4238b bVar = C4236c.C4238b.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(bVar, b, new HashSet());
        if (resourceConfigurationValue != null) {
            Set<String> e = C12772l0.m28613e(resourceConfigurationValue);
            String b2 = C4220b.SDK_METADATA_PUBLIC_KEY.mo30938b();
            Object resourceConfigurationValue2 = getResourceConfigurationValue(bVar, b2, new HashSet());
            if (resourceConfigurationValue2 != null) {
                Set set = (Set) resourceConfigurationValue2;
                Object runtimeConfigurationValue = getRuntimeConfigurationValue(bVar, b2, new HashSet());
                if (runtimeConfigurationValue != null) {
                    e.addAll(set);
                    e.addAll((Set) runtimeConfigurationValue);
                    C3724u0 u0Var = C3724u0.f2650a;
                    EnumSet<C10732c> noneOf = EnumSet.noneOf(C10732c.class);
                    for (String str : e) {
                        try {
                            C3724u0 u0Var2 = C3724u0.f2650a;
                            Locale locale = Locale.US;
                            C12775o.m28638h(locale, "US");
                            String upperCase = str.toUpperCase(locale);
                            C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
                            C10732c[] values = C10732c.values();
                            int length = values.length;
                            int i = 0;
                            while (i < length) {
                                C10732c cVar = values[i];
                                i++;
                                if (C12775o.m28634d(cVar.name(), upperCase)) {
                                    noneOf.add(cVar);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        } catch (Exception e2) {
                            C8266c.m16396e(C8266c.f11641a, C3724u0.f2650a, C8266c.C8267a.f11649e, e2, false, new C3744v0(str), 4, (Object) null);
                        }
                    }
                    C12775o.m28638h(noneOf, "result");
                    return noneOf;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
    }

    public final int getSessionTimeoutSeconds() {
        return getIntValue(C4220b.SESSION_TIMEOUT_KEY.mo30938b(), 10);
    }

    public final int getSmallNotificationIconResourceId() {
        return getDrawableValue(C4220b.SMALL_NOTIFICATION_ICON_KEY.mo30938b(), 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        return (long) getIntValue(C4220b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.mo30938b(), 30);
    }

    public final int getVersionCode() {
        int i;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            if (obj != null) {
                return ((Integer) obj).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        try {
            i = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4235q.f3485g, 4, (Object) null);
            i = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i));
        return i;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue(C4220b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.mo30938b(), false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue(C4220b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.mo30938b(), true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue(C4220b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.mo30938b(), true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        return getBooleanValue(C4220b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.mo30938b(), false);
    }

    public final boolean isDeviceObjectWhitelistEnabled() {
        return isDeviceObjectAllowlistEnabled();
    }

    public final boolean isEphemeralEventsEnabled() {
        return getBooleanValue(C4220b.EPHEMERAL_EVENTS_ENABLED.mo30938b(), false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue(C4220b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.mo30938b(), false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue(C4220b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.mo30938b(), isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        return getBooleanValue(C4220b.GEOFENCES_ENABLED.mo30938b(), isLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        return getBooleanValue(C4220b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.mo30938b(), false);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue(C4220b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.mo30938b(), false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue(C4220b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.mo30938b(), true);
    }

    public final boolean isLocationCollectionEnabled() {
        return getBooleanValue(C4220b.ENABLE_LOCATION_COLLECTION_KEY.mo30938b(), false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        return getBooleanValue(C4220b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.mo30938b(), true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue(C4220b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.mo30938b(), true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue(C4220b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.mo30938b(), false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        return getBooleanValue(C4220b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.mo30938b(), true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        return getBooleanValue(C4220b.SDK_AUTH_ENABLED.mo30938b(), false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        return getBooleanValue(C4220b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.mo30938b(), false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue(C4220b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.mo30938b(), true);
    }

    public static /* synthetic */ void getContext$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDefaultNotificationAccentColor$annotations() {
    }

    private static /* synthetic */ void getServerTarget$annotations() {
    }

    public static /* synthetic */ void getVersionCode$annotations() {
    }
}
