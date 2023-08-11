package androidx.compose.runtime;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,174:1\n122#2,5:175\n122#2,5:180\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n129#1:175,5\n152#1:180,5\n*E\n"})
@C12739f(mo50609c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", mo50610f = "SnapshotFlow.kt", mo50611l = {134, 138, 160}, mo50612m = "invokeSuspend")
/* compiled from: SnapshotFlow.kt */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends C12746l implements C13088o<C10967g<? super T>, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13074a<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(C13074a<? extends T> aVar, C12074d<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> dVar) {
        super(2, dVar);
        this.$block = aVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, dVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    public final Object invoke(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(gVar, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: bg.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A[Catch:{ all -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r2 = r1.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0074
            if (r2 == r6) goto L_0x0057
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.lang.Object r2 = r1.L$5
            java.lang.Object r7 = r1.L$4
            androidx.compose.runtime.snapshots.ObserverHandle r7 = (androidx.compose.runtime.snapshots.ObserverHandle) r7
            java.lang.Object r8 = r1.L$3
            ag.d r8 = (p308ag.C10894d) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.L$0
            bg.g r11 = (p314bg.C10967g) r11
            goto L_0x006d
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0033:
            int r2 = r1.I$0
            java.lang.Object r7 = r1.L$5
            java.lang.Object r8 = r1.L$4
            androidx.compose.runtime.snapshots.ObserverHandle r8 = (androidx.compose.runtime.snapshots.ObserverHandle) r8
            java.lang.Object r9 = r1.L$3
            ag.d r9 = (p308ag.C10894d) r9
            java.lang.Object r10 = r1.L$2
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.Object r11 = r1.L$1
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r12 = r1.L$0
            bg.g r12 = (p314bg.C10967g) r12
            p336ef.C11910n.m25701b(r17)     // Catch:{ all -> 0x0053 }
            r13 = r17
            r14 = r1
            goto L_0x00e4
        L_0x0053:
            r0 = move-exception
            r7 = r8
            goto L_0x015a
        L_0x0057:
            java.lang.Object r2 = r1.L$5
            java.lang.Object r7 = r1.L$4
            androidx.compose.runtime.snapshots.ObserverHandle r7 = (androidx.compose.runtime.snapshots.ObserverHandle) r7
            java.lang.Object r8 = r1.L$3
            ag.d r8 = (p308ag.C10894d) r8
            java.lang.Object r9 = r1.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r10 = r1.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.L$0
            bg.g r11 = (p314bg.C10967g) r11
        L_0x006d:
            p336ef.C11910n.m25701b(r17)     // Catch:{ all -> 0x0071 }
            goto L_0x00c4
        L_0x0071:
            r0 = move-exception
            goto L_0x015a
        L_0x0074:
            p336ef.C11910n.m25701b(r17)
            java.lang.Object r2 = r1.L$0
            r11 = r2
            bg.g r11 = (p314bg.C10967g) r11
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 r9 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
            r9.<init>(r10)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 6
            r8 = 0
            ag.d r8 = p308ag.C10898g.m23419b(r2, r8, r8, r7, r8)
            androidx.compose.runtime.snapshots.Snapshot$Companion r2 = androidx.compose.runtime.snapshots.Snapshot.Companion
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 r7 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
            r7.<init>(r8)
            androidx.compose.runtime.snapshots.ObserverHandle r7 = r2.registerApplyObserver(r7)
            androidx.compose.runtime.snapshots.Snapshot r2 = r2.takeSnapshot(r9)     // Catch:{ all -> 0x0071 }
            of.a<T> r12 = r1.$block     // Catch:{ all -> 0x0071 }
            androidx.compose.runtime.snapshots.Snapshot r13 = r2.makeCurrent()     // Catch:{ all -> 0x0155 }
            java.lang.Object r12 = r12.invoke()     // Catch:{ all -> 0x014f }
            r2.restoreCurrent(r13)     // Catch:{ all -> 0x0155 }
            r2.dispose()     // Catch:{ all -> 0x0071 }
            r1.L$0 = r11     // Catch:{ all -> 0x0071 }
            r1.L$1 = r10     // Catch:{ all -> 0x0071 }
            r1.L$2 = r9     // Catch:{ all -> 0x0071 }
            r1.L$3 = r8     // Catch:{ all -> 0x0071 }
            r1.L$4 = r7     // Catch:{ all -> 0x0071 }
            r1.L$5 = r12     // Catch:{ all -> 0x0071 }
            r1.label = r6     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r11.emit(r12, r1)     // Catch:{ all -> 0x0071 }
            if (r2 != r0) goto L_0x00c3
            return r0
        L_0x00c3:
            r2 = r12
        L_0x00c4:
            r12 = r1
        L_0x00c5:
            r12.L$0 = r11     // Catch:{ all -> 0x0071 }
            r12.L$1 = r10     // Catch:{ all -> 0x0071 }
            r12.L$2 = r9     // Catch:{ all -> 0x0071 }
            r12.L$3 = r8     // Catch:{ all -> 0x0071 }
            r12.L$4 = r7     // Catch:{ all -> 0x0071 }
            r12.L$5 = r2     // Catch:{ all -> 0x0071 }
            r12.I$0 = r3     // Catch:{ all -> 0x0071 }
            r12.label = r5     // Catch:{ all -> 0x0071 }
            java.lang.Object r13 = r8.mo45883b(r12)     // Catch:{ all -> 0x0071 }
            if (r13 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r3
        L_0x00e4:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0053 }
        L_0x00e6:
            if (r2 != 0) goto L_0x00f1
            boolean r2 = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(r11, r13)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r2 = r3
            goto L_0x00f2
        L_0x00f1:
            r2 = r6
        L_0x00f2:
            java.lang.Object r13 = r9.mo45885d()     // Catch:{ all -> 0x0053 }
            java.lang.Object r13 = p308ag.C10899h.m23425f(r13)     // Catch:{ all -> 0x0053 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0053 }
            if (r13 != 0) goto L_0x00e6
            if (r2 == 0) goto L_0x0146
            r11.clear()     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.Snapshot$Companion r2 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.Snapshot r2 = r2.takeSnapshot(r10)     // Catch:{ all -> 0x0053 }
            of.a<T> r13 = r14.$block     // Catch:{ all -> 0x0053 }
            androidx.compose.runtime.snapshots.Snapshot r15 = r2.makeCurrent()     // Catch:{ all -> 0x0141 }
            java.lang.Object r13 = r13.invoke()     // Catch:{ all -> 0x013b }
            r2.restoreCurrent(r15)     // Catch:{ all -> 0x0141 }
            r2.dispose()     // Catch:{ all -> 0x0053 }
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r13, r7)     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0146
            r14.L$0 = r12     // Catch:{ all -> 0x0053 }
            r14.L$1 = r11     // Catch:{ all -> 0x0053 }
            r14.L$2 = r10     // Catch:{ all -> 0x0053 }
            r14.L$3 = r9     // Catch:{ all -> 0x0053 }
            r14.L$4 = r8     // Catch:{ all -> 0x0053 }
            r14.L$5 = r13     // Catch:{ all -> 0x0053 }
            r14.label = r4     // Catch:{ all -> 0x0053 }
            java.lang.Object r2 = r12.emit(r13, r14)     // Catch:{ all -> 0x0053 }
            if (r2 != r0) goto L_0x0134
            return r0
        L_0x0134:
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r2 = r13
            goto L_0x014c
        L_0x013b:
            r0 = move-exception
            r3 = r0
            r2.restoreCurrent(r15)     // Catch:{ all -> 0x0141 }
            throw r3     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            r2.dispose()     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0146:
            r2 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
        L_0x014c:
            r12 = r14
            goto L_0x00c5
        L_0x014f:
            r0 = move-exception
            r3 = r0
            r2.restoreCurrent(r13)     // Catch:{ all -> 0x0155 }
            throw r3     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r0 = move-exception
            r2.dispose()     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x015a:
            r7.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
