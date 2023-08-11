package p236t9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant_grid.C11173a;
import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p463yc.C13867a;
import p463yc.C13871b;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: t9.d */
/* compiled from: CashbackCellAdapter.kt */
public final class C9772d extends C13871b {

    /* renamed from: t */
    private final int f14593t;

    /* renamed from: u */
    private final String f14594u;

    /* renamed from: v */
    private final String f14595v;

    /* renamed from: w */
    private final C11173a.C11175b f14596w;

    /* renamed from: x */
    private final String f14597x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9772d(C13867a.C13868a aVar, int i, int i2, String str, String str2, C11173a.C11175b bVar, String str3) {
        super(aVar, i2);
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(str, "sectionTitle");
        C12775o.m28639i(str2, APIParams.TECHNICAL_NAME);
        C12775o.m28639i(bVar, "typeMerchantGrid");
        C12775o.m28639i(str3, "trackingPageName");
        this.f14593t = i;
        this.f14594u = str;
        this.f14595v = str2;
        this.f14596w = bVar;
        this.f14597x = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == C13867a.f22581i.mo53577d()) {
            return R.layout.view_cell_cashback;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i != C13867a.f22581i.mo53577d()) {
            return super.mo23226t(view, i);
        }
        C11173a.C11175b bVar = this.f14596w;
        if (bVar == C11173a.C11175b.SEARCH || bVar == C11173a.C11175b.SIMILAR) {
            return new C9769c(view, mo53565o(), this.f14593t, false, false, this.f14594u, this.f14595v, this.f14596w, this.f14597x);
        }
        return new C9773e(view, mo53565o(), this.f14593t, false, false, this.f14594u, this.f14595v, this.f14596w, this.f14597x, (Integer) null, 512, (DefaultConstructorMarker) null);
    }
}
