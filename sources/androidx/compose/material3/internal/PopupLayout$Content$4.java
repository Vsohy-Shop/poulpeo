package androidx.compose.material3.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ExposedDropdownMenuPopup.kt */
final class PopupLayout$Content$4 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ PopupLayout $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PopupLayout$Content$4(PopupLayout popupLayout, int i) {
        super(2);
        this.$tmp0_rcvr = popupLayout;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.Content(composer, this.$$changed | 1);
    }
}
