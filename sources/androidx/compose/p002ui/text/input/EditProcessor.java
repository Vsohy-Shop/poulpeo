package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.AnnotatedStringKt;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n33#2,6:174\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:174,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.EditProcessor */
/* compiled from: EditProcessor.kt */
public final class EditProcessor {
    public static final int $stable = 8;
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m38194getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m37980getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m38116getCompositionMzsxiRA$ui_text_release() + ", selection=" + TextRange.m37978toStringimpl(this.mBuffer.m38117getSelectiond9O1mEE$ui_text_release()) + "):");
        C12775o.m28638h(sb, "append(value)");
        sb.append(10);
        C12775o.m28638h(sb, "append('\\n')");
        Appendable unused = C12686e0.m28227f0(list, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new EditProcessor$generateBatchErrorMessage$1$1(editCommand, this), 60, (Object) null);
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        } else if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        } else if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        } else {
            if (editCommand instanceof DeleteSurroundingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof SetSelectionCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof FinishComposingTextCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof BackspaceCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof MoveCursorCommand) {
                return editCommand.toString();
            }
            if (editCommand instanceof DeleteAllCommand) {
                return editCommand.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown EditCommand: ");
            String a = C12764h0.m28586b(editCommand.getClass()).mo50651a();
            if (a == null) {
                a = "{anonymous EditCommand}";
            }
            sb3.append(a);
            return sb3.toString();
        }
    }

    public final TextFieldValue apply(List<? extends EditCommand> list) {
        EditCommand editCommand;
        Exception e;
        C12775o.m28639i(list, "editCommands");
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                editCommand = (EditCommand) list.get(i);
                try {
                    editCommand.applyTo(this.mBuffer);
                    i++;
                    EditCommand editCommand2 = editCommand;
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e);
                }
            }
            TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), this.mBuffer.m38117getSelectiond9O1mEE$ui_text_release(), this.mBuffer.m38116getCompositionMzsxiRA$ui_text_release(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            editCommand = null;
            e = e3;
            throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e);
        }
    }

    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final void reset(TextFieldValue textFieldValue, TextInputSession textInputSession) {
        C12775o.m28639i(textFieldValue, "value");
        boolean z = true;
        boolean z2 = !C12775o.m28634d(textFieldValue.m38193getCompositionMzsxiRA(), this.mBuffer.m38116getCompositionMzsxiRA$ui_text_release());
        boolean z3 = false;
        if (!C12775o.m28634d(this.mBufferState.getAnnotatedString(), textFieldValue.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m38194getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
        } else if (!TextRange.m37968equalsimpl0(this.mBufferState.m38194getSelectiond9O1mEE(), textFieldValue.m38194getSelectiond9O1mEE())) {
            this.mBuffer.setSelection$ui_text_release(TextRange.m37973getMinimpl(textFieldValue.m38194getSelectiond9O1mEE()), TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE()));
            z3 = true;
            z = false;
        } else {
            z = false;
        }
        if (textFieldValue.m38193getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m37969getCollapsedimpl(textFieldValue.m38193getCompositionMzsxiRA().m37979unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m37973getMinimpl(textFieldValue.m38193getCompositionMzsxiRA().m37979unboximpl()), TextRange.m37972getMaximpl(textFieldValue.m38193getCompositionMzsxiRA().m37979unboximpl()));
        }
        if (z || (!z3 && z2)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m38189copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
