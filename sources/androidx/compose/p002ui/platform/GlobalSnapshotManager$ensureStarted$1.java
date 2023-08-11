package androidx.compose.p002ui.platform;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10894d;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,55:1\n103#2:56\n80#2,6:57\n104#2,2:63\n90#2:65\n86#2,4:66\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n45#1:56\n45#1:57,6\n45#1:63,2\n45#1:65\n45#1:66,4\n*E\n"})
@C12739f(mo50609c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", mo50610f = "GlobalSnapshotManager.android.kt", mo50611l = {63}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 */
/* compiled from: GlobalSnapshotManager.android.kt */
final class GlobalSnapshotManager$ensureStarted$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C10894d<C11921v> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GlobalSnapshotManager$ensureStarted$1(C10894d<C11921v> dVar, C12074d<? super GlobalSnapshotManager$ensureStarted$1> dVar2) {
        super(2, dVar2);
        this.$channel = dVar;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r6.L$1
            ag.f r1 = (p308ag.C10897f) r1
            java.lang.Object r3 = r6.L$0
            ag.r r3 = (p308ag.C10914r) r3
            p336ef.C11910n.m25701b(r7)     // Catch:{ all -> 0x0063 }
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
            goto L_0x0041
        L_0x001b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0023:
            p336ef.C11910n.m25701b(r7)
            ag.d<ef.v> r3 = r6.$channel
            ag.f r7 = r3.iterator()     // Catch:{ all -> 0x0063 }
            r1 = r7
            r7 = r6
        L_0x002e:
            r7.L$0 = r3     // Catch:{ all -> 0x0063 }
            r7.L$1 = r1     // Catch:{ all -> 0x0063 }
            r7.label = r2     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r1.mo45899a(r7)     // Catch:{ all -> 0x0063 }
            if (r4 != r0) goto L_0x003b
            return r0
        L_0x003b:
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0041:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0060 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0059
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x0060 }
            ef.v r7 = (p336ef.C11921v) r7     // Catch:{ all -> 0x0060 }
            androidx.compose.runtime.snapshots.Snapshot$Companion r7 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch:{ all -> 0x0060 }
            r7.sendApplyNotifications()     // Catch:{ all -> 0x0060 }
            r7 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x002e
        L_0x0059:
            r7 = 0
            p308ag.C10905k.m23448a(r4, r7)
            ef.v r7 = p336ef.C11921v.f18618a
            return r7
        L_0x0060:
            r7 = move-exception
            r3 = r4
            goto L_0x0064
        L_0x0063:
            r7 = move-exception
        L_0x0064:
            throw r7     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            p308ag.C10905k.m23448a(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
