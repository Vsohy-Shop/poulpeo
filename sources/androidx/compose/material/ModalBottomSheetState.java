package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
/* compiled from: ModalBottomSheet.kt */
public final class ModalBottomSheetState {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AnimationSpec<Float> animationSpec;
    private final boolean isSkipHalfExpanded;
    private final SwipeableV2State<ModalBottomSheetValue> swipeableState;

    /* compiled from: ModalBottomSheet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<ModalBottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, Function1<? super ModalBottomSheetValue, Boolean> function1, boolean z) {
            C12775o.m28639i(animationSpec, "animationSpec");
            C12775o.m28639i(function1, "confirmValueChange");
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$1.INSTANCE, new ModalBottomSheetState$Companion$Saver$2(animationSpec, function1, z));
        }

        public final Saver<ModalBottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, boolean z, Function1<? super ModalBottomSheetValue, Boolean> function1) {
            C12775o.m28639i(animationSpec, "animationSpec");
            C12775o.m28639i(function1, "confirmStateChange");
            return Saver(animationSpec, function1, z);
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec2, boolean z, Function1<? super ModalBottomSheetValue, Boolean> function1) {
        C12775o.m28639i(modalBottomSheetValue, "initialValue");
        C12775o.m28639i(animationSpec2, "animationSpec");
        C12775o.m28639i(function1, "confirmStateChange");
        this.animationSpec = animationSpec2;
        this.isSkipHalfExpanded = z;
        this.swipeableState = new SwipeableV2State(modalBottomSheetValue, animationSpec2, function1, ModalBottomSheetKt.PositionalThreshold, ModalBottomSheetKt.VelocityThreshold, (DefaultConstructorMarker) null);
        if (z) {
            if (!(modalBottomSheetValue != ModalBottomSheetValue.HalfExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
            }
        }
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, C12074d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            f = modalBottomSheetState.swipeableState.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, dVar);
    }

    public final Object animateTo$material_release(ModalBottomSheetValue modalBottomSheetValue, float f, C12074d<? super C11921v> dVar) {
        Object animateTo = this.swipeableState.animateTo(modalBottomSheetValue, f, dVar);
        if (animateTo == C12150d.m26492c()) {
            return animateTo;
        }
        return C11921v.f18618a;
    }

    public final Object expand$material_release(C12074d<? super C11921v> dVar) {
        SwipeableV2State<ModalBottomSheetValue> swipeableV2State = this.swipeableState;
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!swipeableV2State.hasAnchorForValue(modalBottomSheetValue)) {
            return C11921v.f18618a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, dVar, 2, (Object) null);
        if (animateTo$material_release$default == C12150d.m26492c()) {
            return animateTo$material_release$default;
        }
        return C11921v.f18618a;
    }

    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    public final ModalBottomSheetValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.swipeableState.hasAnchorForValue(ModalBottomSheetValue.HalfExpanded);
    }

    public final float getLastVelocity$material_release() {
        return this.swipeableState.getLastVelocity();
    }

    public final SwipeableV2State<ModalBottomSheetValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    public final ModalBottomSheetValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final Object halfExpand$material_release(C12074d<? super C11921v> dVar) {
        if (!getHasHalfExpandedState$material_release()) {
            return C11921v.f18618a;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, dVar, 2, (Object) null);
        if (animateTo$material_release$default == C12150d.m26492c()) {
            return animateTo$material_release$default;
        }
        return C11921v.f18618a;
    }

    public final Object hide(C12074d<? super C11921v> dVar) {
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, dVar, 2, (Object) null);
        if (animateTo$material_release$default == C12150d.m26492c()) {
            return animateTo$material_release$default;
        }
        return C11921v.f18618a;
    }

    public final boolean isAnimationRunning$material_release() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.isSkipHalfExpanded;
    }

    public final boolean isVisible() {
        if (this.swipeableState.getCurrentValue() != ModalBottomSheetValue.Hidden) {
            return true;
        }
        return false;
    }

    public final float requireOffset$material_release() {
        return this.swipeableState.requireOffset();
    }

    public final Object show(C12074d<? super C11921v> dVar) {
        ModalBottomSheetValue modalBottomSheetValue;
        if (getHasHalfExpandedState$material_release()) {
            modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
        } else {
            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, dVar, 2, (Object) null);
        if (animateTo$material_release$default == C12150d.m26492c()) {
            return animateTo$material_release$default;
        }
        return C11921v.f18618a;
    }

    public final Object snapTo$material_release(ModalBottomSheetValue modalBottomSheetValue, C12074d<? super C11921v> dVar) {
        Object snapTo = this.swipeableState.snapTo(modalBottomSheetValue, dVar);
        if (snapTo == C12150d.m26492c()) {
            return snapTo;
        }
        return C11921v.f18618a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec2, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec2, (i & 4) != 0 ? false : z, function1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec2, Function1<? super ModalBottomSheetValue, Boolean> function1) {
        this(modalBottomSheetValue, animationSpec2, false, function1);
        C12775o.m28639i(modalBottomSheetValue, "initialValue");
        C12775o.m28639i(animationSpec2, "animationSpec");
        C12775o.m28639i(function1, "confirmStateChange");
    }
}
