package p160m4;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p150l4.C8675b;
import p220s4.C9493a;

/* renamed from: m4.b */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8823b {

    /* renamed from: a */
    private static final C8675b f12797a = new C8675b("MetadataUtils");

    /* renamed from: b */
    private static final String[] f12798b;

    /* renamed from: c */
    private static final String f12799c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f12798b = strArr;
        f12799c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    @Nullable
    /* renamed from: a */
    public static Calendar m17882a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f12797a.mo42754a("Input string is empty or null", new Object[0]);
            return null;
        }
        String d = m17885d(str);
        if (TextUtils.isEmpty(d)) {
            f12797a.mo42754a("Invalid date format", new Object[0]);
            return null;
        }
        String e = m17886e(str);
        if (!TextUtils.isEmpty(e)) {
            d = d + ExifInterface.GPS_DIRECTION_TRUE + e;
            if (e.length() == 6) {
                str2 = "yyyyMMdd'T'HHmmss";
            } else {
                str2 = f12799c;
            }
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(d));
            return instance;
        } catch (ParseException e2) {
            f12797a.mo42757d(e2, "Error parsing string", new Object[0]);
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public static JSONArray m17883b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C9493a) it.next()).mo43940H());
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static void m17884c(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new C9493a(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    @Nullable
    /* renamed from: d */
    private static String m17885d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.substring(0, 8);
            } catch (IndexOutOfBoundsException e) {
                f12797a.mo42757d(e, "Error extracting the date", new Object[0]);
                return null;
            }
        } else {
            f12797a.mo42754a("Input string is empty or null", new Object[0]);
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private static String m17886e(String str) {
        if (TextUtils.isEmpty(str)) {
            f12797a.mo42754a("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            f12797a.mo42754a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt == '+' || charAt == '-') {
                int length = substring.length();
                String[] strArr = f12798b;
                if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            } else if (charAt == 'Z' && substring.length() == f12798b[0].length() + 6) {
                return String.valueOf(substring.substring(0, substring.length() - 1)).concat("+0000");
            } else {
                return null;
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            f12797a.mo42757d(e, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }
}
