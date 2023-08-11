package p042bo.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p042bo.app.C3453n0;
import p126j0.C8266c;
import p392mf.C12941b;
import p404of.C13074a;

/* renamed from: bo.app.h */
public final class C3169h {

    /* renamed from: a */
    private final C3453n0 f1732a;

    /* renamed from: bo.app.h$a */
    static final class C3170a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1733b;

        /* renamed from: c */
        final /* synthetic */ String f1734c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3170a(String str, String str2) {
            super(0);
            this.f1733b = str;
            this.f1734c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error while retrieving disk for key " + this.f1733b + " diskKey " + this.f1734c;
        }
    }

    /* renamed from: bo.app.h$b */
    static final class C3171b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1735b;

        /* renamed from: c */
        final /* synthetic */ String f1736c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3171b(String str, String str2) {
            super(0);
            this.f1735b = str;
            this.f1736c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get bitmap from disk cache for key " + this.f1735b + " diskKey " + this.f1736c;
        }
    }

    /* renamed from: bo.app.h$c */
    static final class C3172c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1737b;

        /* renamed from: c */
        final /* synthetic */ String f1738c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3172c(String str, String str2) {
            super(0);
            this.f1737b = str;
            this.f1738c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to load image from disk cache: " + this.f1737b + '/' + this.f1738c;
        }
    }

    /* renamed from: bo.app.h$d */
    static final class C3173d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1739b;

        /* renamed from: c */
        final /* synthetic */ String f1740c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3173d(String str, String str2) {
            super(0);
            this.f1739b = str;
            this.f1740c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error while producing output stream or compressing bitmap for key " + this.f1739b + " diskKey " + this.f1740c;
        }
    }

    public C3169h(File file, int i, int i2, long j) {
        C3453n0 a = C3453n0.m3443a(file, i, i2, j);
        C12775o.m28638h(a, "open(directory, appVersion, valueCount, maxSize)");
        this.f1732a = a;
    }

    /* renamed from: c */
    private final String m2950c(String str) {
        return String.valueOf(str.hashCode());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        p392mf.C12941b.m29245a(r2, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28948a(java.lang.String r10, android.graphics.Bitmap r11) {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = r9.m2950c(r10)
            bo.app.n0 r1 = r9.f1732a     // Catch:{ all -> 0x0034 }
            bo.app.n0$c r1 = r1.mo29376a((java.lang.String) r0)     // Catch:{ all -> 0x0034 }
            r2 = 0
            java.io.OutputStream r2 = r1.mo29384a((int) r2)     // Catch:{ all -> 0x0034 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x002d }
            r4 = 100
            r11.compress(r3, r4, r2)     // Catch:{ all -> 0x002d }
            r2.flush()     // Catch:{ all -> 0x002d }
            ef.v r11 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x002d }
            r11 = 0
            p392mf.C12941b.m29245a(r2, r11)     // Catch:{ all -> 0x0034 }
            r1.mo29386b()     // Catch:{ all -> 0x0034 }
            goto L_0x0046
        L_0x002d:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            p392mf.C12941b.m29245a(r2, r11)     // Catch:{ all -> 0x0034 }
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r11 = move-exception
            r4 = r11
            j0.c r1 = p126j0.C8266c.f11641a
            j0.c$a r3 = p126j0.C8266c.C8267a.f11649e
            bo.app.h$d r6 = new bo.app.h$d
            r6.<init>(r10, r0)
            r5 = 0
            r7 = 4
            r8 = 0
            r2 = r9
            p126j0.C8266c.m16396e(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3169h.mo28948a(java.lang.String, android.graphics.Bitmap):void");
    }

    /* renamed from: b */
    public final Bitmap mo28950b(String str) {
        Throwable th;
        C12775o.m28639i(str, "key");
        String c = m2950c(str);
        try {
            C3453n0.C3458d b = this.f1732a.mo29377b(c);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(b.mo29391a(0));
                C12941b.m29245a(b, (Throwable) null);
                return decodeStream;
            } catch (Throwable th2) {
                Throwable th3 = th2;
                C12941b.m29245a(b, th);
                throw th3;
            }
        } catch (Throwable th4) {
            Throwable th5 = th4;
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11649e, th5, false, new C3171b(str, c), 4, (Object) null);
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3172c(str, c), 7, (Object) null);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo28949a(String str) {
        C12775o.m28639i(str, "key");
        String c = m2950c(str);
        try {
            C3453n0.C3458d b = this.f1732a.mo29377b(c);
            boolean z = b != null;
            C12941b.m29245a(b, (Throwable) null);
            return z;
        } catch (Throwable th) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, new C3170a(str, c), 4, (Object) null);
            return false;
        }
    }
}
