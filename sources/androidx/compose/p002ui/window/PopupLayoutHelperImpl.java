package androidx.compose.p002ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.window.PopupLayoutHelperImpl */
/* compiled from: AndroidPopup.android.kt */
class PopupLayoutHelperImpl implements PopupLayoutHelper {
    public void getWindowVisibleDisplayFrame(View view, Rect rect) {
        C12775o.m28639i(view, "composeView");
        C12775o.m28639i(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }

    public void setGestureExclusionRects(View view, int i, int i2) {
        C12775o.m28639i(view, "composeView");
    }

    public void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        C12775o.m28639i(windowManager, "windowManager");
        C12775o.m28639i(view, "popupView");
        C12775o.m28639i(layoutParams, "params");
        windowManager.updateViewLayout(view, layoutParams);
    }
}
