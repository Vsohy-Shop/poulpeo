package p364io.grpc.internal;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import p111h6.C8012n;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12343k2;
import p458xd.C13799i;
import p458xd.C13823q;

/* renamed from: io.grpc.internal.l1 */
/* compiled from: MessageDeframer */
public class C12350l1 implements Closeable, C12462y {

    /* renamed from: b */
    private C12352b f19589b;

    /* renamed from: c */
    private int f19590c;

    /* renamed from: d */
    private final C12324i2 f19591d;

    /* renamed from: e */
    private final C12379o2 f19592e;

    /* renamed from: f */
    private C13823q f19593f;

    /* renamed from: g */
    private C12424s0 f19594g;

    /* renamed from: h */
    private byte[] f19595h;

    /* renamed from: i */
    private int f19596i;

    /* renamed from: j */
    private C12355e f19597j = C12355e.HEADER;

    /* renamed from: k */
    private int f19598k = 5;

    /* renamed from: l */
    private boolean f19599l;

    /* renamed from: m */
    private C12433u f19600m;

    /* renamed from: n */
    private C12433u f19601n = new C12433u();

    /* renamed from: o */
    private long f19602o;

    /* renamed from: p */
    private boolean f19603p = false;

    /* renamed from: q */
    private int f19604q = -1;

    /* renamed from: r */
    private int f19605r;

    /* renamed from: s */
    private boolean f19606s = false;

    /* renamed from: t */
    private volatile boolean f19607t = false;

    /* renamed from: io.grpc.internal.l1$a */
    /* compiled from: MessageDeframer */
    static /* synthetic */ class C12351a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19608a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.grpc.internal.l1$e[] r0 = p364io.grpc.internal.C12350l1.C12355e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19608a = r0
                io.grpc.internal.l1$e r1 = p364io.grpc.internal.C12350l1.C12355e.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19608a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.l1$e r1 = p364io.grpc.internal.C12350l1.C12355e.BODY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12350l1.C12351a.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.l1$b */
    /* compiled from: MessageDeframer */
    public interface C12352b {
        /* renamed from: a */
        void mo49779a(C12343k2.C12344a aVar);

        /* renamed from: b */
        void mo49694b(boolean z);

        /* renamed from: c */
        void mo49832c(int i);

        /* renamed from: d */
        void mo49833d(Throwable th);
    }

    /* renamed from: io.grpc.internal.l1$c */
    /* compiled from: MessageDeframer */
    private static class C12353c implements C12343k2.C12344a {

        /* renamed from: b */
        private InputStream f19609b;

        /* synthetic */ C12353c(InputStream inputStream, C12351a aVar) {
            this(inputStream);
        }

        public InputStream next() {
            InputStream inputStream = this.f19609b;
            this.f19609b = null;
            return inputStream;
        }

        private C12353c(InputStream inputStream) {
            this.f19609b = inputStream;
        }
    }

    /* renamed from: io.grpc.internal.l1$e */
    /* compiled from: MessageDeframer */
    private enum C12355e {
        HEADER,
        BODY
    }

    public C12350l1(C12352b bVar, C13823q qVar, int i, C12324i2 i2Var, C12379o2 o2Var) {
        this.f19589b = (C12352b) C8012n.m15756o(bVar, "sink");
        this.f19593f = (C13823q) C8012n.m15756o(qVar, "decompressor");
        this.f19590c = i;
        this.f19591d = (C12324i2) C8012n.m15756o(i2Var, "statsTraceCtx");
        this.f19592e = (C12379o2) C8012n.m15756o(o2Var, "transportTracer");
    }

    /* renamed from: O */
    private InputStream m27140O() {
        C13823q qVar = this.f19593f;
        if (qVar != C13799i.C13801b.f22244a) {
            try {
                return new C12354d(qVar.mo53453b(C12455w1.m27499c(this.f19600m, true)), this.f19590c, this.f19591d);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw C12594t.f20197t.mo50310r("Can't decode compressed gRPC message as compression not configured").mo50300d();
        }
    }

    /* renamed from: Q */
    private InputStream m27141Q() {
        this.f19591d.mo49942f((long) this.f19600m.mo50016e());
        return C12455w1.m27499c(this.f19600m, true);
    }

    /* renamed from: R */
    private boolean m27142R() {
        if (isClosed() || this.f19606s) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m27143V() {
        C12424s0 s0Var = this.f19594g;
        if (s0Var != null) {
            return s0Var.mo50071k0();
        }
        if (this.f19601n.mo50016e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private void m27144X() {
        InputStream inputStream;
        this.f19591d.mo49941e(this.f19604q, (long) this.f19605r, -1);
        this.f19605r = 0;
        if (this.f19599l) {
            inputStream = m27140O();
        } else {
            inputStream = m27141Q();
        }
        this.f19600m = null;
        this.f19589b.mo49779a(new C12353c(inputStream, (C12351a) null));
        this.f19597j = C12355e.HEADER;
        this.f19598k = 5;
    }

    /* renamed from: Y */
    private void m27145Y() {
        boolean z;
        int readUnsignedByte = this.f19600m.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            if ((readUnsignedByte & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f19599l = z;
            int readInt = this.f19600m.readInt();
            this.f19598k = readInt;
            if (readInt < 0 || readInt > this.f19590c) {
                throw C12594t.f20192o.mo50310r(String.format("gRPC message exceeds maximum size %d: %d", new Object[]{Integer.valueOf(this.f19590c), Integer.valueOf(this.f19598k)})).mo50300d();
            }
            int i = this.f19604q + 1;
            this.f19604q = i;
            this.f19591d.mo49940d(i);
            this.f19592e.mo50025d();
            this.f19597j = C12355e.BODY;
            return;
        }
        throw C12594t.f20197t.mo50310r("gRPC frame header malformed: reserved bits not zero").mo50300d();
    }

    /* renamed from: a */
    private void m27146a() {
        if (!this.f19603p) {
            this.f19603p = true;
            while (!this.f19607t && this.f19602o > 0 && m27147a0()) {
                try {
                    int i = C12351a.f19608a[this.f19597j.ordinal()];
                    if (i == 1) {
                        m27145Y();
                    } else if (i == 2) {
                        m27144X();
                        this.f19602o--;
                    } else {
                        throw new AssertionError("Invalid state: " + this.f19597j);
                    }
                } finally {
                    this.f19603p = false;
                }
            }
            if (this.f19607t) {
                close();
                return;
            }
            if (this.f19606s && m27143V()) {
                close();
            }
            this.f19603p = false;
        }
    }

    /* renamed from: a0 */
    private boolean m27147a0() {
        int i;
        int i2 = 0;
        try {
            if (this.f19600m == null) {
                this.f19600m = new C12433u();
            }
            int i3 = 0;
            i = 0;
            while (true) {
                try {
                    int e = this.f19598k - this.f19600m.mo50016e();
                    if (e > 0) {
                        if (this.f19594g != null) {
                            byte[] bArr = this.f19595h;
                            if (bArr == null || this.f19596i == bArr.length) {
                                this.f19595h = new byte[Math.min(e, 2097152)];
                                this.f19596i = 0;
                            }
                            int c0 = this.f19594g.mo50069c0(this.f19595h, this.f19596i, Math.min(e, this.f19595h.length - this.f19596i));
                            i3 += this.f19594g.mo50066V();
                            i += this.f19594g.mo50067X();
                            if (c0 == 0) {
                                if (i3 > 0) {
                                    this.f19589b.mo49832c(i3);
                                    if (this.f19597j == C12355e.BODY) {
                                        if (this.f19594g != null) {
                                            this.f19591d.mo49943g((long) i);
                                            this.f19605r += i;
                                        } else {
                                            this.f19591d.mo49943g((long) i3);
                                            this.f19605r += i3;
                                        }
                                    }
                                }
                                return false;
                            }
                            this.f19600m.mo50091b(C12455w1.m27502f(this.f19595h, this.f19596i, c0));
                            this.f19596i += c0;
                        } else if (this.f19601n.mo50016e() == 0) {
                            if (i3 > 0) {
                                this.f19589b.mo49832c(i3);
                                if (this.f19597j == C12355e.BODY) {
                                    if (this.f19594g != null) {
                                        this.f19591d.mo49943g((long) i);
                                        this.f19605r += i;
                                    } else {
                                        this.f19591d.mo49943g((long) i3);
                                        this.f19605r += i3;
                                    }
                                }
                            }
                            return false;
                        } else {
                            int min = Math.min(e, this.f19601n.mo50016e());
                            i3 += min;
                            this.f19600m.mo50091b(this.f19601n.mo50019q(min));
                        }
                    } else if (i3 <= 0) {
                        return true;
                    } else {
                        this.f19589b.mo49832c(i3);
                        if (this.f19597j != C12355e.BODY) {
                            return true;
                        }
                        if (this.f19594g != null) {
                            this.f19591d.mo49943g((long) i);
                            this.f19605r += i;
                            return true;
                        }
                        this.f19591d.mo49943g((long) i3);
                        this.f19605r += i3;
                        return true;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                } catch (DataFormatException e3) {
                    throw new RuntimeException(e3);
                } catch (Throwable th) {
                    int i4 = i3;
                    th = th;
                    i2 = i4;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i = 0;
            if (i2 > 0) {
                this.f19589b.mo49832c(i2);
                if (this.f19597j == C12355e.BODY) {
                    if (this.f19594g != null) {
                        this.f19591d.mo49943g((long) i);
                        this.f19605r += i;
                    } else {
                        this.f19591d.mo49943g((long) i2);
                        this.f19605r += i2;
                    }
                }
            }
            throw th;
        }
    }

    /* renamed from: A */
    public void mo49813A(C13823q qVar) {
        boolean z;
        if (this.f19594g == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "Already set full stream decompressor");
        this.f19593f = (C13823q) C8012n.m15756o(qVar, "Can't pass an empty decompressor");
    }

    /* renamed from: G */
    public void mo49814G(C12451v1 v1Var) {
        C8012n.m15756o(v1Var, "data");
        boolean z = true;
        try {
            if (!m27142R()) {
                C12424s0 s0Var = this.f19594g;
                if (s0Var != null) {
                    s0Var.mo50065Q(v1Var);
                } else {
                    this.f19601n.mo50091b(v1Var);
                }
                z = false;
                m27146a();
            }
        } finally {
            if (z) {
                v1Var.close();
            }
        }
    }

    /* renamed from: b */
    public void mo49815b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15746e(z, "numMessages must be > 0");
        if (!isClosed()) {
            this.f19602o += (long) i;
            m27146a();
        }
    }

    /* renamed from: c */
    public void mo49816c(int i) {
        this.f19590c = i;
    }

    /* renamed from: c0 */
    public void mo49984c0(C12424s0 s0Var) {
        boolean z;
        boolean z2 = true;
        if (this.f19593f == C13799i.C13801b.f22244a) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "per-message decompressor already set");
        if (this.f19594g != null) {
            z2 = false;
        }
        C8012n.m15762u(z2, "full stream decompressor already set");
        this.f19594g = (C12424s0) C8012n.m15756o(s0Var, "Can't pass a null full stream decompressor");
        this.f19601n = null;
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        boolean z;
        if (!isClosed()) {
            C12433u uVar = this.f19600m;
            boolean z2 = true;
            if (uVar == null || uVar.mo50016e() <= 0) {
                z = false;
            } else {
                z = true;
            }
            try {
                C12424s0 s0Var = this.f19594g;
                if (s0Var != null) {
                    if (!z) {
                        if (!s0Var.mo50068Y()) {
                            z2 = false;
                        }
                    }
                    this.f19594g.close();
                    z = z2;
                }
                C12433u uVar2 = this.f19601n;
                if (uVar2 != null) {
                    uVar2.close();
                }
                C12433u uVar3 = this.f19600m;
                if (uVar3 != null) {
                    uVar3.close();
                }
                this.f19594g = null;
                this.f19601n = null;
                this.f19600m = null;
                this.f19589b.mo49694b(z);
            } catch (Throwable th) {
                this.f19594g = null;
                this.f19601n = null;
                this.f19600m = null;
                throw th;
            }
        }
    }

    public boolean isClosed() {
        if (this.f19601n == null && this.f19594g == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo49986j0(C12352b bVar) {
        this.f19589b = bVar;
    }

    /* renamed from: k */
    public void mo49818k() {
        if (!isClosed()) {
            if (m27143V()) {
                close();
            } else {
                this.f19606s = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo49987k0() {
        this.f19607t = true;
    }

    /* renamed from: io.grpc.internal.l1$d */
    /* compiled from: MessageDeframer */
    static final class C12354d extends FilterInputStream {

        /* renamed from: b */
        private final int f19610b;

        /* renamed from: c */
        private final C12324i2 f19611c;

        /* renamed from: d */
        private long f19612d;

        /* renamed from: e */
        private long f19613e;

        /* renamed from: f */
        private long f19614f = -1;

        C12354d(InputStream inputStream, int i, C12324i2 i2Var) {
            super(inputStream);
            this.f19610b = i;
            this.f19611c = i2Var;
        }

        /* renamed from: a */
        private void m27160a() {
            long j = this.f19613e;
            long j2 = this.f19612d;
            if (j > j2) {
                this.f19611c.mo49942f(j - j2);
                this.f19612d = this.f19613e;
            }
        }

        /* renamed from: b */
        private void m27161b() {
            long j = this.f19613e;
            int i = this.f19610b;
            if (j > ((long) i)) {
                throw C12594t.f20192o.mo50310r(String.format("Decompressed gRPC message exceeds maximum size %d", new Object[]{Integer.valueOf(i)})).mo50300d();
            }
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f19614f = this.f19613e;
        }

        public int read() {
            int read = this.in.read();
            if (read != -1) {
                this.f19613e++;
            }
            m27161b();
            m27160a();
            return read;
        }

        public synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f19614f != -1) {
                this.in.reset();
                this.f19613e = this.f19614f;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) {
            long skip = this.in.skip(j);
            this.f19613e += skip;
            m27161b();
            m27160a();
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = this.in.read(bArr, i, i2);
            if (read != -1) {
                this.f19613e += (long) read;
            }
            m27161b();
            m27160a();
            return read;
        }
    }
}
