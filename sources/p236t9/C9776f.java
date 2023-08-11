package p236t9;

import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.text.NumberFormat;
import kotlin.jvm.internal.C12775o;
import p440ud.C13565k;
import p446vd.C13629j;
import p450wb.C13690b;

@StabilityInferred(parameters = 0)
/* renamed from: t9.f */
/* compiled from: CashbackRowCellViewHolder.kt */
public final class C9776f extends C9773e {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9776f(android.view.View r14, p463yc.C13867a.C13868a r15, int r16, boolean r17, boolean r18, java.lang.String r19, java.lang.String r20, com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b r21, java.lang.String r22, int r23) {
        /*
            r13 = this;
            r11 = r13
            r12 = r14
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "sectionTitle"
            r6 = r19
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            java.lang.String r0 = "technicalNameTracking"
            r7 = r20
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "typeMerchantGrid"
            r8 = r21
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "trackingPageName"
            r9 = r22
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.setOnClickListener(r13)
            r0 = 2131362467(0x7f0a02a3, float:1.8344715E38)
            android.view.View r0 = r14.findViewById(r0)
            java.lang.String r1 = "itemView.findViewById(R.id.logoCardViewCashback)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.content.Context r2 = r13.mo53843t0()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            float r2 = (float) r2
            r3 = 1063675494(0x3f666666, float:0.9)
            float r2 = r2 * r3
            int r2 = p418qf.C13265c.m30134c(r2)
            r1.width = r2
            r0.setLayoutParams(r1)
            if (r17 == 0) goto L_0x0067
            r13.mo44287n2()
        L_0x0067:
            android.view.View r0 = r11.itemView
            r0.setOnClickListener(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236t9.C9776f.<init>(android.view.View, yc.a$a, int, boolean, boolean, java.lang.String, java.lang.String, com.poulpeo.ui.screens.merchant_grid.a$b, java.lang.String, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public void mo44289o2(CashbackObject cashbackObject) {
        C12775o.m28639i(cashbackObject, APIResourceDescriptors.RESOURCE_TYPE_CASHBACK);
        NumberFormat d = C13629j.m31134d();
        String previousCashbackText = cashbackObject.getPreviousCashbackText(d, " (%s)");
        C12775o.m28638h(previousCashbackText, "cashback.getPreviousCashbackText(f, \" (%s)\")");
        String cashbackText = cashbackObject.getCashbackText(d, mo53843t0().getString(R.string.cashback_amount_variable), C13565k.m30968b(new ContextContainer(mo53843t0()), R.plurals.cashback_description_cell_row_stand_alone, (double) cashbackObject.getRate(), previousCashbackText + " %s"));
        C12775o.m28638h(cashbackText, "cashback.getCashbackText…ount_variable), endTitle)");
        C13690b bVar = C13690b.f22034a;
        bVar.mo53353k(mo44290p2(), cashbackText, bVar.mo53347e(mo53843t0(), C13755w.m31561N0(previousCashbackText).toString()));
    }
}
