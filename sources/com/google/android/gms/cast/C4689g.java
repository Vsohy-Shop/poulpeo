package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p109h4.C7967u0;
import p150l4.C8673a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10679m;

/* renamed from: com.google.android.gms.cast.g */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4689g extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4689g> CREATOR = new C4702q();
    @Nullable

    /* renamed from: b */
    private MediaInfo f4801b;

    /* renamed from: c */
    private int f4802c;

    /* renamed from: d */
    private boolean f4803d;

    /* renamed from: e */
    private double f4804e;

    /* renamed from: f */
    private double f4805f;

    /* renamed from: g */
    private double f4806g;
    @Nullable

    /* renamed from: h */
    private long[] f4807h;
    @Nullable

    /* renamed from: i */
    String f4808i;
    @Nullable

    /* renamed from: j */
    private JSONObject f4809j;

    /* renamed from: k */
    private final C4691b f4810k;

    /* renamed from: com.google.android.gms.cast.g$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static class C4690a {

        /* renamed from: a */
        private final C4689g f4811a;

        public C4690a(@NonNull MediaInfo mediaInfo) {
            this.f4811a = new C4689g(mediaInfo, (C7967u0) null);
        }

        @NonNull
        /* renamed from: a */
        public C4689g mo32253a() {
            this.f4811a.mo32249N();
            return this.f4811a;
        }

        public C4690a(@NonNull JSONObject jSONObject) {
            this.f4811a = new C4689g(jSONObject);
        }
    }

    /* renamed from: com.google.android.gms.cast.g$b */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public class C4691b {
        public C4691b() {
        }
    }

    C4689g(@Nullable MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, @Nullable long[] jArr, @Nullable String str) {
        this.f4804e = Double.NaN;
        this.f4810k = new C4691b();
        this.f4801b = mediaInfo;
        this.f4802c = i;
        this.f4803d = z;
        this.f4804e = d;
        this.f4805f = d2;
        this.f4806g = d3;
        this.f4807h = jArr;
        this.f4808i = str;
        if (str != null) {
            try {
                this.f4809j = new JSONObject(this.f4808i);
            } catch (JSONException unused) {
                this.f4809j = null;
                this.f4808i = null;
            }
        } else {
            this.f4809j = null;
        }
    }

    /* renamed from: A */
    public boolean mo32240A(@NonNull JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f4801b = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f4802c != (i = jSONObject.getInt("itemId"))) {
            this.f4802c = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f4803d != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f4803d = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.f4804e) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.f4804e) > 1.0E-7d)) {
            this.f4804e = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f4805f) > 1.0E-7d) {
                this.f4805f = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f4806g) > 1.0E-7d) {
                this.f4806g = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.f4807h;
            if (jArr2 != null && jArr2.length == length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (this.f4807h[i3] != jArr[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            z3 = true;
        } else {
            jArr = null;
        }
        if (z3) {
            this.f4807h = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f4809j = jSONObject.getJSONObject("customData");
        return true;
    }

    @Nullable
    /* renamed from: F */
    public long[] mo32241F() {
        return this.f4807h;
    }

    /* renamed from: G */
    public boolean mo32242G() {
        return this.f4803d;
    }

    /* renamed from: H */
    public int mo32243H() {
        return this.f4802c;
    }

    @Nullable
    /* renamed from: I */
    public MediaInfo mo32244I() {
        return this.f4801b;
    }

    /* renamed from: J */
    public double mo32245J() {
        return this.f4805f;
    }

    /* renamed from: K */
    public double mo32246K() {
        return this.f4806g;
    }

    /* renamed from: L */
    public double mo32247L() {
        return this.f4804e;
    }

    @NonNull
    /* renamed from: M */
    public JSONObject mo32248M() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f4801b;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.mo31931T());
            }
            int i = this.f4802c;
            if (i != 0) {
                jSONObject.put("itemId", i);
            }
            jSONObject.put("autoplay", this.f4803d);
            if (!Double.isNaN(this.f4804e)) {
                jSONObject.put("startTime", this.f4804e);
            }
            double d = this.f4805f;
            if (d != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d);
            }
            jSONObject.put("preloadTime", this.f4806g);
            if (this.f4807h != null) {
                JSONArray jSONArray = new JSONArray();
                for (long put : this.f4807h) {
                    jSONArray.put(put);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f4809j;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo32249N() {
        if (this.f4801b == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (!Double.isNaN(this.f4804e) && this.f4804e < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(this.f4805f)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(this.f4806g) || this.f4806g < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4689g)) {
            return false;
        }
        C4689g gVar = (C4689g) obj;
        JSONObject jSONObject = this.f4809j;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = gVar.f4809j;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C10679m.m22696a(jSONObject, jSONObject2)) && C8673a.m17455n(this.f4801b, gVar.f4801b) && this.f4802c == gVar.f4802c && this.f4803d == gVar.f4803d && (((Double.isNaN(this.f4804e) && Double.isNaN(gVar.f4804e)) || this.f4804e == gVar.f4804e) && this.f4805f == gVar.f4805f && this.f4806g == gVar.f4806g && Arrays.equals(this.f4807h, gVar.f4807h))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f4801b, Integer.valueOf(this.f4802c), Boolean.valueOf(this.f4803d), Double.valueOf(this.f4804e), Double.valueOf(this.f4805f), Double.valueOf(this.f4806g), Integer.valueOf(Arrays.hashCode(this.f4807h)), String.valueOf(this.f4809j));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f4809j;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f4808i = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 2, mo32244I(), i, false);
        C9883b.m20532l(parcel, 3, mo32243H());
        C9883b.m20523c(parcel, 4, mo32242G());
        C9883b.m20527g(parcel, 5, mo32247L());
        C9883b.m20527g(parcel, 6, mo32245J());
        C9883b.m20527g(parcel, 7, mo32246K());
        C9883b.m20536p(parcel, 8, mo32241F(), false);
        C9883b.m20539s(parcel, 9, this.f4808i, false);
        C9883b.m20522b(parcel, a);
    }

    /* synthetic */ C4689g(MediaInfo mediaInfo, C7967u0 u0Var) {
        this(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, (long[]) null, (String) null);
        if (mediaInfo == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
    }

    public C4689g(@NonNull JSONObject jSONObject) {
        this((MediaInfo) null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, (long[]) null, (String) null);
        mo32240A(jSONObject);
    }
}
