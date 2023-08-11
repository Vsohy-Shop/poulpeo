package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.core.view.i1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1804i1 implements View.OnUnhandledKeyEventListener {

    /* renamed from: a */
    public final /* synthetic */ ViewCompat.OnUnhandledKeyEventListenerCompat f526a;

    public /* synthetic */ C1804i1(ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        this.f526a = onUnhandledKeyEventListenerCompat;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.f526a.onUnhandledKeyEvent(view, keyEvent);
    }
}
