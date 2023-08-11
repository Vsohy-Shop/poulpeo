package androidx.compose.p002ui.text.font;

import androidx.autofill.HintConstants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nDeviceFontFamilyNameFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.DeviceFontFamilyName */
/* compiled from: DeviceFontFamilyNameFont.kt */
public final class DeviceFontFamilyName {
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m38024boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static String m38025constructorimpl(String str) {
        boolean z;
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38026equalsimpl(String str, Object obj) {
        if ((obj instanceof DeviceFontFamilyName) && C12775o.m28634d(str, ((DeviceFontFamilyName) obj).m38030unboximpl())) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38027equalsimpl0(String str, String str2) {
        return C12775o.m28634d(str, str2);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38028hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38029toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m38026equalsimpl(this.name, obj);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m38028hashCodeimpl(this.name);
    }

    public String toString() {
        return m38029toStringimpl(this.name);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ String m38030unboximpl() {
        return this.name;
    }
}
