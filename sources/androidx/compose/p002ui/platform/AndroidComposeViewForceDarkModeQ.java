package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewForceDarkModeQ */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeViewForceDarkModeQ {
    public static final AndroidComposeViewForceDarkModeQ INSTANCE = new AndroidComposeViewForceDarkModeQ();

    private AndroidComposeViewForceDarkModeQ() {
    }

    @RequiresApi(29)
    @DoNotInline
    public final void disallowForceDark(View view) {
        C12775o.m28639i(view, "view");
        view.setForceDarkAllowed(false);
    }
}
