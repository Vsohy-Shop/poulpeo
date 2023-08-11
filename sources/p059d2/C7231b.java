package p059d2;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONObject;
import p059d2.C7249f;
import p118i2.C8093b;
import p198q2.C9114a;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: d2.b */
/* compiled from: CodelessManager.kt */
public final class C7231b {

    /* renamed from: a */
    private static final C7249f f9935a = new C7249f();

    /* renamed from: b */
    private static SensorManager f9936b;

    /* renamed from: c */
    private static C7242e f9937c;

    /* renamed from: d */
    private static String f9938d;

    /* renamed from: e */
    private static final AtomicBoolean f9939e = new AtomicBoolean(true);

    /* renamed from: f */
    private static final AtomicBoolean f9940f = new AtomicBoolean(false);

    /* renamed from: g */
    private static volatile boolean f9941g;

    /* renamed from: h */
    public static final C7231b f9942h = new C7231b();

    /* renamed from: d2.b$a */
    /* compiled from: CodelessManager.kt */
    static final class C7232a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f9943b;

        C7232a(String str) {
            this.f9943b = str;
        }

        public final void run() {
            String str;
            String str2 = "0";
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C4555l.C4558c cVar = C4555l.f4241t;
                        C12770k0 k0Var = C12770k0.f20423a;
                        boolean z = true;
                        String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{this.f9943b}, 1));
                        C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                        C4555l w = cVar.mo31649w((C4509a) null, format, (JSONObject) null, (C4555l.C4557b) null);
                        Bundle s = w.mo31627s();
                        if (s == null) {
                            s = new Bundle();
                        }
                        C9114a e = C9114a.f13292h.mo43379e(FacebookSdk.getApplicationContext());
                        JSONArray jSONArray = new JSONArray();
                        String str3 = Build.MODEL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONArray.put(str3);
                        if (e != null) {
                            str = e.mo43375h();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            jSONArray.put(e.mo43375h());
                        } else {
                            jSONArray.put("");
                        }
                        jSONArray.put(str2);
                        if (C8093b.m15924f()) {
                            str2 = "1";
                        }
                        jSONArray.put(str2);
                        Locale v = C9138d0.m18667v();
                        jSONArray.put(v.getLanguage() + "_" + v.getCountry());
                        String jSONArray2 = jSONArray.toString();
                        C12775o.m28638h(jSONArray2, "extInfoArray.toString()");
                        s.putString("device_session_id", C7231b.m14015h());
                        s.putString("extinfo", jSONArray2);
                        w.mo31617G(s);
                        JSONObject c = w.mo31620i().mo31710c();
                        C7231b bVar = C7231b.f9942h;
                        AtomicBoolean b = C7231b.m14009b(bVar);
                        if (c == null || !c.optBoolean("is_app_indexing_enabled", false)) {
                            z = false;
                        }
                        b.set(z);
                        if (!C7231b.m14009b(bVar).get()) {
                            C7231b.m14011d(bVar, (String) null);
                        } else {
                            C7242e a = C7231b.m14008a(bVar);
                            if (a != null) {
                                a.mo40806j();
                            }
                        }
                        C7231b.m14010c(bVar, false);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: d2.b$b */
    /* compiled from: CodelessManager.kt */
    static final class C7233b implements C7249f.C7251b {

        /* renamed from: a */
        final /* synthetic */ C9177p f9944a;

        /* renamed from: b */
        final /* synthetic */ String f9945b;

        C7233b(C9177p pVar, String str) {
            this.f9944a = pVar;
            this.f9945b = str;
        }

        /* renamed from: a */
        public final void mo40790a() {
            boolean z;
            C9177p pVar = this.f9944a;
            boolean z2 = true;
            if (pVar == null || !pVar.mo43454b()) {
                z = false;
            } else {
                z = true;
            }
            if (!FacebookSdk.getCodelessSetupEnabled()) {
                z2 = false;
            }
            if (z && z2) {
                C7231b.m14012e(this.f9945b);
            }
        }
    }

    private C7231b() {
    }

    /* renamed from: a */
    public static final /* synthetic */ C7242e m14008a(C7231b bVar) {
        Class<C7231b> cls = C7231b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f9937c;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ AtomicBoolean m14009b(C7231b bVar) {
        Class<C7231b> cls = C7231b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f9940f;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m14010c(C7231b bVar, boolean z) {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f9941g = z;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m14011d(C7231b bVar, String str) {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f9938d = str;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: e */
    public static final void m14012e(String str) {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                if (!f9941g) {
                    f9941g = true;
                    FacebookSdk.getExecutor().execute(new C7232a(str));
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: f */
    public static final void m14013f() {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f9939e.set(false);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: g */
    public static final void m14014g() {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f9939e.set(true);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: h */
    public static final String m14015h() {
        Class<C7231b> cls = C7231b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            if (f9938d == null) {
                f9938d = UUID.randomUUID().toString();
            }
            String str = f9938d;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    public static final boolean m14016i() {
        Class<C7231b> cls = C7231b.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            return f9940f.get();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: j */
    public static final boolean m14017j() {
        C9925a.m20734d(C7231b.class);
        return false;
    }

    /* renamed from: k */
    public static final void m14018k(Activity activity) {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(activity, "activity");
                C7234c.f9948h.mo40794a().mo40792f(activity);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: l */
    public static final void m14019l(Activity activity) {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(activity, "activity");
                if (f9939e.get()) {
                    C7234c.f9948h.mo40794a().mo40793h(activity);
                    C7242e eVar = f9937c;
                    if (eVar != null) {
                        eVar.mo40807l();
                    }
                    SensorManager sensorManager = f9936b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(f9935a);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: m */
    public static final void m14020m(Activity activity) {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(activity, "activity");
                if (f9939e.get()) {
                    C7234c.f9948h.mo40794a().mo40791e(activity);
                    Context applicationContext = activity.getApplicationContext();
                    String applicationId = FacebookSdk.getApplicationId();
                    C9177p j = C9181q.m18806j(applicationId);
                    if ((j != null && j.mo43454b()) || m14017j()) {
                        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                        f9936b = sensorManager;
                        if (sensorManager != null) {
                            if (sensorManager != null) {
                                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                f9937c = new C7242e(activity);
                                C7249f fVar = f9935a;
                                fVar.mo40814a(new C7233b(j, applicationId));
                                SensorManager sensorManager2 = f9936b;
                                if (sensorManager2 != null) {
                                    sensorManager2.registerListener(fVar, defaultSensor, 2);
                                    if (j != null && j.mo43454b()) {
                                        C7242e eVar = f9937c;
                                        if (eVar != null) {
                                            eVar.mo40806j();
                                        } else {
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        } else {
                            return;
                        }
                    }
                    if (m14017j() && !f9940f.get()) {
                        m14012e(applicationId);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: n */
    public static final void m14021n(boolean z) {
        Class<C7231b> cls = C7231b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f9940f.set(z);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }
}
