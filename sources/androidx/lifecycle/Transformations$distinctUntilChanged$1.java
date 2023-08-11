package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Transformations.kt */
final class Transformations$distinctUntilChanged$1 extends C12777p implements Function1<X, C11921v> {
    final /* synthetic */ C12755d0 $firstTime;
    final /* synthetic */ MediatorLiveData<X> $outputLiveData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transformations$distinctUntilChanged$1(MediatorLiveData<X> mediatorLiveData, C12755d0 d0Var) {
        super(1);
        this.$outputLiveData = mediatorLiveData;
        this.$firstTime = d0Var;
    }

    public final void invoke(X x) {
        X value = this.$outputLiveData.getValue();
        if (this.$firstTime.f20407b || ((value == null && x != null) || (value != null && !C12775o.m28634d(value, x)))) {
            this.$firstTime.f20407b = false;
            this.$outputLiveData.setValue(x);
        }
    }
}
