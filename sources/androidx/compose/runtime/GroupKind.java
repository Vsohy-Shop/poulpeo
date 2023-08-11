package androidx.compose.runtime;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Composer.kt */
final class GroupKind {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Group = m35272constructorimpl(0);
    /* access modifiers changed from: private */
    public static final int Node = m35272constructorimpl(1);
    /* access modifiers changed from: private */
    public static final int ReusableNode = m35272constructorimpl(2);
    private final int value;

    /* compiled from: Composer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getGroup-ULZAiWs  reason: not valid java name */
        public final int m35280getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs  reason: not valid java name */
        public final int m35281getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs  reason: not valid java name */
        public final int m35282getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }
    }

    private /* synthetic */ GroupKind(int i) {
        this.value = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ GroupKind m35271boximpl(int i) {
        return new GroupKind(i);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m35273equalsimpl(int i, Object obj) {
        if ((obj instanceof GroupKind) && i == ((GroupKind) obj).m35279unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m35274equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m35275hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isNode-impl  reason: not valid java name */
    public static final boolean m35276isNodeimpl(int i) {
        if (i != Companion.m35280getGroupULZAiWs()) {
            return true;
        }
        return false;
    }

    /* renamed from: isReusable-impl  reason: not valid java name */
    public static final boolean m35277isReusableimpl(int i) {
        if (i != Companion.m35281getNodeULZAiWs()) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m35278toStringimpl(int i) {
        return "GroupKind(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m35273equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m35275hashCodeimpl(this.value);
    }

    public String toString() {
        return m35278toStringimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m35279unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m35272constructorimpl(int i) {
        return i;
    }
}
