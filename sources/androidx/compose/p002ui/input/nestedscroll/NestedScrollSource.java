package androidx.compose.p002ui.input.nestedscroll;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollSource */
/* compiled from: NestedScrollModifier.kt */
public final class NestedScrollSource {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Drag = m37061constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Fling = m37061constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Relocate = m37061constructorimpl(3);
    private final int value;

    private /* synthetic */ NestedScrollSource(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ NestedScrollSource m37060boximpl(int i) {
        return new NestedScrollSource(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37062equalsimpl(int i, Object obj) {
        if ((obj instanceof NestedScrollSource) && i == ((NestedScrollSource) obj).m37066unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37063equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37064hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37065toStringimpl(int i) {
        if (m37063equalsimpl0(i, Drag)) {
            return "Drag";
        }
        if (m37063equalsimpl0(i, Fling)) {
            return "Fling";
        }
        if (m37063equalsimpl0(i, Relocate)) {
            return "Relocate";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m37062equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37064hashCodeimpl(this.value);
    }

    public String toString() {
        return m37065toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37066unboximpl() {
        return this.value;
    }

    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollSource$Companion */
    /* compiled from: NestedScrollModifier.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDrag-WNlRxjI  reason: not valid java name */
        public final int m37068getDragWNlRxjI() {
            return NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI  reason: not valid java name */
        public final int m37069getFlingWNlRxjI() {
            return NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI  reason: not valid java name */
        public final int m37070getRelocateWNlRxjI() {
            return NestedScrollSource.Relocate;
        }

        @ExperimentalComposeUiApi
        /* renamed from: getRelocate-WNlRxjI$annotations  reason: not valid java name */
        public static /* synthetic */ void m37067getRelocateWNlRxjI$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m37061constructorimpl(int i) {
        return i;
    }
}
