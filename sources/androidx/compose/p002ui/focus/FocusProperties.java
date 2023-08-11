package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.focus.FocusProperties */
/* compiled from: FocusProperties.kt */
public interface FocusProperties {
    boolean getCanFocus();

    FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @ExperimentalComposeUiApi
    Function1<FocusDirection, FocusRequester> getEnter() {
        return FocusProperties$enter$1.INSTANCE;
    }

    @ExperimentalComposeUiApi
    Function1<FocusDirection, FocusRequester> getExit() {
        return FocusProperties$exit$1.INSTANCE;
    }

    FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    void setCanFocus(boolean z);

    void setDown(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    void setEnd(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    void setEnter(Function1<? super FocusDirection, FocusRequester> function1) {
        C12775o.m28639i(function1, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    void setExit(Function1<? super FocusDirection, FocusRequester> function1) {
        C12775o.m28639i(function1, "<anonymous parameter 0>");
    }

    void setLeft(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    void setNext(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    void setPrevious(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    void setRight(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    void setStart(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    void setUp(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<anonymous parameter 0>");
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getExit$annotations() {
    }
}
