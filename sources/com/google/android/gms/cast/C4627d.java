package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.C4631f;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150l4.C8673a;
import p150l4.C8675b;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10679m;

/* renamed from: com.google.android.gms.cast.d */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4627d extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4627d> CREATOR = new C4699n();

    /* renamed from: o */
    private static final C8675b f4572o = new C8675b("MediaLoadRequestData");
    @Nullable

    /* renamed from: b */
    private final MediaInfo f4573b;
    @Nullable

    /* renamed from: c */
    private final C4631f f4574c;
    @Nullable

    /* renamed from: d */
    private final Boolean f4575d;

    /* renamed from: e */
    private final long f4576e;

    /* renamed from: f */
    private final double f4577f;
    @Nullable

    /* renamed from: g */
    private final long[] f4578g;
    @Nullable

    /* renamed from: h */
    String f4579h;
    @Nullable

    /* renamed from: i */
    private final JSONObject f4580i;
    @Nullable

    /* renamed from: j */
    private final String f4581j;
    @Nullable

    /* renamed from: k */
    private final String f4582k;
    @Nullable

    /* renamed from: l */
    private final String f4583l;
    @Nullable

    /* renamed from: m */
    private final String f4584m;

    /* renamed from: n */
    private long f4585n;

    /* renamed from: com.google.android.gms.cast.d$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static class C4628a {
        @Nullable

        /* renamed from: a */
        private MediaInfo f4586a;
        @Nullable

        /* renamed from: b */
        private C4631f f4587b;
        @Nullable

        /* renamed from: c */
        private Boolean f4588c = Boolean.TRUE;

        /* renamed from: d */
        private long f4589d = -1;

        /* renamed from: e */
        private double f4590e = 1.0d;
        @Nullable

        /* renamed from: f */
        private long[] f4591f;
        @Nullable

        /* renamed from: g */
        private JSONObject f4592g;
        @Nullable

        /* renamed from: h */
        private String f4593h;
        @Nullable

        /* renamed from: i */
        private String f4594i;
        @Nullable

        /* renamed from: j */
        private String f4595j;
        @Nullable

        /* renamed from: k */
        private String f4596k;

        /* renamed from: l */
        private long f4597l;

        @NonNull
        /* renamed from: a */
        public C4627d mo31990a() {
            return new C4627d(this.f4586a, this.f4587b, this.f4588c, this.f4589d, this.f4590e, this.f4591f, this.f4592g, this.f4593h, this.f4594i, this.f4595j, this.f4596k, this.f4597l);
        }

        @NonNull
        /* renamed from: b */
        public C4628a mo31991b(@Nullable long[] jArr) {
            this.f4591f = jArr;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C4628a mo31992c(@Nullable String str) {
            this.f4595j = str;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C4628a mo31993d(@Nullable String str) {
            this.f4596k = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C4628a mo31994e(@Nullable Boolean bool) {
            this.f4588c = bool;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C4628a mo31995f(@Nullable String str) {
            this.f4593h = str;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public C4628a mo31996g(@Nullable String str) {
            this.f4594i = str;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public C4628a mo31997h(long j) {
            this.f4589d = j;
            return this;
        }

        @NonNull
        /* renamed from: i */
        public C4628a mo31998i(@Nullable JSONObject jSONObject) {
            this.f4592g = jSONObject;
            return this;
        }

        @NonNull
        /* renamed from: j */
        public C4628a mo31999j(@Nullable MediaInfo mediaInfo) {
            this.f4586a = mediaInfo;
            return this;
        }

        @NonNull
        /* renamed from: k */
        public C4628a mo32000k(double d) {
            if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
                throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
            }
            this.f4590e = d;
            return this;
        }

        @NonNull
        /* renamed from: l */
        public C4628a mo32001l(@Nullable C4631f fVar) {
            this.f4587b = fVar;
            return this;
        }

        @NonNull
        /* renamed from: m */
        public final C4628a mo32002m(long j) {
            this.f4597l = j;
            return this;
        }
    }

    @NonNull
    /* renamed from: A */
    public static C4627d m6029A(@NonNull JSONObject jSONObject) {
        C4628a aVar = new C4628a();
        try {
            if (jSONObject.has("media")) {
                aVar.mo31999j(new MediaInfo(jSONObject.getJSONObject("media")));
            }
            if (jSONObject.has("queueData")) {
                C4631f.C4632a aVar2 = new C4631f.C4632a();
                aVar2.mo32027b(jSONObject.getJSONObject("queueData"));
                aVar.mo32001l(aVar2.mo32026a());
            }
            if (jSONObject.has("autoplay")) {
                aVar.mo31994e(Boolean.valueOf(jSONObject.getBoolean("autoplay")));
            } else {
                aVar.mo31994e((Boolean) null);
            }
            if (jSONObject.has("currentTime")) {
                aVar.mo31997h(C8673a.m17445d(jSONObject.getDouble("currentTime")));
            } else {
                aVar.mo31997h(-1);
            }
            aVar.mo32000k(jSONObject.optDouble("playbackRate", 1.0d));
            aVar.mo31995f(C8673a.m17444c(jSONObject, "credentials"));
            aVar.mo31996g(C8673a.m17444c(jSONObject, "credentialsType"));
            aVar.mo31992c(C8673a.m17444c(jSONObject, "atvCredentials"));
            aVar.mo31993d(C8673a.m17444c(jSONObject, "atvCredentialsType"));
            aVar.mo32002m(jSONObject.optLong("requestId"));
            JSONArray optJSONArray = jSONObject.optJSONArray("activeTrackIds");
            if (optJSONArray != null) {
                long[] jArr = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    jArr[i] = optJSONArray.getLong(i);
                }
                aVar.mo31991b(jArr);
            }
            aVar.mo31998i(jSONObject.optJSONObject("customData"));
            return aVar.mo31990a();
        } catch (JSONException unused) {
            return aVar.mo31990a();
        }
    }

    @Nullable
    /* renamed from: F */
    public long[] mo31978F() {
        return this.f4578g;
    }

    @Nullable
    /* renamed from: G */
    public Boolean mo31979G() {
        return this.f4575d;
    }

    @Nullable
    /* renamed from: H */
    public String mo31980H() {
        return this.f4581j;
    }

    @Nullable
    /* renamed from: I */
    public String mo31981I() {
        return this.f4582k;
    }

    /* renamed from: J */
    public long mo31982J() {
        return this.f4576e;
    }

    @Nullable
    /* renamed from: K */
    public MediaInfo mo31983K() {
        return this.f4573b;
    }

    /* renamed from: L */
    public double mo31984L() {
        return this.f4577f;
    }

    @Nullable
    /* renamed from: M */
    public C4631f mo31985M() {
        return this.f4574c;
    }

    /* renamed from: N */
    public long mo31986N() {
        return this.f4585n;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4627d)) {
            return false;
        }
        C4627d dVar = (C4627d) obj;
        if (C10679m.m22696a(this.f4580i, dVar.f4580i) && C9705n.m20259b(this.f4573b, dVar.f4573b) && C9705n.m20259b(this.f4574c, dVar.f4574c) && C9705n.m20259b(this.f4575d, dVar.f4575d) && this.f4576e == dVar.f4576e && this.f4577f == dVar.f4577f && Arrays.equals(this.f4578g, dVar.f4578g) && C9705n.m20259b(this.f4581j, dVar.f4581j) && C9705n.m20259b(this.f4582k, dVar.f4582k) && C9705n.m20259b(this.f4583l, dVar.f4583l) && C9705n.m20259b(this.f4584m, dVar.f4584m) && this.f4585n == dVar.f4585n) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f4573b, this.f4574c, this.f4575d, Long.valueOf(this.f4576e), Double.valueOf(this.f4577f), this.f4578g, String.valueOf(this.f4580i), this.f4581j, this.f4582k, this.f4583l, this.f4584m, Long.valueOf(this.f4585n));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f4580i;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f4579h = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 2, mo31983K(), i, false);
        C9883b.m20538r(parcel, 3, mo31985M(), i, false);
        C9883b.m20524d(parcel, 4, mo31979G(), false);
        C9883b.m20535o(parcel, 5, mo31982J());
        C9883b.m20527g(parcel, 6, mo31984L());
        C9883b.m20536p(parcel, 7, mo31978F(), false);
        C9883b.m20539s(parcel, 8, this.f4579h, false);
        C9883b.m20539s(parcel, 9, mo31980H(), false);
        C9883b.m20539s(parcel, 10, mo31981I(), false);
        C9883b.m20539s(parcel, 11, this.f4583l, false);
        C9883b.m20539s(parcel, 12, this.f4584m, false);
        C9883b.m20535o(parcel, 13, mo31986N());
        C9883b.m20522b(parcel, a);
    }

    C4627d(@Nullable MediaInfo mediaInfo, @Nullable C4631f fVar, @Nullable Boolean bool, long j, double d, @Nullable long[] jArr, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j2) {
        this(mediaInfo, fVar, bool, j, d, jArr, C8673a.m17442a(str), str2, str3, str4, str5, j2);
    }

    private C4627d(@Nullable MediaInfo mediaInfo, @Nullable C4631f fVar, @Nullable Boolean bool, long j, double d, @Nullable long[] jArr, @Nullable JSONObject jSONObject, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j2) {
        this.f4573b = mediaInfo;
        this.f4574c = fVar;
        this.f4575d = bool;
        this.f4576e = j;
        this.f4577f = d;
        this.f4578g = jArr;
        this.f4580i = jSONObject;
        this.f4581j = str;
        this.f4582k = str2;
        this.f4583l = str3;
        this.f4584m = str4;
        this.f4585n = j2;
    }
}
