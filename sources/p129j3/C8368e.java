package p129j3;

import androidx.annotation.Nullable;
import p129j3.C8382k;

/* renamed from: j3.e */
/* compiled from: AutoValue_ClientInfo */
final class C8368e extends C8382k {

    /* renamed from: a */
    private final C8382k.C8384b f11850a;

    /* renamed from: b */
    private final C8355a f11851b;

    /* renamed from: j3.e$b */
    /* compiled from: AutoValue_ClientInfo */
    static final class C8370b extends C8382k.C8383a {

        /* renamed from: a */
        private C8382k.C8384b f11852a;

        /* renamed from: b */
        private C8355a f11853b;

        C8370b() {
        }

        /* renamed from: a */
        public C8382k mo42359a() {
            return new C8368e(this.f11852a, this.f11853b);
        }

        /* renamed from: b */
        public C8382k.C8383a mo42360b(@Nullable C8355a aVar) {
            this.f11853b = aVar;
            return this;
        }

        /* renamed from: c */
        public C8382k.C8383a mo42361c(@Nullable C8382k.C8384b bVar) {
            this.f11852a = bVar;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public C8355a mo42354b() {
        return this.f11851b;
    }

    @Nullable
    /* renamed from: c */
    public C8382k.C8384b mo42355c() {
        return this.f11850a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8382k)) {
            return false;
        }
        C8382k kVar = (C8382k) obj;
        C8382k.C8384b bVar = this.f11850a;
        if (bVar != null ? bVar.equals(kVar.mo42355c()) : kVar.mo42355c() == null) {
            C8355a aVar = this.f11851b;
            if (aVar == null) {
                if (kVar.mo42354b() == null) {
                    return true;
                }
            } else if (aVar.equals(kVar.mo42354b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        C8382k.C8384b bVar = this.f11850a;
        int i2 = 0;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C8355a aVar = this.f11851b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f11850a + ", androidClientInfo=" + this.f11851b + "}";
    }

    private C8368e(@Nullable C8382k.C8384b bVar, @Nullable C8355a aVar) {
        this.f11850a = bVar;
        this.f11851b = aVar;
    }
}
