package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.x */
/* compiled from: PackageReference.kt */
public final class C12785x implements C12756e {

    /* renamed from: b */
    private final Class<?> f20425b;

    /* renamed from: c */
    private final String f20426c;

    public C12785x(Class<?> cls, String str) {
        C12775o.m28639i(cls, "jClass");
        C12775o.m28639i(str, "moduleName");
        this.f20425b = cls;
        this.f20426c = str;
    }

    /* renamed from: b */
    public Class<?> mo50649b() {
        return this.f20425b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12785x) || !C12775o.m28634d(mo50649b(), ((C12785x) obj).mo50649b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return mo50649b().hashCode();
    }

    public String toString() {
        return mo50649b().toString() + " (Kotlin reflection is not available)";
    }
}
