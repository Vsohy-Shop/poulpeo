package androidx.compose.material;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2Defaults$ReconcileAnimationOnAnchorChangeHandler$1 implements AnchorChangeHandler<T> {
    final /* synthetic */ C13088o<T, Float, C11921v> $animate;
    final /* synthetic */ Function1<T, C11921v> $snap;
    final /* synthetic */ SwipeableV2State<T> $state;

    SwipeableV2Defaults$ReconcileAnimationOnAnchorChangeHandler$1(C13088o<? super T, ? super Float, C11921v> oVar, SwipeableV2State<T> swipeableV2State, Function1<? super T, C11921v> function1) {
        this.$animate = oVar;
        this.$state = swipeableV2State;
        this.$snap = function1;
    }

    public final void onAnchorsChanged(T t, Map<T, Float> map, Map<T, Float> map2) {
        C12775o.m28639i(map, "previousAnchors");
        C12775o.m28639i(map2, "newAnchors");
        Float f = map2.get(t);
        if (C12775o.m28633c(map.get(t), f)) {
            return;
        }
        if (f != null) {
            this.$animate.invoke(t, Float.valueOf(this.$state.getLastVelocity()));
        } else {
            this.$snap.invoke(SwipeableV2Kt.closestAnchor$default(map2, this.$state.requireOffset(), false, 2, (Object) null));
        }
    }
}
