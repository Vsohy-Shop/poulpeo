package p042bo.app;

import android.location.Location;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8303k;
import p404of.C13074a;

/* renamed from: bo.app.n */
public final class C3451n implements C2993a2 {

    /* renamed from: b */
    private final double f2197b;

    /* renamed from: c */
    private final double f2198c;

    /* renamed from: d */
    private final Double f2199d;

    /* renamed from: e */
    private final Double f2200e;

    /* renamed from: bo.app.n$a */
    static final class C3452a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3452a f2201b = new C3452a();

        C3452a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating location Json.";
        }
    }

    public C3451n(double d, double d2, Double d3, Double d4) {
        this.f2197b = d;
        this.f2198c = d2;
        this.f2199d = d3;
        this.f2200e = d4;
        if (!C8303k.m16499d(getLatitude(), getLongitude())) {
            throw new IllegalArgumentException("Unable to create BrazeLocation. Latitude and longitude values are bounded by ±90 and ±180 respectively".toString());
        }
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", getLatitude());
            jSONObject.put("longitude", getLongitude());
            if (mo29374w() != null) {
                jSONObject.put("altitude", mo29374w());
            }
            if (mo29373v() != null) {
                jSONObject.put("ll_accuracy", mo29373v());
            }
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3452a.f2201b, 4, (Object) null);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3451n)) {
            return false;
        }
        C3451n nVar = (C3451n) obj;
        if (C12775o.m28634d(Double.valueOf(this.f2197b), Double.valueOf(nVar.f2197b)) && C12775o.m28634d(Double.valueOf(this.f2198c), Double.valueOf(nVar.f2198c)) && C12775o.m28634d(this.f2199d, nVar.f2199d) && C12775o.m28634d(this.f2200e, nVar.f2200e)) {
            return true;
        }
        return false;
    }

    public double getLatitude() {
        return this.f2197b;
    }

    public double getLongitude() {
        return this.f2198c;
    }

    public int hashCode() {
        int i;
        int hashCode = ((Double.hashCode(this.f2197b) * 31) + Double.hashCode(this.f2198c)) * 31;
        Double d = this.f2199d;
        int i2 = 0;
        if (d == null) {
            i = 0;
        } else {
            i = d.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        Double d2 = this.f2200e;
        if (d2 != null) {
            i2 = d2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "BrazeLocation(_latitude=" + this.f2197b + ", _longitude=" + this.f2198c + ", _altitude=" + this.f2199d + ", _accuracy=" + this.f2200e + ')';
    }

    /* renamed from: v */
    public Double mo29373v() {
        return this.f2200e;
    }

    /* renamed from: w */
    public Double mo29374w() {
        return this.f2199d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3451n(double d, double d2, Double d3, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3451n(Location location) {
        this(location.getLatitude(), location.getLongitude(), Double.valueOf(location.getAltitude()), Double.valueOf((double) location.getAccuracy()));
        C12775o.m28639i(location, "location");
    }
}
