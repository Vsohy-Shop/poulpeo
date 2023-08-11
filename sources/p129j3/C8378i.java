package p129j3;

import androidx.annotation.Nullable;
import p129j3.C8390o;

/* renamed from: j3.i */
/* compiled from: AutoValue_NetworkConnectionInfo */
final class C8378i extends C8390o {

    /* renamed from: a */
    private final C8390o.C8393c f11883a;

    /* renamed from: b */
    private final C8390o.C8392b f11884b;

    /* renamed from: j3.i$b */
    /* compiled from: AutoValue_NetworkConnectionInfo */
    static final class C8380b extends C8390o.C8391a {

        /* renamed from: a */
        private C8390o.C8393c f11885a;

        /* renamed from: b */
        private C8390o.C8392b f11886b;

        C8380b() {
        }

        /* renamed from: a */
        public C8390o mo42407a() {
            return new C8378i(this.f11885a, this.f11886b);
        }

        /* renamed from: b */
        public C8390o.C8391a mo42408b(@Nullable C8390o.C8392b bVar) {
            this.f11886b = bVar;
            return this;
        }

        /* renamed from: c */
        public C8390o.C8391a mo42409c(@Nullable C8390o.C8393c cVar) {
            this.f11885a = cVar;
            return this;
        }
    }

    @Nullable
    /* renamed from: b */
    public C8390o.C8392b mo42402b() {
        return this.f11884b;
    }

    @Nullable
    /* renamed from: c */
    public C8390o.C8393c mo42403c() {
        return this.f11883a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8390o)) {
            return false;
        }
        C8390o oVar = (C8390o) obj;
        C8390o.C8393c cVar = this.f11883a;
        if (cVar != null ? cVar.equals(oVar.mo42403c()) : oVar.mo42403c() == null) {
            C8390o.C8392b bVar = this.f11884b;
            if (bVar == null) {
                if (oVar.mo42402b() == null) {
                    return true;
                }
            } else if (bVar.equals(oVar.mo42402b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        C8390o.C8393c cVar = this.f11883a;
        int i2 = 0;
        if (cVar == null) {
            i = 0;
        } else {
            i = cVar.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        C8390o.C8392b bVar = this.f11884b;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f11883a + ", mobileSubtype=" + this.f11884b + "}";
    }

    private C8378i(@Nullable C8390o.C8393c cVar, @Nullable C8390o.C8392b bVar) {
        this.f11883a = cVar;
        this.f11884b = bVar;
    }
}
