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

@Stable
/* compiled from: Drawer.kt */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final SwipeableV2State<DrawerValue> swipeableState;

    /* compiled from: Drawer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<DrawerState, DrawerValue> Saver(Function1<? super DrawerValue, Boolean> function1) {
            C12775o.m28639i(function1, "confirmStateChange");
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(function1));
        }
    }

    public DrawerState(DrawerValue drawerValue, Function1<? super DrawerValue, Boolean> function1) {
        C12775o.m28639i(drawerValue, "initialValue");
        C12775o.m28639i(function1, "confirmStateChange");
        this.swipeableState = new SwipeableV2State(drawerValue, DrawerKt.AnimationSpec, function1, (C13088o) null, DrawerKt.DrawerVelocityThreshold, 8, (DefaultConstructorMarker) null);
    }

    @ExperimentalMaterialApi
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, drawerValue, 0.0f, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final Object close(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, DrawerValue.Closed, 0.0f, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @ExperimentalMaterialApi
    public final Float getOffset() {
        return this.swipeableState.getOffset();
    }

    public final SwipeableV2State<DrawerValue> getSwipeableState$material_release() {
        return this.swipeableState;
    }

    @ExperimentalMaterialApi
    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.swipeableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        if (getCurrentValue() == DrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (getCurrentValue() == DrawerValue.Open) {
            return true;
        }
        return false;
    }

    public final Object open(C12074d<? super C11921v> dVar) {
        Object animateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, DrawerValue.Open, 0.0f, dVar, 2, (Object) null);
        if (animateTo$default == C12150d.m26492c()) {
            return animateTo$default;
        }
        return C11921v.f18618a;
    }

    public final float requireOffset$material_release() {
        return this.swipeableState.requireOffset();
    }

    public final Object snapTo(DrawerValue drawerValue, C12074d<? super C11921v> dVar) {
        Object snapTo = this.swipeableState.snapTo(drawerValue, dVar);
        if (snapTo == C12150d.m26492c()) {
            return snapTo;
        }
        return C11921v.f18618a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? C07281.INSTANCE : function1);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }
}
