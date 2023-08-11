package androidx.compose.p002ui.node;

import android.view.KeyEvent;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.semantics.SemanticsOwner;
import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.input.TextInputForTests;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.p002ui.unit.Density;

/* renamed from: androidx.compose.ui.node.RootForTest */
/* compiled from: RootForTest.kt */
public interface RootForTest {
    Density getDensity();

    SemanticsOwner getSemanticsOwner();

    @ExperimentalTextApi
    TextInputForTests getTextInputForTests() {
        return null;
    }

    TextInputService getTextInputService();

    /* renamed from: sendKeyEvent-ZmokQxo  reason: not valid java name */
    boolean m37680sendKeyEventZmokQxo(KeyEvent keyEvent);

    @ExperimentalTextApi
    static /* synthetic */ void getTextInputForTests$annotations() {
    }

    @ExperimentalComposeUiApi
    void measureAndLayoutForTest() {
    }
}
