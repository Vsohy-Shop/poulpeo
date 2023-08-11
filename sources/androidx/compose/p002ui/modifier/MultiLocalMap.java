package androidx.compose.p002ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11906l;

/* renamed from: androidx.compose.ui.modifier.MultiLocalMap */
/* compiled from: ModifierLocalNode.kt */
public final class MultiLocalMap extends ModifierLocalMap {
    private final SnapshotStateMap<ModifierLocal<?>, Object> map;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiLocalMap(C11906l<? extends ModifierLocal<?>, ? extends Object>... lVarArr) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(lVarArr, "entries");
        SnapshotStateMap<ModifierLocal<?>, Object> mutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.map = mutableStateMapOf;
        mutableStateMapOf.putAll(C12716r0.m28428s(lVarArr));
    }

    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        C12775o.m28639i(modifierLocal, "key");
        return this.map.containsKey(modifierLocal);
    }

    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        C12775o.m28639i(modifierLocal, "key");
        T t = this.map.get(modifierLocal);
        if (t == null) {
            return null;
        }
        return t;
    }

    public <T> void set$ui_release(ModifierLocal<T> modifierLocal, T t) {
        C12775o.m28639i(modifierLocal, "key");
        this.map.put(modifierLocal, t);
    }
}
