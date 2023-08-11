package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: EnterExitTransition.kt */
final class SlideModifier extends LayoutModifierWithPassThroughIntrinsics {
    private final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> lazyAnimation;
    private final State<Slide> slideIn;
    private final State<Slide> slideOut;
    private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> transitionSpec = new SlideModifier$transitionSpec$1(this);

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

    public SlideModifier(Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation, State<Slide> state, State<Slide> state2) {
        C12775o.m28639i(deferredAnimation, "lazyAnimation");
        C12775o.m28639i(state, "slideIn");
        C12775o.m28639i(state2, "slideOut");
        this.lazyAnimation = deferredAnimation;
        this.slideIn = state;
        this.slideOut = state2;
    }

    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getLazyAnimation() {
        return this.lazyAnimation;
    }

    public final State<Slide> getSlideIn() {
        return this.slideIn;
    }

    public final State<Slide> getSlideOut() {
        return this.slideOut;
    }

    public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getTransitionSpec() {
        return this.transitionSpec;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m32882measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new SlideModifier$measure$1(this, r9, IntSizeKt.IntSize(r9.getWidth(), r9.getHeight())), 4, (Object) null);
    }

    /* renamed from: targetValueByState-oFUgxo0  reason: not valid java name */
    public final long m32883targetValueByStateoFUgxo0(EnterExitState enterExitState, long j) {
        long j2;
        long j3;
        Function1<IntSize, IntOffset> slideOffset;
        Function1<IntSize, IntOffset> slideOffset2;
        C12775o.m28639i(enterExitState, "targetState");
        Slide value = this.slideIn.getValue();
        if (value == null || (slideOffset2 = value.getSlideOffset()) == null) {
            j2 = IntOffset.Companion.m38596getZeronOccac();
        } else {
            j2 = slideOffset2.invoke(IntSize.m38620boximpl(j)).m38595unboximpl();
        }
        Slide value2 = this.slideOut.getValue();
        if (value2 == null || (slideOffset = value2.getSlideOffset()) == null) {
            j3 = IntOffset.Companion.m38596getZeronOccac();
        } else {
            j3 = slideOffset.invoke(IntSize.m38620boximpl(j)).m38595unboximpl();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i == 1) {
            return IntOffset.Companion.m38596getZeronOccac();
        }
        if (i == 2) {
            return j2;
        }
        if (i == 3) {
            return j3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
