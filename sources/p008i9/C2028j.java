package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferCodeType;
import com.rmn.p324ui.views.listview.BaseListView;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015p9.C2081e;
import p015p9.C2084g;
import p446vd.C13637r;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.j */
/* compiled from: RevealedOfferArrayAdapter.kt */
public final class C2028j extends C2014a {

    /* renamed from: t */
    private static final C2029a f594t = new C2029a((DefaultConstructorMarker) null);

    /* renamed from: i9.j$a */
    /* compiled from: RevealedOfferArrayAdapter.kt */
    private static final class C2029a {
        private C2029a() {
        }

        public /* synthetic */ C2029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2028j(BaseListView baseListView) {
        super(baseListView);
        C12775o.m28639i(baseListView, "listener");
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType == C13867a.f22581i.mo53577d()) {
            Object item = getItem(i);
            if (item instanceof Offer) {
                Offer offer = (Offer) item;
                if (offer.codeType != OfferCodeType.MULTIPLE || C13637r.f21957b.mo53305b(offer.f18063id)) {
                    return 20;
                }
                return 10;
            }
        }
        return itemViewType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == 10) {
            return R.layout.row_offer;
        }
        if (i != 20) {
            return super.mo23225p(i);
        }
        return R.layout.row_offer_revealed;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C14080a eVar;
        C12775o.m28639i(view, "itemView");
        if (i == 10) {
            int itemCount = getItemCount();
            int i2 = 0;
            for (int i3 = 0; i3 < itemCount; i3++) {
                if (getItem(i3) instanceof Offer) {
                    i2++;
                }
            }
            eVar = new C2081e(view, mo53565o(), i2, true);
        } else if (i != 20) {
            return super.mo23226t(view, i);
        } else {
            eVar = new C2084g(view, mo53565o());
        }
        return eVar;
    }
}
