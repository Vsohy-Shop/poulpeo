package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n33#3,6:1411\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n496#1:1409\n485#1:1410\n486#1:1411,6\n*E\n"})
@C12739f(mo50609c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", mo50610f = "Recomposer.kt", mo50611l = {492, 510}, mo50612m = "invokeSuspend")
/* compiled from: Recomposer.kt */
final class Recomposer$runRecomposeAndApplyChanges$2 extends C12746l implements C13089p<C13995l0, MonotonicFrameClock, C12074d<? super C11921v>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, C12074d<? super Recomposer$runRecomposeAndApplyChanges$2> dVar) {
        super(3, dVar);
        this.this$0 = recomposer;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.stateLock) {
            List access$getCompositionValuesAwaitingInsert$p = recomposer.compositionValuesAwaitingInsert;
            int size = access$getCompositionValuesAwaitingInsert$p.size();
            for (int i = 0; i < size; i++) {
                list.add((MovableContentStateReference) access$getCompositionValuesAwaitingInsert$p.get(i));
            }
            recomposer.compositionValuesAwaitingInsert.clear();
            C11921v vVar = C11921v.f18618a;
        }
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
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r2 = r1.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            androidx.compose.runtime.MonotonicFrameClock r9 = (androidx.compose.runtime.MonotonicFrameClock) r9
            p336ef.C11910n.m25701b(r19)
            r10 = r1
            r14 = r6
            r6 = r3
            r16 = r9
            r9 = r2
            r2 = r16
            r17 = r8
            r8 = r5
            r5 = r17
            goto L_0x00fd
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            androidx.compose.runtime.MonotonicFrameClock r9 = (androidx.compose.runtime.MonotonicFrameClock) r9
            p336ef.C11910n.m25701b(r19)
            r11 = r1
            r10 = r2
            r15 = r5
            r14 = r6
            r13 = r7
            r12 = r8
            r2 = r9
            goto L_0x00ab
        L_0x0065:
            p336ef.C11910n.m25701b(r19)
            java.lang.Object r2 = r1.L$0
            androidx.compose.runtime.MonotonicFrameClock r2 = (androidx.compose.runtime.MonotonicFrameClock) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r10 = r1
        L_0x0086:
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            boolean r11 = r11.getShouldKeepRecomposing()
            if (r11 == 0) goto L_0x010b
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            r10.L$0 = r2
            r10.L$1 = r5
            r10.L$2 = r6
            r10.L$3 = r7
            r10.L$4 = r8
            r10.L$5 = r9
            r10.label = r4
            java.lang.Object r11 = r11.awaitWorkAvailable(r10)
            if (r11 != r0) goto L_0x00a5
            return r0
        L_0x00a5:
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
            r11 = r10
            r10 = r9
        L_0x00ab:
            androidx.compose.runtime.Recomposer r5 = r11.this$0
            java.lang.Object r5 = r5.stateLock
            androidx.compose.runtime.Recomposer r6 = r11.this$0
            monitor-enter(r5)
            boolean r7 = r6.getHasFrameWorkLocked()     // Catch:{ all -> 0x0108 }
            r8 = 0
            if (r7 != 0) goto L_0x00c5
            r6.recordComposerModificationsLocked()     // Catch:{ all -> 0x0108 }
            boolean r6 = r6.getHasFrameWorkLocked()     // Catch:{ all -> 0x0108 }
            if (r6 != 0) goto L_0x00c5
            r8 = r4
        L_0x00c5:
            monitor-exit(r5)
            if (r8 == 0) goto L_0x00cf
            r9 = r10
            r10 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            goto L_0x0086
        L_0x00cf:
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2 r9 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2
            androidx.compose.runtime.Recomposer r6 = r11.this$0
            r5 = r9
            r7 = r12
            r8 = r13
            r4 = r9
            r9 = r15
            r19 = r10
            r10 = r14
            r3 = r11
            r11 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.L$0 = r2
            r3.L$1 = r12
            r3.L$2 = r13
            r3.L$3 = r14
            r3.L$4 = r15
            r9 = r19
            r3.L$5 = r9
            r6 = 2
            r3.label = r6
            java.lang.Object r4 = r2.withFrameNanos(r4, r3)
            if (r4 != r0) goto L_0x00f9
            return r0
        L_0x00f9:
            r10 = r3
            r5 = r12
            r7 = r13
            r8 = r15
        L_0x00fd:
            androidx.compose.runtime.Recomposer r3 = r10.this$0
            r3.discardUnusedValues()
            r3 = r6
            r6 = r7
            r7 = r14
            r4 = 1
            goto L_0x0086
        L_0x0108:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x010b:
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, MonotonicFrameClock monotonicFrameClock, C12074d<? super C11921v> dVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, dVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C11921v.f18618a);
    }
}
