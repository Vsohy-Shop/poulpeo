package androidx.compose.p002ui.state;

/* renamed from: androidx.compose.ui.state.ToggleableStateKt */
/* compiled from: ToggleableState.kt */
public final class ToggleableStateKt {
    public static final ToggleableState ToggleableState(boolean z) {
        if (z) {
            return ToggleableState.On;
        }
        return ToggleableState.Off;
    }
}
