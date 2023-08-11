package androidx.compose.p002ui.node;

/* renamed from: androidx.compose.ui.node.DiffCallback */
/* compiled from: MyersDiff.kt */
public interface DiffCallback {
    boolean areItemsTheSame(int i, int i2);

    void insert(int i, int i2);

    void remove(int i);

    void same(int i, int i2);
}
