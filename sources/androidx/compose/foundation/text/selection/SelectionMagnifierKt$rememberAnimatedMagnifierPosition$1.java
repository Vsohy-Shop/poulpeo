package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", mo50610f = "SelectionMagnifier.kt", mo50611l = {88}, mo50612m = "invokeSuspend")
/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, C12074d<? super SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1> dVar) {
        super(2, dVar);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, dVar);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C13995l0 l0Var = (C13995l0) this.L$0;
            final State<Offset> state = this.$targetValue$delegate;
            C10962f snapshotFlow = SnapshotStateKt.snapshotFlow(new C13074a<Offset>() {
                public /* bridge */ /* synthetic */ Object invoke() {
                    return Offset.m35411boximpl(m33790invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0  reason: not valid java name */
                public final long m33790invokeF1C5BW0() {
                    return SelectionMagnifierKt.rememberAnimatedMagnifierPosition$lambda$1(state);
                }
            });
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            C06562 r3 = new C10967g<Offset>() {
                public /* bridge */ /* synthetic */ Object emit(Object obj, C12074d dVar) {
                    return m33791emit3MmeM6k(((Offset) obj).m35432unboximpl(), dVar);
                }

                /* renamed from: emit-3MmeM6k  reason: not valid java name */
                public final Object m33791emit3MmeM6k(long j, C12074d<? super C11921v> dVar) {
                    boolean z;
                    if (OffsetKt.m35441isSpecifiedk4lQ0M(animatable.getValue().m35432unboximpl()) && OffsetKt.m35441isSpecifiedk4lQ0M(j)) {
                        if (Offset.m35423getYimpl(animatable.getValue().m35432unboximpl()) == Offset.m35423getYimpl(j)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C0657x2d93455c(animatable, j, (C12074d<? super C0657x2d93455c>) null), 3, (Object) null);
                            return C11921v.f18618a;
                        }
                    }
                    Object snapTo = animatable.snapTo(Offset.m35411boximpl(j), dVar);
                    if (snapTo == C12150d.m26492c()) {
                        return snapTo;
                    }
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(r3, this) == c) {
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
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
