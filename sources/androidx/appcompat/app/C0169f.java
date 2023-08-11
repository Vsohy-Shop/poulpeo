package androidx.appcompat.app;

import android.view.KeyEvent;
import androidx.core.view.KeyEventDispatcher;

/* renamed from: androidx.appcompat.app.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0169f implements KeyEventDispatcher.Component {

    /* renamed from: b */
    public final /* synthetic */ AppCompatDialog f193b;

    public /* synthetic */ C0169f(AppCompatDialog appCompatDialog) {
        this.f193b = appCompatDialog;
    }

    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return this.f193b.superDispatchKeyEvent(keyEvent);
    }
}
