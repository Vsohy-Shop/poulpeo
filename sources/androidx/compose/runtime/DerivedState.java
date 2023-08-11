package androidx.compose.runtime;

/* compiled from: DerivedState.kt */
public interface DerivedState<T> extends State<T> {
    T getCurrentValue();

    Object[] getDependencies();

    SnapshotMutationPolicy<T> getPolicy();
}
