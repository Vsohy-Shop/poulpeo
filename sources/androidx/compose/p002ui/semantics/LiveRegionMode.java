package androidx.compose.p002ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.semantics.LiveRegionMode */
/* compiled from: SemanticsProperties.kt */
public final class LiveRegionMode {
    /* access modifiers changed from: private */
    public static final int Assertive = m37799constructorimpl(1);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Polite = m37799constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.semantics.LiveRegionMode$Companion */
    /* compiled from: SemanticsProperties.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAssertive-0phEisY  reason: not valid java name */
        public final int m37805getAssertive0phEisY() {
            return LiveRegionMode.Assertive;
        }

        /* renamed from: getPolite-0phEisY  reason: not valid java name */
        public final int m37806getPolite0phEisY() {
            return LiveRegionMode.Polite;
        }
    }

    private /* synthetic */ LiveRegionMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LiveRegionMode m37798boximpl(int i) {
        return new LiveRegionMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37800equalsimpl(int i, Object obj) {
        if ((obj instanceof LiveRegionMode) && i == ((LiveRegionMode) obj).m37804unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37801equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37802hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37803toStringimpl(int i) {
        if (m37801equalsimpl0(i, Polite)) {
            return "Polite";
        }
        if (m37801equalsimpl0(i, Assertive)) {
            return "Assertive";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m37800equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37802hashCodeimpl(this.value);
    }

    public String toString() {
        return m37803toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37804unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m37799constructorimpl(int i) {
        return i;
    }
}
