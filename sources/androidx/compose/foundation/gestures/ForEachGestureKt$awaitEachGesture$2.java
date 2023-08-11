package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", mo50610f = "ForEachGesture.kt", mo50611l = {104, 107, 112}, mo50612m = "invokeSuspend")
/* compiled from: ForEachGesture.kt */
final class ForEachGestureKt$awaitEachGesture$2 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> $block;
    final /* synthetic */ C12079g $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ForEachGestureKt$awaitEachGesture$2(C12079g gVar, C13088o<? super AwaitPointerEventScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super ForEachGestureKt$awaitEachGesture$2> dVar) {
        super(2, dVar);
        this.$currentContext = gVar;
        this.$block = oVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(this.$currentContext, this.$block, dVar);
        forEachGestureKt$awaitEachGesture$2.L$0 = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((ForEachGestureKt$awaitEachGesture$2) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[SYNTHETIC, Splitter:B:22:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r4) goto L_0x002a
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r9)
            goto L_0x0028
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r9)     // Catch:{ CancellationException -> 0x0033 }
        L_0x0028:
            r9 = r1
            goto L_0x003e
        L_0x002a:
            java.lang.Object r1 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1
            p336ef.C11910n.m25701b(r9)     // Catch:{ CancellationException -> 0x0033 }
            r9 = r8
            goto L_0x0057
        L_0x0033:
            r9 = move-exception
            r5 = r1
            r1 = r8
            goto L_0x0070
        L_0x0037:
            p336ef.C11910n.m25701b(r9)
            java.lang.Object r9 = r8.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r9
        L_0x003e:
            r1 = r8
        L_0x003f:
            hf.g r5 = r1.$currentContext
            boolean r5 = p466yf.C13934b2.m32227o(r5)
            if (r5 == 0) goto L_0x0086
            of.o<androidx.compose.ui.input.pointer.AwaitPointerEventScope, hf.d<? super ef.v>, java.lang.Object> r5 = r1.$block     // Catch:{ CancellationException -> 0x006c }
            r1.L$0 = r9     // Catch:{ CancellationException -> 0x006c }
            r1.label = r4     // Catch:{ CancellationException -> 0x006c }
            java.lang.Object r5 = r5.invoke(r9, r1)     // Catch:{ CancellationException -> 0x006c }
            if (r5 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0057:
            r9.L$0 = r1     // Catch:{ CancellationException -> 0x0066 }
            r9.label = r3     // Catch:{ CancellationException -> 0x0066 }
            java.lang.Object r5 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp((androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r1, (p355hf.C12074d<? super p336ef.C11921v>) r9)     // Catch:{ CancellationException -> 0x0066 }
            if (r5 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r7 = r1
            r1 = r9
            r9 = r7
            goto L_0x003f
        L_0x0066:
            r5 = move-exception
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r7
            goto L_0x0070
        L_0x006c:
            r5 = move-exception
            r7 = r5
            r5 = r9
            r9 = r7
        L_0x0070:
            hf.g r6 = r1.$currentContext
            boolean r6 = p466yf.C13934b2.m32227o(r6)
            if (r6 == 0) goto L_0x0085
            r1.L$0 = r5
            r1.label = r2
            java.lang.Object r9 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp((androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r5, (p355hf.C12074d<? super p336ef.C11921v>) r1)
            if (r9 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r9 = r5
            goto L_0x003f
        L_0x0085:
            throw r9
        L_0x0086:
            ef.v r9 = p336ef.C11921v.f18618a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
