package p236t9;

import android.content.Context;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.Cashback;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p360id.C12139g;
import p368jd.C12616b;
import p445vc.C13618g;
import p446vd.C13629j;
import p450wb.C13690b;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: t9.c */
/* compiled from: CashbackBaseMerchantCellViewHolder.kt */
public final class C9769c extends C9773e {

    /* renamed from: s */
    private BaseMerchant f14590s;

    /* renamed from: t9.c$a */
    /* compiled from: CashbackBaseMerchantCellViewHolder.kt */
    public /* synthetic */ class C9770a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14591a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.poulpeo.ui.screens.merchant_grid.a$b[] r0 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.SIMILAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.SEARCH     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.CAMPAIGNS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.CONTAINER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f14591a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p236t9.C9769c.C9770a.<clinit>():void");
        }
    }

    /* renamed from: t9.c$b */
    /* compiled from: CashbackBaseMerchantCellViewHolder.kt */
    public static final class C9771b implements Callback {

        /* renamed from: a */
        final /* synthetic */ C9769c f14592a;

        C9771b(C9769c cVar) {
            this.f14592a = cVar;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            C12139g.m26474c(this.f14592a.mo44291q2(), false, 4);
        }

        public void onSuccess() {
            C12139g.m26475d(this.f14592a.mo44291q2(), true, 0, 2, (Object) null);
            C12139g.m26475d(this.f14592a.mo44294t2(), false, 0, 2, (Object) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9769c(android.view.View r15, p463yc.C13867a.C13868a r16, int r17, boolean r18, boolean r19, java.lang.String r20, java.lang.String r21, com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b r22, java.lang.String r23) {
        /*
            r14 = this;
            java.lang.String r0 = "itemView"
            r2 = r15
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            java.lang.String r0 = "sectionTitle"
            r7 = r20
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "technicalNameTracking"
            r8 = r21
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "typeMerchantGrid"
            r9 = r22
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "trackingPageName"
            r10 = r23
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r11 = 0
            r12 = 512(0x200, float:7.175E-43)
            r13 = 0
            r1 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236t9.C9769c.<init>(android.view.View, yc.a$a, int, boolean, boolean, java.lang.String, java.lang.String, com.poulpeo.ui.screens.merchant_grid.a$b, java.lang.String):void");
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        String str;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.common.model.BaseMerchant");
        this.f14590s = (BaseMerchant) obj;
        TextView t2 = mo44294t2();
        BaseMerchant baseMerchant = this.f14590s;
        C11921v vVar = null;
        if (baseMerchant == null) {
            C12775o.m28656z("baseMerchant");
            baseMerchant = null;
        }
        t2.setText(baseMerchant.getName());
        BaseMerchant baseMerchant2 = this.f14590s;
        if (baseMerchant2 == null) {
            C12775o.m28656z("baseMerchant");
            baseMerchant2 = null;
        }
        String logo = baseMerchant2.getLogo();
        if (logo == null) {
            logo = null;
        }
        AsyncImageLoader.loadImage(mo44291q2(), logo, logo, 0, new C9771b(this));
        BaseMerchant baseMerchant3 = this.f14590s;
        if (baseMerchant3 == null) {
            C12775o.m28656z("baseMerchant");
            baseMerchant3 = null;
        }
        Cashback lastCashback = baseMerchant3.getLastCashback();
        if (lastCashback != null) {
            str = C13629j.m31134d().format(lastCashback.getValue()) + lastCashback.getType().getDisplay();
        } else {
            str = "";
        }
        BaseMerchant baseMerchant4 = this.f14590s;
        if (baseMerchant4 == null) {
            C12775o.m28656z("baseMerchant");
            baseMerchant4 = null;
        }
        Cashback cashback = baseMerchant4.getCashback();
        if (cashback != null) {
            String str2 = C13629j.m31134d().format(cashback.getValue()) + cashback.getType().getDisplay();
            String string = mo53843t0().getString(R.string.cashback_title_cell, new Object[]{str, str2});
            C12775o.m28638h(string, "getContext().getString(R…astCashback, strCashback)");
            C13690b.f22034a.mo53346d(mo53843t0(), string, mo44290p2(), str2, C13755w.m31561N0(str).toString(), new StyleSpan(1));
            vVar = C11921v.f18618a;
        }
        if (vVar == null) {
            mo44290p2().setText(mo53843t0().getString(R.string.cell_no_cashback));
        }
    }

    public void onClick(View view) {
        String str;
        C12775o.m28639i(view, "v");
        C13618g gVar = C13618g.f21930b;
        int i = C9770a.f14591a[mo44295u2().ordinal()];
        if (i == 1) {
            str = "grid-similar-" + mo44293s2();
        } else if (i == 2) {
            str = "grid-search-" + mo44293s2();
        } else if (i == 3) {
            str = "grid-campaigns-" + mo44293s2();
        } else if (i == 4) {
            str = "grid-container-" + mo44293s2();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        BaseMerchant baseMerchant = this.f14590s;
        BaseMerchant baseMerchant2 = null;
        if (baseMerchant == null) {
            C12775o.m28656z("baseMerchant");
            baseMerchant = null;
        }
        gVar.mo53279c(str, "click", baseMerchant.getName());
        C12616b b0 = mo53842b0();
        if (b0 != null) {
            MerchantActivity.C11159a aVar = MerchantActivity.f17469w;
            Context t0 = mo53843t0();
            BaseMerchant baseMerchant3 = this.f14590s;
            if (baseMerchant3 == null) {
                C12775o.m28656z("baseMerchant");
            } else {
                baseMerchant2 = baseMerchant3;
            }
            String merchantIdString = baseMerchant2.getMerchantIdString();
            C12775o.m28638h(merchantIdString, "baseMerchant.merchantIdString");
            b0.startActivity(MerchantActivity.C11159a.m24356i(aVar, t0, merchantIdString, false, (String) null, 8, (Object) null));
        }
    }
}
