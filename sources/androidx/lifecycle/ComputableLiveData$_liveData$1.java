package androidx.lifecycle;

/* compiled from: ComputableLiveData.kt */
public final class ComputableLiveData$_liveData$1 extends LiveData<T> {
    final /* synthetic */ ComputableLiveData<T> this$0;

    ComputableLiveData$_liveData$1(ComputableLiveData<T> computableLiveData) {
        this.this$0 = computableLiveData;
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
    }
}
