package p243u5;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p171n5.C8922b;
import p171n5.C8923c;
import p171n5.C8928h;
import p231t4.C9713p;
import p286y4.C10671e;
import p286y4.C10674h;
import p286y4.C10682p;
import p286y4.C10684r;

/* renamed from: u5.a */
/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
public class C9886a {

    /* renamed from: r */
    private static final long f14774r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    private static volatile ScheduledExecutorService f14775s = null;

    /* renamed from: t */
    private static final Object f14776t = new Object();

    /* renamed from: u */
    private static volatile C9890e f14777u = new C9888c();

    /* renamed from: a */
    private final Object f14778a = new Object();
    @GuardedBy("acquireReleaseLock")

    /* renamed from: b */
    private final PowerManager.WakeLock f14779b;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: c */
    private int f14780c = 0;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: d */
    private Future<?> f14781d;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: e */
    private long f14782e;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: f */
    private final Set<C9891f> f14783f = new HashSet();
    @GuardedBy("acquireReleaseLock")

    /* renamed from: g */
    private boolean f14784g = true;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: h */
    private int f14785h;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: i */
    C8922b f14786i;

    /* renamed from: j */
    private C10671e f14787j = C10674h.m22680c();

    /* renamed from: k */
    private WorkSource f14788k;

    /* renamed from: l */
    private final String f14789l;

    /* renamed from: m */
    private final String f14790m;

    /* renamed from: n */
    private final Context f14791n;
    @GuardedBy("acquireReleaseLock")

    /* renamed from: o */
    private final Map<String, C9889d> f14792o = new HashMap();

    /* renamed from: p */
    private AtomicInteger f14793p = new AtomicInteger(0);

    /* renamed from: q */
    private final ScheduledExecutorService f14794q;

    public C9886a(@NonNull Context context, int i, @NonNull String str) {
        String str2;
        String packageName = context.getPackageName();
        C9713p.m20276k(context, "WakeLock: context must not be null");
        C9713p.m20272g(str, "WakeLock: wakeLockName must not be empty");
        this.f14791n = context.getApplicationContext();
        this.f14790m = str;
        this.f14786i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f14789l = str2;
        } else {
            this.f14789l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f14779b = newWakeLock;
            if (C10684r.m22714c(context)) {
                WorkSource b = C10684r.m22713b(context, C10682p.m22709a(packageName) ? context.getPackageName() : packageName);
                this.f14788k = b;
                if (b != null) {
                    m20553i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f14775s;
            if (scheduledExecutorService == null) {
                synchronized (f14776t) {
                    scheduledExecutorService = f14775s;
                    if (scheduledExecutorService == null) {
                        C8928h.m18062a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f14775s = scheduledExecutorService;
                    }
                }
            }
            this.f14794q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m20549e(@NonNull C9886a aVar) {
        synchronized (aVar.f14778a) {
            if (aVar.mo44410b()) {
                Log.e("WakeLock", String.valueOf(aVar.f14789l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.m20551g();
                if (aVar.mo44410b()) {
                    aVar.f14780c = 1;
                    aVar.m20552h(0);
                }
            }
        }
    }

    @GuardedBy("acquireReleaseLock")
    /* renamed from: f */
    private final String m20550f(String str) {
        if (this.f14784g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    @GuardedBy("acquireReleaseLock")
    /* renamed from: g */
    private final void m20551g() {
        if (!this.f14783f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f14783f);
            this.f14783f.clear();
            if (arrayList.size() > 0) {
                C9891f fVar = (C9891f) arrayList.get(0);
                throw null;
            }
        }
    }

    /* renamed from: h */
    private final void m20552h(int i) {
        synchronized (this.f14778a) {
            if (mo44410b()) {
                if (this.f14784g) {
                    int i2 = this.f14780c - 1;
                    this.f14780c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f14780c = 0;
                }
                m20551g();
                for (C9889d dVar : this.f14792o.values()) {
                    dVar.f14796a = 0;
                }
                this.f14792o.clear();
                Future<?> future = this.f14781d;
                if (future != null) {
                    future.cancel(false);
                    this.f14781d = null;
                    this.f14782e = 0;
                }
                this.f14785h = 0;
                if (this.f14779b.isHeld()) {
                    try {
                        this.f14779b.release();
                        if (this.f14786i != null) {
                            this.f14786i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f14789l).concat(" failed to release!"), e);
                            if (this.f14786i != null) {
                                this.f14786i = null;
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        if (this.f14786i != null) {
                            this.f14786i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f14789l).concat(" should be held!"));
                }
            }
        }
    }

    /* renamed from: i */
    private static void m20553i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    /* renamed from: a */
    public void mo44409a(long j) {
        this.f14793p.incrementAndGet();
        long j2 = f14774r;
        long j3 = LocationRequestCompat.PASSIVE_INTERVAL;
        long max = Math.max(Math.min(LocationRequestCompat.PASSIVE_INTERVAL, j2), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f14778a) {
            if (!mo44410b()) {
                this.f14786i = C8922b.m18061a(false, (C8923c) null);
                this.f14779b.acquire();
                this.f14787j.mo33548b();
            }
            this.f14780c++;
            this.f14785h++;
            m20550f((String) null);
            C9889d dVar = this.f14792o.get((Object) null);
            if (dVar == null) {
                dVar = new C9889d((C9888c) null);
                this.f14792o.put((Object) null, dVar);
            }
            dVar.f14796a++;
            long b = this.f14787j.mo33548b();
            if (LocationRequestCompat.PASSIVE_INTERVAL - b > max) {
                j3 = b + max;
            }
            if (j3 > this.f14782e) {
                this.f14782e = j3;
                Future<?> future = this.f14781d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f14781d = this.f14794q.schedule(new C9887b(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: b */
    public boolean mo44410b() {
        boolean z;
        synchronized (this.f14778a) {
            if (this.f14780c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo44411c() {
        if (this.f14793p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f14789l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f14778a) {
            m20550f((String) null);
            if (this.f14792o.containsKey((Object) null)) {
                C9889d dVar = this.f14792o.get((Object) null);
                if (dVar != null) {
                    int i = dVar.f14796a - 1;
                    dVar.f14796a = i;
                    if (i == 0) {
                        this.f14792o.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f14789l).concat(" counter does not exist"));
            }
            m20552h(0);
        }
    }

    /* renamed from: d */
    public void mo44412d(boolean z) {
        synchronized (this.f14778a) {
            this.f14784g = z;
        }
    }
}
