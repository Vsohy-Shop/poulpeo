package androidx.compose.p002ui.platform;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1 */
/* compiled from: AndroidTextToolbar.android.kt */
final class AndroidTextToolbar$textActionModeCallback$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ AndroidTextToolbar this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidTextToolbar$textActionModeCallback$1(AndroidTextToolbar androidTextToolbar) {
        super(0);
        this.this$0 = androidTextToolbar;
    }

    public final void invoke() {
        this.this$0.actionMode = null;
    }
}
