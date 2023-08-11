package androidx.compose.p002ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout */
/* compiled from: BeyondBoundsLayout.kt */
public interface BeyondBoundsLayout {

    /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$BeyondBoundsScope */
    /* compiled from: BeyondBoundsLayout.kt */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* renamed from: layout-o7g1Pn8  reason: not valid java name */
    <T> T m37293layouto7g1Pn8(int i, Function1<? super BeyondBoundsScope, ? extends T> function1);

    /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection */
    /* compiled from: BeyondBoundsLayout.kt */
    public static final class LayoutDirection {
        /* access modifiers changed from: private */
        public static final int Above = m37295constructorimpl(5);
        /* access modifiers changed from: private */
        public static final int After = m37295constructorimpl(2);
        /* access modifiers changed from: private */
        public static final int Before = m37295constructorimpl(1);
        /* access modifiers changed from: private */
        public static final int Below = m37295constructorimpl(6);
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int Left = m37295constructorimpl(3);
        /* access modifiers changed from: private */
        public static final int Right = m37295constructorimpl(4);
        private final int value;

        /* renamed from: androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion */
        /* compiled from: BeyondBoundsLayout.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE  reason: not valid java name */
            public final int m37301getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE  reason: not valid java name */
            public final int m37302getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE  reason: not valid java name */
            public final int m37303getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE  reason: not valid java name */
            public final int m37304getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE  reason: not valid java name */
            public final int m37305getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE  reason: not valid java name */
            public final int m37306getRighthoxUOeE() {
                return LayoutDirection.Right;
            }
        }

        private /* synthetic */ LayoutDirection(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m37294boximpl(int i) {
            return new LayoutDirection(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m37296equalsimpl(int i, Object obj) {
            if ((obj instanceof LayoutDirection) && i == ((LayoutDirection) obj).m37300unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m37297equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m37298hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m37299toStringimpl(int i) {
            if (m37297equalsimpl0(i, Before)) {
                return "Before";
            }
            if (m37297equalsimpl0(i, After)) {
                return "After";
            }
            if (m37297equalsimpl0(i, Left)) {
                return "Left";
            }
            if (m37297equalsimpl0(i, Right)) {
                return "Right";
            }
            if (m37297equalsimpl0(i, Above)) {
                return "Above";
            }
            if (m37297equalsimpl0(i, Below)) {
                return "Below";
            }
            return "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m37296equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m37298hashCodeimpl(this.value);
        }

        public String toString() {
            return m37299toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m37300unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m37295constructorimpl(int i) {
            return i;
        }
    }
}
