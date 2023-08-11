package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13088o;

@ExperimentalAnimationApi
/* compiled from: AnimatedContent.kt */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final C13088o<IntSize, IntSize, FiniteAnimationSpec<IntSize>> sizeAnimationSpec;

    public SizeTransformImpl(boolean z, C13088o<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> oVar) {
        C12775o.m28639i(oVar, "sizeAnimationSpec");
        this.clip = z;
        this.sizeAnimationSpec = oVar;
    }

    /* renamed from: createAnimationSpec-TemP2vQ  reason: not valid java name */
    public FiniteAnimationSpec<IntSize> m32881createAnimationSpecTemP2vQ(long j, long j2) {
        return this.sizeAnimationSpec.invoke(IntSize.m38620boximpl(j), IntSize.m38620boximpl(j2));
    }

    public boolean getClip() {
        return this.clip;
    }

    public final C13088o<IntSize, IntSize, FiniteAnimationSpec<IntSize>> getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeTransformImpl(boolean z, C13088o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, oVar);
    }
}
