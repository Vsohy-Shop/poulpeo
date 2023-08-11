package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Strings.kt */
public final class Strings {
    /* access modifiers changed from: private */
    public static final int CloseDrawer = m34578constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int CloseSheet = m34578constructorimpl(2);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int DefaultErrorMessage = m34578constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Dialog = m34578constructorimpl(7);
    /* access modifiers changed from: private */
    public static final int ExposedDropdownMenu = m34578constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int MenuCollapsed = m34578constructorimpl(9);
    /* access modifiers changed from: private */
    public static final int MenuExpanded = m34578constructorimpl(8);
    /* access modifiers changed from: private */
    public static final int NavigationMenu = m34578constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int SliderRangeEnd = m34578constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int SliderRangeStart = m34578constructorimpl(5);
    private final int value;

    /* compiled from: Strings.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCloseDrawer-adMyvUU  reason: not valid java name */
        public final int m34584getCloseDraweradMyvUU() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-adMyvUU  reason: not valid java name */
        public final int m34585getCloseSheetadMyvUU() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-adMyvUU  reason: not valid java name */
        public final int m34586getDefaultErrorMessageadMyvUU() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getDialog-adMyvUU  reason: not valid java name */
        public final int m34587getDialogadMyvUU() {
            return Strings.Dialog;
        }

        /* renamed from: getExposedDropdownMenu-adMyvUU  reason: not valid java name */
        public final int m34588getExposedDropdownMenuadMyvUU() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getMenuCollapsed-adMyvUU  reason: not valid java name */
        public final int m34589getMenuCollapsedadMyvUU() {
            return Strings.MenuCollapsed;
        }

        /* renamed from: getMenuExpanded-adMyvUU  reason: not valid java name */
        public final int m34590getMenuExpandedadMyvUU() {
            return Strings.MenuExpanded;
        }

        /* renamed from: getNavigationMenu-adMyvUU  reason: not valid java name */
        public final int m34591getNavigationMenuadMyvUU() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-adMyvUU  reason: not valid java name */
        public final int m34592getSliderRangeEndadMyvUU() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-adMyvUU  reason: not valid java name */
        public final int m34593getSliderRangeStartadMyvUU() {
            return Strings.SliderRangeStart;
        }
    }

    private /* synthetic */ Strings(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Strings m34577boximpl(int i) {
        return new Strings(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m34579equalsimpl(int i, Object obj) {
        if ((obj instanceof Strings) && i == ((Strings) obj).m34583unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m34580equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m34581hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m34582toStringimpl(int i) {
        return "Strings(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m34579equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m34581hashCodeimpl(this.value);
    }

    public String toString() {
        return m34582toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m34583unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m34578constructorimpl(int i) {
        return i;
    }
}
