package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p109h4.C7965t0;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.f */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4631f extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4631f> CREATOR = new C4701p();
    @Nullable

    /* renamed from: b */
    private String f4604b;
    @Nullable

    /* renamed from: c */
    private String f4605c;

    /* renamed from: d */
    private int f4606d;
    @Nullable

    /* renamed from: e */
    private String f4607e;
    @Nullable

    /* renamed from: f */
    private C4629e f4608f;

    /* renamed from: g */
    private int f4609g;
    @Nullable

    /* renamed from: h */
    private List f4610h;

    /* renamed from: i */
    private int f4611i;

    /* renamed from: j */
    private long f4612j;

    /* renamed from: k */
    private boolean f4613k;

    /* renamed from: com.google.android.gms.cast.f$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static class C4632a {

        /* renamed from: a */
        private final C4631f f4614a = new C4631f((C7965t0) null);

        @NonNull
        /* renamed from: a */
        public C4631f mo32026a() {
            return new C4631f(this.f4614a, (C7965t0) null);
        }

        @NonNull
        /* renamed from: b */
        public final C4632a mo32027b(@NonNull JSONObject jSONObject) {
            C4631f.m6061N(this.f4614a, jSONObject);
            return this;
        }
    }

    private C4631f() {
        m6062P();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m6061N(com.google.android.gms.cast.C4631f r11, org.json.JSONObject r12) {
        /*
            r11.m6062P()
            if (r12 != 0) goto L_0x0006
            return
        L_0x0006:
            java.lang.String r0 = "id"
            java.lang.String r0 = p150l4.C8673a.m17444c(r12, r0)
            r11.f4604b = r0
            java.lang.String r0 = "entity"
            java.lang.String r0 = p150l4.C8673a.m17444c(r12, r0)
            r11.f4605c = r0
            java.lang.String r0 = "queueType"
            java.lang.String r0 = r12.optString(r0)
            int r1 = r0.hashCode()
            r2 = 7
            r3 = 6
            r4 = 8
            r5 = 0
            r6 = 5
            r7 = 2
            r8 = 3
            r9 = 4
            r10 = 1
            switch(r1) {
                case -1803151310: goto L_0x007f;
                case -1758903120: goto L_0x0075;
                case -1632865838: goto L_0x006b;
                case -1319760993: goto L_0x0061;
                case -1088524588: goto L_0x0057;
                case 62359119: goto L_0x004d;
                case 73549584: goto L_0x0043;
                case 393100598: goto L_0x0039;
                case 902303413: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0089
        L_0x002f:
            java.lang.String r1 = "LIVE_TV"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r2
            goto L_0x008a
        L_0x0039:
            java.lang.String r1 = "VIDEO_PLAYLIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r3
            goto L_0x008a
        L_0x0043:
            java.lang.String r1 = "MOVIE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r4
            goto L_0x008a
        L_0x004d:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r5
            goto L_0x008a
        L_0x0057:
            java.lang.String r1 = "TV_SERIES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r6
            goto L_0x008a
        L_0x0061:
            java.lang.String r1 = "AUDIOBOOK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r7
            goto L_0x008a
        L_0x006b:
            java.lang.String r1 = "PLAYLIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r10
            goto L_0x008a
        L_0x0075:
            java.lang.String r1 = "RADIO_STATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r8
            goto L_0x008a
        L_0x007f:
            java.lang.String r1 = "PODCAST_SERIES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0089
            r0 = r9
            goto L_0x008a
        L_0x0089:
            r0 = -1
        L_0x008a:
            switch(r0) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a2;
                case 3: goto L_0x009f;
                case 4: goto L_0x009c;
                case 5: goto L_0x0099;
                case 6: goto L_0x0096;
                case 7: goto L_0x0093;
                case 8: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x00aa
        L_0x008e:
            r0 = 9
            r11.f4606d = r0
            goto L_0x00aa
        L_0x0093:
            r11.f4606d = r4
            goto L_0x00aa
        L_0x0096:
            r11.f4606d = r2
            goto L_0x00aa
        L_0x0099:
            r11.f4606d = r3
            goto L_0x00aa
        L_0x009c:
            r11.f4606d = r6
            goto L_0x00aa
        L_0x009f:
            r11.f4606d = r9
            goto L_0x00aa
        L_0x00a2:
            r11.f4606d = r8
            goto L_0x00aa
        L_0x00a5:
            r11.f4606d = r7
            goto L_0x00aa
        L_0x00a8:
            r11.f4606d = r10
        L_0x00aa:
            java.lang.String r0 = "name"
            java.lang.String r0 = p150l4.C8673a.m17444c(r12, r0)
            r11.f4607e = r0
            java.lang.String r0 = "containerMetadata"
            boolean r1 = r12.has(r0)
            if (r1 == 0) goto L_0x00bf
            org.json.JSONObject r0 = r12.optJSONObject(r0)
            goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 == 0) goto L_0x00d0
            com.google.android.gms.cast.e$a r1 = new com.google.android.gms.cast.e$a
            r1.<init>()
            r1.mo32012b(r0)
            com.google.android.gms.cast.e r0 = r1.mo32011a()
            r11.f4608f = r0
        L_0x00d0:
            java.lang.String r0 = "repeatMode"
            java.lang.String r0 = r12.optString(r0)
            java.lang.Integer r0 = p160m4.C8822a.m17880a(r0)
            if (r0 == 0) goto L_0x00e2
            int r0 = r0.intValue()
            r11.f4609g = r0
        L_0x00e2:
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r12.optJSONArray(r0)
            if (r0 == 0) goto L_0x0108
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.f4610h = r1
        L_0x00f1:
            int r2 = r0.length()
            if (r5 >= r2) goto L_0x0108
            org.json.JSONObject r2 = r0.optJSONObject(r5)
            if (r2 == 0) goto L_0x0105
            com.google.android.gms.cast.g r3 = new com.google.android.gms.cast.g     // Catch:{ JSONException -> 0x0105 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x0105 }
            r1.add(r3)     // Catch:{ JSONException -> 0x0105 }
        L_0x0105:
            int r5 = r5 + 1
            goto L_0x00f1
        L_0x0108:
            java.lang.String r0 = "startIndex"
            int r1 = r11.f4611i
            int r0 = r12.optInt(r0, r1)
            r11.f4611i = r0
            java.lang.String r0 = "startTime"
            boolean r1 = r12.has(r0)
            if (r1 == 0) goto L_0x0127
            long r1 = r11.f4612j
            double r1 = (double) r1
            double r0 = r12.optDouble(r0, r1)
            long r0 = p150l4.C8673a.m17445d(r0)
            r11.f4612j = r0
        L_0x0127:
            java.lang.String r0 = "shuffle"
            boolean r12 = r12.optBoolean(r0)
            r11.f4613k = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.C4631f.m6061N(com.google.android.gms.cast.f, org.json.JSONObject):void");
    }

    /* renamed from: P */
    private final void m6062P() {
        this.f4604b = null;
        this.f4605c = null;
        this.f4606d = 0;
        this.f4607e = null;
        this.f4609g = 0;
        this.f4610h = null;
        this.f4611i = 0;
        this.f4612j = -1;
        this.f4613k = false;
    }

    @Nullable
    /* renamed from: A */
    public C4629e mo32013A() {
        return this.f4608f;
    }

    @Nullable
    /* renamed from: F */
    public String mo32014F() {
        return this.f4605c;
    }

    @Nullable
    /* renamed from: G */
    public List<C4689g> mo32015G() {
        List list = this.f4610h;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @Nullable
    /* renamed from: H */
    public String mo32016H() {
        return this.f4607e;
    }

    @Nullable
    /* renamed from: I */
    public String mo32017I() {
        return this.f4604b;
    }

    /* renamed from: J */
    public int mo32018J() {
        return this.f4606d;
    }

    /* renamed from: K */
    public int mo32019K() {
        return this.f4609g;
    }

    /* renamed from: L */
    public int mo32020L() {
        return this.f4611i;
    }

    /* renamed from: M */
    public long mo32021M() {
        return this.f4612j;
    }

    /* renamed from: O */
    public final boolean mo32022O() {
        return this.f4613k;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4631f)) {
            return false;
        }
        C4631f fVar = (C4631f) obj;
        if (!TextUtils.equals(this.f4604b, fVar.f4604b) || !TextUtils.equals(this.f4605c, fVar.f4605c) || this.f4606d != fVar.f4606d || !TextUtils.equals(this.f4607e, fVar.f4607e) || !C9705n.m20259b(this.f4608f, fVar.f4608f) || this.f4609g != fVar.f4609g || !C9705n.m20259b(this.f4610h, fVar.f4610h) || this.f4611i != fVar.f4611i || this.f4612j != fVar.f4612j || this.f4613k != fVar.f4613k) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f4604b, this.f4605c, Integer.valueOf(this.f4606d), this.f4607e, this.f4608f, Integer.valueOf(this.f4609g), this.f4610h, Integer.valueOf(this.f4611i), Long.valueOf(this.f4612j), Boolean.valueOf(this.f4613k));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo32017I(), false);
        C9883b.m20539s(parcel, 3, mo32014F(), false);
        C9883b.m20532l(parcel, 4, mo32018J());
        C9883b.m20539s(parcel, 5, mo32016H(), false);
        C9883b.m20538r(parcel, 6, mo32013A(), i, false);
        C9883b.m20532l(parcel, 7, mo32019K());
        C9883b.m20543w(parcel, 8, mo32015G(), false);
        C9883b.m20532l(parcel, 9, mo32020L());
        C9883b.m20535o(parcel, 10, mo32021M());
        C9883b.m20523c(parcel, 11, this.f4613k);
        C9883b.m20522b(parcel, a);
    }

    /* synthetic */ C4631f(C7965t0 t0Var) {
        m6062P();
    }

    /* synthetic */ C4631f(C4631f fVar, C7965t0 t0Var) {
        this.f4604b = fVar.f4604b;
        this.f4605c = fVar.f4605c;
        this.f4606d = fVar.f4606d;
        this.f4607e = fVar.f4607e;
        this.f4608f = fVar.f4608f;
        this.f4609g = fVar.f4609g;
        this.f4610h = fVar.f4610h;
        this.f4611i = fVar.f4611i;
        this.f4612j = fVar.f4612j;
        this.f4613k = fVar.f4613k;
    }

    C4631f(@Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable C4629e eVar, int i2, @Nullable List list, int i3, long j, boolean z) {
        this.f4604b = str;
        this.f4605c = str2;
        this.f4606d = i;
        this.f4607e = str3;
        this.f4608f = eVar;
        this.f4609g = i2;
        this.f4610h = list;
        this.f4611i = i3;
        this.f4612j = j;
        this.f4613k = z;
    }
}
