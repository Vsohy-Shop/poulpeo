package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: EnterExitTransition.kt */
final class ExpandShrinkModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final State<Alignment> alignment;
    private Alignment currentAlignment;
    private final State<ChangeSize> expand;
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
    private final State<ChangeSize> shrink;
    private final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec = new ExpandShrinkModifier$sizeTransitionSpec$1(this);

    /* compiled from: EnterExitTransition.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ExpandShrinkModifier(Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, State<ChangeSize> state, State<ChangeSize> state2, State<? extends Alignment> state3) {
        C12775o.m28639i(deferredAnimation, "sizeAnimation");
        C12775o.m28639i(deferredAnimation2, "offsetAnimation");
        C12775o.m28639i(state, "expand");
        C12775o.m28639i(state2, "shrink");
        C12775o.m28639i(state3, "alignment");
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.expand = state;
        this.shrink = state2;
        this.alignment = state3;
    }

    public final State<Alignment> getAlignment() {
        return this.alignment;
    }

    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    public final State<ChangeSize> getExpand() {
        return this.expand;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    public final State<ChangeSize> getShrink() {
        return this.shrink;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m32862measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long j2;
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r4 = measurable.m37365measureBRTryo0(j);
        long IntSize = IntSizeKt.IntSize(r4.getWidth(), r4.getHeight());
        long r11 = this.sizeAnimation.animate(this.sizeTransitionSpec, new ExpandShrinkModifier$measure$currentSize$1(this, IntSize)).getValue().m38632unboximpl();
        long r13 = this.offsetAnimation.animate(ExpandShrinkModifier$measure$offsetDelta$1.INSTANCE, new ExpandShrinkModifier$measure$offsetDelta$2(this, IntSize)).getValue().m38595unboximpl();
        Alignment alignment2 = this.currentAlignment;
        if (alignment2 != null) {
            j2 = alignment2.m35310alignKFBX0sM(IntSize, r11, LayoutDirection.Ltr);
        } else {
            j2 = IntOffset.Companion.m38596getZeronOccac();
        }
        return MeasureScope.layout$default(measureScope, IntSize.m38628getWidthimpl(r11), IntSize.m38627getHeightimpl(r11), (Map) null, new ExpandShrinkModifier$measure$1(r4, j2, r13), 4, (Object) null);
    }

    public final void setCurrentAlignment(Alignment alignment2) {
        this.currentAlignment = alignment2;
    }

    /* renamed from: sizeByState-Uzc_VyU  reason: not valid java name */
    public final long m32863sizeByStateUzc_VyU(EnterExitState enterExitState, long j) {
        long j2;
        long j3;
        C12775o.m28639i(enterExitState, "targetState");
        ChangeSize value = this.expand.getValue();
        if (value != null) {
            j2 = value.getSize().invoke(IntSize.m38620boximpl(j)).m38632unboximpl();
        } else {
            j2 = j;
        }
        ChangeSize value2 = this.shrink.getValue();
        if (value2 != null) {
            j3 = value2.getSize().invoke(IntSize.m38620boximpl(j)).m38632unboximpl();
        } else {
            j3 = j;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j2;
        }
        if (i == 3) {
            return j3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: targetOffsetByState-oFUgxo0  reason: not valid java name */
    public final long m32864targetOffsetByStateoFUgxo0(EnterExitState enterExitState, long j) {
        C12775o.m28639i(enterExitState, "targetState");
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m38596getZeronOccac();
        }
        if (this.alignment.getValue() == null) {
            return IntOffset.Companion.m38596getZeronOccac();
        }
        if (C12775o.m28634d(this.currentAlignment, this.alignment.getValue())) {
            return IntOffset.Companion.m38596getZeronOccac();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return IntOffset.Companion.m38596getZeronOccac();
        }
        if (i == 2) {
            return IntOffset.Companion.m38596getZeronOccac();
        }
        if (i == 3) {
            ChangeSize value = this.shrink.getValue();
            if (value == null) {
                return IntOffset.Companion.m38596getZeronOccac();
            }
            long r6 = value.getSize().invoke(IntSize.m38620boximpl(j)).m38632unboximpl();
            Alignment value2 = this.alignment.getValue();
            C12775o.m28636f(value2);
            long j2 = j;
            long j3 = r6;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long r8 = value2.m35310alignKFBX0sM(j2, j3, layoutDirection);
            Alignment alignment2 = this.currentAlignment;
            C12775o.m28636f(alignment2);
            long r11 = alignment2.m35310alignKFBX0sM(j2, j3, layoutDirection);
            return IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r8) - IntOffset.m38586getXimpl(r11), IntOffset.m38587getYimpl(r8) - IntOffset.m38587getYimpl(r11));
        }
        throw new NoWhenBranchMatchedException();
    }
}
