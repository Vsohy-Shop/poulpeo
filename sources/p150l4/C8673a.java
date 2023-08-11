package p150l4;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l4.a */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8673a {

    /* renamed from: a */
    private static final Pattern f12404a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: b */
    private static final Random f12405b = new Random(SystemClock.elapsedRealtime());

    @Nullable
    /* renamed from: a */
    public static JSONObject m17442a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static double m17443b(long j) {
        return ((double) j) / 1000.0d;
    }

    @Nullable
    /* renamed from: c */
    public static String m17444c(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* renamed from: d */
    public static long m17445d(double d) {
        return (long) (d * 1000.0d);
    }

    /* renamed from: e */
    public static long m17446e(long j) {
        return j * 1000;
    }

    /* renamed from: f */
    public static void m17447f(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        } else if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* renamed from: g */
    public static int m17448g(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: h */
    public static long m17449h() {
        return f12405b.nextLong();
    }

    @NonNull
    /* renamed from: i */
    public static String m17450i(@NonNull String str) {
        return "urn:x-cast:".concat(str);
    }

    @NonNull
    /* renamed from: j */
    public static String m17451j(@NonNull Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: k */
    public static String m17452k(@NonNull String str) {
        if (f12404a.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                sb.append(String.format("%%%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: l */
    public static List m17453l(@NonNull int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: m */
    public static JSONObject m17454m(@Nullable JSONObject jSONObject, @NonNull String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: n */
    public static boolean m17455n(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: o */
    public static int[] m17456o(@NonNull Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    @Nullable
    /* renamed from: p */
    public static long[] m17457p(@Nullable JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        long[] jArr = new long[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            jArr[i] = jSONArray.getLong(i);
        }
        return jArr;
    }
}
