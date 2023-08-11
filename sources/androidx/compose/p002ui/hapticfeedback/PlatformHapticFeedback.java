package androidx.compose.p002ui.hapticfeedback;

import android.view.View;
import androidx.compose.p002ui.hapticfeedback.HapticFeedbackType;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.hapticfeedback.PlatformHapticFeedback */
/* compiled from: PlatformHapticFeedback.android.kt */
public final class PlatformHapticFeedback implements HapticFeedback {
    private final View view;

    public PlatformHapticFeedback(View view2) {
        C12775o.m28639i(view2, "view");
        this.view = view2;
    }

    /* renamed from: performHapticFeedback-CdsT49E  reason: not valid java name */
    public void m36411performHapticFeedbackCdsT49E(int i) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m36405equalsimpl0(i, companion.m36409getLongPress5zf0vsI())) {
            this.view.performHapticFeedback(0);
        } else if (HapticFeedbackType.m36405equalsimpl0(i, companion.m36410getTextHandleMove5zf0vsI())) {
            this.view.performHapticFeedback(9);
        }
    }
}
