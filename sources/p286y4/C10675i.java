package p286y4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C4785c;

/* renamed from: y4.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10675i {
    @Nullable

    /* renamed from: a */
    private static Boolean f16250a;
    @Nullable

    /* renamed from: b */
    private static Boolean f16251b;
    @Nullable

    /* renamed from: c */
    private static Boolean f16252c;
    @Nullable

    /* renamed from: d */
    private static Boolean f16253d;

    /* renamed from: a */
    public static boolean m22683a(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f16253d == null) {
            boolean z = false;
            if (C10680n.m22704h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f16253d = Boolean.valueOf(z);
        }
        return f16253d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m22684b() {
        int i = C4785c.f5063a;
        return "user".equals(Build.TYPE);
    }

    /* renamed from: c */
    public static boolean m22685c(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f16250a == null) {
            boolean z = false;
            if (C10680n.m22701e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f16250a = Boolean.valueOf(z);
        }
        return f16250a.booleanValue();
    }

    /* renamed from: d */
    public static boolean m22686d(@NonNull Context context) {
        if (!m22685c(context)) {
            return false;
        }
        if (!C10680n.m22703g()) {
            return true;
        }
        if (!m22687e(context) || C10680n.m22704h()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m22687e(@NonNull Context context) {
        if (f16251b == null) {
            boolean z = false;
            if (C10680n.m22702f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f16251b = Boolean.valueOf(z);
        }
        return f16251b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m22688f(@NonNull Context context) {
        if (f16252c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f16252c = Boolean.valueOf(z);
        }
        return f16252c.booleanValue();
    }
}
