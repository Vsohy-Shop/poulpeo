package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@ExperimentalMaterialApi
@Stable
/* compiled from: BottomSheetScaffold.kt */
public final class BottomSheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final SwipeableV2State<BottomSheetValue> swipeableState;

    /* compiled from: BottomSheetScaffold.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<BottomSheetState, ?> Saver(AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
            C12775o.m28639i(animationSpec, "animationSpec");
            C12775o.m28639i(function1, "confirmStateChange");
            return SaverKt.Saver(BottomSheetState$Companion$Saver$1.INSTANCE, new BottomSheetState$Companion$Saver$2(animationSpec, function1));
        }
    }

    public BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec<Float> animationSpec, Function1<? super BottomSheetValue, Boolean> function1) {
        C12775o.m28639i(bottomSheetValue, "initialValue");
        C12775o.m28639i(animationSpec, "animationSpec");
        C12775o.m28639i(function1, "confirmValueChange");
        this.swipeableState = new SwipeableV2State(bottomSheetValue, animationSpec, function1, (C13088o) null, 0.0f, 24, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f, C12074d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            f = bottomSheetState.swipeableState.getLastVelocity();
        }
        return bottomSheetState.animateTo$material_release(bottomSheetValue, f, dVar);
    }

    public final Object animateTo$material_release(BottomSheetValue bottomSheetValue, float f, C12074d<? super C11921v> dVar) {
        Object animateTo = this.swipeableState.animateTo(bottomSheetValue, f, dVar);
        if (animateTo == C12150d.m26492c()) {
            return animateTo;
        }
        return C11921v.f18618a;
    }

    public final Object collapse(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, BottomSheetValue.Collapsed, 0.0f, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final Object expand(C12074d<? super C11921v> dVar) {
        SwipeableV2State<BottomSheetValue> swipeableV2State = this.swipeableState;
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!swipeableV2State.hasAnchorForValue(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object animateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, bottomSheetValue, 0.0f, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final BottomSheetValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final float getOffset() {
        throw new IllegalStateException("Use requireOffset() to access the offset.".toString());
    }

    public final float getProgress() {
        return this.swipeableState.getProgress();
    }

    public final SwipeableV2State<BottomSheetValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    public final boolean isAnimationRunning$material_release() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isCollapsed() {
        if (this.swipeableState.getCurrentValue() == BottomSheetValue.Collapsed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (this.swipeableState.getCurrentValue() == BottomSheetValue.Expanded) {
            return true;
        }
        return false;
    }

    public final float requireOffset() {
        return this.swipeableState.requireOffset();
    }

    public final Object snapTo$material_release(BottomSheetValue bottomSheetValue, C12074d<? super C11921v> dVar) {
        Object snapTo = this.swipeableState.snapTo(bottomSheetValue, dVar);
        if (snapTo == C12150d.m26492c()) {
            return snapTo;
        }
        return C11921v.f18618a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? C07071.INSTANCE : function1);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }
}
