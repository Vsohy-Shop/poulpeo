package androidx.compose.p002ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,220:1\n76#2:221\n102#2,2:222\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:221\n44#1:222,2\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.SingleLocalMap */
/* compiled from: ModifierLocalNode.kt */
public final class SingleLocalMap extends ModifierLocalMap {
    private final ModifierLocal<?> key;
    private final MutableState value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleLocalMap(ModifierLocal<?> modifierLocal) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(modifierLocal, "key");
        this.key = modifierLocal;
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        C12775o.m28639i(modifierLocal, "key");
        if (modifierLocal == this.key) {
            return true;
        }
        return false;
    }

    public final void forceValue$ui_release(Object obj) {
        setValue(obj);
    }

    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        boolean z;
        C12775o.m28639i(modifierLocal, "key");
        if (modifierLocal == this.key) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            T value = getValue();
            if (value == null) {
                return null;
            }
            return value;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public <T> void set$ui_release(ModifierLocal<T> modifierLocal, T t) {
        boolean z;
        C12775o.m28639i(modifierLocal, "key");
        if (modifierLocal == this.key) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setValue(t);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
