package androidx.core.view;

import android.view.View;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p448vf.C13652i;

@C12739f(mo50609c = "androidx.core.view.ViewKt$allViews$1", mo50610f = "View.kt", mo50611l = {414, 416}, mo50612m = "invokeSuspend")
/* compiled from: View.kt */
final class ViewKt$allViews$1 extends C12745k implements C13088o<C13652i<? super View>, C12074d<? super C11921v>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, C12074d<? super ViewKt$allViews$1> dVar) {
        super(2, dVar);
        this.$this_allViews = view;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: vf.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            p336ef.C11910n.m25701b(r5)
            goto L_0x004f
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            java.lang.Object r1 = r4.L$0
            vf.i r1 = (p448vf.C13652i) r1
            p336ef.C11910n.m25701b(r5)
            goto L_0x0037
        L_0x0022:
            p336ef.C11910n.m25701b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            vf.i r1 = (p448vf.C13652i) r1
            android.view.View r5 = r4.$this_allViews
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r1.mo53327e(r5, r4)
            if (r5 != r0) goto L_0x0037
            return r0
        L_0x0037:
            android.view.View r5 = r4.$this_allViews
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x004f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            vf.g r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = r1.mo53333k(r5, r4)
            if (r5 != r0) goto L_0x004f
            return r0
        L_0x004f:
            ef.v r5 = p336ef.C11921v.f18618a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13652i<? super View> iVar, C12074d<? super C11921v> dVar) {
        return ((ViewKt$allViews$1) create(iVar, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
