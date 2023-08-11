package p117i1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p032b1.C2819b;
import p058d1.C7218e;
import p117i1.C8064a;

/* renamed from: i1.e */
/* compiled from: DiskLruCacheWrapper */
public class C8073e implements C8064a {

    /* renamed from: a */
    private final C8083j f11328a;

    /* renamed from: b */
    private final File f11329b;

    /* renamed from: c */
    private final long f11330c;

    /* renamed from: d */
    private final C8068c f11331d = new C8068c();

    /* renamed from: e */
    private C2819b f11332e;

    @Deprecated
    protected C8073e(File file, long j) {
        this.f11329b = file;
        this.f11330c = j;
        this.f11328a = new C8083j();
    }

    /* renamed from: c */
    public static C8064a m15859c(File file, long j) {
        return new C8073e(file, j);
    }

    /* renamed from: d */
    private synchronized C2819b m15860d() {
        if (this.f11332e == null) {
            this.f11332e = C2819b.m2110u0(this.f11329b, 1, 1, this.f11330c);
        }
        return this.f11332e;
    }

    /* renamed from: a */
    public void mo41893a(C7218e eVar, C8064a.C8066b bVar) {
        C2819b.C2822c c0;
        String b = this.f11328a.mo41916b(eVar);
        this.f11331d.mo41896a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + eVar);
            }
            try {
                C2819b d = m15860d();
                if (d.mo28309p0(b) == null) {
                    c0 = d.mo28307c0(b);
                    if (c0 != null) {
                        if (bVar.mo31276a(c0.mo28317f(0))) {
                            c0.mo28316e();
                        }
                        c0.mo28315b();
                        this.f11331d.mo41897b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                c0.mo28315b();
                throw th;
            }
        } finally {
            this.f11331d.mo41897b(b);
        }
    }

    /* renamed from: b */
    public File mo41894b(C7218e eVar) {
        String b = this.f11328a.mo41916b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + eVar);
        }
        try {
            C2819b.C2824e p0 = m15860d().mo28309p0(b);
            if (p0 != null) {
                return p0.mo28321a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
