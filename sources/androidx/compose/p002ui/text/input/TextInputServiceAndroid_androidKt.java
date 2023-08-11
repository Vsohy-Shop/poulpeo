package androidx.compose.p002ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.input.ImeAction;
import androidx.compose.p002ui.text.input.KeyboardCapitalization;
import androidx.compose.p002ui.text.input.KeyboardType;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt */
/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    public static final Executor asExecutor(Choreographer choreographer) {
        C12775o.m28639i(choreographer, "<this>");
        return new C1230d(choreographer);
    }

    /* access modifiers changed from: private */
    public static final void asExecutor$lambda$1(Choreographer choreographer, Runnable runnable) {
        C12775o.m28639i(choreographer, "$this_asExecutor");
        choreographer.postFrameCallback(new C1229c(runnable));
    }

    /* access modifiers changed from: private */
    public static final void asExecutor$lambda$1$lambda$0(Runnable runnable, long j) {
        runnable.run();
    }

    private static final boolean hasFlag(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        C12775o.m28639i(editorInfo, "<this>");
        C12775o.m28639i(imeOptions, "imeOptions");
        C12775o.m28639i(textFieldValue, "textFieldValue");
        int r0 = imeOptions.m38145getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i = 6;
        if (ImeAction.m38122equalsimpl0(r0, companion.m38134getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m38122equalsimpl0(r0, companion.m38138getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m38122equalsimpl0(r0, companion.m38136getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m38122equalsimpl0(r0, companion.m38137getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m38122equalsimpl0(r0, companion.m38139getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m38122equalsimpl0(r0, companion.m38140getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m38122equalsimpl0(r0, companion.m38141getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m38122equalsimpl0(r0, companion.m38135getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int r02 = imeOptions.m38146getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m38167equalsimpl0(r02, companion2.m38187getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38180getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38183getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38186getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38188getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38182getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38185getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38184getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m38167equalsimpl0(r02, companion2.m38181getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m38122equalsimpl0(imeOptions.m38145getImeActioneUduSuo(), companion.m38134getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int r03 = imeOptions.m38144getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m38152equalsimpl0(r03, companion3.m38160getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m38152equalsimpl0(r03, companion3.m38163getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m38152equalsimpl0(r03, companion3.m38162getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m37975getStartimpl(textFieldValue.m38194getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m37970getEndimpl(textFieldValue.m38194getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
