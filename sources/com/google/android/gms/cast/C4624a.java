package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p109h4.C7946k;
import p150l4.C8673a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.a */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4624a extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4624a> CREATOR = new C4695j();

    /* renamed from: b */
    private final String f4548b;
    @Nullable

    /* renamed from: c */
    private final String f4549c;

    /* renamed from: d */
    private final long f4550d;
    @Nullable

    /* renamed from: e */
    private final String f4551e;
    @Nullable

    /* renamed from: f */
    private final String f4552f;
    @Nullable

    /* renamed from: g */
    private final String f4553g;
    @Nullable

    /* renamed from: h */
    private String f4554h;
    @Nullable

    /* renamed from: i */
    private final String f4555i;
    @Nullable

    /* renamed from: j */
    private final String f4556j;

    /* renamed from: k */
    private final long f4557k;
    @Nullable

    /* renamed from: l */
    private final String f4558l;
    @Nullable

    /* renamed from: m */
    private final C7946k f4559m;

    /* renamed from: n */
    private JSONObject f4560n;

    C4624a(String str, @Nullable String str2, long j, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, long j2, @Nullable String str9, @Nullable C7946k kVar) {
        this.f4548b = str;
        this.f4549c = str2;
        this.f4550d = j;
        this.f4551e = str3;
        this.f4552f = str4;
        this.f4553g = str5;
        this.f4554h = str6;
        this.f4555i = str7;
        this.f4556j = str8;
        this.f4557k = j2;
        this.f4558l = str9;
        this.f4559m = kVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4560n = new JSONObject(this.f4554h);
            } catch (JSONException e) {
                Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", new Object[]{e.getMessage()}));
                this.f4554h = null;
                this.f4560n = new JSONObject();
            }
        } else {
            this.f4560n = new JSONObject();
        }
    }

    @Nullable
    /* renamed from: A */
    public String mo31948A() {
        return this.f4553g;
    }

    @Nullable
    /* renamed from: F */
    public String mo31949F() {
        return this.f4555i;
    }

    @Nullable
    /* renamed from: G */
    public String mo31950G() {
        return this.f4551e;
    }

    /* renamed from: H */
    public long mo31951H() {
        return this.f4550d;
    }

    @Nullable
    /* renamed from: I */
    public String mo31952I() {
        return this.f4558l;
    }

    @NonNull
    /* renamed from: J */
    public String mo31953J() {
        return this.f4548b;
    }

    @Nullable
    /* renamed from: K */
    public String mo31954K() {
        return this.f4556j;
    }

    @Nullable
    /* renamed from: L */
    public String mo31955L() {
        return this.f4552f;
    }

    @Nullable
    /* renamed from: M */
    public String mo31956M() {
        return this.f4549c;
    }

    @Nullable
    /* renamed from: N */
    public C7946k mo31957N() {
        return this.f4559m;
    }

    /* renamed from: O */
    public long mo31958O() {
        return this.f4557k;
    }

    @NonNull
    /* renamed from: P */
    public final JSONObject mo31959P() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4548b);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, C8673a.m17443b(this.f4550d));
            long j = this.f4557k;
            if (j != -1) {
                jSONObject.put("whenSkippable", C8673a.m17443b(j));
            }
            String str = this.f4555i;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f4552f;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4549c;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.f4551e;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4553g;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4560n;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4556j;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f4558l;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            C7946k kVar = this.f4559m;
            if (kVar != null) {
                jSONObject.put("vastAdsRequest", kVar.mo41770H());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4624a)) {
            return false;
        }
        C4624a aVar = (C4624a) obj;
        if (!C8673a.m17455n(this.f4548b, aVar.f4548b) || !C8673a.m17455n(this.f4549c, aVar.f4549c) || this.f4550d != aVar.f4550d || !C8673a.m17455n(this.f4551e, aVar.f4551e) || !C8673a.m17455n(this.f4552f, aVar.f4552f) || !C8673a.m17455n(this.f4553g, aVar.f4553g) || !C8673a.m17455n(this.f4554h, aVar.f4554h) || !C8673a.m17455n(this.f4555i, aVar.f4555i) || !C8673a.m17455n(this.f4556j, aVar.f4556j) || this.f4557k != aVar.f4557k || !C8673a.m17455n(this.f4558l, aVar.f4558l) || !C8673a.m17455n(this.f4559m, aVar.f4559m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f4548b, this.f4549c, Long.valueOf(this.f4550d), this.f4551e, this.f4552f, this.f4553g, this.f4554h, this.f4555i, this.f4556j, Long.valueOf(this.f4557k), this.f4558l, this.f4559m);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo31953J(), false);
        C9883b.m20539s(parcel, 3, mo31956M(), false);
        C9883b.m20535o(parcel, 4, mo31951H());
        C9883b.m20539s(parcel, 5, mo31950G(), false);
        C9883b.m20539s(parcel, 6, mo31955L(), false);
        C9883b.m20539s(parcel, 7, mo31948A(), false);
        C9883b.m20539s(parcel, 8, this.f4554h, false);
        C9883b.m20539s(parcel, 9, mo31949F(), false);
        C9883b.m20539s(parcel, 10, mo31954K(), false);
        C9883b.m20535o(parcel, 11, mo31958O());
        C9883b.m20539s(parcel, 12, mo31952I(), false);
        C9883b.m20538r(parcel, 13, mo31957N(), i, false);
        C9883b.m20522b(parcel, a);
    }
}
