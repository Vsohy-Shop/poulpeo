package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

/* compiled from: AppBar.kt */
final class ExitUntilCollapsedScrollBehavior implements TopAppBarScrollBehavior {
    private final C13074a<Boolean> canScroll;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final boolean isPinned;
    private NestedScrollConnection nestedScrollConnection;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final TopAppBarState state;

    public ExitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, C13074a<Boolean> aVar) {
        C12775o.m28639i(topAppBarState, "state");
        C12775o.m28639i(aVar, "canScroll");
        this.state = topAppBarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
        this.canScroll = aVar;
        this.nestedScrollConnection = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);
    }

    public final C13074a<Boolean> getCanScroll() {
        return this.canScroll;
    }

    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    public NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    public TopAppBarState getState() {
        return this.state;
    }

    public boolean isPinned() {
        return this.isPinned;
    }

    public void setNestedScrollConnection(NestedScrollConnection nestedScrollConnection2) {
        C12775o.m28639i(nestedScrollConnection2, "<set-?>");
        this.nestedScrollConnection = nestedScrollConnection2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, C13074a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topAppBarState, animationSpec, decayAnimationSpec, (i & 8) != 0 ? C08501.INSTANCE : aVar);
    }
}
