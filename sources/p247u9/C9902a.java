package p247u9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p236t9.C9766b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: u9.a */
/* compiled from: BillboardCampaignFactoryViewHolder.kt */
public final class C9902a implements C9903b {
    /* renamed from: a */
    public C14080a mo44431a(ViewGroup viewGroup, C13867a.C13868a aVar, boolean z, String str, String str2, String str3, Integer num) {
        ViewGroup viewGroup2 = viewGroup;
        C12775o.m28639i(viewGroup, "parentView");
        C12775o.m28639i(str, "sectionTitle");
        String str4 = str2;
        C12775o.m28639i(str4, "technicalNameTracking");
        String str5 = str3;
        C12775o.m28639i(str5, "trackingPageName");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_cell_campaign, viewGroup, false);
        C12775o.m28638h(inflate, "view");
        return new C9766b(inflate, aVar, false, z, str, str4, false, str5);
    }
}
