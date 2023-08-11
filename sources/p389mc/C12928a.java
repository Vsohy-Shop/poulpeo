package p389mc;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.io.File;

/* renamed from: mc.a */
/* compiled from: CommonUtils */
public class C12928a {

    /* renamed from: a */
    private static final char[] f20699a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f20700b = -1;

    /* renamed from: a */
    public static boolean m29176a(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (str.contains("goldfish") || str.contains("ranchu") || string == null) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m29177b(Context context) {
        boolean a = m29176a(context);
        String str = Build.TAGS;
        if ((!a && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (a || !file.exists()) {
            return false;
        }
        return true;
    }
}
