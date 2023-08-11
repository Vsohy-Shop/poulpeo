package p150l4;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.C4626c;
import com.google.android.gms.cast.C4689g;
import com.google.android.gms.cast.C4692h;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.internal.zzaq;
import com.google.android.gms.tasks.Task;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p109h4.C7935h;
import p160m4.C8822a;
import p276x5.C10406g;
import p276x5.C10410i;

/* renamed from: l4.s */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8709s extends C8716y {

    /* renamed from: E */
    public static final String f12493E = C8673a.m17450i("com.google.cast.media");

    /* renamed from: A */
    final C8714w f12494A;

    /* renamed from: B */
    final C8714w f12495B;

    /* renamed from: C */
    final C8714w f12496C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C10406g f12497D;

    /* renamed from: e */
    private long f12498e;
    @Nullable

    /* renamed from: f */
    private C4692h f12499f;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public Long f12500g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8705q f12501h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f12502i = -1;

    /* renamed from: j */
    final C8714w f12503j;

    /* renamed from: k */
    final C8714w f12504k;

    /* renamed from: l */
    final C8714w f12505l;

    /* renamed from: m */
    final C8714w f12506m;

    /* renamed from: n */
    final C8714w f12507n;

    /* renamed from: o */
    final C8714w f12508o;

    /* renamed from: p */
    final C8714w f12509p;

    /* renamed from: q */
    final C8714w f12510q;

    /* renamed from: r */
    final C8714w f12511r;

    /* renamed from: s */
    final C8714w f12512s;

    /* renamed from: t */
    final C8714w f12513t;

    /* renamed from: u */
    final C8714w f12514u;

    /* renamed from: v */
    final C8714w f12515v;

    /* renamed from: w */
    final C8714w f12516w;

    /* renamed from: x */
    final C8714w f12517x;

    /* renamed from: y */
    final C8714w f12518y;

    /* renamed from: z */
    final C8714w f12519z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8709s(@Nullable String str) {
        super(f12493E, "MediaControlChannel", (String) null);
        C8714w wVar = new C8714w(86400000);
        this.f12503j = wVar;
        C8714w wVar2 = new C8714w(86400000);
        this.f12504k = wVar2;
        C8714w wVar3 = new C8714w(86400000);
        this.f12505l = wVar3;
        C8714w wVar4 = new C8714w(86400000);
        this.f12506m = wVar4;
        C8714w wVar5 = new C8714w(10000);
        this.f12507n = wVar5;
        C8714w wVar6 = new C8714w(86400000);
        this.f12508o = wVar6;
        C8714w wVar7 = new C8714w(86400000);
        this.f12509p = wVar7;
        C8714w wVar8 = new C8714w(86400000);
        this.f12510q = wVar8;
        C8714w wVar9 = new C8714w(86400000);
        this.f12511r = wVar9;
        C8714w wVar10 = new C8714w(86400000);
        this.f12512s = wVar10;
        C8714w wVar11 = new C8714w(86400000);
        this.f12513t = wVar11;
        C8714w wVar12 = new C8714w(86400000);
        this.f12514u = wVar12;
        C8714w wVar13 = new C8714w(86400000);
        this.f12515v = wVar13;
        C8714w wVar14 = wVar13;
        C8714w wVar15 = new C8714w(86400000);
        this.f12516w = wVar15;
        C8714w wVar16 = wVar15;
        C8714w wVar17 = new C8714w(86400000);
        this.f12517x = wVar17;
        C8714w wVar18 = wVar17;
        C8714w wVar19 = new C8714w(86400000);
        this.f12519z = wVar19;
        C8714w wVar20 = wVar19;
        this.f12518y = new C8714w(86400000);
        C8714w wVar21 = new C8714w(86400000);
        this.f12494A = wVar21;
        C8714w wVar22 = wVar21;
        C8714w wVar23 = new C8714w(86400000);
        this.f12495B = wVar23;
        C8714w wVar24 = wVar23;
        C8714w wVar25 = new C8714w(86400000);
        this.f12496C = wVar25;
        mo42843h(wVar);
        mo42843h(wVar2);
        mo42843h(wVar3);
        mo42843h(wVar4);
        mo42843h(wVar5);
        mo42843h(wVar6);
        mo42843h(wVar7);
        mo42843h(wVar8);
        mo42843h(wVar9);
        mo42843h(wVar10);
        mo42843h(wVar11);
        mo42843h(wVar12);
        mo42843h(wVar14);
        mo42843h(wVar16);
        mo42843h(wVar18);
        C8714w wVar26 = wVar20;
        mo42843h(wVar26);
        mo42843h(wVar26);
        mo42843h(wVar22);
        mo42843h(wVar24);
        mo42843h(wVar25);
        m17610w();
    }

    /* renamed from: A */
    private final void m17600A() {
        C8705q qVar = this.f12501h;
        if (qVar != null) {
            qVar.mo32096A();
        }
    }

    /* renamed from: B */
    private final void m17601B() {
        C8705q qVar = this.f12501h;
        if (qVar != null) {
            qVar.mo32105i();
        }
    }

    /* renamed from: C */
    private final boolean m17602C() {
        if (this.f12502i != -1) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: D */
    private static int[] m17603D(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    /* renamed from: u */
    private final long m17608u(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12498e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (((double) elapsedRealtime) * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0;
    }

    /* renamed from: v */
    private static C8707r m17609v(JSONObject jSONObject) {
        MediaError I = MediaError.m5975I(jSONObject);
        C8707r rVar = new C8707r();
        rVar.f12491a = C8673a.m17454m(jSONObject, "customData");
        rVar.f12492b = I;
        return rVar;
    }

    /* renamed from: w */
    private final void m17610w() {
        this.f12498e = 0;
        this.f12499f = null;
        for (C8714w c : mo42841f()) {
            c.mo42835c(2002);
        }
    }

    /* renamed from: x */
    private final void m17611x(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f12502i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.f12428a.mo42759f(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    /* renamed from: y */
    private final void m17612y() {
        C8705q qVar = this.f12501h;
        if (qVar != null) {
            qVar.mo32106x();
        }
    }

    /* renamed from: z */
    private final void m17613z() {
        C8705q qVar = this.f12501h;
        if (qVar != null) {
            qVar.mo32099c();
        }
    }

    /* renamed from: F */
    public final long mo42813F() {
        C4626c L;
        C4692h hVar = this.f12499f;
        if (hVar == null || (L = hVar.mo32261L()) == null) {
            return 0;
        }
        long A = L.mo31971A();
        if (!L.mo31973G()) {
            return m17608u(1.0d, A, -1);
        }
        return A;
    }

    /* renamed from: G */
    public final long mo42814G() {
        C4692h hVar;
        MediaInfo l = mo42824l();
        if (l == null || (hVar = this.f12499f) == null) {
            return 0;
        }
        Long l2 = this.f12500g;
        if (l2 != null) {
            if (l2.equals(4294967296000L)) {
                if (this.f12499f.mo32261L() != null) {
                    return Math.min(l2.longValue(), mo42813F());
                }
                if (mo42816I() >= 0) {
                    return Math.min(l2.longValue(), mo42816I());
                }
            }
            return l2.longValue();
        } else if (this.f12498e == 0) {
            return 0;
        } else {
            double O = hVar.mo32264O();
            long V = hVar.mo32271V();
            int P = hVar.mo32265P();
            if (O == 0.0d || P != 2) {
                return V;
            }
            return m17608u(O, V, l.mo31927P());
        }
    }

    /* renamed from: H */
    public final long mo42815H() {
        C4692h hVar = this.f12499f;
        if (hVar != null) {
            return hVar.mo32278c0();
        }
        throw new zzaq();
    }

    /* renamed from: I */
    public final long mo42816I() {
        MediaInfo l = mo42824l();
        if (l != null) {
            return l.mo31927P();
        }
        return 0;
    }

    /* renamed from: J */
    public final long mo42817J(C8712u uVar, @Nullable JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long a = mo42795a();
        try {
            jSONObject2.put("requestId", a);
            jSONObject2.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "PAUSE");
            jSONObject2.put("mediaSessionId", mo42815H());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        mo42798d(jSONObject2.toString(), a, (String) null);
        this.f12504k.mo42834b(a, uVar);
        return a;
    }

    /* renamed from: K */
    public final long mo42818K(C8712u uVar, @Nullable JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long a = mo42795a();
        try {
            jSONObject2.put("requestId", a);
            jSONObject2.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "PLAY");
            jSONObject2.put("mediaSessionId", mo42815H());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        mo42798d(jSONObject2.toString(), a, (String) null);
        this.f12505l.mo42834b(a, uVar);
        return a;
    }

    /* renamed from: L */
    public final long mo42819L(C8712u uVar) {
        JSONObject jSONObject = new JSONObject();
        long a = mo42795a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", mo42815H());
        } catch (JSONException unused) {
        }
        mo42798d(jSONObject.toString(), a, (String) null);
        this.f12517x.mo42834b(a, uVar);
        return a;
    }

    /* renamed from: M */
    public final long mo42820M(C8712u uVar, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long a = mo42795a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", mo42815H());
            JSONArray jSONArray = new JSONArray();
            for (int put : iArr) {
                jSONArray.put(put);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        mo42798d(jSONObject.toString(), a, (String) null);
        this.f12518y.mo42834b(a, uVar);
        return a;
    }

    /* renamed from: c */
    public final void mo42797c() {
        mo42842g();
        m17610w();
    }

    /* renamed from: i */
    public final long mo42821i(C8712u uVar, int i, long j, @Nullable C4689g[] gVarArr, int i2, @Nullable Boolean bool, @Nullable Integer num, @Nullable JSONObject jSONObject) {
        int i3 = i;
        long j2 = j;
        C4689g[] gVarArr2 = gVarArr;
        int i4 = i2;
        Boolean bool2 = bool;
        JSONObject jSONObject2 = jSONObject;
        int i5 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i5 == 0 || j2 >= 0) {
            JSONObject jSONObject3 = new JSONObject();
            long a = mo42795a();
            try {
                jSONObject3.put("requestId", a);
                jSONObject3.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "QUEUE_UPDATE");
                jSONObject3.put("mediaSessionId", mo42815H());
                if (i3 != 0) {
                    jSONObject3.put("currentItemId", i3);
                }
                if (i4 != 0) {
                    jSONObject3.put("jump", i4);
                }
                if (gVarArr2 != null && gVarArr2.length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i6 = 0; i6 < gVarArr2.length; i6++) {
                        jSONArray.put(i6, gVarArr2[i6].mo32248M());
                    }
                    jSONObject3.put("items", jSONArray);
                }
                if (bool2 != null) {
                    jSONObject3.put("shuffle", bool2);
                }
                String b = C8822a.m17881b(num);
                if (b != null) {
                    jSONObject3.put("repeatMode", b);
                }
                if (i5 != 0) {
                    jSONObject3.put("currentTime", C8673a.m17443b(j));
                }
                if (jSONObject2 != null) {
                    jSONObject3.put("customData", jSONObject2);
                }
                if (m17602C()) {
                    jSONObject3.put("sequenceNumber", this.f12502i);
                }
            } catch (JSONException unused) {
            }
            mo42798d(jSONObject3.toString(), a, (String) null);
            this.f12514u.mo42834b(a, new C8703p(this, uVar));
            return a;
        }
        throw new IllegalArgumentException("playPosition cannot be negative: " + j2);
    }

    /* renamed from: j */
    public final long mo42822j(C8712u uVar) {
        JSONObject jSONObject = new JSONObject();
        long a = mo42795a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "GET_STATUS");
            C4692h hVar = this.f12499f;
            if (hVar != null) {
                jSONObject.put("mediaSessionId", hVar.mo32278c0());
            }
        } catch (JSONException unused) {
        }
        mo42798d(jSONObject.toString(), a, (String) null);
        this.f12510q.mo42834b(a, uVar);
        return a;
    }

    /* renamed from: k */
    public final long mo42823k(C8712u uVar, C7935h hVar) {
        long j;
        JSONObject jSONObject = new JSONObject();
        long a = mo42795a();
        if (hVar.mo41722d()) {
            j = 4294967296000L;
        } else {
            j = hVar.mo41720b();
        }
        try {
            jSONObject.put("requestId", a);
            jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "SEEK");
            jSONObject.put("mediaSessionId", mo42815H());
            jSONObject.put("currentTime", C8673a.m17443b(j));
            if (hVar.mo41721c() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (hVar.mo41721c() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (hVar.mo41719a() != null) {
                jSONObject.put("customData", hVar.mo41719a());
            }
        } catch (JSONException unused) {
        }
        mo42798d(jSONObject.toString(), a, (String) null);
        this.f12500g = Long.valueOf(j);
        this.f12507n.mo42834b(a, new C8699n(this, uVar));
        return a;
    }

    @Nullable
    /* renamed from: l */
    public final MediaInfo mo42824l() {
        C4692h hVar = this.f12499f;
        if (hVar == null) {
            return null;
        }
        return hVar.mo32263N();
    }

    @Nullable
    /* renamed from: m */
    public final C4692h mo42825m() {
        return this.f12499f;
    }

    /* renamed from: o */
    public final Task mo42826o(@Nullable JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long a = mo42795a();
        try {
            jSONObject2.put("requestId", a);
            jSONObject2.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "STORE_SESSION");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("assistant_supported", true);
            jSONObject3.put("display_supported", true);
            jSONObject3.put("is_group", false);
            jSONObject2.put("targetDeviceCapabilities", jSONObject3);
        } catch (JSONException e) {
            this.f12428a.mo42760g(e, "store session failed to create JSON message", new Object[0]);
        }
        try {
            mo42798d(jSONObject2.toString(), a, (String) null);
            this.f12496C.mo42834b(a, new C8701o(this));
            C10406g gVar = new C10406g();
            this.f12497D = gVar;
            return gVar.mo45096a();
        } catch (IllegalStateException e2) {
            return C10410i.m21830d(e2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0283 A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02a0 A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02b0 A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02bd A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02c7 A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02ce A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02d5 A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02dc A[Catch:{ JSONException -> 0x031e }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02ed A[Catch:{ JSONException -> 0x031e }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42827r(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "insertBefore"
            l4.b r3 = r1.f12428a
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r2
            java.lang.String r7 = "message received: %s"
            r3.mo42754a(r7, r5)
            r3 = 2
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x031e }
            r5.<init>(r2)     // Catch:{ JSONException -> 0x031e }
            java.lang.String r7 = "type"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ JSONException -> 0x031e }
            java.lang.String r8 = "requestId"
            r9 = -1
            long r8 = r5.optLong(r8, r9)     // Catch:{ JSONException -> 0x031e }
            int r10 = r7.hashCode()     // Catch:{ JSONException -> 0x031e }
            java.lang.String r11 = "QUEUE_ITEM_IDS"
            java.lang.String r12 = "QUEUE_CHANGE"
            java.lang.String r13 = "QUEUE_ITEMS"
            r14 = 3
            switch(r10) {
                case -1830647528: goto L_0x008d;
                case -1790231854: goto L_0x0084;
                case -1125000185: goto L_0x007a;
                case -262628938: goto L_0x0070;
                case -61993624: goto L_0x0065;
                case 66247144: goto L_0x005b;
                case 154411710: goto L_0x0053;
                case 431600379: goto L_0x0049;
                case 823510221: goto L_0x003f;
                case 2107149050: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0097
        L_0x0037:
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0097
            r7 = 6
            goto L_0x0098
        L_0x003f:
            java.lang.String r10 = "MEDIA_STATUS"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0097
            r7 = r6
            goto L_0x0098
        L_0x0049:
            java.lang.String r10 = "INVALID_PLAYER_STATE"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0097
            r7 = r4
            goto L_0x0098
        L_0x0053:
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x0097
            r7 = 7
            goto L_0x0098
        L_0x005b:
            java.lang.String r10 = "ERROR"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0097
            r7 = 5
            goto L_0x0098
        L_0x0065:
            java.lang.String r10 = "SESSION_STATE"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0097
            r7 = 9
            goto L_0x0098
        L_0x0070:
            java.lang.String r10 = "LOAD_FAILED"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0097
            r7 = r3
            goto L_0x0098
        L_0x007a:
            java.lang.String r10 = "INVALID_REQUEST"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0097
            r7 = 4
            goto L_0x0098
        L_0x0084:
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x0097
            r7 = 8
            goto L_0x0098
        L_0x008d:
            java.lang.String r10 = "LOAD_CANCELLED"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x0097
            r7 = r14
            goto L_0x0098
        L_0x0097:
            r7 = -1
        L_0x0098:
            java.lang.String r10 = "itemIds"
            r15 = 0
            switch(r7) {
                case 0: goto L_0x0246;
                case 1: goto L_0x021f;
                case 2: goto L_0x0213;
                case 3: goto L_0x0207;
                case 4: goto L_0x01e0;
                case 5: goto L_0x01b2;
                case 6: goto L_0x0196;
                case 7: goto L_0x00f2;
                case 8: goto L_0x00bb;
                case 9: goto L_0x00a0;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x031d
        L_0x00a0:
            l4.w r0 = r1.f12496C     // Catch:{ JSONException -> 0x031e }
            r0.mo42836d(r8, r6, r15)     // Catch:{ JSONException -> 0x031e }
            x5.g r0 = r1.f12497D     // Catch:{ JSONException -> 0x031e }
            if (r0 == 0) goto L_0x031d
            java.lang.String r0 = "sessionState"
            org.json.JSONObject r0 = p150l4.C8673a.m17454m(r5, r0)     // Catch:{ JSONException -> 0x031e }
            if (r0 == 0) goto L_0x031d
            h4.i r0 = p109h4.C7939i.m15597A(r0)     // Catch:{ JSONException -> 0x031e }
            x5.g r5 = r1.f12497D     // Catch:{ JSONException -> 0x031e }
            r5.mo45098c(r0)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x00bb:
            l4.w r0 = r1.f12518y     // Catch:{ JSONException -> 0x031e }
            r0.mo42836d(r8, r6, r15)     // Catch:{ JSONException -> 0x031e }
            r1.m17611x(r5, r13)     // Catch:{ JSONException -> 0x031e }
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            if (r0 == 0) goto L_0x031d
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r5.getJSONArray(r0)     // Catch:{ JSONException -> 0x031e }
            int r5 = r0.length()     // Catch:{ JSONException -> 0x031e }
            com.google.android.gms.cast.g[] r5 = new com.google.android.gms.cast.C4689g[r5]     // Catch:{ JSONException -> 0x031e }
            r7 = r6
        L_0x00d4:
            int r8 = r0.length()     // Catch:{ JSONException -> 0x031e }
            if (r7 >= r8) goto L_0x00ec
            com.google.android.gms.cast.g$a r8 = new com.google.android.gms.cast.g$a     // Catch:{ JSONException -> 0x031e }
            org.json.JSONObject r9 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x031e }
            r8.<init>((org.json.JSONObject) r9)     // Catch:{ JSONException -> 0x031e }
            com.google.android.gms.cast.g r8 = r8.mo32253a()     // Catch:{ JSONException -> 0x031e }
            r5[r7] = r8     // Catch:{ JSONException -> 0x031e }
            int r7 = r7 + 1
            goto L_0x00d4
        L_0x00ec:
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r0.mo32098b(r5)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x00f2:
            l4.w r7 = r1.f12519z     // Catch:{ JSONException -> 0x031e }
            r7.mo42836d(r8, r6, r15)     // Catch:{ JSONException -> 0x031e }
            r1.m17611x(r5, r12)     // Catch:{ JSONException -> 0x031e }
            l4.q r7 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            if (r7 == 0) goto L_0x031d
            java.lang.String r7 = "changeType"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ JSONException -> 0x031e }
            org.json.JSONArray r8 = r5.getJSONArray(r10)     // Catch:{ JSONException -> 0x031e }
            int[] r8 = m17603D(r8)     // Catch:{ JSONException -> 0x031e }
            int r9 = r5.optInt(r0, r6)     // Catch:{ JSONException -> 0x031e }
            if (r8 == 0) goto L_0x031d
            int r11 = r7.hashCode()     // Catch:{ JSONException -> 0x031e }
            switch(r11) {
                case -2130463047: goto L_0x0138;
                case -1881281404: goto L_0x012e;
                case -1785516855: goto L_0x0124;
                case 1122976047: goto L_0x011a;
                default: goto L_0x0119;
            }
        L_0x0119:
            goto L_0x0142
        L_0x011a:
            java.lang.String r11 = "ITEMS_CHANGE"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0142
            r15 = r4
            goto L_0x0143
        L_0x0124:
            java.lang.String r11 = "UPDATE"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0142
            r15 = r14
            goto L_0x0143
        L_0x012e:
            java.lang.String r11 = "REMOVE"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0142
            r15 = r3
            goto L_0x0143
        L_0x0138:
            java.lang.String r11 = "INSERT"
            boolean r7 = r7.equals(r11)
            if (r7 == 0) goto L_0x0142
            r15 = r6
            goto L_0x0143
        L_0x0142:
            r15 = -1
        L_0x0143:
            if (r15 == 0) goto L_0x0190
            if (r15 == r4) goto L_0x018a
            if (r15 == r3) goto L_0x0184
            if (r15 == r14) goto L_0x014d
            goto L_0x031d
        L_0x014d:
            org.json.JSONArray r7 = r5.getJSONArray(r10)     // Catch:{ JSONException -> 0x031e }
            int[] r7 = m17603D(r7)     // Catch:{ JSONException -> 0x031e }
            java.lang.String r8 = "A list of item IDs is expected in a QUEUE UPDATE message."
            p231t4.C9713p.m20276k(r7, r8)     // Catch:{ JSONException -> 0x031e }
            java.lang.String r8 = "reorderItemIds"
            org.json.JSONArray r8 = r5.optJSONArray(r8)     // Catch:{ JSONException -> 0x031e }
            if (r8 == 0) goto L_0x017e
            java.util.List r7 = p150l4.C8673a.m17453l(r7)     // Catch:{ JSONException -> 0x031e }
            int r0 = r5.optInt(r0, r6)     // Catch:{ JSONException -> 0x031e }
            int[] r5 = m17603D(r8)     // Catch:{ JSONException -> 0x031e }
            java.lang.Object r5 = p231t4.C9713p.m20275j(r5)     // Catch:{ JSONException -> 0x031e }
            int[] r5 = (int[]) r5     // Catch:{ JSONException -> 0x031e }
            java.util.List r5 = p150l4.C8673a.m17453l(r5)     // Catch:{ JSONException -> 0x031e }
            l4.q r8 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r8.mo32104h(r7, r5, r0)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x017e:
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r0.mo32103g(r7)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x0184:
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r0.mo32102f(r8)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x018a:
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r0.mo32100d(r8)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x0190:
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r0.mo32101e(r8, r9)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x0196:
            l4.w r0 = r1.f12517x     // Catch:{ JSONException -> 0x031e }
            r0.mo42836d(r8, r6, r15)     // Catch:{ JSONException -> 0x031e }
            r1.m17611x(r5, r11)     // Catch:{ JSONException -> 0x031e }
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            if (r0 == 0) goto L_0x031d
            org.json.JSONArray r0 = r5.getJSONArray(r10)     // Catch:{ JSONException -> 0x031e }
            int[] r0 = m17603D(r0)     // Catch:{ JSONException -> 0x031e }
            if (r0 == 0) goto L_0x031d
            l4.q r5 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r5.mo32103g(r0)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x01b2:
            java.util.List r0 = r16.mo42841f()     // Catch:{ JSONException -> 0x031e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x031e }
        L_0x01ba:
            boolean r7 = r0.hasNext()     // Catch:{ JSONException -> 0x031e }
            if (r7 == 0) goto L_0x01d0
            java.lang.Object r7 = r0.next()     // Catch:{ JSONException -> 0x031e }
            l4.w r7 = (p150l4.C8714w) r7     // Catch:{ JSONException -> 0x031e }
            l4.r r10 = m17609v(r5)     // Catch:{ JSONException -> 0x031e }
            r11 = 2100(0x834, float:2.943E-42)
            r7.mo42836d(r8, r11, r10)     // Catch:{ JSONException -> 0x031e }
            goto L_0x01ba
        L_0x01d0:
            l4.q r0 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            if (r0 != 0) goto L_0x01d6
            goto L_0x031d
        L_0x01d6:
            com.google.android.gms.cast.MediaError r0 = com.google.android.gms.cast.MediaError.m5975I(r5)     // Catch:{ JSONException -> 0x031e }
            l4.q r5 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            r5.mo32097a(r0)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x01e0:
            l4.b r0 = r1.f12428a     // Catch:{ JSONException -> 0x031e }
            java.lang.String r7 = "received unexpected error: Invalid Request."
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x031e }
            r0.mo42759f(r7, r10)     // Catch:{ JSONException -> 0x031e }
            java.util.List r0 = r16.mo42841f()     // Catch:{ JSONException -> 0x031e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x031e }
        L_0x01f1:
            boolean r7 = r0.hasNext()     // Catch:{ JSONException -> 0x031e }
            if (r7 == 0) goto L_0x031d
            java.lang.Object r7 = r0.next()     // Catch:{ JSONException -> 0x031e }
            l4.w r7 = (p150l4.C8714w) r7     // Catch:{ JSONException -> 0x031e }
            l4.r r10 = m17609v(r5)     // Catch:{ JSONException -> 0x031e }
            r11 = 2001(0x7d1, float:2.804E-42)
            r7.mo42836d(r8, r11, r10)     // Catch:{ JSONException -> 0x031e }
            goto L_0x01f1
        L_0x0207:
            l4.w r0 = r1.f12503j     // Catch:{ JSONException -> 0x031e }
            l4.r r5 = m17609v(r5)     // Catch:{ JSONException -> 0x031e }
            r7 = 2101(0x835, float:2.944E-42)
            r0.mo42836d(r8, r7, r5)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x0213:
            l4.w r0 = r1.f12503j     // Catch:{ JSONException -> 0x031e }
            l4.r r5 = m17609v(r5)     // Catch:{ JSONException -> 0x031e }
            r7 = 2100(0x834, float:2.943E-42)
            r0.mo42836d(r8, r7, r5)     // Catch:{ JSONException -> 0x031e }
            return
        L_0x021f:
            l4.b r0 = r1.f12428a     // Catch:{ JSONException -> 0x031e }
            java.lang.String r7 = "received unexpected error: Invalid Player State."
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ JSONException -> 0x031e }
            r0.mo42759f(r7, r10)     // Catch:{ JSONException -> 0x031e }
            java.util.List r0 = r16.mo42841f()     // Catch:{ JSONException -> 0x031e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x031e }
        L_0x0230:
            boolean r7 = r0.hasNext()     // Catch:{ JSONException -> 0x031e }
            if (r7 == 0) goto L_0x031d
            java.lang.Object r7 = r0.next()     // Catch:{ JSONException -> 0x031e }
            l4.w r7 = (p150l4.C8714w) r7     // Catch:{ JSONException -> 0x031e }
            l4.r r10 = m17609v(r5)     // Catch:{ JSONException -> 0x031e }
            r11 = 2100(0x834, float:2.943E-42)
            r7.mo42836d(r8, r11, r10)     // Catch:{ JSONException -> 0x031e }
            goto L_0x0230
        L_0x0246:
            java.lang.String r0 = "status"
            org.json.JSONArray r0 = r5.getJSONArray(r0)     // Catch:{ JSONException -> 0x031e }
            int r5 = r0.length()     // Catch:{ JSONException -> 0x031e }
            if (r5 <= 0) goto L_0x02f7
            org.json.JSONObject r0 = r0.getJSONObject(r6)     // Catch:{ JSONException -> 0x031e }
            l4.w r5 = r1.f12503j     // Catch:{ JSONException -> 0x031e }
            boolean r5 = r5.mo42838f(r8)     // Catch:{ JSONException -> 0x031e }
            l4.w r7 = r1.f12508o     // Catch:{ JSONException -> 0x031e }
            boolean r7 = r7.mo42837e()     // Catch:{ JSONException -> 0x031e }
            if (r7 == 0) goto L_0x026f
            l4.w r7 = r1.f12508o     // Catch:{ JSONException -> 0x031e }
            boolean r7 = r7.mo42838f(r8)     // Catch:{ JSONException -> 0x031e }
            if (r7 == 0) goto L_0x026d
            goto L_0x026f
        L_0x026d:
            r7 = r4
            goto L_0x0281
        L_0x026f:
            l4.w r7 = r1.f12509p     // Catch:{ JSONException -> 0x031e }
            boolean r7 = r7.mo42837e()     // Catch:{ JSONException -> 0x031e }
            if (r7 == 0) goto L_0x0280
            l4.w r7 = r1.f12509p     // Catch:{ JSONException -> 0x031e }
            boolean r7 = r7.mo42838f(r8)     // Catch:{ JSONException -> 0x031e }
            if (r7 != 0) goto L_0x0280
            goto L_0x026d
        L_0x0280:
            r7 = r6
        L_0x0281:
            if (r5 != 0) goto L_0x028d
            com.google.android.gms.cast.h r5 = r1.f12499f     // Catch:{ JSONException -> 0x031e }
            if (r5 != 0) goto L_0x0288
            goto L_0x028d
        L_0x0288:
            int r0 = r5.mo32277b0(r0, r7)     // Catch:{ JSONException -> 0x031e }
            goto L_0x029c
        L_0x028d:
            com.google.android.gms.cast.h r5 = new com.google.android.gms.cast.h     // Catch:{ JSONException -> 0x031e }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x031e }
            r1.f12499f = r5     // Catch:{ JSONException -> 0x031e }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x031e }
            r1.f12498e = r10     // Catch:{ JSONException -> 0x031e }
            r0 = 127(0x7f, float:1.78E-43)
        L_0x029c:
            r5 = r0 & 1
            if (r5 == 0) goto L_0x02ac
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x031e }
            r1.f12498e = r10     // Catch:{ JSONException -> 0x031e }
            r5 = -1
            r1.f12502i = r5     // Catch:{ JSONException -> 0x031e }
            r16.m17601B()     // Catch:{ JSONException -> 0x031e }
        L_0x02ac:
            r5 = r0 & 2
            if (r5 == 0) goto L_0x02b9
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x031e }
            r1.f12498e = r10     // Catch:{ JSONException -> 0x031e }
            r16.m17601B()     // Catch:{ JSONException -> 0x031e }
        L_0x02b9:
            r5 = r0 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x02c3
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x031e }
            r1.f12498e = r10     // Catch:{ JSONException -> 0x031e }
        L_0x02c3:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x02ca
            r16.m17612y()     // Catch:{ JSONException -> 0x031e }
        L_0x02ca:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x02d1
            r16.m17600A()     // Catch:{ JSONException -> 0x031e }
        L_0x02d1:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x02d8
            r16.m17613z()     // Catch:{ JSONException -> 0x031e }
        L_0x02d8:
            r5 = r0 & 32
            if (r5 == 0) goto L_0x02e9
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x031e }
            r1.f12498e = r10     // Catch:{ JSONException -> 0x031e }
            l4.q r5 = r1.f12501h     // Catch:{ JSONException -> 0x031e }
            if (r5 == 0) goto L_0x02e9
            r5.zza()     // Catch:{ JSONException -> 0x031e }
        L_0x02e9:
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0305
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x031e }
            r1.f12498e = r10     // Catch:{ JSONException -> 0x031e }
            r16.m17601B()     // Catch:{ JSONException -> 0x031e }
            goto L_0x0305
        L_0x02f7:
            r1.f12499f = r15     // Catch:{ JSONException -> 0x031e }
            r16.m17601B()     // Catch:{ JSONException -> 0x031e }
            r16.m17612y()     // Catch:{ JSONException -> 0x031e }
            r16.m17600A()     // Catch:{ JSONException -> 0x031e }
            r16.m17613z()     // Catch:{ JSONException -> 0x031e }
        L_0x0305:
            java.util.List r0 = r16.mo42841f()     // Catch:{ JSONException -> 0x031e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x031e }
        L_0x030d:
            boolean r5 = r0.hasNext()     // Catch:{ JSONException -> 0x031e }
            if (r5 == 0) goto L_0x031d
            java.lang.Object r5 = r0.next()     // Catch:{ JSONException -> 0x031e }
            l4.w r5 = (p150l4.C8714w) r5     // Catch:{ JSONException -> 0x031e }
            r5.mo42836d(r8, r6, r15)     // Catch:{ JSONException -> 0x031e }
            goto L_0x030d
        L_0x031d:
            return
        L_0x031e:
            r0 = move-exception
            l4.b r5 = r1.f12428a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3[r6] = r0
            r3[r4] = r2
            java.lang.String r0 = "Message is malformed (%s); ignoring: %s"
            r5.mo42759f(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p150l4.C8709s.mo42827r(java.lang.String):void");
    }

    /* renamed from: s */
    public final void mo42828s(long j, int i) {
        for (C8714w d : mo42841f()) {
            d.mo42836d(j, i, (Object) null);
        }
    }

    /* renamed from: t */
    public final void mo42829t(C8705q qVar) {
        this.f12501h = qVar;
    }
}
