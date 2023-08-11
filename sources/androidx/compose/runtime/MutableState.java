package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

@Stable
/* compiled from: SnapshotState.kt */
public interface MutableState<T> extends State<T> {
    T component1();

    Function1<T, C11921v> component2();

    T getValue();

    void setValue(T t);
}
