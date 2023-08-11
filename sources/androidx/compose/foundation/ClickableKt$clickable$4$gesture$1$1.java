package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,565:1\n157#2:566\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n*L\n155#1:566\n*E\n"})
@C12739f(mo50609c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", mo50610f = "Clickable.kt", mo50611l = {156}, mo50612m = "invokeSuspend")
/* compiled from: Clickable.kt */
final class ClickableKt$clickable$4$gesture$1$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MutableState<Offset> $centreOffset;
    final /* synthetic */ State<C13074a<Boolean>> $delayPressInteraction;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ State<C13074a<C11921v>> $onClickState;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1", mo50610f = "Clickable.kt", mo50611l = {159}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1$1 */
    /* compiled from: Clickable.kt */
    static final class C03541 extends C12746l implements C13089p<PressGestureScope, Offset, C12074d<? super C11921v>, Object> {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m32989invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m35432unboximpl(), (C12074d) obj3);
        }

        /* renamed from: invoke-d-4ec7I  reason: not valid java name */
        public final Object m32989invoked4ec7I(PressGestureScope pressGestureScope, long j, C12074d<? super C11921v> dVar) {
            C03541 r0 = new C03541(z, mutableInteractionSource, mutableState2, state, dVar);
            r0.L$0 = pressGestureScope;
            r0.J$0 = j;
            return r0.invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j = this.J$0;
                if (z) {
                    MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
                    MutableState<PressInteraction.Press> mutableState = mutableState2;
                    State<C13074a<Boolean>> state = state;
                    this.label = 1;
                    if (ClickableKt.m32988handlePressInteractionEPk0efs(pressGestureScope, j, mutableInteractionSource, mutableState, state, this) == c) {
                        return c;
                    }
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$clickable$4$gesture$1$1(MutableState<Offset> mutableState, boolean z, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState2, State<? extends C13074a<Boolean>> state, State<? extends C13074a<C11921v>> state2, C12074d<? super ClickableKt$clickable$4$gesture$1$1> dVar) {
        super(2, dVar);
        this.$centreOffset = mutableState;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState2;
        this.$delayPressInteraction = state;
        this.$onClickState = state2;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ClickableKt$clickable$4$gesture$1$1 clickableKt$clickable$4$gesture$1$1 = new ClickableKt$clickable$4$gesture$1$1(this.$centreOffset, this.$enabled, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, this.$onClickState, dVar);
        clickableKt$clickable$4$gesture$1$1.L$0 = obj;
        return clickableKt$clickable$4$gesture$1$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((ClickableKt$clickable$4$gesture$1$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            MutableState<Offset> mutableState = this.$centreOffset;
            long r3 = IntSizeKt.m38634getCenterozmzZPI(pointerInputScope.m37205getSizeYbymL2g());
            mutableState.setValue(Offset.m35411boximpl(OffsetKt.Offset((float) IntOffset.m38586getXimpl(r3), (float) IntOffset.m38587getYimpl(r3))));
            final boolean z = this.$enabled;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            final MutableState<PressInteraction.Press> mutableState2 = this.$pressedInteraction;
            final State<C13074a<Boolean>> state = this.$delayPressInteraction;
            C03541 r4 = new C03541((C12074d<? super C03541>) null);
            final boolean z2 = this.$enabled;
            final State<C13074a<C11921v>> state2 = this.$onClickState;
            C03552 r32 = new Function1<Offset, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m32990invokek4lQ0M(((Offset) obj).m35432unboximpl());
                    return C11921v.f18618a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m32990invokek4lQ0M(long j) {
                    if (z2) {
                        state2.getValue().invoke();
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapAndPress(pointerInputScope, r4, r32, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
