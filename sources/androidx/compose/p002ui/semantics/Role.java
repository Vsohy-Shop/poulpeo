package androidx.compose.p002ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.semantics.Role */
/* compiled from: SemanticsProperties.kt */
public final class Role {
    /* access modifiers changed from: private */
    public static final int Button = m37808constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Checkbox = m37808constructorimpl(1);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int DropdownList = m37808constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int Image = m37808constructorimpl(5);
    /* access modifiers changed from: private */
    public static final int RadioButton = m37808constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Switch = m37808constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Tab = m37808constructorimpl(4);
    private final int value;

    /* renamed from: androidx.compose.ui.semantics.Role$Companion */
    /* compiled from: SemanticsProperties.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getButton-o7Vup1c  reason: not valid java name */
        public final int m37814getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCheckbox-o7Vup1c  reason: not valid java name */
        public final int m37815getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c  reason: not valid java name */
        public final int m37816getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c  reason: not valid java name */
        public final int m37817getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c  reason: not valid java name */
        public final int m37818getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c  reason: not valid java name */
        public final int m37819getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c  reason: not valid java name */
        public final int m37820getTabo7Vup1c() {
            return Role.Tab;
        }
    }

    private /* synthetic */ Role(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Role m37807boximpl(int i) {
        return new Role(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37809equalsimpl(int i, Object obj) {
        if ((obj instanceof Role) && i == ((Role) obj).m37813unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37810equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37811hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37812toStringimpl(int i) {
        if (m37810equalsimpl0(i, Button)) {
            return "Button";
        }
        if (m37810equalsimpl0(i, Checkbox)) {
            return "Checkbox";
        }
        if (m37810equalsimpl0(i, Switch)) {
            return "Switch";
        }
        if (m37810equalsimpl0(i, RadioButton)) {
            return "RadioButton";
        }
        if (m37810equalsimpl0(i, Tab)) {
            return "Tab";
        }
        if (m37810equalsimpl0(i, Image)) {
            return "Image";
        }
        if (m37810equalsimpl0(i, DropdownList)) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m37809equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m37811hashCodeimpl(this.value);
    }

    public String toString() {
        return m37812toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m37813unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m37808constructorimpl(int i) {
        return i;
    }
}
