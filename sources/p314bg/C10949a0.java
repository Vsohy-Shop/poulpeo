package p314bg;

import kotlin.jvm.internal.SourceDebugExtension;
import p320cg.C11062c;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
/* renamed from: bg.a0 */
/* compiled from: SharedFlow.kt */
public final class C10949a0 extends C11062c<C11029y<?>> {

    /* renamed from: a */
    public long f16890a = -1;

    /* renamed from: b */
    public C12074d<? super C11921v> f16891b;

    /* renamed from: c */
    public boolean mo46017a(C11029y<?> yVar) {
        if (this.f16890a >= 0) {
            return false;
        }
        this.f16890a = yVar.mo46064X();
        return true;
    }

    /* renamed from: d */
    public C12074d<C11921v>[] mo46018b(C11029y<?> yVar) {
        long j = this.f16890a;
        this.f16890a = -1;
        this.f16891b = null;
        return yVar.mo46063W(j);
    }
}
