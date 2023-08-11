package p104h;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.Map;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p215s.C9414i;
import p215s.C9416j;
import p314bg.C10962f;
import p314bg.C10967g;
import p314bg.C10971h;
import p314bg.C10979j0;
import p314bg.C11025u;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImage.kt\ncoil/compose/ConstraintsSizeResolver\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,243:1\n60#2:244\n63#2:248\n50#3:245\n55#3:247\n106#4:246\n*S KotlinDebug\n*F\n+ 1 AsyncImage.kt\ncoil/compose/ConstraintsSizeResolver\n*L\n202#1:244\n202#1:248\n202#1:245\n202#1:247\n202#1:246\n*E\n"})
/* renamed from: h.d */
/* compiled from: AsyncImage.kt */
public final class C7866d implements C9416j, LayoutModifier {

    /* renamed from: b */
    private final C11025u<Constraints> f10981b = C10979j0.m23633a(Constraints.m38400boximpl(C7879j.m15414c()));

    /* renamed from: h.d$a */
    /* compiled from: AsyncImage.kt */
    static final class C7867a extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Placeable f10982g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7867a(Placeable placeable) {
            super(1);
            this.f10982g = placeable;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return C11921v.f18618a;
        }

        public final void invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.f10982g, 0, 0, 0.0f, 4, (Object) null);
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* renamed from: h.d$b */
    /* compiled from: SafeCollector.common.kt */
    public static final class C7868b implements C10962f<C9414i> {

        /* renamed from: b */
        final /* synthetic */ C10962f f10983b;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AsyncImage.kt\ncoil/compose/ConstraintsSizeResolver\n*L\n1#1,222:1\n61#2:223\n62#2:225\n202#3:224\n*E\n"})
        /* renamed from: h.d$b$a */
        /* compiled from: Emitters.kt */
        public static final class C7869a<T> implements C10967g {

            /* renamed from: b */
            final /* synthetic */ C10967g f10984b;

            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            @C12739f(mo50609c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", mo50610f = "AsyncImage.kt", mo50611l = {225}, mo50612m = "emit")
            /* renamed from: h.d$b$a$a */
            /* compiled from: Emitters.kt */
            public static final class C7870a extends C12737d {

                /* renamed from: h */
                /* synthetic */ Object f10985h;

                /* renamed from: i */
                int f10986i;

                /* renamed from: j */
                final /* synthetic */ C7869a f10987j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C7870a(C7869a aVar, C12074d dVar) {
                    super(dVar);
                    this.f10987j = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f10985h = obj;
                    this.f10986i |= Integer.MIN_VALUE;
                    return this.f10987j.emit((Object) null, this);
                }
            }

            public C7869a(C10967g gVar) {
                this.f10984b = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, p355hf.C12074d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof p104h.C7866d.C7868b.C7869a.C7870a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    h.d$b$a$a r0 = (p104h.C7866d.C7868b.C7869a.C7870a) r0
                    int r1 = r0.f10986i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f10986i = r1
                    goto L_0x0018
                L_0x0013:
                    h.d$b$a$a r0 = new h.d$b$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f10985h
                    java.lang.Object r1 = p362if.C12150d.m26492c()
                    int r2 = r0.f10986i
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
                    bg.g r8 = r6.f10984b
                    androidx.compose.ui.unit.Constraints r7 = (androidx.compose.p002ui.unit.Constraints) r7
                    long r4 = r7.m38418unboximpl()
                    s.i r7 = p104h.C7840a.m15333c(r4)
                    if (r7 == 0) goto L_0x004b
                    r0.f10986i = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    ef.v r7 = p336ef.C11921v.f18618a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: p104h.C7866d.C7868b.C7869a.emit(java.lang.Object, hf.d):java.lang.Object");
            }
        }

        public C7868b(C10962f fVar) {
            this.f10983b = fVar;
        }

        public Object collect(C10967g gVar, C12074d dVar) {
            Object collect = this.f10983b.collect(new C7869a(gVar), dVar);
            if (collect == C12150d.m26492c()) {
                return collect;
            }
            return C11921v.f18618a;
        }
    }

    /* renamed from: a */
    public Object mo41580a(C12074d<? super C9414i> dVar) {
        return C10971h.m23606m(new C7868b(this.f10981b), dVar);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m38738measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        this.f10981b.setValue(Constraints.m38400boximpl(j));
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new C7867a(r9), 4, (Object) null);
    }
}
