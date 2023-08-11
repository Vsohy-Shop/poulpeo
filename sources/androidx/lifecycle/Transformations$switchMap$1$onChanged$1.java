package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Transformations.kt */
final class Transformations$switchMap$1$onChanged$1 extends C12777p implements Function1<Y, C11921v> {
    final /* synthetic */ MediatorLiveData<Y> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Transformations$switchMap$1$onChanged$1(MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    public final void invoke(Y y) {
        this.$result.setValue(y);
    }
}
