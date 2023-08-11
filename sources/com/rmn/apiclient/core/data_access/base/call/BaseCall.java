package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.BaseInput;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.exceptions.UnhandledCallException;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCanceledListener;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnFailureListener;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p446vd.C13633n;
import p446vd.C13638s;

public abstract class BaseCall<I extends BaseInput<I, O>, O extends BaseOutput<I>> implements IActionProcessorListener<O> {
    public final int callId = C13638s.f21959b.mo53307a();
    @NonNull
    private final Set<OnCanceledListener> canceledListeners = new HashSet();
    @NonNull
    private final Set<OnCompleteListener<I, O>> completeListeners = new HashSet();
    private boolean completed = false;
    @Nullable
    private ContextContainer contextContainer;
    @NonNull
    private final Set<OnFailureListener> failureListeners = new HashSet();
    @NonNull
    public final I input;
    @Nullable
    private final OnCompleteListener<I, O> managerListener;
    @NonNull
    private final Set<Object> notifiedListeners = new HashSet();
    @NonNull
    private O output;
    private boolean processing = false;
    @NonNull
    private final List<BaseActionProcessor<I, O>> remainingActions;
    @NonNull
    private final Set<OnSuccessListener<O>> successListeners = new HashSet();

    protected BaseCall(@NonNull I i, @Nullable OnCompleteListener<I, O> onCompleteListener) {
        this.input = i;
        this.managerListener = onCompleteListener;
        this.remainingActions = new ArrayList(i.getStrategy().getActions());
        this.output = newOutput(OutputStatus.PENDING, (CallException) null);
    }

    private void endProcessing() {
        if (this.processing && !this.completed) {
            this.processing = false;
            this.completed = true;
            this.contextContainer = null;
            if (this.output.getStatus() == OutputStatus.PENDING) {
                this.output = newOutput(OutputStatus.FAILURE, new UnhandledCallException());
            }
            OnCompleteListener<I, O> onCompleteListener = this.managerListener;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete(this);
            }
            tryNotifyListenersAsync();
        }
    }

    private <L> Set<L> getNonNotifiedListeners(Set<L> set) {
        HashSet hashSet = new HashSet();
        for (L next : set) {
            if (!this.notifiedListeners.contains(next)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    public void notifyListeners() {
        Set<L> nonNotifiedListeners = getNonNotifiedListeners(this.canceledListeners);
        Set<L> nonNotifiedListeners2 = getNonNotifiedListeners(this.failureListeners);
        Set<L> nonNotifiedListeners3 = getNonNotifiedListeners(this.successListeners);
        Set<L> nonNotifiedListeners4 = getNonNotifiedListeners(this.completeListeners);
        this.notifiedListeners.addAll(this.canceledListeners);
        this.notifiedListeners.addAll(this.failureListeners);
        this.notifiedListeners.addAll(this.successListeners);
        this.notifiedListeners.addAll(this.completeListeners);
        if (isCanceled()) {
            for (L onCanceled : nonNotifiedListeners) {
                try {
                    onCanceled.onCanceled();
                } catch (Throwable th) {
                    C13633n.m31164t(this, "OnCanceledListener error", th);
                }
            }
        } else if (!isSuccessful()) {
            for (L l : nonNotifiedListeners2) {
                CallException exception = this.output.getException();
                if (exception == null) {
                    exception = new UnhandledCallException();
                }
                try {
                    l.onFailure(exception);
                } catch (Throwable th2) {
                    C13633n.m31164t(this, "OnSuccessListener error", th2);
                }
            }
        } else {
            for (L onSuccess : nonNotifiedListeners3) {
                try {
                    onSuccess.onSuccess(this.output);
                } catch (Throwable th3) {
                    C13633n.m31164t(this, "OnSuccessListener error", th3);
                }
            }
        }
        for (L onComplete : nonNotifiedListeners4) {
            try {
                onComplete.onComplete(this);
            } catch (Throwable th4) {
                C13633n.m31164t(this, "OnCompleteListener error", th4);
            }
        }
    }

    private void processNextAction() {
        if (!this.completed) {
            if (isCanceled() || this.remainingActions.isEmpty()) {
                endProcessing();
                return;
            }
            BaseActionProcessor baseActionProcessor = this.remainingActions.get(0);
            this.remainingActions.remove(0);
            if (!baseActionProcessor.canProcessAction(this.input, this.output)) {
                C13633n.m31148d(">> SKIP  " + baseActionProcessor.getClass().getSimpleName() + " from " + this.input.getMethodDescriptor().verb + " " + this.input.getMethodDescriptor().name);
                if (baseActionProcessor.mustInterruptCallIfCantProcess()) {
                    endProcessing();
                } else {
                    processNextAction();
                }
            } else if (this.contextContainer != null) {
                C13633n.m31148d(">> START " + baseActionProcessor.getClass().getSimpleName() + " from " + this.input.getMethodDescriptor().verb + " " + this.input.getMethodDescriptor().name);
                try {
                    baseActionProcessor.process(this.contextContainer, this.input, this.output, this);
                } catch (Throwable th) {
                    C13633n.m31164t(this, "Action processor failed", th);
                    endProcessing();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void tryNotifyListenersAsync() {
        if (this.completed) {
            new AndroidOsHandler(true).mo47873h(new C11587a(this), 1);
        }
    }

    @NonNull
    public <C extends BaseCall<I, O>> C addOnCanceledListener(@NonNull OnCanceledListener onCanceledListener) {
        if (this.canceledListeners.contains(onCanceledListener)) {
            return thisGeneric();
        }
        this.canceledListeners.add(onCanceledListener);
        tryNotifyListenersAsync();
        return thisGeneric();
    }

    @NonNull
    public <C extends BaseCall<I, O>> C addOnCompleteListener(@NonNull OnCompleteListener<I, O> onCompleteListener) {
        if (this.completeListeners.contains(onCompleteListener)) {
            return thisGeneric();
        }
        this.completeListeners.add(onCompleteListener);
        tryNotifyListenersAsync();
        return thisGeneric();
    }

    @NonNull
    public <C extends BaseCall<I, O>> C addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        if (this.failureListeners.contains(onFailureListener)) {
            return thisGeneric();
        }
        this.failureListeners.add(onFailureListener);
        tryNotifyListenersAsync();
        return thisGeneric();
    }

    @NonNull
    public <C extends BaseCall<I, O>> C addOnSuccessListener(@NonNull OnSuccessListener<O> onSuccessListener) {
        if (this.successListeners.contains(onSuccessListener)) {
            return thisGeneric();
        }
        this.successListeners.add(onSuccessListener);
        tryNotifyListenersAsync();
        return thisGeneric();
    }

    public void cancel() {
        if (!this.completed) {
            if (this.processing) {
                this.output = newOutput(OutputStatus.CANCELED, (CallException) null);
                endProcessing();
                return;
            }
            throw new IllegalStateException("Can't cancel a non-started call");
        }
    }

    @NonNull
    public I getInput() {
        return this.input;
    }

    @NonNull
    public O getOutput() {
        return this.output;
    }

    public boolean isCanceled() {
        if (this.output.getStatus() == OutputStatus.CANCELED) {
            return true;
        }
        return false;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean isProcessing() {
        return this.processing;
    }

    public boolean isSuccessful() {
        if (this.output.getStatus() == OutputStatus.SUCCESS) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract O newOutput(@NonNull OutputStatus outputStatus, @Nullable CallException callException);

    public void onActionProcessed(@NonNull BaseActionProcessor<?, ?> baseActionProcessor, @NonNull O o) {
        String str;
        if (o.getException() != null) {
            str = o.getException().getClass().getSimpleName();
        } else {
            str = "";
        }
        C13633n.m31148d(">> END   " + baseActionProcessor.getClass().getSimpleName() + " from " + this.input.getMethodDescriptor().verb + " " + this.input.getMethodDescriptor().name + " => " + o.getStatus() + " " + str);
        if (!this.completed) {
            this.output = o;
            if ((!baseActionProcessor.isMustInterruptCallOnSuccess() || o.getStatus() != OutputStatus.SUCCESS) && (!baseActionProcessor.isMustInterruptCallOnFailure() || o.getStatus() != OutputStatus.FAILURE)) {
                processNextAction();
            } else {
                endProcessing();
            }
        }
    }

    public void process(@NonNull ContextContainer contextContainer2) {
        if (this.processing || this.completed) {
            throw new IllegalStateException("To process a call twice, you must create 2 BaseCall objects instead");
        }
        this.processing = true;
        this.contextContainer = contextContainer2;
        processNextAction();
    }

    private <C extends BaseCall<I, O>> C thisGeneric() {
        return this;
    }
}
