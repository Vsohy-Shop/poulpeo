package androidx.compose.p002ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2 */
/* compiled from: ViewCompositionStrategy.android.kt */
final class ViewCompositionStrategy_androidKt$installForLifecycle$2 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ LifecycleEventObserver $observer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewCompositionStrategy_androidKt$installForLifecycle$2(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        super(0);
        this.$lifecycle = lifecycle;
        this.$observer = lifecycleEventObserver;
    }

    public final void invoke() {
        this.$lifecycle.removeObserver(this.$observer);
    }
}
