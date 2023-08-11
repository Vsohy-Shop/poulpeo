package p125j;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13143j;
import okio.C13158p0;
import p466yf.C13933b1;
import p466yf.C13971h0;

/* renamed from: j.a */
/* compiled from: DiskCache.kt */
public interface C8216a {

    @SourceDebugExtension({"SMAP\nDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCache.kt\ncoil/disk/DiskCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    /* renamed from: j.a$a */
    /* compiled from: DiskCache.kt */
    public static final class C8217a {

        /* renamed from: a */
        private C13158p0 f11541a;

        /* renamed from: b */
        private C13143j f11542b = C13143j.f20927b;

        /* renamed from: c */
        private double f11543c = 0.02d;

        /* renamed from: d */
        private long f11544d = 10485760;

        /* renamed from: e */
        private long f11545e = 262144000;

        /* renamed from: f */
        private long f11546f;

        /* renamed from: g */
        private C13971h0 f11547g = C13933b1.m32211b();

        /* renamed from: a */
        public final C8216a mo42130a() {
            long j;
            C13158p0 p0Var = this.f11541a;
            if (p0Var != null) {
                if (this.f11543c > 0.0d) {
                    try {
                        File file = p0Var.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        j = C13537l.m30888o((long) (this.f11543c * ((double) statFs.getBlockCountLong()) * ((double) statFs.getBlockSizeLong())), this.f11544d, this.f11545e);
                    } catch (Exception unused) {
                        j = this.f11544d;
                    }
                } else {
                    j = this.f11546f;
                }
                return new C8229d(j, p0Var, this.f11542b, this.f11547g);
            }
            throw new IllegalStateException("directory == null".toString());
        }

        /* renamed from: b */
        public final C8217a mo42131b(File file) {
            return mo42132c(C13158p0.C13159a.m29806d(C13158p0.f20947c, file, false, 1, (Object) null));
        }

        /* renamed from: c */
        public final C8217a mo42132c(C13158p0 p0Var) {
            this.f11541a = p0Var;
            return this;
        }
    }

    /* renamed from: j.a$b */
    /* compiled from: DiskCache.kt */
    public interface C8218b {
        /* renamed from: a */
        C8219c mo42133a();

        void abort();

        /* renamed from: g */
        C13158p0 mo42135g();

        C13158p0 getData();
    }

    /* renamed from: j.a$c */
    /* compiled from: DiskCache.kt */
    public interface C8219c extends Closeable {
        /* renamed from: D */
        C8218b mo42137D();

        /* renamed from: g */
        C13158p0 mo42138g();

        C13158p0 getData();
    }

    /* renamed from: a */
    C8218b mo42127a(String str);

    /* renamed from: b */
    C8219c mo42128b(String str);

    C13143j getFileSystem();
}
