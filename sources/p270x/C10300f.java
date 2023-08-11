package p270x;

import androidx.autofill.HintConstants;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p042bo.app.C3023b2;
import p042bo.app.C3036c0;
import p042bo.app.C3119e5;
import p042bo.app.C3240j;
import p042bo.app.C3393l2;
import p042bo.app.C3702t5;
import p042bo.app.C3704t6;
import p042bo.app.C3785x1;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8303k;
import p292z.C10730a;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: x.f */
public final class C10300f {

    /* renamed from: a */
    private final C3704t6 f15556a;

    /* renamed from: b */
    private final C3023b2 f15557b;

    /* renamed from: c */
    private volatile String f15558c;

    /* renamed from: d */
    private final C3393l2 f15559d;

    /* renamed from: e */
    private final C3119e5 f15560e;

    /* renamed from: f */
    private final ReentrantLock f15561f = new ReentrantLock();

    /* renamed from: x.f$a */
    static final class C10301a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10301a f15562g = new C10301a();

        C10301a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
        }
    }

    /* renamed from: x.f$a0 */
    static final class C10302a0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15563g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10302a0(String str) {
            super(0);
            this.f15563g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set country to: ", this.f15563g);
        }
    }

    /* renamed from: x.f$b */
    static final class C10303b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f15564g;

        /* renamed from: h */
        final /* synthetic */ Month f15565h;

        /* renamed from: i */
        final /* synthetic */ int f15566i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10303b(int i, Month month, int i2) {
            super(0);
            this.f15564g = i;
            this.f15565h = month;
            this.f15566i = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set date of birth to: " + this.f15564g + '-' + this.f15565h.getValue() + '-' + this.f15566i;
        }
    }

    /* renamed from: x.f$b0 */
    static final class C10304b0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10304b0 f15567g = new C10304b0();

        C10304b0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
        }
    }

    /* renamed from: x.f$c */
    static final class C10305c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10305c f15568g = new C10305c();

        C10305c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
        }
    }

    /* renamed from: x.f$c0 */
    static final class C10306c0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10306c0 f15569g = new C10306c0();

        C10306c0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    /* renamed from: x.f$d */
    static final class C10307d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10307d f15570g = new C10307d();

        C10307d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid email parameter: email is required to be non-empty. Not setting email.";
        }
    }

    /* renamed from: x.f$d0 */
    static final class C10308d0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15571g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10308d0(String str) {
            super(0);
            this.f15571g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set last name to: ", this.f15571g);
        }
    }

    /* renamed from: x.f$e */
    static final class C10309e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15572g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10309e(String str) {
            super(0);
            this.f15572g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set alias: ", this.f15572g);
        }
    }

    /* renamed from: x.f$e0 */
    static final class C10310e0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Object f15573g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10310e0(Object obj) {
            super(0);
            this.f15573g = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Error parsing date ", this.f15573g);
        }
    }

    /* renamed from: x.f$f */
    static final class C10311f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15574g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10311f(String str) {
            super(0);
            this.f15574g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Email address is not valid: ", this.f15574g);
        }
    }

    /* renamed from: x.f$f0 */
    static final class C10312f0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10312f0 f15575g = new C10312f0();

        C10312f0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    /* renamed from: x.f$g */
    static final class C10313g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15576g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10313g(String str) {
            super(0);
            this.f15576g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("User object user id set to: ", this.f15576g);
        }
    }

    /* renamed from: x.f$g0 */
    static final class C10314g0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15577g;

        /* renamed from: h */
        final /* synthetic */ Object f15578h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10314g0(String str, Object obj) {
            super(0);
            this.f15577g = str;
            this.f15578h = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not add unsupported custom attribute type with key: " + this.f15577g + " and value: " + this.f15578h;
        }
    }

    /* renamed from: x.f$h */
    static final class C10315h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10315h f15579g = new C10315h();

        C10315h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key was invalid. Not adding to attribute array.";
        }
    }

    /* renamed from: x.f$h0 */
    static final class C10316h0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ double f15580g;

        /* renamed from: h */
        final /* synthetic */ double f15581h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10316h0(double d, double d2) {
            super(0);
            this.f15580g = d;
            this.f15581h = d2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot set custom location attribute due with invalid latitude '" + this.f15580g + " and longitude '" + this.f15581h + '\'';
        }
    }

    /* renamed from: x.f$i */
    static final class C10317i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15582g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10317i(String str) {
            super(0);
            this.f15582g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set email to: ", this.f15582g);
        }
    }

    /* renamed from: x.f$i0 */
    static final class C10318i0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15583g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10318i0(String str) {
            super(0);
            this.f15583g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom attribute array with key: '" + this.f15583g + "'.";
        }
    }

    /* renamed from: x.f$j */
    static final class C10319j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15584g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10319j(String str) {
            super(0);
            this.f15584g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add custom attribute with key '" + this.f15584g + "'.";
        }
    }

    /* renamed from: x.f$j0 */
    static final class C10320j0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15585g;

        /* renamed from: h */
        final /* synthetic */ double f15586h;

        /* renamed from: i */
        final /* synthetic */ double f15587i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10320j0(String str, double d, double d2) {
            super(0);
            this.f15585g = str;
            this.f15586h = d;
            this.f15587i = d2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom location attribute with key '" + this.f15585g + "' and latitude '" + this.f15586h + "' and longitude '" + this.f15587i + '\'';
        }
    }

    /* renamed from: x.f$k */
    static final class C10321k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ NotificationSubscriptionType f15588g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10321k(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f15588g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set email notification subscription to: ", this.f15588g);
        }
    }

    /* renamed from: x.f$k0 */
    static final class C10322k0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15589g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10322k0(String str) {
            super(0);
            this.f15589g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom boolean attribute " + this.f15589g + '.';
        }
    }

    /* renamed from: x.f$l */
    static final class C10323l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10323l f15590g = new C10323l();

        C10323l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
        }
    }

    /* renamed from: x.f$l0 */
    static final class C10324l0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10324l0 f15591g = new C10324l0();

        C10324l0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
        }
    }

    /* renamed from: x.f$m */
    static final class C10325m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15592g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10325m(String str) {
            super(0);
            this.f15592g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to add user to subscription group ", this.f15592g);
        }
    }

    /* renamed from: x.f$m0 */
    static final class C10326m0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15593g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10326m0(String str) {
            super(0);
            this.f15593g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom integer attribute " + this.f15593g + '.';
        }
    }

    /* renamed from: x.f$n */
    static final class C10327n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10327n f15594g = new C10327n();

        C10327n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
        }
    }

    /* renamed from: x.f$n0 */
    static final class C10328n0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15595g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10328n0(String str) {
            super(0);
            this.f15595g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ", this.f15595g);
        }
    }

    /* renamed from: x.f$o */
    static final class C10329o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15596g;

        /* renamed from: h */
        final /* synthetic */ int f15597h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10329o(String str, int i) {
            super(0);
            this.f15596g = str;
            this.f15597h = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to increment custom attribute " + this.f15596g + " by " + this.f15597h + '.';
        }
    }

    /* renamed from: x.f$o0 */
    static final class C10330o0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15598g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10330o0(String str) {
            super(0);
            this.f15598g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set phone number to: ", this.f15598g);
        }
    }

    /* renamed from: x.f$p */
    static final class C10331p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15599g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10331p(String str) {
            super(0);
            this.f15599g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set first name to: ", this.f15599g);
        }
    }

    /* renamed from: x.f$p0 */
    static final class C10332p0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ NotificationSubscriptionType f15600g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10332p0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.f15600g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set push notification subscription to: ", this.f15600g);
        }
    }

    /* renamed from: x.f$q */
    static final class C10333q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10333q f15601g = new C10333q();

        C10333q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key was invalid. Not removing from attribute array.";
        }
    }

    /* renamed from: x.f$q0 */
    static final class C10334q0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15602g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10334q0(String str) {
            super(0);
            this.f15602g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom string attribute " + this.f15602g + '.';
        }
    }

    /* renamed from: x.f$r */
    static final class C10335r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Gender f15603g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10335r(Gender gender) {
            super(0);
            this.f15603g = gender;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set gender to: ", this.f15603g);
        }
    }

    /* renamed from: x.f$r0 */
    static final class C10336r0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15604g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10336r0(String str) {
            super(0);
            this.f15604g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set custom double attribute " + this.f15604g + '.';
        }
    }

    /* renamed from: x.f$s */
    static final class C10337s extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15605g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10337s(String str) {
            super(0);
            this.f15605g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to remove custom attribute with key '" + this.f15605g + "'.";
        }
    }

    /* renamed from: x.f$t */
    static final class C10338t extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10338t f15606g = new C10338t();

        C10338t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
        }
    }

    /* renamed from: x.f$u */
    static final class C10339u extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10339u f15607g = new C10339u();

        C10339u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
        }
    }

    /* renamed from: x.f$v */
    static final class C10340v extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15608g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10340v(String str) {
            super(0);
            this.f15608g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set home city to: ", this.f15608g);
        }
    }

    /* renamed from: x.f$w */
    static final class C10341w extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15609g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10341w(String str) {
            super(0);
            this.f15609g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to remove user from subscription group ", this.f15609g);
        }
    }

    /* renamed from: x.f$x */
    static final class C10342x extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10342x f15610g = new C10342x();

        C10342x() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid language parameter: language is required to be non-empty. Not setting language.";
        }
    }

    /* renamed from: x.f$y */
    static final class C10343y extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15611g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10343y(String str) {
            super(0);
            this.f15611g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to set language to: ", this.f15611g);
        }
    }

    /* renamed from: x.f$z */
    static final class C10344z extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10344z f15612g = new C10344z();

        C10344z() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Invalid country parameter: country is required to be non-blank. Not setting country.";
        }
    }

    public C10300f(C3704t6 t6Var, C3023b2 b2Var, String str, C3393l2 l2Var, C3119e5 e5Var) {
        C12775o.m28639i(t6Var, "userCache");
        C12775o.m28639i(b2Var, "brazeManager");
        C12775o.m28639i(str, "internalUserId");
        C12775o.m28639i(l2Var, "locationManager");
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        this.f15556a = t6Var;
        this.f15557b = b2Var;
        this.f15558c = str;
        this.f15559d = l2Var;
        this.f15560e = e5Var;
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m21653f(C10300f fVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return fVar.mo44966e(str, i);
    }

    /* renamed from: A */
    public final void mo44961A(String str) {
        C12775o.m28639i(str, "userId");
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10313g(str), 6, (Object) null);
        ReentrantLock reentrantLock = this.f15561f;
        reentrantLock.lock();
        try {
            if (!C12775o.m28634d(this.f15558c, "")) {
                if (!C12775o.m28634d(this.f15558c, str)) {
                    throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.f15558c + "], tried to change to: [" + str + ']');
                }
            }
            this.f15558c = str;
            this.f15556a.mo29708i(str);
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo44962a(String str, String str2) {
        C12775o.m28639i(str, "alias");
        C12775o.m28639i(str2, "label");
        if (C13754v.m31532t(str)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10301a.f15562g, 6, (Object) null);
            return false;
        } else if (C13754v.m31532t(str2)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10305c.f15568g, 6, (Object) null);
            return false;
        } else {
            try {
                C3785x1 g = C3240j.f1842h.mo29087g(str, str2);
                if (g == null) {
                    return false;
                }
                return this.f15557b.mo28641a(g);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C10309e(str), 4, (Object) null);
                return false;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo44963b(String str, String str2) {
        C3785x1 a;
        C12775o.m28639i(str, "key");
        C12775o.m28639i(str2, "value");
        try {
            if (!C3036c0.m2647a(str, this.f15560e.mo28860b())) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10315h.f15579g, 6, (Object) null);
                return false;
            } else if (C3036c0.m2646a(str2) && (a = C3240j.f1842h.mo29070a(C8303k.m16497a(str), C8303k.m16497a(str2))) != null) {
                return this.f15557b.mo28641a(a);
            } else {
                return false;
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10319j(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo44964c(String str) {
        C12775o.m28639i(str, "subscriptionGroupId");
        try {
            if (C13754v.m31532t(str)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10323l.f15590g, 6, (Object) null);
                return false;
            }
            C3785x1 a = C3240j.f1842h.mo29067a(str, C3702t5.SUBSCRIBED);
            if (a == null) {
                return true;
            }
            this.f15557b.mo28641a(a);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10325m(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: d */
    public final String mo44965d() {
        ReentrantLock reentrantLock = this.f15561f;
        reentrantLock.lock();
        try {
            return this.f15558c;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final boolean mo44966e(String str, int i) {
        C3785x1 a;
        C12775o.m28639i(str, "key");
        try {
            if (C3036c0.m2647a(str, this.f15560e.mo28860b()) && (a = C3240j.f1842h.mo29065a(C8303k.m16497a(str), i)) != null) {
                return this.f15557b.mo28641a(a);
            }
            return false;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10329o(str, i), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: g */
    public final boolean mo44967g(String str, String str2) {
        C3785x1 f;
        C12775o.m28639i(str, "key");
        C12775o.m28639i(str2, "value");
        try {
            if (!C3036c0.m2647a(str, this.f15560e.mo28860b())) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10333q.f15601g, 6, (Object) null);
                return false;
            } else if (C3036c0.m2646a(str2) && (f = C3240j.f1842h.mo29085f(C8303k.m16497a(str), C8303k.m16497a(str2))) != null) {
                return this.f15557b.mo28641a(f);
            } else {
                return false;
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10337s(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: h */
    public final boolean mo44968h(String str) {
        C12775o.m28639i(str, "subscriptionGroupId");
        try {
            if (C13754v.m31532t(str)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10339u.f15607g, 6, (Object) null);
                return false;
            }
            C3785x1 a = C3240j.f1842h.mo29067a(str, C3702t5.UNSUBSCRIBED);
            if (a == null) {
                return true;
            }
            this.f15557b.mo28641a(a);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10341w(str), 4, (Object) null);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Exception -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x0025 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44969i(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x0025 }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001f
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0025 }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0025 }
            r6 = 0
            r7 = 0
            x.f$z r8 = p270x.C10300f.C10344z.f15612g     // Catch:{ Exception -> 0x0025 }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0025 }
            return r1
        L_0x001f:
            bo.app.t6 r2 = r11.f15556a     // Catch:{ Exception -> 0x0025 }
            r2.mo29691a((java.lang.String) r12)     // Catch:{ Exception -> 0x0025 }
            return r0
        L_0x0025:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            x.f$a0 r7 = new x.f$a0
            r7.<init>(r12)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r11
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p270x.C10300f.mo44969i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public final boolean mo44970j(String str, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        C12775o.m28639i(str, "key");
        C12775o.m28639i(obj, "value");
        if (!C3036c0.m2647a(str, this.f15560e.mo28860b())) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10306c0.f15569g, 6, (Object) null);
            return false;
        }
        String a = C8303k.m16497a(str);
        boolean z4 = true;
        if (obj instanceof Boolean) {
            z = true;
        } else {
            z = obj instanceof Integer;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = obj instanceof Float;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = obj instanceof Long;
        }
        if (!z3) {
            z4 = obj instanceof Double;
        }
        if (z4) {
            return this.f15556a.mo29693a(a, obj);
        }
        if (obj instanceof String) {
            return this.f15556a.mo29693a(a, (Object) C8303k.m16497a((String) obj));
        } else if (obj instanceof Date) {
            try {
                return this.f15556a.mo29693a(a, (Object) C8273e.m16432e((Date) obj, C10730a.LONG, (TimeZone) null, 2, (Object) null));
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C10310e0(obj), 4, (Object) null);
                return false;
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10314g0(str, obj), 6, (Object) null);
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo44971k(String str, String[] strArr) {
        C3785x1 a;
        C12775o.m28639i(str, "key");
        C12775o.m28639i(strArr, "values");
        try {
            if (C3036c0.m2647a(str, this.f15560e.mo28860b()) && (a = C3240j.f1842h.mo29072a(C8303k.m16497a(str), C3036c0.m2648a(strArr))) != null) {
                return this.f15557b.mo28641a(a);
            }
            return false;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10318i0(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: l */
    public final boolean mo44972l(String str, double d) {
        C12775o.m28639i(str, "key");
        try {
            return mo44970j(str, Double.valueOf(d));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10336r0(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: m */
    public final boolean mo44973m(String str, int i) {
        C12775o.m28639i(str, "key");
        try {
            return mo44970j(str, Integer.valueOf(i));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10326m0(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: n */
    public final boolean mo44974n(String str, String str2) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(str2, "value");
        try {
            return mo44970j(str, str2);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10334q0(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: o */
    public final boolean mo44975o(String str, boolean z) {
        C12775o.m28639i(str, "key");
        try {
            return mo44970j(str, Boolean.valueOf(z));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10322k0(str), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: p */
    public final boolean mo44976p(int i, Month month, int i2) {
        C12775o.m28639i(month, "month");
        try {
            return this.f15556a.mo29696b(C8273e.m16432e(C8273e.m16430c(i, month.getValue(), i2, 0, 0, 0, 56, (Object) null), C10730a.SHORT, (TimeZone) null, 2, (Object) null));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10303b(i, month, i2), 4, (Object) null);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x0079 }] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44977q(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x0079 }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001f
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0079 }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0079 }
            r6 = 0
            r7 = 0
            x.f$d r8 = p270x.C10300f.C10307d.f15570g     // Catch:{ Exception -> 0x0079 }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0079 }
            return r1
        L_0x001f:
            if (r12 != 0) goto L_0x0023
            r0 = 0
            goto L_0x0058
        L_0x0023:
            int r2 = r12.length()     // Catch:{ Exception -> 0x0079 }
            int r2 = r2 - r0
            r3 = r1
            r4 = r3
        L_0x002a:
            if (r3 > r2) goto L_0x004f
            if (r4 != 0) goto L_0x0030
            r5 = r3
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            char r5 = r12.charAt(r5)     // Catch:{ Exception -> 0x0079 }
            r6 = 32
            int r5 = kotlin.jvm.internal.C12775o.m28641k(r5, r6)     // Catch:{ Exception -> 0x0079 }
            if (r5 > 0) goto L_0x003f
            r5 = r0
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r4 != 0) goto L_0x0049
            if (r5 != 0) goto L_0x0046
            r4 = r0
            goto L_0x002a
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0049:
            if (r5 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            int r2 = r2 + -1
            goto L_0x002a
        L_0x004f:
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r12.subSequence(r3, r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0079 }
        L_0x0058:
            if (r0 == 0) goto L_0x0072
            boolean r2 = p126j0.C8303k.m16498c(r0)     // Catch:{ Exception -> 0x0079 }
            if (r2 == 0) goto L_0x0061
            goto L_0x0072
        L_0x0061:
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0079 }
            r5 = 0
            r6 = 0
            r7 = 0
            x.f$f r8 = new x.f$f     // Catch:{ Exception -> 0x0079 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x0079 }
            r9 = 7
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0078
        L_0x0072:
            bo.app.t6 r2 = r11.f15556a     // Catch:{ Exception -> 0x0079 }
            boolean r1 = r2.mo29698c(r0)     // Catch:{ Exception -> 0x0079 }
        L_0x0078:
            return r1
        L_0x0079:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            x.f$i r7 = new x.f$i
            r7.<init>(r12)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r11
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p270x.C10300f.mo44977q(java.lang.String):boolean");
    }

    /* renamed from: r */
    public final boolean mo44978r(NotificationSubscriptionType notificationSubscriptionType) {
        C12775o.m28639i(notificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            this.f15556a.mo29687a(notificationSubscriptionType);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10321k(notificationSubscriptionType), 4, (Object) null);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Exception -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x0025 }] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44979s(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x0025 }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001f
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0025 }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0025 }
            r6 = 0
            r7 = 0
            x.f$n r8 = p270x.C10300f.C10327n.f15594g     // Catch:{ Exception -> 0x0025 }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0025 }
            return r1
        L_0x001f:
            bo.app.t6 r2 = r11.f15556a     // Catch:{ Exception -> 0x0025 }
            r2.mo29699d(r12)     // Catch:{ Exception -> 0x0025 }
            return r0
        L_0x0025:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            x.f$p r7 = new x.f$p
            r7.<init>(r12)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r11
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p270x.C10300f.mo44979s(java.lang.String):boolean");
    }

    /* renamed from: t */
    public final boolean mo44980t(Gender gender) {
        C12775o.m28639i(gender, HintConstants.AUTOFILL_HINT_GENDER);
        try {
            this.f15556a.mo29686a(gender);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10335r(gender), 4, (Object) null);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Exception -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x0025 }] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44981u(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x0025 }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001f
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0025 }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0025 }
            r6 = 0
            r7 = 0
            x.f$t r8 = p270x.C10300f.C10338t.f15606g     // Catch:{ Exception -> 0x0025 }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0025 }
            return r1
        L_0x001f:
            bo.app.t6 r2 = r11.f15556a     // Catch:{ Exception -> 0x0025 }
            r2.mo29700e(r12)     // Catch:{ Exception -> 0x0025 }
            return r0
        L_0x0025:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            x.f$v r7 = new x.f$v
            r7.<init>(r12)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r11
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p270x.C10300f.mo44981u(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Exception -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x0025 }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44982v(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x0025 }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001f
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0025 }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0025 }
            r6 = 0
            r7 = 0
            x.f$x r8 = p270x.C10300f.C10342x.f15610g     // Catch:{ Exception -> 0x0025 }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0025 }
            return r1
        L_0x001f:
            bo.app.t6 r2 = r11.f15556a     // Catch:{ Exception -> 0x0025 }
            r2.mo29702f(r12)     // Catch:{ Exception -> 0x0025 }
            return r0
        L_0x0025:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            x.f$y r7 = new x.f$y
            r7.<init>(r12)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r11
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p270x.C10300f.mo44982v(java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Exception -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x0025 }] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44983w(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x0025 }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001f
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0025 }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0025 }
            r6 = 0
            r7 = 0
            x.f$b0 r8 = p270x.C10300f.C10304b0.f15567g     // Catch:{ Exception -> 0x0025 }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0025 }
            return r1
        L_0x001f:
            bo.app.t6 r2 = r11.f15556a     // Catch:{ Exception -> 0x0025 }
            r2.mo29704g(r12)     // Catch:{ Exception -> 0x0025 }
            return r0
        L_0x0025:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            x.f$d0 r7 = new x.f$d0
            r7.<init>(r12)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r11
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p270x.C10300f.mo44983w(java.lang.String):boolean");
    }

    /* renamed from: x */
    public final void mo44984x(String str, double d, double d2) {
        String str2 = str;
        C12775o.m28639i(str2, "key");
        try {
            if (!C3036c0.m2647a(str2, this.f15560e.mo28860b())) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10312f0.f15575g, 6, (Object) null);
            } else if (!C8303k.m16499d(d, d2)) {
                try {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10316h0(d, d2), 6, (Object) null);
                } catch (Exception e) {
                    e = e;
                    double d3 = d;
                    double d4 = d2;
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10320j0(str, d, d2), 4, (Object) null);
                }
            } else {
                double d5 = d;
                double d6 = d2;
                C3785x1 a = C3240j.f1842h.mo29064a(C8303k.m16497a(str), d, d2);
                if (a != null) {
                    this.f15557b.mo28641a(a);
                }
            }
        } catch (Exception e2) {
            e = e2;
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10320j0(str, d, d2), 4, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ Exception -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010 A[Catch:{ Exception -> 0x007a }] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44985y(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            boolean r2 = p454wf.C13754v.m31532t(r12)     // Catch:{ Exception -> 0x007a }
            if (r2 != r0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x001f
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x007a }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x007a }
            r6 = 0
            r7 = 0
            x.f$l0 r8 = p270x.C10300f.C10324l0.f15591g     // Catch:{ Exception -> 0x007a }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x007a }
            return r1
        L_0x001f:
            if (r12 != 0) goto L_0x0023
            r0 = 0
            goto L_0x0058
        L_0x0023:
            int r2 = r12.length()     // Catch:{ Exception -> 0x007a }
            int r2 = r2 - r0
            r3 = r1
            r4 = r3
        L_0x002a:
            if (r3 > r2) goto L_0x004f
            if (r4 != 0) goto L_0x0030
            r5 = r3
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            char r5 = r12.charAt(r5)     // Catch:{ Exception -> 0x007a }
            r6 = 32
            int r5 = kotlin.jvm.internal.C12775o.m28641k(r5, r6)     // Catch:{ Exception -> 0x007a }
            if (r5 > 0) goto L_0x003f
            r5 = r0
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r4 != 0) goto L_0x0049
            if (r5 != 0) goto L_0x0046
            r4 = r0
            goto L_0x002a
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0049:
            if (r5 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            int r2 = r2 + -1
            goto L_0x002a
        L_0x004f:
            int r2 = r2 + r0
            java.lang.CharSequence r0 = r12.subSequence(r3, r2)     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x007a }
        L_0x0058:
            if (r0 == 0) goto L_0x0073
            boolean r2 = p126j0.C8303k.m16502g(r0)     // Catch:{ Exception -> 0x007a }
            if (r2 == 0) goto L_0x0061
            goto L_0x0073
        L_0x0061:
            j0.c r3 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x007a }
            j0.c$a r5 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x007a }
            r6 = 0
            r7 = 0
            x.f$n0 r8 = new x.f$n0     // Catch:{ Exception -> 0x007a }
            r8.<init>(r0)     // Catch:{ Exception -> 0x007a }
            r9 = 6
            r10 = 0
            r4 = r11
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x007a }
            return r1
        L_0x0073:
            bo.app.t6 r2 = r11.f15556a     // Catch:{ Exception -> 0x007a }
            boolean r12 = r2.mo29706h(r0)     // Catch:{ Exception -> 0x007a }
            return r12
        L_0x007a:
            r0 = move-exception
            r5 = r0
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11651g
            x.f$o0 r7 = new x.f$o0
            r7.<init>(r12)
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r11
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p270x.C10300f.mo44985y(java.lang.String):boolean");
    }

    /* renamed from: z */
    public final boolean mo44986z(NotificationSubscriptionType notificationSubscriptionType) {
        C12775o.m28639i(notificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            this.f15556a.mo29695b(notificationSubscriptionType);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C10332p0(notificationSubscriptionType), 4, (Object) null);
            return false;
        }
    }
}
