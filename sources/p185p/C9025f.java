package p185p;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import p185p.C9016c;
import p259w.C10061a;

@SourceDebugExtension({"SMAP\nStrongMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrongMemoryCache.kt\ncoil/memory/RealStrongMemoryCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* renamed from: p.f */
/* compiled from: StrongMemoryCache.kt */
public final class C9025f implements C9031h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9032i f13143a;

    /* renamed from: b */
    private final C9027b f13144b;

    /* renamed from: p.f$a */
    /* compiled from: StrongMemoryCache.kt */
    private static final class C9026a {

        /* renamed from: a */
        private final Bitmap f13145a;

        /* renamed from: b */
        private final Map<String, Object> f13146b;

        /* renamed from: c */
        private final int f13147c;

        public C9026a(Bitmap bitmap, Map<String, ? extends Object> map, int i) {
            this.f13145a = bitmap;
            this.f13146b = map;
            this.f13147c = i;
        }

        /* renamed from: a */
        public final Bitmap mo43237a() {
            return this.f13145a;
        }

        /* renamed from: b */
        public final Map<String, Object> mo43238b() {
            return this.f13146b;
        }

        /* renamed from: c */
        public final int mo43239c() {
            return this.f13147c;
        }
    }

    /* renamed from: p.f$b */
    /* compiled from: StrongMemoryCache.kt */
    public static final class C9027b extends LruCache<C9016c.C9018b, C9026a> {

        /* renamed from: a */
        final /* synthetic */ C9025f f13148a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9027b(int i, C9025f fVar) {
            super(i);
            this.f13148a = fVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void entryRemoved(boolean z, C9016c.C9018b bVar, C9026a aVar, C9026a aVar2) {
            this.f13148a.f13143a.mo43208c(bVar, aVar.mo43237a(), aVar.mo43238b(), aVar.mo43239c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int sizeOf(C9016c.C9018b bVar, C9026a aVar) {
            return aVar.mo43239c();
        }
    }

    public C9025f(int i, C9032i iVar) {
        this.f13143a = iVar;
        this.f13144b = new C9027b(i, this);
    }

    /* renamed from: a */
    public void mo43203a(int i) {
        if (i >= 40) {
            mo43234e();
            return;
        }
        boolean z = false;
        if (10 <= i && i < 20) {
            z = true;
        }
        if (z) {
            this.f13144b.trimToSize(mo43236g() / 2);
        }
    }

    /* renamed from: b */
    public C9016c.C9021c mo43204b(C9016c.C9018b bVar) {
        C9026a aVar = (C9026a) this.f13144b.get(bVar);
        if (aVar != null) {
            return new C9016c.C9021c(aVar.mo43237a(), aVar.mo43238b());
        }
        return null;
    }

    /* renamed from: c */
    public void mo43205c(C9016c.C9018b bVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        int a = C10061a.m21120a(bitmap);
        if (a <= mo43235f()) {
            this.f13144b.put(bVar, new C9026a(bitmap, map, a));
            return;
        }
        this.f13144b.remove(bVar);
        this.f13143a.mo43208c(bVar, bitmap, map, a);
    }

    /* renamed from: e */
    public void mo43234e() {
        this.f13144b.evictAll();
    }

    /* renamed from: f */
    public int mo43235f() {
        return this.f13144b.maxSize();
    }

    /* renamed from: g */
    public int mo43236g() {
        return this.f13144b.size();
    }
}
