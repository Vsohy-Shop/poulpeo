package p057d0;

import com.google.android.gms.location.Geofence;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p126j0.C8278g;

/* renamed from: d0.a */
public final class C7208a implements C7213c<JSONObject>, Comparable<C7208a> {

    /* renamed from: o */
    public static final C7209a f9879o = new C7209a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final JSONObject f9880b;

    /* renamed from: c */
    private final String f9881c;

    /* renamed from: d */
    private final double f9882d;

    /* renamed from: e */
    private final double f9883e;

    /* renamed from: f */
    private final int f9884f;

    /* renamed from: g */
    private final int f9885g;

    /* renamed from: h */
    private final int f9886h;

    /* renamed from: i */
    private final boolean f9887i;

    /* renamed from: j */
    private final boolean f9888j;

    /* renamed from: k */
    private final boolean f9889k;

    /* renamed from: l */
    private final boolean f9890l;

    /* renamed from: m */
    private final int f9891m;

    /* renamed from: n */
    private double f9892n;

    /* renamed from: d0.a$a */
    public static final class C7209a {
        public /* synthetic */ C7209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7209a() {
        }
    }

    public C7208a(JSONObject jSONObject, String str, double d, double d2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(str, "id");
        this.f9880b = jSONObject;
        this.f9881c = str;
        this.f9882d = d;
        this.f9883e = d2;
        this.f9884f = i;
        this.f9885g = i2;
        this.f9886h = i3;
        this.f9887i = z;
        this.f9888j = z2;
        this.f9889k = z3;
        this.f9890l = z4;
        this.f9891m = i4;
        this.f9892n = -1.0d;
    }

    /* renamed from: a */
    public int compareTo(C7208a aVar) {
        boolean z;
        C12775o.m28639i(aVar, "other");
        double d = this.f9892n;
        if (d == -1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z && d < aVar.f9892n) {
            return -1;
        }
        return 1;
    }

    /* renamed from: c */
    public final boolean mo40754c(C7208a aVar) {
        C12775o.m28639i(aVar, "otherGeofence");
        try {
            return C8278g.m16457k(this.f9880b, aVar.forJsonPut());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        return this.f9880b;
    }

    /* renamed from: f0 */
    public final int mo40757f0() {
        return this.f9885g;
    }

    /* renamed from: g0 */
    public final int mo40758g0() {
        return this.f9886h;
    }

    public final String getId() {
        return this.f9881c;
    }

    public final double getLatitude() {
        return this.f9882d;
    }

    public final double getLongitude() {
        return this.f9883e;
    }

    /* renamed from: h0 */
    public final void mo40762h0(double d) {
        this.f9892n = d;
    }

    /* renamed from: i0 */
    public final Geofence mo40763i0() {
        Geofence.Builder builder = new Geofence.Builder();
        builder.setRequestId(this.f9881c).setCircularRegion(this.f9882d, this.f9883e, (float) this.f9884f).setNotificationResponsiveness(this.f9891m).setExpirationDuration(-1);
        boolean z = this.f9889k;
        if (this.f9890l) {
            z |= true;
        }
        builder.setTransitionTypes(z ? 1 : 0);
        Geofence build = builder.build();
        C12775o.m28638h(build, "builder.build()");
        return build;
    }

    public String toString() {
        return "BrazeGeofence{id=" + this.f9881c + ", latitude=" + this.f9882d + ", longitude=" + this.f9883e + ", radiusMeters=" + this.f9884f + ", cooldownEnterSeconds=" + this.f9885g + ", cooldownExitSeconds=" + this.f9886h + ", analyticsEnabledEnter=" + this.f9887i + ", analyticsEnabledExit=" + this.f9888j + ", enterEvents=" + this.f9889k + ", exitEvents=" + this.f9890l + ", notificationResponsivenessMs=" + this.f9891m + ", distanceFromGeofenceRefresh=" + this.f9892n + " }";
    }

    /* renamed from: v */
    public final boolean mo40765v() {
        return this.f9887i;
    }

    /* renamed from: w */
    public final boolean mo40766w() {
        return this.f9888j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7208a(org.json.JSONObject r17) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "jsonObject.getString(ID)"
            kotlin.jvm.internal.C12775o.m28638h(r2, r0)
            java.lang.String r0 = "latitude"
            double r3 = r1.getDouble(r0)
            java.lang.String r0 = "longitude"
            double r5 = r1.getDouble(r0)
            java.lang.String r0 = "radius"
            int r7 = r1.getInt(r0)
            java.lang.String r0 = "cooldown_enter"
            int r8 = r1.getInt(r0)
            java.lang.String r0 = "cooldown_exit"
            int r9 = r1.getInt(r0)
            java.lang.String r0 = "analytics_enabled_enter"
            boolean r10 = r1.getBoolean(r0)
            java.lang.String r0 = "analytics_enabled_exit"
            boolean r11 = r1.getBoolean(r0)
            java.lang.String r0 = "enter_events"
            r12 = 1
            boolean r13 = r1.optBoolean(r0, r12)
            java.lang.String r0 = "exit_events"
            boolean r14 = r1.optBoolean(r0, r12)
            java.lang.String r0 = "notification_responsiveness"
            r12 = 30000(0x7530, float:4.2039E-41)
            int r15 = r1.optInt(r0, r12)
            r0 = r16
            r12 = r13
            r13 = r14
            r14 = r15
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p057d0.C7208a.<init>(org.json.JSONObject):void");
    }
}
