package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014o9.C2071a;
import p457xc.C13771a;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.e */
/* compiled from: MerchantActionCellAdapter.kt */
public final class C2020e extends C2021f {

    /* renamed from: u */
    private final C13771a<BaseMerchant> f579u;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2020e(C13867a.C13868a aVar, int i, C13771a aVar2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i, aVar2, (i3 & 8) != 0 ? -1 : i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == C13867a.f22581i.mo53577d()) {
            return R.layout.view_cell_merchant;
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
        return new C2071a(view, mo53565o(), mo23227A(), this.f579u, false, false, 48, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2020e(C13867a.C13868a aVar, int i, C13771a<BaseMerchant> aVar2, int i2) {
        super(aVar, i, i2);
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(aVar2, "actionCellManager");
        this.f579u = aVar2;
    }
}
