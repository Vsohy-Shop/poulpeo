package p109h4;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p150l4.C8673a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10679m;

/* renamed from: h4.j */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7943j extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7943j> CREATOR = new C7977z0();

    /* renamed from: b */
    private float f11132b;

    /* renamed from: c */
    private int f11133c;

    /* renamed from: d */
    private int f11134d;

    /* renamed from: e */
    private int f11135e;

    /* renamed from: f */
    private int f11136f;

    /* renamed from: g */
    private int f11137g;

    /* renamed from: h */
    private int f11138h;

    /* renamed from: i */
    private int f11139i;
    @Nullable

    /* renamed from: j */
    private String f11140j;

    /* renamed from: k */
    private int f11141k;

    /* renamed from: l */
    private int f11142l;
    @Nullable

    /* renamed from: m */
    String f11143m;
    @Nullable

    /* renamed from: n */
    private JSONObject f11144n;

    public C7943j() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, (String) null, -1, -1, (String) null);
    }

    /* renamed from: R */
    private static final int m15601R(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* renamed from: S */
    private static final String m15602S(int i) {
        return String.format("#%02X%02X%02X%02X", new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))});
    }

    /* renamed from: A */
    public void mo41737A(@NonNull JSONObject jSONObject) {
        this.f11132b = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.f11133c = m15601R(jSONObject.optString("foregroundColor"));
        this.f11134d = m15601R(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f11135e = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f11135e = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f11135e = 2;
            } else if ("RAISED".equals(string)) {
                this.f11135e = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f11135e = 4;
            }
        }
        this.f11136f = m15601R(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.f11137g = 0;
            } else if ("NORMAL".equals(string2)) {
                this.f11137g = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.f11137g = 2;
            }
        }
        this.f11138h = m15601R(jSONObject.optString("windowColor"));
        if (this.f11137g == 2) {
            this.f11139i = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.f11140j = C8673a.m17444c(jSONObject, "fontFamily");
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.f11141k = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.f11141k = 1;
            } else if ("SERIF".equals(string3)) {
                this.f11141k = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.f11141k = 3;
            } else if ("CASUAL".equals(string3)) {
                this.f11141k = 4;
            } else if ("CURSIVE".equals(string3)) {
                this.f11141k = 5;
            } else if ("SMALL_CAPITALS".equals(string3)) {
                this.f11141k = 6;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.f11142l = 0;
            } else if ("BOLD".equals(string4)) {
                this.f11142l = 1;
            } else if ("ITALIC".equals(string4)) {
                this.f11142l = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.f11142l = 3;
            }
        }
        this.f11144n = jSONObject.optJSONObject("customData");
    }

    /* renamed from: F */
    public int mo41738F() {
        return this.f11134d;
    }

    /* renamed from: G */
    public int mo41739G() {
        return this.f11136f;
    }

    /* renamed from: H */
    public int mo41740H() {
        return this.f11135e;
    }

    @Nullable
    /* renamed from: I */
    public String mo41741I() {
        return this.f11140j;
    }

    /* renamed from: J */
    public int mo41742J() {
        return this.f11141k;
    }

    /* renamed from: K */
    public float mo41743K() {
        return this.f11132b;
    }

    /* renamed from: L */
    public int mo41744L() {
        return this.f11142l;
    }

    /* renamed from: M */
    public int mo41745M() {
        return this.f11133c;
    }

    /* renamed from: N */
    public int mo41746N() {
        return this.f11138h;
    }

    /* renamed from: O */
    public int mo41747O() {
        return this.f11139i;
    }

    /* renamed from: P */
    public int mo41748P() {
        return this.f11137g;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.NonNull
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject mo41749Q() {
        /*
            r8 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "fontScale"
            float r2 = r8.f11132b     // Catch:{ JSONException -> 0x00fb }
            double r2 = (double) r2     // Catch:{ JSONException -> 0x00fb }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00fb }
            int r1 = r8.f11133c     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x001a
            java.lang.String r2 = "foregroundColor"
            java.lang.String r1 = m15602S(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x001a:
            int r1 = r8.f11134d     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x0027
            java.lang.String r2 = "backgroundColor"
            java.lang.String r1 = m15602S(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x0027:
            int r1 = r8.f11135e     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r2 = "NONE"
            r3 = 3
            r4 = 1
            r5 = 2
            java.lang.String r6 = "edgeType"
            if (r1 == 0) goto L_0x0054
            if (r1 == r4) goto L_0x004e
            if (r1 == r5) goto L_0x0048
            if (r1 == r3) goto L_0x0042
            r7 = 4
            if (r1 == r7) goto L_0x003c
            goto L_0x0057
        L_0x003c:
            java.lang.String r1 = "DEPRESSED"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x0042:
            java.lang.String r1 = "RAISED"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x0048:
            java.lang.String r1 = "DROP_SHADOW"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x004e:
            java.lang.String r1 = "OUTLINE"
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x0057
        L_0x0054:
            r0.put(r6, r2)     // Catch:{ JSONException -> 0x00fb }
        L_0x0057:
            int r1 = r8.f11136f     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x0064
            java.lang.String r6 = "edgeColor"
            java.lang.String r1 = m15602S(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x0064:
            int r1 = r8.f11137g     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r6 = "NORMAL"
            java.lang.String r7 = "windowType"
            if (r1 == 0) goto L_0x007b
            if (r1 == r4) goto L_0x0077
            if (r1 == r5) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            java.lang.String r1 = "ROUNDED_CORNERS"
            r0.put(r7, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x007e
        L_0x0077:
            r0.put(r7, r6)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x007e
        L_0x007b:
            r0.put(r7, r2)     // Catch:{ JSONException -> 0x00fb }
        L_0x007e:
            int r1 = r8.f11138h     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x008b
            java.lang.String r2 = "windowColor"
            java.lang.String r1 = m15602S(r1)     // Catch:{ JSONException -> 0x00fb }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x008b:
            int r1 = r8.f11137g     // Catch:{ JSONException -> 0x00fb }
            if (r1 != r5) goto L_0x0096
            java.lang.String r1 = "windowRoundedCornerRadius"
            int r2 = r8.f11139i     // Catch:{ JSONException -> 0x00fb }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x00fb }
        L_0x0096:
            java.lang.String r1 = r8.f11140j     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x009f
            java.lang.String r2 = "fontFamily"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x009f:
            int r1 = r8.f11141k     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r2 = "fontGenericFamily"
            switch(r1) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00d0
        L_0x00a7:
            java.lang.String r1 = "SMALL_CAPITALS"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00ad:
            java.lang.String r1 = "CURSIVE"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00b3:
            java.lang.String r1 = "CASUAL"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00b9:
            java.lang.String r1 = "MONOSPACED_SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00bf:
            java.lang.String r1 = "SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r1 = "MONOSPACED_SANS_SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r1 = "SANS_SERIF"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x00d0:
            int r1 = r8.f11142l     // Catch:{ JSONException -> 0x00fb }
            java.lang.String r2 = "fontStyle"
            if (r1 == 0) goto L_0x00ef
            if (r1 == r4) goto L_0x00e9
            if (r1 == r5) goto L_0x00e3
            if (r1 == r3) goto L_0x00dd
            goto L_0x00f2
        L_0x00dd:
            java.lang.String r1 = "BOLD_ITALIC"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00f2
        L_0x00e3:
            java.lang.String r1 = "ITALIC"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00f2
        L_0x00e9:
            java.lang.String r1 = "BOLD"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
            goto L_0x00f2
        L_0x00ef:
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x00fb }
        L_0x00f2:
            org.json.JSONObject r1 = r8.f11144n     // Catch:{ JSONException -> 0x00fb }
            if (r1 == 0) goto L_0x00fb
            java.lang.String r2 = "customData"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x00fb }
        L_0x00fb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p109h4.C7943j.mo41749Q():org.json.JSONObject");
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7943j)) {
            return false;
        }
        C7943j jVar = (C7943j) obj;
        JSONObject jSONObject = this.f11144n;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = jVar.f11144n;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C10679m.m22696a(jSONObject, jSONObject2)) && this.f11132b == jVar.f11132b && this.f11133c == jVar.f11133c && this.f11134d == jVar.f11134d && this.f11135e == jVar.f11135e && this.f11136f == jVar.f11136f && this.f11137g == jVar.f11137g && this.f11138h == jVar.f11138h && this.f11139i == jVar.f11139i && C8673a.m17455n(this.f11140j, jVar.f11140j) && this.f11141k == jVar.f11141k && this.f11142l == jVar.f11142l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(Float.valueOf(this.f11132b), Integer.valueOf(this.f11133c), Integer.valueOf(this.f11134d), Integer.valueOf(this.f11135e), Integer.valueOf(this.f11136f), Integer.valueOf(this.f11137g), Integer.valueOf(this.f11138h), Integer.valueOf(this.f11139i), this.f11140j, Integer.valueOf(this.f11141k), Integer.valueOf(this.f11142l), String.valueOf(this.f11144n));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f11144n;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f11143m = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20529i(parcel, 2, mo41743K());
        C9883b.m20532l(parcel, 3, mo41745M());
        C9883b.m20532l(parcel, 4, mo41738F());
        C9883b.m20532l(parcel, 5, mo41740H());
        C9883b.m20532l(parcel, 6, mo41739G());
        C9883b.m20532l(parcel, 7, mo41748P());
        C9883b.m20532l(parcel, 8, mo41746N());
        C9883b.m20532l(parcel, 9, mo41747O());
        C9883b.m20539s(parcel, 10, mo41741I(), false);
        C9883b.m20532l(parcel, 11, mo41742J());
        C9883b.m20532l(parcel, 12, mo41744L());
        C9883b.m20539s(parcel, 13, this.f11143m, false);
        C9883b.m20522b(parcel, a);
    }

    C7943j(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable String str, int i8, int i9, @Nullable String str2) {
        this.f11132b = f;
        this.f11133c = i;
        this.f11134d = i2;
        this.f11135e = i3;
        this.f11136f = i4;
        this.f11137g = i5;
        this.f11138h = i6;
        this.f11139i = i7;
        this.f11140j = str;
        this.f11141k = i8;
        this.f11142l = i9;
        this.f11143m = str2;
        if (str2 != null) {
            try {
                this.f11144n = new JSONObject(this.f11143m);
            } catch (JSONException unused) {
                this.f11144n = null;
                this.f11143m = null;
            }
        } else {
            this.f11144n = null;
        }
    }
}
