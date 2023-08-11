package androidx.compose.p002ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.focus.FocusOrder */
/* compiled from: FocusOrderModifier.kt */
public final class FocusOrder {
    public static final int $stable = 8;
    private final FocusProperties focusProperties;

    public FocusOrder(FocusProperties focusProperties2) {
        C12775o.m28639i(focusProperties2, "focusProperties");
        this.focusProperties = focusProperties2;
    }

    public final FocusRequester getDown() {
        return this.focusProperties.getDown();
    }

    public final FocusRequester getEnd() {
        return this.focusProperties.getEnd();
    }

    public final FocusRequester getLeft() {
        return this.focusProperties.getLeft();
    }

    public final FocusRequester getNext() {
        return this.focusProperties.getNext();
    }

    public final FocusRequester getPrevious() {
        return this.focusProperties.getPrevious();
    }

    public final FocusRequester getRight() {
        return this.focusProperties.getRight();
    }

    public final FocusRequester getStart() {
        return this.focusProperties.getStart();
    }

    public final FocusRequester getUp() {
        return this.focusProperties.getUp();
    }

    public final void setDown(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "down");
        this.focusProperties.setDown(focusRequester);
    }

    public final void setEnd(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "end");
        this.focusProperties.setEnd(focusRequester);
    }

    public final void setLeft(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "left");
        this.focusProperties.setLeft(focusRequester);
    }

    public final void setNext(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "next");
        this.focusProperties.setNext(focusRequester);
    }

    public final void setPrevious(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "previous");
        this.focusProperties.setPrevious(focusRequester);
    }

    public final void setRight(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "right");
        this.focusProperties.setRight(focusRequester);
    }

    public final void setStart(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "start");
        this.focusProperties.setStart(focusRequester);
    }

    public final void setUp(FocusRequester focusRequester) {
        C12775o.m28639i(focusRequester, "up");
        this.focusProperties.setUp(focusRequester);
    }

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }
}
