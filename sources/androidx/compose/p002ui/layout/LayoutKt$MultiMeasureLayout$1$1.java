package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1 */
/* compiled from: Layout.kt */
final class LayoutKt$MultiMeasureLayout$1$1 extends C12777p implements Function1<LayoutNode, C11921v> {
    public static final LayoutKt$MultiMeasureLayout$1$1 INSTANCE = new LayoutKt$MultiMeasureLayout$1$1();

    LayoutKt$MultiMeasureLayout$1$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "$this$init");
        layoutNode.setCanMultiMeasure$ui_release(true);
    }
}
