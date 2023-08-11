package p045c2;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.C12775o;
import p198q2.C9114a;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: c2.a */
/* compiled from: MetadataIndexer.kt */
public final class C3871a {

    /* renamed from: a */
    private static final String f2944a = C3871a.class.getCanonicalName();

    /* renamed from: b */
    private static boolean f2945b;

    /* renamed from: c */
    public static final C3871a f2946c = new C3871a();

    /* renamed from: c2.a$a */
    /* compiled from: MetadataIndexer.kt */
    static final class C3872a implements Runnable {

        /* renamed from: b */
        public static final C3872a f2947b = new C3872a();

        C3872a() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        if (!C9114a.f13292h.mo43380h(FacebookSdk.getApplicationContext())) {
                            C3871a aVar = C3871a.f2946c;
                            C3871a.m4331b(aVar);
                            C3871a.m4330a(aVar, true);
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C3871a() {
    }

    /* renamed from: a */
    public static final /* synthetic */ void m4330a(C3871a aVar, boolean z) {
        Class<C3871a> cls = C3871a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f2945b = z;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m4331b(C3871a aVar) {
        Class<C3871a> cls = C3871a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                aVar.m4334e();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static final void m4332c() {
        Class<C3871a> cls = C3871a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                FacebookSdk.getExecutor().execute(C3872a.f2947b);
            } catch (Exception e) {
                C9138d0.m18624Z(f2944a, e);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    @UiThread
    /* renamed from: d */
    public static final void m4333d(Activity activity) {
        Class<C3871a> cls = C3871a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(activity, "activity");
                try {
                    if (!f2945b) {
                        return;
                    }
                    if (!C3874c.f2950e.mo29919c().isEmpty()) {
                        C3876d.f2955g.mo29922e(activity);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: e */
    private final void m4334e() {
        String f;
        if (!C9925a.m20734d(this)) {
            try {
                C9177p o = C9181q.m18810o(FacebookSdk.getApplicationId(), false);
                if (o != null && (f = o.mo43458f()) != null) {
                    C3874c.f2950e.mo29920d(f);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
