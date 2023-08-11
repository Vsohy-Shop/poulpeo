package androidx.compose.p002ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.p002ui.text.TextRange;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,403:1\n80#1,5:404\n80#1,5:409\n80#1,5:414\n80#1,5:419\n80#1,5:424\n80#1,5:429\n80#1,5:434\n80#1,5:439\n80#1,5:444\n80#1,5:449\n80#1,5:454\n80#1,5:459\n80#1,5:464\n80#1,5:469\n80#1,5:474\n80#1,5:479\n80#1,5:484\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n139#1:404,5\n175#1:409,5\n180#1:414,5\n186#1:419,5\n194#1:424,5\n205#1:429,5\n211#1:434,5\n217#1:439,5\n223#1:444,5\n259#1:449,5\n295#1:454,5\n321#1:459,5\n344#1:464,5\n354#1:469,5\n366#1:474,5\n386#1:479,5\n395#1:484,5\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.RecordingInputConnection */
/* compiled from: RecordingInputConnection.android.kt */
public final class RecordingInputConnection implements InputConnection {
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<EditCommand> editCommands = new ArrayList();
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive = true;
    private TextFieldValue mTextFieldValue;

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z) {
        C12775o.m28639i(textFieldValue, "initState");
        C12775o.m28639i(inputEventCallback2, "eventCallback");
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && (!this.editCommands.isEmpty())) {
            this.eventCallback.onEditCommands(C12686e0.m28207D0(this.editCommands));
            this.editCommands.clear();
        }
        if (this.batchDepth > 0) {
            return true;
        }
        return false;
    }

    private final boolean ensureActive(C13074a<C11921v> aVar) {
        boolean z = this.isActive;
        if (z) {
            aVar.invoke();
        }
        return z;
    }

    private final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        if (z) {
            return beginBatchEditInternal();
        }
        return z;
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C12775o.m28639i(inputContentInfo, "inputContentInfo");
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        if (z) {
            return this.autoCorrect;
        }
        return z;
    }

    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i, i2));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i, i2));
        return true;
    }

    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m37973getMinimpl(this.mTextFieldValue.m38194getSelectiond9O1mEE()), i);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.extractedTextMonitorMode = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.currentExtractedTextRequestToken = i2;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    public Handler getHandler() {
        return null;
    }

    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    public CharSequence getSelectedText(int i) {
        if (TextRange.m37969getCollapsedimpl(this.mTextFieldValue.m38194getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    public CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, i).toString();
    }

    public CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, i).toString();
    }

    public boolean performContextMenuAction(int i) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case 16908320:
                    sendSynthesizedKeyEvent(277);
                    break;
                case 16908321:
                    sendSynthesizedKeyEvent(278);
                    break;
                case 16908322:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    public boolean performEditorAction(int i) {
        int i2;
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = ImeAction.Companion.m38136getGoeUduSuo();
                    break;
                case 3:
                    i2 = ImeAction.Companion.m38140getSearcheUduSuo();
                    break;
                case 4:
                    i2 = ImeAction.Companion.m38141getSendeUduSuo();
                    break;
                case 5:
                    i2 = ImeAction.Companion.m38137getNexteUduSuo();
                    break;
                case 6:
                    i2 = ImeAction.Companion.m38135getDoneeUduSuo();
                    break;
                case 7:
                    i2 = ImeAction.Companion.m38139getPreviouseUduSuo();
                    break;
                default:
                    Log.w(RecordingInputConnection_androidKt.TAG, "IME sends unsupported Editor Action: " + i);
                    i2 = ImeAction.Companion.m38134getDefaulteUduSuo();
                    break;
            }
        } else {
            i2 = ImeAction.Companion.m38134getDefaulteUduSuo();
        }
        this.eventCallback.m38148onImeActionKlQnJC8(i2);
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        Log.w(RecordingInputConnection_androidKt.TAG, "requestCursorUpdates is not supported");
        return false;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        this.eventCallback.onKeyEvent(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(TextFieldValue textFieldValue) {
        C12775o.m28639i(textFieldValue, "value");
        this.mTextFieldValue = textFieldValue;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i, i2));
        return true;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        int i;
        C12775o.m28639i(textFieldValue, "state");
        C12775o.m28639i(inputMethodManager, "inputMethodManager");
        if (this.isActive) {
            setMTextFieldValue$ui_release(textFieldValue);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue));
            }
            TextRange r0 = textFieldValue.m38193getCompositionMzsxiRA();
            int i2 = -1;
            if (r0 != null) {
                i = TextRange.m37973getMinimpl(r0.m37979unboximpl());
            } else {
                i = -1;
            }
            TextRange r2 = textFieldValue.m38193getCompositionMzsxiRA();
            if (r2 != null) {
                i2 = TextRange.m37972getMaximpl(r2.m37979unboximpl());
            }
            inputMethodManager.updateSelection(TextRange.m37973getMinimpl(textFieldValue.m38194getSelectiond9O1mEE()), TextRange.m37972getMaximpl(textFieldValue.m38194getSelectiond9O1mEE()), i, i2);
        }
    }

    private final void logDebug(String str) {
    }
}
