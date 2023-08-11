package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: TextFieldSelectionManager.kt */
final class TextFieldSelectionManager$showSelectionToolbar$paste$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$showSelectionToolbar$paste$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.this$0 = textFieldSelectionManager;
    }

    public final void invoke() {
        this.this$0.paste$foundation_release();
        this.this$0.hideSelectionToolbar$foundation_release();
    }
}
