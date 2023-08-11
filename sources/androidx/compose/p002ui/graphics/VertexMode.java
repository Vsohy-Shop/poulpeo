package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.VertexMode */
/* compiled from: VertexMode.kt */
public final class VertexMode {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int TriangleFan = m36095constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int TriangleStrip = m36095constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int Triangles = m36095constructorimpl(0);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.VertexMode$Companion */
    /* compiled from: VertexMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getTriangleFan-c2xauaI  reason: not valid java name */
        public final int m36101getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI  reason: not valid java name */
        public final int m36102getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI  reason: not valid java name */
        public final int m36103getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }
    }

    private /* synthetic */ VertexMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ VertexMode m36094boximpl(int i) {
        return new VertexMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36096equalsimpl(int i, Object obj) {
        if ((obj instanceof VertexMode) && i == ((VertexMode) obj).m36100unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36097equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36098hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36099toStringimpl(int i) {
        if (m36097equalsimpl0(i, Triangles)) {
            return "Triangles";
        }
        if (m36097equalsimpl0(i, TriangleStrip)) {
            return "TriangleStrip";
        }
        if (m36097equalsimpl0(i, TriangleFan)) {
            return "TriangleFan";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m36096equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36098hashCodeimpl(this.value);
    }

    public String toString() {
        return m36099toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36100unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36095constructorimpl(int i) {
        return i;
    }
}
