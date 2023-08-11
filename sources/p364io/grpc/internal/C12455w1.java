package p364io.grpc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import p111h6.C8012n;
import p458xd.C13778b0;

/* renamed from: io.grpc.internal.w1 */
/* compiled from: ReadableBuffers */
public final class C12455w1 {

    /* renamed from: a */
    private static final C12451v1 f19875a = new C12458c(new byte[0]);

    /* renamed from: io.grpc.internal.w1$c */
    /* compiled from: ReadableBuffers */
    private static class C12458c extends C12213c {

        /* renamed from: b */
        int f19877b;

        /* renamed from: c */
        final int f19878c;

        /* renamed from: d */
        final byte[] f19879d;

        /* renamed from: e */
        int f19880e;

        C12458c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        /* renamed from: J */
        public void mo50015J(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f19879d, this.f19877b, bArr, i, i2);
            this.f19877b += i2;
        }

        /* renamed from: N */
        public void mo49747N() {
            this.f19880e = this.f19877b;
        }

        /* renamed from: b */
        public C12458c mo50019q(int i) {
            mo49748a(i);
            int i2 = this.f19877b;
            this.f19877b = i2 + i;
            return new C12458c(this.f19879d, i2, i);
        }

        /* renamed from: e */
        public int mo50016e() {
            return this.f19878c - this.f19877b;
        }

        /* renamed from: e0 */
        public void mo50017e0(OutputStream outputStream, int i) {
            mo49748a(i);
            outputStream.write(this.f19879d, this.f19877b, i);
            this.f19877b += i;
        }

        public boolean markSupported() {
            return true;
        }

        /* renamed from: n0 */
        public void mo50018n0(ByteBuffer byteBuffer) {
            C8012n.m15756o(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            mo49748a(remaining);
            byteBuffer.put(this.f19879d, this.f19877b, remaining);
            this.f19877b += remaining;
        }

        public int readUnsignedByte() {
            mo49748a(1);
            byte[] bArr = this.f19879d;
            int i = this.f19877b;
            this.f19877b = i + 1;
            return bArr[i] & 255;
        }

        public void reset() {
            int i = this.f19880e;
            if (i != -1) {
                this.f19877b = i;
                return;
            }
            throw new InvalidMarkException();
        }

        public void skipBytes(int i) {
            mo49748a(i);
            this.f19877b += i;
        }

        C12458c(byte[] bArr, int i, int i2) {
            this.f19880e = -1;
            boolean z = true;
            C8012n.m15746e(i >= 0, "offset must be >= 0");
            C8012n.m15746e(i2 >= 0, "length must be >= 0");
            int i3 = i2 + i;
            C8012n.m15746e(i3 > bArr.length ? false : z, "offset + length exceeds array boundary");
            this.f19879d = (byte[]) C8012n.m15756o(bArr, "bytes");
            this.f19877b = i;
            this.f19878c = i3;
        }
    }

    /* renamed from: a */
    public static C12451v1 m27497a() {
        return f19875a;
    }

    /* renamed from: b */
    public static C12451v1 m27498b(C12451v1 v1Var) {
        return new C12456a(v1Var);
    }

    /* renamed from: c */
    public static InputStream m27499c(C12451v1 v1Var, boolean z) {
        if (!z) {
            v1Var = m27498b(v1Var);
        }
        return new C12457b(v1Var);
    }

    /* renamed from: d */
    public static byte[] m27500d(C12451v1 v1Var) {
        C8012n.m15756o(v1Var, "buffer");
        int e = v1Var.mo50016e();
        byte[] bArr = new byte[e];
        v1Var.mo50015J(bArr, 0, e);
        return bArr;
    }

    /* renamed from: e */
    public static String m27501e(C12451v1 v1Var, Charset charset) {
        C8012n.m15756o(charset, "charset");
        return new String(m27500d(v1Var), charset);
    }

    /* renamed from: f */
    public static C12451v1 m27502f(byte[] bArr, int i, int i2) {
        return new C12458c(bArr, i, i2);
    }

    /* renamed from: io.grpc.internal.w1$b */
    /* compiled from: ReadableBuffers */
    private static final class C12457b extends InputStream implements C13778b0 {

        /* renamed from: b */
        private C12451v1 f19876b;

        public C12457b(C12451v1 v1Var) {
            this.f19876b = (C12451v1) C8012n.m15756o(v1Var, "buffer");
        }

        public int available() {
            return this.f19876b.mo50016e();
        }

        public void close() {
            this.f19876b.close();
        }

        public void mark(int i) {
            this.f19876b.mo49747N();
        }

        public boolean markSupported() {
            return this.f19876b.markSupported();
        }

        public int read() {
            if (this.f19876b.mo50016e() == 0) {
                return -1;
            }
            return this.f19876b.readUnsignedByte();
        }

        public void reset() {
            this.f19876b.reset();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f19876b.mo50016e(), j);
            this.f19876b.skipBytes(min);
            return (long) min;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (this.f19876b.mo50016e() == 0) {
                return -1;
            }
            int min = Math.min(this.f19876b.mo50016e(), i2);
            this.f19876b.mo50015J(bArr, i, min);
            return min;
        }
    }

    /* renamed from: io.grpc.internal.w1$a */
    /* compiled from: ReadableBuffers */
    class C12456a extends C12377o0 {
        C12456a(C12451v1 v1Var) {
            super(v1Var);
        }

        public void close() {
        }
    }
}
