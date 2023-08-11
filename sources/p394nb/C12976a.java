package p394nb;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: nb.a */
/* compiled from: MerchantSlider.kt */
public final class C12976a {

    /* renamed from: a */
    private final ViewGroup f20764a;

    /* renamed from: b */
    private final C13867a.C13868a f20765b;

    /* renamed from: c */
    private String f20766c = "";

    public C12976a(ViewGroup viewGroup, C13867a.C13868a aVar) {
        C12775o.m28639i(viewGroup, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(aVar, "listener");
        this.f20764a = viewGroup;
        this.f20765b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: o9.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50881a(java.util.List<? extends com.rmn.api.p322v2.common.model.BaseMerchant> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            int r2 = r8.size()
            r3 = 1
            if (r1 >= r2) goto L_0x0065
            java.lang.Object r2 = r8.get(r1)
            if (r2 != 0) goto L_0x0017
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0017:
            android.view.ViewGroup r2 = r7.f20764a
            android.view.View r2 = r2.getChildAt(r1)
            int r4 = r8.size()
            int r4 = r4 - r3
            if (r1 != r4) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = r0
        L_0x0026:
            if (r2 != 0) goto L_0x004d
            android.view.ViewGroup r2 = r7.f20764a
            android.content.Context r2 = r2.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r4 = 2131558694(0x7f0d0126, float:1.8742711E38)
            android.view.ViewGroup r5 = r7.f20764a
            android.view.View r2 = r2.inflate(r4, r5, r0)
            o9.c r4 = new o9.c
            yc.a$a r5 = r7.f20765b
            java.lang.String r6 = r7.f20766c
            r4.<init>(r2, r5, r3, r6)
            r2.setTag(r4)
            android.view.ViewGroup r3 = r7.f20764a
            r3.addView(r2)
            goto L_0x0059
        L_0x004d:
            java.lang.Object r2 = r2.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.poulpeo.ui.adapters.viewholders.merchant_old.MerchantCellViewHolderOld"
            kotlin.jvm.internal.C12775o.m28637g(r2, r3)
            r4 = r2
            o9.b r4 = (p014o9.C2072b) r4
        L_0x0059:
            r2 = 0
            java.lang.Object r3 = r8.get(r1)
            r4.mo23234m2(r2, r3)
            r4.mo44287n2()
            goto L_0x0014
        L_0x0065:
            int r8 = r8.size()
            android.view.ViewGroup r0 = r7.f20764a
            int r0 = r0.getChildCount()
            if (r8 >= r0) goto L_0x0086
            android.view.ViewGroup r8 = r7.f20764a
            int r8 = r8.getChildCount()
        L_0x0077:
            if (r1 >= r8) goto L_0x0086
            android.view.ViewGroup r0 = r7.f20764a
            int r2 = r0.getChildCount()
            int r2 = r2 - r3
            r0.removeViewAt(r2)
            int r1 = r1 + 1
            goto L_0x0077
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p394nb.C12976a.mo50881a(java.util.List):void");
    }

    /* renamed from: b */
    public final void mo50882b(String str) {
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        this.f20766c = str;
    }
}
