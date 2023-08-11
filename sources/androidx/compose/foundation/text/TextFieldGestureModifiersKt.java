package androidx.compose.foundation.text;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusChangedModifierKt;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.focus.FocusRequesterModifierKt;
import androidx.compose.p002ui.focus.FocusState;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: TextFieldGestureModifiers.kt */
public final class TextFieldGestureModifiersKt {
    public static final Modifier longPressDragGestureFilter(Modifier modifier, TextDragObserver textDragObserver, boolean z) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(textDragObserver, "observer");
        if (z) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, (Object) textDragObserver, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new TextFieldGestureModifiersKt$longPressDragGestureFilter$1(textDragObserver, (C12074d<? super TextFieldGestureModifiersKt$longPressDragGestureFilter$1>) null));
        }
        return modifier;
    }

    public static final Modifier mouseDragGestureDetector(Modifier modifier, MouseSelectionObserver mouseSelectionObserver, boolean z) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(mouseSelectionObserver, "observer");
        if (z) {
            return SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) mouseSelectionObserver, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(mouseSelectionObserver, (C12074d<? super TextFieldGestureModifiersKt$mouseDragGestureDetector$1>) null));
        }
        return modifier;
    }

    public static final Modifier textFieldFocusModifier(Modifier modifier, boolean z, FocusRequester focusRequester, MutableInteractionSource mutableInteractionSource, Function1<? super FocusState, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(focusRequester, "focusRequester");
        C12775o.m28639i(function1, "onFocusChanged");
        return FocusableKt.focusable(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), function1), z, mutableInteractionSource);
    }
}
