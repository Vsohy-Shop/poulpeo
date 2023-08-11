package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$removeAndroidView$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ AndroidViewHolder $view;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$removeAndroidView$1(AndroidComposeView androidComposeView, AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidComposeView;
        this.$view = androidViewHolder;
    }

    public final void invoke() {
        this.this$0.getAndroidViewsHandler$ui_release().removeViewInLayout(this.$view);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = this.this$0.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        C12772l0.m28612d(layoutNodeToHolder).remove(this.this$0.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.$view));
        ViewCompat.setImportantForAccessibility(this.$view, 0);
    }
}
