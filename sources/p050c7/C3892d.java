package p050c7;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p025a7.C2217f;
import p064d7.C7278a;
import p064d7.C7281d;
import p064d7.C7282e;
import p064d7.C7283f;
import p076e7.C7480a;
import p076e7.C7481b;
import p222s6.C9511f;
import p255v6.C10007n0;
import p255v6.C10015r;
import p255v6.C10019s;
import p255v6.C10020t;
import p255v6.C10026w;
import p255v6.C9972g;
import p276x5.C10404f;
import p276x5.C10406g;
import p276x5.C10410i;
import p299z6.C10826b;

/* renamed from: c7.d */
/* compiled from: SettingsController */
public class C3892d implements C3894e {

    /* renamed from: a */
    private final Context f2980a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7283f f2981b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3895f f2982c;

    /* renamed from: d */
    private final C10015r f2983d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3889a f2984e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7481b f2985f;

    /* renamed from: g */
    private final C10019s f2986g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference<C7281d> f2987h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<C10406g<C7278a>> f2988i = new AtomicReference<>(new C10406g());

    /* renamed from: c7.d$a */
    /* compiled from: SettingsController */
    class C3893a implements C10404f<Void, Void> {
        C3893a() {
        }

        @NonNull
        /* renamed from: b */
        public Task<Void> mo29941a(@Nullable Void voidR) {
            JSONObject a = C3892d.this.f2985f.mo41188a(C3892d.this.f2981b, true);
            if (a != null) {
                C7282e b = C3892d.this.f2982c.mo29943b(a);
                C3892d.this.f2984e.mo29934c(b.mo40845d(), a);
                C3892d.this.m4399q(a, "Loaded settings: ");
                C3892d dVar = C3892d.this;
                boolean unused = dVar.m4400r(dVar.f2981b.f10034f);
                C3892d.this.f2987h.set(b);
                ((C10406g) C3892d.this.f2988i.get()).mo45100e(b.mo40844c());
                C10406g gVar = new C10406g();
                gVar.mo45100e(b.mo40844c());
                C3892d.this.f2988i.set(gVar);
            }
            return C10410i.m21831e(null);
        }
    }

    C3892d(Context context, C7283f fVar, C10015r rVar, C3895f fVar2, C3889a aVar, C7481b bVar, C10019s sVar) {
        AtomicReference<C7281d> atomicReference = new AtomicReference<>();
        this.f2987h = atomicReference;
        this.f2980a = context;
        this.f2981b = fVar;
        this.f2983d = rVar;
        this.f2982c = fVar2;
        this.f2984e = aVar;
        this.f2985f = bVar;
        this.f2986g = sVar;
        atomicReference.set(C3890b.m4385e(rVar));
    }

    /* renamed from: l */
    public static C3892d m4396l(Context context, String str, C10026w wVar, C10826b bVar, String str2, String str3, C2217f fVar, C10019s sVar) {
        String g = wVar.mo44606g();
        C10007n0 n0Var = new C10007n0();
        C3895f fVar2 = new C3895f(n0Var);
        C3889a aVar = new C3889a(fVar);
        C7480a aVar2 = new C7480a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), bVar);
        String h = wVar.mo44607h();
        String i = wVar.mo44608i();
        String j = wVar.mo44609j();
        String h2 = C9972g.m20818h(C9972g.m20824n(context), str, str3, str2);
        return new C3892d(context, new C7283f(str, h, i, j, wVar, h2, str3, str2, C10020t.m21016a(g).mo44601b()), n0Var, fVar2, aVar, aVar2, sVar);
    }

    /* renamed from: m */
    private C7282e m4397m(C3891c cVar) {
        C7282e eVar = null;
        try {
            if (C3891c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                return null;
            }
            JSONObject b = this.f2984e.mo29933b();
            if (b != null) {
                C7282e b2 = this.f2982c.mo29943b(b);
                if (b2 != null) {
                    m4399q(b, "Loaded cached settings: ");
                    long a = this.f2983d.mo44589a();
                    if (!C3891c.IGNORE_CACHE_EXPIRATION.equals(cVar)) {
                        if (b2.mo40846e(a)) {
                            C9511f.m19696f().mo43971i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C9511f.m19696f().mo43971i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        eVar = b2;
                        C9511f.m19696f().mo43968e("Failed to get cached settings", e);
                        return eVar;
                    }
                } else {
                    C9511f.m19696f().mo43968e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                C9511f.m19696f().mo43965b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C9511f.m19696f().mo43968e("Failed to get cached settings", e);
            return eVar;
        }
    }

    /* renamed from: n */
    private String m4398n() {
        return C9972g.m20828r(this.f2980a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m4399q(JSONObject jSONObject, String str) {
        C9511f f = C9511f.m19696f();
        f.mo43965b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m4400r(String str) {
        SharedPreferences.Editor edit = C9972g.m20828r(this.f2980a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    /* renamed from: a */
    public Task<C7278a> mo29936a() {
        return this.f2988i.get().mo45096a();
    }

    /* renamed from: b */
    public C7281d mo29937b() {
        return this.f2987h.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo29938k() {
        return !m4398n().equals(this.f2981b.f10034f);
    }

    /* renamed from: o */
    public Task<Void> mo29939o(C3891c cVar, Executor executor) {
        C7282e m;
        if (mo29938k() || (m = m4397m(cVar)) == null) {
            C7282e m2 = m4397m(C3891c.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f2987h.set(m2);
                this.f2988i.get().mo45100e(m2.mo40844c());
            }
            return this.f2986g.mo44600h(executor).mo35466q(executor, new C3893a());
        }
        this.f2987h.set(m);
        this.f2988i.get().mo45100e(m.mo40844c());
        return C10410i.m21831e(null);
    }

    /* renamed from: p */
    public Task<Void> mo29940p(Executor executor) {
        return mo29939o(C3891c.USE_CACHE, executor);
    }
}
