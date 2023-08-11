package androidx.compose.p002ui.text.input;

import android.view.KeyEvent;
import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1 */
/* compiled from: TextInputServiceAndroid.android.kt */
public final class TextInputServiceAndroid$createInputConnection$1 implements InputEventCallback2 {
    final /* synthetic */ TextInputServiceAndroid this$0;

    TextInputServiceAndroid$createInputConnection$1(TextInputServiceAndroid textInputServiceAndroid) {
        this.this$0 = textInputServiceAndroid;
    }

    public void onConnectionClosed(RecordingInputConnection recordingInputConnection) {
        C12775o.m28639i(recordingInputConnection, "ic");
        int size = this.this$0.ics.size();
        for (int i = 0; i < size; i++) {
            if (C12775o.m28634d(((WeakReference) this.this$0.ics.get(i)).get(), recordingInputConnection)) {
                this.this$0.ics.remove(i);
                return;
            }
        }
    }

    public void onEditCommands(List<? extends EditCommand> list) {
        C12775o.m28639i(list, "editCommands");
        this.this$0.onEditCommand.invoke(list);
    }

    /* renamed from: onImeAction-KlQnJC8  reason: not valid java name */
    public void m38195onImeActionKlQnJC8(int i) {
        this.this$0.onImeActionPerformed.invoke(ImeAction.m38119boximpl(i));
    }

    public void onKeyEvent(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        this.this$0.getBaseInputConnection().sendKeyEvent(keyEvent);
    }
}
