package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* compiled from: Strings.kt */
public final class Strings {
    /* access modifiers changed from: private */
    public static final int CloseDrawer = m34112constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int CloseSheet = m34112constructorimpl(2);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int DefaultErrorMessage = m34112constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int ExposedDropdownMenu = m34112constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int NavigationMenu = m34112constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int SliderRangeEnd = m34112constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int SliderRangeStart = m34112constructorimpl(5);
    private final int value;

    /* compiled from: Strings.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCloseDrawer-UdPEhr4  reason: not valid java name */
        public final int m34118getCloseDrawerUdPEhr4() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-UdPEhr4  reason: not valid java name */
        public final int m34119getCloseSheetUdPEhr4() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-UdPEhr4  reason: not valid java name */
        public final int m34120getDefaultErrorMessageUdPEhr4() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getExposedDropdownMenu-UdPEhr4  reason: not valid java name */
        public final int m34121getExposedDropdownMenuUdPEhr4() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getNavigationMenu-UdPEhr4  reason: not valid java name */
        public final int m34122getNavigationMenuUdPEhr4() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-UdPEhr4  reason: not valid java name */
        public final int m34123getSliderRangeEndUdPEhr4() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-UdPEhr4  reason: not valid java name */
        public final int m34124getSliderRangeStartUdPEhr4() {
            return Strings.SliderRangeStart;
        }
    }

    private /* synthetic */ Strings(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Strings m34111boximpl(int i) {
        return new Strings(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m34113equalsimpl(int i, Object obj) {
        if ((obj instanceof Strings) && i == ((Strings) obj).m34117unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m34114equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m34115hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m34116toStringimpl(int i) {
        return "Strings(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m34113equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m34115hashCodeimpl(this.value);
    }

    public String toString() {
        return m34116toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m34117unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m34112constructorimpl(int i) {
        return i;
    }
}
