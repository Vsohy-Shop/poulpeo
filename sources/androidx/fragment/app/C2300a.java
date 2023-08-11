package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.fragment.app.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2300a implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ FragmentActivity f1048a;

    public /* synthetic */ C2300a(FragmentActivity fragmentActivity) {
        this.f1048a = fragmentActivity;
    }

    public final Bundle saveState() {
        return this.f1048a.lambda$init$0();
    }
}
