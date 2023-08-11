package p205r;

import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p259w.C10063c;

/* renamed from: r.p */
/* compiled from: Tags.kt */
public final class C9353p {

    /* renamed from: b */
    public static final C9354a f13906b = new C9354a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final C9353p f13907c = new C9353p(C12716r0.m28416g());

    /* renamed from: a */
    private final Map<Class<?>, Object> f13908a;

    /* renamed from: r.p$a */
    /* compiled from: Tags.kt */
    public static final class C9354a {
        private C9354a() {
        }

        public /* synthetic */ C9354a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9353p mo43777a(Map<Class<?>, ? extends Object> map) {
            return new C9353p(C10063c.m21127b(map), (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C9353p(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: a */
    public final Map<Class<?>, Object> mo43773a() {
        return this.f13908a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9353p) || !C12775o.m28634d(this.f13908a, ((C9353p) obj).f13908a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f13908a.hashCode();
    }

    public String toString() {
        return "Tags(tags=" + this.f13908a + ')';
    }

    private C9353p(Map<Class<?>, ? extends Object> map) {
        this.f13908a = map;
    }
}
