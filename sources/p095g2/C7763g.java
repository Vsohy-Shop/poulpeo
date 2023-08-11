package p095g2;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: g2.g */
/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
public final class C7763g {

    /* renamed from: g */
    private static C7763g f10776g;

    /* renamed from: h */
    private static final AtomicBoolean f10777h = new AtomicBoolean(false);

    /* renamed from: i */
    public static final C7764a f10778i = new C7764a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Class<?> f10779a;

    /* renamed from: b */
    private final Class<?> f10780b;

    /* renamed from: c */
    private final Method f10781c;

    /* renamed from: d */
    private final Method f10782d;

    /* renamed from: e */
    private final Method f10783e;

    /* renamed from: f */
    private final Method f10784f;

    /* renamed from: g2.g$a */
    /* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    public static final class C7764a {
        private C7764a() {
        }

        public /* synthetic */ C7764a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m15138a() {
            Class<?> a = C7765h.m15140a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> a2 = C7765h.m15140a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a != null && a2 != null) {
                Method b = C7765h.m15141b(a, "newBuilder", new Class[0]);
                Method b2 = C7765h.m15141b(a2, "setType", String.class);
                Method b3 = C7765h.m15141b(a2, "setSkusList", List.class);
                Method b4 = C7765h.m15141b(a2, "build", new Class[0]);
                if (b != null && b2 != null && b3 != null && b4 != null) {
                    C7763g.m15135c(new C7763g(a, a2, b, b2, b3, b4));
                }
            }
        }

        /* renamed from: b */
        public final C7763g mo41412b() {
            if (C7763g.m15133a().get()) {
                return C7763g.m15134b();
            }
            m15138a();
            C7763g.m15133a().set(true);
            return C7763g.m15134b();
        }
    }

    public C7763g(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        C12775o.m28639i(cls, "skuDetailsParamsClazz");
        C12775o.m28639i(cls2, "builderClazz");
        C12775o.m28639i(method, "newBuilderMethod");
        C12775o.m28639i(method2, "setTypeMethod");
        C12775o.m28639i(method3, "setSkusListMethod");
        C12775o.m28639i(method4, "buildMethod");
        this.f10779a = cls;
        this.f10780b = cls2;
        this.f10781c = method;
        this.f10782d = method2;
        this.f10783e = method3;
        this.f10784f = method4;
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicBoolean m15133a() {
        Class<C7763g> cls = C7763g.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f10777h;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C7763g m15134b() {
        Class<C7763g> cls = C7763g.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f10776g;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m15135c(C7763g gVar) {
        Class<C7763g> cls = C7763g.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f10776g = gVar;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public final Object mo41410d(String str, List<String> list) {
        Object c;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            Object c2 = C7765h.m15142c(this.f10779a, this.f10781c, (Object) null, new Object[0]);
            if (c2 == null || (c = C7765h.m15142c(this.f10780b, this.f10782d, c2, str)) == null) {
                return null;
            }
            Object c3 = C7765h.m15142c(this.f10780b, this.f10783e, c, list);
            if (c3 == null) {
                return null;
            }
            return C7765h.m15142c(this.f10780b, this.f10784f, c3, new Object[0]);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final Class<?> mo41411e() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return this.f10779a;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }
}
