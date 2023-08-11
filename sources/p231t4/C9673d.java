package p231t4;

import android.accounts.Account;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p221s5.C9495a;

/* renamed from: t4.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9673d {

    /* renamed from: a */
    private final Account f14416a;

    /* renamed from: b */
    private final Set<Scope> f14417b;

    /* renamed from: c */
    private final Set<Scope> f14418c;

    /* renamed from: d */
    private final Map<C4719a<?>, C9660a0> f14419d;

    /* renamed from: e */
    private final int f14420e;

    /* renamed from: f */
    private final View f14421f;

    /* renamed from: g */
    private final String f14422g;

    /* renamed from: h */
    private final String f14423h;

    /* renamed from: i */
    private final C9495a f14424i;

    /* renamed from: j */
    private Integer f14425j;

    /* renamed from: t4.d$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C9674a {

        /* renamed from: a */
        private Account f14426a;

        /* renamed from: b */
        private ArraySet<Scope> f14427b;

        /* renamed from: c */
        private String f14428c;

        /* renamed from: d */
        private String f14429d;

        /* renamed from: e */
        private C9495a f14430e = C9495a.f14152k;

        @NonNull
        /* renamed from: a */
        public C9673d mo44170a() {
            return new C9673d(this.f14426a, this.f14427b, (Map<C4719a<?>, C9660a0>) null, 0, (View) null, this.f14428c, this.f14429d, this.f14430e, false);
        }

        @NonNull
        /* renamed from: b */
        public C9674a mo44171b(@NonNull String str) {
            this.f14428c = str;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final C9674a mo44172c(@NonNull Collection<Scope> collection) {
            if (this.f14427b == null) {
                this.f14427b = new ArraySet<>();
            }
            this.f14427b.addAll(collection);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final C9674a mo44173d(Account account) {
            this.f14426a = account;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final C9674a mo44174e(@NonNull String str) {
            this.f14429d = str;
            return this;
        }
    }

    public C9673d(Account account, @NonNull Set<Scope> set, @NonNull Map<C4719a<?>, C9660a0> map, int i, View view, @NonNull String str, @NonNull String str2, C9495a aVar, boolean z) {
        Set<Scope> set2;
        this.f14416a = account;
        if (set == null) {
            set2 = Collections.emptySet();
        } else {
            set2 = Collections.unmodifiableSet(set);
        }
        this.f14417b = set2;
        map = map == null ? Collections.emptyMap() : map;
        this.f14419d = map;
        this.f14421f = view;
        this.f14420e = i;
        this.f14422g = str;
        this.f14423h = str2;
        this.f14424i = aVar == null ? C9495a.f14152k : aVar;
        HashSet hashSet = new HashSet(set2);
        for (C9660a0 a0Var : map.values()) {
            hashSet.addAll(a0Var.f14372a);
        }
        this.f14418c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public Account mo44159a() {
        return this.f14416a;
    }

    @Deprecated
    @Nullable
    /* renamed from: b */
    public String mo44160b() {
        Account account = this.f14416a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    /* renamed from: c */
    public Account mo44161c() {
        Account account = this.f14416a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    @NonNull
    /* renamed from: d */
    public Set<Scope> mo44162d() {
        return this.f14418c;
    }

    @NonNull
    /* renamed from: e */
    public Set<Scope> mo44163e(@NonNull C4719a<?> aVar) {
        C9660a0 a0Var = this.f14419d.get(aVar);
        if (a0Var == null || a0Var.f14372a.isEmpty()) {
            return this.f14417b;
        }
        HashSet hashSet = new HashSet(this.f14417b);
        hashSet.addAll(a0Var.f14372a);
        return hashSet;
    }

    @NonNull
    /* renamed from: f */
    public String mo44164f() {
        return this.f14422g;
    }

    @NonNull
    /* renamed from: g */
    public Set<Scope> mo44165g() {
        return this.f14417b;
    }

    @NonNull
    /* renamed from: h */
    public final C9495a mo44166h() {
        return this.f14424i;
    }

    @Nullable
    /* renamed from: i */
    public final Integer mo44167i() {
        return this.f14425j;
    }

    @Nullable
    /* renamed from: j */
    public final String mo44168j() {
        return this.f14423h;
    }

    /* renamed from: k */
    public final void mo44169k(@NonNull Integer num) {
        this.f14425j = num;
    }
}
