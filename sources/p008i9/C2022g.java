package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015p9.C2078b;
import p015p9.C2079c;
import p015p9.C2081e;
import p431ta.C13458j;
import p463yc.C13867a;
import p469zc.C14080a;
import p469zc.C14083c;

@StabilityInferred(parameters = 0)
/* renamed from: i9.g */
/* compiled from: MerchantOfferArrayAdapter.kt */
public final class C2022g extends C2014a {

    /* renamed from: w */
    private static final C2023a f581w = new C2023a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f582x = 8;

    /* renamed from: t */
    private final View.OnClickListener f583t;

    /* renamed from: u */
    private final int f584u;

    /* renamed from: v */
    private final C13458j f585v;

    /* renamed from: i9.g$a */
    /* compiled from: MerchantOfferArrayAdapter.kt */
    private static final class C2023a {
        private C2023a() {
        }

        public /* synthetic */ C2023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2022g(BaseListView baseListView, View.OnClickListener onClickListener, int i, C13458j jVar) {
        super(baseListView);
        C12775o.m28639i(baseListView, "listener");
        C12775o.m28639i(onClickListener, "conditionsClickListener");
        C12775o.m28639i(jVar, "callback");
        this.f583t = onClickListener;
        this.f584u = i;
        this.f585v = jVar;
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType == C13867a.f22581i.mo53577d()) {
            Object item = getItem(i);
            if (item instanceof Merchant) {
                return 10;
            }
            if (item instanceof Offer) {
                return 20;
            }
            if (item instanceof ResourceStringWrapper) {
                return 40;
            }
        }
        return itemViewType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == 10) {
            return R.layout.row_cashback;
        }
        if (i == 20) {
            return R.layout.row_offer;
        }
        if (i == 30) {
            return R.layout.row_simple_header;
        }
        if (i != 40) {
            return super.mo23225p(i);
        }
        return R.layout.row_no_content;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C14080a aVar;
        C12775o.m28639i(view, "itemView");
        if (i != 10) {
            if (i == 20) {
                aVar = new C2081e(view, mo53565o(), this.f584u, false);
            } else if (i == 30) {
                aVar = new C14083c(view, mo53565o());
            } else if (i != 40) {
                return super.mo23226t(view, i);
            } else {
                aVar = new C2079c(view, mo53565o());
            }
            return aVar;
        }
        C2078b bVar = new C2078b(view, mo53565o(), this.f583t);
        this.f585v.mo53035a(bVar);
        return bVar;
    }
}
