package p266w6;

import androidx.annotation.Nullable;
import java.io.File;
import p025a7.C2217f;

/* renamed from: w6.c */
/* compiled from: LogFileManager */
public class C10116c {

    /* renamed from: c */
    private static final C10118b f15284c = new C10118b();

    /* renamed from: a */
    private final C2217f f15285a;

    /* renamed from: b */
    private C10114a f15286b;

    public C10116c(C2217f fVar) {
        this.f15285a = fVar;
        this.f15286b = f15284c;
    }

    /* renamed from: d */
    private File m21255d(String str) {
        return this.f15285a.mo23562n(str, "userlog");
    }

    /* renamed from: a */
    public void mo44701a() {
        this.f15286b.mo44697d();
    }

    /* renamed from: b */
    public byte[] mo44702b() {
        return this.f15286b.mo44696c();
    }

    @Nullable
    /* renamed from: c */
    public String mo44703c() {
        return this.f15286b.mo44695b();
    }

    /* renamed from: e */
    public final void mo44704e(String str) {
        this.f15286b.mo44694a();
        this.f15286b = f15284c;
        if (str != null) {
            mo44705f(m21255d(str), 65536);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo44705f(File file, int i) {
        this.f15286b = new C10125f(file, i);
    }

    /* renamed from: g */
    public void mo44706g(long j, String str) {
        this.f15286b.mo44698e(j, str);
    }

    public C10116c(C2217f fVar, String str) {
        this(fVar);
        mo44704e(str);
    }

    /* renamed from: w6.c$b */
    /* compiled from: LogFileManager */
    private static final class C10118b implements C10114a {
        private C10118b() {
        }

        /* renamed from: b */
        public String mo44695b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo44696c() {
            return null;
        }

        /* renamed from: a */
        public void mo44694a() {
        }

        /* renamed from: d */
        public void mo44697d() {
        }

        /* renamed from: e */
        public void mo44698e(long j, String str) {
        }
    }
}
