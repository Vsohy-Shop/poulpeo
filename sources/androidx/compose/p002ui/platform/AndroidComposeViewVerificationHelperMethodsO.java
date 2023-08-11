package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsO */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeViewVerificationHelperMethodsO {
    public static final AndroidComposeViewVerificationHelperMethodsO INSTANCE = new AndroidComposeViewVerificationHelperMethodsO();

    private AndroidComposeViewVerificationHelperMethodsO() {
    }

    @RequiresApi(26)
    @DoNotInline
    public final void focusable(View view, int i, boolean z) {
        C12775o.m28639i(view, "view");
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
