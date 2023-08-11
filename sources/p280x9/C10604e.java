package p280x9;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.video.PLPFullScreenVideoActivity;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p258v9.C10058c;
import p280x9.C10599b;
import p404of.C13074a;
import p409pc.C13200d;
import p445vc.C13618g;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: x9.e */
/* compiled from: BannerSectionViewHolder.kt */
public final class C10604e extends C14080a implements C10602c {

    /* renamed from: g */
    private final String f16157g;

    /* renamed from: h */
    private final ImageView f16158h;

    /* renamed from: i */
    private final Lazy f16159i = C11901h.m25690b(new C10605a(this));

    /* renamed from: j */
    private PageSectionShortCode.ShortCode f16160j;

    /* renamed from: x9.e$a */
    /* compiled from: BannerSectionViewHolder.kt */
    static final class C10605a extends C12777p implements C13074a<C10599b> {

        /* renamed from: g */
        final /* synthetic */ C10604e f16161g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10605a(C10604e eVar) {
            super(0);
            this.f16161g = eVar;
        }

        /* renamed from: b */
        public final C10599b invoke() {
            C10604e eVar = this.f16161g;
            return new C10599b(eVar, new C10599b.C10601b(eVar.mo53840J0()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10604e(View view, C13867a.C13868a aVar, String str) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(str, "trackingPageName");
        this.f16157g = str;
        View findViewById = view.findViewById(R.id.imageViewImageBanner);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.imageViewImageBanner)");
        this.f16158h = (ImageView) findViewById;
    }

    /* renamed from: o2 */
    private final C10599b m22549o2() {
        return (C10599b) this.f16159i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m22550p2(C10604e eVar, Object obj, View view) {
        C12775o.m28639i(eVar, "this$0");
        C13618g.f21930b.mo53279c(eVar.f16157g, "click-banner", ((PageSectionShortCode) obj).getShortCode().tag);
        C13200d.f21007a.mo52839q(eVar.mo53843t0());
        eVar.mo53843t0().startActivity(PLPFullScreenVideoActivity.f17741v.mo46518a(eVar.mo53843t0()));
    }

    /* renamed from: M */
    public void mo28504M(List<IModel> list) {
        C12775o.m28639i(list, "items");
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        this.f16158h.setVisibility(8);
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode");
        PageSectionShortCode.ShortCode shortCode = ((PageSectionShortCode) obj).getShortCode();
        C12775o.m28638h(shortCode, "pageSectionShortCode.shortCode");
        this.f16160j = shortCode;
        m22549o2().mo44052o2(new C10599b.C10600a((BasePageSection) obj, (C10058c) null));
        this.itemView.setOnClickListener(new C10603d(this, obj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r2 != com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode.ShortCode.BANNER1) goto L_0x0011;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45553n0(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "shortCode"
            if (r5 == 0) goto L_0x0011
            com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode r2 = r4.f16160j
            if (r2 != 0) goto L_0x000d
            kotlin.jvm.internal.C12775o.m28656z(r1)
            r2 = r0
        L_0x000d:
            com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode r3 = com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode.ShortCode.BANNER1
            if (r2 == r3) goto L_0x0020
        L_0x0011:
            if (r5 != 0) goto L_0x0026
            com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode r5 = r4.f16160j
            if (r5 != 0) goto L_0x001b
            kotlin.jvm.internal.C12775o.m28656z(r1)
            goto L_0x001c
        L_0x001b:
            r0 = r5
        L_0x001c:
            com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode$ShortCode r5 = com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionShortCode.ShortCode.BANNER2
            if (r0 != r5) goto L_0x0026
        L_0x0020:
            android.widget.ImageView r5 = r4.f16158h
            r0 = 0
            r5.setVisibility(r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p280x9.C10604e.mo45553n0(boolean):void");
    }

    /* renamed from: x1 */
    public int mo28507x1() {
        return -1;
    }

    /* renamed from: j1 */
    public void mo28505j1() {
    }
}
