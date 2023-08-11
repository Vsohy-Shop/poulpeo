package androidx.compose.p002ui.platform;

import android.view.MotionEvent;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$resendMotionEventRunnable$1 implements Runnable {
    final /* synthetic */ AndroidComposeView this$0;

    AndroidComposeView$resendMotionEventRunnable$1(AndroidComposeView androidComposeView) {
        this.this$0 = androidComposeView;
    }

    public void run() {
        boolean z;
        this.this$0.removeCallbacks(this);
        MotionEvent access$getPreviousMotionEvent$p = this.this$0.previousMotionEvent;
        if (access$getPreviousMotionEvent$p != null) {
            boolean z2 = false;
            if (access$getPreviousMotionEvent$p.getToolType(0) == 3) {
                z = true;
            } else {
                z = false;
            }
            int actionMasked = access$getPreviousMotionEvent$p.getActionMasked();
            if (!z ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                z2 = true;
            }
            if (z2) {
                int i = 7;
                if (!(actionMasked == 7 || actionMasked == 9)) {
                    i = 2;
                }
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.sendSimulatedEvent(access$getPreviousMotionEvent$p, i, androidComposeView.relayoutTime, false);
            }
        }
    }
}
