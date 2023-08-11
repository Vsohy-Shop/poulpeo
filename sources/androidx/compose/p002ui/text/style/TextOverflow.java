package androidx.compose.p002ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.style.TextOverflow */
/* compiled from: TextOverflow.kt */
public final class TextOverflow {
    /* access modifiers changed from: private */
    public static final int Clip = m38388constructorimpl(1);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Ellipsis = m38388constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Visible = m38388constructorimpl(3);
    private final int value;

    private /* synthetic */ TextOverflow(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextOverflow m38387boximpl(int i) {
        return new TextOverflow(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38389equalsimpl(int i, Object obj) {
        if ((obj instanceof TextOverflow) && i == ((TextOverflow) obj).m38393unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38390equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38391hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38392toStringimpl(int i) {
        if (m38390equalsimpl0(i, Clip)) {
            return "Clip";
        }
        if (m38390equalsimpl0(i, Ellipsis)) {
            return "Ellipsis";
        }
        if (m38390equalsimpl0(i, Visible)) {
            return "Visible";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m38389equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m38391hashCodeimpl(this.value);
    }

    public String toString() {
        return m38392toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38393unboximpl() {
        return this.value;
    }

    /* renamed from: androidx.compose.ui.text.style.TextOverflow$Companion */
    /* compiled from: TextOverflow.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClip-gIe3tQ8  reason: not valid java name */
        public final int m38397getClipgIe3tQ8() {
            return TextOverflow.Clip;
        }

        /* renamed from: getEllipsis-gIe3tQ8  reason: not valid java name */
        public final int m38398getEllipsisgIe3tQ8() {
            return TextOverflow.Ellipsis;
        }

        /* renamed from: getVisible-gIe3tQ8  reason: not valid java name */
        public final int m38399getVisiblegIe3tQ8() {
            return TextOverflow.Visible;
        }

        @Stable
        /* renamed from: getClip-gIe3tQ8$annotations  reason: not valid java name */
        public static /* synthetic */ void m38394getClipgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getEllipsis-gIe3tQ8$annotations  reason: not valid java name */
        public static /* synthetic */ void m38395getEllipsisgIe3tQ8$annotations() {
        }

        @Stable
        /* renamed from: getVisible-gIe3tQ8$annotations  reason: not valid java name */
        public static /* synthetic */ void m38396getVisiblegIe3tQ8$annotations() {
        }
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38388constructorimpl(int i) {
        return i;
    }
}
