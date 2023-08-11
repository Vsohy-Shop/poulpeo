package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Composer.kt */
final class Updater$reconcile$1 extends C12777p implements C13088o<T, C11921v, C11921v> {
    final /* synthetic */ Function1<T, C11921v> $block;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Updater$reconcile$1(Function1<? super T, C11921v> function1) {
        super(2);
        this.$block = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(obj, (C11921v) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(T t, C11921v vVar) {
        C12775o.m28639i(vVar, "it");
        this.$block.invoke(t);
    }
}
