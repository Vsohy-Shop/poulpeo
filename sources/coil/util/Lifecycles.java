package coil.util;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nLifecycles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n314#2,11:44\n1#3:55\n*S KotlinDebug\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n*L\n23#1:44,11\n*E\n"})
/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
/* compiled from: Lifecycles.kt */
public final class Lifecycles {

    @C12739f(mo50609c = "coil.util.-Lifecycles", mo50610f = "Lifecycles.kt", mo50611l = {44}, mo50612m = "awaitStarted")
    /* renamed from: coil.util.-Lifecycles$a */
    /* compiled from: Lifecycles.kt */
    static final class C4047a extends C12737d {

        /* renamed from: h */
        Object f3265h;

        /* renamed from: i */
        Object f3266i;

        /* renamed from: j */
        /* synthetic */ Object f3267j;

        /* renamed from: k */
        int f3268k;

        C4047a(C12074d<? super C4047a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f3267j = obj;
            this.f3268k |= Integer.MIN_VALUE;
            return Lifecycles.m4800a((Lifecycle) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @androidx.annotation.MainThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m4800a(androidx.lifecycle.Lifecycle r6, p355hf.C12074d<? super p336ef.C11921v> r7) {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles.C4047a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.C4047a) r0
            int r1 = r0.f3268k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3268k = r1
            goto L_0x0018
        L_0x0013:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f3267j
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f3268k
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f3266i
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f3265h
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            p336ef.C11910n.m25701b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x0085
        L_0x0031:
            r7 = move-exception
            goto L_0x0096
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            p336ef.C11910n.m25701b(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L_0x004d
            ef.v r6 = p336ef.C11921v.f18618a
            return r6
        L_0x004d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.f3265h = r6     // Catch:{ all -> 0x0091 }
            r0.f3266i = r7     // Catch:{ all -> 0x0091 }
            r0.f3268k = r3     // Catch:{ all -> 0x0091 }
            yf.o r2 = new yf.o     // Catch:{ all -> 0x0091 }
            hf.d r4 = p362if.C12147c.m26491b(r0)     // Catch:{ all -> 0x0091 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0091 }
            r2.mo53786B()     // Catch:{ all -> 0x0091 }
            coil.util.-Lifecycles$awaitStarted$2$1 r3 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch:{ all -> 0x0091 }
            r3.<init>(r2)     // Catch:{ all -> 0x0091 }
            r7.f20403b = r3     // Catch:{ all -> 0x0091 }
            kotlin.jvm.internal.C12775o.m28636f(r3)     // Catch:{ all -> 0x0091 }
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3     // Catch:{ all -> 0x0091 }
            r6.addObserver(r3)     // Catch:{ all -> 0x0091 }
            java.lang.Object r2 = r2.mo53797y()     // Catch:{ all -> 0x0091 }
            java.lang.Object r3 = p362if.C12150d.m26492c()     // Catch:{ all -> 0x0091 }
            if (r2 != r3) goto L_0x0080
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r0)     // Catch:{ all -> 0x0091 }
        L_0x0080:
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r0 = r6
            r6 = r7
        L_0x0085:
            T r6 = r6.f20403b
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L_0x008e
            r0.removeObserver(r6)
        L_0x008e:
            ef.v r6 = p336ef.C11921v.f18618a
            return r6
        L_0x0091:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L_0x0096:
            T r6 = r6.f20403b
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L_0x009f
            r0.removeObserver(r6)
        L_0x009f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.m4800a(androidx.lifecycle.Lifecycle, hf.d):java.lang.Object");
    }

    @MainThread
    /* renamed from: b */
    public static final void m4801b(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
