package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsControllerCompat;

/* renamed from: androidx.core.view.y3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1901y3 implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a */
    public final /* synthetic */ WindowInsetsControllerCompat.Impl30 f539a;

    /* renamed from: b */
    public final /* synthetic */ WindowInsetsControllerCompat.OnControllableInsetsChangedListener f540b;

    public /* synthetic */ C1901y3(WindowInsetsControllerCompat.Impl30 impl30, WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f539a = impl30;
        this.f540b = onControllableInsetsChangedListener;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.f539a.lambda$addOnControllableInsetsChangedListener$0(this.f540b, windowInsetsController, i);
    }
}
