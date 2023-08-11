package p294z1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: z1.i */
/* compiled from: MultiClassKey */
public class C10790i {

    /* renamed from: a */
    private Class<?> f16507a;

    /* renamed from: b */
    private Class<?> f16508b;

    /* renamed from: c */
    private Class<?> f16509c;

    public C10790i() {
    }

    /* renamed from: a */
    public void mo45709a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f16507a = cls;
        this.f16508b = cls2;
        this.f16509c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10790i iVar = (C10790i) obj;
        if (this.f16507a.equals(iVar.f16507a) && this.f16508b.equals(iVar.f16508b) && C10792k.m22952c(this.f16509c, iVar.f16509c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f16507a.hashCode() * 31) + this.f16508b.hashCode()) * 31;
        Class<?> cls = this.f16509c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f16507a + ", second=" + this.f16508b + '}';
    }

    public C10790i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        mo45709a(cls, cls2, cls3);
    }
}
