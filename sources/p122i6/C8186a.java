package p122i6;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p111h6.C8012n;
import p132j6.C8420a;

/* renamed from: i6.a */
/* compiled from: ByteStreams */
public final class C8186a {

    /* renamed from: a */
    private static final OutputStream f11508a = new C8187a();

    /* renamed from: i6.a$a */
    /* compiled from: ByteStreams */
    class C8187a extends OutputStream {
        C8187a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i) {
        }

        public void write(byte[] bArr) {
            C8012n.m15755n(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            C8012n.m15755n(bArr);
        }
    }

    /* renamed from: a */
    private static byte[] m16198a(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    /* renamed from: b */
    public static long m16199b(InputStream inputStream, OutputStream outputStream) {
        C8012n.m15755n(inputStream);
        C8012n.m15755n(outputStream);
        byte[] c = m16200c();
        long j = 0;
        while (true) {
            int read = inputStream.read(c);
            if (read == -1) {
                return j;
            }
            outputStream.write(c, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: c */
    static byte[] m16200c() {
        return new byte[8192];
    }

    /* renamed from: d */
    public static byte[] m16201d(InputStream inputStream) {
        C8012n.m15755n(inputStream);
        return m16202e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m16202e(InputStream inputStream, Queue<byte[]> queue, int i) {
        int i2 = 8192;
        while (i < 2147483639) {
            int min = Math.min(i2, 2147483639 - i);
            byte[] bArr = new byte[min];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return m16198a(queue, i);
                }
                i3 += read;
                i += read;
            }
            i2 = C8420a.m16842e(i2, 2);
        }
        if (inputStream.read() == -1) {
            return m16198a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
