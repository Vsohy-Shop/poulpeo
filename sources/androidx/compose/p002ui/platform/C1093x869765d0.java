package androidx.compose.p002ui.platform;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$registered$1 */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
final class C1093x869765d0 implements SavedStateRegistry.SavedStateProvider {
    final /* synthetic */ SaveableStateRegistry $saveableStateRegistry;

    C1093x869765d0(SaveableStateRegistry saveableStateRegistry) {
        this.$saveableStateRegistry = saveableStateRegistry;
    }

    public final Bundle saveState() {
        return DisposableSaveableStateRegistry_androidKt.toBundle(this.$saveableStateRegistry.performSave());
    }
}
