package p247u9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant_grid.C11173a;
import kotlin.jvm.internal.C12775o;
import p236t9.C9773e;
import p236t9.C9776f;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: u9.c */
/* compiled from: MerchantFactoryViewHolder.kt */
public final class C9904c implements C9903b {
    /* renamed from: a */
    public C14080a mo44431a(ViewGroup viewGroup, C13867a.C13868a aVar, boolean z, String str, String str2, String str3, Integer num) {
        ViewGroup viewGroup2 = viewGroup;
        C12775o.m28639i(viewGroup, "parentView");
        C12775o.m28639i(str, "sectionTitle");
        C12775o.m28639i(str2, "technicalNameTracking");
        C12775o.m28639i(str3, "trackingPageName");
        if (num != null && num.intValue() == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_row_cashback, viewGroup, false);
            C12775o.m28638h(inflate, "from(parentView.context)…hback, parentView, false)");
            return new C9776f(inflate, aVar, 0, false, z, str, str2, C11173a.C11175b.CONTAINER, str3, num.intValue());
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_cell_cashback, viewGroup, false);
        C12775o.m28638h(inflate2, "from(parentView.context)…hback, parentView, false)");
        return new C9773e(inflate2, aVar, 0, false, z, str, str2, C11173a.C11175b.CONTAINER, str3, num);
    }
}
