package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.input.pointer.PointerIcon;
import androidx.compose.p002ui.input.pointer.PointerIconService;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$pointerIconService$1 implements PointerIconService {
    final /* synthetic */ AndroidComposeView this$0;

    AndroidComposeView$pointerIconService$1(AndroidComposeView androidComposeView) {
        this.this$0 = androidComposeView;
    }

    public PointerIcon getCurrent() {
        PointerIcon access$getDesiredPointerIcon$p = this.this$0.desiredPointerIcon;
        if (access$getDesiredPointerIcon$p == null) {
            return PointerIcon.Companion.getDefault();
        }
        return access$getDesiredPointerIcon$p;
    }

    public void setCurrent(PointerIcon pointerIcon) {
        C12775o.m28639i(pointerIcon, "value");
        this.this$0.desiredPointerIcon = pointerIcon;
    }
}
