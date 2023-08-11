package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4 */
/* compiled from: AndroidView.android.kt */
final class AndroidView_androidKt$updateViewHolderParams$4 extends C12777p implements C13088o<LayoutNode, SavedStateRegistryOwner, C11921v> {
    public static final AndroidView_androidKt$updateViewHolderParams$4 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$4();

    AndroidView_androidKt$updateViewHolderParams$4() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner) {
        C12775o.m28639i(layoutNode, "$this$set");
        C12775o.m28639i(savedStateRegistryOwner, "it");
        AndroidView_androidKt.requireViewFactoryHolder(layoutNode).setSavedStateRegistryOwner(savedStateRegistryOwner);
    }
}
