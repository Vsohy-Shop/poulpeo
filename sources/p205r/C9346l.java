package p205r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p259w.C10063c;
import p336ef.C11906l;
import p336ef.C11915r;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Collections.kt\ncoil/util/-Collections\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,138:1\n442#2:139\n392#2:140\n1238#3,4:141\n72#4,8:145\n125#5:153\n152#5,3:154\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n*L\n44#1:139\n44#1:140\n44#1:141,4\n53#1:145,8\n59#1:153\n59#1:154,3\n*E\n"})
/* renamed from: r.l */
/* compiled from: Parameters.kt */
public final class C9346l implements Iterable<C11906l<? extends String, ? extends C9349c>>, C13212a {

    /* renamed from: c */
    public static final C9348b f13890c = new C9348b((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final C9346l f13891d = new C9346l();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, C9349c> f13892b;

    /* renamed from: r.l$a */
    /* compiled from: Parameters.kt */
    public static final class C9347a {

        /* renamed from: a */
        private final Map<String, C9349c> f13893a;

        public C9347a(C9346l lVar) {
            this.f13893a = C12716r0.m28430u(lVar.f13892b);
        }

        /* renamed from: a */
        public final C9346l mo43759a() {
            return new C9346l(C10063c.m21127b(this.f13893a), (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: r.l$b */
    /* compiled from: Parameters.kt */
    public static final class C9348b {
        private C9348b() {
        }

        public /* synthetic */ C9348b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r.l$c */
    /* compiled from: Parameters.kt */
    public static final class C9349c {

        /* renamed from: a */
        private final Object f13894a;

        /* renamed from: b */
        private final String f13895b;

        /* renamed from: a */
        public final String mo43760a() {
            return this.f13895b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9349c) {
                C9349c cVar = (C9349c) obj;
                if (!C12775o.m28634d(this.f13894a, cVar.f13894a) || !C12775o.m28634d(this.f13895b, cVar.f13895b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            Object obj = this.f13894a;
            int i2 = 0;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str = this.f13895b;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            return "Entry(value=" + this.f13894a + ", memoryCacheKey=" + this.f13895b + ')';
        }
    }

    public /* synthetic */ C9346l(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9346l) || !C12775o.m28634d(this.f13892b, ((C9346l) obj).f13892b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f13892b.hashCode();
    }

    public final boolean isEmpty() {
        return this.f13892b.isEmpty();
    }

    public Iterator<C11906l<String, C9349c>> iterator() {
        Map<String, C9349c> map = this.f13892b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(C11915r.m25707a((String) next.getKey(), (C9349c) next.getValue()));
        }
        return arrayList.iterator();
    }

    /* renamed from: j */
    public final Map<String, String> mo43756j() {
        if (isEmpty()) {
            return C12716r0.m28416g();
        }
        Map<String, C9349c> map = this.f13892b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String a = ((C9349c) next.getValue()).mo43760a();
            if (a != null) {
                linkedHashMap.put(next.getKey(), a);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: k */
    public final C9347a mo43757k() {
        return new C9347a(this);
    }

    public String toString() {
        return "Parameters(entries=" + this.f13892b + ')';
    }

    private C9346l(Map<String, C9349c> map) {
        this.f13892b = map;
    }

    public C9346l() {
        this(C12716r0.m28416g());
    }
}
