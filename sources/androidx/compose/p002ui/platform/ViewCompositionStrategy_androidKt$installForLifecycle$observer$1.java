package androidx.compose.p002ui.platform;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
final class ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 implements LifecycleEventObserver {
    final /* synthetic */ AbstractComposeView $view;

    ViewCompositionStrategy_androidKt$installForLifecycle$observer$1(AbstractComposeView abstractComposeView) {
        this.$view = abstractComposeView;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C12775o.m28639i(lifecycleOwner, "<anonymous parameter 0>");
        C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.$view.disposeComposition();
        }
    }
}
