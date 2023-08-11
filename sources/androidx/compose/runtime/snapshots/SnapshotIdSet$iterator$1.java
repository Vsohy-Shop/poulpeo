package androidx.compose.runtime.snapshots;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p448vf.C13652i;

@C12739f(mo50609c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", mo50610f = "SnapshotIdSet.kt", mo50611l = {295, 300, 307}, mo50612m = "invokeSuspend")
/* compiled from: SnapshotIdSet.kt */
final class SnapshotIdSet$iterator$1 extends C12745k implements C13088o<C13652i<? super Integer>, C12074d<? super C11921v>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SnapshotIdSet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, C12074d<? super SnapshotIdSet$iterator$1> dVar) {
        super(2, dVar);
        this.this$0 = snapshotIdSet;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, dVar);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r6 = 3
            r7 = 2
            r8 = 64
            r10 = 0
            r12 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r12) goto L_0x003c
            if (r2 == r7) goto L_0x0030
            if (r2 != r6) goto L_0x0028
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$0
            vf.i r7 = (p448vf.C13652i) r7
            p336ef.C11910n.m25701b(r21)
            r9 = r2
            r13 = r6
            r2 = r0
            goto L_0x00f4
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            int r2 = r0.I$0
            java.lang.Object r13 = r0.L$0
            vf.i r13 = (p448vf.C13652i) r13
            p336ef.C11910n.m25701b(r21)
            r9 = r0
            goto L_0x00b7
        L_0x003c:
            int r2 = r0.I$1
            int r13 = r0.I$0
            java.lang.Object r14 = r0.L$1
            int[] r14 = (int[]) r14
            java.lang.Object r15 = r0.L$0
            vf.i r15 = (p448vf.C13652i) r15
            p336ef.C11910n.m25701b(r21)
            r9 = r0
            goto L_0x007b
        L_0x004d:
            p336ef.C11910n.m25701b(r21)
            java.lang.Object r2 = r0.L$0
            vf.i r2 = (p448vf.C13652i) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r0.this$0
            int[] r13 = r13.belowBound
            if (r13 == 0) goto L_0x0080
            int r14 = r13.length
            r9 = r0
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = 0
        L_0x0062:
            if (r13 >= r2) goto L_0x007e
            r17 = r14[r13]
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C12735b.m28560c(r17)
            r9.L$0 = r15
            r9.L$1 = r14
            r9.I$0 = r13
            r9.I$1 = r2
            r9.label = r12
            java.lang.Object r6 = r15.mo53327e(r6, r9)
            if (r6 != r1) goto L_0x007b
            return r1
        L_0x007b:
            int r13 = r13 + r12
            r6 = 3
            goto L_0x0062
        L_0x007e:
            r2 = r15
            goto L_0x0081
        L_0x0080:
            r9 = r0
        L_0x0081:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r13 = r6.lowerSet
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ba
            r13 = r2
            r2 = 0
        L_0x008d:
            if (r2 >= r8) goto L_0x00b9
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r14 = r6.lowerSet
            long r18 = r4 << r2
            long r14 = r14 & r18
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00b7
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            int r6 = r6.lowerBound
            int r6 = r6 + r2
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C12735b.m28560c(r6)
            r9.L$0 = r13
            r9.L$1 = r3
            r9.I$0 = r2
            r9.label = r7
            java.lang.Object r6 = r13.mo53327e(r6, r9)
            if (r6 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            int r2 = r2 + r12
            goto L_0x008d
        L_0x00b9:
            r2 = r13
        L_0x00ba:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r6 = r6.upperSet
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00f6
            r7 = r2
            r2 = r9
            r9 = 0
        L_0x00c7:
            if (r9 >= r8) goto L_0x00f6
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r2.this$0
            long r13 = r6.upperSet
            long r15 = r4 << r9
            long r13 = r13 & r15
            int r6 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00f3
            int r6 = r9 + 64
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r2.this$0
            int r13 = r13.lowerBound
            int r6 = r6 + r13
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.C12735b.m28560c(r6)
            r2.L$0 = r7
            r2.L$1 = r3
            r2.I$0 = r9
            r13 = 3
            r2.label = r13
            java.lang.Object r6 = r7.mo53327e(r6, r2)
            if (r6 != r1) goto L_0x00f4
            return r1
        L_0x00f3:
            r13 = 3
        L_0x00f4:
            int r9 = r9 + r12
            goto L_0x00c7
        L_0x00f6:
            ef.v r1 = p336ef.C11921v.f18618a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13652i<? super Integer> iVar, C12074d<? super C11921v> dVar) {
        return ((SnapshotIdSet$iterator$1) create(iVar, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
