package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentKt$SizeTransform$1 extends C12777p implements C13088o<IntSize, IntSize, SpringSpec<IntSize>> {
    public static final AnimatedContentKt$SizeTransform$1 INSTANCE = new AnimatedContentKt$SizeTransform$1();

    AnimatedContentKt$SizeTransform$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m32795invokeTemP2vQ(((IntSize) obj).m38632unboximpl(), ((IntSize) obj2).m38632unboximpl());
    }

    /* renamed from: invoke-TemP2vQ  reason: not valid java name */
    public final SpringSpec<IntSize> m32795invokeTemP2vQ(long j, long j2) {
        return AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m38620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, (Object) null);
    }
}
