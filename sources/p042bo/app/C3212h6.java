package p042bo.app;

import android.util.Base64;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8300j;

/* renamed from: bo.app.h6 */
public abstract class C3212h6 implements C3766w2 {

    /* renamed from: d */
    private static final String f1812d = C8266c.m16405n(C3212h6.class);

    /* renamed from: a */
    private final long f1813a;

    /* renamed from: b */
    private final long f1814b;

    /* renamed from: c */
    private C3785x1 f1815c;

    protected C3212h6() {
        long h = C8273e.m16435h();
        this.f1814b = h;
        this.f1813a = h / 1000;
    }

    /* renamed from: a */
    public C3785x1 mo29015a() {
        return this.f1815c;
    }

    /* renamed from: b */
    public long mo29017b() {
        return this.f1813a;
    }

    /* renamed from: e */
    public long mo29018e() {
        return this.f1814b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo29016a(String str) {
        if (C8300j.m16493g(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split("_")[0];
        } catch (Exception e) {
            String str2 = f1812d;
            C8266c.m16404m(str2, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }

    protected C3212h6(C3785x1 x1Var) {
        this();
        this.f1815c = x1Var;
    }
}
