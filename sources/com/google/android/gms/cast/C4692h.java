package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p109h4.C7971w0;
import p150l4.C8673a;
import p150l4.C8675b;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10679m;

/* renamed from: com.google.android.gms.cast.h */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4692h extends C9882a {

    /* renamed from: A */
    private static final C8675b f4813A = new C8675b("MediaStatus");
    @NonNull
    public static final Parcelable.Creator<C4692h> CREATOR = new C7971w0();
    @Nullable

    /* renamed from: b */
    MediaInfo f4814b;

    /* renamed from: c */
    long f4815c;

    /* renamed from: d */
    int f4816d;

    /* renamed from: e */
    double f4817e;

    /* renamed from: f */
    int f4818f;

    /* renamed from: g */
    int f4819g;

    /* renamed from: h */
    long f4820h;

    /* renamed from: i */
    long f4821i;

    /* renamed from: j */
    double f4822j;

    /* renamed from: k */
    boolean f4823k;
    @Nullable

    /* renamed from: l */
    long[] f4824l;

    /* renamed from: m */
    int f4825m;

    /* renamed from: n */
    int f4826n;
    @Nullable

    /* renamed from: o */
    String f4827o;
    @Nullable

    /* renamed from: p */
    JSONObject f4828p;

    /* renamed from: q */
    int f4829q;

    /* renamed from: r */
    final List f4830r;

    /* renamed from: s */
    boolean f4831s;
    @Nullable

    /* renamed from: t */
    C4625b f4832t;
    @Nullable

    /* renamed from: u */
    C4694i f4833u;
    @Nullable

    /* renamed from: v */
    C4626c f4834v;
    @Nullable

    /* renamed from: w */
    C4631f f4835w;

    /* renamed from: x */
    boolean f4836x;

    /* renamed from: y */
    private final SparseArray f4837y;

    /* renamed from: z */
    private final C4693a f4838z;

    /* renamed from: com.google.android.gms.cast.h$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public class C4693a {
        public C4693a() {
        }
    }

    public C4692h(@Nullable MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, @Nullable long[] jArr, int i4, int i5, @Nullable String str, int i6, @Nullable List list, boolean z2, @Nullable C4625b bVar, @Nullable C4694i iVar, @Nullable C4626c cVar, @Nullable C4631f fVar) {
        String str2 = str;
        List list2 = list;
        C4631f fVar2 = fVar;
        this.f4830r = new ArrayList();
        this.f4837y = new SparseArray();
        this.f4838z = new C4693a();
        this.f4814b = mediaInfo;
        this.f4815c = j;
        this.f4816d = i;
        this.f4817e = d;
        this.f4818f = i2;
        this.f4819g = i3;
        this.f4820h = j2;
        this.f4821i = j3;
        this.f4822j = d2;
        this.f4823k = z;
        this.f4824l = jArr;
        this.f4825m = i4;
        this.f4826n = i5;
        this.f4827o = str2;
        if (str2 != null) {
            try {
                this.f4828p = new JSONObject(this.f4827o);
            } catch (JSONException unused) {
                this.f4828p = null;
                this.f4827o = null;
            }
        } else {
            this.f4828p = null;
        }
        this.f4829q = i6;
        if (list2 != null && !list.isEmpty()) {
            m6314e0(list2);
        }
        this.f4831s = z2;
        this.f4832t = bVar;
        this.f4833u = iVar;
        this.f4834v = cVar;
        this.f4835w = fVar2;
        boolean z3 = false;
        if (fVar2 != null && fVar.mo32022O()) {
            z3 = true;
        }
        this.f4836x = z3;
    }

    /* renamed from: e0 */
    private final void m6314e0(@Nullable List list) {
        this.f4830r.clear();
        this.f4837y.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C4689g gVar = (C4689g) list.get(i);
                this.f4830r.add(gVar);
                this.f4837y.put(gVar.mo32243H(), Integer.valueOf(i));
            }
        }
    }

    /* renamed from: f0 */
    private static final boolean m6315f0(int i, int i2, int i3, int i4) {
        if (i != 1) {
            return false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return true;
                }
            } else if (i4 != 2) {
                return true;
            } else {
                return false;
            }
        }
        if (i3 == 0) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: A */
    public long[] mo32254A() {
        return this.f4824l;
    }

    @Nullable
    /* renamed from: F */
    public C4625b mo32255F() {
        return this.f4832t;
    }

    /* renamed from: G */
    public int mo32256G() {
        return this.f4816d;
    }

    @Nullable
    /* renamed from: H */
    public JSONObject mo32257H() {
        return this.f4828p;
    }

    /* renamed from: I */
    public int mo32258I() {
        return this.f4819g;
    }

    @NonNull
    /* renamed from: J */
    public Integer mo32259J(int i) {
        return (Integer) this.f4837y.get(i);
    }

    @Nullable
    /* renamed from: K */
    public C4689g mo32260K(int i) {
        Integer num = (Integer) this.f4837y.get(i);
        if (num == null) {
            return null;
        }
        return (C4689g) this.f4830r.get(num.intValue());
    }

    @Nullable
    /* renamed from: L */
    public C4626c mo32261L() {
        return this.f4834v;
    }

    /* renamed from: M */
    public int mo32262M() {
        return this.f4825m;
    }

    @Nullable
    /* renamed from: N */
    public MediaInfo mo32263N() {
        return this.f4814b;
    }

    /* renamed from: O */
    public double mo32264O() {
        return this.f4817e;
    }

    /* renamed from: P */
    public int mo32265P() {
        return this.f4818f;
    }

    /* renamed from: Q */
    public int mo32266Q() {
        return this.f4826n;
    }

    @Nullable
    /* renamed from: R */
    public C4631f mo32267R() {
        return this.f4835w;
    }

    @Nullable
    /* renamed from: S */
    public C4689g mo32268S(int i) {
        return mo32260K(i);
    }

    /* renamed from: T */
    public int mo32269T() {
        return this.f4830r.size();
    }

    /* renamed from: U */
    public int mo32270U() {
        return this.f4829q;
    }

    /* renamed from: V */
    public long mo32271V() {
        return this.f4820h;
    }

    /* renamed from: W */
    public double mo32272W() {
        return this.f4822j;
    }

    @Nullable
    /* renamed from: X */
    public C4694i mo32273X() {
        return this.f4833u;
    }

    /* renamed from: Y */
    public boolean mo32274Y(long j) {
        if ((j & this.f4821i) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public boolean mo32275Z() {
        return this.f4823k;
    }

    /* renamed from: a0 */
    public boolean mo32276a0() {
        return this.f4831s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02d6, code lost:
        if (r15 == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018a, code lost:
        if (r13.f4824l != null) goto L_0x018c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0390  */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32277b0(@androidx.annotation.NonNull org.json.JSONObject r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "extendedStatus"
            org.json.JSONObject r1 = r14.optJSONObject(r0)
            r2 = 0
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ JSONException -> 0x004b }
            r3.<init>()     // Catch:{ JSONException -> 0x004b }
            java.util.Iterator r4 = r14.keys()     // Catch:{ JSONException -> 0x004b }
        L_0x0012:
            boolean r5 = r4.hasNext()     // Catch:{ JSONException -> 0x004b }
            if (r5 == 0) goto L_0x0022
            java.lang.Object r5 = r4.next()     // Catch:{ JSONException -> 0x004b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x004b }
            r3.add(r5)     // Catch:{ JSONException -> 0x004b }
            goto L_0x0012
        L_0x0022:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004b }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ JSONException -> 0x004b }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ JSONException -> 0x004b }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ JSONException -> 0x004b }
            r4.<init>(r14, r3)     // Catch:{ JSONException -> 0x004b }
            java.util.Iterator r3 = r1.keys()     // Catch:{ JSONException -> 0x004b }
        L_0x0033:
            boolean r5 = r3.hasNext()     // Catch:{ JSONException -> 0x004b }
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r3.next()     // Catch:{ JSONException -> 0x004b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x004b }
            java.lang.Object r6 = r1.get(r5)     // Catch:{ JSONException -> 0x004b }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x004b }
            goto L_0x0033
        L_0x0047:
            r4.remove(r0)     // Catch:{ JSONException -> 0x004b }
            r14 = r4
        L_0x004b:
            java.lang.String r0 = "mediaSessionId"
            long r0 = r14.getLong(r0)
            long r3 = r13.f4815c
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r4 = 1
            if (r3 == 0) goto L_0x005c
            r13.f4815c = r0
            r0 = r4
            goto L_0x005d
        L_0x005c:
            r0 = r2
        L_0x005d:
            java.lang.String r1 = "playerState"
            boolean r3 = r14.has(r1)
            r5 = 2
            if (r3 == 0) goto L_0x00e5
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r3 = "IDLE"
            boolean r3 = r1.equals(r3)
            r6 = 3
            r7 = 4
            if (r3 == 0) goto L_0x0076
            r1 = r4
            goto L_0x009f
        L_0x0076:
            java.lang.String r3 = "PLAYING"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0080
            r1 = r5
            goto L_0x009f
        L_0x0080:
            java.lang.String r3 = "PAUSED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x008a
            r1 = r6
            goto L_0x009f
        L_0x008a:
            java.lang.String r3 = "BUFFERING"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0094
            r1 = r7
            goto L_0x009f
        L_0x0094:
            java.lang.String r3 = "LOADING"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009e
            r1 = 5
            goto L_0x009f
        L_0x009e:
            r1 = r2
        L_0x009f:
            int r3 = r13.f4818f
            if (r1 == r3) goto L_0x00a7
            r13.f4818f = r1
            r0 = r0 | 2
        L_0x00a7:
            if (r1 != r4) goto L_0x00e5
            java.lang.String r1 = "idleReason"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00e5
            java.lang.String r1 = r14.getString(r1)
            java.lang.String r3 = "CANCELLED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00bf
            r6 = r5
            goto L_0x00dd
        L_0x00bf:
            java.lang.String r3 = "INTERRUPTED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00c8
            goto L_0x00dd
        L_0x00c8:
            java.lang.String r3 = "FINISHED"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x00d2
            r6 = r4
            goto L_0x00dd
        L_0x00d2:
            java.lang.String r3 = "ERROR"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00dc
            r6 = r7
            goto L_0x00dd
        L_0x00dc:
            r6 = r2
        L_0x00dd:
            int r1 = r13.f4819g
            if (r6 == r1) goto L_0x00e5
            r13.f4819g = r6
            r0 = r0 | 2
        L_0x00e5:
            java.lang.String r1 = "playbackRate"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00fb
            double r6 = r14.getDouble(r1)
            double r8 = r13.f4817e
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00fb
            r13.f4817e = r6
            r0 = r0 | 2
        L_0x00fb:
            java.lang.String r1 = "currentTime"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x0117
            double r6 = r14.getDouble(r1)
            long r6 = p150l4.C8673a.m17445d(r6)
            long r8 = r13.f4820h
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0115
            r13.f4820h = r6
            r0 = r0 | 2
        L_0x0115:
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x0117:
            java.lang.String r1 = "supportedMediaCommands"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x012d
            long r6 = r14.getLong(r1)
            long r8 = r13.f4821i
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012d
            r13.f4821i = r6
            r0 = r0 | 2
        L_0x012d:
            java.lang.String r1 = "volume"
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x0159
            if (r15 != 0) goto L_0x0159
            org.json.JSONObject r15 = r14.getJSONObject(r1)
            java.lang.String r1 = "level"
            double r6 = r15.getDouble(r1)
            double r8 = r13.f4822j
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x014b
            r13.f4822j = r6
            r0 = r0 | 2
        L_0x014b:
            java.lang.String r1 = "muted"
            boolean r15 = r15.getBoolean(r1)
            boolean r1 = r13.f4823k
            if (r15 == r1) goto L_0x0159
            r13.f4823k = r15
            r0 = r0 | 2
        L_0x0159:
            java.lang.String r15 = "activeTrackIds"
            boolean r1 = r14.has(r15)
            r3 = 0
            if (r1 == 0) goto L_0x0167
            org.json.JSONArray r15 = r14.getJSONArray(r15)
            goto L_0x0168
        L_0x0167:
            r15 = r3
        L_0x0168:
            long[] r15 = p150l4.C8673a.m17457p(r15)
            if (r15 == 0) goto L_0x0188
            long[] r1 = r13.f4824l
            if (r1 != 0) goto L_0x0173
            goto L_0x018c
        L_0x0173:
            int r1 = r1.length
            int r6 = r15.length
            if (r1 != r6) goto L_0x018c
            r1 = r2
        L_0x0178:
            int r6 = r15.length
            if (r1 >= r6) goto L_0x0190
            long[] r6 = r13.f4824l
            r7 = r6[r1]
            r9 = r15[r1]
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x018c
            int r1 = r1 + 1
            goto L_0x0178
        L_0x0188:
            long[] r1 = r13.f4824l
            if (r1 == 0) goto L_0x0190
        L_0x018c:
            r13.f4824l = r15
            r0 = r0 | 2
        L_0x0190:
            java.lang.String r15 = "customData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01a2
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r13.f4828p = r15
            r13.f4827o = r3
            r0 = r0 | 2
        L_0x01a2:
            java.lang.String r15 = "media"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01cb
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            com.google.android.gms.cast.MediaInfo r1 = new com.google.android.gms.cast.MediaInfo
            r1.<init>(r15)
            com.google.android.gms.cast.MediaInfo r6 = r13.f4814b
            if (r6 == 0) goto L_0x01bd
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x01c1
        L_0x01bd:
            r13.f4814b = r1
            r0 = r0 | 2
        L_0x01c1:
            java.lang.String r1 = "metadata"
            boolean r15 = r15.has(r1)
            if (r15 == 0) goto L_0x01cb
            r0 = r0 | 4
        L_0x01cb:
            java.lang.String r15 = "currentItemId"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x01df
            int r15 = r14.getInt(r15)
            int r1 = r13.f4816d
            if (r1 == r15) goto L_0x01df
            r13.f4816d = r15
            r0 = r0 | 2
        L_0x01df:
            java.lang.String r15 = "preloadedItemId"
            int r15 = r14.optInt(r15, r2)
            int r1 = r13.f4826n
            if (r1 == r15) goto L_0x01ed
            r13.f4826n = r15
            r0 = r0 | 16
        L_0x01ed:
            java.lang.String r15 = "loadingItemId"
            int r15 = r14.optInt(r15, r2)
            int r1 = r13.f4825m
            if (r1 == r15) goto L_0x01fb
            r13.f4825m = r15
            r0 = r0 | 2
        L_0x01fb:
            com.google.android.gms.cast.MediaInfo r15 = r13.f4814b
            if (r15 != 0) goto L_0x0201
            r15 = -1
            goto L_0x0205
        L_0x0201:
            int r15 = r15.mo31928Q()
        L_0x0205:
            int r1 = r13.f4818f
            int r6 = r13.f4819g
            int r7 = r13.f4825m
            boolean r15 = m6315f0(r1, r6, r7, r15)
            if (r15 != 0) goto L_0x02d9
            java.lang.String r15 = "repeatMode"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x023e
            java.lang.String r15 = r14.getString(r15)
            java.lang.Integer r15 = p160m4.C8822a.m17880a(r15)
            if (r15 != 0) goto L_0x0226
            int r15 = r13.f4829q
            goto L_0x022a
        L_0x0226:
            int r15 = r15.intValue()
        L_0x022a:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            int r1 = r13.f4829q
            int r6 = r15.intValue()
            if (r1 == r6) goto L_0x023e
            int r15 = r15.intValue()
            r13.f4829q = r15
            r15 = r4
            goto L_0x023f
        L_0x023e:
            r15 = r2
        L_0x023f:
            java.lang.String r1 = "items"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x02d6
            org.json.JSONArray r1 = r14.getJSONArray(r1)
            int r6 = r1.length()
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r8 = r2
        L_0x0255:
            if (r8 >= r6) goto L_0x026b
            org.json.JSONObject r9 = r1.getJSONObject(r8)
            java.lang.String r10 = "itemId"
            int r9 = r9.getInt(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.put(r8, r9)
            int r8 = r8 + 1
            goto L_0x0255
        L_0x026b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = r2
        L_0x0271:
            if (r9 >= r6) goto L_0x02c6
            java.lang.Object r10 = r7.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            org.json.JSONObject r11 = r1.getJSONObject(r9)
            int r12 = r10.intValue()
            com.google.android.gms.cast.g r12 = r13.mo32260K(r12)
            if (r12 == 0) goto L_0x029e
            boolean r11 = r12.mo32240A(r11)
            r15 = r15 | r11
            r8.add(r12)
            int r10 = r10.intValue()
            java.lang.Integer r10 = r13.mo32259J(r10)
            int r10 = r10.intValue()
            if (r9 == r10) goto L_0x02c3
            goto L_0x02c2
        L_0x029e:
            int r15 = r10.intValue()
            int r10 = r13.f4816d
            if (r15 != r10) goto L_0x02ba
            com.google.android.gms.cast.MediaInfo r15 = r13.f4814b
            if (r15 == 0) goto L_0x02ba
            com.google.android.gms.cast.g$a r10 = new com.google.android.gms.cast.g$a
            r10.<init>((com.google.android.gms.cast.MediaInfo) r15)
            com.google.android.gms.cast.g r15 = r10.mo32253a()
            r15.mo32240A(r11)
            r8.add(r15)
            goto L_0x02c2
        L_0x02ba:
            com.google.android.gms.cast.g r15 = new com.google.android.gms.cast.g
            r15.<init>(r11)
            r8.add(r15)
        L_0x02c2:
            r15 = r4
        L_0x02c3:
            int r9 = r9 + 1
            goto L_0x0271
        L_0x02c6:
            java.util.List r1 = r13.f4830r
            int r1 = r1.size()
            if (r1 == r6) goto L_0x02d0
            r1 = r2
            goto L_0x02d1
        L_0x02d0:
            r1 = r4
        L_0x02d1:
            r1 = r1 ^ r4
            r15 = r15 | r1
            r13.m6314e0(r8)
        L_0x02d6:
            if (r15 == 0) goto L_0x02f5
            goto L_0x02f3
        L_0x02d9:
            r13.f4816d = r2
            r13.f4825m = r2
            r13.f4826n = r2
            java.util.List r15 = r13.f4830r
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x02f5
            r13.f4829q = r2
            java.util.List r15 = r13.f4830r
            r15.clear()
            android.util.SparseArray r15 = r13.f4837y
            r15.clear()
        L_0x02f3:
            r0 = r0 | 8
        L_0x02f5:
            java.lang.String r15 = "breakStatus"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.b r15 = com.google.android.gms.cast.C4625b.m6018J(r15)
            com.google.android.gms.cast.b r1 = r13.f4832t
            if (r1 != 0) goto L_0x0305
            if (r15 != 0) goto L_0x030d
        L_0x0305:
            if (r1 == 0) goto L_0x0322
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0322
        L_0x030d:
            if (r15 == 0) goto L_0x031c
            java.lang.String r1 = r15.mo31964F()
            if (r1 != 0) goto L_0x031b
            java.lang.String r1 = r15.mo31963A()
            if (r1 == 0) goto L_0x031c
        L_0x031b:
            r2 = r4
        L_0x031c:
            r13.f4831s = r2
            r13.f4832t = r15
            r0 = r0 | 32
        L_0x0322:
            java.lang.String r15 = "videoInfo"
            org.json.JSONObject r15 = r14.optJSONObject(r15)
            com.google.android.gms.cast.i r15 = com.google.android.gms.cast.C4694i.m6342H(r15)
            com.google.android.gms.cast.i r1 = r13.f4833u
            if (r1 != 0) goto L_0x0332
            if (r15 != 0) goto L_0x033a
        L_0x0332:
            if (r1 == 0) goto L_0x033e
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x033e
        L_0x033a:
            r13.f4833u = r15
            r0 = r0 | 64
        L_0x033e:
            java.lang.String r15 = "breakInfo"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0353
            com.google.android.gms.cast.MediaInfo r1 = r13.f4814b
            if (r1 == 0) goto L_0x0353
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.mo31932U(r15)
            r0 = r0 | 2
        L_0x0353:
            java.lang.String r15 = "queueData"
            boolean r1 = r14.has(r15)
            if (r1 == 0) goto L_0x0379
            com.google.android.gms.cast.f$a r1 = new com.google.android.gms.cast.f$a
            r1.<init>()
            org.json.JSONObject r15 = r14.getJSONObject(r15)
            r1.mo32027b(r15)
            com.google.android.gms.cast.f r15 = r1.mo32026a()
            r13.f4835w = r15
            boolean r15 = r15.mo32022O()
            boolean r1 = r13.f4836x
            if (r1 == r15) goto L_0x0379
            r13.f4836x = r15
            r0 = r0 | 8
        L_0x0379:
            java.lang.String r15 = "liveSeekableRange"
            boolean r15 = r14.has(r15)
            if (r15 == 0) goto L_0x0390
            java.lang.String r15 = "liveSeekableRange"
            org.json.JSONObject r14 = r14.optJSONObject(r15)
            com.google.android.gms.cast.c r14 = com.google.android.gms.cast.C4626c.m6024I(r14)
            r13.f4834v = r14
            r14 = r0 | 2
            goto L_0x0399
        L_0x0390:
            com.google.android.gms.cast.c r14 = r13.f4834v
            if (r14 == 0) goto L_0x0396
            r0 = r0 | 2
        L_0x0396:
            r13.f4834v = r3
            r14 = r0
        L_0x0399:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.C4692h.mo32277b0(org.json.JSONObject, int):int");
    }

    /* renamed from: c0 */
    public final long mo32278c0() {
        return this.f4815c;
    }

    /* renamed from: d0 */
    public final boolean mo32279d0() {
        int i;
        MediaInfo mediaInfo = this.f4814b;
        if (mediaInfo == null) {
            i = -1;
        } else {
            i = mediaInfo.mo31928Q();
        }
        return m6315f0(this.f4818f, this.f4819g, this.f4825m, i);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4692h)) {
            return false;
        }
        C4692h hVar = (C4692h) obj;
        if (this.f4828p != null) {
            z = false;
        } else {
            z = true;
        }
        if (hVar.f4828p != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2 && this.f4815c == hVar.f4815c && this.f4816d == hVar.f4816d && this.f4817e == hVar.f4817e && this.f4818f == hVar.f4818f && this.f4819g == hVar.f4819g && this.f4820h == hVar.f4820h && this.f4822j == hVar.f4822j && this.f4823k == hVar.f4823k && this.f4825m == hVar.f4825m && this.f4826n == hVar.f4826n && this.f4829q == hVar.f4829q && Arrays.equals(this.f4824l, hVar.f4824l) && C8673a.m17455n(Long.valueOf(this.f4821i), Long.valueOf(hVar.f4821i)) && C8673a.m17455n(this.f4830r, hVar.f4830r) && C8673a.m17455n(this.f4814b, hVar.f4814b) && (((jSONObject = this.f4828p) == null || (jSONObject2 = hVar.f4828p) == null || C10679m.m22696a(jSONObject, jSONObject2)) && this.f4831s == hVar.mo32276a0() && C8673a.m17455n(this.f4832t, hVar.f4832t) && C8673a.m17455n(this.f4833u, hVar.f4833u) && C8673a.m17455n(this.f4834v, hVar.f4834v) && C9705n.m20259b(this.f4835w, hVar.f4835w) && this.f4836x == hVar.f4836x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f4814b, Long.valueOf(this.f4815c), Integer.valueOf(this.f4816d), Double.valueOf(this.f4817e), Integer.valueOf(this.f4818f), Integer.valueOf(this.f4819g), Long.valueOf(this.f4820h), Long.valueOf(this.f4821i), Double.valueOf(this.f4822j), Boolean.valueOf(this.f4823k), Integer.valueOf(Arrays.hashCode(this.f4824l)), Integer.valueOf(this.f4825m), Integer.valueOf(this.f4826n), String.valueOf(this.f4828p), Integer.valueOf(this.f4829q), this.f4830r, Boolean.valueOf(this.f4831s), this.f4832t, this.f4833u, this.f4834v, this.f4835w);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f4828p;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f4827o = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 2, mo32263N(), i, false);
        C9883b.m20535o(parcel, 3, this.f4815c);
        C9883b.m20532l(parcel, 4, mo32256G());
        C9883b.m20527g(parcel, 5, mo32264O());
        C9883b.m20532l(parcel, 6, mo32265P());
        C9883b.m20532l(parcel, 7, mo32258I());
        C9883b.m20535o(parcel, 8, mo32271V());
        C9883b.m20535o(parcel, 9, this.f4821i);
        C9883b.m20527g(parcel, 10, mo32272W());
        C9883b.m20523c(parcel, 11, mo32275Z());
        C9883b.m20536p(parcel, 12, mo32254A(), false);
        C9883b.m20532l(parcel, 13, mo32262M());
        C9883b.m20532l(parcel, 14, mo32266Q());
        C9883b.m20539s(parcel, 15, this.f4827o, false);
        C9883b.m20532l(parcel, 16, this.f4829q);
        C9883b.m20543w(parcel, 17, this.f4830r, false);
        C9883b.m20523c(parcel, 18, mo32276a0());
        C9883b.m20538r(parcel, 19, mo32255F(), i, false);
        C9883b.m20538r(parcel, 20, mo32273X(), i, false);
        C9883b.m20538r(parcel, 21, mo32261L(), i, false);
        C9883b.m20538r(parcel, 22, mo32267R(), i, false);
        C9883b.m20522b(parcel, a);
    }

    public C4692h(@NonNull JSONObject jSONObject) {
        this((MediaInfo) null, 0, 0, 0.0d, 0, 0, 0, 0, 0.0d, false, (long[]) null, 0, 0, (String) null, 0, (List) null, false, (C4625b) null, (C4694i) null, (C4626c) null, (C4631f) null);
        mo32277b0(jSONObject, 0);
    }
}
