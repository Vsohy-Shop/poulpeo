package p364io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: io.grpc.internal.u */
/* compiled from: CompositeReadableBuffer */
public class C12433u extends C12213c {

    /* renamed from: f */
    private static final C12439f<Void> f19838f = new C12434a();

    /* renamed from: g */
    private static final C12439f<Void> f19839g = new C12435b();

    /* renamed from: h */
    private static final C12439f<byte[]> f19840h = new C12436c();

    /* renamed from: i */
    private static final C12439f<ByteBuffer> f19841i = new C12437d();

    /* renamed from: j */
    private static final C12440g<OutputStream> f19842j = new C12438e();

    /* renamed from: b */
    private final Deque<C12451v1> f19843b;

    /* renamed from: c */
    private Deque<C12451v1> f19844c;

    /* renamed from: d */
    private int f19845d;

    /* renamed from: e */
    private boolean f19846e;

    /* renamed from: io.grpc.internal.u$a */
    /* compiled from: CompositeReadableBuffer */
    class C12434a implements C12439f<Void> {
        C12434a() {
        }

        /* renamed from: b */
        public int mo50092a(C12451v1 v1Var, int i, Void voidR, int i2) {
            return v1Var.readUnsignedByte();
        }
    }

    /* renamed from: io.grpc.internal.u$b */
    /* compiled from: CompositeReadableBuffer */
    class C12435b implements C12439f<Void> {
        C12435b() {
        }

        /* renamed from: b */
        public int mo50092a(C12451v1 v1Var, int i, Void voidR, int i2) {
            v1Var.skipBytes(i);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$c */
    /* compiled from: CompositeReadableBuffer */
    class C12436c implements C12439f<byte[]> {
        C12436c() {
        }

        /* renamed from: b */
        public int mo50092a(C12451v1 v1Var, int i, byte[] bArr, int i2) {
            v1Var.mo50015J(bArr, i2, i);
            return i2 + i;
        }
    }

    /* renamed from: io.grpc.internal.u$d */
    /* compiled from: CompositeReadableBuffer */
    class C12437d implements C12439f<ByteBuffer> {
        C12437d() {
        }

        /* renamed from: b */
        public int mo50092a(C12451v1 v1Var, int i, ByteBuffer byteBuffer, int i2) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            v1Var.mo50018n0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$e */
    /* compiled from: CompositeReadableBuffer */
    class C12438e implements C12440g<OutputStream> {
        C12438e() {
        }

        /* renamed from: b */
        public int mo50092a(C12451v1 v1Var, int i, OutputStream outputStream, int i2) {
            v1Var.mo50017e0(outputStream, i);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$f */
    /* compiled from: CompositeReadableBuffer */
    private interface C12439f<T> extends C12440g<T> {
    }

    /* renamed from: io.grpc.internal.u$g */
    /* compiled from: CompositeReadableBuffer */
    private interface C12440g<T> {
        /* renamed from: a */
        int mo50092a(C12451v1 v1Var, int i, T t, int i2);
    }

    public C12433u(int i) {
        this.f19843b = new ArrayDeque(i);
    }

    /* renamed from: A */
    private void m27433A(C12451v1 v1Var) {
        if (!(v1Var instanceof C12433u)) {
            this.f19843b.add(v1Var);
            this.f19845d += v1Var.mo50016e();
            return;
        }
        C12433u uVar = (C12433u) v1Var;
        while (!uVar.f19843b.isEmpty()) {
            this.f19843b.add(uVar.f19843b.remove());
        }
        this.f19845d += uVar.f19845d;
        uVar.f19845d = 0;
        uVar.close();
    }

    /* renamed from: G */
    private <T> int m27434G(C12440g<T> gVar, int i, T t, int i2) {
        mo49748a(i);
        if (!this.f19843b.isEmpty()) {
            m27437k();
        }
        while (i > 0 && !this.f19843b.isEmpty()) {
            C12451v1 peek = this.f19843b.peek();
            int min = Math.min(i, peek.mo50016e());
            i2 = gVar.mo50092a(peek, min, t, i2);
            i -= min;
            this.f19845d -= min;
            m27437k();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* renamed from: O */
    private <T> int m27435O(C12439f<T> fVar, int i, T t, int i2) {
        try {
            return m27434G(fVar, i, t, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    private void m27436c() {
        if (this.f19846e) {
            this.f19844c.add(this.f19843b.remove());
            C12451v1 peek = this.f19843b.peek();
            if (peek != null) {
                peek.mo49747N();
                return;
            }
            return;
        }
        this.f19843b.remove().close();
    }

    /* renamed from: k */
    private void m27437k() {
        if (this.f19843b.peek().mo50016e() == 0) {
            m27436c();
        }
    }

    /* renamed from: J */
    public void mo50015J(byte[] bArr, int i, int i2) {
        m27435O(f19840h, i2, bArr, i);
    }

    /* renamed from: N */
    public void mo49747N() {
        if (this.f19844c == null) {
            this.f19844c = new ArrayDeque(Math.min(this.f19843b.size(), 16));
        }
        while (!this.f19844c.isEmpty()) {
            this.f19844c.remove().close();
        }
        this.f19846e = true;
        C12451v1 peek = this.f19843b.peek();
        if (peek != null) {
            peek.mo49747N();
        }
    }

    /* renamed from: b */
    public void mo50091b(C12451v1 v1Var) {
        boolean z;
        if (!this.f19846e || !this.f19843b.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        m27433A(v1Var);
        if (z) {
            this.f19843b.peek().mo49747N();
        }
    }

    public void close() {
        while (!this.f19843b.isEmpty()) {
            this.f19843b.remove().close();
        }
        if (this.f19844c != null) {
            while (!this.f19844c.isEmpty()) {
                this.f19844c.remove().close();
            }
        }
    }

    /* renamed from: e */
    public int mo50016e() {
        return this.f19845d;
    }

    /* renamed from: e0 */
    public void mo50017e0(OutputStream outputStream, int i) {
        m27434G(f19842j, i, outputStream, 0);
    }

    public boolean markSupported() {
        for (C12451v1 markSupported : this.f19843b) {
            if (!markSupported.markSupported()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n0 */
    public void mo50018n0(ByteBuffer byteBuffer) {
        m27435O(f19841i, byteBuffer.remaining(), byteBuffer, 0);
    }

    /* renamed from: q */
    public C12451v1 mo50019q(int i) {
        C12451v1 v1Var;
        int i2;
        C12451v1 v1Var2;
        if (i <= 0) {
            return C12455w1.m27497a();
        }
        mo49748a(i);
        this.f19845d -= i;
        C12433u uVar = null;
        C12433u uVar2 = null;
        while (true) {
            C12451v1 peek = this.f19843b.peek();
            int e = peek.mo50016e();
            if (e > i) {
                v1Var = peek.mo50019q(i);
                i2 = 0;
            } else {
                if (this.f19846e) {
                    v1Var2 = peek.mo50019q(e);
                    m27436c();
                } else {
                    v1Var2 = this.f19843b.poll();
                }
                C12451v1 v1Var3 = v1Var2;
                i2 = i - e;
                v1Var = v1Var3;
            }
            if (uVar == null) {
                uVar = v1Var;
            } else {
                if (uVar2 == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(this.f19843b.size() + 2, 16);
                    }
                    uVar2 = new C12433u(i3);
                    uVar2.mo50091b(uVar);
                    uVar = uVar2;
                }
                uVar2.mo50091b(v1Var);
            }
            if (i2 <= 0) {
                return uVar;
            }
            i = i2;
        }
    }

    public int readUnsignedByte() {
        return m27435O(f19838f, 1, (Object) null, 0);
    }

    public void reset() {
        if (this.f19846e) {
            C12451v1 peek = this.f19843b.peek();
            if (peek != null) {
                int e = peek.mo50016e();
                peek.reset();
                this.f19845d += peek.mo50016e() - e;
            }
            while (true) {
                C12451v1 pollLast = this.f19844c.pollLast();
                if (pollLast != null) {
                    pollLast.reset();
                    this.f19843b.addFirst(pollLast);
                    this.f19845d += pollLast.mo50016e();
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    public void skipBytes(int i) {
        m27435O(f19839g, i, (Object) null, 0);
    }

    public C12433u() {
        this.f19843b = new ArrayDeque();
    }
}
