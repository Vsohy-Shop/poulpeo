package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", mo50610f = "AndroidViewHolder.android.kt", mo50611l = {541}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$onNestedPreFling$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ long $toBeConsumed;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j, C12074d<? super AndroidViewHolder$onNestedPreFling$1> dVar) {
        super(2, dVar);
        this.this$0 = androidViewHolder;
        this.$toBeConsumed = j;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new AndroidViewHolder$onNestedPreFling$1(this.this$0, this.$toBeConsumed, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            NestedScrollDispatcher access$getDispatcher$p = this.this$0.dispatcher;
            long j = this.$toBeConsumed;
            this.label = 1;
            if (access$getDispatcher$p.m37054dispatchPreFlingQWom1Mo(j, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((AndroidViewHolder$onNestedPreFling$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
