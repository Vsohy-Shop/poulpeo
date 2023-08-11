package androidx.compose.p002ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting(otherwise = 2)
/* renamed from: androidx.compose.ui.window.PopupLayoutHelper */
/* compiled from: AndroidPopup.android.kt */
public interface PopupLayoutHelper {
    void getWindowVisibleDisplayFrame(View view, Rect rect);

    void setGestureExclusionRects(View view, int i, int i2);

    void updateViewLayout(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams);
}
