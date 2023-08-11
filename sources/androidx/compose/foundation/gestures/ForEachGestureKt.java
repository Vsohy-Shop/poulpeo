package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n329#2:122\n329#2:141\n101#3,2:123\n33#3,6:125\n103#3:131\n101#3,2:132\n33#3,6:134\n103#3:140\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:122\n100#1:141\n71#1:123,2\n71#1:125,6\n71#1:131\n87#1:132,2\n87#1:134,6\n87#1:140\n*E\n"})
/* compiled from: ForEachGesture.kt */
public final class ForEachGestureKt {
    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        C12775o.m28639i(awaitPointerEventScope, "<this>");
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (changes.get(i).getPressed()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitAllPointersUp$2((C12074d<? super ForEachGestureKt$awaitAllPointersUp$2>) null), dVar);
        return awaitPointerEventScope == C12150d.m26492c() ? awaitPointerEventScope : C11921v.f18618a;
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, C13088o<? super AwaitPointerEventScope, ? super C12074d<? super C11921v>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitEachGesture$2(dVar.getContext(), oVar, (C12074d<? super ForEachGestureKt$awaitEachGesture$2>) null), dVar);
        if (awaitPointerEventScope == C12150d.m26492c()) {
            return awaitPointerEventScope;
        }
        return C11921v.f18618a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC, Splitter:B:25:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object forEachGesture(androidx.compose.p002ui.input.pointer.PointerInputScope r8, p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputScope, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object> r9, p355hf.C12074d<? super p336ef.C11921v> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r8 = r0.L$2
            hf.g r8 = (p355hf.C12079g) r8
            java.lang.Object r9 = r0.L$1
            of.o r9 = (p404of.C13088o) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p002ui.input.pointer.PointerInputScope) r2
            p336ef.C11910n.m25701b(r10)
            goto L_0x0052
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            java.lang.Object r8 = r0.L$2
            hf.g r8 = (p355hf.C12079g) r8
            java.lang.Object r9 = r0.L$1
            of.o r9 = (p404of.C13088o) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p002ui.input.pointer.PointerInputScope) r2
            p336ef.C11910n.m25701b(r10)     // Catch:{ CancellationException -> 0x0065 }
        L_0x0052:
            r10 = r8
            r8 = r2
            goto L_0x006e
        L_0x0055:
            java.lang.Object r8 = r0.L$2
            hf.g r8 = (p355hf.C12079g) r8
            java.lang.Object r9 = r0.L$1
            of.o r9 = (p404of.C13088o) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.p002ui.input.pointer.PointerInputScope) r2
            p336ef.C11910n.m25701b(r10)     // Catch:{ CancellationException -> 0x0065 }
            goto L_0x0085
        L_0x0065:
            r10 = move-exception
            goto L_0x0099
        L_0x0067:
            p336ef.C11910n.m25701b(r10)
            hf.g r10 = r0.getContext()
        L_0x006e:
            boolean r2 = p466yf.C13934b2.m32227o(r10)
            if (r2 == 0) goto L_0x00af
            r0.L$0 = r8     // Catch:{ CancellationException -> 0x0094 }
            r0.L$1 = r9     // Catch:{ CancellationException -> 0x0094 }
            r0.L$2 = r10     // Catch:{ CancellationException -> 0x0094 }
            r0.label = r5     // Catch:{ CancellationException -> 0x0094 }
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch:{ CancellationException -> 0x0094 }
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r8
            r8 = r10
        L_0x0085:
            r0.L$0 = r2     // Catch:{ CancellationException -> 0x0065 }
            r0.L$1 = r9     // Catch:{ CancellationException -> 0x0065 }
            r0.L$2 = r8     // Catch:{ CancellationException -> 0x0065 }
            r0.label = r4     // Catch:{ CancellationException -> 0x0065 }
            java.lang.Object r10 = awaitAllPointersUp((androidx.compose.p002ui.input.pointer.PointerInputScope) r2, (p355hf.C12074d<? super p336ef.C11921v>) r0)     // Catch:{ CancellationException -> 0x0065 }
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x0094:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L_0x0099:
            boolean r6 = p466yf.C13934b2.m32227o(r8)
            if (r6 == 0) goto L_0x00ae
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r10 = awaitAllPointersUp((androidx.compose.p002ui.input.pointer.PointerInputScope) r2, (p355hf.C12074d<? super p336ef.C11921v>) r0)
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x00ae:
            throw r10
        L_0x00af:
            ef.v r8 = p336ef.C11921v.f18618a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, of.o, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (allPointersUp(r7) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r4 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        return p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:23:0x006a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.p002ui.input.pointer.AwaitPointerEventScope r7, p355hf.C12074d<? super p336ef.C11921v> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.p002ui.input.pointer.AwaitPointerEventScope) r7
            p336ef.C11910n.m25701b(r8)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            p336ef.C11910n.m25701b(r8)
            boolean r8 = allPointersUp(r7)
            if (r8 != 0) goto L_0x006c
        L_0x003e:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.awaitPointerEvent(r8, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.p002ui.input.pointer.PointerEvent) r8
            java.util.List r8 = r8.getChanges()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L_0x0057:
            if (r5 >= r2) goto L_0x006a
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L_0x0067
            r4 = r3
            goto L_0x006a
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0057
        L_0x006a:
            if (r4 != 0) goto L_0x003e
        L_0x006c:
            ef.v r7 = p336ef.C11921v.f18618a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, hf.d):java.lang.Object");
    }
}
