package androidx.compose.p002ui.viewinterop;

import android.view.View;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$3 extends C12777p implements Function1<Owner, C11921v> {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidViewHolder $this_run;
    final /* synthetic */ Ref$ObjectRef<View> $viewRemovedOnDetach;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$3(AndroidViewHolder androidViewHolder, LayoutNode layoutNode, Ref$ObjectRef<View> ref$ObjectRef) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$layoutNode = layoutNode;
        this.$viewRemovedOnDetach = ref$ObjectRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Owner) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Owner owner) {
        C12775o.m28639i(owner, "owner");
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.addAndroidView(this.$this_run, this.$layoutNode);
        }
        T t = this.$viewRemovedOnDetach.f20403b;
        if (t != null) {
            this.$this_run.setView$ui_release((View) t);
        }
    }
}
