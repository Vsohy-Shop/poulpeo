package p431ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.p324ui.views.listview.BaseListView;
import kotlin.jvm.internal.C12775o;
import p008i9.C2022g;
import p311bd.C10930a;
import p432tb.C13479c;

@StabilityInferred(parameters = 0)
/* renamed from: ta.l */
/* compiled from: MerchantContentView.kt */
public final class C13460l {

    /* renamed from: a */
    private final C13462n f21580a;

    /* renamed from: b */
    private final View f21581b;

    public C13460l(AppCompatActivity appCompatActivity, ViewGroup viewGroup, C13462n nVar, View.OnClickListener onClickListener) {
        C12775o.m28639i(appCompatActivity, "activity");
        C12775o.m28639i(viewGroup, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(nVar, "controller");
        C12775o.m28639i(onClickListener, "conditionsClickListener");
        this.f21580a = nVar;
        View inflate = LayoutInflater.from(appCompatActivity).inflate(R.layout.view_merchant_content, viewGroup, false);
        C12775o.m28638h(inflate, "from(activity).inflate(R…ontent, container, false)");
        this.f21581b = inflate;
        C12775o.m28637g(inflate, "null cannot be cast to non-null type com.rmn.ui.views.listview.BaseListView");
        BaseListView baseListView = (BaseListView) inflate;
        C10930a baseListViewController = baseListView.getBaseListViewController();
        baseListViewController.mo45958P2(C13479c.f21636k.mo53083a(appCompatActivity).mo53078h());
        baseListView.setAdapter(new C2022g(baseListView, onClickListener, nVar.mo53045r2(), new C13459k(this)));
        nVar.mo53041I2(baseListViewController);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m30590b(C13460l lVar, Object obj) {
        C12775o.m28639i(lVar, "this$0");
        C12775o.m28639i(obj, "cell");
        lVar.f21580a.f21588h.add((C13476y) obj);
    }

    /* renamed from: c */
    public final View mo53036c() {
        return this.f21581b;
    }
}
