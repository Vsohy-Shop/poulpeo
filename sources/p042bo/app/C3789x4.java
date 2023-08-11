package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.x4 */
public final class C3789x4 implements C3584q2 {

    /* renamed from: a */
    private final C3042c2 f2764a;

    /* renamed from: b */
    private final int f2765b;

    /* renamed from: c */
    private final String f2766c;

    /* renamed from: d */
    private final String f2767d;

    public C3789x4(C3042c2 c2Var, int i, String str, String str2) {
        C12775o.m28639i(c2Var, "originalRequest");
        this.f2764a = c2Var;
        this.f2765b = i;
        this.f2766c = str;
        this.f2767d = str2;
    }

    /* renamed from: a */
    public String mo28922a() {
        return this.f2767d;
    }

    /* renamed from: b */
    public C3042c2 mo29792b() {
        return this.f2764a;
    }

    /* renamed from: c */
    public int mo29793c() {
        return this.f2765b;
    }

    /* renamed from: d */
    public String mo29794d() {
        return this.f2766c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3789x4)) {
            return false;
        }
        C3789x4 x4Var = (C3789x4) obj;
        if (C12775o.m28634d(mo29792b(), x4Var.mo29792b()) && mo29793c() == x4Var.mo29793c() && C12775o.m28634d(mo29794d(), x4Var.mo29794d()) && C12775o.m28634d(mo28922a(), x4Var.mo28922a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((mo29792b().hashCode() * 31) + Integer.hashCode(mo29793c())) * 31;
        int i2 = 0;
        if (mo29794d() == null) {
            i = 0;
        } else {
            i = mo29794d().hashCode();
        }
        int i3 = (hashCode + i) * 31;
        if (mo28922a() != null) {
            i2 = mo28922a().hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "{code = " + mo29793c() + ", reason = " + mo29794d() + ", message = " + mo28922a() + '}';
    }
}
