package p080f;

import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p115i.C8046i;
import p145l.C8606i;
import p145l.C8618m;
import p155m.C8777b;
import p165n.C8836b;
import p175o.C8942d;
import p205r.C9345k;
import p259w.C10063c;
import p336ef.C11906l;
import p336ef.C11915r;

@SourceDebugExtension({"SMAP\nComponentRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n12#2,2:178\n15#2:181\n12#2,4:182\n1#3:180\n*S KotlinDebug\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n*L\n38#1:178,2\n38#1:181\n52#1:182,4\n*E\n"})
/* renamed from: f.b */
/* compiled from: ComponentRegistry.kt */
public final class C7531b {

    /* renamed from: a */
    private final List<C8777b> f10432a;

    /* renamed from: b */
    private final List<C11906l<C8942d<? extends Object, ? extends Object>, Class<? extends Object>>> f10433b;

    /* renamed from: c */
    private final List<C11906l<C8836b<? extends Object>, Class<? extends Object>>> f10434c;

    /* renamed from: d */
    private final List<C11906l<C8606i.C8607a<? extends Object>, Class<? extends Object>>> f10435d;

    /* renamed from: e */
    private final List<C8046i.C8047a> f10436e;

    /* renamed from: f.b$a */
    /* compiled from: ComponentRegistry.kt */
    public static final class C7532a {

        /* renamed from: a */
        private final List<C8777b> f10437a;

        /* renamed from: b */
        private final List<C11906l<C8942d<? extends Object, ?>, Class<? extends Object>>> f10438b;

        /* renamed from: c */
        private final List<C11906l<C8836b<? extends Object>, Class<? extends Object>>> f10439c;

        /* renamed from: d */
        private final List<C11906l<C8606i.C8607a<? extends Object>, Class<? extends Object>>> f10440d;

        /* renamed from: e */
        private final List<C8046i.C8047a> f10441e;

        public C7532a(C7531b bVar) {
            this.f10437a = C12686e0.m28207D0(bVar.mo41249c());
            this.f10438b = C12686e0.m28207D0(bVar.mo41251e());
            this.f10439c = C12686e0.m28207D0(bVar.mo41250d());
            this.f10440d = C12686e0.m28207D0(bVar.mo41248b());
            this.f10441e = C12686e0.m28207D0(bVar.mo41247a());
        }

        /* renamed from: a */
        public final C7532a mo41257a(C8046i.C8047a aVar) {
            this.f10441e.add(aVar);
            return this;
        }

        /* renamed from: b */
        public final <T> C7532a mo41258b(C8606i.C8607a<T> aVar, Class<T> cls) {
            this.f10440d.add(C11915r.m25707a(aVar, cls));
            return this;
        }

        /* renamed from: c */
        public final <T> C7532a mo41259c(C8836b<T> bVar, Class<T> cls) {
            this.f10439c.add(C11915r.m25707a(bVar, cls));
            return this;
        }

        /* renamed from: d */
        public final <T> C7532a mo41260d(C8942d<T, ?> dVar, Class<T> cls) {
            this.f10438b.add(C11915r.m25707a(dVar, cls));
            return this;
        }

        /* renamed from: e */
        public final C7531b mo41261e() {
            return new C7531b(C10063c.m21126a(this.f10437a), C10063c.m21126a(this.f10438b), C10063c.m21126a(this.f10439c), C10063c.m21126a(this.f10440d), C10063c.m21126a(this.f10441e), (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public final List<C8046i.C8047a> mo41262f() {
            return this.f10441e;
        }

        /* renamed from: g */
        public final List<C11906l<C8606i.C8607a<? extends Object>, Class<? extends Object>>> mo41263g() {
            return this.f10440d;
        }
    }

    public /* synthetic */ C7531b(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* renamed from: a */
    public final List<C8046i.C8047a> mo41247a() {
        return this.f10436e;
    }

    /* renamed from: b */
    public final List<C11906l<C8606i.C8607a<? extends Object>, Class<? extends Object>>> mo41248b() {
        return this.f10435d;
    }

    /* renamed from: c */
    public final List<C8777b> mo41249c() {
        return this.f10432a;
    }

    /* renamed from: d */
    public final List<C11906l<C8836b<? extends Object>, Class<? extends Object>>> mo41250d() {
        return this.f10434c;
    }

    /* renamed from: e */
    public final List<C11906l<C8942d<? extends Object, ? extends Object>, Class<? extends Object>>> mo41251e() {
        return this.f10433b;
    }

    /* renamed from: f */
    public final String mo41252f(Object obj, C9345k kVar) {
        List<C11906l<C8836b<? extends Object>, Class<? extends Object>>> list = this.f10434c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C11906l lVar = list.get(i);
            C8836b bVar = (C8836b) lVar.mo49109a();
            if (((Class) lVar.mo49110b()).isAssignableFrom(obj.getClass())) {
                C12775o.m28637g(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a = bVar.mo42969a(obj, kVar);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public final Object mo41253g(Object obj, C9345k kVar) {
        List<C11906l<C8942d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f10433b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C11906l lVar = list.get(i);
            C8942d dVar = (C8942d) lVar.mo49109a();
            if (((Class) lVar.mo49110b()).isAssignableFrom(obj.getClass())) {
                C12775o.m28637g(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a = dVar.mo43092a(obj, kVar);
                if (a != null) {
                    obj = a;
                }
            }
        }
        return obj;
    }

    /* renamed from: h */
    public final C7532a mo41254h() {
        return new C7532a(this);
    }

    /* renamed from: i */
    public final C11906l<C8046i, Integer> mo41255i(C8618m mVar, C9345k kVar, C7539e eVar, int i) {
        int size = this.f10436e.size();
        while (i < size) {
            C8046i a = this.f10436e.get(i).mo41865a(mVar, kVar, eVar);
            if (a != null) {
                return C11915r.m25707a(a, Integer.valueOf(i));
            }
            i++;
        }
        return null;
    }

    /* renamed from: j */
    public final C11906l<C8606i, Integer> mo41256j(Object obj, C9345k kVar, C7539e eVar, int i) {
        int size = this.f10435d.size();
        while (i < size) {
            C11906l lVar = this.f10435d.get(i);
            C8606i.C8607a aVar = (C8606i.C8607a) lVar.mo49109a();
            if (((Class) lVar.mo49110b()).isAssignableFrom(obj.getClass())) {
                C12775o.m28637g(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                C8606i a = aVar.mo42681a(obj, kVar, eVar);
                if (a != null) {
                    return C11915r.m25707a(a, Integer.valueOf(i));
                }
            }
            i++;
        }
        return null;
    }

    private C7531b(List<? extends C8777b> list, List<? extends C11906l<? extends C8942d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends C11906l<? extends C8836b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends C11906l<? extends C8606i.C8607a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends C8046i.C8047a> list5) {
        this.f10432a = list;
        this.f10433b = list2;
        this.f10434c = list3;
        this.f10435d = list4;
        this.f10436e = list5;
    }

    public C7531b() {
        this(C12726w.m28524k(), C12726w.m28524k(), C12726w.m28524k(), C12726w.m28524k(), C12726w.m28524k());
    }
}
