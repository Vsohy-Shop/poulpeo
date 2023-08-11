package androidx.compose.p002ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(23)
/* renamed from: androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback */
/* compiled from: FloatingTextActionModeCallback.android.kt */
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    private final TextActionModeCallback callback;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        C12775o.m28639i(textActionModeCallback, "callback");
        this.callback = textActionModeCallback;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.callback.onActionItemClicked(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.callback.onCreateActionMode(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.callback.onDestroyActionMode();
    }

    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.p002ui.geometry.Rect rect2 = this.callback.getRect();
        if (rect != null) {
            rect.set((int) rect2.getLeft(), (int) rect2.getTop(), (int) rect2.getRight(), (int) rect2.getBottom());
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.callback.onPrepareActionMode(actionMode, menu);
    }
}
