package androidx.compose.p002ui.platform;

import android.view.View;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
public final class C1096xb3f1a111 implements View.OnAttachStateChangeListener {
    final /* synthetic */ AbstractComposeView $view;

    C1096xb3f1a111(AbstractComposeView abstractComposeView) {
        this.$view = abstractComposeView;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "v");
        this.$view.disposeComposition();
    }
}
