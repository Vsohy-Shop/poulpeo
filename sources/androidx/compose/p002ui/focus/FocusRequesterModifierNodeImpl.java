package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n728#2,2:85\n735#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n*L\n76#1:85,2\n80#1:87,2\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusRequesterModifierNodeImpl */
/* compiled from: FocusRequesterModifier.kt */
final class FocusRequesterModifierNodeImpl extends Modifier.Node implements FocusRequesterModifierNode {
    private FocusRequester focusRequester;

    public FocusRequesterModifierNodeImpl(FocusRequester focusRequester2) {
        C12775o.m28639i(focusRequester2, "focusRequester");
        this.focusRequester = focusRequester2;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public void onAttach() {
        super.onAttach();
        this.focusRequester.getFocusRequesterNodes$ui_release().add(this);
    }

    public void onDetach() {
        this.focusRequester.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }

    public final void setFocusRequester(FocusRequester focusRequester2) {
        C12775o.m28639i(focusRequester2, "<set-?>");
        this.focusRequester = focusRequester2;
    }
}
