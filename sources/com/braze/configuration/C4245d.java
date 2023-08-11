package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.C4218b;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p042bo.app.C3724u0;
import p126j0.C8266c;
import p292z.C10732c;
import p404of.C13074a;

/* renamed from: com.braze.configuration.d */
public final class C4245d {

    /* renamed from: c */
    public static final C4246a f3505c = new C4246a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f3506a;

    /* renamed from: b */
    private SharedPreferences.Editor f3507b;

    /* renamed from: com.braze.configuration.d$a */
    public static final class C4246a {
        public /* synthetic */ C4246a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4246a() {
        }
    }

    /* renamed from: com.braze.configuration.d$b */
    static final class C4247b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4247b f3508g = new C4247b();

        C4247b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Clearing Braze Override configuration cache";
        }
    }

    /* renamed from: com.braze.configuration.d$c */
    static final class C4248c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C4216a f3509g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4248c(C4216a aVar) {
            super(0);
            this.f3509g = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Setting Braze Override configuration with config: ", this.f3509g);
        }
    }

    public C4245d(Context context) {
        C12775o.m28639i(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f3506a = sharedPreferences;
    }

    /* renamed from: j */
    private final void m4925j(String str, Boolean bool) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            SharedPreferences.Editor e = mo30978e();
            if (e != null) {
                e.putBoolean(str, booleanValue);
            }
        }
    }

    /* renamed from: l */
    private final <T extends Enum<T>> void m4926l(EnumSet<T> enumSet, String str) {
        if (enumSet != null) {
            Set<String> a = C3724u0.m3970a(enumSet);
            SharedPreferences.Editor editor = this.f3507b;
            if (editor != null) {
                editor.putStringSet(str, a);
            }
        }
    }

    /* renamed from: m */
    private final void m4927m(String str, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            SharedPreferences.Editor e = mo30978e();
            if (e != null) {
                e.putInt(str, intValue);
            }
        }
    }

    /* renamed from: a */
    public final void mo30974a() {
        SharedPreferences.Editor editor = this.f3507b;
        if (editor != null) {
            editor.apply();
        }
    }

    /* renamed from: b */
    public final void mo30975b() {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4247b.f3508g, 7, (Object) null);
        this.f3506a.edit().clear().apply();
    }

    /* renamed from: c */
    public final boolean mo30976c(String str) {
        C12775o.m28639i(str, "key");
        return this.f3506a.contains(str);
    }

    /* renamed from: d */
    public final boolean mo30977d(String str, boolean z) {
        C12775o.m28639i(str, "key");
        return this.f3506a.getBoolean(str, z);
    }

    /* renamed from: e */
    public final SharedPreferences.Editor mo30978e() {
        return this.f3507b;
    }

    /* renamed from: f */
    public final int mo30979f(String str, int i) {
        C12775o.m28639i(str, "key");
        return this.f3506a.getInt(str, i);
    }

    /* renamed from: g */
    public final SharedPreferences mo30980g() {
        return this.f3506a;
    }

    /* renamed from: h */
    public final Set<String> mo30981h(String str, Set<String> set) {
        C12775o.m28639i(str, "key");
        return this.f3506a.getStringSet(str, set);
    }

    /* renamed from: i */
    public final String mo30982i(String str, String str2) {
        C12775o.m28639i(str, "key");
        return this.f3506a.getString(str, str2);
    }

    /* renamed from: k */
    public final void mo30983k(String str, Enum<?> enumR) {
        C12775o.m28639i(str, "key");
        if (enumR != null) {
            mo30984n(str, enumR.toString());
        }
    }

    /* renamed from: n */
    public final void mo30984n(String str, String str2) {
        SharedPreferences.Editor e;
        C12775o.m28639i(str, "key");
        if (str2 != null && (e = mo30978e()) != null) {
            e.putString(str, str2);
        }
    }

    /* renamed from: o */
    public final void mo30985o(C4216a aVar) {
        C12775o.m28639i(aVar, "config");
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C4248c(aVar), 6, (Object) null);
        mo30986p();
        mo30984n(C4218b.C4220b.API_KEY.mo30938b(), aVar.f3360b);
        mo30984n(C4218b.C4220b.SERVER_TARGET_KEY.mo30938b(), aVar.f3361c);
        mo30983k(C4218b.C4220b.SDK_FLAVOR.mo30938b(), aVar.f3370l);
        m4925j(C4218b.C4220b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.mo30938b(), aVar.f3381w);
        mo30984n(C4218b.C4220b.CUSTOM_ENDPOINT.mo30938b(), aVar.f3364f);
        mo30984n(C4218b.C4220b.SMALL_NOTIFICATION_ICON_KEY.mo30938b(), aVar.f3362d);
        mo30984n(C4218b.C4220b.LARGE_NOTIFICATION_ICON_KEY.mo30938b(), aVar.f3363e);
        m4927m(C4218b.C4220b.SESSION_TIMEOUT_KEY.mo30938b(), aVar.f3371m);
        m4927m(C4218b.C4220b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.mo30938b(), aVar.f3372n);
        m4927m(C4218b.C4220b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.mo30938b(), aVar.f3373o);
        m4925j(C4218b.C4220b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.mo30938b(), aVar.f3378t);
        m4925j(C4218b.C4220b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.mo30938b(), aVar.f3379u);
        m4925j(C4218b.C4220b.ENABLE_LOCATION_COLLECTION_KEY.mo30938b(), aVar.f3380v);
        m4927m(C4218b.C4220b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.mo30938b(), aVar.f3374p);
        m4927m(C4218b.C4220b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.mo30938b(), aVar.f3375q);
        m4927m(C4218b.C4220b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.mo30938b(), aVar.f3376r);
        mo30984n(C4218b.C4220b.DEFAULT_NOTIFICATION_CHANNEL_NAME.mo30938b(), aVar.f3365g);
        mo30984n(C4218b.C4220b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.mo30938b(), aVar.f3366h);
        m4925j(C4218b.C4220b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.mo30938b(), aVar.f3382x);
        mo30984n(C4218b.C4220b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.mo30938b(), aVar.f3367i);
        m4925j(C4218b.C4220b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.mo30938b(), aVar.f3383y);
        m4925j(C4218b.C4220b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.mo30938b(), aVar.f3384z);
        mo30984n(C4218b.C4220b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.mo30938b(), aVar.f3368j);
        m4925j(C4218b.C4220b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.mo30938b(), aVar.f3344A);
        m4925j(C4218b.C4220b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.mo30938b(), aVar.f3355L);
        m4925j(C4218b.C4220b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.mo30938b(), aVar.f3345B);
        m4925j(C4218b.C4220b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.mo30938b(), aVar.f3346C);
        m4925j(C4218b.C4220b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.mo30938b(), aVar.f3347D);
        m4925j(C4218b.C4220b.GEOFENCES_ENABLED.mo30938b(), aVar.f3348E);
        m4925j(C4218b.C4220b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.mo30938b(), aVar.f3349F);
        mo30984n(C4218b.C4220b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.mo30938b(), aVar.f3369k);
        m4925j(C4218b.C4220b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.mo30938b(), aVar.f3350G);
        m4927m(C4218b.C4220b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.mo30938b(), aVar.f3377s);
        m4925j(C4218b.C4220b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.mo30938b(), aVar.f3351H);
        m4925j(C4218b.C4220b.SDK_AUTH_ENABLED.mo30938b(), aVar.f3352I);
        m4925j(C4218b.C4220b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.mo30938b(), aVar.f3353J);
        m4925j(C4218b.C4220b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.mo30938b(), aVar.f3358O);
        m4926l(aVar.f3354K, C4218b.C4220b.DEVICE_OBJECT_ALLOWLIST_VALUE.mo30938b());
        m4926l(aVar.f3356M, C4218b.C4220b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY.mo30938b());
        EnumSet<C10732c> enumSet = aVar.f3357N;
        if (enumSet != null) {
            mo30987q(C4218b.C4220b.SDK_METADATA_PUBLIC_KEY.mo30938b(), enumSet);
        }
        mo30974a();
    }

    /* renamed from: p */
    public final void mo30986p() {
        this.f3507b = this.f3506a.edit();
    }

    /* renamed from: q */
    public final <T extends Enum<T>> void mo30987q(String str, EnumSet<T> enumSet) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(enumSet, "updateValue");
        Set<String> h = mo30981h(str, new HashSet());
        if (h != null) {
            h.addAll(C3724u0.m3970a(enumSet));
        }
        this.f3506a.edit().putStringSet(str, h).apply();
    }
}
