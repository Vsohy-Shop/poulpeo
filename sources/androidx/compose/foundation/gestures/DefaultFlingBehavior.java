package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p002ui.MotionDurationScale;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p355hf.C12074d;
import p466yf.C13970h;

/* compiled from: Scrollable.kt */
public final class DefaultFlingBehavior implements FlingBehavior {
    /* access modifiers changed from: private */
    public final DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    public DefaultFlingBehavior(DecayAnimationSpec<Float> decayAnimationSpec, MotionDurationScale motionDurationScale2) {
        C12775o.m28639i(decayAnimationSpec, "flingDecay");
        C12775o.m28639i(motionDurationScale2, "motionDurationScale");
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale2;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public Object performFling(ScrollScope scrollScope, float f, C12074d<? super Float> dVar) {
        this.lastAnimationCycleCount = 0;
        return C13970h.m32378g(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f, this, scrollScope, (C12074d<? super DefaultFlingBehavior$performFling$2>) null), dVar);
    }

    public final void setLastAnimationCycleCount(int i) {
        this.lastAnimationCycleCount = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale2);
    }
}
