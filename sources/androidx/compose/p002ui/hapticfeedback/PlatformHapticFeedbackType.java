package androidx.compose.p002ui.hapticfeedback;

/* renamed from: androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType */
/* compiled from: PlatformHapticFeedback.android.kt */
public final class PlatformHapticFeedbackType {
    public static final PlatformHapticFeedbackType INSTANCE = new PlatformHapticFeedbackType();
    private static final int LongPress = HapticFeedbackType.m36403constructorimpl(0);
    private static final int TextHandleMove = HapticFeedbackType.m36403constructorimpl(9);

    private PlatformHapticFeedbackType() {
    }

    /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
    public final int m36412getLongPress5zf0vsI() {
        return LongPress;
    }

    /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
    public final int m36413getTextHandleMove5zf0vsI() {
        return TextHandleMove;
    }
}
