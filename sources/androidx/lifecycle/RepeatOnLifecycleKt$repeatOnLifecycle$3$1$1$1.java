package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p356hg.C12088a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14002n;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements LifecycleEventObserver {
    final /* synthetic */ C13995l0 $$this$coroutineScope;
    final /* synthetic */ C13088o<C13995l0, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ Lifecycle.Event $cancelWorkEvent;
    final /* synthetic */ C14002n<C11921v> $cont;
    final /* synthetic */ Ref$ObjectRef<C14054y1> $launchedJob;
    final /* synthetic */ C12088a $mutex;
    final /* synthetic */ Lifecycle.Event $startWorkEvent;

    @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n107#2,10:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n109#1:166,10\n*E\n"})
    @C12739f(mo50609c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", mo50610f = "RepeatOnLifecycle.kt", mo50611l = {171, 110}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
    /* compiled from: RepeatOnLifecycle.kt */
    static final class C23341 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C23341(aVar, oVar, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            C12088a aVar;
            C12088a aVar2;
            C13088o<C13995l0, C12074d<? super C11921v>, Object> oVar;
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                aVar2 = aVar;
                oVar = oVar;
                this.L$0 = aVar2;
                this.L$1 = oVar;
                this.label = 1;
                if (aVar2.mo49516a((Object) null, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                oVar = (C13088o) this.L$1;
                C11910n.m25701b(obj);
                aVar2 = (C12088a) this.L$0;
            } else if (i == 2) {
                aVar = (C12088a) this.L$0;
                try {
                    C11910n.m25701b(obj);
                    C11921v vVar = C11921v.f18618a;
                    aVar.mo49519f((Object) null);
                    return C11921v.f18618a;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(oVar, (C12074d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1>) null);
                this.L$0 = aVar2;
                this.L$1 = null;
                this.label = 2;
                if (C13999m0.m32451e(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == c) {
                    return c;
                }
                aVar = aVar2;
                C11921v vVar2 = C11921v.f18618a;
                aVar.mo49519f((Object) null);
                return C11921v.f18618a;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                aVar = aVar2;
                th = th4;
                aVar.mo49519f((Object) null);
                throw th;
            }
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C23341) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.Event event, Ref$ObjectRef<C14054y1> ref$ObjectRef, C13995l0 l0Var, Lifecycle.Event event2, C14002n<? super C11921v> nVar, C12088a aVar, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        this.$startWorkEvent = event;
        this.$launchedJob = ref$ObjectRef;
        this.$$this$coroutineScope = l0Var;
        this.$cancelWorkEvent = event2;
        this.$cont = nVar;
        this.$mutex = aVar;
        this.$block = oVar;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C12775o.m28639i(lifecycleOwner, "<anonymous parameter 0>");
        C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
        if (event == this.$startWorkEvent) {
            Ref$ObjectRef<C14054y1> ref$ObjectRef = this.$launchedJob;
            C13995l0 l0Var = this.$$this$coroutineScope;
            final C12088a aVar = this.$mutex;
            final C13088o<C13995l0, C12074d<? super C11921v>, Object> oVar = this.$block;
            ref$ObjectRef.f20403b = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C23341((C12074d<? super C23341>) null), 3, (Object) null);
            return;
        }
        if (event == this.$cancelWorkEvent) {
            C14054y1 y1Var = (C14054y1) this.$launchedJob.f20403b;
            if (y1Var != null) {
                C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
            }
            this.$launchedJob.f20403b = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            C14002n<C11921v> nVar = this.$cont;
            C11907m.C11908a aVar2 = C11907m.f18600b;
            nVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }
}
