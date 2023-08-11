package p364io.grpc.internal;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import p111h6.C8012n;

/* renamed from: io.grpc.internal.s0 */
/* compiled from: GzipInflatingBuffer */
class C12424s0 implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12433u f19799b = new C12433u();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final CRC32 f19800c = new CRC32();

    /* renamed from: d */
    private final C12426b f19801d = new C12426b(this, (C12425a) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final byte[] f19802e = new byte[512];
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f19803f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f19804g;

    /* renamed from: h */
    private Inflater f19805h;

    /* renamed from: i */
    private C12427c f19806i = C12427c.HEADER;

    /* renamed from: j */
    private boolean f19807j = false;

    /* renamed from: k */
    private int f19808k;

    /* renamed from: l */
    private int f19809l;

    /* renamed from: m */
    private long f19810m;

    /* renamed from: n */
    private int f19811n = 0;

    /* renamed from: o */
    private int f19812o = 0;

    /* renamed from: p */
    private boolean f19813p = true;

    /* renamed from: io.grpc.internal.s0$a */
    /* compiled from: GzipInflatingBuffer */
    static /* synthetic */ class C12425a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19814a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.grpc.internal.s0$c[] r0 = p364io.grpc.internal.C12424s0.C12427c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19814a = r0
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.HEADER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.HEADER_EXTRA_LEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.HEADER_EXTRA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.HEADER_NAME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x003e }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.HEADER_COMMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.HEADER_CRC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.INITIALIZE_INFLATER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.INFLATING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x006c }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.INFLATER_NEEDS_INPUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f19814a     // Catch:{ NoSuchFieldError -> 0x0078 }
                io.grpc.internal.s0$c r1 = p364io.grpc.internal.C12424s0.C12427c.TRAILER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12424s0.C12425a.<clinit>():void");
        }
    }

    /* renamed from: io.grpc.internal.s0$b */
    /* compiled from: GzipInflatingBuffer */
    private class C12426b {
        private C12426b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public boolean m27409g() {
            while (m27413k() > 0) {
                if (m27410h() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public int m27410h() {
            int i;
            if (C12424s0.this.f19804g - C12424s0.this.f19803f > 0) {
                i = C12424s0.this.f19802e[C12424s0.this.f19803f] & 255;
                C12424s0.m27387c(C12424s0.this, 1);
            } else {
                i = C12424s0.this.f19799b.readUnsignedByte();
            }
            C12424s0.this.f19800c.update(i);
            C12424s0.m27382O(C12424s0.this, 1);
            return i;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public long m27411i() {
            return ((long) m27412j()) | (((long) m27412j()) << 16);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public int m27412j() {
            return m27410h() | (m27410h() << 8);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public int m27413k() {
            return (C12424s0.this.f19804g - C12424s0.this.f19803f) + C12424s0.this.f19799b.mo50016e();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public void m27414l(int i) {
            int i2;
            int a = C12424s0.this.f19804g - C12424s0.this.f19803f;
            if (a > 0) {
                int min = Math.min(a, i);
                C12424s0.this.f19800c.update(C12424s0.this.f19802e, C12424s0.this.f19803f, min);
                C12424s0.m27387c(C12424s0.this, min);
                i2 = i - min;
            } else {
                i2 = i;
            }
            if (i2 > 0) {
                byte[] bArr = new byte[512];
                int i3 = 0;
                while (i3 < i2) {
                    int min2 = Math.min(i2 - i3, 512);
                    C12424s0.this.f19799b.mo50015J(bArr, 0, min2);
                    C12424s0.this.f19800c.update(bArr, 0, min2);
                    i3 += min2;
                }
            }
            C12424s0.m27382O(C12424s0.this, i);
        }

        /* synthetic */ C12426b(C12424s0 s0Var, C12425a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.s0$c */
    /* compiled from: GzipInflatingBuffer */
    private enum C12427c {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    C12424s0() {
    }

    /* renamed from: O */
    static /* synthetic */ int m27382O(C12424s0 s0Var, int i) {
        int i2 = s0Var.f19811n + i;
        s0Var.f19811n = i2;
        return i2;
    }

    /* renamed from: R */
    private boolean m27383R() {
        boolean z;
        boolean z2;
        if (this.f19805h != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "inflater is null");
        if (this.f19803f == this.f19804g) {
            z2 = true;
        } else {
            z2 = false;
        }
        C8012n.m15762u(z2, "inflaterInput has unconsumed bytes");
        int min = Math.min(this.f19799b.mo50016e(), 512);
        if (min == 0) {
            return false;
        }
        this.f19803f = 0;
        this.f19804g = min;
        this.f19799b.mo50015J(this.f19802e, 0, min);
        this.f19805h.setInput(this.f19802e, this.f19803f, min);
        this.f19806i = C12427c.INFLATING;
        return true;
    }

    /* renamed from: a0 */
    private int m27385a0(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.f19805h != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "inflater is null");
        try {
            int totalIn = this.f19805h.getTotalIn();
            int inflate = this.f19805h.inflate(bArr, i, i2);
            int totalIn2 = this.f19805h.getTotalIn() - totalIn;
            this.f19811n += totalIn2;
            this.f19812o += totalIn2;
            this.f19803f += totalIn2;
            this.f19800c.update(bArr, i, inflate);
            if (this.f19805h.finished()) {
                this.f19810m = this.f19805h.getBytesWritten() & 4294967295L;
                this.f19806i = C12427c.TRAILER;
            } else if (this.f19805h.needsInput()) {
                this.f19806i = C12427c.INFLATER_NEEDS_INPUT;
            }
            return inflate;
        } catch (DataFormatException e) {
            throw new DataFormatException("Inflater data format exception: " + e.getMessage());
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m27387c(C12424s0 s0Var, int i) {
        int i2 = s0Var.f19803f + i;
        s0Var.f19803f = i2;
        return i2;
    }

    /* renamed from: j0 */
    private boolean m27388j0() {
        Inflater inflater = this.f19805h;
        if (inflater == null) {
            this.f19805h = new Inflater(true);
        } else {
            inflater.reset();
        }
        this.f19800c.reset();
        int i = this.f19804g;
        int i2 = this.f19803f;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f19805h.setInput(this.f19802e, i2, i3);
            this.f19806i = C12427c.INFLATING;
        } else {
            this.f19806i = C12427c.INFLATER_NEEDS_INPUT;
        }
        return true;
    }

    /* renamed from: p0 */
    private boolean m27390p0() {
        if (this.f19801d.m27413k() < 10) {
            return false;
        }
        if (this.f19801d.m27412j() != 35615) {
            throw new ZipException("Not in GZIP format");
        } else if (this.f19801d.m27410h() == 8) {
            this.f19808k = this.f19801d.m27410h();
            this.f19801d.m27414l(6);
            this.f19806i = C12427c.HEADER_EXTRA_LEN;
            return true;
        } else {
            throw new ZipException("Unsupported compression method");
        }
    }

    /* renamed from: t0 */
    private boolean m27391t0() {
        if ((this.f19808k & 16) != 16) {
            this.f19806i = C12427c.HEADER_CRC;
            return true;
        } else if (!this.f19801d.m27409g()) {
            return false;
        } else {
            this.f19806i = C12427c.HEADER_CRC;
            return true;
        }
    }

    /* renamed from: u0 */
    private boolean m27392u0() {
        if ((this.f19808k & 2) != 2) {
            this.f19806i = C12427c.INITIALIZE_INFLATER;
            return true;
        } else if (this.f19801d.m27413k() < 2) {
            return false;
        } else {
            if ((((int) this.f19800c.getValue()) & 65535) == this.f19801d.m27412j()) {
                this.f19806i = C12427c.INITIALIZE_INFLATER;
                return true;
            }
            throw new ZipException("Corrupt GZIP header");
        }
    }

    /* renamed from: v0 */
    private boolean m27393v0() {
        int d = this.f19801d.m27413k();
        int i = this.f19809l;
        if (d < i) {
            return false;
        }
        this.f19801d.m27414l(i);
        this.f19806i = C12427c.HEADER_NAME;
        return true;
    }

    /* renamed from: w0 */
    private boolean m27394w0() {
        if ((this.f19808k & 4) != 4) {
            this.f19806i = C12427c.HEADER_NAME;
            return true;
        } else if (this.f19801d.m27413k() < 2) {
            return false;
        } else {
            this.f19809l = this.f19801d.m27412j();
            this.f19806i = C12427c.HEADER_EXTRA;
            return true;
        }
    }

    /* renamed from: x0 */
    private boolean m27395x0() {
        if ((this.f19808k & 8) != 8) {
            this.f19806i = C12427c.HEADER_COMMENT;
            return true;
        } else if (!this.f19801d.m27409g()) {
            return false;
        } else {
            this.f19806i = C12427c.HEADER_COMMENT;
            return true;
        }
    }

    /* renamed from: y0 */
    private boolean m27396y0() {
        if (this.f19805h != null && this.f19801d.m27413k() <= 18) {
            this.f19805h.end();
            this.f19805h = null;
        }
        if (this.f19801d.m27413k() < 8) {
            return false;
        }
        if (this.f19800c.getValue() == this.f19801d.m27411i() && this.f19810m == this.f19801d.m27411i()) {
            this.f19800c.reset();
            this.f19806i = C12427c.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo50065Q(C12451v1 v1Var) {
        C8012n.m15762u(!this.f19807j, "GzipInflatingBuffer is closed");
        this.f19799b.mo50091b(v1Var);
        this.f19813p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public int mo50066V() {
        int i = this.f19811n;
        this.f19811n = 0;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public int mo50067X() {
        int i = this.f19812o;
        this.f19812o = 0;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo50068Y() {
        C8012n.m15762u(!this.f19807j, "GzipInflatingBuffer is closed");
        if (this.f19801d.m27413k() == 0 && this.f19806i == C12427c.HEADER) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public int mo50069c0(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        C8012n.m15762u(!this.f19807j, "GzipInflatingBuffer is closed");
        int i3 = 0;
        while (true) {
            z = true;
            while (true) {
                if (z) {
                    int i4 = i2 - i3;
                    if (i4 > 0) {
                        switch (C12425a.f19814a[this.f19806i.ordinal()]) {
                            case 1:
                                z = m27390p0();
                                break;
                            case 2:
                                z = m27394w0();
                                break;
                            case 3:
                                z = m27393v0();
                                break;
                            case 4:
                                z = m27395x0();
                                break;
                            case 5:
                                z = m27391t0();
                                break;
                            case 6:
                                z = m27392u0();
                                break;
                            case 7:
                                z = m27388j0();
                                break;
                            case 8:
                                i3 += m27385a0(bArr, i + i3, i4);
                                if (this.f19806i == C12427c.TRAILER) {
                                    z = m27396y0();
                                    break;
                                }
                            case 9:
                                z = m27383R();
                                break;
                            case 10:
                                z = m27396y0();
                                break;
                            default:
                                throw new AssertionError("Invalid state: " + this.f19806i);
                        }
                    }
                }
            }
        }
        if (z && (this.f19806i != C12427c.HEADER || this.f19801d.m27413k() >= 10)) {
            z2 = false;
        }
        this.f19813p = z2;
        return i3;
    }

    public void close() {
        if (!this.f19807j) {
            this.f19807j = true;
            this.f19799b.close();
            Inflater inflater = this.f19805h;
            if (inflater != null) {
                inflater.end();
                this.f19805h = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public boolean mo50071k0() {
        C8012n.m15762u(!this.f19807j, "GzipInflatingBuffer is closed");
        return this.f19813p;
    }
}
