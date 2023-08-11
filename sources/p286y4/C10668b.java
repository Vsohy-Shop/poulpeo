package p286y4;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.Arrays;
import p231t4.C9705n;

/* renamed from: y4.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10668b {
    @NonNull
    /* renamed from: a */
    public static <T> T[] m22666a(@NonNull T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            int length3 = tArr2.length;
            System.arraycopy(tArr2, 0, copyOf, length2, length3);
            length2 += length3;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static boolean m22667b(@NonNull int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static <T> boolean m22668c(@NonNull T[] tArr, @NonNull T t) {
        int i;
        if (tArr != null) {
            i = tArr.length;
        } else {
            i = 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (!C9705n.m20259b(tArr[i2], t)) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
    }
}
