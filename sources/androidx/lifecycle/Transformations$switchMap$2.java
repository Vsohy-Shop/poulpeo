package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.jvm.internal.C12775o;

/* compiled from: Transformations.kt */
public final class Transformations$switchMap$2 implements Observer {
    final /* synthetic */ MediatorLiveData $result;
    final /* synthetic */ Function $switchMapFunction;
    private LiveData liveData;

    Transformations$switchMap$2(Function function, MediatorLiveData mediatorLiveData) {
        this.$switchMapFunction = function;
        this.$result = mediatorLiveData;
    }

    public final LiveData getLiveData() {
        return this.liveData;
    }

    public void onChanged(Object obj) {
        LiveData liveData2 = (LiveData) this.$switchMapFunction.apply(obj);
        LiveData liveData3 = this.liveData;
        if (liveData3 != liveData2) {
            if (liveData3 != null) {
                MediatorLiveData mediatorLiveData = this.$result;
                C12775o.m28636f(liveData3);
                mediatorLiveData.removeSource(liveData3);
            }
            this.liveData = liveData2;
            if (liveData2 != null) {
                MediatorLiveData mediatorLiveData2 = this.$result;
                C12775o.m28636f(liveData2);
                mediatorLiveData2.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(this.$result)));
            }
        }
    }

    public final void setLiveData(LiveData liveData2) {
        this.liveData = liveData2;
    }
}
