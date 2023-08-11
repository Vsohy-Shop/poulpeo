package androidx.compose.foundation.text;

import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.focus.FocusManager;
import androidx.compose.p002ui.text.input.ImeAction;
import androidx.compose.p002ui.text.input.TextInputSession;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: KeyboardActionRunner.kt */
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    private TextInputSession inputSession;
    public KeyboardActions keyboardActions;

    /* renamed from: defaultKeyboardAction-KlQnJC8  reason: not valid java name */
    public void m33660defaultKeyboardActionKlQnJC8(int i) {
        boolean z;
        boolean z2;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m38122equalsimpl0(i, companion.m38137getNexteUduSuo())) {
            getFocusManager().m35362moveFocus3ESFkO8(FocusDirection.Companion.m35357getNextdhqQ8s());
        } else if (ImeAction.m38122equalsimpl0(i, companion.m38139getPreviouseUduSuo())) {
            getFocusManager().m35362moveFocus3ESFkO8(FocusDirection.Companion.m35359getPreviousdhqQ8s());
        } else if (ImeAction.m38122equalsimpl0(i, companion.m38135getDoneeUduSuo())) {
            TextInputSession textInputSession = this.inputSession;
            if (textInputSession != null) {
                textInputSession.hideSoftwareKeyboard();
            }
        } else {
            boolean z3 = true;
            if (ImeAction.m38122equalsimpl0(i, companion.m38136getGoeUduSuo())) {
                z = true;
            } else {
                z = ImeAction.m38122equalsimpl0(i, companion.m38140getSearcheUduSuo());
            }
            if (z) {
                z2 = true;
            } else {
                z2 = ImeAction.m38122equalsimpl0(i, companion.m38141getSendeUduSuo());
            }
            if (!z2) {
                z3 = ImeAction.m38122equalsimpl0(i, companion.m38134getDefaulteUduSuo());
            }
            if (!z3) {
                ImeAction.m38122equalsimpl0(i, companion.m38138getNoneeUduSuo());
            }
        }
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager2 = this.focusManager;
        if (focusManager2 != null) {
            return focusManager2;
        }
        C12775o.m28656z("focusManager");
        return null;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions2 = this.keyboardActions;
        if (keyboardActions2 != null) {
            return keyboardActions2;
        }
        C12775o.m28656z("keyboardActions");
        return null;
    }

    /* renamed from: runAction-KlQnJC8  reason: not valid java name */
    public final void m33661runActionKlQnJC8(int i) {
        Function1<KeyboardActionScope, C11921v> function1;
        boolean z;
        ImeAction.Companion companion = ImeAction.Companion;
        C11921v vVar = null;
        if (ImeAction.m38122equalsimpl0(i, companion.m38135getDoneeUduSuo())) {
            function1 = getKeyboardActions().getOnDone();
        } else if (ImeAction.m38122equalsimpl0(i, companion.m38136getGoeUduSuo())) {
            function1 = getKeyboardActions().getOnGo();
        } else if (ImeAction.m38122equalsimpl0(i, companion.m38137getNexteUduSuo())) {
            function1 = getKeyboardActions().getOnNext();
        } else if (ImeAction.m38122equalsimpl0(i, companion.m38139getPreviouseUduSuo())) {
            function1 = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m38122equalsimpl0(i, companion.m38140getSearcheUduSuo())) {
            function1 = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m38122equalsimpl0(i, companion.m38141getSendeUduSuo())) {
            function1 = getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m38122equalsimpl0(i, companion.m38134getDefaulteUduSuo())) {
                z = true;
            } else {
                z = ImeAction.m38122equalsimpl0(i, companion.m38138getNoneeUduSuo());
            }
            if (z) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            vVar = C11921v.f18618a;
        }
        if (vVar == null) {
            m33660defaultKeyboardActionKlQnJC8(i);
        }
    }

    public final void setFocusManager(FocusManager focusManager2) {
        C12775o.m28639i(focusManager2, "<set-?>");
        this.focusManager = focusManager2;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions2) {
        C12775o.m28639i(keyboardActions2, "<set-?>");
        this.keyboardActions = keyboardActions2;
    }
}
