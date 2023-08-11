package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.view.o3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1851o3 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f528b;

    public /* synthetic */ C1851o3(View view) {
        this.f528b = view;
    }

    public final void run() {
        ((InputMethodManager) this.f528b.getContext().getSystemService("input_method")).showSoftInput(this.f528b, 0);
    }
}
