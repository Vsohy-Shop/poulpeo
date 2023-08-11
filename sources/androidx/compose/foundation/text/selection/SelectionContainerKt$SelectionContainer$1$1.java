package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SelectionContainer.kt */
final class SelectionContainerKt$SelectionContainer$1$1 extends C12777p implements Function1<Selection, C11921v> {
    final /* synthetic */ MutableState<Selection> $selection$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionContainerKt$SelectionContainer$1$1(MutableState<Selection> mutableState) {
        super(1);
        this.$selection$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Selection) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Selection selection) {
        SelectionContainerKt.SelectionContainer$lambda$2(this.$selection$delegate, selection);
    }
}
