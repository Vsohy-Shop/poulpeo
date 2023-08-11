package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.input.pointer.AndroidPointerIcon;
import androidx.compose.p002ui.input.pointer.AndroidPointerIconType;
import androidx.compose.p002ui.input.pointer.PointerIcon;
import kotlin.jvm.internal.C12775o;

@RequiresApi(24)
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    @RequiresApi(24)
    @DoNotInline
    public final void setPointerIcon(View view, PointerIcon pointerIcon) {
        android.view.PointerIcon pointerIcon2;
        C12775o.m28639i(view, "view");
        if (pointerIcon instanceof AndroidPointerIcon) {
            pointerIcon2 = ((AndroidPointerIcon) pointerIcon).getPointerIcon();
        } else if (pointerIcon instanceof AndroidPointerIconType) {
            pointerIcon2 = android.view.PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIconType) pointerIcon).getType());
            C12775o.m28638h(pointerIcon2, "getSystemIcon(view.context, icon.type)");
        } else {
            pointerIcon2 = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
            C12775o.m28638h(pointerIcon2, "getSystemIcon(\n         …DEFAULT\n                )");
        }
        if (!C12775o.m28634d(view.getPointerIcon(), pointerIcon2)) {
            view.setPointerIcon(pointerIcon2);
        }
    }
}
