package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.C0954R;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.platform.WrappedComposition */
/* compiled from: Wrapper.android.kt */
final class WrappedComposition implements Composition, LifecycleEventObserver {
    /* access modifiers changed from: private */
    public Lifecycle addedToLifecycle;
    /* access modifiers changed from: private */
    public boolean disposed;
    /* access modifiers changed from: private */
    public C13088o<? super Composer, ? super Integer, C11921v> lastContent = ComposableSingletons$Wrapper_androidKt.INSTANCE.m37719getLambda1$ui_release();
    private final Composition original;
    private final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView, Composition composition) {
        C12775o.m28639i(androidComposeView, "owner");
        C12775o.m28639i(composition, "original");
        this.owner = androidComposeView;
        this.original = composition;
    }

    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(C0954R.C0956id.wrapped_composition_tag, (Object) null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.original.dispose();
    }

    public boolean getHasInvalidations() {
        return this.original.getHasInvalidations();
    }

    public final Composition getOriginal() {
        return this.original;
    }

    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    public boolean isDisposed() {
        return this.original.isDisposed();
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C12775o.m28639i(lifecycleOwner, APIParams.SOURCE);
        C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else if (event == Lifecycle.Event.ON_CREATE && !this.disposed) {
            setContent(this.lastContent);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public void setContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "content");
        this.owner.setOnViewTreeOwnersAvailable(new WrappedComposition$setContent$1(this, oVar));
    }
}
