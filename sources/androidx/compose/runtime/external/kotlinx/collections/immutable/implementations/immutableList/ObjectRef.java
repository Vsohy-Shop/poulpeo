package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* compiled from: Utils.kt */
public final class ObjectRef {
    private Object value;

    public ObjectRef(Object obj) {
        this.value = obj;
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }
}
