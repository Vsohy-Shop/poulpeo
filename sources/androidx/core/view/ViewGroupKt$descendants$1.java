package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p448vf.C13652i;

@C12739f(mo50609c = "androidx.core.view.ViewGroupKt$descendants$1", mo50610f = "ViewGroup.kt", mo50611l = {119, 121}, mo50612m = "invokeSuspend")
/* compiled from: ViewGroup.kt */
final class ViewGroupKt$descendants$1 extends C12745k implements C13088o<C13652i<? super View>, C12074d<? super C11921v>, Object> {
    final /* synthetic */ ViewGroup $this_descendants;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewGroupKt$descendants$1(ViewGroup viewGroup, C12074d<? super ViewGroupKt$descendants$1> dVar) {
        super(2, dVar);
        this.$this_descendants = viewGroup;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, dVar);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r11.L$0
            vf.i r6 = (p448vf.C13652i) r6
            p336ef.C11910n.m25701b(r12)
            r12 = r11
            goto L_0x0091
        L_0x0020:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0028:
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$2
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r11.L$1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r11.L$0
            vf.i r7 = (p448vf.C13652i) r7
            p336ef.C11910n.m25701b(r12)
            r12 = r11
            goto L_0x0071
        L_0x003d:
            p336ef.C11910n.m25701b(r12)
            java.lang.Object r12 = r11.L$0
            vf.i r12 = (p448vf.C13652i) r12
            android.view.ViewGroup r1 = r11.$this_descendants
            int r4 = r1.getChildCount()
            r5 = 0
            r6 = r11
        L_0x004c:
            if (r5 >= r4) goto L_0x00a1
            android.view.View r7 = r1.getChildAt(r5)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.jvm.internal.C12775o.m28638h(r7, r8)
            r6.L$0 = r12
            r6.L$1 = r1
            r6.L$2 = r7
            r6.I$0 = r5
            r6.I$1 = r4
            r6.label = r3
            java.lang.Object r8 = r12.mo53327e(r7, r6)
            if (r8 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r9 = r7
            r7 = r12
            r12 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r9
        L_0x0071:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0098
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            vf.g r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r12.L$0 = r7
            r12.L$1 = r6
            r8 = 0
            r12.L$2 = r8
            r12.I$0 = r4
            r12.I$1 = r1
            r12.label = r2
            java.lang.Object r5 = r7.mo53333k(r5, r12)
            if (r5 != r0) goto L_0x008f
            return r0
        L_0x008f:
            r5 = r6
            r6 = r7
        L_0x0091:
            r9 = r6
            r6 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
            goto L_0x009c
        L_0x0098:
            r5 = r1
            r1 = r6
            r6 = r12
            r12 = r7
        L_0x009c:
            int r4 = r4 + r3
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x004c
        L_0x00a1:
            ef.v r12 = p336ef.C11921v.f18618a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13652i<? super View> iVar, C12074d<? super C11921v> dVar) {
        return ((ViewGroupKt$descendants$1) create(iVar, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
