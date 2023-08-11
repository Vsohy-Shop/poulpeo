package p109h4;

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

/* renamed from: h4.k */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7946k extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7946k> CREATOR = new C7909a1();
    @Nullable

    /* renamed from: b */
    private final String f11149b;
    @Nullable

    /* renamed from: c */
    private final String f11150c;

    C7946k(@Nullable String str, @Nullable String str2) {
        this.f11149b = str;
        this.f11150c = str2;
    }

    @Nullable
    /* renamed from: A */
    public static C7946k m15632A(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C7946k(C8673a.m17444c(jSONObject, "adTagUrl"), C8673a.m17444c(jSONObject, "adsResponse"));
    }

    @Nullable
    /* renamed from: F */
    public String mo41768F() {
        return this.f11149b;
    }

    @Nullable
    /* renamed from: G */
    public String mo41769G() {
        return this.f11150c;
    }

    @NonNull
    /* renamed from: H */
    public final JSONObject mo41770H() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f11149b;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f11150c;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7946k)) {
            return false;
        }
        C7946k kVar = (C7946k) obj;
        if (!C8673a.m17455n(this.f11149b, kVar.f11149b) || !C8673a.m17455n(this.f11150c, kVar.f11150c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f11149b, this.f11150c);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo41768F(), false);
        C9883b.m20539s(parcel, 3, mo41769G(), false);
        C9883b.m20522b(parcel, a);
    }
}
