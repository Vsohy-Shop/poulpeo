package androidx.compose.p002ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(23)
/* renamed from: androidx.compose.ui.platform.TextToolbarHelperMethods */
/* compiled from: AndroidTextToolbar.android.kt */
public final class TextToolbarHelperMethods {
    public static final TextToolbarHelperMethods INSTANCE = new TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    @RequiresApi(23)
    @DoNotInline
    public final void invalidateContentRect(ActionMode actionMode) {
        C12775o.m28639i(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    @RequiresApi(23)
    @DoNotInline
    public final ActionMode startActionMode(View view, ActionMode.Callback callback, int i) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(callback, "actionModeCallback");
        return view.startActionMode(callback, i);
    }
}
