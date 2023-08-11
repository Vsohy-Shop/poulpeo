package androidx.compose.p002ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1 */
/* compiled from: AndroidComposeView.android.kt */
final class AndroidComposeView$resendMotionEventOnLayout$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    public final void invoke() {
        MotionEvent access$getPreviousMotionEvent$p = this.this$0.previousMotionEvent;
        if (access$getPreviousMotionEvent$p != null) {
            int actionMasked = access$getPreviousMotionEvent$p.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.this$0.relayoutTime = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.post(androidComposeView.resendMotionEventRunnable);
            }
        }
    }
}
