package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl$SaveableStateProvider$1$1\n*L\n1#1,484:1\n93#2,3:485\n*E\n"})
/* renamed from: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1 */
/* compiled from: Effects.kt */
public final class C0951x4b01cfff implements DisposableEffectResult {
    final /* synthetic */ Object $key$inlined;
    final /* synthetic */ SaveableStateHolderImpl.RegistryHolder $registryHolder$inlined;
    final /* synthetic */ SaveableStateHolderImpl this$0;

    public C0951x4b01cfff(SaveableStateHolderImpl.RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
        this.$registryHolder$inlined = registryHolder;
        this.this$0 = saveableStateHolderImpl;
        this.$key$inlined = obj;
    }

    public void dispose() {
        this.$registryHolder$inlined.saveTo(this.this$0.savedStates);
        this.this$0.registryHolders.remove(this.$key$inlined);
    }
}
