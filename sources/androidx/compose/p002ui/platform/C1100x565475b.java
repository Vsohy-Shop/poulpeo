package androidx.compose.p002ui.platform;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
final class C1100x565475b extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C1102xe2c59457 $listener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1100x565475b(AbstractComposeView abstractComposeView, C1102xe2c59457 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1;
    }

    public final void invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }
}
