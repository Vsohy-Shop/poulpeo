package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.views.listview.C11657f;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p463yc.C13867a;
import p469zc.C14080a;
import p469zc.C14083c;

@StabilityInferred(parameters = 0)
/* renamed from: i9.a */
/* compiled from: BaseOfferArrayAdapter.kt */
public abstract class C2014a extends C13867a {

    /* renamed from: s */
    public static final C2015a f571s = new C2015a((DefaultConstructorMarker) null);

    /* renamed from: i9.a$a */
    /* compiled from: BaseOfferArrayAdapter.kt */
    public static final class C2015a {
        private C2015a() {
        }

        public /* synthetic */ C2015a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2014a(BaseListView baseListView) {
        super(baseListView, 0, 2, (DefaultConstructorMarker) null);
        C12775o.m28639i(baseListView, "listener");
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != C13867a.f22581i.mo53577d() || !(getItem(i) instanceof C11657f)) {
            return itemViewType;
        }
        return 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == 100) {
            return R.layout.row_offer_header;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == 100) {
            return new C14083c(view, mo53565o());
        }
        return super.mo23226t(view, i);
    }
}
