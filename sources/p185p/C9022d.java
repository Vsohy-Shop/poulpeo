package p185p;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7533c;
import p080f.C7539e;
import p115i.C8042f;
import p115i.C8044h;
import p155m.C8767a;
import p155m.C8777b;
import p185p.C9016c;
import p205r.C9339g;
import p205r.C9345k;
import p205r.C9351n;
import p205r.C9352o;
import p215s.C9405b;
import p215s.C9406c;
import p215s.C9413h;
import p215s.C9414i;
import p237u.C9779a;
import p259w.C10061a;
import p259w.C10068h;
import p259w.C10070i;
import p259w.C10080q;

@SourceDebugExtension({"SMAP\nMemoryCacheService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\ncoil/util/-Collections\n+ 4 Logs.kt\ncoil/util/-Logs\n+ 5 Dimension.kt\ncoil/size/-Dimensions\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,236:1\n1#2:237\n22#3,4:238\n21#4,4:242\n21#4,4:246\n21#4,4:252\n21#4,4:256\n57#5:250\n57#5:251\n45#6:260\n28#7:261\n*S KotlinDebug\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n*L\n62#1:238,4\n93#1:242,4\n116#1:246,4\n166#1:252,4\n176#1:256,4\n137#1:250\n138#1:251\n213#1:260\n213#1:261\n*E\n"})
/* renamed from: p.d */
/* compiled from: MemoryCacheService.kt */
public final class C9022d {

    /* renamed from: c */
    public static final C9023a f13138c = new C9023a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C7539e f13139a;

    /* renamed from: b */
    private final C9351n f13140b;

    /* renamed from: p.d$a */
    /* compiled from: MemoryCacheService.kt */
    public static final class C9023a {
        private C9023a() {
        }

        public /* synthetic */ C9023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C9022d(C7539e eVar, C9351n nVar, C10080q qVar) {
        this.f13139a = eVar;
        this.f13140b = nVar;
    }

    /* renamed from: b */
    private final String m18311b(C9016c.C9021c cVar) {
        Object obj = cVar.mo43225b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: d */
    private final boolean m18312d(C9016c.C9021c cVar) {
        Boolean bool;
        Object obj = cVar.mo43225b().get("coil#is_sampled");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m18313e(C9339g gVar, C9016c.C9018b bVar, C9016c.C9021c cVar, C9414i iVar, C9413h hVar) {
        int i;
        boolean z;
        boolean d = m18312d(cVar);
        if (!C9405b.m19458a(iVar)) {
            String str = bVar.mo43214c().get("coil#transformation_size");
            if (str != null) {
                return C12775o.m28634d(str, iVar.toString());
            }
            int width = cVar.mo43224a().getWidth();
            int height = cVar.mo43224a().getHeight();
            C9406c b = iVar.mo43835b();
            int i2 = Integer.MAX_VALUE;
            if (b instanceof C9406c.C9407a) {
                i = ((C9406c.C9407a) b).f13981a;
            } else {
                i = Integer.MAX_VALUE;
            }
            C9406c a = iVar.mo43834a();
            if (a instanceof C9406c.C9407a) {
                i2 = ((C9406c.C9407a) a).f13981a;
            }
            double c = C8044h.m15819c(width, height, i, i2, hVar);
            boolean a2 = C10068h.m21137a(gVar);
            if (a2) {
                double g = C13537l.m30880g(c, 1.0d);
                if (Math.abs(((double) i) - (((double) width) * g)) <= 1.0d || Math.abs(((double) i2) - (g * ((double) height))) <= 1.0d) {
                    return true;
                }
            } else if ((C10070i.m21159s(i) || Math.abs(i - width) <= 1) && (C10070i.m21159s(i2) || Math.abs(i2 - height) <= 1)) {
                return true;
            }
            if (c == 1.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !a2) {
                return false;
            }
            if (c <= 1.0d || !d) {
                return true;
            }
            return false;
        } else if (d) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final C9016c.C9021c mo43229a(C9339g gVar, C9016c.C9018b bVar, C9414i iVar, C9413h hVar) {
        C9016c.C9021c cVar;
        if (!gVar.mo43691C().mo43647b()) {
            return null;
        }
        C9016c d = this.f13139a.mo41286d();
        if (d != null) {
            cVar = d.mo43210b(bVar);
        } else {
            cVar = null;
        }
        if (cVar == null || !mo43230c(gVar, bVar, cVar, iVar, hVar)) {
            return null;
        }
        return cVar;
    }

    @VisibleForTesting
    /* renamed from: c */
    public final boolean mo43230c(C9339g gVar, C9016c.C9018b bVar, C9016c.C9021c cVar, C9414i iVar, C9413h hVar) {
        if (!this.f13140b.mo43766c(gVar, C10061a.m21122c(cVar.mo43224a()))) {
            return false;
        }
        return m18313e(gVar, bVar, cVar, iVar, hVar);
    }

    /* renamed from: f */
    public final C9016c.C9018b mo43231f(C9339g gVar, Object obj, C9345k kVar, C7533c cVar) {
        C9016c.C9018b B = gVar.mo43690B();
        if (B != null) {
            return B;
        }
        cVar.mo41268e(gVar, obj);
        String f = this.f13139a.getComponents().mo41252f(obj, kVar);
        cVar.mo41276m(gVar, f);
        if (f == null) {
            return null;
        }
        List<C9779a> O = gVar.mo43703O();
        Map<String, String> j = gVar.mo43693E().mo43756j();
        if (O.isEmpty() && j.isEmpty()) {
            return new C9016c.C9018b(f, (Map) null, 2, (DefaultConstructorMarker) null);
        }
        Map u = C12716r0.m28430u(j);
        if (!O.isEmpty()) {
            List<C9779a> O2 = gVar.mo43703O();
            int size = O2.size();
            for (int i = 0; i < size; i++) {
                u.put("coil#transformation_" + i, O2.get(i).getCacheKey());
            }
            u.put("coil#transformation_size", kVar.mo43750n().toString());
        }
        return new C9016c.C9018b(f, u);
    }

    /* renamed from: g */
    public final C9352o mo43232g(C8777b.C8778a aVar, C9339g gVar, C9016c.C9018b bVar, C9016c.C9021c cVar) {
        return new C9352o(new BitmapDrawable(gVar.mo43713l().getResources(), cVar.mo43224a()), gVar, C8042f.MEMORY_CACHE, bVar, m18311b(cVar), m18312d(cVar), C10070i.m21160t(aVar));
    }

    /* renamed from: h */
    public final boolean mo43233h(C9016c.C9018b bVar, C9339g gVar, C8767a.C8769b bVar2) {
        C9016c d;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (!(!gVar.mo43691C().mo43648c() || (d = this.f13139a.mo41286d()) == null || bVar == null)) {
            Drawable e = bVar2.mo42927e();
            if (e instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) e;
            } else {
                bitmapDrawable = null;
            }
            if (!(bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar2.mo42928f()));
                String d2 = bVar2.mo42926d();
                if (d2 != null) {
                    linkedHashMap.put("coil#disk_cache_key", d2);
                }
                d.mo43211c(bVar, new C9016c.C9021c(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
