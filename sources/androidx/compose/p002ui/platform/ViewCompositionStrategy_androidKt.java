package androidx.compose.p002ui.platform;

import androidx.lifecycle.Lifecycle;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt */
/* compiled from: ViewCompositionStrategy.android.kt */
public final class ViewCompositionStrategy_androidKt {
    /* access modifiers changed from: private */
    public static final C13074a<C11921v> installForLifecycle(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        boolean z;
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 viewCompositionStrategy_androidKt$installForLifecycle$observer$1 = new ViewCompositionStrategy_androidKt$installForLifecycle$observer$1(abstractComposeView);
            lifecycle.addObserver(viewCompositionStrategy_androidKt$installForLifecycle$observer$1);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, viewCompositionStrategy_androidKt$installForLifecycle$observer$1);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
