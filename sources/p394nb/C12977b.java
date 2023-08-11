package p394nb;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p236t9.C9765a;
import p247u9.C9903b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: nb.b */
/* compiled from: SectionItemSlider.kt */
public final class C12977b {

    /* renamed from: a */
    private final ViewGroup f20767a;

    /* renamed from: b */
    private final C13867a.C13868a f20768b;

    /* renamed from: c */
    private final C9903b f20769c;

    public C12977b(ViewGroup viewGroup, C13867a.C13868a aVar, C9903b bVar) {
        C12775o.m28639i(viewGroup, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(bVar, "factory");
        this.f20767a = viewGroup;
        this.f20768b = aVar;
        this.f20769c = bVar;
    }

    /* renamed from: a */
    public final void mo50883a(List<? extends IModel> list, String str, String str2, String str3) {
        boolean z;
        List<? extends IModel> list2 = list;
        C12775o.m28639i(list2, "data");
        C12775o.m28639i(str, "sectionTitle");
        C12775o.m28639i(str2, "technicalNameTracking");
        C12775o.m28639i(str3, "trackingPageName");
        this.f20767a.removeAllViews();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i == list.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            C14080a a = this.f20769c.mo44431a(this.f20767a, this.f20768b, z, str, str2, str3, Integer.valueOf(list.size()));
            View view = a.itemView;
            view.setTag(a);
            this.f20767a.addView(view);
            C9765a aVar = null;
            a.mo23234m2((C13867a) null, list2.get(i));
            if (a instanceof C9765a) {
                aVar = (C9765a) a;
            }
            if (aVar != null) {
                aVar.mo44287n2();
            }
        }
        if (list.size() < this.f20767a.getChildCount()) {
            int childCount = this.f20767a.getChildCount();
            for (int size2 = list.size(); size2 < childCount; size2++) {
                ViewGroup viewGroup = this.f20767a;
                viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
            }
        }
    }
}
