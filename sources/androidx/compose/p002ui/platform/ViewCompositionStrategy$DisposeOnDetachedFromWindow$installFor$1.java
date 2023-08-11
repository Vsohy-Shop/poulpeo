package androidx.compose.p002ui.platform;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
final class ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C1096xb3f1a111 $listener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(AbstractComposeView abstractComposeView, C1096xb3f1a111 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }
}
