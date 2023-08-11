package p021a3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C4509a;
import com.facebook.C4538f;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p178o2.C8955d;
import p198q2.C9134d;
import p198q2.C9138d0;
import p198q2.C9144e0;

/* renamed from: a3.l */
/* compiled from: LoginClient */
class C2166l implements Parcelable {
    public static final Parcelable.Creator<C2166l> CREATOR = new C2167a();

    /* renamed from: b */
    C2188q[] f884b;

    /* renamed from: c */
    int f885c;

    /* renamed from: d */
    Fragment f886d;

    /* renamed from: e */
    C2169c f887e;

    /* renamed from: f */
    C2168b f888f;

    /* renamed from: g */
    boolean f889g;

    /* renamed from: h */
    C2170d f890h;

    /* renamed from: i */
    Map<String, String> f891i;

    /* renamed from: j */
    Map<String, String> f892j;

    /* renamed from: k */
    private C2180o f893k;

    /* renamed from: l */
    private int f894l;

    /* renamed from: m */
    private int f895m;

    /* renamed from: a3.l$a */
    /* compiled from: LoginClient */
    static class C2167a implements Parcelable.Creator<C2166l> {
        C2167a() {
        }

        /* renamed from: a */
        public C2166l createFromParcel(Parcel parcel) {
            return new C2166l(parcel);
        }

        /* renamed from: b */
        public C2166l[] newArray(int i) {
            return new C2166l[i];
        }
    }

    /* renamed from: a3.l$b */
    /* compiled from: LoginClient */
    interface C2168b {
        /* renamed from: a */
        void mo23394a();

        /* renamed from: b */
        void mo23395b();
    }

    /* renamed from: a3.l$c */
    /* compiled from: LoginClient */
    public interface C2169c {
        /* renamed from: a */
        void mo23396a(C2172e eVar);
    }

    /* renamed from: a3.l$d */
    /* compiled from: LoginClient */
    public static class C2170d implements Parcelable {
        public static final Parcelable.Creator<C2170d> CREATOR = new C2171a();

        /* renamed from: b */
        private final C2165k f896b;

        /* renamed from: c */
        private Set<String> f897c;

        /* renamed from: d */
        private final C2140c f898d;

        /* renamed from: e */
        private final String f899e;

        /* renamed from: f */
        private final String f900f;

        /* renamed from: g */
        private boolean f901g;

        /* renamed from: h */
        private String f902h;

        /* renamed from: i */
        private String f903i;

        /* renamed from: j */
        private String f904j;
        @Nullable

        /* renamed from: k */
        private String f905k;

        /* renamed from: l */
        private boolean f906l;

        /* renamed from: m */
        private final C2190s f907m;

        /* renamed from: n */
        private boolean f908n;

        /* renamed from: o */
        private boolean f909o;

        /* renamed from: p */
        private String f910p;

        /* renamed from: a3.l$d$a */
        /* compiled from: LoginClient */
        static class C2171a implements Parcelable.Creator<C2170d> {
            C2171a() {
            }

            /* renamed from: a */
            public C2170d createFromParcel(Parcel parcel) {
                return new C2170d(parcel, (C2167a) null);
            }

            /* renamed from: b */
            public C2170d[] newArray(int i) {
                return new C2170d[i];
            }
        }

        /* synthetic */ C2170d(Parcel parcel, C2167a aVar) {
            this(parcel);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public boolean mo23397A() {
            return this.f909o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo23398a() {
            return this.f899e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo23399b() {
            return this.f900f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo23400c() {
            return this.f903i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C2140c mo23401d() {
            return this.f898d;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo23403e() {
            return this.f904j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public String mo23404f() {
            return this.f902h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C2165k mo23405g() {
            return this.f896b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C2190s mo23406h() {
            return this.f907m;
        }

        @Nullable
        /* renamed from: i */
        public String mo23407i() {
            return this.f905k;
        }

        /* renamed from: k */
        public String mo23408k() {
            return this.f910p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public Set<String> mo23409l() {
            return this.f897c;
        }

        /* renamed from: m */
        public boolean mo23410m() {
            return this.f906l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo23411n() {
            for (String g : this.f897c) {
                if (C2182p.m1689g(g)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo23412o() {
            return this.f908n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public boolean mo23413p() {
            if (this.f907m == C2190s.INSTAGRAM) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo23414q() {
            return this.f901g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo23415s(boolean z) {
            this.f908n = z;
        }

        /* renamed from: v */
        public void mo23416v(@Nullable String str) {
            this.f905k = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo23417w(Set<String> set) {
            C9144e0.m18691j(set, "permissions");
            this.f897c = set;
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str;
            String str2;
            C2165k kVar = this.f896b;
            String str3 = null;
            if (kVar != null) {
                str = kVar.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeStringList(new ArrayList(this.f897c));
            C2140c cVar = this.f898d;
            if (cVar != null) {
                str2 = cVar.name();
            } else {
                str2 = null;
            }
            parcel.writeString(str2);
            parcel.writeString(this.f899e);
            parcel.writeString(this.f900f);
            parcel.writeByte(this.f901g ? (byte) 1 : 0);
            parcel.writeString(this.f902h);
            parcel.writeString(this.f903i);
            parcel.writeString(this.f904j);
            parcel.writeString(this.f905k);
            parcel.writeByte(this.f906l ? (byte) 1 : 0);
            C2190s sVar = this.f907m;
            if (sVar != null) {
                str3 = sVar.name();
            }
            parcel.writeString(str3);
            parcel.writeByte(this.f908n ? (byte) 1 : 0);
            parcel.writeByte(this.f909o ? (byte) 1 : 0);
            parcel.writeString(this.f910p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo23419x(boolean z) {
            this.f901g = z;
        }

        /* renamed from: y */
        public void mo23420y(boolean z) {
            this.f906l = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo23421z(boolean z) {
            this.f909o = z;
        }

        C2170d(C2165k kVar, Set<String> set, C2140c cVar, String str, String str2, String str3, C2190s sVar, String str4) {
            this.f901g = false;
            this.f908n = false;
            this.f909o = false;
            this.f896b = kVar;
            this.f897c = set == null ? new HashSet<>() : set;
            this.f898d = cVar;
            this.f903i = str;
            this.f899e = str2;
            this.f900f = str3;
            this.f907m = sVar;
            this.f910p = str4;
        }

        private C2170d(Parcel parcel) {
            boolean z = false;
            this.f901g = false;
            this.f908n = false;
            this.f909o = false;
            String readString = parcel.readString();
            C2190s sVar = null;
            this.f896b = readString != null ? C2165k.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f897c = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f898d = readString2 != null ? C2140c.valueOf(readString2) : null;
            this.f899e = parcel.readString();
            this.f900f = parcel.readString();
            this.f901g = parcel.readByte() != 0;
            this.f902h = parcel.readString();
            this.f903i = parcel.readString();
            this.f904j = parcel.readString();
            this.f905k = parcel.readString();
            this.f906l = parcel.readByte() != 0;
            String readString3 = parcel.readString();
            this.f907m = readString3 != null ? C2190s.valueOf(readString3) : sVar;
            this.f908n = parcel.readByte() != 0;
            this.f909o = parcel.readByte() != 0 ? true : z;
            this.f910p = parcel.readString();
        }
    }

    /* renamed from: a3.l$e */
    /* compiled from: LoginClient */
    public static class C2172e implements Parcelable {
        public static final Parcelable.Creator<C2172e> CREATOR = new C2173a();

        /* renamed from: b */
        final C2174b f911b;
        @Nullable

        /* renamed from: c */
        final C4509a f912c;
        @Nullable

        /* renamed from: d */
        final C4538f f913d;
        @Nullable

        /* renamed from: e */
        final String f914e;
        @Nullable

        /* renamed from: f */
        final String f915f;

        /* renamed from: g */
        final C2170d f916g;

        /* renamed from: h */
        public Map<String, String> f917h;

        /* renamed from: i */
        public Map<String, String> f918i;

        /* renamed from: a3.l$e$a */
        /* compiled from: LoginClient */
        static class C2173a implements Parcelable.Creator<C2172e> {
            C2173a() {
            }

            /* renamed from: a */
            public C2172e createFromParcel(Parcel parcel) {
                return new C2172e(parcel, (C2167a) null);
            }

            /* renamed from: b */
            public C2172e[] newArray(int i) {
                return new C2172e[i];
            }
        }

        /* renamed from: a3.l$e$b */
        /* compiled from: LoginClient */
        enum C2174b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            

            /* renamed from: b */
            private final String f923b;

            private C2174b(String str) {
                this.f923b = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo23432a() {
                return this.f923b;
            }
        }

        /* synthetic */ C2172e(Parcel parcel, C2167a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        static C2172e m1655a(C2170d dVar, @Nullable String str) {
            return new C2172e(dVar, C2174b.CANCEL, (C4509a) null, str, (String) null);
        }

        /* renamed from: b */
        static C2172e m1656b(C2170d dVar, C4509a aVar, C4538f fVar) {
            return new C2172e(dVar, C2174b.SUCCESS, aVar, fVar, (String) null, (String) null);
        }

        /* renamed from: c */
        static C2172e m1657c(C2170d dVar, @Nullable String str, @Nullable String str2) {
            return m1658d(dVar, str, str2, (String) null);
        }

        /* renamed from: d */
        static C2172e m1658d(C2170d dVar, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new C2172e(dVar, C2174b.ERROR, (C4509a) null, TextUtils.join(": ", C9138d0.m18627b(str, str2)), str3);
        }

        /* renamed from: e */
        static C2172e m1659e(C2170d dVar, C4509a aVar) {
            return new C2172e(dVar, C2174b.SUCCESS, aVar, (String) null, (String) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f911b.name());
            parcel.writeParcelable(this.f912c, i);
            parcel.writeParcelable(this.f913d, i);
            parcel.writeString(this.f914e);
            parcel.writeString(this.f915f);
            parcel.writeParcelable(this.f916g, i);
            C9138d0.m18672x0(parcel, this.f917h);
            C9138d0.m18672x0(parcel, this.f918i);
        }

        C2172e(C2170d dVar, C2174b bVar, @Nullable C4509a aVar, @Nullable String str, @Nullable String str2) {
            this(dVar, bVar, aVar, (C4538f) null, str, str2);
        }

        C2172e(C2170d dVar, C2174b bVar, @Nullable C4509a aVar, @Nullable C4538f fVar, @Nullable String str, @Nullable String str2) {
            C9144e0.m18691j(bVar, "code");
            this.f916g = dVar;
            this.f912c = aVar;
            this.f913d = fVar;
            this.f914e = str;
            this.f911b = bVar;
            this.f915f = str2;
        }

        private C2172e(Parcel parcel) {
            this.f911b = C2174b.valueOf(parcel.readString());
            this.f912c = (C4509a) parcel.readParcelable(C4509a.class.getClassLoader());
            this.f913d = (C4538f) parcel.readParcelable(C4538f.class.getClassLoader());
            this.f914e = parcel.readString();
            this.f915f = parcel.readString();
            this.f916g = (C2170d) parcel.readParcelable(C2170d.class.getClassLoader());
            this.f917h = C9138d0.m18646k0(parcel);
            this.f918i = C9138d0.m18646k0(parcel);
        }
    }

    public C2166l(Fragment fragment) {
        this.f885c = -1;
        this.f894l = 0;
        this.f895m = 0;
        this.f886d = fragment;
    }

    /* renamed from: a */
    private void m1595a(String str, String str2, boolean z) {
        if (this.f891i == null) {
            this.f891i = new HashMap();
        }
        if (this.f891i.containsKey(str) && z) {
            str2 = this.f891i.get(str) + "," + str2;
        }
        this.f891i.put(str, str2);
    }

    /* renamed from: h */
    private void m1596h() {
        mo23379f(C2172e.m1657c(this.f890h, "Login attempt failed.", (String) null));
    }

    /* renamed from: l */
    static String m1597l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: p */
    private C2180o m1598p() {
        C2180o oVar = this.f893k;
        if (oVar == null || !oVar.mo23443b().equals(this.f890h.mo23398a())) {
            this.f893k = new C2180o(mo23381i(), this.f890h.mo23398a());
        }
        return this.f893k;
    }

    /* renamed from: q */
    public static int m1599q() {
        return C9134d.C9137c.Login.mo43395a();
    }

    /* renamed from: v */
    private void m1600v(String str, C2172e eVar, Map<String, String> map) {
        m1601w(str, eVar.f911b.mo23432a(), eVar.f914e, eVar.f915f, map);
    }

    /* renamed from: w */
    private void m1601w(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5 = "fb_mobile_login_method_complete";
        if (this.f890h == null) {
            m1598p().mo23450j(str5, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        C2180o p = m1598p();
        String b = this.f890h.mo23399b();
        if (this.f890h.mo23412o()) {
            str5 = "foa_mobile_login_method_complete";
        }
        p.mo23444c(b, str, str2, str3, str4, map, str5);
    }

    /* renamed from: z */
    private void m1602z(C2172e eVar) {
        C2169c cVar = this.f887e;
        if (cVar != null) {
            cVar.mo23396a(eVar);
        }
    }

    /* renamed from: A */
    public boolean mo23366A(int i, int i2, Intent intent) {
        this.f894l++;
        if (this.f890h != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f4088j, false)) {
                mo23372H();
                return false;
            } else if (!mo23382k().mo23278o() || intent != null || this.f894l >= this.f895m) {
                return mo23382k().mo23276l(i, i2, intent);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo23367C(C2168b bVar) {
        this.f888f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo23368D(Fragment fragment) {
        if (this.f886d == null) {
            this.f886d = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo23369E(C2169c cVar) {
        this.f887e = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo23370F(C2170d dVar) {
        if (!mo23385o()) {
            mo23374b(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo23371G() {
        String str;
        String str2;
        C2188q k = mo23382k();
        if (!k.mo23466k() || mo23376d()) {
            int p = k.mo23279p(this.f890h);
            this.f894l = 0;
            if (p > 0) {
                C2180o p2 = m1598p();
                String b = this.f890h.mo23399b();
                String g = k.mo23275g();
                if (this.f890h.mo23412o()) {
                    str2 = "foa_mobile_login_method_start";
                } else {
                    str2 = "fb_mobile_login_method_start";
                }
                p2.mo23446e(b, g, str2);
                this.f895m = p;
            } else {
                C2180o p3 = m1598p();
                String b2 = this.f890h.mo23399b();
                String g2 = k.mo23275g();
                if (this.f890h.mo23412o()) {
                    str = "foa_mobile_login_method_not_tried";
                } else {
                    str = "fb_mobile_login_method_not_tried";
                }
                p3.mo23445d(b2, g2, str);
                m1595a("not_tried", k.mo23275g(), true);
            }
            if (p > 0) {
                return true;
            }
            return false;
        }
        m1595a("no_internet_permission", "1", false);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo23372H() {
        int i;
        if (this.f885c >= 0) {
            m1601w(mo23382k().mo23275g(), "skipped", (String) null, (String) null, mo23382k().f955b);
        }
        do {
            C2188q[] qVarArr = this.f884b;
            if (qVarArr != null && (i = this.f885c) < qVarArr.length - 1) {
                this.f885c = i + 1;
            } else if (this.f890h != null) {
                m1596h();
                return;
            } else {
                return;
            }
        } while (!mo23371G());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo23373I(C2172e eVar) {
        C2172e eVar2;
        if (eVar.f912c != null) {
            C4509a d = C4509a.m5515d();
            C4509a aVar = eVar.f912c;
            if (!(d == null || aVar == null)) {
                try {
                    if (d.mo31501o().equals(aVar.mo31501o())) {
                        eVar2 = C2172e.m1659e(this.f890h, eVar.f912c);
                        mo23379f(eVar2);
                        return;
                    }
                } catch (Exception e) {
                    mo23379f(C2172e.m1657c(this.f890h, "Caught exception", e.getMessage()));
                    return;
                }
            }
            eVar2 = C2172e.m1657c(this.f890h, "User logged in as different Facebook user.", (String) null);
            mo23379f(eVar2);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo23374b(C2170d dVar) {
        if (dVar != null) {
            if (this.f890h != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!C4509a.m5516p() || mo23376d()) {
                this.f890h = dVar;
                this.f884b = mo23384n(dVar);
                mo23372H();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo23375c() {
        if (this.f885c >= 0) {
            mo23382k().mo23336b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo23376d() {
        if (this.f889g) {
            return true;
        }
        if (mo23378e("android.permission.INTERNET") != 0) {
            FragmentActivity i = mo23381i();
            mo23379f(C2172e.m1657c(this.f890h, i.getString(C8955d.f13001c), i.getString(C8955d.f13000b)));
            return false;
        }
        this.f889g = true;
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo23378e(String str) {
        return mo23381i().checkCallingOrSelfPermission(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23379f(C2172e eVar) {
        C2188q k = mo23382k();
        if (k != null) {
            m1600v(k.mo23275g(), eVar, k.f955b);
        }
        Map<String, String> map = this.f891i;
        if (map != null) {
            eVar.f917h = map;
        }
        Map<String, String> map2 = this.f892j;
        if (map2 != null) {
            eVar.f918i = map2;
        }
        this.f884b = null;
        this.f885c = -1;
        this.f890h = null;
        this.f891i = null;
        this.f894l = 0;
        this.f895m = 0;
        m1602z(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo23380g(C2172e eVar) {
        if (eVar.f912c == null || !C4509a.m5516p()) {
            mo23379f(eVar);
        } else {
            mo23373I(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public FragmentActivity mo23381i() {
        return this.f886d.getActivity();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C2188q mo23382k() {
        int i = this.f885c;
        if (i >= 0) {
            return this.f884b[i];
        }
        return null;
    }

    /* renamed from: m */
    public Fragment mo23383m() {
        return this.f886d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C2188q[] mo23384n(C2170d dVar) {
        ArrayList arrayList = new ArrayList();
        C2165k g = dVar.mo23405g();
        if (!dVar.mo23413p()) {
            if (g.mo23362d()) {
                arrayList.add(new C2157h(this));
            }
            if (!FacebookSdk.bypassAppSwitch && g.mo23364f()) {
                arrayList.add(new C2163j(this));
            }
            if (!FacebookSdk.bypassAppSwitch && g.mo23361c()) {
                arrayList.add(new C2154f(this));
            }
        } else if (!FacebookSdk.bypassAppSwitch && g.mo23363e()) {
            arrayList.add(new C2161i(this));
        }
        if (g.mo23359a()) {
            arrayList.add(new C2137a(this));
        }
        if (g.mo23365g()) {
            arrayList.add(new C2196x(this));
        }
        if (!dVar.mo23413p() && g.mo23360b()) {
            arrayList.add(new C2152e(this));
        }
        C2188q[] qVarArr = new C2188q[arrayList.size()];
        arrayList.toArray(qVarArr);
        return qVarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo23385o() {
        if (this.f890h == null || this.f885c < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public C2170d mo23386s() {
        return this.f890h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f884b, i);
        parcel.writeInt(this.f885c);
        parcel.writeParcelable(this.f890h, i);
        C9138d0.m18672x0(parcel, this.f891i);
        C9138d0.m18672x0(parcel, this.f892j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo23388x() {
        C2168b bVar = this.f888f;
        if (bVar != null) {
            bVar.mo23394a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo23389y() {
        C2168b bVar = this.f888f;
        if (bVar != null) {
            bVar.mo23395b();
        }
    }

    public C2166l(Parcel parcel) {
        this.f885c = -1;
        this.f894l = 0;
        this.f895m = 0;
        Parcelable[] readParcelableArray = parcel.readParcelableArray(C2188q.class.getClassLoader());
        this.f884b = new C2188q[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            C2188q[] qVarArr = this.f884b;
            C2188q qVar = (C2188q) readParcelableArray[i];
            qVarArr[i] = qVar;
            qVar.mo23467n(this);
        }
        this.f885c = parcel.readInt();
        this.f890h = (C2170d) parcel.readParcelable(C2170d.class.getClassLoader());
        this.f891i = C9138d0.m18646k0(parcel);
        this.f892j = C9138d0.m18646k0(parcel);
    }
}
