package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.CompositingStrategy */
/* compiled from: GraphicsLayerModifier.kt */
public final class CompositingStrategy {
    /* access modifiers changed from: private */
    public static final int Auto = m35749constructorimpl(0);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int ModulateAlpha = m35749constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Offscreen = m35749constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.CompositingStrategy$Companion */
    /* compiled from: GraphicsLayerModifier.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAuto--NrFUSI  reason: not valid java name */
        public final int m35755getAutoNrFUSI() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha--NrFUSI  reason: not valid java name */
        public final int m35756getModulateAlphaNrFUSI() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen--NrFUSI  reason: not valid java name */
        public final int m35757getOffscreenNrFUSI() {
            return CompositingStrategy.Offscreen;
        }
    }

    private /* synthetic */ CompositingStrategy(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m35748boximpl(int i) {
        return new CompositingStrategy(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35750equalsimpl(int i, Object obj) {
        if ((obj instanceof CompositingStrategy) && i == ((CompositingStrategy) obj).m35754unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35751equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35752hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35753toStringimpl(int i) {
        return "CompositingStrategy(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m35750equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35752hashCodeimpl(this.value);
    }

    public String toString() {
        return m35753toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35754unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35749constructorimpl(int i) {
        return i;
    }
}
