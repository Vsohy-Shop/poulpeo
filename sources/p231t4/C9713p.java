package p231t4;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p286y4.C10686t;

/* renamed from: t4.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9713p {
    /* renamed from: a */
    public static void m20266a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m20267b(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m20268c(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m20269d(@NonNull Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 36 + String.valueOf(str).length());
            sb.append("Must be called on ");
            sb.append(name);
            sb.append(" thread, but got ");
            sb.append(str);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: e */
    public static void m20270e(@NonNull String str) {
        if (!C10686t.m22716a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: f */
    public static String m20271f(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: g */
    public static String m20272g(@Nullable String str, @NonNull Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: h */
    public static void m20273h() {
        m20274i("Must not be called on the main application thread");
    }

    /* renamed from: i */
    public static void m20274i(@NonNull String str) {
        if (C10686t.m22716a()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: j */
    public static <T> T m20275j(@Nullable T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @NonNull
    @EnsuresNonNull({"#1"})
    /* renamed from: k */
    public static <T> T m20276k(@NonNull T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m20277l(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: m */
    public static void m20278m(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public static void m20279n(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
