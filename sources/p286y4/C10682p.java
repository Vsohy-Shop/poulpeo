package p286y4;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: y4.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10682p {

    /* renamed from: a */
    private static final Pattern f16263a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: a */
    public static boolean m22709a(@Nullable String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
