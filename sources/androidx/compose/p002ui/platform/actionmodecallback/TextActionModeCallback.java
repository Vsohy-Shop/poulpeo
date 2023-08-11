package androidx.compose.p002ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback */
/* compiled from: TextActionModeCallback.android.kt */
public final class TextActionModeCallback {
    private final C13074a<C11921v> onActionModeDestroy;
    private C13074a<C11921v> onCopyRequested;
    private C13074a<C11921v> onCutRequested;
    private C13074a<C11921v> onPasteRequested;
    private C13074a<C11921v> onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this((C13074a) null, (Rect) null, (C13074a) null, (C13074a) null, (C13074a) null, (C13074a) null, 63, (DefaultConstructorMarker) null);
    }

    private final void addOrRemoveMenuItem(Menu menu, MenuItemOption menuItemOption, C13074a<C11921v> aVar) {
        if (aVar != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else if (aVar == null && menu.findItem(menuItemOption.getId()) != null) {
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(Menu menu, MenuItemOption menuItemOption) {
        C12775o.m28639i(menu, "menu");
        C12775o.m28639i(menuItemOption, "item");
        menu.add(0, menuItemOption.getId(), menuItemOption.getOrder(), menuItemOption.getTitleResource()).setShowAsAction(1);
    }

    public final C13074a<C11921v> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    public final C13074a<C11921v> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final C13074a<C11921v> getOnCutRequested() {
        return this.onCutRequested;
    }

    public final C13074a<C11921v> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final C13074a<C11921v> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C12775o.m28636f(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            C13074a<C11921v> aVar = this.onCopyRequested;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            C13074a<C11921v> aVar2 = this.onPasteRequested;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            C13074a<C11921v> aVar3 = this.onCutRequested;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId != MenuItemOption.SelectAll.getId()) {
            return false;
        } else {
            C13074a<C11921v> aVar4 = this.onSelectAllRequested;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (actionMode != null) {
            if (this.onCopyRequested != null) {
                addMenuItem$ui_release(menu, MenuItemOption.Copy);
            }
            if (this.onPasteRequested != null) {
                addMenuItem$ui_release(menu, MenuItemOption.Paste);
            }
            if (this.onCutRequested != null) {
                addMenuItem$ui_release(menu, MenuItemOption.Cut);
            }
            if (this.onSelectAllRequested == null) {
                return true;
            }
            addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
            return true;
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void onDestroyActionMode() {
        C13074a<C11921v> aVar = this.onActionModeDestroy;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnCopyRequested(C13074a<C11921v> aVar) {
        this.onCopyRequested = aVar;
    }

    public final void setOnCutRequested(C13074a<C11921v> aVar) {
        this.onCutRequested = aVar;
    }

    public final void setOnPasteRequested(C13074a<C11921v> aVar) {
        this.onPasteRequested = aVar;
    }

    public final void setOnSelectAllRequested(C13074a<C11921v> aVar) {
        this.onSelectAllRequested = aVar;
    }

    public final void setRect(Rect rect2) {
        C12775o.m28639i(rect2, "<set-?>");
        this.rect = rect2;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(Menu menu) {
        C12775o.m28639i(menu, "menu");
        addOrRemoveMenuItem(menu, MenuItemOption.Copy, this.onCopyRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Paste, this.onPasteRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.Cut, this.onCutRequested);
        addOrRemoveMenuItem(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public TextActionModeCallback(C13074a<C11921v> aVar, Rect rect2, C13074a<C11921v> aVar2, C13074a<C11921v> aVar3, C13074a<C11921v> aVar4, C13074a<C11921v> aVar5) {
        C12775o.m28639i(rect2, "rect");
        this.onActionModeDestroy = aVar;
        this.rect = rect2;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextActionModeCallback(p404of.C13074a r6, androidx.compose.p002ui.geometry.Rect r7, p404of.C13074a r8, p404of.C13074a r9, p404of.C13074a r10, p404of.C13074a r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0012
            androidx.compose.ui.geometry.Rect$Companion r6 = androidx.compose.p002ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r7 = r6.getZero()
        L_0x0012:
            r1 = r7
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r8
        L_0x001a:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x0020
            r3 = r0
            goto L_0x0021
        L_0x0020:
            r3 = r9
        L_0x0021:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0027
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r10
        L_0x0028:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002e
            r12 = r0
            goto L_0x002f
        L_0x002e:
            r12 = r11
        L_0x002f:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.actionmodecallback.TextActionModeCallback.<init>(of.a, androidx.compose.ui.geometry.Rect, of.a, of.a, of.a, of.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
