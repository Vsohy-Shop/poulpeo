package p466yf;

import p331dg.C11828g0;

/* renamed from: yf.g2 */
/* compiled from: JobSupport.kt */
public final class C13969g2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11828g0 f22895a = new C11828g0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C11828g0 f22896b = new C11828g0("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C11828g0 f22897c = new C11828g0("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C11828g0 f22898d = new C11828g0("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C11828g0 f22899e = new C11828g0("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C13968g1 f22900f = new C13968g1(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C13968g1 f22901g = new C13968g1(true);

    /* renamed from: g */
    public static final Object m32370g(Object obj) {
        if (obj instanceof C14028s1) {
            return new C14032t1((C14028s1) obj);
        }
        return obj;
    }

    /* renamed from: h */
    public static final Object m32371h(Object obj) {
        C14032t1 t1Var;
        C14028s1 s1Var;
        if (obj instanceof C14032t1) {
            t1Var = (C14032t1) obj;
        } else {
            t1Var = null;
        }
        if (t1Var == null || (s1Var = t1Var.f22953a) == null) {
            return obj;
        }
        return s1Var;
    }
}
