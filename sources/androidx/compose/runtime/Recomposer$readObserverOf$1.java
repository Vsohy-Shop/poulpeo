package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Recomposer.kt */
final class Recomposer$readObserverOf$1 extends C12777p implements Function1<Object, C11921v> {
    final /* synthetic */ ControlledComposition $composition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$readObserverOf$1(ControlledComposition controlledComposition) {
        super(1);
        this.$composition = controlledComposition;
    }

    public final void invoke(Object obj) {
        C12775o.m28639i(obj, "value");
        this.$composition.recordReadOf(obj);
    }
}
