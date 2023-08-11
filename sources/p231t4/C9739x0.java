package p231t4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import p023a5.C2207e;

/* renamed from: t4.x0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9739x0 {

    /* renamed from: a */
    private static final Object f14547a = new Object();

    /* renamed from: b */
    private static boolean f14548b;
    @Nullable

    /* renamed from: c */
    private static String f14549c;

    /* renamed from: d */
    private static int f14550d;

    /* renamed from: a */
    public static int m20333a(Context context) {
        m20334b(context);
        return f14550d;
    }

    /* renamed from: b */
    private static void m20334b(Context context) {
        synchronized (f14547a) {
            if (!f14548b) {
                f14548b = true;
                try {
                    Bundle bundle = C2207e.m1805a(context).mo23528c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f14549c = bundle.getString("com.google.app.id");
                        f14550d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
