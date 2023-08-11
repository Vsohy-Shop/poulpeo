package androidx.lifecycle;

import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: SavedStateHandleSupport.kt */
final class SavedStateHandlesProvider$viewModel$2 extends C12777p implements C13074a<SavedStateHandlesVM> {
    final /* synthetic */ ViewModelStoreOwner $viewModelStoreOwner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$viewModelStoreOwner = viewModelStoreOwner;
    }

    public final SavedStateHandlesVM invoke() {
        return SavedStateHandleSupport.getSavedStateHandlesVM(this.$viewModelStoreOwner);
    }
}
