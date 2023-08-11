package androidx.compose.p002ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusOrderToProperties */
/* compiled from: FocusOrderModifier.kt */
public final class FocusOrderToProperties implements Function1<FocusProperties, C11921v> {
    private final Function1<FocusOrder, C11921v> focusOrderReceiver;

    public FocusOrderToProperties(Function1<? super FocusOrder, C11921v> function1) {
        C12775o.m28639i(function1, "focusOrderReceiver");
        this.focusOrderReceiver = function1;
    }

    public final Function1<FocusOrder, C11921v> getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return C11921v.f18618a;
    }

    public void invoke(FocusProperties focusProperties) {
        C12775o.m28639i(focusProperties, "focusProperties");
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }
}
