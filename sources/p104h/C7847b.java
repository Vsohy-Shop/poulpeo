package p104h;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.painter.BitmapPainterKt;
import androidx.compose.p002ui.graphics.painter.Painter;
import androidx.compose.p002ui.layout.ContentScale;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12747a;
import kotlin.jvm.internal.C12765i;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7539e;
import p096g3.C7766a;
import p205r.C9336e;
import p205r.C9339g;
import p205r.C9342h;
import p205r.C9352o;
import p215s.C9410e;
import p215s.C9414i;
import p215s.C9416j;
import p226t.C9587a;
import p248v.C9906a;
import p248v.C9909c;
import p314bg.C10962f;
import p314bg.C10967g;
import p314bg.C10971h;
import p314bg.C10979j0;
import p314bg.C11025u;
import p336ef.C11895c;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14039u2;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,410:1\n76#2:411\n102#2,2:412\n76#2:414\n102#2,2:415\n76#2:417\n102#2,2:418\n76#2:420\n102#2,2:421\n76#2:423\n102#2,2:424\n76#2:426\n102#2,2:427\n1#3:429\n845#4,9:430\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n*L\n164#1:411\n164#1:412,2\n165#1:414\n165#1:415,2\n166#1:417\n166#1:418,2\n188#1:420\n188#1:421,2\n192#1:423\n192#1:424,2\n196#1:426\n196#1:427,2\n265#1:430,9\n*E\n"})
@Stable
/* renamed from: h.b */
/* compiled from: AsyncImagePainter.kt */
public final class C7847b extends Painter implements RememberObserver {

    /* renamed from: q */
    public static final C7849b f10942q = new C7849b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final Function1<C7850c, C7850c> f10943r = C7848a.f10959g;

    /* renamed from: b */
    private C13995l0 f10944b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11025u<Size> f10945c = C10979j0.m23633a(Size.m35479boximpl(Size.Companion.m35500getZeroNHjbRc()));

    /* renamed from: d */
    private final MutableState f10946d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: e */
    private final MutableState f10947e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: f */
    private final MutableState f10948f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* renamed from: g */
    private C7850c f10949g;

    /* renamed from: h */
    private Painter f10950h;

    /* renamed from: i */
    private Function1<? super C7850c, ? extends C7850c> f10951i;

    /* renamed from: j */
    private Function1<? super C7850c, C11921v> f10952j;

    /* renamed from: k */
    private ContentScale f10953k;

    /* renamed from: l */
    private int f10954l;

    /* renamed from: m */
    private boolean f10955m;

    /* renamed from: n */
    private final MutableState f10956n;

    /* renamed from: o */
    private final MutableState f10957o;

    /* renamed from: p */
    private final MutableState f10958p;

    /* renamed from: h.b$b */
    /* compiled from: AsyncImagePainter.kt */
    public static final class C7849b {
        private C7849b() {
        }

        public /* synthetic */ C7849b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Function1<C7850c, C7850c> mo41561a() {
            return C7847b.f10943r;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: h.b$c */
    /* compiled from: AsyncImagePainter.kt */
    public static abstract class C7850c {

        @StabilityInferred(parameters = 0)
        /* renamed from: h.b$c$a */
        /* compiled from: AsyncImagePainter.kt */
        public static final class C7851a extends C7850c {

            /* renamed from: a */
            public static final C7851a f10960a = new C7851a();

            private C7851a() {
                super((DefaultConstructorMarker) null);
            }

            /* renamed from: a */
            public Painter mo41562a() {
                return null;
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: h.b$c$b */
        /* compiled from: AsyncImagePainter.kt */
        public static final class C7852b extends C7850c {

            /* renamed from: a */
            private final Painter f10961a;

            /* renamed from: b */
            private final C9336e f10962b;

            public C7852b(Painter painter, C9336e eVar) {
                super((DefaultConstructorMarker) null);
                this.f10961a = painter;
                this.f10962b = eVar;
            }

            /* renamed from: a */
            public Painter mo41562a() {
                return this.f10961a;
            }

            /* renamed from: b */
            public final C9336e mo41563b() {
                return this.f10962b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7852b)) {
                    return false;
                }
                C7852b bVar = (C7852b) obj;
                if (C12775o.m28634d(this.f10961a, bVar.f10961a) && C12775o.m28634d(this.f10962b, bVar.f10962b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int i;
                Painter painter = this.f10961a;
                if (painter == null) {
                    i = 0;
                } else {
                    i = painter.hashCode();
                }
                return (i * 31) + this.f10962b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + this.f10961a + ", result=" + this.f10962b + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: h.b$c$c */
        /* compiled from: AsyncImagePainter.kt */
        public static final class C7853c extends C7850c {

            /* renamed from: a */
            private final Painter f10963a;

            public C7853c(Painter painter) {
                super((DefaultConstructorMarker) null);
                this.f10963a = painter;
            }

            /* renamed from: a */
            public Painter mo41562a() {
                return this.f10963a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C7853c) && C12775o.m28634d(this.f10963a, ((C7853c) obj).f10963a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                Painter painter = this.f10963a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public String toString() {
                return "Loading(painter=" + this.f10963a + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: h.b$c$d */
        /* compiled from: AsyncImagePainter.kt */
        public static final class C7854d extends C7850c {

            /* renamed from: a */
            private final Painter f10964a;

            /* renamed from: b */
            private final C9352o f10965b;

            public C7854d(Painter painter, C9352o oVar) {
                super((DefaultConstructorMarker) null);
                this.f10964a = painter;
                this.f10965b = oVar;
            }

            /* renamed from: a */
            public Painter mo41562a() {
                return this.f10964a;
            }

            /* renamed from: b */
            public final C9352o mo41570b() {
                return this.f10965b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7854d)) {
                    return false;
                }
                C7854d dVar = (C7854d) obj;
                if (C12775o.m28634d(this.f10964a, dVar.f10964a) && C12775o.m28634d(this.f10965b, dVar.f10965b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (this.f10964a.hashCode() * 31) + this.f10965b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + this.f10964a + ", result=" + this.f10965b + ')';
            }
        }

        private C7850c() {
        }

        public /* synthetic */ C7850c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract Painter mo41562a();
    }

    @C12739f(mo50609c = "coil.compose.AsyncImagePainter$onRemembered$1", mo50610f = "AsyncImagePainter.kt", mo50611l = {243}, mo50612m = "invokeSuspend")
    /* renamed from: h.b$d */
    /* compiled from: AsyncImagePainter.kt */
    static final class C7855d extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f10966h;

        /* renamed from: i */
        final /* synthetic */ C7847b f10967i;

        /* renamed from: h.b$d$a */
        /* compiled from: AsyncImagePainter.kt */
        static final class C7856a extends C12777p implements C13074a<C9339g> {

            /* renamed from: g */
            final /* synthetic */ C7847b f10968g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7856a(C7847b bVar) {
                super(0);
                this.f10968g = bVar;
            }

            /* renamed from: b */
            public final C9339g invoke() {
                return this.f10968g.mo41552l();
            }
        }

        @C12739f(mo50609c = "coil.compose.AsyncImagePainter$onRemembered$1$2", mo50610f = "AsyncImagePainter.kt", mo50611l = {242}, mo50612m = "invokeSuspend")
        /* renamed from: h.b$d$b */
        /* compiled from: AsyncImagePainter.kt */
        static final class C7857b extends C12746l implements C13088o<C9339g, C12074d<? super C7850c>, Object> {

            /* renamed from: h */
            Object f10969h;

            /* renamed from: i */
            int f10970i;

            /* renamed from: j */
            final /* synthetic */ C7847b f10971j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7857b(C7847b bVar, C12074d<? super C7857b> dVar) {
                super(2, dVar);
                this.f10971j = bVar;
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C7857b(this.f10971j, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                C7847b bVar;
                Object c = C12150d.m26492c();
                int i = this.f10970i;
                if (i == 0) {
                    C11910n.m25701b(obj);
                    C7847b bVar2 = this.f10971j;
                    C7539e j = bVar2.mo41551j();
                    C7847b bVar3 = this.f10971j;
                    C9339g e = bVar3.m15339C(bVar3.mo41552l());
                    this.f10969h = bVar2;
                    this.f10970i = 1;
                    Object a = j.mo41283a(e, this);
                    if (a == c) {
                        return c;
                    }
                    bVar = bVar2;
                    obj = a;
                } else if (i == 1) {
                    bVar = (C7847b) this.f10969h;
                    C11910n.m25701b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return bVar.m15338B((C9342h) obj);
            }

            /* renamed from: l */
            public final Object invoke(C9339g gVar, C12074d<? super C7850c> dVar) {
                return ((C7857b) create(gVar, dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        /* renamed from: h.b$d$c */
        /* compiled from: AsyncImagePainter.kt */
        /* synthetic */ class C7858c implements C10967g, C12765i {

            /* renamed from: b */
            final /* synthetic */ C7847b f10972b;

            C7858c(C7847b bVar) {
                this.f10972b = bVar;
            }

            /* renamed from: a */
            public final Object emit(C7850c cVar, C12074d<? super C11921v> dVar) {
                Object l = this.f10972b.m15340D(cVar);
                if (l == C12150d.m26492c()) {
                    return l;
                }
                return C11921v.f18618a;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C10967g) || !(obj instanceof C12765i)) {
                    return false;
                }
                return C12775o.m28634d(getFunctionDelegate(), ((C12765i) obj).getFunctionDelegate());
            }

            public final C11895c<?> getFunctionDelegate() {
                return new C12747a(2, this.f10972b, C7847b.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7855d(C7847b bVar, C12074d<? super C7855d> dVar) {
            super(2, dVar);
            this.f10967i = bVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C7855d(this.f10967i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f10966h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C10962f r = C10971h.m23611r(SnapshotStateKt.snapshotFlow(new C7856a(this.f10967i)), new C7857b(this.f10967i, (C12074d<? super C7857b>) null));
                C7858c cVar = new C7858c(this.f10967i);
                this.f10966h = 1;
                if (r.collect(cVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C7855d) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    @SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,410:1\n60#2:411\n63#2:415\n50#3:412\n55#3:414\n106#4:413\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n*L\n271#1:411\n271#1:415\n271#1:412\n271#1:414\n271#1:413\n*E\n"})
    /* renamed from: h.b$f */
    /* compiled from: AsyncImagePainter.kt */
    static final class C7860f implements C9416j {

        /* renamed from: b */
        final /* synthetic */ C7847b f10974b;

        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        /* renamed from: h.b$f$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C7861a implements C10962f<C9414i> {

            /* renamed from: b */
            final /* synthetic */ C10962f f10975b;

            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter$updateRequest$2$1\n*L\n1#1,222:1\n61#2:223\n62#2:225\n271#3:224\n*E\n"})
            /* renamed from: h.b$f$a$a */
            /* compiled from: Emitters.kt */
            public static final class C7862a<T> implements C10967g {

                /* renamed from: b */
                final /* synthetic */ C10967g f10976b;

                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                @C12739f(mo50609c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", mo50610f = "AsyncImagePainter.kt", mo50611l = {225}, mo50612m = "emit")
                /* renamed from: h.b$f$a$a$a */
                /* compiled from: Emitters.kt */
                public static final class C7863a extends C12737d {

                    /* renamed from: h */
                    /* synthetic */ Object f10977h;

                    /* renamed from: i */
                    int f10978i;

                    /* renamed from: j */
                    final /* synthetic */ C7862a f10979j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C7863a(C7862a aVar, C12074d dVar) {
                        super(dVar);
                        this.f10979j = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f10977h = obj;
                        this.f10978i |= Integer.MIN_VALUE;
                        return this.f10979j.emit((Object) null, this);
                    }
                }

                public C7862a(C10967g gVar) {
                    this.f10976b = gVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, p355hf.C12074d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof p104h.C7847b.C7860f.C7861a.C7862a.C7863a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        h.b$f$a$a$a r0 = (p104h.C7847b.C7860f.C7861a.C7862a.C7863a) r0
                        int r1 = r0.f10978i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f10978i = r1
                        goto L_0x0018
                    L_0x0013:
                        h.b$f$a$a$a r0 = new h.b$f$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f10977h
                        java.lang.Object r1 = p362if.C12150d.m26492c()
                        int r2 = r0.f10978i
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        p336ef.C11910n.m25701b(r8)
                        goto L_0x004b
                    L_0x0029:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0031:
                        p336ef.C11910n.m25701b(r8)
                        bg.g r8 = r6.f10976b
                        androidx.compose.ui.geometry.Size r7 = (androidx.compose.p002ui.geometry.Size) r7
                        long r4 = r7.m35496unboximpl()
                        s.i r7 = p104h.C7864c.m15389e(r4)
                        if (r7 == 0) goto L_0x004b
                        r0.f10978i = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L_0x004b
                        return r1
                    L_0x004b:
                        ef.v r7 = p336ef.C11921v.f18618a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p104h.C7847b.C7860f.C7861a.C7862a.emit(java.lang.Object, hf.d):java.lang.Object");
                }
            }

            public C7861a(C10962f fVar) {
                this.f10975b = fVar;
            }

            public Object collect(C10967g gVar, C12074d dVar) {
                Object collect = this.f10975b.collect(new C7862a(gVar), dVar);
                if (collect == C12150d.m26492c()) {
                    return collect;
                }
                return C11921v.f18618a;
            }
        }

        C7860f(C7847b bVar) {
            this.f10974b = bVar;
        }

        /* renamed from: a */
        public final Object mo41580a(C12074d<? super C9414i> dVar) {
            return C10971h.m23606m(new C7861a(this.f10974b.f10945c), dVar);
        }
    }

    public C7847b(C9339g gVar, C7539e eVar) {
        C7850c.C7851a aVar = C7850c.C7851a.f10960a;
        this.f10949g = aVar;
        this.f10951i = f10943r;
        this.f10953k = ContentScale.Companion.getFit();
        this.f10954l = DrawScope.Companion.m36276getDefaultFilterQualityfv9h1I();
        this.f10956n = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(aVar, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f10957o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(gVar, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.f10958p = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(eVar, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final Painter m15337A(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return BitmapPainterKt.m36363BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0, 0, this.f10954l, 6, (Object) null);
        }
        return new C7766a(drawable.mutate());
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final C7850c m15338B(C9342h hVar) {
        Painter painter;
        if (hVar instanceof C9352o) {
            C9352o oVar = (C9352o) hVar;
            return new C7850c.C7854d(m15337A(oVar.mo43683a()), oVar);
        } else if (hVar instanceof C9336e) {
            Drawable a = hVar.mo43683a();
            if (a != null) {
                painter = m15337A(a);
            } else {
                painter = null;
            }
            return new C7850c.C7852b(painter, (C9336e) hVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final C9339g m15339C(C9339g gVar) {
        C9339g.C9340a l = C9339g.m19270R(gVar, (Context) null, 1, (Object) null).mo43734l(new C7859e(this));
        if (gVar.mo43718q().mo43680m() == null) {
            l.mo43733k(new C7860f(this));
        }
        if (gVar.mo43718q().mo43679l() == null) {
            l.mo43732j(C7879j.m15417f(this.f10953k));
        }
        if (gVar.mo43718q().mo43678k() != C9410e.EXACT) {
            l.mo43731d(C9410e.INEXACT);
        }
        return l.mo43728a();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.compose.ui.graphics.painter.Painter] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m15340D(p104h.C7847b.C7850c r4) {
        /*
            r3 = this;
            h.b$c r0 = r3.f10949g
            kotlin.jvm.functions.Function1<? super h.b$c, ? extends h.b$c> r1 = r3.f10951i
            java.lang.Object r4 = r1.invoke(r4)
            h.b$c r4 = (p104h.C7847b.C7850c) r4
            r3.m15357z(r4)
            h.f r1 = r3.m15351m(r0, r4)
            if (r1 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            androidx.compose.ui.graphics.painter.Painter r1 = r4.mo41562a()
        L_0x0018:
            r3.m15356y(r1)
            yf.l0 r1 = r3.f10944b
            if (r1 == 0) goto L_0x004b
            androidx.compose.ui.graphics.painter.Painter r1 = r0.mo41562a()
            androidx.compose.ui.graphics.painter.Painter r2 = r4.mo41562a()
            if (r1 == r2) goto L_0x004b
            androidx.compose.ui.graphics.painter.Painter r0 = r0.mo41562a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            r2 = 0
            if (r1 == 0) goto L_0x0035
            androidx.compose.runtime.RememberObserver r0 = (androidx.compose.runtime.RememberObserver) r0
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 == 0) goto L_0x003b
            r0.onForgotten()
        L_0x003b:
            androidx.compose.ui.graphics.painter.Painter r0 = r4.mo41562a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L_0x0046
            r2 = r0
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
        L_0x0046:
            if (r2 == 0) goto L_0x004b
            r2.onRemembered()
        L_0x004b:
            kotlin.jvm.functions.Function1<? super h.b$c, ef.v> r0 = r3.f10952j
            if (r0 == 0) goto L_0x0052
            r0.invoke(r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p104h.C7847b.m15340D(h.b$c):void");
    }

    /* renamed from: g */
    private final void m15347g() {
        C13995l0 l0Var = this.f10944b;
        if (l0Var != null) {
            C13999m0.m32450d(l0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10944b = null;
    }

    /* renamed from: h */
    private final float m15348h() {
        return ((Number) this.f10947e.getValue()).floatValue();
    }

    /* renamed from: i */
    private final ColorFilter m15349i() {
        return (ColorFilter) this.f10948f.getValue();
    }

    /* renamed from: k */
    private final Painter m15350k() {
        return (Painter) this.f10946d.getValue();
    }

    /* renamed from: m */
    private final C7874f m15351m(C7850c cVar, C7850c cVar2) {
        C9342h hVar;
        Painter painter;
        boolean z;
        if (cVar2 instanceof C7850c.C7854d) {
            hVar = ((C7850c.C7854d) cVar2).mo41570b();
        } else {
            if (cVar2 instanceof C7850c.C7852b) {
                hVar = ((C7850c.C7852b) cVar2).mo41563b();
            }
            return null;
        }
        C9909c a = hVar.mo43684b().mo43704P().mo44435a(C7864c.f10980a, hVar);
        if (a instanceof C9906a) {
            Painter a2 = cVar.mo41562a();
            if (cVar instanceof C7850c.C7853c) {
                painter = a2;
            } else {
                painter = null;
            }
            Painter a3 = cVar2.mo41562a();
            ContentScale contentScale = this.f10953k;
            C9906a aVar = (C9906a) a;
            int b = aVar.mo44433b();
            if (!(hVar instanceof C9352o) || !((C9352o) hVar).mo43770d()) {
                z = true;
            } else {
                z = false;
            }
            return new C7874f(painter, a3, contentScale, b, z, aVar.mo44434c());
        }
        return null;
    }

    /* renamed from: n */
    private final void m15352n(float f) {
        this.f10947e.setValue(Float.valueOf(f));
    }

    /* renamed from: o */
    private final void m15353o(ColorFilter colorFilter) {
        this.f10948f.setValue(colorFilter);
    }

    /* renamed from: t */
    private final void m15354t(Painter painter) {
        this.f10946d.setValue(painter);
    }

    /* renamed from: w */
    private final void m15355w(C7850c cVar) {
        this.f10956n.setValue(cVar);
    }

    /* renamed from: y */
    private final void m15356y(Painter painter) {
        this.f10950h = painter;
        m15354t(painter);
    }

    /* renamed from: z */
    private final void m15357z(C7850c cVar) {
        this.f10949g = cVar;
        m15355w(cVar);
    }

    /* access modifiers changed from: protected */
    public boolean applyAlpha(float f) {
        m15352n(f);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean applyColorFilter(ColorFilter colorFilter) {
        m15353o(colorFilter);
        return true;
    }

    /* renamed from: getIntrinsicSize-NH-jbRc  reason: not valid java name */
    public long m38737getIntrinsicSizeNHjbRc() {
        Painter k = m15350k();
        if (k != null) {
            return k.m36369getIntrinsicSizeNHjbRc();
        }
        return Size.Companion.m35499getUnspecifiedNHjbRc();
    }

    /* renamed from: j */
    public final C7539e mo41551j() {
        return (C7539e) this.f10958p.getValue();
    }

    /* renamed from: l */
    public final C9339g mo41552l() {
        return (C9339g) this.f10957o.getValue();
    }

    public void onAbandoned() {
        RememberObserver rememberObserver;
        m15347g();
        Painter painter = this.f10950h;
        if (painter instanceof RememberObserver) {
            rememberObserver = (RememberObserver) painter;
        } else {
            rememberObserver = null;
        }
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(DrawScope drawScope) {
        this.f10945c.setValue(Size.m35479boximpl(drawScope.m36274getSizeNHjbRc()));
        Painter k = m15350k();
        if (k != null) {
            k.m36368drawx_KDEd0(drawScope, drawScope.m36274getSizeNHjbRc(), m15348h(), m15349i());
        }
    }

    public void onForgotten() {
        RememberObserver rememberObserver;
        m15347g();
        Painter painter = this.f10950h;
        if (painter instanceof RememberObserver) {
            rememberObserver = (RememberObserver) painter;
        } else {
            rememberObserver = null;
        }
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    public void onRemembered() {
        RememberObserver rememberObserver;
        if (this.f10944b == null) {
            Painter painter = null;
            C13995l0 a = C13999m0.m32447a(C14039u2.m32561b((C14054y1) null, 1, (Object) null).plus(C13933b1.m32212c().mo49059t0()));
            this.f10944b = a;
            Painter painter2 = this.f10950h;
            if (painter2 instanceof RememberObserver) {
                rememberObserver = (RememberObserver) painter2;
            } else {
                rememberObserver = null;
            }
            if (rememberObserver != null) {
                rememberObserver.onRemembered();
            }
            if (this.f10955m) {
                Drawable F = C9339g.m19270R(mo41552l(), (Context) null, 1, (Object) null).mo43730c(mo41551j().mo41284b()).mo43728a().mo43694F();
                if (F != null) {
                    painter = m15337A(F);
                }
                m15340D(new C7850c.C7853c(painter));
                return;
            }
            C14054y1 unused = C13985j.m32422d(a, (C12079g) null, (C14004n0) null, new C7855d(this, (C12074d<? super C7855d>) null), 3, (Object) null);
        }
    }

    /* renamed from: p */
    public final void mo41553p(ContentScale contentScale) {
        this.f10953k = contentScale;
    }

    /* renamed from: q */
    public final void mo41554q(int i) {
        this.f10954l = i;
    }

    /* renamed from: r */
    public final void mo41555r(C7539e eVar) {
        this.f10958p.setValue(eVar);
    }

    /* renamed from: s */
    public final void mo41556s(Function1<? super C7850c, C11921v> function1) {
        this.f10952j = function1;
    }

    /* renamed from: u */
    public final void mo41557u(boolean z) {
        this.f10955m = z;
    }

    /* renamed from: v */
    public final void mo41558v(C9339g gVar) {
        this.f10957o.setValue(gVar);
    }

    /* renamed from: x */
    public final void mo41559x(Function1<? super C7850c, ? extends C7850c> function1) {
        this.f10951i = function1;
    }

    /* renamed from: h.b$a */
    /* compiled from: AsyncImagePainter.kt */
    static final class C7848a extends C12777p implements Function1<C7850c, C7850c> {

        /* renamed from: g */
        public static final C7848a f10959g = new C7848a();

        C7848a() {
            super(1);
        }

        /* renamed from: a */
        public final C7850c invoke(C7850c cVar) {
            return cVar;
        }
    }

    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$4\n+ 2 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainter\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$2\n+ 4 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$3\n*L\n1#1,1057:1\n266#2,2:1058\n847#3:1060\n848#4:1061\n*E\n"})
    /* renamed from: h.b$e */
    /* compiled from: ImageRequest.kt */
    public static final class C7859e implements C9587a {

        /* renamed from: b */
        final /* synthetic */ C7847b f10973b;

        public C7859e(C7847b bVar) {
            this.f10973b = bVar;
        }

        /* renamed from: d */
        public void mo30073d(Drawable drawable) {
            Painter painter;
            C7847b bVar = this.f10973b;
            if (drawable != null) {
                painter = this.f10973b.m15337A(drawable);
            } else {
                painter = null;
            }
            bVar.m15340D(new C7850c.C7853c(painter));
        }

        /* renamed from: b */
        public void mo30071b(Drawable drawable) {
        }

        /* renamed from: c */
        public void mo30072c(Drawable drawable) {
        }
    }
}
