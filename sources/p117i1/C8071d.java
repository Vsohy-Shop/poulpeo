package p117i1;

import java.io.File;
import p117i1.C8064a;

/* renamed from: i1.d */
/* compiled from: DiskLruCacheFactory */
public class C8071d implements C8064a.C8065a {

    /* renamed from: a */
    private final long f11326a;

    /* renamed from: b */
    private final C8072a f11327b;

    /* renamed from: i1.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C8072a {
        /* renamed from: a */
        File mo41900a();
    }

    public C8071d(C8072a aVar, long j) {
        this.f11326a = j;
        this.f11327b = aVar;
    }

    public C8064a build() {
        File a = this.f11327b.mo41900a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C8073e.m15859c(a, this.f11326a);
        }
        return null;
    }
}
