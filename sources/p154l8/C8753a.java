package p154l8;

import androidx.annotation.Nullable;
import p154l8.C8760d;

/* renamed from: l8.a */
/* compiled from: AutoValue_InstallationResponse */
final class C8753a extends C8760d {

    /* renamed from: a */
    private final String f12597a;

    /* renamed from: b */
    private final String f12598b;

    /* renamed from: c */
    private final String f12599c;

    /* renamed from: d */
    private final C8764f f12600d;

    /* renamed from: e */
    private final C8760d.C8762b f12601e;

    /* renamed from: l8.a$b */
    /* compiled from: AutoValue_InstallationResponse */
    static final class C8755b extends C8760d.C8761a {

        /* renamed from: a */
        private String f12602a;

        /* renamed from: b */
        private String f12603b;

        /* renamed from: c */
        private String f12604c;

        /* renamed from: d */
        private C8764f f12605d;

        /* renamed from: e */
        private C8760d.C8762b f12606e;

        C8755b() {
        }

        /* renamed from: a */
        public C8760d mo42902a() {
            return new C8753a(this.f12602a, this.f12603b, this.f12604c, this.f12605d, this.f12606e);
        }

        /* renamed from: b */
        public C8760d.C8761a mo42903b(C8764f fVar) {
            this.f12605d = fVar;
            return this;
        }

        /* renamed from: c */
        public C8760d.C8761a mo42904c(String str) {
            this.f12603b = str;
            return this;
        }

        /* renamed from: d */
        public C8760d.C8761a mo42905d(String str) {
            this.f12604c = str;
            return this;
        }

        /* renamed from: e */
        public C8760d.C8761a mo42906e(C8760d.C8762b bVar) {
            this.f12606e = bVar;
            return this;
        }

        /* renamed from: f */
        public C8760d.C8761a mo42907f(String str) {
            this.f12602a = str;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public C8764f mo42894b() {
        return this.f12600d;
    }

    @Nullable
    /* renamed from: c */
    public String mo42895c() {
        return this.f12598b;
    }

    @Nullable
    /* renamed from: d */
    public String mo42896d() {
        return this.f12599c;
    }

    @Nullable
    /* renamed from: e */
    public C8760d.C8762b mo42897e() {
        return this.f12601e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8760d)) {
            return false;
        }
        C8760d dVar = (C8760d) obj;
        String str = this.f12597a;
        if (str != null ? str.equals(dVar.mo42899f()) : dVar.mo42899f() == null) {
            String str2 = this.f12598b;
            if (str2 != null ? str2.equals(dVar.mo42895c()) : dVar.mo42895c() == null) {
                String str3 = this.f12599c;
                if (str3 != null ? str3.equals(dVar.mo42896d()) : dVar.mo42896d() == null) {
                    C8764f fVar = this.f12600d;
                    if (fVar != null ? fVar.equals(dVar.mo42894b()) : dVar.mo42894b() == null) {
                        C8760d.C8762b bVar = this.f12601e;
                        if (bVar == null) {
                            if (dVar.mo42897e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.mo42897e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public String mo42899f() {
        return this.f12597a;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f12597a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        String str2 = this.f12598b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f12599c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        C8764f fVar = this.f12600d;
        if (fVar == null) {
            i4 = 0;
        } else {
            i4 = fVar.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        C8760d.C8762b bVar = this.f12601e;
        if (bVar != null) {
            i5 = bVar.hashCode();
        }
        return i9 ^ i5;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f12597a + ", fid=" + this.f12598b + ", refreshToken=" + this.f12599c + ", authToken=" + this.f12600d + ", responseCode=" + this.f12601e + "}";
    }

    private C8753a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable C8764f fVar, @Nullable C8760d.C8762b bVar) {
        this.f12597a = str;
        this.f12598b = str2;
        this.f12599c = str3;
        this.f12600d = fVar;
        this.f12601e = bVar;
    }
}
