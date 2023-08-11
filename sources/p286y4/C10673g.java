package p286y4;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import p231t4.C9713p;

/* renamed from: y4.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10673g {

    /* renamed from: a */
    private static final String[] f16248a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: a */
    public static boolean m22679a(@NonNull Context context, @NonNull Throwable th) {
        try {
            C9713p.m20275j(context);
            C9713p.m20275j(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
