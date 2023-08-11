package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p073e4.C7476d;
import p085f4.C7571a;
import p085f4.C7572b;
import p231t4.C9713p;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInOptions extends C9882a implements C4719a.C4723d, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C4618d();
    @NonNull

    /* renamed from: m */
    public static final GoogleSignInOptions f4452m;
    @NonNull

    /* renamed from: n */
    public static final GoogleSignInOptions f4453n;
    @NonNull

    /* renamed from: o */
    public static final Scope f4454o = new Scope("profile");
    @NonNull

    /* renamed from: p */
    public static final Scope f4455p = new Scope(NotificationCompat.CATEGORY_EMAIL);
    @NonNull

    /* renamed from: q */
    public static final Scope f4456q = new Scope("openid");
    @NonNull

    /* renamed from: r */
    public static final Scope f4457r;
    @NonNull

    /* renamed from: s */
    public static final Scope f4458s = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: t */
    private static Comparator<Scope> f4459t = new C4617c();

    /* renamed from: b */
    final int f4460b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ArrayList<Scope> f4461c;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Account f4462d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f4463e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final boolean f4464f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f4465g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public String f4466h;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: i */
    public String f4467i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ArrayList<C7571a> f4468j;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: k */
    public String f4469k;

    /* renamed from: l */
    private Map<Integer, C7571a> f4470l;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f4457r = scope;
        C4614a aVar = new C4614a();
        aVar.mo31875c();
        aVar.mo31876d();
        f4452m = aVar.mo31873a();
        C4614a aVar2 = new C4614a();
        aVar2.mo31877e(scope, new Scope[0]);
        f4453n = aVar2.mo31873a();
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, C7476d dVar) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, C7571a>) map, str3);
    }

    @Nullable
    /* renamed from: M */
    public static GoogleSignInOptions m5924M(@Nullable String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str3, str4, (Map<Integer, C7571a>) new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static Map<Integer, C7571a> m5934X(@Nullable List<C7571a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (C7571a next : list) {
            hashMap.put(Integer.valueOf(next.mo41320A()), next);
        }
        return hashMap;
    }

    @NonNull
    /* renamed from: A */
    public ArrayList<C7571a> mo31861A() {
        return this.f4468j;
    }

    @Nullable
    /* renamed from: F */
    public String mo31862F() {
        return this.f4469k;
    }

    @NonNull
    /* renamed from: G */
    public ArrayList<Scope> mo31863G() {
        return new ArrayList<>(this.f4461c);
    }

    @Nullable
    /* renamed from: H */
    public String mo31864H() {
        return this.f4466h;
    }

    /* renamed from: I */
    public boolean mo31865I() {
        return this.f4465g;
    }

    /* renamed from: J */
    public boolean mo31866J() {
        return this.f4463e;
    }

    /* renamed from: K */
    public boolean mo31867K() {
        return this.f4464f;
    }

    @NonNull
    /* renamed from: Q */
    public final String mo31868Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f4461c, f4459t);
            Iterator<Scope> it = this.f4461c.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo32372A());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f4462d;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f4463e);
            jSONObject.put("forceCodeForRefreshToken", this.f4465g);
            jSONObject.put("serverAuthRequested", this.f4464f);
            if (!TextUtils.isEmpty(this.f4466h)) {
                jSONObject.put("serverClientId", this.f4466h);
            }
            if (!TextUtils.isEmpty(this.f4467i)) {
                jSONObject.put("hostedDomain", this.f4467i);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo31871s()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList<f4.a> r1 = r3.f4468j     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList<f4.a> r1 = r4.f4468j     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f4461c     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo31863G()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f4461c     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo31863G()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f4462d     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo31871s()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo31871s()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f4466h     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo31864H()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f4466h     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo31864H()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f4465g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo31865I()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f4463e     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo31866J()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f4464f     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo31867K()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f4469k     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo31862F()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f4461c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).mo32372A());
        }
        Collections.sort(arrayList);
        C7572b bVar = new C7572b();
        bVar.mo41322a(arrayList);
        bVar.mo41322a(this.f4462d);
        bVar.mo41322a(this.f4466h);
        bVar.mo41324c(this.f4465g);
        bVar.mo41324c(this.f4463e);
        bVar.mo41324c(this.f4464f);
        bVar.mo41322a(this.f4469k);
        return bVar.mo41323b();
    }

    @Nullable
    /* renamed from: s */
    public Account mo31871s() {
        return this.f4462d;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f4460b);
        C9883b.m20543w(parcel, 2, mo31863G(), false);
        C9883b.m20538r(parcel, 3, mo31871s(), i, false);
        C9883b.m20523c(parcel, 4, mo31866J());
        C9883b.m20523c(parcel, 5, mo31867K());
        C9883b.m20523c(parcel, 6, mo31865I());
        C9883b.m20539s(parcel, 7, mo31864H(), false);
        C9883b.m20539s(parcel, 8, this.f4467i, false);
        C9883b.m20543w(parcel, 9, mo31861A(), false);
        C9883b.m20539s(parcel, 10, mo31862F(), false);
        C9883b.m20522b(parcel, a);
    }

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C4614a {

        /* renamed from: a */
        private Set<Scope> f4471a = new HashSet();

        /* renamed from: b */
        private boolean f4472b;

        /* renamed from: c */
        private boolean f4473c;

        /* renamed from: d */
        private boolean f4474d;
        @Nullable

        /* renamed from: e */
        private String f4475e;
        @Nullable

        /* renamed from: f */
        private Account f4476f;
        @Nullable

        /* renamed from: g */
        private String f4477g;

        /* renamed from: h */
        private Map<Integer, C7571a> f4478h = new HashMap();
        @Nullable

        /* renamed from: i */
        private String f4479i;

        public C4614a() {
        }

        /* renamed from: i */
        private final String m5944i(String str) {
            C9713p.m20271f(str);
            String str2 = this.f4475e;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            C9713p.m20267b(z, "two different server client ids provided");
            return str;
        }

        @NonNull
        /* renamed from: a */
        public GoogleSignInOptions mo31873a() {
            if (this.f4471a.contains(GoogleSignInOptions.f4458s)) {
                Set<Scope> set = this.f4471a;
                Scope scope = GoogleSignInOptions.f4457r;
                if (set.contains(scope)) {
                    this.f4471a.remove(scope);
                }
            }
            if (this.f4474d && (this.f4476f == null || !this.f4471a.isEmpty())) {
                mo31875c();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f4471a), this.f4476f, this.f4474d, this.f4472b, this.f4473c, this.f4475e, this.f4477g, this.f4478h, this.f4479i, (C7476d) null);
        }

        @NonNull
        /* renamed from: b */
        public C4614a mo31874b() {
            this.f4471a.add(GoogleSignInOptions.f4455p);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C4614a mo31875c() {
            this.f4471a.add(GoogleSignInOptions.f4456q);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C4614a mo31876d() {
            this.f4471a.add(GoogleSignInOptions.f4454o);
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C4614a mo31877e(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f4471a.add(scope);
            this.f4471a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C4614a mo31878f(@NonNull String str) {
            mo31879g(str, false);
            return this;
        }

        @NonNull
        /* renamed from: g */
        public C4614a mo31879g(@NonNull String str, boolean z) {
            this.f4472b = true;
            m5944i(str);
            this.f4475e = str;
            this.f4473c = z;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public C4614a mo31880h(@NonNull String str) {
            this.f4479i = str;
            return this;
        }

        public C4614a(@NonNull GoogleSignInOptions googleSignInOptions) {
            C9713p.m20275j(googleSignInOptions);
            this.f4471a = new HashSet(googleSignInOptions.f4461c);
            this.f4472b = googleSignInOptions.f4464f;
            this.f4473c = googleSignInOptions.f4465g;
            this.f4474d = googleSignInOptions.f4463e;
            this.f4475e = googleSignInOptions.f4466h;
            this.f4476f = googleSignInOptions.f4462d;
            this.f4477g = googleSignInOptions.f4467i;
            this.f4478h = GoogleSignInOptions.m5934X(googleSignInOptions.f4468j);
            this.f4479i = googleSignInOptions.f4469k;
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, ArrayList<C7571a> arrayList2, @Nullable String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m5934X(arrayList2), str3);
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map<Integer, C7571a> map, @Nullable String str3) {
        this.f4460b = i;
        this.f4461c = arrayList;
        this.f4462d = account;
        this.f4463e = z;
        this.f4464f = z2;
        this.f4465g = z3;
        this.f4466h = str;
        this.f4467i = str2;
        this.f4468j = new ArrayList<>(map.values());
        this.f4470l = map;
        this.f4469k = str3;
    }
}
