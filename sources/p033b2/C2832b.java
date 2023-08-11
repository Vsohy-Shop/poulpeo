package p033b2;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.C12775o;
import p251v2.C9925a;

/* renamed from: b2.b */
/* compiled from: AnalyticsUserIDStore.kt */
public final class C2832b {

    /* renamed from: a */
    private static final String f1173a;

    /* renamed from: b */
    private static final ReentrantReadWriteLock f1174b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static String f1175c;

    /* renamed from: d */
    private static volatile boolean f1176d;

    /* renamed from: e */
    public static final C2832b f1177e = new C2832b();

    /* renamed from: b2.b$a */
    /* compiled from: AnalyticsUserIDStore.kt */
    static final class C2833a implements Runnable {

        /* renamed from: b */
        public static final C2833a f1178b = new C2833a();

        C2833a() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2832b.f1177e.m2151c();
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    static {
        String simpleName = C2832b.class.getSimpleName();
        C12775o.m28638h(simpleName, "AnalyticsUserIDStore::class.java.simpleName");
        f1173a = simpleName;
    }

    private C2832b() {
    }

    /* renamed from: b */
    public static final String m2150b() {
        if (!f1176d) {
            Log.w(f1173a, "initStore should have been called before calling setUserID");
            f1177e.m2151c();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f1174b;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f1175c;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            f1174b.readLock().unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m2151c() {
        if (!f1176d) {
            ReentrantReadWriteLock reentrantReadWriteLock = f1174b;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (f1176d) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                f1175c = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                f1176d = true;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                f1174b.writeLock().unlock();
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static final void m2152d() {
        if (!f1176d) {
            C2867m.f1252b.mo28396a().execute(C2833a.f1178b);
        }
    }
}
