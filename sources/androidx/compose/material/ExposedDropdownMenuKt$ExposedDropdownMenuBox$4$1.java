package androidx.compose.material;

import androidx.compose.p002ui.focus.FocusRequester;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuKt$ExposedDropdownMenuBox$4$1(boolean z, FocusRequester focusRequester) {
        super(0);
        this.$expanded = z;
        this.$focusRequester = focusRequester;
    }

    public final void invoke() {
        if (this.$expanded) {
            this.$focusRequester.requestFocus();
        }
    }
}
