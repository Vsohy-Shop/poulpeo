package androidx.compose.p002ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n55#2:129\n62#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:129\n50#1:130\n*E\n"})
/* renamed from: androidx.compose.ui.text.TextRange */
/* compiled from: TextRange.kt */
public final class TextRange {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* renamed from: androidx.compose.ui.text.TextRange$Companion */
    /* compiled from: TextRange.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-d9O1mEE  reason: not valid java name */
        public final long m37980getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextRange m37963boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: contains-5zc-tL8  reason: not valid java name */
    public static final boolean m37965contains5zctL8(long j, long j2) {
        if (m37973getMinimpl(j) > m37973getMinimpl(j2) || m37972getMaximpl(j2) > m37972getMaximpl(j)) {
            return false;
        }
        return true;
    }

    /* renamed from: contains-impl  reason: not valid java name */
    public static final boolean m37966containsimpl(long j, int i) {
        int r0 = m37973getMinimpl(j);
        if (i >= m37972getMaximpl(j) || r0 > i) {
            return false;
        }
        return true;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m37967equalsimpl(long j, Object obj) {
        if ((obj instanceof TextRange) && j == ((TextRange) obj).m37979unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m37968equalsimpl0(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* renamed from: getCollapsed-impl  reason: not valid java name */
    public static final boolean m37969getCollapsedimpl(long j) {
        if (m37975getStartimpl(j) == m37970getEndimpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getEnd-impl  reason: not valid java name */
    public static final int m37970getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getLength-impl  reason: not valid java name */
    public static final int m37971getLengthimpl(long j) {
        return m37972getMaximpl(j) - m37973getMinimpl(j);
    }

    /* renamed from: getMax-impl  reason: not valid java name */
    public static final int m37972getMaximpl(long j) {
        if (m37975getStartimpl(j) > m37970getEndimpl(j)) {
            return m37975getStartimpl(j);
        }
        return m37970getEndimpl(j);
    }

    /* renamed from: getMin-impl  reason: not valid java name */
    public static final int m37973getMinimpl(long j) {
        if (m37975getStartimpl(j) > m37970getEndimpl(j)) {
            return m37970getEndimpl(j);
        }
        return m37975getStartimpl(j);
    }

    /* renamed from: getReversed-impl  reason: not valid java name */
    public static final boolean m37974getReversedimpl(long j) {
        if (m37975getStartimpl(j) > m37970getEndimpl(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getStart-impl  reason: not valid java name */
    public static final int m37975getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m37976hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: intersects-5zc-tL8  reason: not valid java name */
    public static final boolean m37977intersects5zctL8(long j, long j2) {
        if (m37973getMinimpl(j) >= m37972getMaximpl(j2) || m37973getMinimpl(j2) >= m37972getMaximpl(j)) {
            return false;
        }
        return true;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m37978toStringimpl(long j) {
        return "TextRange(" + m37975getStartimpl(j) + ", " + m37970getEndimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m37967equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m37976hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m37978toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m37979unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m37964constructorimpl(long j) {
        return j;
    }
}
