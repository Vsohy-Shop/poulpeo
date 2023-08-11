package androidx.compose.p002ui.platform;

import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
final class C1097x11b1833b extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C1098x994eb477 $listener;
    final /* synthetic */ PoolingContainerListener $poolingContainerListener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1097x11b1833b(AbstractComposeView abstractComposeView, C1098x994eb477 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, PoolingContainerListener poolingContainerListener) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1;
        this.$poolingContainerListener = poolingContainerListener;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        PoolingContainer.removePoolingContainerListener(this.$view, this.$poolingContainerListener);
    }
}
