package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13970h;
import p466yf.C13988j2;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", mo50610f = "RepeatOnLifecycle.kt", mo50611l = {84}, mo50612m = "invokeSuspend")
/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<C13995l0, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    @C12739f(mo50609c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", mo50610f = "RepeatOnLifecycle.kt", mo50611l = {166}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* compiled from: RepeatOnLifecycle.kt */
    static final class C23331 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C23331(lifecycle, state, l0Var, oVar, dVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r2 = r1.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 != r4) goto L_0x0030
                java.lang.Object r0 = r1.L$5
                of.o r0 = (p404of.C13088o) r0
                java.lang.Object r0 = r1.L$4
                yf.l0 r0 = (p466yf.C13995l0) r0
                java.lang.Object r0 = r1.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r1.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r1.L$1
                r2 = r0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r0 = r1.L$0
                r5 = r0
                kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
                p336ef.C11910n.m25701b(r17)     // Catch:{ all -> 0x002d }
                goto L_0x00ac
            L_0x002d:
                r0 = move-exception
                goto L_0x00c7
            L_0x0030:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0038:
                p336ef.C11910n.m25701b(r17)
                androidx.lifecycle.Lifecycle r2 = r4
                androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r5) goto L_0x0048
                ef.v r0 = p336ef.C11921v.f18618a
                return r0
            L_0x0048:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
                r13.<init>()
                androidx.lifecycle.Lifecycle$State r5 = r5     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle r14 = r4     // Catch:{ all -> 0x00c4 }
                yf.l0 r8 = r6     // Catch:{ all -> 0x00c4 }
                of.o<yf.l0, hf.d<? super ef.v>, java.lang.Object> r12 = r7     // Catch:{ all -> 0x00c4 }
                r1.L$0 = r2     // Catch:{ all -> 0x00c4 }
                r1.L$1 = r13     // Catch:{ all -> 0x00c4 }
                r1.L$2 = r5     // Catch:{ all -> 0x00c4 }
                r1.L$3 = r14     // Catch:{ all -> 0x00c4 }
                r1.L$4 = r8     // Catch:{ all -> 0x00c4 }
                r1.L$5 = r12     // Catch:{ all -> 0x00c4 }
                r1.label = r4     // Catch:{ all -> 0x00c4 }
                yf.o r15 = new yf.o     // Catch:{ all -> 0x00c4 }
                hf.d r6 = p362if.C12147c.m26491b(r16)     // Catch:{ all -> 0x00c4 }
                r15.<init>(r6, r4)     // Catch:{ all -> 0x00c4 }
                r15.mo53786B()     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle$Event$Companion r6 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle$Event r7 = r6.upTo(r5)     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.Lifecycle$Event r9 = r6.downFrom(r5)     // Catch:{ all -> 0x00c4 }
                r5 = 0
                hg.a r11 = p356hg.C12096c.m26296b(r5, r4, r3)     // Catch:{ all -> 0x00c4 }
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r10 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x00c4 }
                r5 = r10
                r6 = r7
                r7 = r2
                r3 = r10
                r10 = r15
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c4 }
                r13.f20403b = r3     // Catch:{ all -> 0x00c4 }
                java.lang.String r5 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                kotlin.jvm.internal.C12775o.m28637g(r3, r5)     // Catch:{ all -> 0x00c4 }
                r10 = r3
                androidx.lifecycle.LifecycleEventObserver r10 = (androidx.lifecycle.LifecycleEventObserver) r10     // Catch:{ all -> 0x00c4 }
                r14.addObserver(r10)     // Catch:{ all -> 0x00c4 }
                java.lang.Object r3 = r15.mo53797y()     // Catch:{ all -> 0x00c4 }
                java.lang.Object r5 = p362if.C12150d.m26492c()     // Catch:{ all -> 0x00c4 }
                if (r3 != r5) goto L_0x00a7
                kotlin.coroutines.jvm.internal.C12741h.m28573c(r16)     // Catch:{ all -> 0x00c4 }
            L_0x00a7:
                if (r3 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                r5 = r2
                r2 = r13
            L_0x00ac:
                T r0 = r5.f20403b
                yf.y1 r0 = (p466yf.C14054y1) r0
                if (r0 == 0) goto L_0x00b6
                r3 = 0
                p466yf.C14054y1.C14055a.m32600a(r0, r3, r4, r3)
            L_0x00b6:
                T r0 = r2.f20403b
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 == 0) goto L_0x00c1
                androidx.lifecycle.Lifecycle r2 = r4
                r2.removeObserver(r0)
            L_0x00c1:
                ef.v r0 = p336ef.C11921v.f18618a
                return r0
            L_0x00c4:
                r0 = move-exception
                r5 = r2
                r2 = r13
            L_0x00c7:
                T r3 = r5.f20403b
                yf.y1 r3 = (p466yf.C14054y1) r3
                if (r3 == 0) goto L_0x00d1
                r5 = 0
                p466yf.C14054y1.C14055a.m32600a(r3, r5, r4, r5)
            L_0x00d1:
                T r2 = r2.f20403b
                androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
                if (r2 == 0) goto L_0x00dc
                androidx.lifecycle.Lifecycle r3 = r4
                r3.removeObserver(r2)
            L_0x00dc:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.C23331.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C23331) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C13995l0 l0Var = (C13995l0) this.L$0;
            C13988j2 t0 = C13933b1.m32212c().mo49059t0();
            final Lifecycle lifecycle = this.$this_repeatOnLifecycle;
            final Lifecycle.State state = this.$state;
            final C13088o<C13995l0, C12074d<? super C11921v>, Object> oVar = this.$block;
            C23331 r3 = new C23331((C12074d<? super C23331>) null);
            this.label = 1;
            if (C13970h.m32378g(t0, r3, this) == c) {
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
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
