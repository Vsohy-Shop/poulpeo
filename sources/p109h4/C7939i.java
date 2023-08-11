package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.C4627d;
import org.json.JSONObject;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10679m;

/* renamed from: h4.i */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7939i extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7939i> CREATOR = new C7975y0();
    @Nullable

    /* renamed from: b */
    private final C4627d f11125b;
    @Nullable

    /* renamed from: c */
    String f11126c;
    @Nullable

    /* renamed from: d */
    private final JSONObject f11127d;

    /* renamed from: h4.i$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static class C7940a {
        @Nullable

        /* renamed from: a */
        private C4627d f11128a;
        @Nullable

        /* renamed from: b */
        private JSONObject f11129b;

        @NonNull
        /* renamed from: a */
        public C7939i mo41734a() {
            return new C7939i(this.f11128a, this.f11129b);
        }

        @NonNull
        /* renamed from: b */
        public C7940a mo41735b(@Nullable C4627d dVar) {
            this.f11128a = dVar;
            return this;
        }
    }

    C7939i(@Nullable C4627d dVar, @Nullable JSONObject jSONObject) {
        this.f11125b = dVar;
        this.f11127d = jSONObject;
    }

    @NonNull
    /* renamed from: A */
    public static C7939i m15597A(@NonNull JSONObject jSONObject) {
        C4627d dVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("loadRequestData");
        if (optJSONObject != null) {
            dVar = C4627d.m6029A(optJSONObject);
        } else {
            dVar = null;
        }
        return new C7939i(dVar, jSONObject.optJSONObject("customData"));
    }

    @Nullable
    /* renamed from: F */
    public C4627d mo41730F() {
        return this.f11125b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7939i)) {
            return false;
        }
        C7939i iVar = (C7939i) obj;
        if (!C10679m.m22696a(this.f11127d, iVar.f11127d)) {
            return false;
        }
        return C9705n.m20259b(this.f11125b, iVar.f11125b);
    }

    public int hashCode() {
        return C9705n.m20260c(this.f11125b, String.valueOf(this.f11127d));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        String str;
        JSONObject jSONObject = this.f11127d;
        if (jSONObject == null) {
            str = null;
        } else {
            str = jSONObject.toString();
        }
        this.f11126c = str;
        int a = C9883b.m20521a(parcel);
        C9883b.m20538r(parcel, 2, mo41730F(), i, false);
        C9883b.m20539s(parcel, 3, this.f11126c, false);
        C9883b.m20522b(parcel, a);
    }
}
