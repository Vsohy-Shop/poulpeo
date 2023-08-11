package p296z3;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p296z3.C10810n;

/* renamed from: z3.n */
public abstract class C10810n<T extends C10810n> {
    /* renamed from: a */
    public static String m23055a(Object obj) {
        return m23056b(obj, 0);
    }

    /* renamed from: b */
    private static String m23056b(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object next : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(m23056b(next, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String b = m23056b(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(b)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(b);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }

    /* renamed from: c */
    public static String m23057c(Map map) {
        return m23056b(map, 1);
    }

    /* renamed from: d */
    public abstract void mo33104d(T t);
}
