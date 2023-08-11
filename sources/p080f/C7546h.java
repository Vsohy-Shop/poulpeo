package p080f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import okhttp3.HttpUrl;
import p080f.C7533c;
import p115i.C8035d;
import p125j.C8216a;
import p145l.C8593a;
import p145l.C8595b;
import p145l.C8597c;
import p145l.C8600e;
import p145l.C8602f;
import p145l.C8608j;
import p145l.C8610k;
import p145l.C8615l;
import p155m.C8767a;
import p155m.C8777b;
import p155m.C8779c;
import p165n.C8835a;
import p165n.C8837c;
import p175o.C8939a;
import p175o.C8940b;
import p175o.C8941c;
import p175o.C8943e;
import p175o.C8944f;
import p175o.C8945g;
import p185p.C9016c;
import p205r.C9333b;
import p205r.C9335d;
import p205r.C9336e;
import p205r.C9339g;
import p205r.C9342h;
import p205r.C9344j;
import p205r.C9351n;
import p215s.C9414i;
import p226t.C9588b;
import p259w.C10070i;
import p259w.C10076n;
import p259w.C10080q;
import p259w.C10082s;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12067a;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13977i0;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14027s0;
import p466yf.C14039u2;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nRealImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ComponentRegistry.kt\ncoil/ComponentRegistry$Builder\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Utils.kt\ncoil/util/-Utils\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 8 Logs.kt\ncoil/util/-Logs\n*L\n1#1,296:1\n274#1,15:326\n274#1,15:345\n48#2,4:297\n138#3:301\n138#3:302\n138#3:303\n138#3:304\n138#3:305\n138#3:306\n146#3:307\n146#3:308\n154#3:309\n154#3:310\n154#3:311\n154#3:312\n154#3:313\n154#3:314\n154#3:315\n154#3:316\n1#4:317\n1#4:319\n173#5:318\n45#6:320\n28#7:321\n21#8,4:322\n21#8,4:341\n21#8,4:360\n*S KotlinDebug\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n241#1:326,15\n255#1:345,15\n78#1:297,4\n85#1:301\n86#1:302\n87#1:303\n88#1:304\n89#1:305\n90#1:306\n92#1:307\n93#1:308\n95#1:309\n96#1:310\n97#1:311\n98#1:312\n99#1:313\n100#1:314\n101#1:315\n102#1:316\n170#1:319\n170#1:318\n171#1:320\n171#1:321\n238#1:322,4\n252#1:341,4\n261#1:360,4\n*E\n"})
/* renamed from: f.h */
/* compiled from: RealImageLoader.kt */
public final class C7546h implements C7539e {

    /* renamed from: o */
    public static final C7547a f10459o = new C7547a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f10460a;

    /* renamed from: b */
    private final C9333b f10461b;

    /* renamed from: c */
    private final Lazy<C9016c> f10462c;

    /* renamed from: d */
    private final Lazy<C8216a> f10463d;

    /* renamed from: e */
    private final Lazy<Call.Factory> f10464e;

    /* renamed from: f */
    private final C7533c.C7536c f10465f;

    /* renamed from: g */
    private final C7531b f10466g;

    /* renamed from: h */
    private final C10076n f10467h;

    /* renamed from: i */
    private final C13995l0 f10468i = C13999m0.m32447a(C14039u2.m32561b((C14054y1) null, 1, (Object) null).plus(C13933b1.m32212c().mo49059t0()).plus(new C7553f(C13977i0.f22907a0, this)));

    /* renamed from: j */
    private final C10082s f10469j;

    /* renamed from: k */
    private final C9351n f10470k;

    /* renamed from: l */
    private final C7531b f10471l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final List<C8777b> f10472m;

    /* renamed from: n */
    private final AtomicBoolean f10473n;

    /* renamed from: f.h$a */
    /* compiled from: RealImageLoader.kt */
    public static final class C7547a {
        private C7547a() {
        }

        public /* synthetic */ C7547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C12739f(mo50609c = "coil.RealImageLoader$enqueue$job$1", mo50610f = "RealImageLoader.kt", mo50611l = {117}, mo50612m = "invokeSuspend")
    /* renamed from: f.h$b */
    /* compiled from: RealImageLoader.kt */
    static final class C7548b extends C12746l implements C13088o<C13995l0, C12074d<? super C9342h>, Object> {

        /* renamed from: h */
        int f10474h;

        /* renamed from: i */
        final /* synthetic */ C7546h f10475i;

        /* renamed from: j */
        final /* synthetic */ C9339g f10476j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7548b(C7546h hVar, C9339g gVar, C12074d<? super C7548b> dVar) {
            super(2, dVar);
            this.f10475i = hVar;
            this.f10476j = gVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C7548b(this.f10475i, this.f10476j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f10474h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C7546h hVar = this.f10475i;
                C9339g gVar = this.f10476j;
                this.f10474h = 1;
                obj = hVar.m14843g(gVar, 0, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7546h hVar2 = this.f10475i;
            if (((C9342h) obj) instanceof C9336e) {
                hVar2.mo41293h();
            }
            return obj;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C9342h> dVar) {
            return ((C7548b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    @C12739f(mo50609c = "coil.RealImageLoader$execute$2", mo50610f = "RealImageLoader.kt", mo50611l = {140}, mo50612m = "invokeSuspend")
    /* renamed from: f.h$c */
    /* compiled from: RealImageLoader.kt */
    static final class C7549c extends C12746l implements C13088o<C13995l0, C12074d<? super C9342h>, Object> {

        /* renamed from: h */
        int f10477h;

        /* renamed from: i */
        private /* synthetic */ Object f10478i;

        /* renamed from: j */
        final /* synthetic */ C9339g f10479j;

        /* renamed from: k */
        final /* synthetic */ C7546h f10480k;

        @C12739f(mo50609c = "coil.RealImageLoader$execute$2$job$1", mo50610f = "RealImageLoader.kt", mo50611l = {133}, mo50612m = "invokeSuspend")
        /* renamed from: f.h$c$a */
        /* compiled from: RealImageLoader.kt */
        static final class C7550a extends C12746l implements C13088o<C13995l0, C12074d<? super C9342h>, Object> {

            /* renamed from: h */
            int f10481h;

            /* renamed from: i */
            final /* synthetic */ C7546h f10482i;

            /* renamed from: j */
            final /* synthetic */ C9339g f10483j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7550a(C7546h hVar, C9339g gVar, C12074d<? super C7550a> dVar) {
                super(2, dVar);
                this.f10482i = hVar;
                this.f10483j = gVar;
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C7550a(this.f10482i, this.f10483j, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C12150d.m26492c();
                int i = this.f10481h;
                if (i == 0) {
                    C11910n.m25701b(obj);
                    C7546h hVar = this.f10482i;
                    C9339g gVar = this.f10483j;
                    this.f10481h = 1;
                    obj = hVar.m14843g(gVar, 1, this);
                    if (obj == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C11910n.m25701b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }

            public final Object invoke(C13995l0 l0Var, C12074d<? super C9342h> dVar) {
                return ((C7550a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7549c(C9339g gVar, C7546h hVar, C12074d<? super C7549c> dVar) {
            super(2, dVar);
            this.f10479j = gVar;
            this.f10480k = hVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C7549c cVar = new C7549c(this.f10479j, this.f10480k, dVar);
            cVar.f10478i = obj;
            return cVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f10477h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C14027s0 b = C13985j.m32420b((C13995l0) this.f10478i, C13933b1.m32212c().mo49059t0(), (C14004n0) null, new C7550a(this.f10480k, this.f10479j, (C12074d<? super C7550a>) null), 2, (Object) null);
                if (this.f10479j.mo43701M() instanceof C9588b) {
                    C10070i.m21152l(((C9588b) this.f10479j.mo43701M()).getView()).mo43780b(b);
                }
                this.f10477h = 1;
                obj = b.mo53806Y(this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C9342h> dVar) {
            return ((C7549c) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    @C12739f(mo50609c = "coil.RealImageLoader", mo50610f = "RealImageLoader.kt", mo50611l = {166, 178, 182}, mo50612m = "executeMain")
    /* renamed from: f.h$d */
    /* compiled from: RealImageLoader.kt */
    static final class C7551d extends C12737d {

        /* renamed from: h */
        Object f10484h;

        /* renamed from: i */
        Object f10485i;

        /* renamed from: j */
        Object f10486j;

        /* renamed from: k */
        Object f10487k;

        /* renamed from: l */
        Object f10488l;

        /* renamed from: m */
        /* synthetic */ Object f10489m;

        /* renamed from: n */
        final /* synthetic */ C7546h f10490n;

        /* renamed from: o */
        int f10491o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7551d(C7546h hVar, C12074d<? super C7551d> dVar) {
            super(dVar);
            this.f10490n = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f10489m = obj;
            this.f10491o |= Integer.MIN_VALUE;
            return this.f10490n.m14843g((C9339g) null, 0, this);
        }
    }

    @C12739f(mo50609c = "coil.RealImageLoader$executeMain$result$1", mo50610f = "RealImageLoader.kt", mo50611l = {191}, mo50612m = "invokeSuspend")
    /* renamed from: f.h$e */
    /* compiled from: RealImageLoader.kt */
    static final class C7552e extends C12746l implements C13088o<C13995l0, C12074d<? super C9342h>, Object> {

        /* renamed from: h */
        int f10492h;

        /* renamed from: i */
        final /* synthetic */ C9339g f10493i;

        /* renamed from: j */
        final /* synthetic */ C7546h f10494j;

        /* renamed from: k */
        final /* synthetic */ C9414i f10495k;

        /* renamed from: l */
        final /* synthetic */ C7533c f10496l;

        /* renamed from: m */
        final /* synthetic */ Bitmap f10497m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7552e(C9339g gVar, C7546h hVar, C9414i iVar, C7533c cVar, Bitmap bitmap, C12074d<? super C7552e> dVar) {
            super(2, dVar);
            this.f10493i = gVar;
            this.f10494j = hVar;
            this.f10495k = iVar;
            this.f10496l = cVar;
            this.f10497m = bitmap;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C7552e(this.f10493i, this.f10494j, this.f10495k, this.f10496l, this.f10497m, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object c = C12150d.m26492c();
            int i = this.f10492h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C9339g gVar = this.f10493i;
                List f = this.f10494j.f10472m;
                C9339g gVar2 = this.f10493i;
                C9414i iVar = this.f10495k;
                C7533c cVar = this.f10496l;
                if (this.f10497m != null) {
                    z = true;
                } else {
                    z = false;
                }
                C8779c cVar2 = new C8779c(gVar, f, 0, gVar2, iVar, cVar, z);
                C9339g gVar3 = this.f10493i;
                this.f10492h = 1;
                obj = cVar2.mo42936g(gVar3, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C9342h> dVar) {
            return ((C7552e) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n1#1,110:1\n78#2:111\n*E\n"})
    /* renamed from: f.h$f */
    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class C7553f extends C12067a implements C13977i0 {

        /* renamed from: b */
        final /* synthetic */ C7546h f10498b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7553f(C13977i0.C13978a aVar, C7546h hVar) {
            super(aVar);
            this.f10498b = hVar;
        }

        public void handleException(C12079g gVar, Throwable th) {
            this.f10498b.mo41293h();
        }
    }

    public C7546h(Context context, C9333b bVar, Lazy<? extends C9016c> lazy, Lazy<? extends C8216a> lazy2, Lazy<? extends Call.Factory> lazy3, C7533c.C7536c cVar, C7531b bVar2, C10076n nVar, C10080q qVar) {
        this.f10460a = context;
        this.f10461b = bVar;
        this.f10462c = lazy;
        this.f10463d = lazy2;
        this.f10464e = lazy3;
        this.f10465f = cVar;
        this.f10466g = bVar2;
        this.f10467h = nVar;
        C10082s sVar = new C10082s(this, context, nVar.mo44654d());
        this.f10469j = sVar;
        C9351n nVar2 = new C9351n(this, sVar, (C10080q) null);
        this.f10470k = nVar2;
        Class<Uri> cls = Uri.class;
        Class<File> cls2 = File.class;
        this.f10471l = bVar2.mo41254h().mo41260d(new C8941c(), HttpUrl.class).mo41260d(new C8945g(), String.class).mo41260d(new C8940b(), cls).mo41260d(new C8944f(), cls).mo41260d(new C8943e(), Integer.class).mo41260d(new C8939a(), byte[].class).mo41259c(new C8837c(), cls).mo41259c(new C8835a(nVar.mo44651a()), cls2).mo41258b(new C8610k.C8612b(lazy3, lazy2, nVar.mo44655e()), cls).mo41258b(new C8608j.C8609a(), cls2).mo41258b(new C8593a.C8594a(), cls).mo41258b(new C8600e.C8601a(), cls).mo41258b(new C8615l.C8617b(), cls).mo41258b(new C8602f.C8603a(), Drawable.class).mo41258b(new C8595b.C8596a(), Bitmap.class).mo41258b(new C8597c.C8598a(), ByteBuffer.class).mo41257a(new C8035d.C8038c(nVar.mo44653c(), nVar.mo44652b())).mo41261e();
        this.f10472m = C12686e0.m28237p0(getComponents().mo41249c(), new C8767a(this, nVar2, (C10080q) null));
        this.f10473n = new AtomicBoolean(false);
        sVar.mo44660c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: f.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: r.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: r.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: f.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: f.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: r.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: r.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: f.h} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0108 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0116 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0120 A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c A[Catch:{ all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0148 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0185 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0190 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b6 A[Catch:{ all -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c7 A[SYNTHETIC, Splitter:B:92:0x01c7] */
    @androidx.annotation.MainThread
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m14843g(p205r.C9339g r21, int r22, p355hf.C12074d<? super p205r.C9342h> r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            boolean r3 = r2 instanceof p080f.C7546h.C7551d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            f.h$d r3 = (p080f.C7546h.C7551d) r3
            int r4 = r3.f10491o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f10491o = r4
            goto L_0x001e
        L_0x0019:
            f.h$d r3 = new f.h$d
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f10489m
            java.lang.Object r4 = p362if.C12150d.m26492c()
            int r5 = r3.f10491o
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0097
            if (r5 == r8) goto L_0x0078
            if (r5 == r7) goto L_0x0056
            if (r5 != r6) goto L_0x004e
            java.lang.Object r0 = r3.f10487k
            r4 = r0
            f.c r4 = (p080f.C7533c) r4
            java.lang.Object r0 = r3.f10486j
            r5 = r0
            r.g r5 = (p205r.C9339g) r5
            java.lang.Object r0 = r3.f10485i
            r6 = r0
            r.m r6 = (p205r.C9350m) r6
            java.lang.Object r0 = r3.f10484h
            r3 = r0
            f.h r3 = (p080f.C7546h) r3
            p336ef.C11910n.m25701b(r2)     // Catch:{ all -> 0x004b }
            goto L_0x017f
        L_0x004b:
            r0 = move-exception
            goto L_0x01b2
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r3.f10488l
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            java.lang.Object r5 = r3.f10487k
            f.c r5 = (p080f.C7533c) r5
            java.lang.Object r7 = r3.f10486j
            r.g r7 = (p205r.C9339g) r7
            java.lang.Object r8 = r3.f10485i
            r.m r8 = (p205r.C9350m) r8
            java.lang.Object r10 = r3.f10484h
            f.h r10 = (p080f.C7546h) r10
            p336ef.C11910n.m25701b(r2)     // Catch:{ all -> 0x0071 }
            r17 = r0
            goto L_0x0152
        L_0x0071:
            r0 = move-exception
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
            goto L_0x01b2
        L_0x0078:
            java.lang.Object r0 = r3.f10487k
            r5 = r0
            f.c r5 = (p080f.C7533c) r5
            java.lang.Object r0 = r3.f10486j
            r8 = r0
            r.g r8 = (p205r.C9339g) r8
            java.lang.Object r0 = r3.f10485i
            r10 = r0
            r.m r10 = (p205r.C9350m) r10
            java.lang.Object r0 = r3.f10484h
            r11 = r0
            f.h r11 = (p080f.C7546h) r11
            p336ef.C11910n.m25701b(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x00e7
        L_0x0090:
            r0 = move-exception
            r4 = r5
            r5 = r8
            r6 = r10
        L_0x0094:
            r3 = r11
            goto L_0x01b2
        L_0x0097:
            p336ef.C11910n.m25701b(r2)
            r.n r2 = r1.f10470k
            hf.g r5 = r3.getContext()
            yf.y1 r5 = p466yf.C13934b2.m32226n(r5)
            r.m r2 = r2.mo43768g(r0, r5)
            r2.mo30068a()
            r.g$a r0 = p205r.C9339g.m19270R(r0, r9, r8, r9)
            r.b r5 = r20.mo41284b()
            r.g$a r0 = r0.mo43730c(r5)
            r.g r5 = r0.mo43728a()
            f.c$c r0 = r1.f10465f
            f.c r10 = r0.mo41282b(r5)
            java.lang.Object r0 = r5.mo43714m()     // Catch:{ all -> 0x01ae }
            r.i r11 = p205r.C9343i.f13873a     // Catch:{ all -> 0x01ae }
            if (r0 == r11) goto L_0x01a8
            r2.start()     // Catch:{ all -> 0x01ae }
            if (r22 != 0) goto L_0x00e9
            androidx.lifecycle.Lifecycle r0 = r5.mo43727z()     // Catch:{ all -> 0x01ae }
            r3.f10484h = r1     // Catch:{ all -> 0x01ae }
            r3.f10485i = r2     // Catch:{ all -> 0x01ae }
            r3.f10486j = r5     // Catch:{ all -> 0x01ae }
            r3.f10487k = r10     // Catch:{ all -> 0x01ae }
            r3.f10491o = r8     // Catch:{ all -> 0x01ae }
            java.lang.Object r0 = coil.util.Lifecycles.m4800a(r0, r3)     // Catch:{ all -> 0x01ae }
            if (r0 != r4) goto L_0x00e3
            return r4
        L_0x00e3:
            r11 = r1
            r8 = r5
            r5 = r10
            r10 = r2
        L_0x00e7:
            r2 = r10
            goto L_0x00ec
        L_0x00e9:
            r11 = r1
            r8 = r5
            r5 = r10
        L_0x00ec:
            p.c r0 = r11.mo41286d()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x0105
            p.c$b r10 = r8.mo43695G()     // Catch:{ all -> 0x01a2 }
            if (r10 == 0) goto L_0x00fd
            p.c$c r0 = r0.mo43210b(r10)     // Catch:{ all -> 0x01a2 }
            goto L_0x00fe
        L_0x00fd:
            r0 = r9
        L_0x00fe:
            if (r0 == 0) goto L_0x0105
            android.graphics.Bitmap r0 = r0.mo43224a()     // Catch:{ all -> 0x01a2 }
            goto L_0x0106
        L_0x0105:
            r0 = r9
        L_0x0106:
            if (r0 == 0) goto L_0x0116
            android.content.Context r10 = r8.mo43713l()     // Catch:{ all -> 0x01a2 }
            android.content.res.Resources r10 = r10.getResources()     // Catch:{ all -> 0x01a2 }
            android.graphics.drawable.BitmapDrawable r12 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x01a2 }
            r12.<init>(r10, r0)     // Catch:{ all -> 0x01a2 }
            goto L_0x011a
        L_0x0116:
            android.graphics.drawable.Drawable r12 = r8.mo43694F()     // Catch:{ all -> 0x01a2 }
        L_0x011a:
            t.a r10 = r8.mo43701M()     // Catch:{ all -> 0x01a2 }
            if (r10 == 0) goto L_0x0123
            r10.mo30073d(r12)     // Catch:{ all -> 0x01a2 }
        L_0x0123:
            r5.mo41264a(r8)     // Catch:{ all -> 0x01a2 }
            r.g$b r10 = r8.mo43689A()     // Catch:{ all -> 0x01a2 }
            if (r10 == 0) goto L_0x012f
            r10.mo41264a(r8)     // Catch:{ all -> 0x01a2 }
        L_0x012f:
            r5.mo41280q(r8)     // Catch:{ all -> 0x01a2 }
            s.j r10 = r8.mo43699K()     // Catch:{ all -> 0x01a2 }
            r3.f10484h = r11     // Catch:{ all -> 0x01a2 }
            r3.f10485i = r2     // Catch:{ all -> 0x01a2 }
            r3.f10486j = r8     // Catch:{ all -> 0x01a2 }
            r3.f10487k = r5     // Catch:{ all -> 0x01a2 }
            r3.f10488l = r0     // Catch:{ all -> 0x01a2 }
            r3.f10491o = r7     // Catch:{ all -> 0x01a2 }
            java.lang.Object r7 = r10.mo41580a(r3)     // Catch:{ all -> 0x01a2 }
            if (r7 != r4) goto L_0x0149
            return r4
        L_0x0149:
            r17 = r0
            r10 = r11
            r19 = r8
            r8 = r2
            r2 = r7
            r7 = r19
        L_0x0152:
            r15 = r2
            s.i r15 = (p215s.C9414i) r15     // Catch:{ all -> 0x0071 }
            r5.mo41273j(r7, r15)     // Catch:{ all -> 0x0071 }
            yf.h0 r0 = r7.mo43726y()     // Catch:{ all -> 0x0071 }
            f.h$e r2 = new f.h$e     // Catch:{ all -> 0x0071 }
            r18 = 0
            r12 = r2
            r13 = r7
            r14 = r10
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0071 }
            r3.f10484h = r10     // Catch:{ all -> 0x0071 }
            r3.f10485i = r8     // Catch:{ all -> 0x0071 }
            r3.f10486j = r7     // Catch:{ all -> 0x0071 }
            r3.f10487k = r5     // Catch:{ all -> 0x0071 }
            r3.f10488l = r9     // Catch:{ all -> 0x0071 }
            r3.f10491o = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = p466yf.C13970h.m32378g(r0, r2, r3)     // Catch:{ all -> 0x0071 }
            if (r2 != r4) goto L_0x017b
            return r4
        L_0x017b:
            r4 = r5
            r5 = r7
            r6 = r8
            r3 = r10
        L_0x017f:
            r.h r2 = (p205r.C9342h) r2     // Catch:{ all -> 0x004b }
            boolean r0 = r2 instanceof p205r.C9352o     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0190
            r0 = r2
            r.o r0 = (p205r.C9352o) r0     // Catch:{ all -> 0x004b }
            t.a r7 = r5.mo43701M()     // Catch:{ all -> 0x004b }
            r3.m14846k(r0, r7, r4)     // Catch:{ all -> 0x004b }
            goto L_0x019e
        L_0x0190:
            boolean r0 = r2 instanceof p205r.C9336e     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x019e
            r0 = r2
            r.e r0 = (p205r.C9336e) r0     // Catch:{ all -> 0x004b }
            t.a r7 = r5.mo43701M()     // Catch:{ all -> 0x004b }
            r3.m14845j(r0, r7, r4)     // Catch:{ all -> 0x004b }
        L_0x019e:
            r6.complete()
            return r2
        L_0x01a2:
            r0 = move-exception
            r6 = r2
            r4 = r5
            r5 = r8
            goto L_0x0094
        L_0x01a8:
            coil.request.NullRequestDataException r0 = new coil.request.NullRequestDataException     // Catch:{ all -> 0x01ae }
            r0.<init>()     // Catch:{ all -> 0x01ae }
            throw r0     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            r3 = r1
            r6 = r2
            r4 = r10
        L_0x01b2:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x01cb }
            if (r2 != 0) goto L_0x01c7
            r.n r2 = r3.f10470k     // Catch:{ all -> 0x01cb }
            r.e r0 = r2.mo43765b(r5, r0)     // Catch:{ all -> 0x01cb }
            t.a r2 = r5.mo43701M()     // Catch:{ all -> 0x01cb }
            r3.m14845j(r0, r2, r4)     // Catch:{ all -> 0x01cb }
            r6.complete()
            return r0
        L_0x01c7:
            r3.m14844i(r5, r4)     // Catch:{ all -> 0x01cb }
            throw r0     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r0 = move-exception
            r6.complete()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p080f.C7546h.m14843g(r.g, int, hf.d):java.lang.Object");
    }

    /* renamed from: i */
    private final void m14844i(C9339g gVar, C7533c cVar) {
        cVar.mo41267d(gVar);
        C9339g.C9341b A = gVar.mo43689A();
        if (A != null) {
            A.mo41267d(gVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r5 != null) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14845j(p205r.C9336e r4, p226t.C9587a r5, p080f.C7533c r6) {
        /*
            r3 = this;
            r.g r0 = r4.mo43684b()
            boolean r1 = r5 instanceof p248v.C9912d
            if (r1 != 0) goto L_0x000b
            if (r5 == 0) goto L_0x0037
            goto L_0x001e
        L_0x000b:
            r.g r1 = r4.mo43684b()
            v.c$a r1 = r1.mo43704P()
            r2 = r5
            v.d r2 = (p248v.C9912d) r2
            v.c r1 = r1.mo44435a(r2, r4)
            boolean r2 = r1 instanceof p248v.C9907b
            if (r2 == 0) goto L_0x0026
        L_0x001e:
            android.graphics.drawable.Drawable r1 = r4.mo43683a()
            r5.mo30072c(r1)
            goto L_0x0037
        L_0x0026:
            r.g r5 = r4.mo43684b()
            r6.mo41271h(r5, r1)
            r1.mo44432a()
            r.g r5 = r4.mo43684b()
            r6.mo41277n(r5, r1)
        L_0x0037:
            r6.mo41266c(r0, r4)
            r.g$b r5 = r0.mo43689A()
            if (r5 == 0) goto L_0x0043
            r5.mo41266c(r0, r4)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p080f.C7546h.m14845j(r.e, t.a, f.c):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r5 != null) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14846k(p205r.C9352o r4, p226t.C9587a r5, p080f.C7533c r6) {
        /*
            r3 = this;
            r.g r0 = r4.mo43684b()
            r4.mo43769c()
            boolean r1 = r5 instanceof p248v.C9912d
            if (r1 != 0) goto L_0x000e
            if (r5 == 0) goto L_0x003a
            goto L_0x0021
        L_0x000e:
            r.g r1 = r4.mo43684b()
            v.c$a r1 = r1.mo43704P()
            r2 = r5
            v.d r2 = (p248v.C9912d) r2
            v.c r1 = r1.mo44435a(r2, r4)
            boolean r2 = r1 instanceof p248v.C9907b
            if (r2 == 0) goto L_0x0029
        L_0x0021:
            android.graphics.drawable.Drawable r1 = r4.mo43683a()
            r5.mo30071b(r1)
            goto L_0x003a
        L_0x0029:
            r.g r5 = r4.mo43684b()
            r6.mo41271h(r5, r1)
            r1.mo44432a()
            r.g r5 = r4.mo43684b()
            r6.mo41277n(r5, r1)
        L_0x003a:
            r6.mo41265b(r0, r4)
            r.g$b r5 = r0.mo43689A()
            if (r5 == 0) goto L_0x0046
            r5.mo41265b(r0, r4)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p080f.C7546h.m14846k(r.o, t.a, f.c):void");
    }

    /* renamed from: a */
    public Object mo41283a(C9339g gVar, C12074d<? super C9342h> dVar) {
        return C13999m0.m32451e(new C7549c(gVar, this, (C12074d<? super C7549c>) null), dVar);
    }

    /* renamed from: b */
    public C9333b mo41284b() {
        return this.f10461b;
    }

    /* renamed from: c */
    public C9335d mo41285c(C9339g gVar) {
        C14027s0 b = C13985j.m32420b(this.f10468i, (C12079g) null, (C14004n0) null, new C7548b(this, gVar, (C12074d<? super C7548b>) null), 3, (Object) null);
        if (gVar.mo43701M() instanceof C9588b) {
            return C10070i.m21152l(((C9588b) gVar.mo43701M()).getView()).mo43780b(b);
        }
        return new C9344j(b);
    }

    /* renamed from: d */
    public C9016c mo41286d() {
        return this.f10462c.getValue();
    }

    public C7531b getComponents() {
        return this.f10471l;
    }

    /* renamed from: h */
    public final C10080q mo41293h() {
        return null;
    }

    /* renamed from: l */
    public final void mo41294l(int i) {
        C9016c value;
        Lazy<C9016c> lazy = this.f10462c;
        if (lazy != null && (value = lazy.getValue()) != null) {
            value.mo43209a(i);
        }
    }
}
