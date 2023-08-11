package p149l3;

import androidx.annotation.Nullable;
import java.util.Arrays;
import p139k3.C8539i;
import p149l3.C8662f;

/* renamed from: l3.a */
/* compiled from: AutoValue_BackendRequest */
final class C8655a extends C8662f {

    /* renamed from: a */
    private final Iterable<C8539i> f12376a;

    /* renamed from: b */
    private final byte[] f12377b;

    /* renamed from: l3.a$b */
    /* compiled from: AutoValue_BackendRequest */
    static final class C8657b extends C8662f.C8663a {

        /* renamed from: a */
        private Iterable<C8539i> f12378a;

        /* renamed from: b */
        private byte[] f12379b;

        C8657b() {
        }

        /* renamed from: a */
        public C8662f mo42734a() {
            String str = "";
            if (this.f12378a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C8655a(this.f12378a, this.f12379b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8662f.C8663a mo42735b(Iterable<C8539i> iterable) {
            if (iterable != null) {
                this.f12378a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: c */
        public C8662f.C8663a mo42736c(@Nullable byte[] bArr) {
            this.f12379b = bArr;
            return this;
        }
    }

    /* renamed from: b */
    public Iterable<C8539i> mo42729b() {
        return this.f12376a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo42730c() {
        return this.f12377b;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8662f)) {
            return false;
        }
        C8662f fVar = (C8662f) obj;
        if (this.f12376a.equals(fVar.mo42729b())) {
            byte[] bArr2 = this.f12377b;
            if (fVar instanceof C8655a) {
                bArr = ((C8655a) fVar).f12377b;
            } else {
                bArr = fVar.mo42730c();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12376a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12377b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f12376a + ", extras=" + Arrays.toString(this.f12377b) + "}";
    }

    private C8655a(Iterable<C8539i> iterable, @Nullable byte[] bArr) {
        this.f12376a = iterable;
        this.f12377b = bArr;
    }
}
