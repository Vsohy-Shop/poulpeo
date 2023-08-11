package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1 */
/* compiled from: WindowRecomposer.android.kt */
public final class C1106xff837ba8 implements View.OnAttachStateChangeListener {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;

    C1106xff837ba8(View view, Recomposer recomposer) {
        this.$this_createLifecycleAwareWindowRecomposer = view;
        this.$recomposer = recomposer;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "v");
        this.$this_createLifecycleAwareWindowRecomposer.removeOnAttachStateChangeListener(this);
        this.$recomposer.cancel();
    }
}
