package androidx.compose.p002ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.graphics.PathOperation */
/* compiled from: PathOperation.kt */
public final class PathOperation {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Difference = m35969constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Intersect = m35969constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int ReverseDifference = m35969constructorimpl(4);
    /* access modifiers changed from: private */
    public static final int Union = m35969constructorimpl(2);
    /* access modifiers changed from: private */
    public static final int Xor = m35969constructorimpl(3);
    private final int value;

    /* renamed from: androidx.compose.ui.graphics.PathOperation$Companion */
    /* compiled from: PathOperation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDifference-b3I0S0c  reason: not valid java name */
        public final int m35975getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c  reason: not valid java name */
        public final int m35976getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c  reason: not valid java name */
        public final int m35977getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c  reason: not valid java name */
        public final int m35978getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c  reason: not valid java name */
        public final int m35979getXorb3I0S0c() {
            return PathOperation.Xor;
        }
    }

    private /* synthetic */ PathOperation(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ PathOperation m35968boximpl(int i) {
        return new PathOperation(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35970equalsimpl(int i, Object obj) {
        if ((obj instanceof PathOperation) && i == ((PathOperation) obj).m35974unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35971equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35972hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35973toStringimpl(int i) {
        if (m35971equalsimpl0(i, Difference)) {
            return "Difference";
        }
        if (m35971equalsimpl0(i, Intersect)) {
            return "Intersect";
        }
        if (m35971equalsimpl0(i, Union)) {
            return "Union";
        }
        if (m35971equalsimpl0(i, Xor)) {
            return "Xor";
        }
        if (m35971equalsimpl0(i, ReverseDifference)) {
            return "ReverseDifference";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m35970equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m35972hashCodeimpl(this.value);
    }

    public String toString() {
        return m35973toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35974unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m35969constructorimpl(int i) {
        return i;
    }
}
