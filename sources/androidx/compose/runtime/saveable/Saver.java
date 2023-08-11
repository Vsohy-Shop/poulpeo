package androidx.compose.runtime.saveable;

/* compiled from: Saver.kt */
public interface Saver<Original, Saveable> {
    Original restore(Saveable saveable);

    Saveable save(SaverScope saverScope, Original original);
}
