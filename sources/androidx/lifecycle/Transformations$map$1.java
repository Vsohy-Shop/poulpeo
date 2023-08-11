package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Transformations.kt */
final class Transformations$map$1 extends C12777p implements Function1<X, C11921v> {
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ Function1<X, Y> $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transformations$map$1(MediatorLiveData<Y> mediatorLiveData, Function1<X, Y> function1) {
        super(1);
        this.$result = mediatorLiveData;
        this.$transform = function1;
    }

    public final void invoke(X x) {
        this.$result.setValue(this.$transform.invoke(x));
    }
}
