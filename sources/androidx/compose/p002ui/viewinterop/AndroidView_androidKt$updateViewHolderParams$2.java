package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2 */
/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$updateViewHolderParams$2 extends C12777p implements C13088o<LayoutNode, Density, C11921v> {
    public static final AndroidView_androidKt$updateViewHolderParams$2 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$2();

    AndroidView_androidKt$updateViewHolderParams$2() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Density) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode, Density density) {
        C12775o.m28639i(layoutNode, "$this$set");
        C12775o.m28639i(density, "it");
        AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setDensity(density);
    }
}
