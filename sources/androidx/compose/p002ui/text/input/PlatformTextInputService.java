package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.geometry.Rect;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.text.input.PlatformTextInputService */
/* compiled from: TextInputService.kt */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    void notifyFocusedRect(Rect rect) {
        C12775o.m28639i(rect, "rect");
    }

    void showSoftwareKeyboard();

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super List<? extends EditCommand>, C11921v> function1, Function1<? super ImeAction, C11921v> function12);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);
}
