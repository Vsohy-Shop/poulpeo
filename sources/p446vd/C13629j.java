package p446vd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: vd.j */
/* compiled from: FormatUtils */
public class C13629j {

    /* renamed from: a */
    private static Map<String, SimpleDateFormat> f21946a = new HashMap();

    /* renamed from: b */
    private static Locale f21947b = Locale.FRANCE;

    /* renamed from: a */
    public static SimpleDateFormat m31131a(String str) {
        SimpleDateFormat simpleDateFormat = f21946a.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, m31133c());
        f21946a.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }

    @Nullable
    /* renamed from: b */
    public static String m31132b(@NonNull String str, @NonNull String str2) {
        String[] e = m31135e(str, str2);
        if (e == null || e.length <= 0 || !Pattern.compile(str).matcher(str2).matches()) {
            return null;
        }
        return e[0];
    }

    /* renamed from: c */
    public static Locale m31133c() {
        return f21947b;
    }

    /* renamed from: d */
    public static NumberFormat m31134d() {
        NumberFormat instance = NumberFormat.getInstance(m31133c());
        instance.setMaximumFractionDigits(2);
        instance.setMinimumIntegerDigits(1);
        return instance;
    }

    @Nullable
    /* renamed from: e */
    public static String[] m31135e(@NonNull String str, @NonNull String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (!matcher.matches()) {
            return null;
        }
        int groupCount = matcher.groupCount();
        String[] strArr = new String[groupCount];
        int i = 0;
        while (i < groupCount) {
            int i2 = i + 1;
            strArr[i] = matcher.group(i2);
            i = i2;
        }
        return strArr;
    }
}
