package androidx.core.util;

import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

/* compiled from: Half.kt */
public final class HalfKt {
    @RequiresApi(26)
    public static final Half toHalf(short s) {
        Half a = Half.valueOf(s);
        C12775o.m28638h(a, "valueOf(this)");
        return a;
    }

    @RequiresApi(26)
    public static final Half toHalf(float f) {
        Half a = Half.valueOf(f);
        C12775o.m28638h(a, "valueOf(this)");
        return a;
    }

    @RequiresApi(26)
    public static final Half toHalf(String str) {
        C12775o.m28639i(str, "<this>");
        Half a = Half.valueOf(str);
        C12775o.m28638h(a, "valueOf(this)");
        return a;
    }

    @RequiresApi(26)
    public static final Half toHalf(double d) {
        Half a = Half.valueOf((float) d);
        C12775o.m28638h(a, "valueOf(this)");
        return a;
    }
}
