package androidx.core.app;

import android.app.SharedElementCallback;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;

/* renamed from: androidx.core.app.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1355f implements SharedElementCallback.OnSharedElementsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f448a;

    public /* synthetic */ C1355f(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        this.f448a = onSharedElementsReadyListener;
    }

    public final void onSharedElementsReady() {
        ActivityCompat.Api23Impl.onSharedElementsReady(this.f448a);
    }
}
