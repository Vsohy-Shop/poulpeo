package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p150l4.C8673a;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.a */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7907a extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7907a> CREATOR = new C7964t();

    /* renamed from: b */
    private final long f11059b;

    /* renamed from: c */
    private final String f11060c;

    /* renamed from: d */
    private final long f11061d;

    /* renamed from: e */
    private final boolean f11062e;

    /* renamed from: f */
    private final String[] f11063f;

    /* renamed from: g */
    private final boolean f11064g;

    /* renamed from: h */
    private final boolean f11065h;

    public C7907a(long j, @NonNull String str, long j2, boolean z, @NonNull String[] strArr, boolean z2, boolean z3) {
        this.f11059b = j;
        this.f11060c = str;
        this.f11061d = j2;
        this.f11062e = z;
        this.f11063f = strArr;
        this.f11064g = z2;
        this.f11065h = z3;
    }

    @NonNull
    /* renamed from: A */
    public String[] mo41641A() {
        return this.f11063f;
    }

    /* renamed from: F */
    public long mo41642F() {
        return this.f11061d;
    }

    @NonNull
    /* renamed from: G */
    public String mo41643G() {
        return this.f11060c;
    }

    /* renamed from: H */
    public long mo41644H() {
        return this.f11059b;
    }

    /* renamed from: I */
    public boolean mo41645I() {
        return this.f11064g;
    }

    /* renamed from: J */
    public boolean mo41646J() {
        return this.f11065h;
    }

    /* renamed from: K */
    public boolean mo41647K() {
        return this.f11062e;
    }

    @NonNull
    /* renamed from: L */
    public final JSONObject mo41648L() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11060c);
            jSONObject.put("position", C8673a.m17443b(this.f11059b));
            jSONObject.put("isWatched", this.f11062e);
            jSONObject.put("isEmbedded", this.f11064g);
            jSONObject.put(TypedValues.TransitionType.S_DURATION, C8673a.m17443b(this.f11061d));
            jSONObject.put("expanded", this.f11065h);
            if (this.f11063f != null) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f11063f) {
                    jSONArray.put(put);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7907a)) {
            return false;
        }
        C7907a aVar = (C7907a) obj;
        if (C8673a.m17455n(this.f11060c, aVar.f11060c) && this.f11059b == aVar.f11059b && this.f11061d == aVar.f11061d && this.f11062e == aVar.f11062e && Arrays.equals(this.f11063f, aVar.f11063f) && this.f11064g == aVar.f11064g && this.f11065h == aVar.f11065h) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f11060c.hashCode();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20535o(parcel, 2, mo41644H());
        C9883b.m20539s(parcel, 3, mo41643G(), false);
        C9883b.m20535o(parcel, 4, mo41642F());
        C9883b.m20523c(parcel, 5, mo41647K());
        C9883b.m20540t(parcel, 6, mo41641A(), false);
        C9883b.m20523c(parcel, 7, mo41645I());
        C9883b.m20523c(parcel, 8, mo41646J());
        C9883b.m20522b(parcel, a);
    }
}
