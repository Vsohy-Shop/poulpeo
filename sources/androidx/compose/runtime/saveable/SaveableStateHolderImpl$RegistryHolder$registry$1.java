package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends C12777p implements Function1<Object, Boolean> {
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
    }

    public final Boolean invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        SaveableStateRegistry parentSaveableStateRegistry = this.this$0.getParentSaveableStateRegistry();
        return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj) : true);
    }
}
