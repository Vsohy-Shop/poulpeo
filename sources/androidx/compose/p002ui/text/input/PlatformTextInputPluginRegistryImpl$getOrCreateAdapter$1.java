package androidx.compose.p002ui.text.input;

import androidx.compose.p002ui.text.input.PlatformTextInputPluginRegistryImpl;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1 */
/* compiled from: PlatformTextInputAdapter.kt */
final class PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.AdapterWithRefCount<T> $adapterWithRefCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(PlatformTextInputPluginRegistryImpl.AdapterWithRefCount<T> adapterWithRefCount) {
        super(0);
        this.$adapterWithRefCount = adapterWithRefCount;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$adapterWithRefCount.decrementRefCount());
    }
}
