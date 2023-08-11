package p155m;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7531b;
import p080f.C7533c;
import p080f.C7539e;
import p115i.C8042f;
import p145l.C8605h;
import p145l.C8618m;
import p155m.C8777b;
import p185p.C9016c;
import p185p.C9022d;
import p205r.C9339g;
import p205r.C9345k;
import p205r.C9351n;
import p205r.C9352o;
import p237u.C9779a;
import p259w.C10061a;
import p259w.C10070i;
import p259w.C10073k;
import p259w.C10080q;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13970h;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Logs.kt\ncoil/util/-Logs\n*L\n1#1,302:1\n1#2:303\n1#2:305\n1#2:307\n184#3:304\n188#3:306\n21#4,4:308\n21#4,4:312\n21#4,4:316\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n*L\n116#1:305\n117#1:307\n116#1:304\n117#1:306\n230#1:308,4\n262#1:312,4\n268#1:316,4\n*E\n"})
/* renamed from: m.a */
/* compiled from: EngineInterceptor.kt */
public final class C8767a implements C8777b {

    /* renamed from: d */
    public static final C8768a f12631d = new C8768a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C7539e f12632a;

    /* renamed from: b */
    private final C9351n f12633b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9022d f12634c;

    /* renamed from: m.a$a */
    /* compiled from: EngineInterceptor.kt */
    public static final class C8768a {
        private C8768a() {
        }

        public /* synthetic */ C8768a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: m.a$b */
    /* compiled from: EngineInterceptor.kt */
    public static final class C8769b {

        /* renamed from: a */
        private final Drawable f12635a;

        /* renamed from: b */
        private final boolean f12636b;

        /* renamed from: c */
        private final C8042f f12637c;

        /* renamed from: d */
        private final String f12638d;

        public C8769b(Drawable drawable, boolean z, C8042f fVar, String str) {
            this.f12635a = drawable;
            this.f12636b = z;
            this.f12637c = fVar;
            this.f12638d = str;
        }

        /* renamed from: b */
        public static /* synthetic */ C8769b m17781b(C8769b bVar, Drawable drawable, boolean z, C8042f fVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = bVar.f12635a;
            }
            if ((i & 2) != 0) {
                z = bVar.f12636b;
            }
            if ((i & 4) != 0) {
                fVar = bVar.f12637c;
            }
            if ((i & 8) != 0) {
                str = bVar.f12638d;
            }
            return bVar.mo42924a(drawable, z, fVar, str);
        }

        /* renamed from: a */
        public final C8769b mo42924a(Drawable drawable, boolean z, C8042f fVar, String str) {
            return new C8769b(drawable, z, fVar, str);
        }

        /* renamed from: c */
        public final C8042f mo42925c() {
            return this.f12637c;
        }

        /* renamed from: d */
        public final String mo42926d() {
            return this.f12638d;
        }

        /* renamed from: e */
        public final Drawable mo42927e() {
            return this.f12635a;
        }

        /* renamed from: f */
        public final boolean mo42928f() {
            return this.f12636b;
        }
    }

    @C12739f(mo50609c = "coil.intercept.EngineInterceptor", mo50610f = "EngineInterceptor.kt", mo50611l = {199}, mo50612m = "decode")
    /* renamed from: m.a$c */
    /* compiled from: EngineInterceptor.kt */
    static final class C8770c extends C12737d {

        /* renamed from: h */
        Object f12639h;

        /* renamed from: i */
        Object f12640i;

        /* renamed from: j */
        Object f12641j;

        /* renamed from: k */
        Object f12642k;

        /* renamed from: l */
        Object f12643l;

        /* renamed from: m */
        Object f12644m;

        /* renamed from: n */
        Object f12645n;

        /* renamed from: o */
        Object f12646o;

        /* renamed from: p */
        int f12647p;

        /* renamed from: q */
        /* synthetic */ Object f12648q;

        /* renamed from: r */
        final /* synthetic */ C8767a f12649r;

        /* renamed from: s */
        int f12650s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8770c(C8767a aVar, C12074d<? super C8770c> dVar) {
            super(dVar);
            this.f12649r = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12648q = obj;
            this.f12650s |= Integer.MIN_VALUE;
            return this.f12649r.m17776h((C8618m) null, (C7531b) null, (C9339g) null, (Object) null, (C9345k) null, (C7533c) null, this);
        }
    }

    @C12739f(mo50609c = "coil.intercept.EngineInterceptor", mo50610f = "EngineInterceptor.kt", mo50611l = {122, 126, 144}, mo50612m = "execute")
    /* renamed from: m.a$d */
    /* compiled from: EngineInterceptor.kt */
    static final class C8771d extends C12737d {

        /* renamed from: h */
        Object f12651h;

        /* renamed from: i */
        Object f12652i;

        /* renamed from: j */
        Object f12653j;

        /* renamed from: k */
        Object f12654k;

        /* renamed from: l */
        Object f12655l;

        /* renamed from: m */
        Object f12656m;

        /* renamed from: n */
        Object f12657n;

        /* renamed from: o */
        Object f12658o;

        /* renamed from: p */
        /* synthetic */ Object f12659p;

        /* renamed from: q */
        final /* synthetic */ C8767a f12660q;

        /* renamed from: r */
        int f12661r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8771d(C8767a aVar, C12074d<? super C8771d> dVar) {
            super(dVar);
            this.f12660q = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12659p = obj;
            this.f12661r |= Integer.MIN_VALUE;
            return this.f12660q.m17777i((C9339g) null, (Object) null, (C9345k) null, (C7533c) null, this);
        }
    }

    @C12739f(mo50609c = "coil.intercept.EngineInterceptor$execute$executeResult$1", mo50610f = "EngineInterceptor.kt", mo50611l = {127}, mo50612m = "invokeSuspend")
    /* renamed from: m.a$e */
    /* compiled from: EngineInterceptor.kt */
    static final class C8772e extends C12746l implements C13088o<C13995l0, C12074d<? super C8769b>, Object> {

        /* renamed from: h */
        int f12662h;

        /* renamed from: i */
        final /* synthetic */ C8767a f12663i;

        /* renamed from: j */
        final /* synthetic */ Ref$ObjectRef<C8605h> f12664j;

        /* renamed from: k */
        final /* synthetic */ Ref$ObjectRef<C7531b> f12665k;

        /* renamed from: l */
        final /* synthetic */ C9339g f12666l;

        /* renamed from: m */
        final /* synthetic */ Object f12667m;

        /* renamed from: n */
        final /* synthetic */ Ref$ObjectRef<C9345k> f12668n;

        /* renamed from: o */
        final /* synthetic */ C7533c f12669o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8772e(C8767a aVar, Ref$ObjectRef<C8605h> ref$ObjectRef, Ref$ObjectRef<C7531b> ref$ObjectRef2, C9339g gVar, Object obj, Ref$ObjectRef<C9345k> ref$ObjectRef3, C7533c cVar, C12074d<? super C8772e> dVar) {
            super(2, dVar);
            this.f12663i = aVar;
            this.f12664j = ref$ObjectRef;
            this.f12665k = ref$ObjectRef2;
            this.f12666l = gVar;
            this.f12667m = obj;
            this.f12668n = ref$ObjectRef3;
            this.f12669o = cVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C8772e(this.f12663i, this.f12664j, this.f12665k, this.f12666l, this.f12667m, this.f12668n, this.f12669o, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f12662h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C8767a aVar = this.f12663i;
                C7533c cVar = this.f12669o;
                this.f12662h = 1;
                obj = aVar.m17776h((C8618m) this.f12664j.f20403b, (C7531b) this.f12665k.f20403b, this.f12666l, this.f12667m, (C9345k) this.f12668n.f20403b, cVar, this);
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

        public final Object invoke(C13995l0 l0Var, C12074d<? super C8769b> dVar) {
            return ((C8772e) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    @C12739f(mo50609c = "coil.intercept.EngineInterceptor", mo50610f = "EngineInterceptor.kt", mo50611l = {165}, mo50612m = "fetch")
    /* renamed from: m.a$f */
    /* compiled from: EngineInterceptor.kt */
    static final class C8773f extends C12737d {

        /* renamed from: h */
        Object f12670h;

        /* renamed from: i */
        Object f12671i;

        /* renamed from: j */
        Object f12672j;

        /* renamed from: k */
        Object f12673k;

        /* renamed from: l */
        Object f12674l;

        /* renamed from: m */
        Object f12675m;

        /* renamed from: n */
        Object f12676n;

        /* renamed from: o */
        int f12677o;

        /* renamed from: p */
        /* synthetic */ Object f12678p;

        /* renamed from: q */
        final /* synthetic */ C8767a f12679q;

        /* renamed from: r */
        int f12680r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8773f(C8767a aVar, C12074d<? super C8773f> dVar) {
            super(dVar);
            this.f12679q = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12678p = obj;
            this.f12680r |= Integer.MIN_VALUE;
            return this.f12679q.m17778j((C7531b) null, (C9339g) null, (Object) null, (C9345k) null, (C7533c) null, this);
        }
    }

    @C12739f(mo50609c = "coil.intercept.EngineInterceptor", mo50610f = "EngineInterceptor.kt", mo50611l = {73}, mo50612m = "intercept")
    /* renamed from: m.a$g */
    /* compiled from: EngineInterceptor.kt */
    static final class C8774g extends C12737d {

        /* renamed from: h */
        Object f12681h;

        /* renamed from: i */
        Object f12682i;

        /* renamed from: j */
        /* synthetic */ Object f12683j;

        /* renamed from: k */
        final /* synthetic */ C8767a f12684k;

        /* renamed from: l */
        int f12685l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8774g(C8767a aVar, C12074d<? super C8774g> dVar) {
            super(dVar);
            this.f12684k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12683j = obj;
            this.f12685l |= Integer.MIN_VALUE;
            return this.f12684k.mo42922a((C8777b.C8778a) null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    @C12739f(mo50609c = "coil.intercept.EngineInterceptor$intercept$2", mo50610f = "EngineInterceptor.kt", mo50611l = {75}, mo50612m = "invokeSuspend")
    /* renamed from: m.a$h */
    /* compiled from: EngineInterceptor.kt */
    static final class C8775h extends C12746l implements C13088o<C13995l0, C12074d<? super C9352o>, Object> {

        /* renamed from: h */
        int f12686h;

        /* renamed from: i */
        final /* synthetic */ C8767a f12687i;

        /* renamed from: j */
        final /* synthetic */ C9339g f12688j;

        /* renamed from: k */
        final /* synthetic */ Object f12689k;

        /* renamed from: l */
        final /* synthetic */ C9345k f12690l;

        /* renamed from: m */
        final /* synthetic */ C7533c f12691m;

        /* renamed from: n */
        final /* synthetic */ C9016c.C9018b f12692n;

        /* renamed from: o */
        final /* synthetic */ C8777b.C8778a f12693o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8775h(C8767a aVar, C9339g gVar, Object obj, C9345k kVar, C7533c cVar, C9016c.C9018b bVar, C8777b.C8778a aVar2, C12074d<? super C8775h> dVar) {
            super(2, dVar);
            this.f12687i = aVar;
            this.f12688j = gVar;
            this.f12689k = obj;
            this.f12690l = kVar;
            this.f12691m = cVar;
            this.f12692n = bVar;
            this.f12693o = aVar2;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C8775h(this.f12687i, this.f12688j, this.f12689k, this.f12690l, this.f12691m, this.f12692n, this.f12693o, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            C9016c.C9018b bVar;
            Object c = C12150d.m26492c();
            int i = this.f12686h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C8767a aVar = this.f12687i;
                C9339g gVar = this.f12688j;
                Object obj2 = this.f12689k;
                C9345k kVar = this.f12690l;
                C7533c cVar = this.f12691m;
                this.f12686h = 1;
                obj = aVar.m17777i(gVar, obj2, kVar, cVar, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8769b bVar2 = (C8769b) obj;
            boolean h = this.f12687i.f12634c.mo43233h(this.f12692n, this.f12688j, bVar2);
            Drawable e = bVar2.mo42927e();
            C9339g gVar2 = this.f12688j;
            C8042f c2 = bVar2.mo42925c();
            C9016c.C9018b bVar3 = this.f12692n;
            if (h) {
                bVar = bVar3;
            } else {
                bVar = null;
            }
            return new C9352o(e, gVar2, c2, bVar, bVar2.mo42926d(), bVar2.mo42928f(), C10070i.m21160t(this.f12693o));
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C9352o> dVar) {
            return ((C8775h) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    @SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$transform$3\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,302:1\n32#2,3:303\n36#2:307\n1#3:306\n45#4:308\n28#5:309\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$transform$3\n*L\n241#1:303,3\n241#1:307\n245#1:308\n245#1:309\n*E\n"})
    @C12739f(mo50609c = "coil.intercept.EngineInterceptor$transform$3", mo50610f = "EngineInterceptor.kt", mo50611l = {242}, mo50612m = "invokeSuspend")
    /* renamed from: m.a$i */
    /* compiled from: EngineInterceptor.kt */
    static final class C8776i extends C12746l implements C13088o<C13995l0, C12074d<? super C8769b>, Object> {

        /* renamed from: h */
        Object f12694h;

        /* renamed from: i */
        Object f12695i;

        /* renamed from: j */
        int f12696j;

        /* renamed from: k */
        int f12697k;

        /* renamed from: l */
        int f12698l;

        /* renamed from: m */
        private /* synthetic */ Object f12699m;

        /* renamed from: n */
        final /* synthetic */ C8767a f12700n;

        /* renamed from: o */
        final /* synthetic */ C8769b f12701o;

        /* renamed from: p */
        final /* synthetic */ C9345k f12702p;

        /* renamed from: q */
        final /* synthetic */ List<C9779a> f12703q;

        /* renamed from: r */
        final /* synthetic */ C7533c f12704r;

        /* renamed from: s */
        final /* synthetic */ C9339g f12705s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8776i(C8767a aVar, C8769b bVar, C9345k kVar, List<? extends C9779a> list, C7533c cVar, C9339g gVar, C12074d<? super C8776i> dVar) {
            super(2, dVar);
            this.f12700n = aVar;
            this.f12701o = bVar;
            this.f12702p = kVar;
            this.f12703q = list;
            this.f12704r = cVar;
            this.f12705s = gVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C8776i iVar = new C8776i(this.f12700n, this.f12701o, this.f12702p, this.f12703q, this.f12704r, this.f12705s, dVar);
            iVar.f12699m = obj;
            return iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0061  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f12698l
                r3 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 != r3) goto L_0x0027
                int r2 = r0.f12697k
                int r4 = r0.f12696j
                java.lang.Object r5 = r0.f12695i
                r.k r5 = (p205r.C9345k) r5
                java.lang.Object r6 = r0.f12694h
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r0.f12699m
                yf.l0 r7 = (p466yf.C13995l0) r7
                p336ef.C11910n.m25701b(r19)
                r9 = r0
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r19
                goto L_0x007e
            L_0x0027:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002f:
                p336ef.C11910n.m25701b(r19)
                java.lang.Object r2 = r0.f12699m
                yf.l0 r2 = (p466yf.C13995l0) r2
                m.a r4 = r0.f12700n
                m.a$b r5 = r0.f12701o
                android.graphics.drawable.Drawable r5 = r5.mo42927e()
                r.k r6 = r0.f12702p
                java.util.List<u.a> r7 = r0.f12703q
                android.graphics.Bitmap r4 = r4.m17775g(r5, r6, r7)
                f.c r5 = r0.f12704r
                r.g r6 = r0.f12705s
                r5.mo41274k(r6, r4)
                java.util.List<u.a> r5 = r0.f12703q
                r.k r6 = r0.f12702p
                int r7 = r5.size()
                r8 = 0
                r9 = r0
                r17 = r8
                r8 = r2
                r2 = r7
                r7 = r5
                r5 = r4
                r4 = r17
            L_0x005f:
                if (r4 >= r2) goto L_0x0085
                java.lang.Object r10 = r7.get(r4)
                u.a r10 = (p237u.C9779a) r10
                s.i r11 = r6.mo43750n()
                r9.f12699m = r8
                r9.f12694h = r7
                r9.f12695i = r6
                r9.f12696j = r4
                r9.f12697k = r2
                r9.f12698l = r3
                java.lang.Object r5 = r10.mo44299a(r5, r11, r9)
                if (r5 != r1) goto L_0x007e
                return r1
            L_0x007e:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                p466yf.C13999m0.m32452f(r8)
                int r4 = r4 + r3
                goto L_0x005f
            L_0x0085:
                f.c r1 = r9.f12704r
                r.g r2 = r9.f12705s
                r1.mo41279p(r2, r5)
                m.a$b r10 = r9.f12701o
                r.g r1 = r9.f12705s
                android.content.Context r1 = r1.mo43713l()
                android.content.res.Resources r1 = r1.getResources()
                android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
                r11.<init>(r1, r5)
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 14
                r16 = 0
                m.a$b r1 = p155m.C8767a.C8769b.m17781b(r10, r11, r12, r13, r14, r15, r16)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p155m.C8767a.C8776i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C8769b> dVar) {
            return ((C8776i) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    public C8767a(C7539e eVar, C9351n nVar, C10080q qVar) {
        this.f12632a = eVar;
        this.f12633b = nVar;
        this.f12634c = new C9022d(eVar, nVar, (C10080q) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final Bitmap m17775g(Drawable drawable, C9345k kVar, List<? extends C9779a> list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (C12710p.m28377E(C10070i.m21155o(), C10061a.m21122c(bitmap))) {
                return bitmap;
            }
        }
        return C10073k.f15222a.mo44647a(drawable, kVar.mo43741f(), kVar.mo43750n(), kVar.mo43749m(), kVar.mo43737c());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m17776h(p145l.C8618m r17, p080f.C7531b r18, p205r.C9339g r19, java.lang.Object r20, p205r.C9345k r21, p080f.C7533c r22, p355hf.C12074d<? super p155m.C8767a.C8769b> r23) {
        /*
            r16 = this;
            r0 = r23
            boolean r1 = r0 instanceof p155m.C8767a.C8770c
            if (r1 == 0) goto L_0x0017
            r1 = r0
            m.a$c r1 = (p155m.C8767a.C8770c) r1
            int r2 = r1.f12650s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f12650s = r2
            r2 = r16
            goto L_0x001e
        L_0x0017:
            m.a$c r1 = new m.a$c
            r2 = r16
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f12648q
            java.lang.Object r3 = p362if.C12150d.m26492c()
            int r4 = r1.f12650s
            r5 = 1
            if (r4 == 0) goto L_0x0060
            if (r4 != r5) goto L_0x0058
            int r4 = r1.f12647p
            java.lang.Object r6 = r1.f12646o
            i.i r6 = (p115i.C8046i) r6
            java.lang.Object r7 = r1.f12645n
            f.c r7 = (p080f.C7533c) r7
            java.lang.Object r8 = r1.f12644m
            r.k r8 = (p205r.C9345k) r8
            java.lang.Object r9 = r1.f12643l
            java.lang.Object r10 = r1.f12642k
            r.g r10 = (p205r.C9339g) r10
            java.lang.Object r11 = r1.f12641j
            f.b r11 = (p080f.C7531b) r11
            java.lang.Object r12 = r1.f12640i
            l.m r12 = (p145l.C8618m) r12
            java.lang.Object r13 = r1.f12639h
            m.a r13 = (p155m.C8767a) r13
            p336ef.C11910n.m25701b(r0)
            r14 = r10
            r10 = r1
            r1 = r11
            r11 = r3
            r3 = r14
            r15 = r9
            r9 = r4
            r4 = r15
            goto L_0x00b4
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            p336ef.C11910n.m25701b(r0)
            r0 = 0
            r4 = r20
            r6 = r21
            r7 = r22
            r8 = r0
            r9 = r1
            r13 = r2
            r10 = r3
            r0 = r17
            r1 = r18
            r3 = r19
        L_0x0074:
            f.e r11 = r13.f12632a
            ef.l r8 = r1.mo41255i(r0, r6, r11, r8)
            if (r8 == 0) goto L_0x00e6
            java.lang.Object r11 = r8.mo49111c()
            i.i r11 = (p115i.C8046i) r11
            java.lang.Object r8 = r8.mo49112d()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r8 = r8 + r5
            r7.mo41272i(r3, r11, r6)
            r9.f12639h = r13
            r9.f12640i = r0
            r9.f12641j = r1
            r9.f12642k = r3
            r9.f12643l = r4
            r9.f12644m = r6
            r9.f12645n = r7
            r9.f12646o = r11
            r9.f12647p = r8
            r9.f12650s = r5
            java.lang.Object r12 = r11.mo41862a(r9)
            if (r12 != r10) goto L_0x00ab
            return r10
        L_0x00ab:
            r14 = r12
            r12 = r0
            r0 = r14
            r15 = r8
            r8 = r6
            r6 = r11
            r11 = r10
            r10 = r9
            r9 = r15
        L_0x00b4:
            i.g r0 = (p115i.C8043g) r0
            r7.mo41275l(r3, r6, r8, r0)
            if (r0 == 0) goto L_0x00e0
            m.a$b r1 = new m.a$b
            android.graphics.drawable.Drawable r3 = r0.mo41869a()
            boolean r0 = r0.mo41870b()
            i.f r4 = r12.mo42698a()
            i.p r5 = r12.mo42699b()
            boolean r6 = r5 instanceof p115i.C8055o
            r7 = 0
            if (r6 == 0) goto L_0x00d5
            i.o r5 = (p115i.C8055o) r5
            goto L_0x00d6
        L_0x00d5:
            r5 = r7
        L_0x00d6:
            if (r5 == 0) goto L_0x00dc
            java.lang.String r7 = r5.mo41887k()
        L_0x00dc:
            r1.<init>(r3, r0, r4, r7)
            return r1
        L_0x00e0:
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r0 = r12
            goto L_0x0074
        L_0x00e6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to create a decoder that supports: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p155m.C8767a.m17776h(l.m, f.b, r.g, java.lang.Object, r.k, f.c, hf.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: l.m} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v4, types: [android.graphics.drawable.BitmapDrawable] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015c A[Catch:{ all -> 0x0212 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x019c A[SYNTHETIC, Splitter:B:53:0x019c] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m17777i(p205r.C9339g r36, java.lang.Object r37, p205r.C9345k r38, p080f.C7533c r39, p355hf.C12074d<? super p155m.C8767a.C8769b> r40) {
        /*
            r35 = this;
            r8 = r35
            r0 = r40
            boolean r1 = r0 instanceof p155m.C8767a.C8771d
            if (r1 == 0) goto L_0x0017
            r1 = r0
            m.a$d r1 = (p155m.C8767a.C8771d) r1
            int r2 = r1.f12661r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f12661r = r2
            goto L_0x001c
        L_0x0017:
            m.a$d r1 = new m.a$d
            r1.<init>(r8, r0)
        L_0x001c:
            r0 = r1
            java.lang.Object r1 = r0.f12659p
            java.lang.Object r9 = p362if.C12150d.m26492c()
            int r2 = r0.f12661r
            r10 = 3
            r11 = 2
            r3 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0087
            if (r2 == r3) goto L_0x005a
            if (r2 == r11) goto L_0x003e
            if (r2 != r10) goto L_0x0036
            p336ef.C11910n.m25701b(r1)
            goto L_0x01f3
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r2 = r0.f12655l
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r3 = r0.f12654k
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r4 = r0.f12653j
            f.c r4 = (p080f.C7533c) r4
            java.lang.Object r5 = r0.f12652i
            r.g r5 = (p205r.C9339g) r5
            java.lang.Object r6 = r0.f12651h
            m.a r6 = (p155m.C8767a) r6
            p336ef.C11910n.m25701b(r1)     // Catch:{ all -> 0x0057 }
            goto L_0x0190
        L_0x0057:
            r0 = move-exception
            goto L_0x0214
        L_0x005a:
            java.lang.Object r2 = r0.f12658o
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r3 = r0.f12657n
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r4 = r0.f12656m
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r0.f12655l
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r6 = r0.f12654k
            f.c r6 = (p080f.C7533c) r6
            java.lang.Object r7 = r0.f12653j
            java.lang.Object r13 = r0.f12652i
            r.g r13 = (p205r.C9339g) r13
            java.lang.Object r14 = r0.f12651h
            m.a r14 = (p155m.C8767a) r14
            p336ef.C11910n.m25701b(r1)     // Catch:{ all -> 0x0083 }
            r15 = r3
            r19 = r4
            r3 = r5
            r21 = r7
            goto L_0x0151
        L_0x0083:
            r0 = move-exception
            r2 = r3
            goto L_0x0214
        L_0x0087:
            p336ef.C11910n.m25701b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            r1 = r38
            r13.f20403b = r1
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            f.e r1 = r8.f12632a
            f.b r1 = r1.getComponents()
            r14.f20403b = r1
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            r.n r1 = r8.f12633b     // Catch:{ all -> 0x0212 }
            T r2 = r13.f20403b     // Catch:{ all -> 0x0212 }
            r.k r2 = (p205r.C9345k) r2     // Catch:{ all -> 0x0212 }
            boolean r1 = r1.mo43764a(r2)     // Catch:{ all -> 0x0212 }
            if (r1 != 0) goto L_0x00df
            T r1 = r13.f20403b     // Catch:{ all -> 0x0212 }
            r16 = r1
            r.k r16 = (p205r.C9345k) r16     // Catch:{ all -> 0x0212 }
            r17 = 0
            android.graphics.Bitmap$Config r18 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0212 }
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 32765(0x7ffd, float:4.5914E-41)
            r33 = 0
            r.k r1 = p205r.C9345k.m19332b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0212 }
            r13.f20403b = r1     // Catch:{ all -> 0x0212 }
        L_0x00df:
            ef.l r1 = r36.mo43724w()     // Catch:{ all -> 0x0212 }
            if (r1 != 0) goto L_0x00eb
            i.i$a r1 = r36.mo43716o()     // Catch:{ all -> 0x0212 }
            if (r1 == 0) goto L_0x0114
        L_0x00eb:
            T r1 = r14.f20403b     // Catch:{ all -> 0x0212 }
            f.b r1 = (p080f.C7531b) r1     // Catch:{ all -> 0x0212 }
            f.b$a r1 = r1.mo41254h()     // Catch:{ all -> 0x0212 }
            ef.l r2 = r36.mo43724w()     // Catch:{ all -> 0x0212 }
            r4 = 0
            if (r2 == 0) goto L_0x0101
            java.util.List r5 = r1.mo41263g()     // Catch:{ all -> 0x0212 }
            r5.add(r4, r2)     // Catch:{ all -> 0x0212 }
        L_0x0101:
            i.i$a r2 = r36.mo43716o()     // Catch:{ all -> 0x0212 }
            if (r2 == 0) goto L_0x010e
            java.util.List r5 = r1.mo41262f()     // Catch:{ all -> 0x0212 }
            r5.add(r4, r2)     // Catch:{ all -> 0x0212 }
        L_0x010e:
            f.b r1 = r1.mo41261e()     // Catch:{ all -> 0x0212 }
            r14.f20403b = r1     // Catch:{ all -> 0x0212 }
        L_0x0114:
            T r1 = r14.f20403b     // Catch:{ all -> 0x0212 }
            r2 = r1
            f.b r2 = (p080f.C7531b) r2     // Catch:{ all -> 0x0212 }
            T r1 = r13.f20403b     // Catch:{ all -> 0x0212 }
            r5 = r1
            r.k r5 = (p205r.C9345k) r5     // Catch:{ all -> 0x0212 }
            r0.f12651h = r8     // Catch:{ all -> 0x0212 }
            r7 = r36
            r0.f12652i = r7     // Catch:{ all -> 0x0212 }
            r6 = r37
            r0.f12653j = r6     // Catch:{ all -> 0x0212 }
            r4 = r39
            r0.f12654k = r4     // Catch:{ all -> 0x0212 }
            r0.f12655l = r13     // Catch:{ all -> 0x0212 }
            r0.f12656m = r14     // Catch:{ all -> 0x0212 }
            r0.f12657n = r15     // Catch:{ all -> 0x0212 }
            r0.f12658o = r15     // Catch:{ all -> 0x0212 }
            r0.f12661r = r3     // Catch:{ all -> 0x0212 }
            r1 = r35
            r3 = r36
            r4 = r37
            r6 = r39
            r7 = r0
            java.lang.Object r1 = r1.m17778j(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0212 }
            if (r1 != r9) goto L_0x0146
            return r9
        L_0x0146:
            r21 = r37
            r6 = r39
            r3 = r13
            r19 = r14
            r2 = r15
            r13 = r36
            r14 = r8
        L_0x0151:
            r2.f20403b = r1     // Catch:{ all -> 0x0212 }
            T r1 = r15.f20403b     // Catch:{ all -> 0x0212 }
            r2 = r1
            l.h r2 = (p145l.C8605h) r2     // Catch:{ all -> 0x0212 }
            boolean r4 = r2 instanceof p145l.C8618m     // Catch:{ all -> 0x0212 }
            if (r4 == 0) goto L_0x019c
            yf.h0 r1 = r13.mo43715n()     // Catch:{ all -> 0x0212 }
            m.a$e r2 = new m.a$e     // Catch:{ all -> 0x0212 }
            r24 = 0
            r16 = r2
            r17 = r14
            r18 = r15
            r20 = r13
            r22 = r3
            r23 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0212 }
            r0.f12651h = r14     // Catch:{ all -> 0x0212 }
            r0.f12652i = r13     // Catch:{ all -> 0x0212 }
            r0.f12653j = r6     // Catch:{ all -> 0x0212 }
            r0.f12654k = r3     // Catch:{ all -> 0x0212 }
            r0.f12655l = r15     // Catch:{ all -> 0x0212 }
            r0.f12656m = r12     // Catch:{ all -> 0x0212 }
            r0.f12657n = r12     // Catch:{ all -> 0x0212 }
            r0.f12658o = r12     // Catch:{ all -> 0x0212 }
            r0.f12661r = r11     // Catch:{ all -> 0x0212 }
            java.lang.Object r1 = p466yf.C13970h.m32378g(r1, r2, r0)     // Catch:{ all -> 0x0212 }
            if (r1 != r9) goto L_0x018c
            return r9
        L_0x018c:
            r4 = r6
            r5 = r13
            r6 = r14
            r2 = r15
        L_0x0190:
            m.a$b r1 = (p155m.C8767a.C8769b) r1     // Catch:{ all -> 0x0057 }
            r15 = r2
            r2 = r6
            r6 = r4
            r4 = r5
            r34 = r3
            r3 = r1
            r1 = r34
            goto L_0x01bf
        L_0x019c:
            boolean r2 = r2 instanceof p145l.C8604g     // Catch:{ all -> 0x0212 }
            if (r2 == 0) goto L_0x020c
            m.a$b r2 = new m.a$b     // Catch:{ all -> 0x0212 }
            l.g r1 = (p145l.C8604g) r1     // Catch:{ all -> 0x0212 }
            android.graphics.drawable.Drawable r1 = r1.mo42690b()     // Catch:{ all -> 0x0212 }
            T r4 = r15.f20403b     // Catch:{ all -> 0x0212 }
            l.g r4 = (p145l.C8604g) r4     // Catch:{ all -> 0x0212 }
            boolean r4 = r4.mo42691c()     // Catch:{ all -> 0x0212 }
            T r5 = r15.f20403b     // Catch:{ all -> 0x0212 }
            l.g r5 = (p145l.C8604g) r5     // Catch:{ all -> 0x0212 }
            i.f r5 = r5.mo42689a()     // Catch:{ all -> 0x0212 }
            r2.<init>(r1, r4, r5, r12)     // Catch:{ all -> 0x0212 }
            r1 = r3
            r4 = r13
            r3 = r2
            r2 = r14
        L_0x01bf:
            T r5 = r15.f20403b
            boolean r7 = r5 instanceof p145l.C8618m
            if (r7 == 0) goto L_0x01c8
            l.m r5 = (p145l.C8618m) r5
            goto L_0x01c9
        L_0x01c8:
            r5 = r12
        L_0x01c9:
            if (r5 == 0) goto L_0x01d4
            i.p r5 = r5.mo42699b()
            if (r5 == 0) goto L_0x01d4
            p259w.C10070i.m21144d(r5)
        L_0x01d4:
            T r1 = r1.f20403b
            r5 = r1
            r.k r5 = (p205r.C9345k) r5
            r0.f12651h = r12
            r0.f12652i = r12
            r0.f12653j = r12
            r0.f12654k = r12
            r0.f12655l = r12
            r0.f12656m = r12
            r0.f12657n = r12
            r0.f12658o = r12
            r0.f12661r = r10
            r7 = r0
            java.lang.Object r1 = r2.mo42923k(r3, r4, r5, r6, r7)
            if (r1 != r9) goto L_0x01f3
            return r9
        L_0x01f3:
            m.a$b r1 = (p155m.C8767a.C8769b) r1
            android.graphics.drawable.Drawable r0 = r1.mo42927e()
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L_0x0200
            r12 = r0
            android.graphics.drawable.BitmapDrawable r12 = (android.graphics.drawable.BitmapDrawable) r12
        L_0x0200:
            if (r12 == 0) goto L_0x020b
            android.graphics.Bitmap r0 = r12.getBitmap()
            if (r0 == 0) goto L_0x020b
            r0.prepareToDraw()
        L_0x020b:
            return r1
        L_0x020c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0212 }
            r0.<init>()     // Catch:{ all -> 0x0212 }
            throw r0     // Catch:{ all -> 0x0212 }
        L_0x0212:
            r0 = move-exception
            r2 = r15
        L_0x0214:
            T r1 = r2.f20403b
            boolean r2 = r1 instanceof p145l.C8618m
            if (r2 == 0) goto L_0x021d
            r12 = r1
            l.m r12 = (p145l.C8618m) r12
        L_0x021d:
            if (r12 == 0) goto L_0x0228
            i.p r1 = r12.mo42699b()
            if (r1 == 0) goto L_0x0228
            p259w.C10070i.m21144d(r1)
        L_0x0228:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p155m.C8767a.m17777i(r.g, java.lang.Object, r.k, f.c, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m17778j(p080f.C7531b r10, p205r.C9339g r11, java.lang.Object r12, p205r.C9345k r13, p080f.C7533c r14, p355hf.C12074d<? super p145l.C8605h> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof p155m.C8767a.C8773f
            if (r0 == 0) goto L_0x0013
            r0 = r15
            m.a$f r0 = (p155m.C8767a.C8773f) r0
            int r1 = r0.f12680r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12680r = r1
            goto L_0x0018
        L_0x0013:
            m.a$f r0 = new m.a$f
            r0.<init>(r9, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f12678p
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f12680r
            r3 = 1
            if (r2 == 0) goto L_0x0058
            if (r2 != r3) goto L_0x0050
            int r10 = r0.f12677o
            java.lang.Object r11 = r0.f12676n
            l.i r11 = (p145l.C8606i) r11
            java.lang.Object r12 = r0.f12675m
            f.c r12 = (p080f.C7533c) r12
            java.lang.Object r13 = r0.f12674l
            r.k r13 = (p205r.C9345k) r13
            java.lang.Object r14 = r0.f12673k
            java.lang.Object r2 = r0.f12672j
            r.g r2 = (p205r.C9339g) r2
            java.lang.Object r4 = r0.f12671i
            f.b r4 = (p080f.C7531b) r4
            java.lang.Object r5 = r0.f12670h
            m.a r5 = (p155m.C8767a) r5
            p336ef.C11910n.m25701b(r15)
            r6 = r0
            r0 = r10
            r10 = r4
            r4 = r1
            r1 = r6
            r7 = r2
            r2 = r11
            r11 = r7
            r8 = r14
            r14 = r12
            r12 = r8
            goto L_0x0097
        L_0x0050:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0058:
            p336ef.C11910n.m25701b(r15)
            r15 = 0
            r5 = r9
        L_0x005d:
            f.e r2 = r5.f12632a
            ef.l r15 = r10.mo41256j(r12, r13, r2, r15)
            if (r15 == 0) goto L_0x00b8
            java.lang.Object r2 = r15.mo49111c()
            l.i r2 = (p145l.C8606i) r2
            java.lang.Object r15 = r15.mo49112d()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            int r15 = r15 + r3
            r14.mo41278o(r11, r2, r13)
            r0.f12670h = r5
            r0.f12671i = r10
            r0.f12672j = r11
            r0.f12673k = r12
            r0.f12674l = r13
            r0.f12675m = r14
            r0.f12676n = r2
            r0.f12677o = r15
            r0.f12680r = r3
            java.lang.Object r4 = r2.mo42680a(r0)
            if (r4 != r1) goto L_0x0092
            return r1
        L_0x0092:
            r6 = r0
            r0 = r15
            r15 = r4
            r4 = r1
            r1 = r6
        L_0x0097:
            l.h r15 = (p145l.C8605h) r15
            r14.mo41269f(r11, r2, r13, r15)     // Catch:{ all -> 0x00a3 }
            if (r15 == 0) goto L_0x009f
            return r15
        L_0x009f:
            r15 = r0
            r0 = r1
            r1 = r4
            goto L_0x005d
        L_0x00a3:
            r10 = move-exception
            boolean r11 = r15 instanceof p145l.C8618m
            if (r11 == 0) goto L_0x00ab
            l.m r15 = (p145l.C8618m) r15
            goto L_0x00ac
        L_0x00ab:
            r15 = 0
        L_0x00ac:
            if (r15 == 0) goto L_0x00b7
            i.p r11 = r15.mo42699b()
            if (r11 == 0) goto L_0x00b7
            p259w.C10070i.m21144d(r11)
        L_0x00b7:
            throw r10
        L_0x00b8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unable to create a fetcher that supports: "
            r10.append(r11)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p155m.C8767a.m17778j(f.b, r.g, java.lang.Object, r.k, f.c, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo42922a(p155m.C8777b.C8778a r14, p355hf.C12074d<? super p205r.C9342h> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p155m.C8767a.C8774g
            if (r0 == 0) goto L_0x0013
            r0 = r15
            m.a$g r0 = (p155m.C8767a.C8774g) r0
            int r1 = r0.f12685l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12685l = r1
            goto L_0x0018
        L_0x0013:
            m.a$g r0 = new m.a$g
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f12683j
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f12685l
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r14 = r0.f12682i
            m.b$a r14 = (p155m.C8777b.C8778a) r14
            java.lang.Object r0 = r0.f12681h
            m.a r0 = (p155m.C8767a) r0
            p336ef.C11910n.m25701b(r15)     // Catch:{ all -> 0x0031 }
            goto L_0x009b
        L_0x0031:
            r15 = move-exception
            goto L_0x009e
        L_0x0033:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x003b:
            p336ef.C11910n.m25701b(r15)
            r.g r6 = r14.mo42932a()     // Catch:{ all -> 0x009c }
            java.lang.Object r15 = r6.mo43714m()     // Catch:{ all -> 0x009c }
            s.i r2 = r14.getSize()     // Catch:{ all -> 0x009c }
            f.c r9 = p259w.C10070i.m21147g(r14)     // Catch:{ all -> 0x009c }
            r.n r4 = r13.f12633b     // Catch:{ all -> 0x009c }
            r.k r8 = r4.mo43767f(r6, r2)     // Catch:{ all -> 0x009c }
            s.h r4 = r8.mo43749m()     // Catch:{ all -> 0x009c }
            r9.mo41270g(r6, r15)     // Catch:{ all -> 0x009c }
            f.e r5 = r13.f12632a     // Catch:{ all -> 0x009c }
            f.b r5 = r5.getComponents()     // Catch:{ all -> 0x009c }
            java.lang.Object r7 = r5.mo41253g(r15, r8)     // Catch:{ all -> 0x009c }
            r9.mo41281r(r6, r7)     // Catch:{ all -> 0x009c }
            p.d r15 = r13.f12634c     // Catch:{ all -> 0x009c }
            p.c$b r10 = r15.mo43231f(r6, r7, r8, r9)     // Catch:{ all -> 0x009c }
            if (r10 == 0) goto L_0x0077
            p.d r15 = r13.f12634c     // Catch:{ all -> 0x009c }
            p.c$c r15 = r15.mo43229a(r6, r10, r2, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0078
        L_0x0077:
            r15 = 0
        L_0x0078:
            if (r15 == 0) goto L_0x0081
            p.d r0 = r13.f12634c     // Catch:{ all -> 0x009c }
            r.o r14 = r0.mo43232g(r14, r6, r10, r15)     // Catch:{ all -> 0x009c }
            return r14
        L_0x0081:
            yf.h0 r15 = r6.mo43723v()     // Catch:{ all -> 0x009c }
            m.a$h r2 = new m.a$h     // Catch:{ all -> 0x009c }
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009c }
            r0.f12681h = r13     // Catch:{ all -> 0x009c }
            r0.f12682i = r14     // Catch:{ all -> 0x009c }
            r0.f12685l = r3     // Catch:{ all -> 0x009c }
            java.lang.Object r15 = p466yf.C13970h.m32378g(r15, r2, r0)     // Catch:{ all -> 0x009c }
            if (r15 != r1) goto L_0x009b
            return r1
        L_0x009b:
            return r15
        L_0x009c:
            r15 = move-exception
            r0 = r13
        L_0x009e:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x00ad
            r.n r0 = r0.f12633b
            r.g r14 = r14.mo42932a()
            r.e r14 = r0.mo43765b(r14, r15)
            return r14
        L_0x00ad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p155m.C8767a.mo42922a(m.b$a, hf.d):java.lang.Object");
    }

    @VisibleForTesting
    /* renamed from: k */
    public final Object mo42923k(C8769b bVar, C9339g gVar, C9345k kVar, C7533c cVar, C12074d<? super C8769b> dVar) {
        List<C9779a> O = gVar.mo43703O();
        if (O.isEmpty()) {
            return bVar;
        }
        if ((bVar.mo42927e() instanceof BitmapDrawable) || gVar.mo43707g()) {
            return C13970h.m32378g(gVar.mo43702N(), new C8776i(this, bVar, kVar, O, cVar, gVar, (C12074d<? super C8776i>) null), dVar);
        }
        return bVar;
    }
}
