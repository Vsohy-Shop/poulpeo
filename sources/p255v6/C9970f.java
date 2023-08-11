package p255v6;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: v6.f */
/* compiled from: CLSUUID */
class C9970f {

    /* renamed from: a */
    private static final AtomicLong f14952a = new AtomicLong(0);

    /* renamed from: b */
    private static String f14953b;

    C9970f(C10026w wVar) {
        byte[] bArr = new byte[10];
        m20808e(bArr);
        m20807d(bArr);
        m20806c(bArr);
        String z = C9972g.m20836z(wVar.mo44604a());
        String v = C9972g.m20832v(bArr);
        Locale locale = Locale.US;
        f14953b = String.format(locale, "%s%s%s%s", new Object[]{v.substring(0, 12), v.substring(12, 16), v.subSequence(16, 20), z.substring(0, 12)}).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m20804a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m20805b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m20806c(byte[] bArr) {
        byte[] b = m20805b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    private void m20807d(byte[] bArr) {
        byte[] b = m20805b(f14952a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    private void m20808e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m20804a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m20805b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f14953b;
    }
}
