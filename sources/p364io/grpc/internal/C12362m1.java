package p364io.grpc.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p111h6.C8012n;
import p122i6.C8186a;
import p364io.grpc.C12594t;
import p458xd.C13778b0;
import p458xd.C13799i;
import p458xd.C13809k;
import p458xd.C13826s;

/* renamed from: io.grpc.internal.m1 */
/* compiled from: MessageFramer */
public class C12362m1 implements C12395p0 {

    /* renamed from: a */
    private final C12366d f19626a;

    /* renamed from: b */
    private int f19627b = -1;

    /* renamed from: c */
    private C12397p2 f19628c;

    /* renamed from: d */
    private C13809k f19629d = C13799i.C13801b.f22244a;

    /* renamed from: e */
    private boolean f19630e = true;

    /* renamed from: f */
    private final C12365c f19631f = new C12365c();

    /* renamed from: g */
    private final ByteBuffer f19632g = ByteBuffer.allocate(5);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12401q2 f19633h;

    /* renamed from: i */
    private final C12324i2 f19634i;

    /* renamed from: j */
    private boolean f19635j;

    /* renamed from: k */
    private int f19636k;

    /* renamed from: l */
    private int f19637l = -1;

    /* renamed from: m */
    private long f19638m;

    /* renamed from: io.grpc.internal.m1$c */
    /* compiled from: MessageFramer */
    private class C12365c extends OutputStream {
        private C12365c() {
        }

        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        public void write(byte[] bArr, int i, int i2) {
            C12362m1.this.m27179n(bArr, i, i2);
        }
    }

    /* renamed from: io.grpc.internal.m1$d */
    /* compiled from: MessageFramer */
    public interface C12366d {
        /* renamed from: m */
        void mo49668m(C12397p2 p2Var, boolean z, boolean z2, int i);
    }

    public C12362m1(C12366d dVar, C12401q2 q2Var, C12324i2 i2Var) {
        this.f19626a = (C12366d) C8012n.m15756o(dVar, "sink");
        this.f19633h = (C12401q2) C8012n.m15756o(q2Var, "bufferAllocator");
        this.f19634i = (C12324i2) C8012n.m15756o(i2Var, "statsTraceCtx");
    }

    /* renamed from: c */
    private void m27172c(boolean z, boolean z2) {
        C12397p2 p2Var = this.f19628c;
        this.f19628c = null;
        this.f19626a.mo49668m(p2Var, z, z2, this.f19636k);
        this.f19636k = 0;
    }

    /* renamed from: g */
    private int m27173g(InputStream inputStream) {
        if ((inputStream instanceof C13778b0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    /* renamed from: h */
    private void m27174h() {
        C12397p2 p2Var = this.f19628c;
        if (p2Var != null) {
            p2Var.release();
            this.f19628c = null;
        }
    }

    /* renamed from: j */
    private void m27175j() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* renamed from: k */
    private void m27176k(C12364b bVar, boolean z) {
        int a = bVar.m27188e();
        this.f19632g.clear();
        this.f19632g.put(z ? (byte) 1 : 0).putInt(a);
        C12397p2 a2 = this.f19633h.mo50043a(5);
        a2.write(this.f19632g.array(), 0, this.f19632g.position());
        if (a == 0) {
            this.f19628c = a2;
            return;
        }
        this.f19626a.mo49668m(a2, false, false, this.f19636k - 1);
        this.f19636k = 1;
        List b = bVar.f19639b;
        for (int i = 0; i < b.size() - 1; i++) {
            this.f19626a.mo49668m((C12397p2) b.get(i), false, false, 0);
        }
        this.f19628c = (C12397p2) b.get(b.size() - 1);
        this.f19638m = (long) a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private int m27177l(InputStream inputStream, int i) {
        C12364b bVar = new C12364b();
        OutputStream c = this.f19629d.mo53454c(bVar);
        try {
            int o = m27180o(inputStream, c);
            c.close();
            int i2 = this.f19627b;
            if (i2 < 0 || o <= i2) {
                m27176k(bVar, true);
                return o;
            }
            throw C12594t.f20192o.mo50310r(String.format("message too large %d > %d", new Object[]{Integer.valueOf(o), Integer.valueOf(this.f19627b)})).mo50300d();
        } catch (Throwable th) {
            c.close();
            throw th;
        }
    }

    /* renamed from: m */
    private int m27178m(InputStream inputStream, int i) {
        int i2 = this.f19627b;
        if (i2 < 0 || i <= i2) {
            this.f19632g.clear();
            this.f19632g.put((byte) 0).putInt(i);
            if (this.f19628c == null) {
                this.f19628c = this.f19633h.mo50043a(this.f19632g.position() + i);
            }
            m27179n(this.f19632g.array(), 0, this.f19632g.position());
            return m27180o(inputStream, this.f19631f);
        }
        throw C12594t.f20192o.mo50310r(String.format("message too large %d > %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f19627b)})).mo50300d();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m27179n(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            C12397p2 p2Var = this.f19628c;
            if (p2Var != null && p2Var.mo50035a() == 0) {
                m27172c(false, false);
            }
            if (this.f19628c == null) {
                this.f19628c = this.f19633h.mo50043a(i2);
            }
            int min = Math.min(i2, this.f19628c.mo50035a());
            this.f19628c.write(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    /* renamed from: o */
    private static int m27180o(InputStream inputStream, OutputStream outputStream) {
        boolean z;
        if (inputStream instanceof C13826s) {
            return ((C13826s) inputStream).mo45998a(outputStream);
        }
        long b = C8186a.m16199b(inputStream, outputStream);
        if (b <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15750i(z, "Message size overflow: %s", b);
        return (int) b;
    }

    /* renamed from: p */
    private int m27181p(InputStream inputStream, int i) {
        if (i != -1) {
            this.f19638m = (long) i;
            return m27178m(inputStream, i);
        }
        C12364b bVar = new C12364b();
        int o = m27180o(inputStream, bVar);
        int i2 = this.f19627b;
        if (i2 < 0 || o <= i2) {
            m27176k(bVar, false);
            return o;
        }
        throw C12594t.f20192o.mo50310r(String.format("message too large %d > %d", new Object[]{Integer.valueOf(o), Integer.valueOf(this.f19627b)})).mo50300d();
    }

    public void close() {
        if (!isClosed()) {
            this.f19635j = true;
            C12397p2 p2Var = this.f19628c;
            if (p2Var != null && p2Var.mo50037e() == 0) {
                m27174h();
            }
            m27172c(true, true);
        }
    }

    /* renamed from: d */
    public void mo49678d(int i) {
        boolean z;
        if (this.f19627b == -1) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "max size already set");
        this.f19627b = i;
    }

    /* renamed from: f */
    public void mo49680f(InputStream inputStream) {
        boolean z;
        int i;
        m27175j();
        this.f19636k++;
        int i2 = this.f19637l + 1;
        this.f19637l = i2;
        this.f19638m = 0;
        this.f19634i.mo49944i(i2);
        if (!this.f19630e || this.f19629d == C13799i.C13801b.f22244a) {
            z = false;
        } else {
            z = true;
        }
        try {
            int g = m27173g(inputStream);
            if (g == 0 || !z) {
                i = m27181p(inputStream, g);
            } else {
                i = m27177l(inputStream, g);
            }
            if (g == -1 || i == g) {
                long j = (long) i;
                this.f19634i.mo49946k(j);
                this.f19634i.mo49947l(this.f19638m);
                this.f19634i.mo49945j(this.f19637l, this.f19638m, j);
                return;
            }
            throw C12594t.f20197t.mo50310r(String.format("Message length inaccurate %s != %s", new Object[]{Integer.valueOf(i), Integer.valueOf(g)})).mo50300d();
        } catch (IOException e) {
            throw C12594t.f20197t.mo50310r("Failed to frame message").mo50309q(e).mo50300d();
        } catch (RuntimeException e2) {
            throw C12594t.f20197t.mo50310r("Failed to frame message").mo50309q(e2).mo50300d();
        }
    }

    public void flush() {
        C12397p2 p2Var = this.f19628c;
        if (p2Var != null && p2Var.mo50037e() > 0) {
            m27172c(false, true);
        }
    }

    /* renamed from: i */
    public C12362m1 mo49679e(C13809k kVar) {
        this.f19629d = (C13809k) C8012n.m15756o(kVar, "Can't pass an empty compressor");
        return this;
    }

    public boolean isClosed() {
        return this.f19635j;
    }

    /* renamed from: io.grpc.internal.m1$b */
    /* compiled from: MessageFramer */
    private final class C12364b extends OutputStream {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<C12397p2> f19639b;

        /* renamed from: c */
        private C12397p2 f19640c;

        private C12364b() {
            this.f19639b = new ArrayList();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public int m27188e() {
            int i = 0;
            for (C12397p2 e : this.f19639b) {
                i += e.mo50037e();
            }
            return i;
        }

        public void write(int i) {
            C12397p2 p2Var = this.f19640c;
            if (p2Var == null || p2Var.mo50035a() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
                return;
            }
            this.f19640c.mo50036b((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            if (this.f19640c == null) {
                C12397p2 a = C12362m1.this.f19633h.mo50043a(i2);
                this.f19640c = a;
                this.f19639b.add(a);
            }
            while (i2 > 0) {
                int min = Math.min(i2, this.f19640c.mo50035a());
                if (min == 0) {
                    C12397p2 a2 = C12362m1.this.f19633h.mo50043a(Math.max(i2, this.f19640c.mo50037e() * 2));
                    this.f19640c = a2;
                    this.f19639b.add(a2);
                } else {
                    this.f19640c.write(bArr, i, min);
                    i += min;
                    i2 -= min;
                }
            }
        }
    }
}
