package p053ca;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionOffersList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p053ca.C4044f;
import p247u9.C9903b;
import p247u9.C9905d;
import p258v9.C10058c;
import p269w9.C10153a;
import p269w9.C10154b;
import p360id.C12139g;
import p394nb.C12977b;
import p404of.C13074a;
import p440ud.C13567m;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: ca.c */
/* compiled from: ListOfferSectionViewHolder.kt */
public final class C4040c extends C10154b implements C10153a {

    /* renamed from: q */
    private final TextView f3239q;

    /* renamed from: r */
    private final TextView f3240r;

    /* renamed from: s */
    private PageSectionOffersList f3241s;

    /* renamed from: t */
    private final Lazy f3242t;

    /* renamed from: ca.c$a */
    /* compiled from: ListOfferSectionViewHolder.kt */
    static final class C4041a extends C12777p implements C13074a<C4044f> {

        /* renamed from: g */
        final /* synthetic */ C4040c f3243g;

        /* renamed from: h */
        final /* synthetic */ CallManager f3244h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4041a(C4040c cVar, CallManager callManager) {
            super(0);
            this.f3243g = cVar;
            this.f3244h = callManager;
        }

        /* renamed from: b */
        public final C4044f invoke() {
            return new C4044f(this.f3243g, new C4044f.C4046b(this.f3244h, (C13567m) null, false, true));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4040c(View view, C13867a.C13868a aVar, CallManager callManager, C10058c cVar, String str) {
        super(view, aVar, callManager, cVar, str);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(callManager, "callManager");
        C12775o.m28639i(cVar, "pageReload");
        C12775o.m28639i(str, "trackingPageName");
        this.f3239q = (TextView) view.findViewById(R.id.textViewTitle);
        this.f3240r = (TextView) view.findViewById(R.id.textViewDescription);
        this.f3242t = C11901h.m25690b(new C4041a(this, callManager));
    }

    /* renamed from: y2 */
    private final C4044f m4769y2() {
        return (C4044f) this.f3242t.getValue();
    }

    /* renamed from: z2 */
    private final String m4770z2() {
        String str;
        PageSectionOffersList pageSectionOffersList = this.f3241s;
        if (pageSectionOffersList != null) {
            str = pageSectionOffersList.title;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: M */
    public void mo28504M(List<? extends IModel> list) {
        String str;
        boolean z;
        String technicalName;
        C12775o.m28639i(list, "items");
        this.f3239q.setText(m4770z2());
        mo44757u2().setVisibility(8);
        PageSectionOffersList pageSectionOffersList = this.f3241s;
        if (pageSectionOffersList != null) {
            str = pageSectionOffersList.description;
        } else {
            str = null;
        }
        TextView textView = this.f3240r;
        C12775o.m28638h(textView, "textViewDescription");
        if (str != null) {
            C12775o.m28638h(str, "it");
            if (str.length() > 0) {
                z = true;
                C12139g.m26475d(textView, z, 0, 2, (Object) null);
                this.f3240r.setText(str);
                C12977b s2 = mo44755s2();
                PageSectionOffersList pageSectionOffersList2 = this.f3241s;
                String str2 = "";
                if (pageSectionOffersList2 == null || (r3 = pageSectionOffersList2.title) == null) {
                    String str3 = str2;
                }
                if (!(pageSectionOffersList2 == null || (technicalName = pageSectionOffersList2.getTechnicalName()) == null)) {
                    str2 = technicalName;
                }
                s2.mo50883a(list, str3, str2, mo44758v2());
            }
        }
        z = false;
        C12139g.m26475d(textView, z, 0, 2, (Object) null);
        this.f3240r.setText(str);
        C12977b s22 = mo44755s2();
        PageSectionOffersList pageSectionOffersList22 = this.f3241s;
        String str22 = "";
        String str32 = str22;
        str22 = technicalName;
        s22.mo50883a(list, str32, str22, mo44758v2());
    }

    /* renamed from: j1 */
    public void mo28505j1() {
        super.mo44750d();
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        super.mo23234m2(aVar, obj);
        if (obj instanceof PageSectionOffersList) {
            PageSectionOffersList pageSectionOffersList = (PageSectionOffersList) obj;
            this.f3241s = pageSectionOffersList;
            m4769y2().mo44052o2(new C4044f.C4045a((BasePageSection) obj, pageSectionOffersList.getTechnicalName(), mo44754r2(), pageSectionOffersList.isSponsored(), 10));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public C9903b mo28506o2() {
        return new C9905d();
    }

    /* renamed from: x1 */
    public int mo28507x1() {
        return getBindingAdapterPosition();
    }
}
