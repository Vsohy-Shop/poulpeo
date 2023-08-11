package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12768j0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,176:1\n37#2,2:177\n37#2,2:179\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n*L\n121#1:177,2\n124#1:179,2\n*E\n"})
/* compiled from: ComposableLambdaN.jvm.kt */
final class ComposableLambdaNImpl$invoke$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ Object[] $args;
    final /* synthetic */ int $realParams;
    final /* synthetic */ ComposableLambdaNImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposableLambdaNImpl$invoke$1(Object[] objArr, int i, ComposableLambdaNImpl composableLambdaNImpl) {
        super(2);
        this.$args = objArr;
        this.$realParams = i;
        this.this$0 = composableLambdaNImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        C12775o.m28639i(composer, "nc");
        Object[] array = C12710p.m28399a0(this.$args, C13537l.m30893t(0, this.$realParams)).toArray(new Object[0]);
        Object obj = this.$args[this.$realParams + 1];
        C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object[] objArr = this.$args;
        Object[] array2 = C12710p.m28399a0(objArr, C13537l.m30893t(this.$realParams + 2, objArr.length)).toArray(new Object[0]);
        ComposableLambdaNImpl composableLambdaNImpl = this.this$0;
        C12768j0 j0Var = new C12768j0(4);
        j0Var.mo50669b(array);
        j0Var.mo50668a(composer);
        j0Var.mo50668a(Integer.valueOf(intValue | 1));
        j0Var.mo50669b(array2);
        composableLambdaNImpl.invoke(j0Var.mo50671d(new Object[j0Var.mo50670c()]));
    }
}
