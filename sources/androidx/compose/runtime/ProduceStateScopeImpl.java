package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,224:1\n314#2,11:225\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n51#1:225,11\n*E\n"})
/* compiled from: ProduceState.kt */
final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final C12079g coroutineContext;

    public ProduceStateScopeImpl(MutableState<T> mutableState, C12079g gVar) {
        C12775o.m28639i(mutableState, "state");
        C12775o.m28639i(gVar, "coroutineContext");
        this.coroutineContext = gVar;
        this.$$delegate_0 = mutableState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object awaitDispose(p404of.C13074a<p336ef.C11921v> r5, p355hf.C12074d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002d:
            java.lang.Object r5 = r0.L$0
            of.a r5 = (p404of.C13074a) r5
            p336ef.C11910n.m25701b(r6)     // Catch:{ all -> 0x005e }
            goto L_0x0058
        L_0x0035:
            p336ef.C11910n.m25701b(r6)
            r0.L$0 = r5     // Catch:{ all -> 0x005e }
            r0.label = r3     // Catch:{ all -> 0x005e }
            yf.o r6 = new yf.o     // Catch:{ all -> 0x005e }
            hf.d r2 = p362if.C12147c.m26491b(r0)     // Catch:{ all -> 0x005e }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x005e }
            r6.mo53786B()     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = r6.mo53797y()     // Catch:{ all -> 0x005e }
            java.lang.Object r2 = p362if.C12150d.m26492c()     // Catch:{ all -> 0x005e }
            if (r6 != r2) goto L_0x0055
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r0)     // Catch:{ all -> 0x005e }
        L_0x0055:
            if (r6 != r1) goto L_0x0058
            return r1
        L_0x0058:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x005e }
            r6.<init>()     // Catch:{ all -> 0x005e }
            throw r6     // Catch:{ all -> 0x005e }
        L_0x005e:
            r6 = move-exception
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose(of.a, hf.d):java.lang.Object");
    }

    public T component1() {
        return this.$$delegate_0.component1();
    }

    public Function1<T, C11921v> component2() {
        return this.$$delegate_0.component2();
    }

    public C12079g getCoroutineContext() {
        return this.coroutineContext;
    }

    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }
}
