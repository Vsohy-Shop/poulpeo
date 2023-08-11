package p121i5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: i5.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C8184e {

    /* renamed from: a */
    public static final int f11507a;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L_0x0029;
     */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 < r1) goto L_0x0009
            goto L_0x0029
        L_0x0009:
            r1 = 30
            r3 = 0
            if (r0 < r1) goto L_0x0028
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r1 = r0.length()
            r4 = 1
            if (r1 != r4) goto L_0x0028
            char r1 = r0.charAt(r3)
            r4 = 83
            if (r1 < r4) goto L_0x0028
            char r0 = r0.charAt(r3)
            r1 = 90
            if (r0 > r1) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            f11507a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p121i5.C8184e.<clinit>():void");
    }

    /* renamed from: a */
    public static PendingIntent m16197a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, i, intent, i2);
    }
}
