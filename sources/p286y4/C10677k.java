package p286y4;

import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p141k5.C8573k;
import p141k5.C8580r;

/* renamed from: y4.k */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10677k {

    /* renamed from: a */
    private static final Pattern f16256a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f16257b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f16258c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    @NonNull
    /* renamed from: a */
    public static Map<String, String> m22691a(@NonNull URI uri, @NonNull String str) {
        String str2;
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            C8580r c = C8580r.m17220c(C8573k.m17209b('='));
            for (String f : C8580r.m17220c(C8573k.m17209b('&')).mo42643b().mo42644d(rawQuery)) {
                List<String> f2 = c.mo42645f(f);
                if (f2.isEmpty() || f2.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String b = m22692b(f2.get(0), str);
                if (f2.size() == 2) {
                    str2 = m22692b(f2.get(1), str);
                } else {
                    str2 = null;
                }
                emptyMap.put(b, str2);
            }
        }
        return emptyMap;
    }

    /* renamed from: b */
    private static String m22692b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
