package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1 */
/* compiled from: ViewCompositionStrategy.android.kt */
public final class C1102xe2c59457 implements View.OnAttachStateChangeListener {
    final /* synthetic */ Ref$ObjectRef<C13074a<C11921v>> $disposer;
    final /* synthetic */ AbstractComposeView $view;

    C1102xe2c59457(AbstractComposeView abstractComposeView, Ref$ObjectRef<C13074a<C11921v>> ref$ObjectRef) {
        this.$view = abstractComposeView;
        this.$disposer = ref$ObjectRef;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "v");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.$view);
        AbstractComposeView abstractComposeView = this.$view;
        if (lifecycleOwner != null) {
            this.$disposer.f20403b = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView, lifecycleOwner.getLifecycle());
            this.$view.removeOnAttachStateChangeListener(this);
            return;
        }
        throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "v");
    }
}
