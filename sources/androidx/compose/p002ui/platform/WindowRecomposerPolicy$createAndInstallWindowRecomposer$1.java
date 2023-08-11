package androidx.compose.p002ui.platform;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;
import p466yf.C14054y1;

/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1 */
/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ C14054y1 $unsetJob;

    WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(C14054y1 y1Var) {
        this.$unsetJob = y1Var;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "v");
        view.removeOnAttachStateChangeListener(this);
        C14054y1.C14055a.m32600a(this.$unsetJob, (CancellationException) null, 1, (Object) null);
    }
}
