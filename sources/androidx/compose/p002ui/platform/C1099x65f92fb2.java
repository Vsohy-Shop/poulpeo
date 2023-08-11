package androidx.compose.p002ui.platform;

import androidx.customview.poolingcontainer.PoolingContainerListener;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$poolingContainerListener$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
final class C1099x65f92fb2 implements PoolingContainerListener {
    final /* synthetic */ AbstractComposeView $view;

    C1099x65f92fb2(AbstractComposeView abstractComposeView) {
        this.$view = abstractComposeView;
    }

    public final void onRelease() {
        this.$view.disposeComposition();
    }
}
