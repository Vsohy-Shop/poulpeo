package androidx.compose.p002ui.focus;

/* renamed from: androidx.compose.ui.focus.FocusManager */
/* compiled from: FocusManager.kt */
public interface FocusManager {

    /* renamed from: androidx.compose.ui.focus.FocusManager$DefaultImpls */
    /* compiled from: FocusManager.kt */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            focusManager.clearFocus(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
    }

    void clearFocus(boolean z);

    /* renamed from: moveFocus-3ESFkO8  reason: not valid java name */
    boolean m35362moveFocus3ESFkO8(int i);
}
