package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.h */
/* compiled from: ByteString */
public abstract class C7086h implements Iterable<Byte>, Serializable {

    /* renamed from: c */
    public static final C7086h f9565c = new C7096j(C7196z.f9862c);

    /* renamed from: d */
    private static final C7092f f9566d;

    /* renamed from: e */
    private static final Comparator<C7086h> f9567e = new C7088b();

    /* renamed from: b */
    private int f9568b = 0;

    /* renamed from: com.google.protobuf.h$a */
    /* compiled from: ByteString */
    class C7087a extends C7089c {

        /* renamed from: b */
        private int f9569b = 0;

        /* renamed from: c */
        private final int f9570c;

        C7087a() {
            this.f9570c = C7086h.this.size();
        }

        /* renamed from: b */
        public byte mo40338b() {
            int i = this.f9569b;
            if (i < this.f9570c) {
                this.f9569b = i + 1;
                return C7086h.this.mo40335u(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f9569b < this.f9570c) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.protobuf.h$b */
    /* compiled from: ByteString */
    static class C7088b implements Comparator<C7086h> {
        C7088b() {
        }

        /* renamed from: a */
        public int compare(C7086h hVar, C7086h hVar2) {
            C7093g z = hVar.iterator();
            C7093g z2 = hVar2.iterator();
            while (z.hasNext() && z2.hasNext()) {
                int compare = Integer.compare(C7086h.m13054J(z.mo40338b()), C7086h.m13054J(z2.mo40338b()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(hVar.size(), hVar2.size());
        }
    }

    /* renamed from: com.google.protobuf.h$c */
    /* compiled from: ByteString */
    static abstract class C7089c implements C7093g {
        C7089c() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo40338b());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.h$d */
    /* compiled from: ByteString */
    private static final class C7090d implements C7092f {
        private C7090d() {
        }

        /* synthetic */ C7090d(C7087a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo40345a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.google.protobuf.h$e */
    /* compiled from: ByteString */
    private static final class C7091e extends C7096j {
        private static final long serialVersionUID = 1;

        /* renamed from: g */
        private final int f9572g;

        /* renamed from: h */
        private final int f9573h;

        C7091e(byte[] bArr, int i, int i2) {
            super(bArr);
            C7086h.m13060k(i, i + i2, bArr.length);
            this.f9572g = i;
            this.f9573h = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        /* renamed from: S */
        public int mo40346S() {
            return this.f9572g;
        }

        /* renamed from: d */
        public byte mo40328d(int i) {
            C7086h.m13059j(i, size());
            return this.f9576f[this.f9572g + i];
        }

        public int size() {
            return this.f9573h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo40333t(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f9576f, mo40346S() + i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public byte mo40335u(int i) {
            return this.f9576f[this.f9572g + i];
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return C7086h.m13056O(mo40323I());
        }
    }

    /* renamed from: com.google.protobuf.h$f */
    /* compiled from: ByteString */
    private interface C7092f {
        /* renamed from: a */
        byte[] mo40345a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.protobuf.h$g */
    /* compiled from: ByteString */
    public interface C7093g extends Iterator<Byte> {
        /* renamed from: b */
        byte mo40338b();
    }

    /* renamed from: com.google.protobuf.h$h */
    /* compiled from: ByteString */
    static final class C7094h {

        /* renamed from: a */
        private final CodedOutputStream f9574a;

        /* renamed from: b */
        private final byte[] f9575b;

        /* synthetic */ C7094h(int i, C7087a aVar) {
            this(i);
        }

        /* renamed from: a */
        public C7086h mo40348a() {
            this.f9574a.mo40111c();
            return new C7096j(this.f9575b);
        }

        /* renamed from: b */
        public CodedOutputStream mo40349b() {
            return this.f9574a;
        }

        private C7094h(int i) {
            byte[] bArr = new byte[i];
            this.f9575b = bArr;
            this.f9574a = CodedOutputStream.m12617g0(bArr);
        }
    }

    /* renamed from: com.google.protobuf.h$i */
    /* compiled from: ByteString */
    static abstract class C7095i extends C7086h {
        C7095i() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C7086h.super.iterator();
        }
    }

    /* renamed from: com.google.protobuf.h$j */
    /* compiled from: ByteString */
    private static class C7096j extends C7095i {
        private static final long serialVersionUID = 1;

        /* renamed from: f */
        protected final byte[] f9576f;

        C7096j(byte[] bArr) {
            bArr.getClass();
            this.f9576f = bArr;
        }

        /* renamed from: B */
        public final C7111i mo40319B() {
            return C7111i.m13147j(this.f9576f, mo40346S(), size(), true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public final int mo40320F(int i, int i2, int i3) {
            return C7196z.m13952i(i, this.f9576f, mo40346S() + i2, i3);
        }

        /* renamed from: H */
        public final C7086h mo40322H(int i, int i2) {
            int k = C7086h.m13060k(i, i2, size());
            if (k == 0) {
                return C7086h.f9565c;
            }
            return new C7091e(this.f9576f, mo40346S() + i, k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public final String mo40325L(Charset charset) {
            return new String(this.f9576f, mo40346S(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public final void mo40327Q(C7083g gVar) {
            gVar.mo40109a(this.f9576f, mo40346S(), size());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R */
        public final boolean mo40350R(C7086h hVar, int i, int i2) {
            if (i2 <= hVar.size()) {
                int i3 = i + i2;
                if (i3 > hVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + hVar.size());
                } else if (!(hVar instanceof C7096j)) {
                    return hVar.mo40322H(i, i3).equals(mo40322H(0, i2));
                } else {
                    C7096j jVar = (C7096j) hVar;
                    byte[] bArr = this.f9576f;
                    byte[] bArr2 = jVar.f9576f;
                    int S = mo40346S() + i2;
                    int S2 = mo40346S();
                    int S3 = jVar.mo40346S() + i;
                    while (S2 < S) {
                        if (bArr[S2] != bArr2[S3]) {
                            return false;
                        }
                        S2++;
                        S3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: S */
        public int mo40346S() {
            return 0;
        }

        /* renamed from: d */
        public byte mo40328d(int i) {
            return this.f9576f[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7086h) || size() != ((C7086h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C7096j)) {
                return obj.equals(this);
            }
            C7096j jVar = (C7096j) obj;
            int G = mo40321G();
            int G2 = jVar.mo40321G();
            if (G == 0 || G2 == 0 || G == G2) {
                return mo40350R(jVar, 0, size());
            }
            return false;
        }

        public int size() {
            return this.f9576f.length;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo40333t(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f9576f, i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public byte mo40335u(int i) {
            return this.f9576f[i];
        }

        /* renamed from: v */
        public final boolean mo40336v() {
            int S = mo40346S();
            return C7151p1.m13633n(this.f9576f, S, size() + S);
        }
    }

    /* renamed from: com.google.protobuf.h$k */
    /* compiled from: ByteString */
    private static final class C7097k implements C7092f {
        private C7097k() {
        }

        /* synthetic */ C7097k(C7087a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo40345a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        C7092f fVar;
        if (C7069d.m12822c()) {
            fVar = new C7097k((C7087a) null);
        } else {
            fVar = new C7090d((C7087a) null);
        }
        f9566d = fVar;
    }

    C7086h() {
    }

    /* renamed from: A */
    static C7094h m13053A(int i) {
        return new C7094h(i, (C7087a) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static int m13054J(byte b) {
        return b & 255;
    }

    /* renamed from: N */
    private String m13055N() {
        if (size() <= 50) {
            return C7121j1.m13327a(this);
        }
        return C7121j1.m13327a(mo40322H(0, 47)) + "...";
    }

    /* renamed from: O */
    static C7086h m13056O(byte[] bArr) {
        return new C7096j(bArr);
    }

    /* renamed from: P */
    static C7086h m13057P(byte[] bArr, int i, int i2) {
        return new C7091e(bArr, i, i2);
    }

    /* renamed from: j */
    static void m13059j(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: k */
    static int m13060k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: q */
    public static C7086h m13061q(byte[] bArr) {
        return m13062r(bArr, 0, bArr.length);
    }

    /* renamed from: r */
    public static C7086h m13062r(byte[] bArr, int i, int i2) {
        m13060k(i, i + i2, bArr.length);
        return new C7096j(f9566d.mo40345a(bArr, i, i2));
    }

    /* renamed from: s */
    public static C7086h m13063s(String str) {
        return new C7096j(str.getBytes(C7196z.f9860a));
    }

    /* renamed from: B */
    public abstract C7111i mo40319B();

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public abstract int mo40320F(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final int mo40321G() {
        return this.f9568b;
    }

    /* renamed from: H */
    public abstract C7086h mo40322H(int i, int i2);

    /* renamed from: I */
    public final byte[] mo40323I() {
        int size = size();
        if (size == 0) {
            return C7196z.f9862c;
        }
        byte[] bArr = new byte[size];
        mo40333t(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: K */
    public final String mo40324K(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return mo40325L(charset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract String mo40325L(Charset charset);

    /* renamed from: M */
    public final String mo40326M() {
        return mo40324K(C7196z.f9860a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public abstract void mo40327Q(C7083g gVar);

    /* renamed from: d */
    public abstract byte mo40328d(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f9568b;
        if (i == 0) {
            int size = size();
            i = mo40320F(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f9568b = i;
        }
        return i;
    }

    public abstract int size();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo40333t(byte[] bArr, int i, int i2, int i3);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m13055N()});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public abstract byte mo40335u(int i);

    /* renamed from: v */
    public abstract boolean mo40336v();

    /* renamed from: z */
    public C7093g iterator() {
        return new C7087a();
    }
}
