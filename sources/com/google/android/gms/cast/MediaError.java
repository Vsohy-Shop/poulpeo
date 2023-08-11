package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import org.json.JSONObject;
import p109h4.C7955o0;
import p150l4.C8673a;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class MediaError extends C9882a implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<MediaError> CREATOR = new C7955o0();
    @Nullable

    /* renamed from: b */
    private String f4511b;

    /* renamed from: c */
    private long f4512c;
    @Nullable

    /* renamed from: d */
    private final Integer f4513d;
    @Nullable

    /* renamed from: e */
    private final String f4514e;
    @Nullable

    /* renamed from: f */
    String f4515f;
    @Nullable

    /* renamed from: g */
    private final JSONObject f4516g;

    public MediaError(@Nullable String str, long j, @Nullable Integer num, @Nullable String str2, @Nullable JSONObject jSONObject) {
        this.f4511b = str;
        this.f4512c = j;
        this.f4513d = num;
        this.f4514e = str2;
        this.f4516g = jSONObject;
    }

    @NonNull
    /* renamed from: I */
    public static MediaError m5975I(@NonNull JSONObject jSONObject) {
        Integer num;
        JSONObject jSONObject2;
        String optString = jSONObject.optString(JSONAPIResourceIdSerializer.FIELD_TYPE, "ERROR");
        long optLong = jSONObject.optLong("requestId");
        if (jSONObject.has("detailedErrorCode")) {
            num = Integer.valueOf(jSONObject.optInt("detailedErrorCode"));
        } else {
            num = null;
        }
        String c = C8673a.m17444c(jSONObject, "reason");
        if (jSONObject.has("customData")) {
            jSONObject2 = jSONObject.optJSONObject("customData");
        } else {
            jSONObject2 = null;
        }
        return new MediaError(optString, optLong, num, c, jSONObject2);
    }

    @Nullable
    /* renamed from: A */
    public Integer mo31911A() {
        return this.f4513d;
    }

    @Nullable
    /* renamed from: F */
    public String mo31912F() {
        return this.f4514e;
    }

    /* renamed from: G */
    public long mo31913G() {
        return this.f4512c;
    }

    @Nullable
    /* renamed from: H */
    public String mo31914H() {
        return this.f4511b;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f4516g;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f4515f = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo31914H(), false);
        C9883b.m20535o(parcel, 3, mo31913G());
        C9883b.m20534n(parcel, 4, mo31911A(), false);
        C9883b.m20539s(parcel, 5, mo31912F(), false);
        C9883b.m20539s(parcel, 6, this.f4515f, false);
        C9883b.m20522b(parcel, a);
    }
}
