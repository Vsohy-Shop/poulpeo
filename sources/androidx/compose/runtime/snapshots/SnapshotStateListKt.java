package androidx.compose.runtime.snapshots;

/* compiled from: SnapshotStateList.kt */
public final class SnapshotStateListKt {
    /* access modifiers changed from: private */
    public static final Object sync = new Object();

    /* access modifiers changed from: private */
    public static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* access modifiers changed from: private */
    public static final void validateRange(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}
