package p266w6;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: w6.e */
/* compiled from: QueueFile */
class C10120e implements Closeable {

    /* renamed from: h */
    private static final Logger f15289h = Logger.getLogger(C10120e.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final RandomAccessFile f15290b;

    /* renamed from: c */
    int f15291c;

    /* renamed from: d */
    private int f15292d;

    /* renamed from: e */
    private C10122b f15293e;

    /* renamed from: f */
    private C10122b f15294f;

    /* renamed from: g */
    private final byte[] f15295g = new byte[16];

    /* renamed from: w6.e$a */
    /* compiled from: QueueFile */
    class C10121a implements C10124d {

        /* renamed from: a */
        boolean f15296a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f15297b;

        C10121a(StringBuilder sb) {
            this.f15297b = sb;
        }

        /* renamed from: a */
        public void mo44721a(InputStream inputStream, int i) {
            if (this.f15296a) {
                this.f15296a = false;
            } else {
                this.f15297b.append(", ");
            }
            this.f15297b.append(i);
        }
    }

    /* renamed from: w6.e$b */
    /* compiled from: QueueFile */
    static class C10122b {

        /* renamed from: c */
        static final C10122b f15299c = new C10122b(0, 0);

        /* renamed from: a */
        final int f15300a;

        /* renamed from: b */
        final int f15301b;

        C10122b(int i, int i2) {
            this.f15300a = i;
            this.f15301b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f15300a + ", length = " + this.f15301b + "]";
        }
    }

    /* renamed from: w6.e$c */
    /* compiled from: QueueFile */
    private final class C10123c extends InputStream {

        /* renamed from: b */
        private int f15302b;

        /* renamed from: c */
        private int f15303c;

        /* synthetic */ C10123c(C10120e eVar, C10122b bVar, C10121a aVar) {
            this(bVar);
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C10120e.m21279Y(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f15303c;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C10120e.this.m21289u0(this.f15302b, bArr, i, i2);
            this.f15302b = C10120e.this.m21292y0(this.f15302b + i2);
            this.f15303c -= i2;
            return i2;
        }

        private C10123c(C10122b bVar) {
            this.f15302b = C10120e.this.m21292y0(bVar.f15300a + 4);
            this.f15303c = bVar.f15301b;
        }

        public int read() {
            if (this.f15303c == 0) {
                return -1;
            }
            C10120e.this.f15290b.seek((long) this.f15302b);
            int read = C10120e.this.f15290b.read();
            this.f15302b = C10120e.this.m21292y0(this.f15302b + 1);
            this.f15303c--;
            return read;
        }
    }

    /* renamed from: w6.e$d */
    /* compiled from: QueueFile */
    public interface C10124d {
        /* renamed from: a */
        void mo44721a(InputStream inputStream, int i);
    }

    public C10120e(File file) {
        if (!file.exists()) {
            m21278V(file);
        }
        this.f15290b = m21281a0(file);
        m21285j0();
    }

    /* renamed from: A0 */
    private static void m21275A0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: B0 */
    private static void m21276B0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int A0 : iArr) {
            m21275A0(bArr, i, A0);
            i += 4;
        }
    }

    /* renamed from: Q */
    private void m21277Q(int i) {
        int i2 = i + 4;
        int p0 = m21288p0();
        if (p0 < i2) {
            int i3 = this.f15291c;
            do {
                p0 += i3;
                i3 <<= 1;
            } while (p0 < i2);
            m21291w0(i3);
            C10122b bVar = this.f15294f;
            int y0 = m21292y0(bVar.f15300a + 4 + bVar.f15301b);
            if (y0 < this.f15293e.f15300a) {
                FileChannel channel = this.f15290b.getChannel();
                channel.position((long) this.f15291c);
                long j = (long) (y0 - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f15294f.f15300a;
            int i5 = this.f15293e.f15300a;
            if (i4 < i5) {
                int i6 = (this.f15291c + i4) - 16;
                m21293z0(i3, this.f15292d, i5, i6);
                this.f15294f = new C10122b(i6, this.f15294f.f15301b);
            } else {
                m21293z0(i3, this.f15292d, i5, i4);
            }
            this.f15291c = i3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: V */
    private static void m21278V(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile a0 = m21281a0(file2);
        try {
            a0.setLength(4096);
            a0.seek(0);
            byte[] bArr = new byte[16];
            m21276B0(bArr, 4096, 0, 0, 0);
            a0.write(bArr);
            a0.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            a0.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public static <T> T m21279Y(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a0 */
    private static RandomAccessFile m21281a0(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: c0 */
    private C10122b m21284c0(int i) {
        if (i == 0) {
            return C10122b.f15299c;
        }
        this.f15290b.seek((long) i);
        return new C10122b(i, this.f15290b.readInt());
    }

    /* renamed from: j0 */
    private void m21285j0() {
        this.f15290b.seek(0);
        this.f15290b.readFully(this.f15295g);
        int k0 = m21287k0(this.f15295g, 0);
        this.f15291c = k0;
        if (((long) k0) <= this.f15290b.length()) {
            this.f15292d = m21287k0(this.f15295g, 4);
            int k02 = m21287k0(this.f15295g, 8);
            int k03 = m21287k0(this.f15295g, 12);
            this.f15293e = m21284c0(k02);
            this.f15294f = m21284c0(k03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f15291c + ", Actual length: " + this.f15290b.length());
    }

    /* renamed from: k0 */
    private static int m21287k0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: p0 */
    private int m21288p0() {
        return this.f15291c - mo44720x0();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m21289u0(int i, byte[] bArr, int i2, int i3) {
        int y0 = m21292y0(i);
        int i4 = y0 + i3;
        int i5 = this.f15291c;
        if (i4 <= i5) {
            this.f15290b.seek((long) y0);
            this.f15290b.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - y0;
        this.f15290b.seek((long) y0);
        this.f15290b.readFully(bArr, i2, i6);
        this.f15290b.seek(16);
        this.f15290b.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: v0 */
    private void m21290v0(int i, byte[] bArr, int i2, int i3) {
        int y0 = m21292y0(i);
        int i4 = y0 + i3;
        int i5 = this.f15291c;
        if (i4 <= i5) {
            this.f15290b.seek((long) y0);
            this.f15290b.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - y0;
        this.f15290b.seek((long) y0);
        this.f15290b.write(bArr, i2, i6);
        this.f15290b.seek(16);
        this.f15290b.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: w0 */
    private void m21291w0(int i) {
        this.f15290b.setLength((long) i);
        this.f15290b.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public int m21292y0(int i) {
        int i2 = this.f15291c;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    /* renamed from: z0 */
    private void m21293z0(int i, int i2, int i3, int i4) {
        m21276B0(this.f15295g, i, i2, i3, i4);
        this.f15290b.seek(0);
        this.f15290b.write(this.f15295g);
    }

    /* renamed from: A */
    public void mo44712A(byte[] bArr) {
        mo44713G(bArr, 0, bArr.length);
    }

    /* renamed from: G */
    public synchronized void mo44713G(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        m21279Y(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m21277Q(i2);
        boolean X = mo44716X();
        if (X) {
            i3 = 16;
        } else {
            C10122b bVar = this.f15294f;
            i3 = m21292y0(bVar.f15300a + 4 + bVar.f15301b);
        }
        C10122b bVar2 = new C10122b(i3, i2);
        m21275A0(this.f15295g, 0, i2);
        m21290v0(bVar2.f15300a, this.f15295g, 0, 4);
        m21290v0(bVar2.f15300a + 4, bArr, i, i2);
        if (X) {
            i4 = bVar2.f15300a;
        } else {
            i4 = this.f15293e.f15300a;
        }
        m21293z0(this.f15291c, this.f15292d + 1, i4, bVar2.f15300a);
        this.f15294f = bVar2;
        this.f15292d++;
        if (X) {
            this.f15293e = bVar2;
        }
    }

    /* renamed from: O */
    public synchronized void mo44714O() {
        m21293z0(4096, 0, 0, 0);
        this.f15292d = 0;
        C10122b bVar = C10122b.f15299c;
        this.f15293e = bVar;
        this.f15294f = bVar;
        if (this.f15291c > 4096) {
            m21291w0(4096);
        }
        this.f15291c = 4096;
    }

    /* renamed from: R */
    public synchronized void mo44715R(C10124d dVar) {
        int i = this.f15293e.f15300a;
        for (int i2 = 0; i2 < this.f15292d; i2++) {
            C10122b c0 = m21284c0(i);
            dVar.mo44721a(new C10123c(this, c0, (C10121a) null), c0.f15301b);
            i = m21292y0(c0.f15300a + 4 + c0.f15301b);
        }
    }

    /* renamed from: X */
    public synchronized boolean mo44716X() {
        boolean z;
        if (this.f15292d == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized void close() {
        this.f15290b.close();
    }

    /* renamed from: t0 */
    public synchronized void mo44718t0() {
        if (mo44716X()) {
            throw new NoSuchElementException();
        } else if (this.f15292d == 1) {
            mo44714O();
        } else {
            C10122b bVar = this.f15293e;
            int y0 = m21292y0(bVar.f15300a + 4 + bVar.f15301b);
            m21289u0(y0, this.f15295g, 0, 4);
            int k0 = m21287k0(this.f15295g, 0);
            m21293z0(this.f15291c, this.f15292d - 1, y0, this.f15294f.f15300a);
            this.f15292d--;
            this.f15293e = new C10122b(y0, k0);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f15291c);
        sb.append(", size=");
        sb.append(this.f15292d);
        sb.append(", first=");
        sb.append(this.f15293e);
        sb.append(", last=");
        sb.append(this.f15294f);
        sb.append(", element lengths=[");
        try {
            mo44715R(new C10121a(sb));
        } catch (IOException e) {
            f15289h.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: x0 */
    public int mo44720x0() {
        if (this.f15292d == 0) {
            return 16;
        }
        C10122b bVar = this.f15294f;
        int i = bVar.f15300a;
        int i2 = this.f15293e.f15300a;
        if (i >= i2) {
            return (i - i2) + 4 + bVar.f15301b + 16;
        }
        return (((i + 4) + bVar.f15301b) + this.f15291c) - i2;
    }
}
