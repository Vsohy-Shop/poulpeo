package p033b2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C4509a;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b2.g */
/* compiled from: AppEventsLogger.kt */
public final class C2849g {

    /* renamed from: b */
    private static final String f1213b = C2849g.class.getCanonicalName();

    /* renamed from: c */
    public static final C2850a f1214c = new C2850a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C2852h f1215a;

    /* renamed from: b2.g$a */
    /* compiled from: AppEventsLogger.kt */
    public static final class C2850a {
        private C2850a() {
        }

        public /* synthetic */ C2850a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo28350a(Application application, String str) {
            C12775o.m28639i(application, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
            C2852h.f1226j.mo28366d(application, str);
        }

        /* renamed from: b */
        public final String mo28351b(Context context) {
            C12775o.m28639i(context, "context");
            return C2852h.f1226j.mo28369g(context);
        }

        /* renamed from: c */
        public final C2851b mo28352c() {
            return C2852h.f1226j.mo28370h();
        }

        /* renamed from: d */
        public final String mo28353d() {
            return C2832b.m2150b();
        }

        /* renamed from: e */
        public final void mo28354e(Context context, String str) {
            C12775o.m28639i(context, "context");
            C2852h.f1226j.mo28373k(context, str);
        }

        /* renamed from: f */
        public final C2849g mo28355f(Context context) {
            C12775o.m28639i(context, "context");
            return new C2849g(context, (String) null, (C4509a) null, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public final void mo28356g() {
            C2852h.f1226j.mo28374o();
        }
    }

    /* renamed from: b2.g$b */
    /* compiled from: AppEventsLogger.kt */
    public enum C2851b {
        AUTO,
        EXPLICIT_ONLY
    }

    public /* synthetic */ C2849g(Context context, String str, C4509a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, aVar);
    }

    /* renamed from: b */
    public static final String m2192b(Context context) {
        return f1214c.mo28351b(context);
    }

    /* renamed from: a */
    public final void mo28348a() {
        this.f1215a.mo28357j();
    }

    /* renamed from: c */
    public final void mo28349c(String str, Bundle bundle) {
        this.f1215a.mo28359l(str, bundle);
    }

    private C2849g(Context context, String str, C4509a aVar) {
        this.f1215a = new C2852h(context, str, aVar);
    }
}
