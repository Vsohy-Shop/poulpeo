package p269w9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.poulpeo.R;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.BasePageSectionList;
import java.net.URL;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p247u9.C9903b;
import p258v9.C10058c;
import p360id.C12139g;
import p394nb.C12977b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: w9.b */
/* compiled from: BaseSectionViewHolder.kt */
public abstract class C10154b extends C14080a {

    /* renamed from: g */
    private final CallManager f15334g;

    /* renamed from: h */
    private final C10058c f15335h;

    /* renamed from: i */
    private final String f15336i;

    /* renamed from: j */
    private final C12977b f15337j;

    /* renamed from: k */
    private final LinearLayout f15338k;

    /* renamed from: l */
    private final HorizontalScrollView f15339l;

    /* renamed from: m */
    private final ShimmerFrameLayout f15340m;

    /* renamed from: n */
    private final ImageView f15341n;

    /* renamed from: o */
    private final ViewGroup f15342o;

    /* renamed from: p */
    private boolean f15343p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10154b(View view, C13867a.C13868a aVar, CallManager callManager, C10058c cVar, String str) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(callManager, "callManager");
        C12775o.m28639i(cVar, "pageReload");
        C12775o.m28639i(str, "trackingPageName");
        this.f15334g = callManager;
        this.f15335h = cVar;
        this.f15336i = str;
        View findViewById = view.findViewById(R.id.sliderContainerLayoutSection);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.…erContainerLayoutSection)");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f15338k = linearLayout;
        this.f15339l = (HorizontalScrollView) view.findViewById(R.id.sliderContainerScrollViewSection);
        View findViewById2 = view.findViewById(R.id.relativeLayoutSection);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.relativeLayoutSection)");
        this.f15342o = (ViewGroup) findViewById2;
        View findViewById3 = view.findViewById(R.id.gallery_placeholder);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.gallery_placeholder)");
        this.f15340m = (ShimmerFrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.imageViewPlaceholderShimmer);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.…geViewPlaceholderShimmer)");
        this.f15341n = (ImageView) findViewById4;
        this.f15337j = new C12977b(linearLayout, aVar, mo28506o2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo44750d() {
        C12139g.m26475d(this.f15340m, false, 0, 2, (Object) null);
        C12139g.m26475d(this.f15342o, false, 0, 2, (Object) null);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12139g.m26475d(this.f15342o, true, 0, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public final boolean mo44751n2(BasePageSectionList basePageSectionList, List<? extends Object> list) {
        boolean z;
        C12775o.m28639i(basePageSectionList, "basePageSectionList");
        C12775o.m28639i(list, "items");
        if (mo44759w2(basePageSectionList).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || list.size() >= 7) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public abstract C9903b mo28506o2();

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public final boolean mo44752p2() {
        return this.f15343p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public final ImageView mo44753q2() {
        return this.f15341n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public final C10058c mo44754r2() {
        return this.f15335h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public final C12977b mo44755s2() {
        return this.f15337j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public final HorizontalScrollView mo44756t2() {
        return this.f15339l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u2 */
    public final ShimmerFrameLayout mo44757u2() {
        return this.f15340m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public final String mo44758v2() {
        return this.f15336i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public final String mo44759w2(BasePageSectionList basePageSectionList) {
        C12775o.m28639i(basePageSectionList, "basePageSectionList");
        URL url = basePageSectionList.link;
        if (url != null) {
            C12775o.m28636f(url);
            if (url.getHost().equals("CMS")) {
                URL url2 = basePageSectionList.link;
                C12775o.m28636f(url2);
                String file = url2.getFile();
                C12775o.m28638h(file, "basePageSectionList.link!!.file");
                return C13754v.m31521A(file, "/", "", false, 4, (Object) null);
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public final void mo44760x2(boolean z) {
        this.f15343p = z;
    }
}
