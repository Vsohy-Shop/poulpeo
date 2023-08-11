package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;

@ExperimentalMaterial3Api
@Stable
/* compiled from: NavigationDrawer.kt */
public final class DrawerState {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final SwipeableState<DrawerValue> swipeableState;

    /* compiled from: NavigationDrawer.kt */
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
        this.swipeableState = new SwipeableState<>(drawerValue, NavigationDrawerKt.AnimationSpec, function1);
    }

    @ExperimentalMaterial3Api
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, C12074d<? super C11921v> dVar) {
        Object animateTo$material3_release = this.swipeableState.animateTo$material3_release(drawerValue, animationSpec, dVar);
        if (animateTo$material3_release == C12150d.m26492c()) {
            return animateTo$material3_release;
        }
        return C11921v.f18618a;
    }

    public final Object close(C12074d<? super C11921v> dVar) {
        Object animateTo = animateTo(DrawerValue.Closed, NavigationDrawerKt.AnimationSpec, dVar);
        if (animateTo == C12150d.m26492c()) {
            return animateTo;
        }
        return C11921v.f18618a;
    }

    public final DrawerValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    @ExperimentalMaterial3Api
    public final State<Float> getOffset() {
        return this.swipeableState.getOffset();
    }

    public final SwipeableState<DrawerValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    @ExperimentalMaterial3Api
    public final DrawerValue getTargetValue() {
        return this.swipeableState.getTargetValue$material3_release();
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
        Object animateTo = animateTo(DrawerValue.Open, NavigationDrawerKt.AnimationSpec, dVar);
        if (animateTo == C12150d.m26492c()) {
            return animateTo;
        }
        return C11921v.f18618a;
    }

    @ExperimentalMaterial3Api
    public final Object snapTo(DrawerValue drawerValue, C12074d<? super C11921v> dVar) {
        Object snapTo$material3_release = this.swipeableState.snapTo$material3_release(drawerValue, dVar);
        if (snapTo$material3_release == C12150d.m26492c()) {
            return snapTo$material3_release;
        }
        return C11921v.f18618a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? C08471.INSTANCE : function1);
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getTargetValue$annotations() {
    }
}
