package p151l5;

import java.lang.annotation.Annotation;

/* renamed from: l5.n */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C8731n implements C8736s {

    /* renamed from: a */
    private final int f12561a;

    /* renamed from: b */
    private final C8735r f12562b;

    C8731n(int i, C8735r rVar) {
        this.f12561a = i;
        this.f12562b = rVar;
    }

    public final Class<? extends Annotation> annotationType() {
        return C8736s.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8736s)) {
            return false;
        }
        C8736s sVar = (C8736s) obj;
        if (this.f12561a != sVar.zza() || !this.f12562b.equals(sVar.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f12561a ^ 14552422) + (this.f12562b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f12561a + "intEncoding=" + this.f12562b + ')';
    }

    public final int zza() {
        return this.f12561a;
    }

    public final C8735r zzb() {
        return this.f12562b;
    }
}
