package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;

/* compiled from: Transformations.kt */
final class Transformations$switchMap$2$onChanged$1 extends C12777p implements Function1 {
    final /* synthetic */ MediatorLiveData $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transformations$switchMap$2$onChanged$1(MediatorLiveData mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    public final void invoke(Object obj) {
        this.$result.setValue(obj);
    }
}
