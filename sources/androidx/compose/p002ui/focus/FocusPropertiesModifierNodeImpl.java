package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesModifierNodeImpl */
/* compiled from: FocusProperties.kt */
final class FocusPropertiesModifierNodeImpl extends Modifier.Node implements FocusPropertiesModifierNode {
    private Function1<? super FocusProperties, C11921v> focusPropertiesScope;

    public FocusPropertiesModifierNodeImpl(Function1<? super FocusProperties, C11921v> function1) {
        C12775o.m28639i(function1, "focusPropertiesScope");
        this.focusPropertiesScope = function1;
    }

    public final Function1<FocusProperties, C11921v> getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    public void modifyFocusProperties(FocusProperties focusProperties) {
        C12775o.m28639i(focusProperties, "focusProperties");
        this.focusPropertiesScope.invoke(focusProperties);
    }

    public final void setFocusPropertiesScope(Function1<? super FocusProperties, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.focusPropertiesScope = function1;
    }
}
