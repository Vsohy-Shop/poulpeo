package p294z1;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* renamed from: z1.j */
/* compiled from: Preconditions */
public final class C10791j {
    /* renamed from: a */
    public static void m22945a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    /* renamed from: b */
    public static String m22946b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m22947c(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @NonNull
    /* renamed from: d */
    public static <T> T m22948d(@Nullable T t) {
        return m22949e(t, "Argument must not be null");
    }

    @NonNull
    /* renamed from: e */
    public static <T> T m22949e(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
