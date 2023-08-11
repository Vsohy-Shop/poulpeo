package p119i3;

import androidx.annotation.Nullable;

/* renamed from: i3.a */
/* compiled from: AutoValue_Event */
final class C8108a<T> extends C8110c<T> {

    /* renamed from: a */
    private final Integer f11411a;

    /* renamed from: b */
    private final T f11412b;

    /* renamed from: c */
    private final C8111d f11413c;

    C8108a(@Nullable Integer num, T t, C8111d dVar) {
        this.f11411a = num;
        if (t != null) {
            this.f11412b = t;
            if (dVar != null) {
                this.f11413c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Nullable
    /* renamed from: a */
    public Integer mo41957a() {
        return this.f11411a;
    }

    /* renamed from: b */
    public T mo41958b() {
        return this.f11412b;
    }

    /* renamed from: c */
    public C8111d mo41959c() {
        return this.f11413c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8110c)) {
            return false;
        }
        C8110c cVar = (C8110c) obj;
        Integer num = this.f11411a;
        if (num != null ? num.equals(cVar.mo41957a()) : cVar.mo41957a() == null) {
            if (this.f11412b.equals(cVar.mo41958b()) && this.f11413c.equals(cVar.mo41959c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        Integer num = this.f11411a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f11412b.hashCode()) * 1000003) ^ this.f11413c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f11411a + ", payload=" + this.f11412b + ", priority=" + this.f11413c + "}";
    }
}
