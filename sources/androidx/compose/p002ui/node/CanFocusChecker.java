package androidx.compose.p002ui.node;

import androidx.compose.p002ui.focus.FocusProperties;

/* renamed from: androidx.compose.ui.node.CanFocusChecker */
/* compiled from: NodeKind.kt */
final class CanFocusChecker implements FocusProperties {
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final boolean isCanFocusSet() {
        if (canFocusValue != null) {
            return true;
        }
        return false;
    }

    public final void reset() {
        canFocusValue = null;
    }

    public void setCanFocus(boolean z) {
        canFocusValue = Boolean.valueOf(z);
    }
}
