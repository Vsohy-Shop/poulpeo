package androidx.compose.p002ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,420:1\n62#2,5:421\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter$RenderVector$2\n*L\n239#1:421,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter$RenderVector$2 */
/* compiled from: VectorPainter.kt */
final class VectorPainter$RenderVector$2 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Composition $composition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainter$RenderVector$2(Composition composition) {
        super(1);
        this.$composition = composition;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        return new VectorPainter$RenderVector$2$invoke$$inlined$onDispose$1(this.$composition);
    }
}
