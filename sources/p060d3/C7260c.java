package p060d3;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.C4576p;
import com.facebook.FacebookException;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p060d3.C7258b;
import p072e3.C7465f;
import p072e3.C7471i;
import p198q2.C9138d0;
import p251v2.C9925a;

/* renamed from: d3.c */
/* compiled from: ShareInternalUtility */
public final class C7260c {

    /* renamed from: d3.c$a */
    /* compiled from: ShareInternalUtility */
    static class C7261a implements C7258b.C7259a {
        C7261a() {
        }

        /* renamed from: a */
        public JSONObject mo40830a(C7471i iVar) {
            Uri a = iVar.mo41179a();
            if (C9138d0.m18620V(a)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.toString());
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", e);
                }
            } else {
                throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
            }
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m14085a(String str) {
        String str2;
        int i;
        Class<C7260c> cls = C7260c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
                str2 = null;
            } else {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
            }
            return new Pair<>(str2, str);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static C4555l m14086b(C4509a aVar, Uri uri, C4555l.C4557b bVar) {
        Class<C7260c> cls = C7260c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            if (C9138d0.m18617S(uri)) {
                return m14087c(aVar, new File(uri.getPath()), bVar);
            }
            if (C9138d0.m18614P(uri)) {
                C4555l.C4562f fVar = new C4555l.C4562f(uri, "image/png");
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("file", fVar);
                return new C4555l(aVar, "me/staging_resources", bundle, C4576p.f4293c, bVar);
            }
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static C4555l m14087c(C4509a aVar, File file, C4555l.C4557b bVar) {
        Class<C7260c> cls = C7260c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C4555l.C4562f fVar = new C4555l.C4562f(ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", fVar);
            return new C4555l(aVar, "me/staging_resources", bundle, C4576p.f4293c, bVar);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static JSONArray m14088d(JSONArray jSONArray, boolean z) {
        Class<C7260c> cls = C7260c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = m14088d((JSONArray) obj, z);
                } else if (obj instanceof JSONObject) {
                    obj = m14089e((JSONObject) obj, z);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        throw new com.facebook.FacebookException("Failed to create json object from share content");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        p251v2.C9925a.m20732b(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0091 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m14089e(org.json.JSONObject r11, boolean r12) {
        /*
            java.lang.Class<d3.c> r0 = p060d3.C7260c.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            if (r11 != 0) goto L_0x000d
            return r2
        L_0x000d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r1.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r3.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r4 = r11.names()     // Catch:{ JSONException -> 0x0091 }
            r5 = 0
        L_0x001c:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x0091 }
            if (r5 >= r6) goto L_0x0083
            java.lang.String r6 = r4.getString(r5)     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r7 = r11.get(r6)     // Catch:{ JSONException -> 0x0091 }
            boolean r8 = r7 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0091 }
            r9 = 1
            if (r8 == 0) goto L_0x0036
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONObject r7 = m14089e(r7, r9)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0040
        L_0x0036:
            boolean r8 = r7 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x0091 }
            if (r8 == 0) goto L_0x0040
            org.json.JSONArray r7 = (org.json.JSONArray) r7     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r7 = m14088d(r7, r9)     // Catch:{ JSONException -> 0x0091 }
        L_0x0040:
            android.util.Pair r8 = m14085a(r6)     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r9 = r8.first     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x0091 }
            java.lang.Object r8 = r8.second     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x0091 }
            if (r12 == 0) goto L_0x006f
            if (r9 == 0) goto L_0x005c
            java.lang.String r10 = "fbsdk"
            boolean r10 = r9.equals(r10)     // Catch:{ JSONException -> 0x0091 }
            if (r10 == 0) goto L_0x005c
            r1.put(r6, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x005c:
            if (r9 == 0) goto L_0x006b
            java.lang.String r6 = "og"
            boolean r6 = r9.equals(r6)     // Catch:{ JSONException -> 0x0091 }
            if (r6 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            r3.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x006b:
            r1.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x006f:
            if (r9 == 0) goto L_0x007d
            java.lang.String r10 = "fb"
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0091 }
            if (r9 == 0) goto L_0x007d
            r1.put(r6, r7)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0080
        L_0x007d:
            r1.put(r8, r7)     // Catch:{ JSONException -> 0x0091 }
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x001c
        L_0x0083:
            int r11 = r3.length()     // Catch:{ JSONException -> 0x0091 }
            if (r11 <= 0) goto L_0x008e
            java.lang.String r11 = "data"
            r1.put(r11, r3)     // Catch:{ JSONException -> 0x0091 }
        L_0x008e:
            return r1
        L_0x008f:
            r11 = move-exception
            goto L_0x0099
        L_0x0091:
            com.facebook.FacebookException r11 = new com.facebook.FacebookException     // Catch:{ all -> 0x008f }
            java.lang.String r12 = "Failed to create json object from share content"
            r11.<init>((java.lang.String) r12)     // Catch:{ all -> 0x008f }
            throw r11     // Catch:{ all -> 0x008f }
        L_0x0099:
            p251v2.C9925a.m20732b(r11, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060d3.C7260c.m14089e(org.json.JSONObject, boolean):org.json.JSONObject");
    }

    /* renamed from: f */
    public static JSONObject m14090f(C7465f fVar) {
        Class<C7260c> cls = C7260c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return C7258b.m14081b(fVar.mo41162d(), new C7261a());
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
