package p014o9;

import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.Cashback;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p236t9.C9765a;
import p336ef.C11921v;
import p360id.C12139g;
import p446vd.C13629j;
import p450wb.C13690b;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: o9.b */
/* compiled from: MerchantCellViewHolderOld.kt */
public class C2072b extends C9765a {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ImageView f701h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final TextView f702i;

    /* renamed from: j */
    private final TextView f703j;

    /* renamed from: k */
    private BaseMerchant f704k;

    /* renamed from: o9.b$a */
    /* compiled from: MerchantCellViewHolderOld.kt */
    public static final class C2073a implements Callback {

        /* renamed from: a */
        final /* synthetic */ C2072b f705a;

        C2073a(C2072b bVar) {
            this.f705a = bVar;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            C12139g.m26474c(this.f705a.f701h, false, 4);
        }

        public void onSuccess() {
            C12139g.m26475d(this.f705a.f701h, true, 0, 2, (Object) null);
            C12139g.m26475d(this.f705a.f702i, false, 0, 2, (Object) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2072b(View view, C13867a.C13868a aVar, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, aVar, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        String str;
        C11921v vVar;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.common.model.BaseMerchant");
        BaseMerchant baseMerchant = (BaseMerchant) obj;
        this.f704k = baseMerchant;
        this.f702i.setText(baseMerchant.getName());
        if (!TextUtils.isEmpty(baseMerchant.getLogo())) {
            AsyncImageLoader.loadImage(this.f701h, baseMerchant.getIdentifier(), baseMerchant.getLogo(), 0, new C2073a(this));
        }
        Cashback lastCashback = baseMerchant.getLastCashback();
        if (lastCashback != null) {
            str = C13629j.m31134d().format(lastCashback.getValue()) + lastCashback.getType().getDisplay();
        } else {
            str = "";
        }
        Cashback cashback = baseMerchant.getCashback();
        if (cashback != null) {
            String str2 = C13629j.m31134d().format(cashback.getValue()) + cashback.getType().getDisplay();
            String string = mo53843t0().getString(R.string.cashback_title_cell, new Object[]{str, str2});
            C12775o.m28638h(string, "getContext().getString(R…astCashback, strCashback)");
            C13690b.f22034a.mo53346d(mo53843t0(), string, this.f703j, str2, C13755w.m31561N0(str).toString(), new StyleSpan(1));
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            this.f703j.setText(mo53843t0().getString(R.string.cell_no_cashback));
        }
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        C13867a.C13868a M0 = mo53841M0();
        if (M0 != null) {
            M0.mo46342E(mo23258q2());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public final BaseMerchant mo23258q2() {
        BaseMerchant baseMerchant = this.f704k;
        if (baseMerchant != null) {
            return baseMerchant;
        }
        C12775o.m28656z("merchant");
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2072b(View view, C13867a.C13868a aVar, int i, boolean z, boolean z2) {
        super(view, aVar, z2);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.logoImageView);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.logoImageView)");
        this.f701h = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewMerchantNamePlaceholder);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.…wMerchantNamePlaceholder)");
        this.f702i = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.cashBackAmountTextView);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.cashBackAmountTextView)");
        this.f703j = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.logoCardView);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.logoCardView)");
        this.itemView.setOnClickListener(this);
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
            int c = C13265c.m30134c(((float) mo53843t0().getResources().getDisplayMetrics().widthPixels) / 2.75f);
            layoutParams.width = c;
            layoutParams.height = C13265c.m30134c(((float) c) * 0.97f);
            findViewById4.setLayoutParams(layoutParams);
        } else if (i == 1) {
            ViewGroup.LayoutParams layoutParams2 = findViewById4.getLayoutParams();
            layoutParams2.height = C13265c.m30134c(((float) C13265c.m30134c(((float) mo53843t0().getResources().getDisplayMetrics().widthPixels) / 3.0f)) * 0.97f);
            findViewById4.setLayoutParams(layoutParams2);
        }
        if (z) {
            mo44287n2();
        }
    }
}
