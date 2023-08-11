package androidx.compose.p002ui.text.input;

import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.compose.ui.text.input.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1227a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InputMethodManager f381b;

    /* renamed from: c */
    public final /* synthetic */ ImmHelper21 f382c;

    public /* synthetic */ C1227a(InputMethodManager inputMethodManager, ImmHelper21 immHelper21) {
        this.f381b = inputMethodManager;
        this.f382c = immHelper21;
    }

    public final void run() {
        ImmHelper21.showSoftInput$lambda$0(this.f381b, this.f382c);
    }
}
