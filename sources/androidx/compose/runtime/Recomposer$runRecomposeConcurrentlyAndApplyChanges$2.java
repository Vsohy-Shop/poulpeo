package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n433#3,3:1410\n436#3,2:1417\n438#3,8:1420\n33#4,4:1413\n38#4:1419\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n749#1:1409\n750#1:1410,3\n750#1:1417,2\n750#1:1420,8\n750#1:1413,4\n750#1:1419\n*E\n"})
@C12739f(mo50609c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", mo50610f = "Recomposer.kt", mo50611l = {746, 766, 767}, mo50612m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends C12746l implements C13089p<C13995l0, MonotonicFrameClock, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C12079g $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(C12079g gVar, Recomposer recomposer, C12074d<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> dVar) {
        super(3, dVar);
        this.$recomposeCoroutineContext = gVar;
        this.this$0 = recomposer;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r2 = r1.label
            r3 = 3
            r4 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r7) goto L_0x002b
            if (r2 == r4) goto L_0x0021
            if (r2 != r3) goto L_0x0019
            p336ef.C11910n.m25701b(r22)
            goto L_0x0184
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0021:
            java.lang.Object r2 = r1.L$0
            yf.y1 r2 = (p466yf.C14054y1) r2
            p336ef.C11910n.m25701b(r22)
            r10 = r1
            goto L_0x0179
        L_0x002b:
            java.lang.Object r2 = r1.L$2
            yf.y1 r2 = (p466yf.C14054y1) r2
            java.lang.Object r8 = r1.L$1
            androidx.compose.runtime.ProduceFrameSignal r8 = (androidx.compose.runtime.ProduceFrameSignal) r8
            java.lang.Object r9 = r1.L$0
            yf.l0 r9 = (p466yf.C13995l0) r9
            p336ef.C11910n.m25701b(r22)
            r14 = r1
            r15 = r9
            goto L_0x00ab
        L_0x003e:
            p336ef.C11910n.m25701b(r22)
            java.lang.Object r2 = r1.L$0
            r8 = r2
            yf.l0 r8 = (p466yf.C13995l0) r8
            java.lang.Object r2 = r1.L$1
            androidx.compose.runtime.MonotonicFrameClock r2 = (androidx.compose.runtime.MonotonicFrameClock) r2
            hf.g r9 = r1.$recomposeCoroutineContext
            yf.y1$b r10 = p466yf.C14054y1.f22970b0
            hf.g$b r9 = r9.get(r10)
            if (r9 != 0) goto L_0x0056
            r9 = r7
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            hf.g r11 = r1.$recomposeCoroutineContext
            if (r9 == 0) goto L_0x0187
            hf.g r9 = r8.getCoroutineContext()
            hf.g r10 = r1.$recomposeCoroutineContext
            hf.g r9 = r9.plus(r10)
            hf.g r10 = r8.getCoroutineContext()
            yf.y1 r10 = p466yf.C13934b2.m32226n(r10)
            yf.z r10 = p466yf.C13934b2.m32213a(r10)
            hf.g r9 = r9.plus(r10)
            yf.l0 r14 = p466yf.C13999m0.m32447a(r9)
            androidx.compose.runtime.ProduceFrameSignal r15 = new androidx.compose.runtime.ProduceFrameSignal
            r15.<init>()
            r9 = 0
            r10 = 0
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 r11 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1
            androidx.compose.runtime.Recomposer r12 = r1.this$0
            r11.<init>(r12, r2, r15, r6)
            r12 = 3
            r13 = 0
            yf.y1 r2 = p466yf.C13985j.m32422d(r8, r9, r10, r11, r12, r13)
            r10 = r1
            r9 = r14
            r8 = r15
        L_0x0090:
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            boolean r11 = r11.getShouldKeepRecomposing()
            if (r11 == 0) goto L_0x0162
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            r10.L$0 = r9
            r10.L$1 = r8
            r10.L$2 = r2
            r10.label = r7
            java.lang.Object r11 = r11.awaitWorkAvailable(r10)
            if (r11 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
            r15 = r9
            r14 = r10
        L_0x00ab:
            androidx.compose.runtime.Recomposer r9 = r14.this$0
            java.lang.Object r16 = r9.stateLock
            androidx.compose.runtime.Recomposer r13 = r14.this$0
            monitor-enter(r16)
            java.util.Set r9 = r13.snapshotInvalidations     // Catch:{ all -> 0x015f }
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x015f }
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x00e0
            java.util.List r10 = r13.knownCompositions     // Catch:{ all -> 0x015f }
            int r11 = r10.size()     // Catch:{ all -> 0x015f }
            r12 = 0
        L_0x00c8:
            if (r12 >= r11) goto L_0x00d8
            java.lang.Object r17 = r10.get(r12)     // Catch:{ all -> 0x015f }
            r5 = r17
            androidx.compose.runtime.ControlledComposition r5 = (androidx.compose.runtime.ControlledComposition) r5     // Catch:{ all -> 0x015f }
            r5.recordModificationsOf(r9)     // Catch:{ all -> 0x015f }
            int r12 = r12 + 1
            goto L_0x00c8
        L_0x00d8:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch:{ all -> 0x015f }
            r5.<init>()     // Catch:{ all -> 0x015f }
            r13.snapshotInvalidations = r5     // Catch:{ all -> 0x015f }
        L_0x00e0:
            java.util.List r5 = r13.compositionInvalidations     // Catch:{ all -> 0x015f }
            int r12 = r5.size()     // Catch:{ all -> 0x015f }
            r11 = 0
        L_0x00e9:
            if (r11 >= r12) goto L_0x0123
            java.lang.Object r9 = r5.get(r11)     // Catch:{ all -> 0x015f }
            androidx.compose.runtime.ControlledComposition r9 = (androidx.compose.runtime.ControlledComposition) r9     // Catch:{ all -> 0x015f }
            int r10 = r13.concurrentCompositionsOutstanding     // Catch:{ all -> 0x015f }
            int r10 = r10 + r7
            r13.concurrentCompositionsOutstanding = r10     // Catch:{ all -> 0x015f }
            hf.g r10 = androidx.compose.runtime.CompositionKt.getRecomposeCoroutineContext(r9)     // Catch:{ all -> 0x015f }
            r17 = 0
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 r7 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1     // Catch:{ all -> 0x015f }
            r7.<init>(r13, r9, r6)     // Catch:{ all -> 0x015f }
            r18 = 2
            r19 = 0
            r9 = r15
            r20 = r11
            r11 = r17
            r17 = r12
            r12 = r7
            r7 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x015f }
            int r11 = r20 + 1
            r13 = r7
            r12 = r17
            r14 = r18
            r7 = 1
            goto L_0x00e9
        L_0x0123:
            r7 = r13
            r18 = r14
            java.util.List r5 = r7.compositionInvalidations     // Catch:{ all -> 0x015f }
            r5.clear()     // Catch:{ all -> 0x015f }
            yf.n r5 = r7.deriveStateLocked()     // Catch:{ all -> 0x015f }
            if (r5 != 0) goto L_0x0153
            boolean r5 = r7.getHasConcurrentFrameWorkLocked()     // Catch:{ all -> 0x015f }
            if (r5 == 0) goto L_0x013e
            hf.d r5 = r8.requestFrameLocked()     // Catch:{ all -> 0x015f }
            goto L_0x013f
        L_0x013e:
            r5 = r6
        L_0x013f:
            monitor-exit(r16)
            if (r5 == 0) goto L_0x014d
            ef.m$a r7 = p336ef.C11907m.f18600b
            ef.v r7 = p336ef.C11921v.f18618a
            java.lang.Object r7 = p336ef.C11907m.m25696a(r7)
            r5.resumeWith(r7)
        L_0x014d:
            r9 = r15
            r10 = r18
            r7 = 1
            goto L_0x0090
        L_0x0153:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x015f }
            java.lang.String r2 = "called outside of runRecomposeAndApplyChanges"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x015f }
            r0.<init>(r2)     // Catch:{ all -> 0x015f }
            throw r0     // Catch:{ all -> 0x015f }
        L_0x015f:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        L_0x0162:
            hf.g r5 = r9.getCoroutineContext()
            yf.y1 r5 = p466yf.C13934b2.m32226n(r5)
            r10.L$0 = r2
            r10.L$1 = r6
            r10.L$2 = r6
            r10.label = r4
            java.lang.Object r4 = p466yf.C13934b2.m32219g(r5, r10)
            if (r4 != r0) goto L_0x0179
            return r0
        L_0x0179:
            r10.L$0 = r6
            r10.label = r3
            java.lang.Object r2 = p466yf.C13934b2.m32219g(r2, r10)
            if (r2 != r0) goto L_0x0184
            return r0
        L_0x0184:
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        L_0x0187:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "recomposeCoroutineContext may not contain a Job; found "
            r0.append(r2)
            hf.g$b r2 = r11.get(r10)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, MonotonicFrameClock monotonicFrameClock, C12074d<? super C11921v> dVar) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, dVar);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = l0Var;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(C11921v.f18618a);
    }
}
