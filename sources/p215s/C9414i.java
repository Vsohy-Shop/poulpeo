package p215s;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p215s.C9406c;

/* renamed from: s.i */
/* compiled from: Size.kt */
public final class C9414i {

    /* renamed from: c */
    public static final C9415a f13994c = new C9415a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final C9414i f13995d;

    /* renamed from: a */
    private final C9406c f13996a;

    /* renamed from: b */
    private final C9406c f13997b;

    /* renamed from: s.i$a */
    /* compiled from: Size.kt */
    public static final class C9415a {
        private C9415a() {
        }

        public /* synthetic */ C9415a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C9406c.C9408b bVar = C9406c.C9408b.f13982a;
        f13995d = new C9414i(bVar, bVar);
    }

    public C9414i(C9406c cVar, C9406c cVar2) {
        this.f13996a = cVar;
        this.f13997b = cVar2;
    }

    /* renamed from: a */
    public final C9406c mo43834a() {
        return this.f13997b;
    }

    /* renamed from: b */
    public final C9406c mo43835b() {
        return this.f13996a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9414i)) {
            return false;
        }
        C9414i iVar = (C9414i) obj;
        if (C12775o.m28634d(this.f13996a, iVar.f13996a) && C12775o.m28634d(this.f13997b, iVar.f13997b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f13996a.hashCode() * 31) + this.f13997b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f13996a + ", height=" + this.f13997b + ')';
    }
}
