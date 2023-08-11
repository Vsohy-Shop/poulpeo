package p033b2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p251v2.C9925a;

/* renamed from: b2.n */
/* compiled from: PersistedEvents.kt */
public final class C2869n implements Serializable {

    /* renamed from: c */
    public static final C2870a f1254c = new C2870a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: b */
    private final HashMap<C2828a, List<C2834c>> f1255b;

    /* renamed from: b2.n$a */
    /* compiled from: PersistedEvents.kt */
    public static final class C2870a {
        private C2870a() {
        }

        public /* synthetic */ C2870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b2.n$b */
    /* compiled from: PersistedEvents.kt */
    public static final class C2871b implements Serializable {

        /* renamed from: c */
        public static final C2872a f1256c = new C2872a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: b */
        private final HashMap<C2828a, List<C2834c>> f1257b;

        /* renamed from: b2.n$b$a */
        /* compiled from: PersistedEvents.kt */
        public static final class C2872a {
            private C2872a() {
            }

            public /* synthetic */ C2872a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C2871b(HashMap<C2828a, List<C2834c>> hashMap) {
            C12775o.m28639i(hashMap, "proxyEvents");
            this.f1257b = hashMap;
        }

        private final Object readResolve() {
            return new C2869n(this.f1257b);
        }
    }

    public C2869n() {
        this.f1255b = new HashMap<>();
    }

    private final Object writeReplace() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return new C2871b(this.f1255b);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo28400a(C2828a aVar, List<C2834c> list) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(aVar, "accessTokenAppIdPair");
                C12775o.m28639i(list, "appEvents");
                if (!this.f1255b.containsKey(aVar)) {
                    this.f1255b.put(aVar, C12686e0.m28207D0(list));
                    return;
                }
                List list2 = this.f1255b.get(aVar);
                if (list2 != null) {
                    list2.addAll(list);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: b */
    public final List<C2834c> mo28401b(C2828a aVar) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "accessTokenAppIdPair");
            return this.f1255b.get(aVar);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final Set<C2828a> mo28402c() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            Set<C2828a> keySet = this.f1255b.keySet();
            C12775o.m28638h(keySet, "events.keys");
            return keySet;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    public C2869n(HashMap<C2828a, List<C2834c>> hashMap) {
        C12775o.m28639i(hashMap, "appEventMap");
        HashMap<C2828a, List<C2834c>> hashMap2 = new HashMap<>();
        this.f1255b = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
