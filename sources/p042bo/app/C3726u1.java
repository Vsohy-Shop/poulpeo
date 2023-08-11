package p042bo.app;

import java.util.concurrent.TimeUnit;

/* renamed from: bo.app.u1 */
public final class C3726u1 {

    /* renamed from: a */
    public static final C3726u1 f2652a = new C3726u1();

    /* renamed from: b */
    private static final int f2653b = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: c */
    private static C3315k2 f2654c;

    private C3726u1() {
    }

    /* renamed from: a */
    public static final C3315k2 m3972a() {
        C3315k2 k2Var = f2654c;
        if (k2Var == null) {
            return new C3430m3(new C3695t1(f2653b));
        }
        return k2Var;
    }
}
