package androidx.compose.p002ui.viewinterop;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1 */
/* compiled from: AndroidView.android.kt */
final class ViewFactoryHolder$resetBlock$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewFactoryHolder$resetBlock$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    public final void invoke() {
        this.this$0.getResetBlock().invoke(this.this$0.getTypedView());
    }
}
