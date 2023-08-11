package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", mo50610f = "Recomposer.kt", mo50611l = {68, 70}, mo50612m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class RecomposerKt$withRunningRecomposer$2 extends C12746l implements C13088o<C13995l0, C12074d<? super R>, Object> {
    final /* synthetic */ C13089p<C13995l0, Recomposer, C12074d<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", mo50610f = "Recomposer.kt", mo50611l = {67}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1 */
    /* compiled from: Recomposer.kt */
    static final class C09441 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C09441(recomposer, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                Recomposer recomposer = recomposer;
                this.label = 1;
                if (recomposer.runRecomposeAndApplyChanges(this) == c) {
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
            return ((C09441) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecomposerKt$withRunningRecomposer$2(C13089p<? super C13995l0, ? super Recomposer, ? super C12074d<? super R>, ? extends Object> pVar, C12074d<? super RecomposerKt$withRunningRecomposer$2> dVar) {
        super(2, dVar);
        this.$block = pVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, dVar);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    public final Object invokeSuspend(Object obj) {
        final Recomposer recomposer;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            C13995l0 l0Var = (C13995l0) this.L$0;
            recomposer = new Recomposer(l0Var.getCoroutineContext());
            C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C09441((C12074d<? super C09441>) null), 3, (Object) null);
            C13089p<C13995l0, Recomposer, C12074d<? super R>, Object> pVar = this.$block;
            this.L$0 = recomposer;
            this.label = 1;
            obj = pVar.invoke(l0Var, recomposer, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            recomposer = (Recomposer) this.L$0;
            C11910n.m25701b(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            C11910n.m25701b(obj);
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        recomposer.close();
        this.L$0 = obj;
        this.label = 2;
        if (recomposer.join(this) == c) {
            return c;
        }
        return obj;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super R> dVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
