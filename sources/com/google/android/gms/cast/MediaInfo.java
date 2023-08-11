package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.C5189w0;
import com.google.android.gms.internal.cast.C5240z0;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p109h4.C7907a;
import p109h4.C7931g;
import p109h4.C7943j;
import p109h4.C7946k;
import p150l4.C8673a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10679m;

/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class MediaInfo extends C9882a implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<MediaInfo> CREATOR = new C4696k();

    /* renamed from: u */
    public static final long f4517u = C8673a.m17446e(-1);
    @Nullable

    /* renamed from: b */
    private String f4518b;

    /* renamed from: c */
    private int f4519c;
    @Nullable

    /* renamed from: d */
    private String f4520d;
    @Nullable

    /* renamed from: e */
    private C7931g f4521e;

    /* renamed from: f */
    private long f4522f;
    @Nullable

    /* renamed from: g */
    private List f4523g;
    @Nullable

    /* renamed from: h */
    private C7943j f4524h;
    @Nullable

    /* renamed from: i */
    String f4525i;
    @Nullable

    /* renamed from: j */
    private List f4526j;
    @Nullable

    /* renamed from: k */
    private List f4527k;
    @Nullable

    /* renamed from: l */
    private String f4528l;
    @Nullable

    /* renamed from: m */
    private C7946k f4529m;

    /* renamed from: n */
    private long f4530n;
    @Nullable

    /* renamed from: o */
    private String f4531o;
    @Nullable

    /* renamed from: p */
    private String f4532p;
    @Nullable

    /* renamed from: q */
    private String f4533q;
    @Nullable

    /* renamed from: r */
    private String f4534r;
    @Nullable

    /* renamed from: s */
    private JSONObject f4535s;

    /* renamed from: t */
    private final C4623a f4536t;

    /* renamed from: com.google.android.gms.cast.MediaInfo$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public class C4623a {
        public C4623a() {
        }
    }

    MediaInfo(@Nullable String str, int i, @Nullable String str2, @Nullable C7931g gVar, long j, @Nullable List list, @Nullable C7943j jVar, @Nullable String str3, @Nullable List list2, @Nullable List list3, @Nullable String str4, @Nullable C7946k kVar, long j2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        String str9 = str3;
        String str10 = str4;
        String str11 = str6;
        this.f4536t = new C4623a();
        this.f4518b = str;
        this.f4519c = i;
        this.f4520d = str2;
        this.f4521e = gVar;
        this.f4522f = j;
        this.f4523g = list;
        this.f4524h = jVar;
        this.f4525i = str9;
        if (str9 != null) {
            try {
                this.f4535s = new JSONObject(this.f4525i);
            } catch (JSONException unused) {
                this.f4535s = null;
                this.f4525i = null;
            }
        } else {
            this.f4535s = null;
        }
        this.f4526j = list2;
        this.f4527k = list3;
        this.f4528l = str10;
        this.f4529m = kVar;
        this.f4530n = j2;
        this.f4531o = str5;
        this.f4532p = str11;
        this.f4533q = str7;
        this.f4534r = str8;
        if (this.f4518b == null && str11 == null && str10 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    @Nullable
    /* renamed from: A */
    public List<C4624a> mo31916A() {
        List list = this.f4527k;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @Nullable
    /* renamed from: F */
    public List<C7907a> mo31917F() {
        List list = this.f4526j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @NonNull
    /* renamed from: G */
    public String mo31918G() {
        String str = this.f4518b;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Nullable
    /* renamed from: H */
    public String mo31919H() {
        return this.f4520d;
    }

    @Nullable
    /* renamed from: I */
    public String mo31920I() {
        return this.f4532p;
    }

    @Nullable
    /* renamed from: J */
    public String mo31921J() {
        return this.f4528l;
    }

    @Nullable
    /* renamed from: K */
    public String mo31922K() {
        return this.f4533q;
    }

    @Nullable
    /* renamed from: L */
    public String mo31923L() {
        return this.f4534r;
    }

    @Nullable
    /* renamed from: M */
    public List<MediaTrack> mo31924M() {
        return this.f4523g;
    }

    @Nullable
    /* renamed from: N */
    public C7931g mo31925N() {
        return this.f4521e;
    }

    /* renamed from: O */
    public long mo31926O() {
        return this.f4530n;
    }

    /* renamed from: P */
    public long mo31927P() {
        return this.f4522f;
    }

    /* renamed from: Q */
    public int mo31928Q() {
        return this.f4519c;
    }

    @Nullable
    /* renamed from: R */
    public C7943j mo31929R() {
        return this.f4524h;
    }

    @Nullable
    /* renamed from: S */
    public C7946k mo31930S() {
        return this.f4529m;
    }

    @NonNull
    /* renamed from: T */
    public final JSONObject mo31931T() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f4518b);
            jSONObject.putOpt("contentUrl", this.f4532p);
            int i = this.f4519c;
            if (i == 1) {
                str = "BUFFERED";
            } else if (i != 2) {
                str = "NONE";
            } else {
                str = "LIVE";
            }
            jSONObject.put("streamType", str);
            String str2 = this.f4520d;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            C7931g gVar = this.f4521e;
            if (gVar != null) {
                jSONObject.put("metadata", gVar.mo41712J());
            }
            long j = this.f4522f;
            if (j <= -1) {
                jSONObject.put(TypedValues.TransitionType.S_DURATION, JSONObject.NULL);
            } else {
                jSONObject.put(TypedValues.TransitionType.S_DURATION, C8673a.m17443b(j));
            }
            if (this.f4523g != null) {
                JSONArray jSONArray = new JSONArray();
                for (MediaTrack M : this.f4523g) {
                    jSONArray.put(M.mo31944M());
                }
                jSONObject.put("tracks", jSONArray);
            }
            C7943j jVar = this.f4524h;
            if (jVar != null) {
                jSONObject.put("textTrackStyle", jVar.mo41749Q());
            }
            JSONObject jSONObject2 = this.f4535s;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str3 = this.f4528l;
            if (str3 != null) {
                jSONObject.put("entity", str3);
            }
            if (this.f4526j != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (C7907a L : this.f4526j) {
                    jSONArray2.put(L.mo41648L());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.f4527k != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (C4624a P : this.f4527k) {
                    jSONArray3.put(P.mo31959P());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            C7946k kVar = this.f4529m;
            if (kVar != null) {
                jSONObject.put("vmapAdsRequest", kVar.mo41770H());
            }
            long j2 = this.f4530n;
            if (j2 != -1) {
                jSONObject.put("startAbsoluteTime", C8673a.m17443b(j2));
            }
            jSONObject.putOpt("atvEntity", this.f4531o);
            String str4 = this.f4533q;
            if (str4 != null) {
                jSONObject.put("hlsSegmentFormat", str4);
            }
            String str5 = this.f4534r;
            if (str5 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str5);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa A[LOOP:0: B:3:0x0022->B:23:0x00aa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0187 A[LOOP:2: B:29:0x00d1->B:55:0x0187, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018e A[SYNTHETIC] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31932U(org.json.JSONObject r40) {
        /*
            r39 = this;
            r1 = r39
            r2 = r40
            java.lang.String r3 = "whenSkippable"
            java.lang.String r0 = "breaks"
            boolean r4 = r2.has(r0)
            java.lang.String r5 = "duration"
            java.lang.String r6 = "id"
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x00bb
            org.json.JSONArray r4 = r2.getJSONArray(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r0 = r4.length()
            r10.<init>(r0)
            r11 = r8
        L_0x0022:
            int r0 = r4.length()
            if (r11 >= r0) goto L_0x00b4
            org.json.JSONObject r0 = r4.getJSONObject(r11)
            android.os.Parcelable$Creator<h4.a> r12 = p109h4.C7907a.CREATOR
            if (r0 != 0) goto L_0x0033
        L_0x0030:
            r0 = 0
            goto L_0x00a8
        L_0x0033:
            boolean r12 = r0.has(r6)
            if (r12 == 0) goto L_0x0030
            java.lang.String r12 = "position"
            boolean r13 = r0.has(r12)
            if (r13 != 0) goto L_0x0042
            goto L_0x0030
        L_0x0042:
            java.lang.String r17 = r0.getString(r6)     // Catch:{ JSONException -> 0x0091 }
            long r12 = r0.getLong(r12)     // Catch:{ JSONException -> 0x0091 }
            long r15 = p150l4.C8673a.m17446e(r12)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r12 = "isWatched"
            boolean r20 = r0.optBoolean(r12)     // Catch:{ JSONException -> 0x0091 }
            long r12 = r0.optLong(r5)     // Catch:{ JSONException -> 0x0091 }
            long r18 = p150l4.C8673a.m17446e(r12)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r12 = "breakClipIds"
            org.json.JSONArray r12 = r0.optJSONArray(r12)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String[] r13 = new java.lang.String[r8]     // Catch:{ JSONException -> 0x0091 }
            if (r12 == 0) goto L_0x007c
            int r13 = r12.length()     // Catch:{ JSONException -> 0x0091 }
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ JSONException -> 0x0091 }
            r14 = r8
        L_0x006d:
            int r9 = r12.length()     // Catch:{ JSONException -> 0x0091 }
            if (r14 >= r9) goto L_0x007c
            java.lang.String r9 = r12.getString(r14)     // Catch:{ JSONException -> 0x0091 }
            r13[r14] = r9     // Catch:{ JSONException -> 0x0091 }
            int r14 = r14 + 1
            goto L_0x006d
        L_0x007c:
            r21 = r13
            java.lang.String r9 = "isEmbedded"
            boolean r22 = r0.optBoolean(r9)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r9 = "expanded"
            boolean r23 = r0.optBoolean(r9)     // Catch:{ JSONException -> 0x0091 }
            h4.a r0 = new h4.a     // Catch:{ JSONException -> 0x0091 }
            r14 = r0
            r14.<init>(r15, r17, r18, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x0091 }
            goto L_0x00a8
        L_0x0091:
            r0 = move-exception
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.Object[] r12 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r12[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r9, r0, r12)
            java.lang.String r9 = "AdBreakInfo"
            android.util.Log.d(r9, r0)
            goto L_0x0030
        L_0x00a8:
            if (r0 == 0) goto L_0x00b1
            r10.add(r0)
            int r11 = r11 + 1
            goto L_0x0022
        L_0x00b1:
            r10.clear()
        L_0x00b4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            r1.f4526j = r0
        L_0x00bb:
            java.lang.String r0 = "breakClips"
            boolean r4 = r2.has(r0)
            if (r4 == 0) goto L_0x0198
            org.json.JSONArray r2 = r2.getJSONArray(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r2.length()
            r4.<init>(r0)
            r9 = r8
        L_0x00d1:
            int r0 = r2.length()
            if (r9 >= r0) goto L_0x0191
            org.json.JSONObject r0 = r2.getJSONObject(r9)
            android.os.Parcelable$Creator<com.google.android.gms.cast.a> r10 = com.google.android.gms.cast.C4624a.CREATOR
            if (r0 != 0) goto L_0x00e2
        L_0x00df:
            r0 = 0
            goto L_0x0185
        L_0x00e2:
            boolean r10 = r0.has(r6)
            if (r10 != 0) goto L_0x00e9
            goto L_0x00df
        L_0x00e9:
            java.lang.String r25 = r0.getString(r6)     // Catch:{ JSONException -> 0x016d }
            long r10 = r0.optLong(r5)     // Catch:{ JSONException -> 0x016d }
            long r27 = p150l4.C8673a.m17446e(r10)     // Catch:{ JSONException -> 0x016d }
            java.lang.String r10 = "clickThroughUrl"
            java.lang.String r31 = p150l4.C8673a.m17444c(r0, r10)     // Catch:{ JSONException -> 0x016d }
            java.lang.String r10 = "contentUrl"
            java.lang.String r29 = p150l4.C8673a.m17444c(r0, r10)     // Catch:{ JSONException -> 0x016d }
            java.lang.String r10 = "mimeType"
            java.lang.String r10 = p150l4.C8673a.m17444c(r0, r10)     // Catch:{ JSONException -> 0x016d }
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "contentType"
            java.lang.String r10 = p150l4.C8673a.m17444c(r0, r10)     // Catch:{ JSONException -> 0x016d }
        L_0x010f:
            r30 = r10
            java.lang.String r10 = "title"
            java.lang.String r26 = p150l4.C8673a.m17444c(r0, r10)     // Catch:{ JSONException -> 0x016d }
            java.lang.String r10 = "customData"
            org.json.JSONObject r10 = r0.optJSONObject(r10)     // Catch:{ JSONException -> 0x016d }
            java.lang.String r11 = "contentId"
            java.lang.String r33 = p150l4.C8673a.m17444c(r0, r11)     // Catch:{ JSONException -> 0x016d }
            java.lang.String r11 = "posterUrl"
            java.lang.String r34 = p150l4.C8673a.m17444c(r0, r11)     // Catch:{ JSONException -> 0x016d }
            boolean r11 = r0.has(r3)     // Catch:{ JSONException -> 0x016d }
            if (r11 == 0) goto L_0x013f
            java.lang.Object r11 = r0.get(r3)     // Catch:{ JSONException -> 0x016d }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ JSONException -> 0x016d }
            int r11 = r11.intValue()     // Catch:{ JSONException -> 0x016d }
            long r11 = (long) r11     // Catch:{ JSONException -> 0x016d }
            long r11 = p150l4.C8673a.m17446e(r11)     // Catch:{ JSONException -> 0x016d }
            goto L_0x0141
        L_0x013f:
            r11 = -1
        L_0x0141:
            r35 = r11
            java.lang.String r11 = "hlsSegmentFormat"
            java.lang.String r37 = p150l4.C8673a.m17444c(r0, r11)     // Catch:{ JSONException -> 0x016d }
            java.lang.String r11 = "vastAdsRequest"
            org.json.JSONObject r0 = r0.optJSONObject(r11)     // Catch:{ JSONException -> 0x016d }
            h4.k r38 = p109h4.C7946k.m15632A(r0)     // Catch:{ JSONException -> 0x016d }
            com.google.android.gms.cast.a r0 = new com.google.android.gms.cast.a     // Catch:{ JSONException -> 0x016d }
            if (r10 == 0) goto L_0x0165
            int r11 = r10.length()     // Catch:{ JSONException -> 0x016d }
            if (r11 != 0) goto L_0x015e
            goto L_0x0165
        L_0x015e:
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x016d }
            r32 = r10
            goto L_0x0167
        L_0x0165:
            r32 = 0
        L_0x0167:
            r24 = r0
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r37, r38)     // Catch:{ JSONException -> 0x016d }
            goto L_0x0185
        L_0x016d:
            r0 = move-exception
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r11[r8] = r0
            java.lang.String r0 = "Error while creating an AdBreakClipInfo from JSON: %s"
            java.lang.String r0 = java.lang.String.format(r10, r0, r11)
            java.lang.String r10 = "AdBreakClipInfo"
            android.util.Log.d(r10, r0)
            goto L_0x00df
        L_0x0185:
            if (r0 == 0) goto L_0x018e
            r4.add(r0)
            int r9 = r9 + 1
            goto L_0x00d1
        L_0x018e:
            r4.clear()
        L_0x0191:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r1.f4527k = r0
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.mo31932U(org.json.JSONObject):void");
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.f4535s;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = mediaInfo.f4535s;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C10679m.m22696a(jSONObject, jSONObject2)) && C8673a.m17455n(this.f4518b, mediaInfo.f4518b) && this.f4519c == mediaInfo.f4519c && C8673a.m17455n(this.f4520d, mediaInfo.f4520d) && C8673a.m17455n(this.f4521e, mediaInfo.f4521e) && this.f4522f == mediaInfo.f4522f && C8673a.m17455n(this.f4523g, mediaInfo.f4523g) && C8673a.m17455n(this.f4524h, mediaInfo.f4524h) && C8673a.m17455n(this.f4526j, mediaInfo.f4526j) && C8673a.m17455n(this.f4527k, mediaInfo.f4527k) && C8673a.m17455n(this.f4528l, mediaInfo.f4528l) && C8673a.m17455n(this.f4529m, mediaInfo.f4529m) && this.f4530n == mediaInfo.f4530n && C8673a.m17455n(this.f4531o, mediaInfo.f4531o) && C8673a.m17455n(this.f4532p, mediaInfo.f4532p) && C8673a.m17455n(this.f4533q, mediaInfo.f4533q) && C8673a.m17455n(this.f4534r, mediaInfo.f4534r)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f4518b, Integer.valueOf(this.f4519c), this.f4520d, this.f4521e, Long.valueOf(this.f4522f), String.valueOf(this.f4535s), this.f4523g, this.f4524h, this.f4526j, this.f4527k, this.f4528l, this.f4529m, Long.valueOf(this.f4530n), this.f4531o, this.f4533q, this.f4534r);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f4535s;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f4525i = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo31918G(), false);
        C9883b.m20532l(parcel, 3, mo31928Q());
        C9883b.m20539s(parcel, 4, mo31919H(), false);
        C9883b.m20538r(parcel, 5, mo31925N(), i, false);
        C9883b.m20535o(parcel, 6, mo31927P());
        C9883b.m20543w(parcel, 7, mo31924M(), false);
        C9883b.m20538r(parcel, 8, mo31929R(), i, false);
        C9883b.m20539s(parcel, 9, this.f4525i, false);
        C9883b.m20543w(parcel, 10, mo31917F(), false);
        C9883b.m20543w(parcel, 11, mo31916A(), false);
        C9883b.m20539s(parcel, 12, mo31921J(), false);
        C9883b.m20538r(parcel, 13, mo31930S(), i, false);
        C9883b.m20535o(parcel, 14, mo31926O());
        C9883b.m20539s(parcel, 15, this.f4531o, false);
        C9883b.m20539s(parcel, 16, mo31920I(), false);
        C9883b.m20539s(parcel, 17, mo31922K(), false);
        C9883b.m20539s(parcel, 18, mo31923L(), false);
        C9883b.m20522b(parcel, a);
    }

    MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, (String) null, (C7931g) null, -1, (List) null, (C7943j) null, (String) null, (List) null, (List) null, (String) null, (C7946k) null, -1, (String) null, (String) null, (String) null, (String) null);
        MediaInfo mediaInfo;
        int i;
        int i2;
        C5240z0 z0Var;
        int i3;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("streamType", "NONE");
        int i4 = 2;
        int i5 = 1;
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.f4519c = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.f4519c = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.f4519c = 2;
            } else {
                mediaInfo.f4519c = -1;
            }
        }
        mediaInfo.f4520d = C8673a.m17444c(jSONObject2, "contentType");
        if (jSONObject2.has("metadata")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("metadata");
            C7931g gVar = new C7931g(jSONObject3.getInt("metadataType"));
            mediaInfo.f4521e = gVar;
            gVar.mo41713K(jSONObject3);
        }
        mediaInfo.f4522f = -1;
        if (mediaInfo.f4519c != 2 && jSONObject2.has(TypedValues.TransitionType.S_DURATION) && !jSONObject2.isNull(TypedValues.TransitionType.S_DURATION)) {
            double optDouble = jSONObject2.optDouble(TypedValues.TransitionType.S_DURATION, 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                mediaInfo.f4522f = C8673a.m17445d(optDouble);
            }
        }
        if (jSONObject2.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject2.getJSONArray("tracks");
            int i6 = 0;
            while (i6 < jSONArray.length()) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i6);
                Parcelable.Creator<MediaTrack> creator = MediaTrack.CREATOR;
                long j = jSONObject4.getLong("trackId");
                String optString2 = jSONObject4.optString(JSONAPIResourceIdSerializer.FIELD_TYPE);
                if ("TEXT".equals(optString2)) {
                    i = i5;
                } else if ("AUDIO".equals(optString2)) {
                    i = i4;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String c = C8673a.m17444c(jSONObject4, "trackContentId");
                String c2 = C8673a.m17444c(jSONObject4, "trackContentType");
                String c3 = C8673a.m17444c(jSONObject4, HintConstants.AUTOFILL_HINT_NAME);
                String c4 = C8673a.m17444c(jSONObject4, "language");
                if (jSONObject4.has("subtype")) {
                    String string = jSONObject4.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = i5;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = i4;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else {
                        if ("CHAPTERS".equals(string)) {
                            i3 = 4;
                        } else if ("METADATA".equals(string)) {
                            i3 = 5;
                        } else {
                            i2 = -1;
                        }
                        i2 = i3;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject4.has("roles")) {
                    C5189w0 s = C5240z0.m7710s();
                    JSONArray jSONArray2 = jSONObject4.getJSONArray("roles");
                    for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                        s.mo33041d(jSONArray2.optString(i7));
                    }
                    z0Var = s.mo33042e();
                } else {
                    z0Var = null;
                }
                arrayList.add(new MediaTrack(j, i, c, c2, c3, c4, i2, z0Var, jSONObject4.optJSONObject("customData")));
                i6++;
                i4 = 2;
                i5 = 1;
            }
            mediaInfo.f4523g = new ArrayList(arrayList);
        } else {
            mediaInfo.f4523g = null;
        }
        if (jSONObject2.has("textTrackStyle")) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject("textTrackStyle");
            C7943j jVar = new C7943j();
            jVar.mo41737A(jSONObject5);
            mediaInfo.f4524h = jVar;
        } else {
            mediaInfo.f4524h = null;
        }
        mo31932U(jSONObject);
        mediaInfo.f4535s = jSONObject2.optJSONObject("customData");
        mediaInfo.f4528l = C8673a.m17444c(jSONObject2, "entity");
        mediaInfo.f4531o = C8673a.m17444c(jSONObject2, "atvEntity");
        mediaInfo.f4529m = C7946k.m15632A(jSONObject2.optJSONObject("vmapAdsRequest"));
        if (jSONObject2.has("startAbsoluteTime") && !jSONObject2.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject2.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.f4530n = C8673a.m17445d(optDouble2);
            }
        }
        if (jSONObject2.has("contentUrl")) {
            mediaInfo.f4532p = jSONObject2.optString("contentUrl");
        }
        mediaInfo.f4533q = C8673a.m17444c(jSONObject2, "hlsSegmentFormat");
        mediaInfo.f4534r = C8673a.m17444c(jSONObject2, "hlsVideoSegmentFormat");
    }
}
