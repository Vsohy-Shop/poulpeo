package androidx.compose.p002ui.hapticfeedback;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.hapticfeedback.HapticFeedbackType */
/* compiled from: HapticFeedbackType.kt */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int value;

    /* renamed from: androidx.compose.ui.hapticfeedback.HapticFeedbackType$Companion */
    /* compiled from: HapticFeedbackType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getLongPress-5zf0vsI  reason: not valid java name */
        public final int m36409getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m36412getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI  reason: not valid java name */
        public final int m36410getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m36413getTextHandleMove5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return C12726w.m28527n(HapticFeedbackType.m36402boximpl(m36409getLongPress5zf0vsI()), HapticFeedbackType.m36402boximpl(m36410getTextHandleMove5zf0vsI()));
        }
    }

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m36402boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36404equalsimpl(int i, Object obj) {
        if ((obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).m36408unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36405equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36406hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36407toStringimpl(int i) {
        Companion companion = Companion;
        if (m36405equalsimpl0(i, companion.m36409getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m36405equalsimpl0(i, companion.m36410getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m36404equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36406hashCodeimpl(this.value);
    }

    public String toString() {
        return m36407toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36408unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36403constructorimpl(int i) {
        return i;
    }
}
