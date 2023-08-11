package androidx.compose.p002ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.window.PopupLayoutHelperImpl29 */
/* compiled from: AndroidPopup.android.kt */
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    public void setGestureExclusionRects(View view, int i, int i2) {
        C12775o.m28639i(view, "composeView");
        view.setSystemGestureExclusionRects(C12726w.m28530q(new Rect(0, 0, i, i2)));
    }
}
