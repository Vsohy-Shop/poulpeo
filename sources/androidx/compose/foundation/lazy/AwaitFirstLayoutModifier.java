package androidx.compose.foundation.lazy;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifier;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
/* compiled from: LazyListState.kt */
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {
    private C12074d<? super C11921v> continuation;
    private boolean wasPositioned;

    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "coordinates");
        if (!this.wasPositioned) {
            this.wasPositioned = true;
            C12074d<? super C11921v> dVar = this.continuation;
            if (dVar != null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                dVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
            }
            this.continuation = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object waitForFirstLayout(p355hf.C12074d<? super p336ef.C11921v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = (androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1 r0 = new androidx.compose.foundation.lazy.AwaitFirstLayoutModifier$waitForFirstLayout$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            hf.d r1 = (p355hf.C12074d) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r0 = (androidx.compose.foundation.lazy.AwaitFirstLayoutModifier) r0
            p336ef.C11910n.m25701b(r5)
            goto L_0x0064
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            p336ef.C11910n.m25701b(r5)
            boolean r5 = r4.wasPositioned
            if (r5 != 0) goto L_0x0071
            hf.d<? super ef.v> r5 = r4.continuation
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            hf.i r2 = new hf.i
            hf.d r3 = p362if.C12147c.m26491b(r0)
            r2.<init>(r3)
            r4.continuation = r2
            java.lang.Object r2 = r2.mo49514b()
            java.lang.Object r3 = p362if.C12150d.m26492c()
            if (r2 != r3) goto L_0x0060
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r0)
        L_0x0060:
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r1 = r5
        L_0x0064:
            if (r1 == 0) goto L_0x0071
            ef.m$a r5 = p336ef.C11907m.f18600b
            ef.v r5 = p336ef.C11921v.f18618a
            java.lang.Object r5 = p336ef.C11907m.m25696a(r5)
            r1.resumeWith(r5)
        L_0x0071:
            ef.v r5 = p336ef.C11921v.f18618a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.AwaitFirstLayoutModifier.waitForFirstLayout(hf.d):java.lang.Object");
    }
}
