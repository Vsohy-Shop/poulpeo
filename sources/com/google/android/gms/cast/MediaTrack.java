package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150l4.C8673a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10679m;

/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class MediaTrack extends C9882a implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C4703r();

    /* renamed from: b */
    private long f4538b;

    /* renamed from: c */
    private int f4539c;
    @Nullable

    /* renamed from: d */
    private String f4540d;
    @Nullable

    /* renamed from: e */
    private String f4541e;
    @Nullable

    /* renamed from: f */
    private String f4542f;
    @Nullable

    /* renamed from: g */
    private final String f4543g;

    /* renamed from: h */
    private int f4544h;
    @Nullable

    /* renamed from: i */
    private final List f4545i;
    @Nullable

    /* renamed from: j */
    String f4546j;
    @Nullable

    /* renamed from: k */
    private final JSONObject f4547k;

    MediaTrack(long j, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @Nullable List list, @Nullable JSONObject jSONObject) {
        this.f4538b = j;
        this.f4539c = i;
        this.f4540d = str;
        this.f4541e = str2;
        this.f4542f = str3;
        this.f4543g = str4;
        this.f4544h = i2;
        this.f4545i = list;
        this.f4547k = jSONObject;
    }

    @Nullable
    /* renamed from: A */
    public String mo31936A() {
        return this.f4540d;
    }

    @Nullable
    /* renamed from: F */
    public String mo31937F() {
        return this.f4541e;
    }

    /* renamed from: G */
    public long mo31938G() {
        return this.f4538b;
    }

    @Nullable
    /* renamed from: H */
    public String mo31939H() {
        return this.f4543g;
    }

    @Nullable
    /* renamed from: I */
    public String mo31940I() {
        return this.f4542f;
    }

    @Nullable
    /* renamed from: J */
    public List<String> mo31941J() {
        return this.f4545i;
    }

    /* renamed from: K */
    public int mo31942K() {
        return this.f4544h;
    }

    /* renamed from: L */
    public int mo31943L() {
        return this.f4539c;
    }

    @NonNull
    /* renamed from: M */
    public final JSONObject mo31944M() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f4538b);
            int i = this.f4539c;
            if (i == 1) {
                jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "TEXT");
            } else if (i == 2) {
                jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "AUDIO");
            } else if (i == 3) {
                jSONObject.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "VIDEO");
            }
            String str = this.f4540d;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.f4541e;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.f4542f;
            if (str3 != null) {
                jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, str3);
            }
            if (!TextUtils.isEmpty(this.f4543g)) {
                jSONObject.put("language", this.f4543g);
            }
            int i2 = this.f4544h;
            if (i2 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i2 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i2 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i2 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i2 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            if (this.f4545i != null) {
                jSONObject.put("roles", new JSONArray(this.f4545i));
            }
            JSONObject jSONObject2 = this.f4547k;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.f4547k;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = mediaTrack.f4547k;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || C10679m.m22696a(jSONObject, jSONObject2)) && this.f4538b == mediaTrack.f4538b && this.f4539c == mediaTrack.f4539c && C8673a.m17455n(this.f4540d, mediaTrack.f4540d) && C8673a.m17455n(this.f4541e, mediaTrack.f4541e) && C8673a.m17455n(this.f4542f, mediaTrack.f4542f) && C8673a.m17455n(this.f4543g, mediaTrack.f4543g) && this.f4544h == mediaTrack.f4544h && C8673a.m17455n(this.f4545i, mediaTrack.f4545i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(Long.valueOf(this.f4538b), Integer.valueOf(this.f4539c), this.f4540d, this.f4541e, this.f4542f, this.f4543g, Integer.valueOf(this.f4544h), this.f4545i, String.valueOf(this.f4547k));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f4547k;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f4546j = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20535o(parcel, 2, mo31938G());
        C9883b.m20532l(parcel, 3, mo31943L());
        C9883b.m20539s(parcel, 4, mo31936A(), false);
        C9883b.m20539s(parcel, 5, mo31937F(), false);
        C9883b.m20539s(parcel, 6, mo31940I(), false);
        C9883b.m20539s(parcel, 7, mo31939H(), false);
        C9883b.m20532l(parcel, 8, mo31942K());
        C9883b.m20541u(parcel, 9, mo31941J(), false);
        C9883b.m20539s(parcel, 10, this.f4546j, false);
        C9883b.m20522b(parcel, a);
    }
}
