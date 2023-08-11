package p139k3;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import p119i3.C8111d;
import p139k3.C8549o;

/* renamed from: k3.d */
/* compiled from: AutoValue_TransportContext */
final class C8530d extends C8549o {

    /* renamed from: a */
    private final String f12180a;

    /* renamed from: b */
    private final byte[] f12181b;

    /* renamed from: c */
    private final C8111d f12182c;

    /* renamed from: k3.d$b */
    /* compiled from: AutoValue_TransportContext */
    static final class C8532b extends C8549o.C8550a {

        /* renamed from: a */
        private String f12183a;

        /* renamed from: b */
        private byte[] f12184b;

        /* renamed from: c */
        private C8111d f12185c;

        C8532b() {
        }

        /* renamed from: a */
        public C8549o mo42585a() {
            String str = "";
            if (this.f12183a == null) {
                str = str + " backendName";
            }
            if (this.f12185c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C8530d(this.f12183a, this.f12184b, this.f12185c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8549o.C8550a mo42586b(String str) {
            if (str != null) {
                this.f12183a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: c */
        public C8549o.C8550a mo42587c(@Nullable byte[] bArr) {
            this.f12184b = bArr;
            return this;
        }

        /* renamed from: d */
        public C8549o.C8550a mo42588d(C8111d dVar) {
            if (dVar != null) {
                this.f12185c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    /* renamed from: b */
    public String mo42580b() {
        return this.f12180a;
    }

    @Nullable
    /* renamed from: c */
    public byte[] mo42581c() {
        return this.f12181b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public C8111d mo42582d() {
        return this.f12182c;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8549o)) {
            return false;
        }
        C8549o oVar = (C8549o) obj;
        if (this.f12180a.equals(oVar.mo42580b())) {
            byte[] bArr2 = this.f12181b;
            if (oVar instanceof C8530d) {
                bArr = ((C8530d) oVar).f12181b;
            } else {
                bArr = oVar.mo42581c();
            }
            if (Arrays.equals(bArr2, bArr) && this.f12182c.equals(oVar.mo42582d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12180a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12181b)) * 1000003) ^ this.f12182c.hashCode();
    }

    private C8530d(String str, @Nullable byte[] bArr, C8111d dVar) {
        this.f12180a = str;
        this.f12181b = bArr;
        this.f12182c = dVar;
    }
}
