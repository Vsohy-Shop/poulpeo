package androidx.compose.p002ui.window;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.window.DialogWrapper$1$2 */
/* compiled from: AndroidDialog.android.kt */
public final class DialogWrapper$1$2 extends ViewOutlineProvider {
    DialogWrapper$1$2() {
    }

    public void getOutline(View view, Outline outline) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(outline, "result");
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
