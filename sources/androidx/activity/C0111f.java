package androidx.activity;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.activity.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0111f implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ ComponentActivity f164a;

    public /* synthetic */ C0111f(ComponentActivity componentActivity) {
        this.f164a = componentActivity;
    }

    public final Bundle saveState() {
        return this.f164a.lambda$new$1();
    }
}
