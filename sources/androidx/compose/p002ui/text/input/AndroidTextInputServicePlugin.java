package androidx.compose.p002ui.text.input;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p002ui.platform.AndroidComposeView_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.input.AndroidTextInputServicePlugin */
/* compiled from: AndroidTextInputServicePlugin.kt */
public final class AndroidTextInputServicePlugin implements PlatformTextInputPlugin<Adapter> {
    public static final AndroidTextInputServicePlugin INSTANCE = new AndroidTextInputServicePlugin();

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.text.input.AndroidTextInputServicePlugin$Adapter */
    /* compiled from: AndroidTextInputServicePlugin.kt */
    public static final class Adapter implements PlatformTextInputAdapter {
        public static final int $stable = 8;
        private final TextInputServiceAndroid androidService;
        private final TextInputService service;

        public Adapter(TextInputService textInputService, TextInputServiceAndroid textInputServiceAndroid) {
            C12775o.m28639i(textInputService, NotificationCompat.CATEGORY_SERVICE);
            C12775o.m28639i(textInputServiceAndroid, "androidService");
            this.service = textInputService;
            this.androidService = textInputServiceAndroid;
        }

        public InputConnection createInputConnection(EditorInfo editorInfo) {
            C12775o.m28639i(editorInfo, "outAttrs");
            return this.androidService.createInputConnection(editorInfo);
        }

        public TextInputForTests getInputForTests() {
            TextInputForTests textInputForTests;
            TextInputService textInputService = this.service;
            if (textInputService instanceof TextInputForTests) {
                textInputForTests = (TextInputForTests) textInputService;
            } else {
                textInputForTests = null;
            }
            if (textInputForTests != null) {
                return textInputForTests;
            }
            throw new IllegalStateException("Text input service wrapper not set up! Did you use ComposeTestRule?".toString());
        }

        public final TextInputService getService() {
            return this.service;
        }
    }

    private AndroidTextInputServicePlugin() {
    }

    public Adapter createAdapter(PlatformTextInput platformTextInput, View view) {
        C12775o.m28639i(platformTextInput, "platformTextInput");
        C12775o.m28639i(view, "view");
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(view, platformTextInput);
        return new Adapter(AndroidComposeView_androidKt.getTextInputServiceFactory().invoke(textInputServiceAndroid), textInputServiceAndroid);
    }
}
