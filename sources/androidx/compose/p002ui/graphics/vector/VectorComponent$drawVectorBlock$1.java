package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent$drawVectorBlock$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n1#2:556\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1 */
/* compiled from: Vector.kt */
final class VectorComponent$drawVectorBlock$1 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ VectorComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorComponent$drawVectorBlock$1(VectorComponent vectorComponent) {
        super(1);
        this.this$0 = vectorComponent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$null");
        this.this$0.getRoot().draw(drawScope);
    }
}
