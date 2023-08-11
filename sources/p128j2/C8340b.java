package p128j2;

import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p128j2.C8343d;
import p251v2.C9925a;
import p336ef.C11915r;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: j2.b */
/* compiled from: Model.kt */
public final class C8340b {

    /* renamed from: m */
    private static final Map<String, String> f11746m = C12716r0.m28418i(C11915r.m25707a("embedding.weight", "embed.weight"), C11915r.m25707a("dense1.weight", "fc1.weight"), C11915r.m25707a("dense2.weight", "fc2.weight"), C11915r.m25707a("dense3.weight", "fc3.weight"), C11915r.m25707a("dense1.bias", "fc1.bias"), C11915r.m25707a("dense2.bias", "fc2.bias"), C11915r.m25707a("dense3.bias", "fc3.bias"));

    /* renamed from: n */
    public static final C8341a f11747n = new C8341a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C8338a f11748a;

    /* renamed from: b */
    private final C8338a f11749b;

    /* renamed from: c */
    private final C8338a f11750c;

    /* renamed from: d */
    private final C8338a f11751d;

    /* renamed from: e */
    private final C8338a f11752e;

    /* renamed from: f */
    private final C8338a f11753f;

    /* renamed from: g */
    private final C8338a f11754g;

    /* renamed from: h */
    private final C8338a f11755h;

    /* renamed from: i */
    private final C8338a f11756i;

    /* renamed from: j */
    private final C8338a f11757j;

    /* renamed from: k */
    private final C8338a f11758k;

    /* renamed from: l */
    private final Map<String, C8338a> f11759l;

    /* renamed from: j2.b$a */
    /* compiled from: Model.kt */
    public static final class C8341a {
        private C8341a() {
        }

        public /* synthetic */ C8341a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final Map<String, C8338a> m16558b(File file) {
            Map<String, C8338a> c = C8354g.m16610c(file);
            if (c == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Map a = C8340b.m16556a();
            for (Map.Entry next : c.entrySet()) {
                String str = (String) next.getKey();
                if (a.containsKey(next.getKey()) && (str = (String) a.get(next.getKey())) == null) {
                    return null;
                }
                hashMap.put(str, next.getValue());
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C8340b mo42294a(File file) {
            C12775o.m28639i(file, "file");
            Map<String, C8338a> b = m16558b(file);
            if (b != null) {
                try {
                    return new C8340b(b, (DefaultConstructorMarker) null);
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    private C8340b(Map<String, C8338a> map) {
        C8338a aVar = map.get("embed.weight");
        if (aVar != null) {
            this.f11748a = aVar;
            C8338a aVar2 = map.get("convs.0.weight");
            if (aVar2 != null) {
                this.f11749b = C8353f.m16608l(aVar2);
                C8338a aVar3 = map.get("convs.1.weight");
                if (aVar3 != null) {
                    this.f11750c = C8353f.m16608l(aVar3);
                    C8338a aVar4 = map.get("convs.2.weight");
                    if (aVar4 != null) {
                        this.f11751d = C8353f.m16608l(aVar4);
                        C8338a aVar5 = map.get("convs.0.bias");
                        if (aVar5 != null) {
                            this.f11752e = aVar5;
                            C8338a aVar6 = map.get("convs.1.bias");
                            if (aVar6 != null) {
                                this.f11753f = aVar6;
                                C8338a aVar7 = map.get("convs.2.bias");
                                if (aVar7 != null) {
                                    this.f11754g = aVar7;
                                    C8338a aVar8 = map.get("fc1.weight");
                                    if (aVar8 != null) {
                                        this.f11755h = C8353f.m16607k(aVar8);
                                        C8338a aVar9 = map.get("fc2.weight");
                                        if (aVar9 != null) {
                                            this.f11756i = C8353f.m16607k(aVar9);
                                            C8338a aVar10 = map.get("fc1.bias");
                                            if (aVar10 != null) {
                                                this.f11757j = aVar10;
                                                C8338a aVar11 = map.get("fc2.bias");
                                                if (aVar11 != null) {
                                                    this.f11758k = aVar11;
                                                    this.f11759l = new HashMap();
                                                    for (String str : C12731y0.m28555i(C8343d.C8344a.MTML_INTEGRITY_DETECT.mo42295a(), C8343d.C8344a.MTML_APP_EVENT_PREDICTION.mo42295a())) {
                                                        String str2 = str + ".weight";
                                                        String str3 = str + ".bias";
                                                        C8338a aVar12 = map.get(str2);
                                                        C8338a aVar13 = map.get(str3);
                                                        if (aVar12 != null) {
                                                            this.f11759l.put(str2, C8353f.m16607k(aVar12));
                                                        }
                                                        if (aVar13 != null) {
                                                            this.f11759l.put(str3, aVar13);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m16556a() {
        Class<C8340b> cls = C8340b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f11746m;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public final C8338a mo42293b(C8338a aVar, String[] strArr, String str) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "dense");
            C12775o.m28639i(strArr, "texts");
            C12775o.m28639i(str, "task");
            C8338a c = C8353f.m16599c(C8353f.m16601e(strArr, 128, this.f11748a), this.f11749b);
            C8353f.m16597a(c, this.f11752e);
            C8353f.m16605i(c);
            C8338a c2 = C8353f.m16599c(c, this.f11750c);
            C8353f.m16597a(c2, this.f11753f);
            C8353f.m16605i(c2);
            C8338a g = C8353f.m16603g(c2, 2);
            C8338a c3 = C8353f.m16599c(g, this.f11751d);
            C8353f.m16597a(c3, this.f11754g);
            C8353f.m16605i(c3);
            C8338a g2 = C8353f.m16603g(c, c.mo42290b(1));
            C8338a g3 = C8353f.m16603g(g, g.mo42290b(1));
            C8338a g4 = C8353f.m16603g(c3, c3.mo42290b(1));
            C8353f.m16602f(g2, 1);
            C8353f.m16602f(g3, 1);
            C8353f.m16602f(g4, 1);
            C8338a d = C8353f.m16600d(C8353f.m16598b(new C8338a[]{g2, g3, g4, aVar}), this.f11755h, this.f11757j);
            C8353f.m16605i(d);
            C8338a d2 = C8353f.m16600d(d, this.f11756i, this.f11758k);
            C8353f.m16605i(d2);
            Map<String, C8338a> map = this.f11759l;
            C8338a aVar2 = map.get(str + ".weight");
            Map<String, C8338a> map2 = this.f11759l;
            C8338a aVar3 = map2.get(str + ".bias");
            if (aVar2 != null) {
                if (aVar3 != null) {
                    C8338a d3 = C8353f.m16600d(d2, aVar2, aVar3);
                    C8353f.m16606j(d3);
                    return d3;
                }
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    public /* synthetic */ C8340b(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
