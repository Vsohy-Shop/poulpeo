package p201q5;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: q5.m */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C9266m {
    /* renamed from: a */
    public static <T> T m19027a(@NonNull Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }

    /* renamed from: b */
    public static void m19028b(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
