package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.collections.C12699k;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1747#2,3:318\n533#2,6:321\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n194#1:318,3\n209#1:321,6\n*E\n"})
/* compiled from: OnBackPressedDispatcher.kt */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private C13074a<C11921v> enabledChangedCallback;
    private final Runnable fallbackOnBackPressed;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    /* access modifiers changed from: private */
    public final C12699k<OnBackPressedCallback> onBackPressedCallbacks;

    @RequiresApi(33)
    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        /* access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(C13074a aVar) {
            C12775o.m28639i(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        @DoNotInline
        public final OnBackInvokedCallback createOnBackInvokedCallback(C13074a<C11921v> aVar) {
            C12775o.m28639i(aVar, "onBackInvoked");
            return new C0116k(aVar);
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(Object obj, int i, Object obj2) {
            C12775o.m28639i(obj, "dispatcher");
            C12775o.m28639i(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            C12775o.m28639i(obj, "dispatcher");
            C12775o.m28639i(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    private final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle2, OnBackPressedCallback onBackPressedCallback2) {
            C12775o.m28639i(lifecycle2, "lifecycle");
            C12775o.m28639i(onBackPressedCallback2, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle2;
            this.onBackPressedCallback = onBackPressedCallback2;
            lifecycle2.addObserver(this);
        }

        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            C12775o.m28639i(lifecycleOwner, APIParams.SOURCE);
            C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
            } else if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    private final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback2) {
            C12775o.m28639i(onBackPressedCallback2, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback2;
        }

        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            this.onBackPressedCallback.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.onBackPressedCallback.setEnabledChangedCallback$activity_release((C13074a<C11921v>) null);
                this.this$0.updateBackInvokedCallbackState$activity_release();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this((Runnable) null, 1, (DefaultConstructorMarker) null);
    }

    @MainThread
    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        C12775o.m28639i(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    @MainThread
    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        C12775o.m28639i(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        if (Build.VERSION.SDK_INT >= 33) {
            updateBackInvokedCallbackState$activity_release();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
        }
        return onBackPressedCancellable;
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        C12699k<OnBackPressedCallback> kVar = this.onBackPressedCallbacks;
        if ((kVar instanceof Collection) && kVar.isEmpty()) {
            return false;
        }
        for (OnBackPressedCallback isEnabled : kVar) {
            if (isEnabled.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        C12699k<OnBackPressedCallback> kVar = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallback = null;
                break;
            }
            onBackPressedCallback = listIterator.previous();
            if (onBackPressedCallback.isEnabled()) {
                break;
            }
        }
        OnBackPressedCallback onBackPressedCallback2 = onBackPressedCallback;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C12775o.m28639i(onBackInvokedDispatcher, "invoker");
        this.invokedDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState$activity_release();
    }

    @RequiresApi(33)
    public final void updateBackInvokedCallbackState$activity_release() {
        boolean hasEnabledCallbacks = hasEnabledCallbacks();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback2 = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback2 != null) {
            if (hasEnabledCallbacks && !this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback2);
                this.backInvokedCallbackRegistered = true;
            } else if (!hasEnabledCallbacks && this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback2);
                this.backInvokedCallbackRegistered = false;
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.fallbackOnBackPressed = runnable;
        this.onBackPressedCallbacks = new C12699k<>();
        if (Build.VERSION.SDK_INT >= 33) {
            this.enabledChangedCallback = new C13074a<C11921v>(this) {
                final /* synthetic */ OnBackPressedDispatcher this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.updateBackInvokedCallbackState$activity_release();
                }
            };
            this.onBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new C13074a<C11921v>(this) {
                final /* synthetic */ OnBackPressedDispatcher this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.onBackPressed();
                }
            });
        }
    }

    @MainThread
    public final void addCallback(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        C12775o.m28639i(lifecycleOwner, "owner");
        C12775o.m28639i(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState$activity_release();
                onBackPressedCallback.setEnabledChangedCallback$activity_release(this.enabledChangedCallback);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : runnable);
    }
}
