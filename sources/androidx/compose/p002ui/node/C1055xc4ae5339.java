package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$childMeasurables$2 */
/* compiled from: LayoutNodeLayoutDelegate.kt */
final class C1055xc4ae5339 extends C12777p implements Function1<LayoutNode, Measurable> {
    public static final C1055xc4ae5339 INSTANCE = new C1055xc4ae5339();

    C1055xc4ae5339() {
        super(1);
    }

    public final Measurable invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "it");
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
        C12775o.m28636f(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release;
    }
}
