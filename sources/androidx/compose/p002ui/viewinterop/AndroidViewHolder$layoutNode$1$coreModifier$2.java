package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nAndroidViewHolder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,567:1\n245#2:568\n*S KotlinDebug\n*F\n+ 1 AndroidViewHolder.android.kt\nandroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$coreModifier$2\n*L\n318#1:568\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$coreModifier$2 extends C12777p implements Function1<DrawScope, C11921v> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$coreModifier$2(LayoutNode layoutNode, AndroidViewHolder androidViewHolder) {
        super(1);
        this.$layoutNode = layoutNode;
        this.this$0 = androidViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(DrawScope drawScope) {
        C12775o.m28639i(drawScope, "$this$drawBehind");
        LayoutNode layoutNode = this.$layoutNode;
        AndroidViewHolder androidViewHolder = this.this$0;
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        Owner owner$ui_release = layoutNode.getOwner$ui_release();
        AndroidComposeView androidComposeView = owner$ui_release instanceof AndroidComposeView ? (AndroidComposeView) owner$ui_release : null;
        if (androidComposeView != null) {
            androidComposeView.drawAndroidView(androidViewHolder, AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }
}
