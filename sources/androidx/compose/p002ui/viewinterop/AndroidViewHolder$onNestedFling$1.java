package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p002ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", mo50610f = "AndroidViewHolder.android.kt", mo50611l = {523, 528}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$onNestedFling$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedFling$1(boolean z, AndroidViewHolder androidViewHolder, long j, C12074d<? super AndroidViewHolder$onNestedFling$1> dVar) {
        super(2, dVar);
        this.$consumed = z;
        this.this$0 = androidViewHolder;
        this.$viewVelocity = j;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new AndroidViewHolder$onNestedFling$1(this.$consumed, this.this$0, this.$viewVelocity, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (!this.$consumed) {
                NestedScrollDispatcher access$getDispatcher$p = this.this$0.dispatcher;
                long r5 = Velocity.Companion.m38704getZero9UxMQ8M();
                long j = this.$viewVelocity;
                this.label = 1;
                if (access$getDispatcher$p.m37052dispatchPostFlingRZ2iAVY(r5, j, this) == c) {
                    return c;
                }
            } else {
                NestedScrollDispatcher access$getDispatcher$p2 = this.this$0.dispatcher;
                long j2 = this.$viewVelocity;
                long r6 = Velocity.Companion.m38704getZero9UxMQ8M();
                this.label = 2;
                if (access$getDispatcher$p2.m37052dispatchPostFlingRZ2iAVY(j2, r6, this) == c) {
                    return c;
                }
            }
        } else if (i == 1 || i == 2) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((AndroidViewHolder$onNestedFling$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
