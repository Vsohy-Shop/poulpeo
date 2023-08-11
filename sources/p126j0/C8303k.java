package p126j0;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p042bo.app.C3119e5;
import p126j0.C8266c;
import p404of.C13074a;
import p454wf.C13735j;

/* renamed from: j0.k */
public final class C8303k {

    /* renamed from: a */
    public static final C8303k f11691a = new C8303k();

    /* renamed from: b */
    private static final Set<String> f11692b = C12731y0.m28555i("AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL");

    /* renamed from: c */
    private static final C13735j f11693c = new C13735j(".+@.+\\..+");

    /* renamed from: d */
    private static final C13735j f11694d = new C13735j("^[0-9 .\\(\\)\\+\\-]+$");

    /* renamed from: j0.k$a */
    static final class C8304a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Ref$ObjectRef<String> f11695g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8304a(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f11695g = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Provided string field is too long [" + ((String) this.f11695g.f20403b).length() + "]. The max length is 255, truncating provided field.";
        }
    }

    /* renamed from: j0.k$b */
    static final class C8305b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8305b f11696g = new C8305b();

        C8305b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
        }
    }

    /* renamed from: j0.k$c */
    static final class C8306c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11697g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8306c(String str) {
            super(0);
            this.f11697g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The custom event is a blocklisted custom event: " + this.f11697g + ". Invalid custom event.";
        }
    }

    /* renamed from: j0.k$d */
    static final class C8307d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8307d f11698g = new C8307d();

        C8307d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The productId is empty, not logging in-app purchase to Braze.";
        }
    }

    /* renamed from: j0.k$e */
    static final class C8308e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11699g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8308e(String str) {
            super(0);
            this.f11699g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("The productId is a blocklisted productId: ", this.f11699g);
        }
    }

    /* renamed from: j0.k$f */
    static final class C8309f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8309f f11700g = new C8309f();

        C8309f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("The currencyCode is empty. Expected one of ", C8303k.f11691a.mo42244b());
        }
    }

    /* renamed from: j0.k$g */
    static final class C8310g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11701g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8310g(String str) {
            super(0);
            this.f11701g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The currencyCode " + this.f11701g + " is invalid. Expected one of " + C8303k.f11691a.mo42244b();
        }
    }

    /* renamed from: j0.k$h */
    static final class C8311h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8311h f11702g = new C8311h();

        C8311h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "The price is null.";
        }
    }

    /* renamed from: j0.k$i */
    static final class C8312i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11703g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8312i(int i) {
            super(0);
            this.f11703g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The requested purchase quantity of " + this.f11703g + " is less than one. Invalid purchase";
        }
    }

    /* renamed from: j0.k$j */
    static final class C8313j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11704g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8313j(int i) {
            super(0);
            this.f11704g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The requested purchase quantity of " + this.f11704g + " is greater than the maximum of 100";
        }
    }

    /* renamed from: j0.k$k */
    static final class C8314k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8314k f11705g = new C8314k();

        C8314k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Campaign ID cannot be null or blank";
        }
    }

    /* renamed from: j0.k$l */
    static final class C8315l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8315l f11706g = new C8315l();

        C8315l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Push story page ID cannot be null or blank";
        }
    }

    private C8303k() {
    }

    /* renamed from: a */
    public static final String m16497a(String str) {
        boolean z;
        if (str == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T obj = C13755w.m31561N0(str).toString();
        ref$ObjectRef.f20403b = obj;
        int length = obj.length();
        C8303k kVar = f11691a;
        if (length > 255) {
            C8266c.m16396e(C8266c.f11641a, kVar, C8266c.C8267a.f11651g, (Throwable) null, false, new C8304a(ref$ObjectRef), 6, (Object) null);
            T substring = ((String) ref$ObjectRef.f20403b).substring(0, 255);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            ref$ObjectRef.f20403b = substring;
        }
        return (String) ref$ObjectRef.f20403b;
    }

    /* renamed from: c */
    public static final boolean m16498c(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && str.length() <= 255) {
            return f11693c.mo53412e(str);
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m16499d(double d, double d2) {
        if (d >= 90.0d || d <= -90.0d || d2 >= 180.0d || d2 <= -180.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m16500e(String str, C3119e5 e5Var) {
        boolean z;
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        if (str == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, f11691a, C8266c.C8267a.f11651g, (Throwable) null, false, C8305b.f11696g, 6, (Object) null);
        } else if (!e5Var.mo28862c().contains(str)) {
            return true;
        } else {
            C8266c.m16396e(C8266c.f11641a, f11691a, C8266c.C8267a.f11651g, (Throwable) null, false, new C8306c(str), 6, (Object) null);
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m16501f(String str, String str2, BigDecimal bigDecimal, int i, C3119e5 e5Var) {
        boolean z;
        boolean z2;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        C12775o.m28639i(e5Var, "serverConfigStorageProvider");
        if (str3 == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, f11691a, C8266c.C8267a.f11651g, (Throwable) null, false, C8307d.f11698g, 6, (Object) null);
        } else if (e5Var.mo28863d().contains(str3)) {
            C8266c.m16396e(C8266c.f11641a, f11691a, C8266c.C8267a.f11651g, (Throwable) null, false, new C8308e(str3), 6, (Object) null);
        } else {
            if (str4 == null || C13754v.m31532t(str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C8266c.m16396e(C8266c.f11641a, f11691a, C8266c.C8267a.f11651g, (Throwable) null, false, C8309f.f11700g, 6, (Object) null);
            } else {
                C8303k kVar = f11691a;
                Set<String> set = f11692b;
                String obj = C13755w.m31561N0(str2).toString();
                Locale locale = Locale.US;
                C12775o.m28638h(locale, "US");
                String upperCase = obj.toUpperCase(locale);
                C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (!set.contains(upperCase)) {
                    C8266c.m16396e(C8266c.f11641a, kVar, C8266c.C8267a.f11651g, (Throwable) null, false, new C8310g(str4), 6, (Object) null);
                } else if (bigDecimal == null) {
                    C8266c.m16396e(C8266c.f11641a, kVar, C8266c.C8267a.f11651g, (Throwable) null, false, C8311h.f11702g, 6, (Object) null);
                } else if (i2 <= 0) {
                    C8266c.m16396e(C8266c.f11641a, kVar, C8266c.C8267a.f11651g, (Throwable) null, false, new C8312i(i2), 6, (Object) null);
                } else if (i2 <= 100) {
                    return true;
                } else {
                    C8266c.m16396e(C8266c.f11641a, kVar, C8266c.C8267a.f11651g, (Throwable) null, false, new C8313j(i2), 6, (Object) null);
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m16502g(String str) {
        if (str == null || !f11694d.mo53412e(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static final boolean m16503h(String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, f11691a, C8266c.C8267a.f11651g, (Throwable) null, false, C8314k.f11705g, 6, (Object) null);
        } else {
            if (str2 == null || C13754v.m31532t(str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return true;
            }
            C8266c.m16396e(C8266c.f11641a, f11691a, C8266c.C8267a.f11651g, (Throwable) null, false, C8315l.f11706g, 6, (Object) null);
        }
        return false;
    }

    /* renamed from: b */
    public final Set<String> mo42244b() {
        return f11692b;
    }
}
