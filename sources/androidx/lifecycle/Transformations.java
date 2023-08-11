package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12775o;

/* compiled from: Transformations.kt */
public final class Transformations {
    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        C12775o.m28639i(liveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        C12755d0 d0Var = new C12755d0();
        d0Var.f20407b = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            d0Var.f20407b = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$distinctUntilChanged$1(mediatorLiveData, d0Var)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, Function1<X, Y> function1) {
        C12775o.m28639i(liveData, "<this>");
        C12775o.m28639i(function1, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$1(mediatorLiveData, function1)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, Function1<X, LiveData<Y>> function1) {
        C12775o.m28639i(liveData, "<this>");
        C12775o.m28639i(function1, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$switchMap$1(function1, mediatorLiveData));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, Function function) {
        C12775o.m28639i(liveData, "<this>");
        C12775o.m28639i(function, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$map$2(mediatorLiveData, function)));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, Function function) {
        C12775o.m28639i(liveData, "<this>");
        C12775o.m28639i(function, "switchMapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$switchMap$2(function, mediatorLiveData));
        return mediatorLiveData;
    }
}
