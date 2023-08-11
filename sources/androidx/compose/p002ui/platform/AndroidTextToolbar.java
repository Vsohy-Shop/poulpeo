package androidx.compose.p002ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.p002ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar */
/* compiled from: AndroidTextToolbar.android.kt */
public final class AndroidTextToolbar implements TextToolbar {
    /* access modifiers changed from: private */
    public ActionMode actionMode;
    private TextToolbarStatus status = TextToolbarStatus.Hidden;
    private final TextActionModeCallback textActionModeCallback = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), (Rect) null, (C13074a) null, (C13074a) null, (C13074a) null, (C13074a) null, 62, (DefaultConstructorMarker) null);
    private final View view;

    public AndroidTextToolbar(View view2) {
        C12775o.m28639i(view2, "view");
        this.view = view2;
    }

    public TextToolbarStatus getStatus() {
        return this.status;
    }

    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode2 = this.actionMode;
        if (actionMode2 != null) {
            actionMode2.finish();
        }
        this.actionMode = null;
    }

    public void showMenu(Rect rect, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13074a<C11921v> aVar3, C13074a<C11921v> aVar4) {
        C12775o.m28639i(rect, "rect");
        this.textActionModeCallback.setRect(rect);
        this.textActionModeCallback.setOnCopyRequested(aVar);
        this.textActionModeCallback.setOnCutRequested(aVar3);
        this.textActionModeCallback.setOnPasteRequested(aVar2);
        this.textActionModeCallback.setOnSelectAllRequested(aVar4);
        ActionMode actionMode2 = this.actionMode;
        if (actionMode2 == null) {
            this.status = TextToolbarStatus.Shown;
            this.actionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, new FloatingTextActionModeCallback(this.textActionModeCallback), 1);
        } else if (actionMode2 != null) {
            actionMode2.invalidate();
        }
    }
}
