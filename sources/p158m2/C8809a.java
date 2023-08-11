package p158m2;

import android.util.Patterns;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p251v2.C9925a;
import p336ef.C11915r;
import p454wf.C13726d;

/* renamed from: m2.a */
/* compiled from: FeatureExtractor.kt */
public final class C8809a {

    /* renamed from: a */
    private static Map<String, String> f12762a;

    /* renamed from: b */
    private static Map<String, String> f12763b;

    /* renamed from: c */
    private static Map<String, String> f12764c;

    /* renamed from: d */
    private static JSONObject f12765d;

    /* renamed from: e */
    private static boolean f12766e;

    /* renamed from: f */
    public static final C8809a f12767f = new C8809a();

    private C8809a() {
    }

    /* renamed from: a */
    public static final float[] m17830a(JSONObject jSONObject, String str) {
        Class<C8809a> cls = C8809a.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(jSONObject, "viewHierarchy");
            C12775o.m28639i(str, "appName");
            if (!f12766e) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                C8809a aVar = f12767f;
                aVar.m17839j(jSONObject2, jSONArray);
                aVar.m17842m(fArr, aVar.m17838i(jSONObject2));
                JSONObject b = aVar.m17831b(jSONObject2);
                if (b == null) {
                    return null;
                }
                C12775o.m28638h(optString, "screenName");
                String jSONObject3 = jSONObject2.toString();
                C12775o.m28638h(jSONObject3, "viewTree.toString()");
                aVar.m17842m(fArr, aVar.m17837h(b, jSONArray, optString, jSONObject3, lowerCase));
                return fArr;
            } catch (JSONException unused) {
                return fArr;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private final JSONObject m17831b(JSONObject jSONObject) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C12775o.m28638h(jSONObject2, "children.getJSONObject(i)");
                JSONObject b = m17831b(jSONObject2);
                if (b != null) {
                    return b;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
        }
    }

    /* renamed from: c */
    public static final String m17832c(String str, String str2, String str3) {
        Class<C8809a> cls = C8809a.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "buttonText");
            C12775o.m28639i(str2, "activityName");
            C12775o.m28639i(str3, "appName");
            String str4 = str3 + " | " + str2 + ", " + str;
            if (str4 != null) {
                String lowerCase = str4.toLowerCase();
                C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m17833d(File file) {
        Class<C8809a> cls = C8809a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f12765d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f12765d = new JSONObject(new String(bArr, C13726d.f22152b));
                try {
                    f12762a = C12716r0.m28419j(C11915r.m25707a("ENGLISH", "1"), C11915r.m25707a("GERMAN", ExifInterface.GPS_MEASUREMENT_2D), C11915r.m25707a("SPANISH", ExifInterface.GPS_MEASUREMENT_3D), C11915r.m25707a("JAPANESE", "4"));
                    f12763b = C12716r0.m28419j(C11915r.m25707a("VIEW_CONTENT", "0"), C11915r.m25707a("SEARCH", "1"), C11915r.m25707a("ADD_TO_CART", ExifInterface.GPS_MEASUREMENT_2D), C11915r.m25707a("ADD_TO_WISHLIST", ExifInterface.GPS_MEASUREMENT_3D), C11915r.m25707a("INITIATE_CHECKOUT", "4"), C11915r.m25707a("ADD_PAYMENT_INFO", "5"), C11915r.m25707a("PURCHASE", "6"), C11915r.m25707a("LEAD", "7"), C11915r.m25707a("COMPLETE_REGISTRATION", "8"));
                    f12764c = C12716r0.m28419j(C11915r.m25707a("BUTTON_TEXT", "1"), C11915r.m25707a("PAGE_TITLE", ExifInterface.GPS_MEASUREMENT_2D), C11915r.m25707a("RESOLVED_DOCUMENT_LINK", ExifInterface.GPS_MEASUREMENT_3D), C11915r.m25707a("BUTTON_ID", "4"));
                    f12766e = true;
                } catch (Throwable th) {
                    C9925a.m20732b(th, cls);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private final boolean m17834e(JSONObject jSONObject) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            if (((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m17835f() {
        Class<C8809a> cls = C8809a.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            return f12766e;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    private final boolean m17836g(String[] strArr, String[] strArr2) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String J : strArr2) {
                    if (C13755w.m31552J(J, str, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: h */
    private final float[] m17837h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        String str4 = str2;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length = jSONArray.length();
            if (length > 1) {
                f = ((float) length) - 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[3] = f;
            try {
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    C12775o.m28638h(jSONObject2, "siblings.getJSONObject(i)");
                    if (m17834e(jSONObject2)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str5 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            m17843n(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            C12775o.m28638h(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            C12775o.m28638h(sb4, "textSB.toString()");
            if (m17841l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[15] = f2;
            if (m17841l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str5)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr[16] = f3;
            if (m17841l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3)) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr[17] = f4;
            if (C13755w.m31552J(str4, HintConstants.AUTOFILL_HINT_PASSWORD, false, 2, (Object) null)) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr[18] = f5;
            if (m17840k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str4)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr[19] = f6;
            if (m17840k("(?i)(sign in)|login|signIn", str4)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr[20] = f7;
            if (m17840k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str4)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr[21] = f8;
            if (m17841l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr[22] = f9;
            if (m17841l("ENGLISH", "PURCHASE", "PAGE_TITLE", str5)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[24] = f10;
            if (m17840k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr[25] = f11;
            if (m17840k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str5)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr[27] = f12;
            if (m17841l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr[28] = f13;
            if (m17841l("ENGLISH", "LEAD", "PAGE_TITLE", str5)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            fArr[29] = f14;
            return fArr;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: i */
    private final float[] m17838i(JSONObject jSONObject) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            C12775o.m28638h(optString, "node.optString(TEXT_KEY)");
            if (optString != null) {
                String lowerCase = optString.toLowerCase();
                C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                String optString2 = jSONObject.optString("hint");
                C12775o.m28638h(optString2, "node.optString(HINT_KEY)");
                if (optString2 != null) {
                    String lowerCase2 = optString2.toLowerCase();
                    C12775o.m28638h(lowerCase2, "(this as java.lang.String).toLowerCase()");
                    String optString3 = jSONObject.optString("classname");
                    C12775o.m28638h(optString3, "node.optString(CLASS_NAME_KEY)");
                    if (optString3 != null) {
                        String lowerCase3 = optString3.toLowerCase();
                        C12775o.m28638h(lowerCase3, "(this as java.lang.String).toLowerCase()");
                        int optInt = jSONObject.optInt("inputtype", -1);
                        String[] strArr = {lowerCase, lowerCase2};
                        if (m17836g(new String[]{"$", "amount", "price", CloudMethodReturns.RETURN_KEYNAME_TOTAL}, strArr)) {
                            fArr[0] = fArr[0] + 1.0f;
                        }
                        if (m17836g(new String[]{HintConstants.AUTOFILL_HINT_PASSWORD, "pwd"}, strArr)) {
                            fArr[1] = fArr[1] + 1.0f;
                        }
                        if (m17836g(new String[]{"tel", HintConstants.AUTOFILL_HINT_PHONE}, strArr)) {
                            fArr[2] = fArr[2] + 1.0f;
                        }
                        if (m17836g(new String[]{"search"}, strArr)) {
                            fArr[4] = fArr[4] + 1.0f;
                        }
                        if (optInt >= 0) {
                            fArr[5] = fArr[5] + 1.0f;
                        }
                        if (optInt == 3 || optInt == 2) {
                            fArr[6] = fArr[6] + 1.0f;
                        }
                        if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                            fArr[7] = fArr[7] + 1.0f;
                        }
                        if (C13755w.m31552J(lowerCase3, "checkbox", false, 2, (Object) null)) {
                            fArr[8] = fArr[8] + 1.0f;
                        }
                        if (m17836g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                            fArr[10] = fArr[10] + 1.0f;
                        }
                        if (C13755w.m31552J(lowerCase3, "radio", false, 2, (Object) null) && C13755w.m31552J(lowerCase3, "button", false, 2, (Object) null)) {
                            fArr[12] = fArr[12] + 1.0f;
                        }
                        try {
                            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                            int length = optJSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                C12775o.m28638h(jSONObject2, "childViews.getJSONObject(i)");
                                m17842m(fArr, m17838i(jSONObject2));
                            }
                        } catch (JSONException unused) {
                        }
                        return fArr;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: j */
    private final boolean m17839j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                int length3 = optJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    C12775o.m28638h(jSONObject2, "child");
                    if (m17839j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: k */
    private final boolean m17840k(String str, String str2) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b A[Catch:{ all -> 0x0070 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m17841l(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = p251v2.C9925a.m20734d(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONObject r0 = f12765d     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0011
            java.lang.String r2 = "rules"
            kotlin.jvm.internal.C12775o.m28656z(r2)     // Catch:{ all -> 0x0070 }
        L_0x0011:
            java.lang.String r2 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r2 = f12762a     // Catch:{ all -> 0x0070 }
            if (r2 != 0) goto L_0x0022
            java.lang.String r3 = "languageInfo"
            kotlin.jvm.internal.C12775o.m28656z(r3)     // Catch:{ all -> 0x0070 }
        L_0x0022:
            java.lang.Object r5 = r2.get(r5)     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0070 }
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0067
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r0 = f12763b     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x003f
            java.lang.String r2 = "eventInfo"
            kotlin.jvm.internal.C12775o.m28656z(r2)     // Catch:{ all -> 0x0070 }
        L_0x003f:
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0070 }
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0067
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r6 = f12764c     // Catch:{ all -> 0x0070 }
            if (r6 != 0) goto L_0x005c
            java.lang.String r0 = "textTypeInfo"
            kotlin.jvm.internal.C12775o.m28656z(r0)     // Catch:{ all -> 0x0070 }
        L_0x005c:
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = r5.optString(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            if (r5 != 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            boolean r1 = r4.m17840k(r5, r8)     // Catch:{ all -> 0x0070 }
        L_0x006f:
            return r1
        L_0x0070:
            r5 = move-exception
            p251v2.C9925a.m20732b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p158m2.C8809a.m17841l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: m */
    private final void m17842m(float[] fArr, float[] fArr2) {
        if (!C9925a.m20734d(this)) {
            try {
                int length = fArr.length;
                for (int i = 0; i < length; i++) {
                    fArr[i] = fArr[i] + fArr2[i];
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: n */
    private final void m17843n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        boolean z;
        if (!C9925a.m20734d(this)) {
            try {
                String optString = jSONObject.optString("text", "");
                C12775o.m28638h(optString, "view.optString(TEXT_KEY, \"\")");
                if (optString != null) {
                    String lowerCase = optString.toLowerCase();
                    C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                    String optString2 = jSONObject.optString("hint", "");
                    C12775o.m28638h(optString2, "view.optString(HINT_KEY, \"\")");
                    if (optString2 != null) {
                        String lowerCase2 = optString2.toLowerCase();
                        C12775o.m28638h(lowerCase2, "(this as java.lang.String).toLowerCase()");
                        boolean z2 = true;
                        if (lowerCase.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            sb.append(lowerCase);
                            sb.append(" ");
                        }
                        if (lowerCase2.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            sb2.append(lowerCase2);
                            sb2.append(" ");
                        }
                        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                        if (optJSONArray != null) {
                            int length = optJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                try {
                                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                                    C12775o.m28638h(jSONObject2, "currentChildView");
                                    m17843n(jSONObject2, sb, sb2);
                                } catch (JSONException unused) {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
