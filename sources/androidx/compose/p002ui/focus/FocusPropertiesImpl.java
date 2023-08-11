package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.focus.FocusRequester;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesImpl */
/* compiled from: FocusProperties.kt */
public final class FocusPropertiesImpl implements FocusProperties {
    private boolean canFocus = true;
    private FocusRequester down;
    private FocusRequester end;
    private Function1<? super FocusDirection, FocusRequester> enter;
    private Function1<? super FocusDirection, FocusRequester> exit;
    private FocusRequester left;
    private FocusRequester next;
    private FocusRequester previous;
    private FocusRequester right;
    private FocusRequester start;

    /* renamed from: up */
    private FocusRequester f262up;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.Companion;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.f262up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.enter = FocusPropertiesImpl$enter$1.INSTANCE;
        this.exit = FocusPropertiesImpl$exit$1.INSTANCE;
    }

    public boolean getCanFocus() {
        return this.canFocus;
    }

    public FocusRequester getDown() {
        return this.down;
    }

    public FocusRequester getEnd() {
        return this.end;
    }

    public Function1<FocusDirection, FocusRequester> getEnter() {
        return this.enter;
    }

    public Function1<FocusDirection, FocusRequester> getExit() {
        return this.exit;
    }

    public FocusRequester getLeft() {
        return this.left;
    }

    public FocusRequester getNext() {
        return this.next;
    }

    public FocusRequester getPrevious() {
        return this.previous;
    }

    public FocusRequester getRight() {
        return this.right;
    }

    public FocusRequester getStart() {
        return this.start;
    }

    public FocusRequester getUp() {
        return this.f262up;
    }

    public void setCanFocus(boolean z) {
        this.canFocus = z;
    }

    public void setDown(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.down = focusRequester;
    }

    public void setEnd(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.end = focusRequester;
    }

    public void setEnter(Function1<? super FocusDirection, FocusRequester> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.enter = function1;
    }

    public void setExit(Function1<? super FocusDirection, FocusRequester> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.exit = function1;
    }

    public void setLeft(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.left = focusRequester;
    }

    public void setNext(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.next = focusRequester;
    }

    public void setPrevious(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.previous = focusRequester;
    }

    public void setRight(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.right = focusRequester;
    }

    public void setStart(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.start = focusRequester;
    }

    public void setUp(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "<set-?>");
        this.f262up = focusRequester;
    }

    public static /* synthetic */ void getEnter$annotations() {
    }

    public static /* synthetic */ void getExit$annotations() {
    }
}
