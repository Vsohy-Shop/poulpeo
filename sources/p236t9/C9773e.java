package p236t9;

import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant_grid.C11173a;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import java.net.URL;
import java.text.NumberFormat;
import kotlin.jvm.internal.C12775o;
import p258v9.C10060e;
import p336ef.C11921v;
import p360id.C12139g;
import p446vd.C13629j;
import p450wb.C13690b;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: t9.e */
/* compiled from: CashbackCellViewHolder.kt */
public class C9773e extends C9765a {

    /* renamed from: h */
    private final int f14598h;

    /* renamed from: i */
    private final String f14599i;

    /* renamed from: j */
    private final String f14600j;

    /* renamed from: k */
    private final C11173a.C11175b f14601k;

    /* renamed from: l */
    private final String f14602l;

    /* renamed from: m */
    private final Integer f14603m;

    /* renamed from: n */
    private final ImageView f14604n;

    /* renamed from: o */
    private final TextView f14605o;

    /* renamed from: p */
    private final TextView f14606p;

    /* renamed from: q */
    private final TextView f14607q;

    /* renamed from: r */
    protected Merchant f14608r;

    /* renamed from: t9.e$a */
    /* compiled from: CashbackCellViewHolder.kt */
    public /* synthetic */ class C9774a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14609a;

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
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.CAMPAIGNS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.CONTAINER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.SIMILAR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.poulpeo.ui.screens.merchant_grid.a$b r1 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.SEARCH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f14609a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p236t9.C9773e.C9774a.<clinit>():void");
        }
    }

    /* renamed from: t9.e$b */
    /* compiled from: CashbackCellViewHolder.kt */
    public static final class C9775b implements Callback {

        /* renamed from: a */
        final /* synthetic */ C9773e f14610a;

        C9775b(C9773e eVar) {
            this.f14610a = eVar;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            C12139g.m26474c(this.f14610a.mo44291q2(), false, 4);
        }

        public void onSuccess() {
            C12139g.m26475d(this.f14610a.mo44291q2(), true, 0, 2, (Object) null);
            C12139g.m26475d(this.f14610a.mo44294t2(), false, 0, 2, (Object) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9773e(android.view.View r15, p463yc.C13867a.C13868a r16, int r17, boolean r18, boolean r19, java.lang.String r20, java.lang.String r21, com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b r22, java.lang.String r23, java.lang.Integer r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r18
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r19
        L_0x0013:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x001a
            r0 = 0
            r13 = r0
            goto L_0x001c
        L_0x001a:
            r13 = r24
        L_0x001c:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236t9.C9773e.<init>(android.view.View, yc.a$a, int, boolean, boolean, java.lang.String, java.lang.String, com.poulpeo.ui.screens.merchant_grid.a$b, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C10060e eVar;
        IModel iModel;
        Merchant merchant;
        String str;
        C11921v vVar;
        boolean z;
        Merchant merchant2;
        boolean z2 = obj instanceof C10060e;
        if (z2) {
            eVar = (C10060e) obj;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            iModel = eVar.f15209a;
        } else {
            iModel = null;
        }
        if (iModel instanceof Merchant) {
            merchant = (Merchant) iModel;
        } else {
            merchant = null;
        }
        if (merchant == null) {
            if (obj instanceof Merchant) {
                merchant2 = (Merchant) obj;
            } else {
                merchant2 = null;
            }
            if (merchant == null) {
                return;
            }
        }
        mo44296v2(merchant);
        this.f14605o.setText(mo44292r2().name);
        URL logoUrl = mo44292r2().getLogoUrl();
        if (logoUrl != null) {
            str = logoUrl.toString();
        } else {
            str = null;
        }
        AsyncImageLoader.loadImage(this.f14604n, str, str, 0, new C9775b(this));
        CashbackObject cashbackObject = mo44292r2().getCashbackObject();
        if (cashbackObject != null) {
            mo44289o2(cashbackObject);
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            this.f14606p.setText(mo53843t0().getString(R.string.cell_no_cashback));
        }
        TextView textView = this.f14607q;
        if (!z2 || !((C10060e) obj).f15210b) {
            z = false;
        } else {
            z = true;
        }
        C12139g.m26475d(textView, z, 0, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public void mo44289o2(CashbackObject cashbackObject) {
        C12775o.m28639i(cashbackObject, APIResourceDescriptors.RESOURCE_TYPE_CASHBACK);
        String str = C13629j.m31134d().format(Float.valueOf(cashbackObject.getRate())) + cashbackObject.getCommissionType().text;
        String previousCashbackText = cashbackObject.getPreviousCashbackText(NumberFormat.getInstance(), "%s");
        C12775o.m28638h(previousCashbackText, "cashback.getPreviousCash…rmat.getInstance(), \"%s\")");
        String string = mo53843t0().getString(R.string.cashback_title_cell, new Object[]{previousCashbackText, str});
        C12775o.m28638h(string, "getContext().getString(R…astCashback, strCashback)");
        C13690b.f22034a.mo53346d(mo53843t0(), string, this.f14606p, str, C13755w.m31561N0(previousCashbackText).toString(), new StyleSpan(1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            java.lang.String r0 = "v"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            int r8 = r7.f14598h
            r0 = 1
            if (r8 != r0) goto L_0x007e
            java.lang.String r8 = r7.f14600j
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x0014
            r8 = r0
            goto L_0x0015
        L_0x0014:
            r8 = 0
        L_0x0015:
            if (r8 == 0) goto L_0x007e
            vc.g r8 = p445vc.C13618g.f21930b
            com.poulpeo.ui.screens.merchant_grid.a$b r1 = r7.f14601k
            int[] r2 = p236t9.C9773e.C9774a.f14609a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r0) goto L_0x005f
            r0 = 2
            if (r1 == r0) goto L_0x004b
            r0 = 3
            if (r1 == r0) goto L_0x0037
            r0 = 4
            if (r1 != r0) goto L_0x0031
            java.lang.String r0 = "grid-search"
            goto L_0x0072
        L_0x0031:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0037:
            java.lang.String r0 = r7.f14600j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "grid-similar-"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0072
        L_0x004b:
            java.lang.String r0 = r7.f14600j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "grid-container-"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0072
        L_0x005f:
            java.lang.String r0 = r7.f14600j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "grid-campaigns-"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0072:
            com.rmn.apiclient.impl.api.models.Merchant r1 = r7.mo44292r2()
            java.lang.String r1 = r1.name
            java.lang.String r2 = "click"
            r8.mo53279c(r0, r2, r1)
            goto L_0x009e
        L_0x007e:
            vc.g r8 = p445vc.C13618g.f21930b
            java.lang.String r0 = r7.f14602l
            java.lang.String r1 = r7.f14599i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "cashback|"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.rmn.apiclient.impl.api.models.Merchant r2 = r7.mo44292r2()
            java.lang.String r2 = r2.name
            r8.mo53279c(r0, r1, r2)
        L_0x009e:
            jd.b r8 = r7.mo53842b0()
            if (r8 == 0) goto L_0x00c1
            com.poulpeo.ui.screens.merchant.MerchantActivity$a r0 = com.poulpeo.p321ui.screens.merchant.MerchantActivity.f17469w
            android.content.Context r1 = r7.mo53843t0()
            com.rmn.apiclient.impl.api.models.Merchant r2 = r7.mo44292r2()
            java.lang.String r2 = r2.f18063id
            java.lang.String r3 = "merchant.id"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            r3 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            android.content.Intent r0 = com.poulpeo.p321ui.screens.merchant.MerchantActivity.C11159a.m24356i(r0, r1, r2, r3, r4, r5, r6)
            r8.startActivity(r0)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236t9.C9773e.onClick(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public final TextView mo44290p2() {
        return this.f14606p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public final ImageView mo44291q2() {
        return this.f14604n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public final Merchant mo44292r2() {
        Merchant merchant = this.f14608r;
        if (merchant != null) {
            return merchant;
        }
        C12775o.m28656z("merchant");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public final String mo44293s2() {
        return this.f14600j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public final TextView mo44294t2() {
        return this.f14605o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u2 */
    public final C11173a.C11175b mo44295u2() {
        return this.f14601k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public final void mo44296v2(Merchant merchant) {
        C12775o.m28639i(merchant, "<set-?>");
        this.f14608r = merchant;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9773e(View view, C13867a.C13868a aVar, int i, boolean z, boolean z2, String str, String str2, C11173a.C11175b bVar, String str3, Integer num) {
        super(view, aVar, z2);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(str, "sectionTitle");
        C12775o.m28639i(str2, "technicalNameTracking");
        C12775o.m28639i(bVar, "typeMerchantGrid");
        C12775o.m28639i(str3, "trackingPageName");
        this.f14598h = i;
        this.f14599i = str;
        this.f14600j = str2;
        this.f14601k = bVar;
        this.f14602l = str3;
        this.f14603m = num;
        View findViewById = view.findViewById(R.id.cellLogoImageViewCashback);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.…ellLogoImageViewCashback)");
        this.f14604n = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewMerchantNamePlaceholderCashback);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.…tNamePlaceholderCashback)");
        this.f14605o = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cashBackAmountTextViewCashback);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.…ckAmountTextViewCashback)");
        this.f14606p = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mentionAd);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.mentionAd)");
        this.f14607q = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.logoCardViewCashback);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.logoCardViewCashback)");
        this.itemView.setOnClickListener(this);
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = findViewById5.getLayoutParams();
            float f = (float) mo53843t0().getResources().getDisplayMetrics().widthPixels;
            if (num != null && num.intValue() == 2) {
                int c = C13265c.m30134c(f / 2.2f);
                layoutParams.width = c;
                layoutParams.height = C13265c.m30134c(((float) c) * 0.8f);
            } else {
                int c2 = C13265c.m30134c(f / 2.75f);
                layoutParams.width = c2;
                layoutParams.height = C13265c.m30134c(((float) c2) * 0.97f);
            }
            findViewById5.setLayoutParams(layoutParams);
        } else if (i == 1) {
            ViewGroup.LayoutParams layoutParams2 = findViewById5.getLayoutParams();
            layoutParams2.height = C13265c.m30134c(((float) C13265c.m30134c(((float) mo53843t0().getResources().getDisplayMetrics().widthPixels) / 3.0f)) * 0.97f);
            findViewById5.setLayoutParams(layoutParams2);
        }
        if (z) {
            mo44287n2();
        }
    }
}
