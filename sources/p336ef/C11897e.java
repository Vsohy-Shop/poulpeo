package p336ef;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p436tf.C13528f;

/* renamed from: ef.e */
/* compiled from: KotlinVersion.kt */
public final class C11897e implements Comparable<C11897e> {

    /* renamed from: f */
    public static final C11898a f18586f = new C11898a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final C11897e f18587g = C11899f.m25686a();

    /* renamed from: b */
    private final int f18588b;

    /* renamed from: c */
    private final int f18589c;

    /* renamed from: d */
    private final int f18590d;

    /* renamed from: e */
    private final int f18591e;

    /* renamed from: ef.e$a */
    /* compiled from: KotlinVersion.kt */
    public static final class C11898a {
        private C11898a() {
        }

        public /* synthetic */ C11898a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11897e(int i, int i2, int i3) {
        this.f18588b = i;
        this.f18589c = i2;
        this.f18590d = i3;
        this.f18591e = m25684b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m25684b(int i, int i2, int i3) {
        boolean z = false;
        if (new C13528f(0, 255).mo53154t(i) && new C13528f(0, 255).mo53154t(i2) && new C13528f(0, 255).mo53154t(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: a */
    public int compareTo(C11897e eVar) {
        C12775o.m28639i(eVar, "other");
        return this.f18591e - eVar.f18591e;
    }

    public boolean equals(Object obj) {
        C11897e eVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11897e) {
            eVar = (C11897e) obj;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return false;
        }
        if (this.f18591e == eVar.f18591e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f18591e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18588b);
        sb.append('.');
        sb.append(this.f18589c);
        sb.append('.');
        sb.append(this.f18590d);
        return sb.toString();
    }
}
