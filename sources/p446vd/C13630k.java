package p446vd;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.utils.UrlEscapeUtils;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.Request;

/* renamed from: vd.k */
/* compiled from: HTTPRequestsManager */
public class C13630k {
    /* renamed from: a */
    public static String m31136a(String str, Map<String, String> map) {
        return m31137b(str, map, (Map<String, String[]>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31137b(java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4, java.util.Map<java.lang.String, java.lang.String[]> r5) {
        /*
            if (r3 == 0) goto L_0x0077
            java.lang.String r0 = ""
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0077
            java.lang.String r4 = m31140e(r4, r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0015
            return r3
        L_0x0015:
            java.lang.String r5 = "#"
            boolean r0 = r3.contains(r5)
            if (r0 == 0) goto L_0x002c
            java.lang.String[] r0 = r3.split(r5)
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L_0x002c
            r3 = 0
            r3 = r0[r3]
            r1 = 1
            r0 = r0[r1]
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            java.lang.String r1 = "?"
            boolean r2 = r3.contains(r1)
            if (r2 == 0) goto L_0x004a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "&"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            goto L_0x005c
        L_0x004a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
        L_0x005c:
            if (r0 == 0) goto L_0x0076
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0076
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
        L_0x0076:
            return r3
        L_0x0077:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p446vd.C13630k.m31137b(java.lang.String, java.util.Map, java.util.Map):java.lang.String");
    }

    @NonNull
    /* renamed from: c */
    public static String m31138c(@NonNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("utm_source", m31141f());
        hashMap.put("utm_medium", "app");
        return m31136a(str, hashMap);
    }

    /* renamed from: d */
    public static String m31139d(String str) {
        try {
            return UrlEscapeUtils.escape(str);
        } catch (IllegalArgumentException e) {
            C13633n.m31165u(C13630k.class, e);
            return str;
        }
    }

    /* renamed from: e */
    public static String m31140e(Map<String, String> map, Map<String, String[]> map2) {
        boolean z;
        String[] strArr;
        String str;
        StringBuilder sb = new StringBuilder();
        if (map != null && !map.isEmpty()) {
            boolean z2 = false;
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                if (!TextUtils.isEmpty(str2) && (str = (String) next.getValue()) != null) {
                    if (!z2) {
                        z2 = true;
                    } else {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(m31139d(str));
                }
            }
        }
        if (map2 != null && !map2.isEmpty()) {
            if (sb.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            for (Map.Entry next2 : map2.entrySet()) {
                String str3 = (String) next2.getKey();
                if (str3 != null && !str3.equals("") && (strArr = (String[]) next2.getValue()) != null && strArr.length > 0) {
                    if (!z) {
                        z = true;
                    } else {
                        sb.append("&");
                    }
                    sb.append(str3);
                    sb.append("=");
                    boolean z3 = true;
                    for (String str4 : strArr) {
                        if (z3) {
                            z3 = false;
                        } else {
                            sb.append(",");
                        }
                        sb.append(m31139d(str4));
                    }
                }
            }
        }
        return sb.toString();
    }

    @NonNull
    /* renamed from: f */
    private static String m31141f() {
        return "poulpeo_android";
    }

    /* renamed from: g */
    public static void m31142g(Request.Builder builder, Map<String, String> map, Map<String, String[]> map2) {
        if (builder == null) {
            throw new IllegalArgumentException();
        } else if ((map != null && !map.isEmpty()) || (map2 != null && !map2.isEmpty())) {
            FormBody.Builder builder2 = new FormBody.Builder();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getValue();
                    if (str != null) {
                        builder2.addEncoded((String) next.getKey(), UrlEscapeUtils.escape(str));
                    }
                }
            }
            if (map2 != null) {
                for (Map.Entry next2 : map2.entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = (String[]) next2.getValue();
                    if (strArr != null) {
                        boolean z = true;
                        for (String str2 : strArr) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append(",");
                            }
                            sb.append(UrlEscapeUtils.escape(str2));
                        }
                        builder2.addEncoded((String) next2.getKey(), sb.toString());
                    }
                }
            }
            builder.post(builder2.build());
        }
    }
}
