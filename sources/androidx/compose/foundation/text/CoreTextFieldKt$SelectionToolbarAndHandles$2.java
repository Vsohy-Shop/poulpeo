package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$SelectionToolbarAndHandles$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ boolean $show;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$SelectionToolbarAndHandles$2(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i) {
        super(2);
        this.$manager = textFieldSelectionManager;
        this.$show = z;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        CoreTextFieldKt.SelectionToolbarAndHandles(this.$manager, this.$show, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
