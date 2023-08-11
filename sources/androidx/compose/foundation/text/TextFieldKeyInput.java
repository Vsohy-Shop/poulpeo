package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.p002ui.input.key.KeyEventType;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.input.CommitTextCommand;
import androidx.compose.p002ui.text.input.EditCommand;
import androidx.compose.p002ui.text.input.EditProcessor;
import androidx.compose.p002ui.text.input.FinishComposingTextCommand;
import androidx.compose.p002ui.text.input.OffsetMapping;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: TextFieldKeyInput.kt */
public final class TextFieldKeyInput {
    private final boolean editable;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    /* access modifiers changed from: private */
    public final Function1<TextFieldValue, C11921v> onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final TextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    public TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping2, UndoManager undoManager2, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping2, Function1<? super TextFieldValue, C11921v> function1) {
        C12775o.m28639i(textFieldState, "state");
        C12775o.m28639i(textFieldSelectionManager, "selectionManager");
        C12775o.m28639i(textFieldValue, "value");
        C12775o.m28639i(textPreparedSelectionState, "preparedSelectionState");
        C12775o.m28639i(offsetMapping2, "offsetMapping");
        C12775o.m28639i(deadKeyCombiner, "keyCombiner");
        C12775o.m28639i(keyMapping2, "keyMapping");
        C12775o.m28639i(function1, "onValueChange");
        this.state = textFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping2;
        this.undoManager = undoManager2;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping2;
        this.onValueChange = function1;
    }

    /* access modifiers changed from: private */
    public final void apply(List<? extends EditCommand> list) {
        EditProcessor processor = this.state.getProcessor();
        List D0 = C12686e0.m28207D0(list);
        D0.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(D0));
    }

    private final void commandExecutionContext(Function1<? super TextFieldPreparedSelection, C11921v> function1) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        function1.invoke(textFieldPreparedSelection);
        if (!TextRange.m37968equalsimpl0(textFieldPreparedSelection.m33752getSelectiond9O1mEE(), this.value.m38194getSelectiond9O1mEE()) || !C12775o.m28634d(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            this.onValueChange.invoke(textFieldPreparedSelection.getValue());
        }
    }

    /* renamed from: typedCommand-ZmokQxo  reason: not valid java name */
    private final CommitTextCommand m33720typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer r3;
        if (!TextFieldKeyInput_androidKt.m33723isTypedEventZmokQxo(keyEvent) || (r3 = this.keyCombiner.m33654consumeZmokQxo(keyEvent)) == null) {
            return null;
        }
        String sb = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), r3.intValue()).toString();
        C12775o.m28638h(sb, "StringBuilder().appendCo…ntX(codePoint).toString()");
        return new CommitTextCommand(sb, 1);
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final TextFieldState getState() {
        return this.state;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo  reason: not valid java name */
    public final boolean m33721processZmokQxo(KeyEvent keyEvent) {
        KeyCommand r5;
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        CommitTextCommand r0 = m33720typedCommandZmokQxo(keyEvent);
        if (r0 != null) {
            if (!this.editable) {
                return false;
            }
            apply((EditCommand) r0);
            this.preparedSelectionState.resetCachedX();
            return true;
        } else if (!KeyEventType.m37019equalsimpl0(KeyEvent_androidKt.m37027getTypeZmokQxo(keyEvent), KeyEventType.Companion.m37023getKeyDownCS__XNY()) || (r5 = this.keyMapping.m33657mapZmokQxo(keyEvent)) == null || (r5.getEditsText() && !this.editable)) {
            return false;
        } else {
            C12755d0 d0Var = new C12755d0();
            d0Var.f20407b = true;
            commandExecutionContext(new TextFieldKeyInput$process$2(r5, this, d0Var));
            UndoManager undoManager2 = this.undoManager;
            if (undoManager2 != null) {
                undoManager2.forceNextSnapshot();
            }
            return d0Var.f20407b;
        }
    }

    /* access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        apply((List<? extends EditCommand>) C12723v.m28509d(editCommand));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextFieldKeyInput(androidx.compose.foundation.text.TextFieldState r22, androidx.compose.foundation.text.selection.TextFieldSelectionManager r23, androidx.compose.p002ui.text.input.TextFieldValue r24, boolean r25, boolean r26, androidx.compose.foundation.text.selection.TextPreparedSelectionState r27, androidx.compose.p002ui.text.input.OffsetMapping r28, androidx.compose.foundation.text.UndoManager r29, androidx.compose.foundation.text.DeadKeyCombiner r30, androidx.compose.foundation.text.KeyMapping r31, kotlin.jvm.functions.Function1 r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r21 = this;
            r0 = r33
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0014
            androidx.compose.ui.text.input.TextFieldValue r1 = new androidx.compose.ui.text.input.TextFieldValue
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r2 = r1
            r2.<init>((java.lang.String) r3, (long) r4, (androidx.compose.p002ui.text.TextRange) r6, (int) r7, (kotlin.jvm.internal.DefaultConstructorMarker) r8)
            r12 = r1
            goto L_0x0016
        L_0x0014:
            r12 = r24
        L_0x0016:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            r1 = 1
            r13 = r1
            goto L_0x001f
        L_0x001d:
            r13 = r25
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0026
            r1 = 0
            r14 = r1
            goto L_0x0028
        L_0x0026:
            r14 = r26
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0035
            androidx.compose.ui.text.input.OffsetMapping$Companion r1 = androidx.compose.p002ui.text.input.OffsetMapping.Companion
            androidx.compose.ui.text.input.OffsetMapping r1 = r1.getIdentity()
            r16 = r1
            goto L_0x0037
        L_0x0035:
            r16 = r28
        L_0x0037:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 0
            r17 = r1
            goto L_0x0041
        L_0x003f:
            r17 = r29
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004c
            androidx.compose.foundation.text.KeyMapping r1 = androidx.compose.foundation.text.KeyMapping_androidKt.getPlatformDefaultKeyMapping()
            r19 = r1
            goto L_0x004e
        L_0x004c:
            r19 = r31
        L_0x004e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0057
            androidx.compose.foundation.text.TextFieldKeyInput$1 r0 = androidx.compose.foundation.text.TextFieldKeyInput.C06291.INSTANCE
            r20 = r0
            goto L_0x0059
        L_0x0057:
            r20 = r32
        L_0x0059:
            r9 = r21
            r10 = r22
            r11 = r23
            r15 = r27
            r18 = r30
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldKeyInput.<init>(androidx.compose.foundation.text.TextFieldState, androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.ui.text.input.TextFieldValue, boolean, boolean, androidx.compose.foundation.text.selection.TextPreparedSelectionState, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.foundation.text.UndoManager, androidx.compose.foundation.text.DeadKeyCombiner, androidx.compose.foundation.text.KeyMapping, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
