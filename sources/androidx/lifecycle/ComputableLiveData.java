package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* compiled from: ComputableLiveData.kt */
public abstract class ComputableLiveData<T> {
    private final LiveData<T> _liveData;
    private final AtomicBoolean computing;
    private final Executor executor;
    private final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    private final LiveData<T> liveData;
    public final Runnable refreshRunnable;

    public ComputableLiveData() {
        this((Executor) null, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData computableLiveData) {
        C12775o.m28639i(computableLiveData, "this$0");
        boolean hasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && hasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void refreshRunnable$lambda$0(androidx.lifecycle.ComputableLiveData r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            r3 = r1
        L_0x0011:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.invalid     // Catch:{ all -> 0x002f }
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x001f
            java.lang.Object r0 = r5.compute()     // Catch:{ all -> 0x002f }
            r3 = r2
            goto L_0x0011
        L_0x001f:
            if (r3 == 0) goto L_0x0028
            androidx.lifecycle.LiveData r2 = r5.getLiveData()     // Catch:{ all -> 0x002f }
            r2.postValue(r0)     // Catch:{ all -> 0x002f }
        L_0x0028:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.computing
            r0.set(r1)
            r1 = r3
            goto L_0x0036
        L_0x002f:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.computing
            r5.set(r1)
            throw r0
        L_0x0036:
            if (r1 == 0) goto L_0x0040
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.invalid
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0005
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.refreshRunnable$lambda$0(androidx.lifecycle.ComputableLiveData):void");
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public abstract T compute();

    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    public ComputableLiveData(Executor executor2) {
        C12775o.m28639i(executor2, "executor");
        this.executor = executor2;
        ComputableLiveData$_liveData$1 computableLiveData$_liveData$1 = new ComputableLiveData$_liveData$1(this);
        this._liveData = computableLiveData$_liveData$1;
        this.liveData = computableLiveData$_liveData$1;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new C2338a(this);
        this.invalidationRunnable = new C2339b(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L_0x000d
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.C12775o.m28638h(r1, r2)
        L_0x000d:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }
}
