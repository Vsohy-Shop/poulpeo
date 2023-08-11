package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.input.InputMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$_inputModeManager$1 extends C12777p implements Function1<InputMode, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m37706invokeiuPiT84(((InputMode) obj).m36420unboximpl());
    }

    /* renamed from: invoke-iuPiT84  reason: not valid java name */
    public final Boolean m37706invokeiuPiT84(int i) {
        boolean z;
        InputMode.Companion companion = InputMode.Companion;
        if (InputMode.m36417equalsimpl0(i, companion.m36422getTouchaOaMEAU())) {
            z = this.this$0.isInTouchMode();
        } else if (!InputMode.m36417equalsimpl0(i, companion.m36421getKeyboardaOaMEAU())) {
            z = false;
        } else if (this.this$0.isInTouchMode()) {
            z = this.this$0.requestFocusFromTouch();
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
