package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.input.key.KeyEvent;
import androidx.compose.p002ui.input.key.KeyEventType;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$keyInputModifier$1 extends C12777p implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m37707invokeZmokQxo(((KeyEvent) obj).m37015unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m37707invokeZmokQxo(android.view.KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "it");
        FocusDirection r0 = this.this$0.m37701getFocusDirectionP8AzH3I(keyEvent);
        if (r0 == null || !KeyEventType.m37019equalsimpl0(KeyEvent_androidKt.m37027getTypeZmokQxo(keyEvent), KeyEventType.Companion.m37023getKeyDownCS__XNY())) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(this.this$0.getFocusOwner().m35362moveFocus3ESFkO8(r0.m35347unboximpl()));
    }
}
