package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.lifecycle.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2344g implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ SavedStateHandle f1058a;

    public /* synthetic */ C2344g(SavedStateHandle savedStateHandle) {
        this.f1058a = savedStateHandle;
    }

    public final Bundle saveState() {
        return SavedStateHandle.savedStateProvider$lambda$0(this.f1058a);
    }
}
