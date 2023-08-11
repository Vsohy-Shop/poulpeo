package androidx.compose.animation;

import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$SizeModifier$measure$size$2 extends C12777p implements Function1<S, IntSize> {
    final /* synthetic */ AnimatedContentScope<S> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$SizeModifier$measure$size$2(AnimatedContentScope<S> animatedContentScope) {
        super(1);
        this.this$0 = animatedContentScope;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntSize.m38620boximpl(m32812invokeYEO4UFw(obj));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m32812invokeYEO4UFw(S s) {
        State state = this.this$0.getTargetSizeMap$animation_release().get(s);
        if (state != null) {
            return ((IntSize) state.getValue()).m38632unboximpl();
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }
}
