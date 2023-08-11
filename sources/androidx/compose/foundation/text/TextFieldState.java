package androidx.compose.foundation.text;

import androidx.compose.p002ui.focus.FocusManager;
import androidx.compose.p002ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.input.EditProcessor;
import androidx.compose.p002ui.text.input.ImeAction;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.TextInputSession;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1087:1\n154#2:1088\n76#3:1089\n102#3,2:1090\n76#3:1092\n102#3,2:1093\n76#3:1095\n102#3,2:1096\n76#3:1098\n102#3,2:1099\n76#3:1101\n102#3,2:1102\n76#3:1104\n102#3,2:1105\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n749#1:1088\n744#1:1089\n744#1:1090,2\n749#1:1092\n749#1:1093,2\n800#1:1095\n800#1:1096,2\n811#1:1098\n811#1:1099,2\n817#1:1101\n817#1:1102,2\n823#1:1104\n823#1:1105,2\n*E\n"})
/* compiled from: CoreTextField.kt */
public final class TextFieldState {
    private final MutableState handleState$delegate;
    private final MutableState hasFocus$delegate;
    private TextInputSession inputSession;
    private boolean isLayoutResultStale;
    /* access modifiers changed from: private */
    public final KeyboardActionRunner keyboardActionRunner;
    private LayoutCoordinates layoutCoordinates;
    private final MutableState<TextLayoutResultProxy> layoutResultState;
    private final MutableState minHeightForSingleLineField$delegate;
    private final Function1<ImeAction, C11921v> onImeActionPerformed;
    private final Function1<TextFieldValue, C11921v> onValueChange;
    /* access modifiers changed from: private */
    public Function1<? super TextFieldValue, C11921v> onValueChangeOriginal;
    private final EditProcessor processor = new EditProcessor();
    private final RecomposeScope recomposeScope;
    private final Paint selectionPaint;
    private final MutableState showCursorHandle$delegate;
    private boolean showFloatingToolbar;
    private final MutableState showSelectionHandleEnd$delegate;
    private final MutableState showSelectionHandleStart$delegate;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    public TextFieldState(TextDelegate textDelegate2, RecomposeScope recomposeScope2) {
        C12775o.m28639i(textDelegate2, "textDelegate");
        C12775o.m28639i(recomposeScope2, "recomposeScope");
        this.textDelegate = textDelegate2;
        this.recomposeScope = recomposeScope2;
        Boolean bool = Boolean.FALSE;
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C1232Dp.m38466boximpl(C1232Dp.m38468constructorimpl((float) 0)), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.handleState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.showSelectionHandleStart$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.showSelectionHandleEnd$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.isLayoutResultStale = true;
        this.keyboardActionRunner = new KeyboardActionRunner();
        this.onValueChangeOriginal = TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.onValueChange = new TextFieldState$onValueChange$1(this);
        this.onImeActionPerformed = new TextFieldState$onImeActionPerformed$1(this);
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM  reason: not valid java name */
    public final float m33732getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((C1232Dp) this.minHeightForSingleLineField$delegate.getValue()).m38482unboximpl();
    }

    public final Function1<ImeAction, C11921v> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final Function1<TextFieldValue, C11921v> getOnValueChange() {
        return this.onValueChange;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setHandleState(HandleState handleState) {
        C12775o.m28639i(handleState, "<set-?>");
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates2) {
        this.layoutCoordinates = layoutCoordinates2;
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4  reason: not valid java name */
    public final void m33733setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField$delegate.setValue(C1232Dp.m38466boximpl(f));
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar = z;
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(TextDelegate textDelegate2) {
        C12775o.m28639i(textDelegate2, "<set-?>");
        this.textDelegate = textDelegate2;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* renamed from: update-fnh65Uc  reason: not valid java name */
    public final void m33734updatefnh65Uc(AnnotatedString annotatedString, AnnotatedString annotatedString2, TextStyle textStyle, boolean z, Density density, FontFamily.Resolver resolver, Function1<? super TextFieldValue, C11921v> function1, KeyboardActions keyboardActions, FocusManager focusManager, long j) {
        AnnotatedString annotatedString3 = annotatedString;
        Function1<? super TextFieldValue, C11921v> function12 = function1;
        KeyboardActions keyboardActions2 = keyboardActions;
        FocusManager focusManager2 = focusManager;
        C12775o.m28639i(annotatedString3, "untransformedText");
        AnnotatedString annotatedString4 = annotatedString2;
        C12775o.m28639i(annotatedString4, "visualText");
        TextStyle textStyle2 = textStyle;
        C12775o.m28639i(textStyle2, "textStyle");
        Density density2 = density;
        C12775o.m28639i(density2, "density");
        FontFamily.Resolver resolver2 = resolver;
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        C12775o.m28639i(function12, "onValueChange");
        C12775o.m28639i(keyboardActions2, "keyboardActions");
        C12775o.m28639i(focusManager2, "focusManager");
        this.onValueChangeOriginal = function12;
        this.selectionPaint.m35934setColor8_81llA(j);
        KeyboardActionRunner keyboardActionRunner2 = this.keyboardActionRunner;
        keyboardActionRunner2.setKeyboardActions(keyboardActions2);
        keyboardActionRunner2.setFocusManager(focusManager2);
        keyboardActionRunner2.setInputSession(this.inputSession);
        this.untransformedText = annotatedString3;
        TextDelegate r1 = CoreTextKt.m33650updateTextDelegaterm0N8CA$default(this.textDelegate, annotatedString4, textStyle2, density2, resolver2, z, 0, 0, 0, C12726w.m28524k(), 448, (Object) null);
        if (this.textDelegate != r1) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = r1;
    }
}
