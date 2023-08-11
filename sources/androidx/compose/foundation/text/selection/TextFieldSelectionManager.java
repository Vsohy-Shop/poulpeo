package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.platform.ClipboardManager;
import androidx.compose.p002ui.platform.TextToolbar;
import androidx.compose.p002ui.platform.TextToolbarStatus;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.TextRangeKt;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TextFieldValueKt;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n76#2:907\n102#2,2:908\n76#2:910\n102#2,2:911\n76#2:913\n102#2,2:914\n76#2:916\n102#2,2:917\n1#3:919\n154#4:920\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n86#1:907\n86#1:908,2\n117#1:910\n117#1:911,2\n147#1:913\n147#1:914,2\n150#1:916\n150#1:917,2\n737#1:920\n*E\n"})
/* compiled from: TextFieldSelectionManager.kt */
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;
    private final MutableState currentDragPosition$delegate;
    /* access modifiers changed from: private */
    public Integer dragBeginOffsetInText;
    /* access modifiers changed from: private */
    public long dragBeginPosition;
    /* access modifiers changed from: private */
    public long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, C11921v> onValueChange;
    private TextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this((UndoManager) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo  reason: not valid java name */
    public final TextFieldValue m33839createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default  reason: not valid java name */
    public static /* synthetic */ void m33840deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m33843deselect_kEHs6E$foundation_release(offset);
    }

    private final Rect getContentRect() {
        long j;
        long j2;
        float f;
        LayoutCoordinates layoutCoordinates;
        float f2;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        float f3;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (!(!textFieldState.isLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m37975getStartimpl(getValue$foundation_release().m38194getSelectiond9O1mEE()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m37970getEndimpl(getValue$foundation_release().m38194getSelectiond9O1mEE()));
                TextFieldState textFieldState2 = this.state;
                if (textFieldState2 == null || (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) == null) {
                    j = Offset.Companion.m35438getZeroF1C5BW0();
                } else {
                    j = layoutCoordinates4.m37343localToRootMKHz9U(m33846getHandlePositiontuRUvjQ$foundation_release(true));
                }
                TextFieldState textFieldState3 = this.state;
                if (textFieldState3 == null || (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) == null) {
                    j2 = Offset.Companion.m35438getZeroF1C5BW0();
                } else {
                    j2 = layoutCoordinates3.m37343localToRootMKHz9U(m33846getHandlePositiontuRUvjQ$foundation_release(false));
                }
                TextFieldState textFieldState4 = this.state;
                float f4 = 0.0f;
                if (textFieldState4 == null || (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) == null) {
                    f = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    if (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(originalToTransformed)) == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = cursorRect2.getTop();
                    }
                    f = Offset.m35423getYimpl(layoutCoordinates2.m37343localToRootMKHz9U(OffsetKt.Offset(0.0f, f3)));
                }
                TextFieldState textFieldState5 = this.state;
                if (!(textFieldState5 == null || (layoutCoordinates = textFieldState5.getLayoutCoordinates()) == null)) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    if (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(originalToTransformed2)) == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = cursorRect.getTop();
                    }
                    f4 = Offset.m35423getYimpl(layoutCoordinates.m37343localToRootMKHz9U(OffsetKt.Offset(0.0f, f2)));
                }
                return new Rect(Math.min(Offset.m35422getXimpl(j), Offset.m35422getXimpl(j2)), Math.min(f, f4), Math.max(Offset.m35422getXimpl(j), Offset.m35422getXimpl(j2)), Math.max(Offset.m35423getYimpl(j), Offset.m35423getYimpl(j2)) + (C1232Dp.m38468constructorimpl((float) 25) * textFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E  reason: not valid java name */
    public final void m33841setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    /* access modifiers changed from: private */
    public final void updateSelection(TextFieldValue textFieldValue, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment) {
        TextLayoutResult textLayoutResult;
        TextLayoutResultProxy layoutResult;
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m37975getStartimpl(textFieldValue.m38194getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m37970getEndimpl(textFieldValue.m38194getSelectiond9O1mEE())));
        TextFieldState textFieldState = this.state;
        TextRange textRange = null;
        if (textFieldState == null || (layoutResult = textFieldState.getLayoutResult()) == null) {
            textLayoutResult = null;
        } else {
            textLayoutResult = layoutResult.getValue();
        }
        if (!TextRange.m37969getCollapsedimpl(TextRange)) {
            textRange = TextRange.m37963boximpl(TextRange);
        }
        long r12 = TextFieldSelectionDelegateKt.m33836getTextFieldSelectionbb3KNj8(textLayoutResult, i, i2, textRange, z, selectionAdjustment);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m37975getStartimpl(r12)), this.offsetMapping.transformedToOriginal(TextRange.m37970getEndimpl(r12)));
        if (!TextRange.m37968equalsimpl0(TextRange2, textFieldValue.m38194getSelectiond9O1mEE())) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.m36401performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m36410getTextHandleMove5zf0vsI());
            }
            this.onValueChange.invoke(m33839createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2));
            TextFieldState textFieldState2 = this.state;
            if (textFieldState2 != null) {
                textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
            }
            TextFieldState textFieldState3 = this.state;
            if (textFieldState3 != null) {
                textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
            }
        }
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M  reason: not valid java name */
    public final void m33842contextMenuOpenAdjustmentk4lQ0M(long j) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            int r10 = TextLayoutResultProxy.m33738getOffsetForPosition3MmeM6k$default(layoutResult, j, false, 2, (Object) null);
            if (!TextRange.m37966containsimpl(getValue$foundation_release().m38194getSelectiond9O1mEE(), r10)) {
                updateSelection(getValue$foundation_release(), r10, r10, false, SelectionAdjustment.Companion.getWord());
            }
        }
    }

    public final void copy$foundation_release(boolean z) {
        if (!TextRange.m37969getCollapsedimpl(getValue$foundation_release().m38194getSelectiond9O1mEE())) {
            ClipboardManager clipboardManager2 = this.clipboardManager;
            if (clipboardManager2 != null) {
                clipboardManager2.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
            }
            if (z) {
                int r4 = TextRange.m37972getMaximpl(getValue$foundation_release().m38194getSelectiond9O1mEE());
                this.onValueChange.invoke(m33839createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(r4, r4)));
                setHandleState(HandleState.None);
            }
        }
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextFieldSelectionManager$cursorDragObserver$1(this);
    }

    public final void cut$foundation_release() {
        if (!TextRange.m37969getCollapsedimpl(getValue$foundation_release().m38194getSelectiond9O1mEE())) {
            ClipboardManager clipboardManager2 = this.clipboardManager;
            if (clipboardManager2 != null) {
                clipboardManager2.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
            }
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int r1 = TextRange.m37973getMinimpl(getValue$foundation_release().m38194getSelectiond9O1mEE());
            this.onValueChange.invoke(m33839createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(r1, r1)));
            setHandleState(HandleState.None);
            UndoManager undoManager2 = this.undoManager;
            if (undoManager2 != null) {
                undoManager2.forceNextSnapshot();
            }
        }
    }

    /* renamed from: deselect-_kEHs6E$foundation_release  reason: not valid java name */
    public final void m33843deselect_kEHs6E$foundation_release(Offset offset) {
        HandleState handleState;
        boolean z;
        TextLayoutResultProxy textLayoutResultProxy;
        int i;
        if (!TextRange.m37969getCollapsedimpl(getValue$foundation_release().m38194getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.state;
            if (textFieldState != null) {
                textLayoutResultProxy = textFieldState.getLayoutResult();
            } else {
                textLayoutResultProxy = null;
            }
            TextLayoutResultProxy textLayoutResultProxy2 = textLayoutResultProxy;
            if (offset == null || textLayoutResultProxy2 == null) {
                i = TextRange.m37972getMaximpl(getValue$foundation_release().m38194getSelectiond9O1mEE());
            } else {
                i = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m33738getOffsetForPosition3MmeM6k$default(textLayoutResultProxy2, offset.m35432unboximpl(), false, 2, (Object) null));
            }
            this.onValueChange.invoke(TextFieldValue.m38189copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(i), (TextRange) null, 5, (Object) null));
        }
        if (offset != null) {
            if (getValue$foundation_release().getText().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                handleState = HandleState.Cursor;
                setHandleState(handleState);
                hideSelectionToolbar$foundation_release();
            }
        }
        handleState = HandleState.None;
        setHandleState(handleState);
        hideSelectionToolbar$foundation_release();
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester2;
        TextFieldState textFieldState = this.state;
        boolean z = false;
        if (textFieldState != null && !textFieldState.getHasFocus()) {
            z = true;
        }
        if (z && (focusRequester2 = this.focusRequester) != null) {
            focusRequester2.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.clipboardManager;
    }

    /* renamed from: getCurrentDragPosition-_m7T9-E  reason: not valid java name */
    public final Offset m33844getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m33845getCursorPositiontuRUvjQ$foundation_release(Density density) {
        TextLayoutResultProxy textLayoutResultProxy;
        C12775o.m28639i(density, "density");
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m37975getStartimpl(getValue$foundation_release().m38194getSelectiond9O1mEE()));
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textLayoutResultProxy = textFieldState.getLayoutResult();
        } else {
            textLayoutResultProxy = null;
        }
        C12775o.m28636f(textLayoutResultProxy);
        TextLayoutResult value = textLayoutResultProxy.getValue();
        Rect cursorRect = value.getCursorRect(C13537l.m30886m(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.m38449toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / ((float) 2)), cursorRect.getBottom());
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release  reason: not valid java name */
    public final long m33846getHandlePositiontuRUvjQ$foundation_release(boolean z) {
        int i;
        TextLayoutResultProxy textLayoutResultProxy;
        long r0 = getValue$foundation_release().m38194getSelectiond9O1mEE();
        if (z) {
            i = TextRange.m37975getStartimpl(r0);
        } else {
            i = TextRange.m37970getEndimpl(r0);
        }
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textLayoutResultProxy = textFieldState.getLayoutResult();
        } else {
            textLayoutResultProxy = null;
        }
        C12775o.m28636f(textLayoutResultProxy);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultProxy.getValue(), this.offsetMapping.originalToTransformed(i), z, TextRange.m37974getReversedimpl(getValue$foundation_release().m38194getSelectiond9O1mEE()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final Function1<TextFieldValue, C11921v> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final TextFieldState getState$foundation_release() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation_release(boolean z) {
        return new TextFieldSelectionManager$handleDragObserver$1(this, z);
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbarStatus textToolbarStatus;
        TextToolbar textToolbar2;
        TextToolbar textToolbar3 = this.textToolbar;
        if (textToolbar3 != null) {
            textToolbarStatus = textToolbar3.getStatus();
        } else {
            textToolbarStatus = null;
        }
        if (textToolbarStatus == TextToolbarStatus.Shown && (textToolbar2 = this.textToolbar) != null) {
            textToolbar2.hide();
        }
    }

    public final boolean isTextChanged$foundation_release() {
        return !C12775o.m28634d(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager2 = this.clipboardManager;
        if (clipboardManager2 != null && (text = clipboardManager2.getText()) != null) {
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int r2 = TextRange.m37973getMinimpl(getValue$foundation_release().m38194getSelectiond9O1mEE()) + text.length();
            this.onValueChange.invoke(m33839createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(r2, r2)));
            setHandleState(HandleState.None);
            UndoManager undoManager2 = this.undoManager;
            if (undoManager2 != null) {
                undoManager2.forceNextSnapshot();
            }
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue r0 = m33839createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(r0);
        this.oldValue = TextFieldValue.m38189copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, r0.m38194getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(true);
        }
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager2) {
        this.clipboardManager = clipboardManager2;
    }

    public final void setEditable(boolean z) {
        this.editable$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(FocusRequester focusRequester2) {
        this.focusRequester = focusRequester2;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping2) {
        C12775o.m28639i(offsetMapping2, "<set-?>");
        this.offsetMapping = offsetMapping2;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.onValueChange = function1;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar2) {
        this.textToolbar = textToolbar2;
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "<set-?>");
        this.value$delegate.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation2) {
        C12775o.m28639i(visualTransformation2, "<set-?>");
        this.visualTransformation = visualTransformation2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showSelectionToolbar$foundation_release() {
        /*
            r9 = this;
            androidx.compose.ui.text.input.VisualTransformation r0 = r9.visualTransformation
            boolean r0 = r0 instanceof androidx.compose.p002ui.text.input.PasswordVisualTransformation
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            long r1 = r1.m38194getSelectiond9O1mEE()
            boolean r1 = androidx.compose.p002ui.text.TextRange.m37969getCollapsedimpl(r1)
            r2 = 0
            if (r1 != 0) goto L_0x001c
            if (r0 != 0) goto L_0x001c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1 r1 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            r1.<init>(r9)
            r5 = r1
            goto L_0x001d
        L_0x001c:
            r5 = r2
        L_0x001d:
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            long r3 = r1.m38194getSelectiond9O1mEE()
            boolean r1 = androidx.compose.p002ui.text.TextRange.m37969getCollapsedimpl(r3)
            if (r1 != 0) goto L_0x003a
            boolean r1 = r9.getEditable()
            if (r1 == 0) goto L_0x003a
            if (r0 != 0) goto L_0x003a
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            r0.<init>(r9)
            r7 = r0
            goto L_0x003b
        L_0x003a:
            r7 = r2
        L_0x003b:
            boolean r0 = r9.getEditable()
            if (r0 == 0) goto L_0x0057
            androidx.compose.ui.platform.ClipboardManager r0 = r9.clipboardManager
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.hasText()
            r3 = 1
            if (r0 != r3) goto L_0x004e
            r1 = r3
        L_0x004e:
            if (r1 == 0) goto L_0x0057
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
            r0.<init>(r9)
            r6 = r0
            goto L_0x0058
        L_0x0057:
            r6 = r2
        L_0x0058:
            androidx.compose.ui.text.input.TextFieldValue r0 = r9.getValue$foundation_release()
            long r0 = r0.m38194getSelectiond9O1mEE()
            int r0 = androidx.compose.p002ui.text.TextRange.m37971getLengthimpl(r0)
            androidx.compose.ui.text.input.TextFieldValue r1 = r9.getValue$foundation_release()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            if (r0 == r1) goto L_0x0077
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1 r2 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            r2.<init>(r9)
        L_0x0077:
            r8 = r2
            androidx.compose.ui.platform.TextToolbar r3 = r9.textToolbar
            if (r3 == 0) goto L_0x0083
            androidx.compose.ui.geometry.Rect r4 = r9.getContentRect()
            r3.showMenu(r4, r5, r6, r7, r8)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar$foundation_release():void");
    }

    public TextFieldSelectionManager(UndoManager undoManager2) {
        this.undoManager = undoManager2;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        this.editable$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m35438getZeroF1C5BW0();
        this.dragTotalDistance = companion.m35438getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.oldValue = new TextFieldValue((String) null, 0, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextFieldSelectionManager$touchSelectionObserver$1(this);
        this.mouseSelectionObserver = new TextFieldSelectionManager$mouseSelectionObserver$1(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager2);
    }
}
