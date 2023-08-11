package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.customview.poolingcontainer.PoolingContainer;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
public final class C1098x994eb477 implements View.OnAttachStateChangeListener {
    final /* synthetic */ AbstractComposeView $view;

    C1098x994eb477(AbstractComposeView abstractComposeView) {
        this.$view = abstractComposeView;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "v");
        if (!PoolingContainer.isWithinPoolingContainer(this.$view)) {
            this.$view.disposeComposition();
        }
    }
}
