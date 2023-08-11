package p185p;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p185p.C9016c;

@SourceDebugExtension({"SMAP\nWeakMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Utils.kt\ncoil/util/-Utils\n*L\n1#1,158:1\n44#2,2:159\n47#2:163\n55#2,9:172\n1#3:161\n1#3:162\n361#4,7:164\n162#5:171\n*S KotlinDebug\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n*L\n63#1:159,2\n63#1:163\n137#1:172,9\n63#1:162\n73#1:164,7\n77#1:171\n*E\n"})
/* renamed from: p.g */
/* compiled from: WeakMemoryCache.kt */
public final class C9028g implements C9032i {

    /* renamed from: c */
    public static final C9029a f13149c = new C9029a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final LinkedHashMap<C9016c.C9018b, ArrayList<C9030b>> f13150a = new LinkedHashMap<>();

    /* renamed from: b */
    private int f13151b;

    /* renamed from: p.g$a */
    /* compiled from: WeakMemoryCache.kt */
    public static final class C9029a {
        private C9029a() {
        }

        public /* synthetic */ C9029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @VisibleForTesting
    /* renamed from: p.g$b */
    /* compiled from: WeakMemoryCache.kt */
    public static final class C9030b {

        /* renamed from: a */
        private final int f13152a;

        /* renamed from: b */
        private final WeakReference<Bitmap> f13153b;

        /* renamed from: c */
        private final Map<String, Object> f13154c;

        /* renamed from: d */
        private final int f13155d;

        public C9030b(int i, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i2) {
            this.f13152a = i;
            this.f13153b = weakReference;
            this.f13154c = map;
            this.f13155d = i2;
        }

        /* renamed from: a */
        public final WeakReference<Bitmap> mo43243a() {
            return this.f13153b;
        }

        /* renamed from: b */
        public final Map<String, Object> mo43244b() {
            return this.f13154c;
        }

        /* renamed from: c */
        public final int mo43245c() {
            return this.f13152a;
        }

        /* renamed from: d */
        public final int mo43246d() {
            return this.f13155d;
        }
    }

    /* renamed from: e */
    private final void m18334e() {
        int i = this.f13151b;
        this.f13151b = i + 1;
        if (i >= 10) {
            mo43242d();
        }
    }

    /* renamed from: a */
    public synchronized void mo43206a(int i) {
        if (i >= 10 && i != 20) {
            mo43242d();
        }
    }

    /* renamed from: b */
    public synchronized C9016c.C9021c mo43207b(C9016c.C9018b bVar) {
        C9016c.C9021c cVar;
        ArrayList arrayList = this.f13150a.get(bVar);
        C9016c.C9021c cVar2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C9030b bVar2 = (C9030b) arrayList.get(i);
            Bitmap bitmap = bVar2.mo43243a().get();
            if (bitmap != null) {
                cVar = new C9016c.C9021c(bitmap, bVar2.mo43244b());
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar2 = cVar;
                break;
            }
            i++;
        }
        m18334e();
        return cVar2;
    }

    /* renamed from: c */
    public synchronized void mo43208c(C9016c.C9018b bVar, Bitmap bitmap, Map<String, ? extends Object> map, int i) {
        LinkedHashMap<C9016c.C9018b, ArrayList<C9030b>> linkedHashMap = this.f13150a;
        ArrayList<C9030b> arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        int identityHashCode = System.identityHashCode(bitmap);
        C9030b bVar2 = new C9030b(identityHashCode, new WeakReference(bitmap), map, i);
        int size = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                arrayList2.add(bVar2);
                break;
            }
            C9030b bVar3 = (C9030b) arrayList2.get(i2);
            if (i < bVar3.mo43246d()) {
                i2++;
            } else if (bVar3.mo43245c() == identityHashCode && bVar3.mo43243a().get() == bitmap) {
                arrayList2.set(i2, bVar2);
            } else {
                arrayList2.add(i2, bVar2);
            }
        }
        m18334e();
    }

    @VisibleForTesting
    /* renamed from: d */
    public final void mo43242d() {
        boolean z;
        Bitmap bitmap;
        WeakReference<Bitmap> a;
        this.f13151b = 0;
        Iterator<ArrayList<C9030b>> it = this.f13150a.values().iterator();
        while (it.hasNext()) {
            ArrayList next = it.next();
            if (next.size() <= 1) {
                C9030b bVar = (C9030b) C12686e0.m28223b0(next);
                if (bVar == null || (a = bVar.mo43243a()) == null) {
                    bitmap = null;
                } else {
                    bitmap = a.get();
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((C9030b) next.get(i3)).mo43243a().get() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
