package p460xf;

import java.text.DecimalFormat;

/* renamed from: xf.b */
/* compiled from: DurationJvm.kt */
public final class C13848b {

    /* renamed from: a */
    private static final boolean f22359a = false;

    /* renamed from: b */
    private static final ThreadLocal<DecimalFormat>[] f22360b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f22360b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m31828a() {
        return f22359a;
    }
}
