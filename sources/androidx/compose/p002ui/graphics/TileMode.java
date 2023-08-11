package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.TileMode */
/* compiled from: TileMode.kt */
public final class TileMode {
    /* access modifiers changed from: private */
    public static final int Clamp = m36069constructorimpl(0);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Decal = m36069constructorimpl(3);
    /* access modifiers changed from: private */
    public static final int Mirror = m36069constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Repeated = m36069constructorimpl(1);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.TileMode$Companion */
    /* compiled from: TileMode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getClamp-3opZhB0  reason: not valid java name */
        public final int m36075getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0  reason: not valid java name */
        public final int m36076getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0  reason: not valid java name */
        public final int m36077getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0  reason: not valid java name */
        public final int m36078getRepeated3opZhB0() {
            return TileMode.Repeated;
        }
    }

    private /* synthetic */ TileMode(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TileMode m36068boximpl(int i) {
        return new TileMode(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m36070equalsimpl(int i, Object obj) {
        if ((obj instanceof TileMode) && i == ((TileMode) obj).m36074unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m36071equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m36072hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m36073toStringimpl(int i) {
        if (m36071equalsimpl0(i, Clamp)) {
            return "Clamp";
        }
        if (m36071equalsimpl0(i, Repeated)) {
            return "Repeated";
        }
        if (m36071equalsimpl0(i, Mirror)) {
            return "Mirror";
        }
        if (m36071equalsimpl0(i, Decal)) {
            return "Decal";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m36070equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m36072hashCodeimpl(this.value);
    }

    public String toString() {
        return m36073toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m36074unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m36069constructorimpl(int i) {
        return i;
    }
}
