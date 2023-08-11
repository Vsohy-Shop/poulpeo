package androidx.compose.p002ui.text.input;

import android.view.KeyEvent;
import java.util.List;

/* renamed from: androidx.compose.ui.text.input.InputEventCallback2 */
/* compiled from: InputEventCallback2.android.kt */
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection recordingInputConnection);

    void onEditCommands(List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8  reason: not valid java name */
    void m38148onImeActionKlQnJC8(int i);

    void onKeyEvent(KeyEvent keyEvent);
}
