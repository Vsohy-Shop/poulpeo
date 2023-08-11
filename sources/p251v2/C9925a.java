package p251v2;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C12775o;
import p218s2.C9447a;
import p218s2.C9449b;

/* renamed from: v2.a */
/* compiled from: CrashShieldHandler.kt */
public final class C9925a {

    /* renamed from: a */
    private static final Set<Object> f14925a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private static boolean f14926b;

    /* renamed from: c */
    public static final C9925a f14927c = new C9925a();

    /* renamed from: v2.a$a */
    /* compiled from: CrashShieldHandler.kt */
    public static final class C9926a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Throwable f14928b;

        C9926a(Throwable th) {
            this.f14928b = th;
        }

        public void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    throw new RuntimeException(this.f14928b);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C9925a() {
    }

    /* renamed from: a */
    public static final void m20731a() {
        f14926b = true;
    }

    /* renamed from: b */
    public static final void m20732b(Throwable th, Object obj) {
        C12775o.m28639i(obj, "o");
        if (f14926b) {
            f14925a.add(obj);
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                C9447a.m19556b(th);
                C9449b.C9450a.m19567b(th, C9449b.C9452c.CrashShield).mo43896g();
            }
            m20735e(th);
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    public static final boolean m20733c() {
        return false;
    }

    /* renamed from: d */
    public static final boolean m20734d(Object obj) {
        C12775o.m28639i(obj, "o");
        return f14925a.contains(obj);
    }

    @VisibleForTesting
    /* renamed from: e */
    public static final void m20735e(Throwable th) {
        if (m20733c()) {
            new Handler(Looper.getMainLooper()).post(new C9926a(th));
        }
    }
}
