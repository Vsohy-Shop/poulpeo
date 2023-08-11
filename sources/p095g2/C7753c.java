package p095g2;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: g2.c */
/* compiled from: InAppPurchaseBillingClientWrapper.kt */
public final class C7753c {

    /* renamed from: s */
    private static final AtomicBoolean f10734s = new AtomicBoolean(false);

    /* renamed from: t */
    private static C7753c f10735t;

    /* renamed from: u */
    private static final AtomicBoolean f10736u = new AtomicBoolean(false);

    /* renamed from: v */
    private static final Map<String, JSONObject> f10737v = new ConcurrentHashMap();

    /* renamed from: w */
    private static final Map<String, JSONObject> f10738w = new ConcurrentHashMap();

    /* renamed from: x */
    public static final C7755b f10739x = new C7755b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Set<String> f10740a;

    /* renamed from: b */
    private final Context f10741b;

    /* renamed from: c */
    private final Object f10742c;

    /* renamed from: d */
    private final Class<?> f10743d;

    /* renamed from: e */
    private final Class<?> f10744e;

    /* renamed from: f */
    private final Class<?> f10745f;

    /* renamed from: g */
    private final Class<?> f10746g;

    /* renamed from: h */
    private final Class<?> f10747h;

    /* renamed from: i */
    private final Class<?> f10748i;

    /* renamed from: j */
    private final Class<?> f10749j;

    /* renamed from: k */
    private final Method f10750k;

    /* renamed from: l */
    private final Method f10751l;

    /* renamed from: m */
    private final Method f10752m;

    /* renamed from: n */
    private final Method f10753n;

    /* renamed from: o */
    private final Method f10754o;

    /* renamed from: p */
    private final Method f10755p;

    /* renamed from: q */
    private final Method f10756q;

    /* renamed from: r */
    private final C7763g f10757r;

    /* renamed from: g2.c$a */
    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class C7754a implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C12775o.m28639i(obj, "proxy");
            C12775o.m28639i(method, "m");
            C12775o.m28639i(objArr, "args");
            if (C12775o.m28634d(method.getName(), "onBillingSetupFinished")) {
                C7753c.f10739x.mo41400f().set(true);
            } else {
                String name = method.getName();
                C12775o.m28638h(name, "m.name");
                if (C13754v.m31529q(name, "onBillingServiceDisconnected", false, 2, (Object) null)) {
                    C7753c.f10739x.mo41400f().set(false);
                }
            }
            return null;
        }
    }

    /* renamed from: g2.c$b */
    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class C7755b {
        private C7755b() {
        }

        public /* synthetic */ C7755b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final Object m15098a(Context context, Class<?> cls) {
            Object c;
            Object c2;
            Class<?> a = C7765h.m15140a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> a2 = C7765h.m15140a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a == null || a2 == null) {
                return null;
            }
            Method b = C7765h.m15141b(cls, "newBuilder", Context.class);
            Method b2 = C7765h.m15141b(a, "enablePendingPurchases", new Class[0]);
            Method b3 = C7765h.m15141b(a, "setListener", a2);
            Method b4 = C7765h.m15141b(a, "build", new Class[0]);
            if (b == null || b2 == null || b3 == null || b4 == null || (c = C7765h.m15142c(cls, b, (Object) null, context)) == null) {
                return null;
            }
            Object newProxyInstance = Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new C7757d());
            C12775o.m28638h(newProxyInstance, "Proxy.newProxyInstance(\n…UpdatedListenerWrapper())");
            Object c3 = C7765h.m15142c(a, b3, c, newProxyInstance);
            if (c3 == null || (c2 = C7765h.m15142c(a, b2, c3, new Object[0])) == null) {
                return null;
            }
            return C7765h.m15142c(a, b4, c2, new Object[0]);
        }

        /* renamed from: b */
        private final void m15099b(Context context) {
            Object a;
            C7763g b = C7763g.f10778i.mo41412b();
            if (b != null) {
                Class<?> a2 = C7765h.m15140a("com.android.billingclient.api.BillingClient");
                Class<?> a3 = C7765h.m15140a("com.android.billingclient.api.Purchase");
                Class<?> a4 = C7765h.m15140a("com.android.billingclient.api.Purchase$PurchasesResult");
                Class<?> a5 = C7765h.m15140a("com.android.billingclient.api.SkuDetails");
                Class<?> a6 = C7765h.m15140a("com.android.billingclient.api.PurchaseHistoryRecord");
                Class<?> a7 = C7765h.m15140a("com.android.billingclient.api.SkuDetailsResponseListener");
                Class<?> a8 = C7765h.m15140a("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (a2 != null && a4 != null && a3 != null && a5 != null && a7 != null && a6 != null && a8 != null) {
                    Class<String> cls = String.class;
                    Method b2 = C7765h.m15141b(a2, "queryPurchases", cls);
                    Method b3 = C7765h.m15141b(a4, "getPurchasesList", new Class[0]);
                    Method b4 = C7765h.m15141b(a3, "getOriginalJson", new Class[0]);
                    Method b5 = C7765h.m15141b(a5, "getOriginalJson", new Class[0]);
                    Method b6 = C7765h.m15141b(a6, "getOriginalJson", new Class[0]);
                    Method b7 = C7765h.m15141b(a2, "querySkuDetailsAsync", b.mo41411e(), a7);
                    Method b8 = C7765h.m15141b(a2, "queryPurchaseHistoryAsync", cls, a8);
                    if (b2 != null && b3 != null && b4 != null && b5 != null && b6 != null && b7 != null && b8 != null && (a = m15098a(context, a2)) != null) {
                        C7753c.m15091m(new C7753c(context, a, a2, a4, a3, a5, a6, a7, a8, b2, b3, b4, b5, b6, b7, b8, b, (DefaultConstructorMarker) null));
                        C7753c f = C7753c.m15084f();
                        if (f != null) {
                            C7753c.m15092n(f);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                    }
                }
            }
        }

        /* renamed from: c */
        public final synchronized C7753c mo41397c(Context context) {
            C12775o.m28639i(context, "context");
            if (C7753c.m15083e().get()) {
                return C7753c.m15084f();
            }
            m15099b(context);
            C7753c.m15083e().set(true);
            return C7753c.m15084f();
        }

        /* renamed from: d */
        public final Map<String, JSONObject> mo41398d() {
            return C7753c.m15085g();
        }

        /* renamed from: e */
        public final Map<String, JSONObject> mo41399e() {
            return C7753c.m15088j();
        }

        /* renamed from: f */
        public final AtomicBoolean mo41400f() {
            return C7753c.m15089k();
        }
    }

    /* renamed from: g2.c$c */
    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public final class C7756c implements InvocationHandler {

        /* renamed from: a */
        private Runnable f10758a;

        /* renamed from: b */
        final /* synthetic */ C7753c f10759b;

        public C7756c(C7753c cVar, Runnable runnable) {
            C12775o.m28639i(runnable, "runnable");
            this.f10759b = cVar;
            this.f10758a = runnable;
        }

        /* renamed from: a */
        private final void m15104a(List<?> list) {
            for (Object c : list) {
                try {
                    Object c2 = C7765h.m15142c(C7753c.m15086h(this.f10759b), C7753c.m15080b(this.f10759b), c, new Object[0]);
                    if (!(c2 instanceof String)) {
                        c2 = null;
                    }
                    String str = (String) c2;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("packageName", C7753c.m15079a(this.f10759b).getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            C7753c.m15082d(this.f10759b).add(string);
                            Map<String, JSONObject> d = C7753c.f10739x.mo41398d();
                            C12775o.m28638h(string, "skuID");
                            d.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f10758a.run();
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C12775o.m28639i(obj, "proxy");
            C12775o.m28639i(method, "method");
            C12775o.m28639i(objArr, "args");
            if (!C12775o.m28634d(method.getName(), "onPurchaseHistoryResponse")) {
                return null;
            }
            List list = objArr[1];
            if (!(list instanceof List)) {
                return null;
            }
            m15104a(list);
            return null;
        }
    }

    /* renamed from: g2.c$d */
    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public static final class C7757d implements InvocationHandler {
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C12775o.m28639i(obj, "proxy");
            C12775o.m28639i(method, "m");
            C12775o.m28639i(objArr, "args");
            return null;
        }
    }

    /* renamed from: g2.c$e */
    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    public final class C7758e implements InvocationHandler {

        /* renamed from: a */
        private Runnable f10760a;

        /* renamed from: b */
        final /* synthetic */ C7753c f10761b;

        public C7758e(C7753c cVar, Runnable runnable) {
            C12775o.m28639i(runnable, "runnable");
            this.f10761b = cVar;
            this.f10760a = runnable;
        }

        /* renamed from: a */
        public final void mo41403a(List<?> list) {
            C12775o.m28639i(list, "skuDetailsObjectList");
            for (Object c : list) {
                try {
                    Object c2 = C7765h.m15142c(C7753c.m15087i(this.f10761b), C7753c.m15081c(this.f10761b), c, new Object[0]);
                    if (!(c2 instanceof String)) {
                        c2 = null;
                    }
                    String str = (String) c2;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            Map<String, JSONObject> e = C7753c.f10739x.mo41399e();
                            C12775o.m28638h(string, "skuID");
                            e.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f10760a.run();
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C12775o.m28639i(obj, "proxy");
            C12775o.m28639i(method, "m");
            C12775o.m28639i(objArr, "args");
            if (!C12775o.m28634d(method.getName(), "onSkuDetailsResponse")) {
                return null;
            }
            List list = objArr[1];
            if (!(list instanceof List)) {
                return null;
            }
            mo41403a(list);
            return null;
        }
    }

    /* renamed from: g2.c$f */
    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    static final class C7759f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C7753c f10762b;

        /* renamed from: c */
        final /* synthetic */ Runnable f10763c;

        C7759f(C7753c cVar, Runnable runnable) {
            this.f10762b = cVar;
            this.f10763c = runnable;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C7753c.m15090l(this.f10762b, "inapp", new ArrayList(C7753c.m15082d(this.f10762b)), this.f10763c);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    public /* synthetic */ C7753c(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C7763g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, gVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m15079a(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return cVar.f10741b;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Method m15080b(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return cVar.f10754o;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ Method m15081c(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return cVar.f10753n;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ Set m15082d(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return cVar.f10740a;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ AtomicBoolean m15083e() {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f10734s;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ C7753c m15084f() {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f10735t;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ Map m15085g() {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f10737v;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ Class m15086h(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return cVar.f10747h;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ Class m15087i(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return cVar.f10746g;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    public static final /* synthetic */ Map m15088j() {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f10738w;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ AtomicBoolean m15089k() {
        Class<C7753c> cls = C7753c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f10736u;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    public static final /* synthetic */ void m15090l(C7753c cVar, String str, List list, Runnable runnable) {
        Class<C7753c> cls = C7753c.class;
        if (!C9925a.m20734d(cls)) {
            try {
                cVar.m15094r(str, list, runnable);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: m */
    public static final /* synthetic */ void m15091m(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f10735t = cVar;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m15092n(C7753c cVar) {
        Class<C7753c> cls = C7753c.class;
        if (!C9925a.m20734d(cls)) {
            try {
                cVar.m15095s();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: q */
    private final void m15093q(String str, Runnable runnable) {
        if (!C9925a.m20734d(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f10749j.getClassLoader(), new Class[]{this.f10749j}, new C7756c(this, runnable));
                C12775o.m28638h(newProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
                C7765h.m15142c(this.f10743d, this.f10756q, this.f10742c, str, newProxyInstance);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: r */
    private final void m15094r(String str, List<String> list, Runnable runnable) {
        if (!C9925a.m20734d(this)) {
            try {
                Object newProxyInstance = Proxy.newProxyInstance(this.f10748i.getClassLoader(), new Class[]{this.f10748i}, new C7758e(this, runnable));
                C12775o.m28638h(newProxyInstance, "Proxy.newProxyInstance(\n…istenerWrapper(runnable))");
                Object d = this.f10757r.mo41410d(str, list);
                C7765h.m15142c(this.f10743d, this.f10755p, this.f10742c, d, newProxyInstance);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: s */
    private final void m15095s() {
        Method b;
        if (!C9925a.m20734d(this)) {
            try {
                Class<?> a = C7765h.m15140a("com.android.billingclient.api.BillingClientStateListener");
                if (a != null && (b = C7765h.m15141b(this.f10743d, "startConnection", a)) != null) {
                    Object newProxyInstance = Proxy.newProxyInstance(a.getClassLoader(), new Class[]{a}, new C7754a());
                    C12775o.m28638h(newProxyInstance, "Proxy.newProxyInstance(\n…ntStateListenerWrapper())");
                    C7765h.m15142c(this.f10743d, b, this.f10742c, newProxyInstance);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: o */
    public final void mo41394o(String str, Runnable runnable) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(str, "skuType");
                C12775o.m28639i(runnable, "querySkuRunnable");
                Object c = C7765h.m15142c(this.f10744e, this.f10751l, C7765h.m15142c(this.f10743d, this.f10750k, this.f10742c, "inapp"), new Object[0]);
                if (!(c instanceof List)) {
                    c = null;
                }
                List<Object> list = (List) c;
                if (list != null) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Object c2 : list) {
                            Object c3 = C7765h.m15142c(this.f10745f, this.f10752m, c2, new Object[0]);
                            if (!(c3 instanceof String)) {
                                c3 = null;
                            }
                            String str2 = (String) c3;
                            if (str2 != null) {
                                JSONObject jSONObject = new JSONObject(str2);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    arrayList.add(string);
                                    Map<String, JSONObject> map = f10737v;
                                    C12775o.m28638h(string, "skuID");
                                    map.put(string, jSONObject);
                                }
                            }
                        }
                        m15094r(str, arrayList, runnable);
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: p */
    public final void mo41395p(String str, Runnable runnable) {
        if (!C9925a.m20734d(this)) {
            try {
                C12775o.m28639i(str, "skuType");
                C12775o.m28639i(runnable, "queryPurchaseHistoryRunnable");
                m15093q(str, new C7759f(this, runnable));
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    private C7753c(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C7763g gVar) {
        this.f10741b = context;
        this.f10742c = obj;
        this.f10743d = cls;
        this.f10744e = cls2;
        this.f10745f = cls3;
        this.f10746g = cls4;
        this.f10747h = cls5;
        this.f10748i = cls6;
        this.f10749j = cls7;
        this.f10750k = method;
        this.f10751l = method2;
        this.f10752m = method3;
        this.f10753n = method4;
        this.f10754o = method5;
        this.f10755p = method6;
        this.f10756q = method7;
        this.f10757r = gVar;
        this.f10740a = new CopyOnWriteArraySet();
    }
}
