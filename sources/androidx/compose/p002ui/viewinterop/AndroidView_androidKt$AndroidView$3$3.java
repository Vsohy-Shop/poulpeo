package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$3 */
/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$AndroidView$3$3 extends C12777p implements C13088o<LayoutNode, Function1<? super T, ? extends C11921v>, C11921v> {
    public static final AndroidView_androidKt$AndroidView$3$3 INSTANCE = new AndroidView_androidKt$AndroidView$3$3();

    AndroidView_androidKt$AndroidView$3$3() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Function1) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(layoutNode, "$this$set");
        C12775o.m28639i(function1, "it");
        AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setReleaseBlock(function1);
    }
}
