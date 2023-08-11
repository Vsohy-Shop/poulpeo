package p344gb;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.rmn.p324ui.views.listview.BaseListView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p008i9.C2028j;
import p432tb.C13479c;

@StabilityInferred(parameters = 0)
/* renamed from: gb.i */
/* compiled from: PurchaseOffersContentView.kt */
public final class C12014i extends BaseListView {

    /* renamed from: o */
    public Map<Integer, View> f18778o = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12014i(Context context) {
        super(context, (Integer) 40);
        C12775o.m28639i(context, "context");
        setBackgroundColor(ContextCompat.getColor(context, R.color.background_default));
        getBaseListViewController().mo45958P2(C13479c.f21636k.mo53083a(context).mo53078h());
        setAdapter(new C2028j(this));
    }
}
