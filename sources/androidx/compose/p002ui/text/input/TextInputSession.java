package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,289:1\n153#1,5:290\n153#1,5:295\n153#1,5:300\n153#1,5:305\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n172#1:290,5\n194#1:295,5\n212#1:300,5\n227#1:305,5\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.TextInputSession */
/* compiled from: TextInputService.kt */
public final class TextInputSession {
    public static final int $stable = 8;
    private final PlatformTextInputService platformTextInputService;
    private final TextInputService textInputService;

    public TextInputSession(TextInputService textInputService2, PlatformTextInputService platformTextInputService2) {
        C12775o.m28639i(textInputService2, "textInputService");
        C12775o.m28639i(platformTextInputService2, "platformTextInputService");
        this.textInputService = textInputService2;
        this.platformTextInputService = platformTextInputService2;
    }

    private final boolean ensureOpenSession(C13074a<C11921v> aVar) {
        boolean isOpen = isOpen();
        if (isOpen) {
            aVar.invoke();
        }
        return isOpen;
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean isOpen() {
        return C12775o.m28634d(this.textInputService.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(Rect rect) {
        C12775o.m28639i(rect, "rect");
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.notifyFocusedRect(rect);
        }
        return isOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        C12775o.m28639i(textFieldValue2, "newValue");
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateState(textFieldValue, textFieldValue2);
        }
        return isOpen;
    }
}
