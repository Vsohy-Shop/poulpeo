package androidx.compose.p002ui.node;

import androidx.compose.p002ui.focus.FocusOrder;
import androidx.compose.p002ui.focus.FocusOrderModifier;
import androidx.compose.p002ui.focus.FocusProperties;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.FocusOrderModifierToProperties */
/* compiled from: BackwardsCompatNode.kt */
final class FocusOrderModifierToProperties implements Function1<FocusProperties, C11921v> {
    private final FocusOrderModifier modifier;

    public FocusOrderModifierToProperties(FocusOrderModifier focusOrderModifier) {
        C12775o.m28639i(focusOrderModifier, "modifier");
        this.modifier = focusOrderModifier;
    }

    public final FocusOrderModifier getModifier() {
        return this.modifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return C11921v.f18618a;
    }

    public void invoke(FocusProperties focusProperties) {
        C12775o.m28639i(focusProperties, "focusProperties");
        this.modifier.populateFocusOrder(new FocusOrder(focusProperties));
    }
}
