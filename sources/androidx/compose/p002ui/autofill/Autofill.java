package androidx.compose.p002ui.autofill;

import androidx.compose.p002ui.ExperimentalComposeUiApi;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.autofill.Autofill */
/* compiled from: Autofill.kt */
public interface Autofill {
    void cancelAutofillForNode(AutofillNode autofillNode);

    void requestAutofillForNode(AutofillNode autofillNode);
}
