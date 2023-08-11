package p021a3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: a3.m */
/* compiled from: LoginConfiguration.kt */
public final class C2175m {

    /* renamed from: c */
    public static final C2176a f924c = new C2176a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Set<String> f925a;

    /* renamed from: b */
    private final String f926b;

    /* renamed from: a3.m$a */
    /* compiled from: LoginConfiguration.kt */
    public static final class C2176a {
        private C2176a() {
        }

        public /* synthetic */ C2176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2175m(Collection<String> collection) {
        this(collection, (String) null, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final String mo23433a() {
        return this.f926b;
    }

    /* renamed from: b */
    public final Set<String> mo23434b() {
        return this.f925a;
    }

    public C2175m(Collection<String> collection, String str) {
        HashSet hashSet;
        C12775o.m28639i(str, "nonce");
        if (C2193u.m1738a(str)) {
            if (collection == null) {
                hashSet = new HashSet();
            }
            hashSet.add("openid");
            Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
            C12775o.m28638h(unmodifiableSet, "unmodifiableSet(permissions)");
            this.f925a = unmodifiableSet;
            this.f926b = str;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C2175m(java.util.Collection r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0011
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "randomUUID().toString()"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
        L_0x0011:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021a3.C2175m.<init>(java.util.Collection, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
