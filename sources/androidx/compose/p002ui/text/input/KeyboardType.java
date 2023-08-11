package androidx.compose.p002ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.input.KeyboardType */
/* compiled from: KeyboardType.kt */
public final class KeyboardType {
    /* access modifiers changed from: private */
    public static final int Ascii = m38165constructorimpl(2);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Decimal = m38165constructorimpl(9);
    /* access modifiers changed from: private */
    public static final int Email = m38165constructorimpl(6);
    /* access modifiers changed from: private */
    public static final int Number = m38165constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int NumberPassword = m38165constructorimpl(8);
    /* access modifiers changed from: private */
    public static final int Password = m38165constructorimpl(7);
    /* access modifiers changed from: private */
    public static final int Phone = m38165constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Text = m38165constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Uri = m38165constructorimpl(5);
    private final int value;

    private /* synthetic */ KeyboardType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ KeyboardType m38164boximpl(int i) {
        return new KeyboardType(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38166equalsimpl(int i, Object obj) {
        if ((obj instanceof KeyboardType) && i == ((KeyboardType) obj).m38170unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38167equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38168hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38169toStringimpl(int i) {
        if (m38167equalsimpl0(i, Text)) {
            return "Text";
        }
        if (m38167equalsimpl0(i, Ascii)) {
            return "Ascii";
        }
        if (m38167equalsimpl0(i, Number)) {
            return "Number";
        }
        if (m38167equalsimpl0(i, Phone)) {
            return "Phone";
        }
        if (m38167equalsimpl0(i, Uri)) {
            return "Uri";
        }
        if (m38167equalsimpl0(i, Email)) {
            return "Email";
        }
        if (m38167equalsimpl0(i, Password)) {
            return "Password";
        }
        if (m38167equalsimpl0(i, NumberPassword)) {
            return "NumberPassword";
        }
        if (m38167equalsimpl0(i, Decimal)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38166equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38168hashCodeimpl(this.value);
    }

    public String toString() {
        return m38169toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38170unboximpl() {
        return this.value;
    }

    /* renamed from: androidx.compose.ui.text.input.KeyboardType$Companion */
    /* compiled from: KeyboardType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAscii-PjHm6EE  reason: not valid java name */
        public final int m38180getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE  reason: not valid java name */
        public final int m38181getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE  reason: not valid java name */
        public final int m38182getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE  reason: not valid java name */
        public final int m38183getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE  reason: not valid java name */
        public final int m38184getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE  reason: not valid java name */
        public final int m38185getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE  reason: not valid java name */
        public final int m38186getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE  reason: not valid java name */
        public final int m38187getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUri-PjHm6EE  reason: not valid java name */
        public final int m38188getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        @Stable
        /* renamed from: getAscii-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38171getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getDecimal-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38172getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getEmail-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38173getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumber-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38174getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumberPassword-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38175getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPassword-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38176getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPhone-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38177getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getText-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38178getTextPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUri-PjHm6EE$annotations  reason: not valid java name */
        public static /* synthetic */ void m38179getUriPjHm6EE$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38165constructorimpl(int i) {
        return i;
    }
}
