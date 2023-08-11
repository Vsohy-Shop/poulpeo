package androidx.compose.p002ui.text.input;

import androidx.compose.animation.core.C0344a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.TextInputService */
/* compiled from: TextInputService.kt */
public class TextInputService {
    public static final int $stable = 8;
    private final AtomicReference<TextInputSession> _currentInputSession = new AtomicReference<>((Object) null);
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(PlatformTextInputService platformTextInputService2) {
        C12775o.m28639i(platformTextInputService2, "platformTextInputService");
        this.platformTextInputService = platformTextInputService2;
    }

    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    public final void showSoftwareKeyboard() {
        if (this._currentInputSession.get() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    public TextInputSession startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, C11921v> function1, Function1<? super ImeAction, C11921v> function12) {
        C12775o.m28639i(textFieldValue, "value");
        C12775o.m28639i(imeOptions, "imeOptions");
        C12775o.m28639i(function1, "onEditCommand");
        C12775o.m28639i(function12, "onImeActionPerformed");
        this.platformTextInputService.startInput(textFieldValue, imeOptions, function1, function12);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(TextInputSession textInputSession) {
        C12775o.m28639i(textInputSession, "session");
        if (C0344a.m496a(this._currentInputSession, textInputSession, (Object) null)) {
            this.platformTextInputService.stopInput();
        }
    }
}
