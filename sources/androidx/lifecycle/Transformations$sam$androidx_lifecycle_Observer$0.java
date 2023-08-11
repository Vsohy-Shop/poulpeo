package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12765i;
import kotlin.jvm.internal.C12775o;
import p336ef.C11895c;

/* compiled from: Transformations.kt */
final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, C12765i {
    private final /* synthetic */ Function1 function;

    Transformations$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        C12775o.m28639i(function1, "function");
        this.function = function1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Observer) || !(obj instanceof C12765i)) {
            return false;
        }
        return C12775o.m28634d(getFunctionDelegate(), ((C12765i) obj).getFunctionDelegate());
    }

    public final C11895c<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
