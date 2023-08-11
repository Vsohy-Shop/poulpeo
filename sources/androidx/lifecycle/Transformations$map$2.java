package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: Transformations.kt */
final class Transformations$map$2 extends C12777p implements Function1 {
    final /* synthetic */ Function $mapFunction;
    final /* synthetic */ MediatorLiveData $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transformations$map$2(MediatorLiveData mediatorLiveData, Function function) {
        super(1);
        this.$result = mediatorLiveData;
        this.$mapFunction = function;
    }

    public final void invoke(Object obj) {
        this.$result.setValue(this.$mapFunction.apply(obj));
    }
}
