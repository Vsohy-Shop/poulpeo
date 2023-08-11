package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: Transformations.kt */
public final class Transformations$switchMap$1 implements Observer<X> {
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ Function1<X, LiveData<Y>> $transform;
    private LiveData<Y> liveData;

    Transformations$switchMap$1(Function1<X, LiveData<Y>> function1, MediatorLiveData<Y> mediatorLiveData) {
        this.$transform = function1;
        this.$result = mediatorLiveData;
    }

    public final LiveData<Y> getLiveData() {
        return this.liveData;
    }

    public void onChanged(X x) {
        LiveData<Y> invoke = this.$transform.invoke(x);
        LiveData<Y> liveData2 = this.liveData;
        if (liveData2 != invoke) {
            if (liveData2 != null) {
                MediatorLiveData<Y> mediatorLiveData = this.$result;
                C12775o.m28636f(liveData2);
                mediatorLiveData.removeSource(liveData2);
            }
            this.liveData = invoke;
            if (invoke != null) {
                MediatorLiveData<Y> mediatorLiveData2 = this.$result;
                C12775o.m28636f(invoke);
                mediatorLiveData2.addSource(invoke, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1$onChanged$1(this.$result)));
            }
        }
    }

    public final void setLiveData(LiveData<Y> liveData2) {
        this.liveData = liveData2;
    }
}
