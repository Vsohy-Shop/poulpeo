package p033b2;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.C4509a;
import com.facebook.FacebookSdk;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p033b2.C2849g;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: b2.m */
/* compiled from: InternalAppEventsLogger.kt */
public final class C2867m {

    /* renamed from: b */
    public static final C2868a f1252b = new C2868a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C2852h f1253a;

    /* renamed from: b2.m$a */
    /* compiled from: InternalAppEventsLogger.kt */
    public static final class C2868a {
        private C2868a() {
        }

        public /* synthetic */ C2868a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Executor mo28396a() {
            return C2852h.f1226j.mo28368f();
        }

        /* renamed from: b */
        public final C2849g.C2851b mo28397b() {
            return C2852h.f1226j.mo28370h();
        }

        /* renamed from: c */
        public final String mo28398c() {
            return C2852h.f1226j.mo28372j();
        }

        @RestrictTo({RestrictTo.Scope.GROUP_ID})
        /* renamed from: d */
        public final void mo28399d(Map<String, String> map) {
            C12775o.m28639i(map, "ud");
            C2875p.m2280i(map);
        }
    }

    public C2867m(C2852h hVar) {
        C12775o.m28639i(hVar, "loggerImpl");
        this.f1253a = hVar;
    }

    /* renamed from: a */
    public final void mo28386a() {
        this.f1253a.mo28357j();
    }

    /* renamed from: b */
    public final void mo28387b(Bundle bundle) {
        boolean z;
        C12775o.m28639i(bundle, "parameters");
        if ((bundle.getInt("previous") & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28362o("fb_sdk_settings_changed", (Double) null, bundle);
        }
    }

    /* renamed from: c */
    public final void mo28388c(String str, double d, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28358k(str, d, bundle);
        }
    }

    /* renamed from: d */
    public final void mo28389d(String str, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28359l(str, bundle);
        }
    }

    /* renamed from: e */
    public final void mo28390e(String str, String str2) {
        this.f1253a.mo28361n(str, str2);
    }

    /* renamed from: f */
    public final void mo28391f(String str) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28362o(str, (Double) null, (Bundle) null);
        }
    }

    /* renamed from: g */
    public final void mo28392g(String str, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28362o(str, (Double) null, bundle);
        }
    }

    /* renamed from: h */
    public final void mo28393h(String str, Double d, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28362o(str, d, bundle);
        }
    }

    /* renamed from: i */
    public final void mo28394i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28363p(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: j */
    public final void mo28395j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            this.f1253a.mo28365r(bigDecimal, currency, bundle);
        }
    }

    public C2867m(Context context) {
        this(new C2852h(context, (String) null, (C4509a) null));
    }

    public C2867m(Context context, String str) {
        this(new C2852h(context, str, (C4509a) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2867m(String str, String str2, C4509a aVar) {
        this(new C2852h(str, str2, aVar));
        C12775o.m28639i(str, "activityName");
    }
}
