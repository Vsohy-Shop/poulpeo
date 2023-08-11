package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: ExposedDropdownMenu.kt */
final class OnGlobalLayoutListener implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private boolean isListeningToGlobalLayout;
    private final C13074a<C11921v> onGlobalLayoutCallback;
    private final View view;

    public OnGlobalLayoutListener(View view2, C13074a<C11921v> aVar) {
        C12775o.m28639i(view2, "view");
        C12775o.m28639i(aVar, "onGlobalLayoutCallback");
        this.view = view2;
        this.onGlobalLayoutCallback = aVar;
        view2.addOnAttachStateChangeListener(this);
        registerOnGlobalLayoutListener();
    }

    private final void registerOnGlobalLayoutListener() {
        if (!this.isListeningToGlobalLayout && this.view.isAttachedToWindow()) {
            this.view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = true;
        }
    }

    private final void unregisterOnGlobalLayoutListener() {
        if (this.isListeningToGlobalLayout) {
            this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = false;
        }
    }

    public final void dispose() {
        unregisterOnGlobalLayoutListener();
        this.view.removeOnAttachStateChangeListener(this);
    }

    public void onGlobalLayout() {
        this.onGlobalLayoutCallback.invoke();
    }

    public void onViewAttachedToWindow(View view2) {
        C12775o.m28639i(view2, "p0");
        registerOnGlobalLayoutListener();
    }

    public void onViewDetachedFromWindow(View view2) {
        C12775o.m28639i(view2, "p0");
        unregisterOnGlobalLayoutListener();
    }
}
