package androidx.compose.p002ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.PrimaryTextActionModeCallback */
/* compiled from: PrimaryTextActionModeCallback.android.kt */
public final class PrimaryTextActionModeCallback implements ActionMode.Callback {
    private final TextActionModeCallback callback;

    public PrimaryTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
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

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.callback.onPrepareActionMode(actionMode, menu);
    }
}
