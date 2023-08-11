package p220s4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: s4.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9493a extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C9493a> CREATOR = new C9494b();

    /* renamed from: b */
    final int f14148b;

    /* renamed from: c */
    private final Uri f14149c;

    /* renamed from: d */
    private final int f14150d;

    /* renamed from: e */
    private final int f14151e;

    C9493a(int i, Uri uri, int i2, int i3) {
        this.f14148b = i;
        this.f14149c = uri;
        this.f14150d = i2;
        this.f14151e = i3;
    }

    /* renamed from: A */
    public int mo43937A() {
        return this.f14151e;
    }

    @NonNull
    /* renamed from: F */
    public Uri mo43938F() {
        return this.f14149c;
    }

    /* renamed from: G */
    public int mo43939G() {
        return this.f14150d;
    }

    @NonNull
    /* renamed from: H */
    public JSONObject mo43940H() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f14149c.toString());
            jSONObject.put("width", this.f14150d);
            jSONObject.put("height", this.f14151e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C9493a)) {
            C9493a aVar = (C9493a) obj;
            if (C9705n.m20259b(this.f14149c, aVar.f14149c) && this.f14150d == aVar.f14150d && this.f14151e == aVar.f14151e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f14149c, Integer.valueOf(this.f14150d), Integer.valueOf(this.f14151e));
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f14150d), Integer.valueOf(this.f14151e), this.f14149c.toString()});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14148b);
        C9883b.m20538r(parcel, 2, mo43938F(), i, false);
        C9883b.m20532l(parcel, 3, mo43939G());
        C9883b.m20532l(parcel, 4, mo43937A());
        C9883b.m20522b(parcel, a);
    }

    public C9493a(@NonNull Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9493a(@androidx.annotation.NonNull org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0012 }
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x0012 }
        L_0x0012:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p220s4.C9493a.<init>(org.json.JSONObject):void");
    }
}
