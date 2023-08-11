package com.google.android.gms.internal.gtm;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.gtm.f5 */
class C5337f5 {

    /* renamed from: a */
    private static volatile ExecutorService f5988a;

    private C5337f5() {
    }

    /* renamed from: a */
    public static ExecutorService m7930a(Context context) {
        if (f5988a == null) {
            synchronized (C5337f5.class) {
                if (f5988a == null) {
                    f5988a = new C5579v2(context, 1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C5352g5());
                }
            }
        }
        return f5988a;
    }
}
