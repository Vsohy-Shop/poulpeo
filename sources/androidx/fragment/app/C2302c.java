package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.fragment.app.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2302c implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ FragmentManager f1050a;

    public /* synthetic */ C2302c(FragmentManager fragmentManager) {
        this.f1050a = fragmentManager;
    }

    public final Bundle saveState() {
        return this.f1050a.lambda$attachController$0();
    }
}
