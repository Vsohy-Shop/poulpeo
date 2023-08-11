package androidx.compose.p002ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.autofill.AutofillCallback */
/* compiled from: AutofillCallback.android.kt */
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    public void onAutofillEvent(View view, int i, int i2) {
        String str;
        C12775o.m28639i(view, "view");
        super.onAutofillEvent(view, i, i2);
        if (i2 == 1) {
            str = "Autofill popup was shown.";
        } else if (i2 == 2) {
            str = "Autofill popup was hidden.";
        } else if (i2 != 3) {
            str = "Unknown status event.";
        } else {
            str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        }
        Log.d("Autofill Status", str);
    }

    @ExperimentalComposeUiApi
    @DoNotInline
    public final void register(AndroidAutofill androidAutofill) {
        C12775o.m28639i(androidAutofill, "autofill");
        androidAutofill.getAutofillManager().registerCallback(this);
    }

    @ExperimentalComposeUiApi
    @DoNotInline
    public final void unregister(AndroidAutofill androidAutofill) {
        C12775o.m28639i(androidAutofill, "autofill");
        androidAutofill.getAutofillManager().unregisterCallback(this);
    }
}
