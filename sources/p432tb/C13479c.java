package p432tb;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.p324ui.views.listview.C11654c;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p311bd.C10932b;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
/* renamed from: tb.c */
/* compiled from: PLPListViewMessageBundlesManager.kt */
public final class C13479c {

    /* renamed from: k */
    public static final C13480a f21636k = new C13480a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final int f21637l = 8;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static C13479c f21638m;

    /* renamed from: a */
    private final C11654c f21639a;

    /* renamed from: b */
    private final C11654c f21640b;

    /* renamed from: c */
    private final C11654c f21641c;

    /* renamed from: d */
    private final C11654c f21642d;

    /* renamed from: e */
    private final C11654c f21643e;

    /* renamed from: f */
    private final C11654c f21644f;

    /* renamed from: g */
    private final C11654c f21645g;

    /* renamed from: h */
    private final C11654c f21646h;

    /* renamed from: i */
    private final C11654c f21647i;

    /* renamed from: j */
    private final C11654c f21648j;

    /* renamed from: tb.c$a */
    /* compiled from: PLPListViewMessageBundlesManager.kt */
    public static final class C13480a {
        private C13480a() {
        }

        public /* synthetic */ C13480a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13479c mo53083a(Context context) {
            C12775o.m28639i(context, "context");
            if (C13479c.f21638m == null) {
                synchronized (C13479c.class) {
                    if (C13479c.f21638m == null) {
                        C13479c.f21638m = new C13479c(context, (DefaultConstructorMarker) null);
                    }
                    C11921v vVar = C11921v.f18618a;
                }
            }
            C13479c a = C13479c.f21638m;
            C12775o.m28636f(a);
            return a;
        }
    }

    public /* synthetic */ C13479c(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* renamed from: c */
    public final C11654c mo53073c() {
        return this.f21648j;
    }

    /* renamed from: d */
    public final C11654c mo53074d() {
        return this.f21640b;
    }

    /* renamed from: e */
    public final C11654c mo53075e() {
        return this.f21644f;
    }

    /* renamed from: f */
    public final C11654c mo53076f() {
        return this.f21639a;
    }

    /* renamed from: g */
    public final C11654c mo53077g() {
        return this.f21641c;
    }

    /* renamed from: h */
    public final C11654c mo53078h() {
        return this.f21642d;
    }

    /* renamed from: i */
    public final C11654c mo53079i() {
        return this.f21645g;
    }

    /* renamed from: j */
    public final C11654c mo53080j() {
        return this.f21643e;
    }

    /* renamed from: k */
    public final C11654c mo53081k() {
        return this.f21646h;
    }

    /* renamed from: l */
    public final C11654c mo53082l() {
        return this.f21647i;
    }

    private C13479c(Context context) {
        C11654c cVar = new C11654c();
        this.f21639a = cVar;
        C11654c cVar2 = new C11654c();
        this.f21640b = cVar2;
        C11654c cVar3 = new C11654c();
        this.f21641c = cVar3;
        C11654c cVar4 = new C11654c();
        this.f21642d = cVar4;
        C11654c cVar5 = new C11654c();
        this.f21643e = cVar5;
        C11654c cVar6 = new C11654c();
        this.f21644f = cVar6;
        C11654c cVar7 = new C11654c();
        this.f21645g = cVar7;
        C11654c cVar8 = new C11654c();
        this.f21646h = cVar8;
        C11654c cVar9 = new C11654c();
        this.f21647i = cVar9;
        C11654c cVar10 = new C11654c();
        this.f21648j = cVar10;
        Resources resources = context.getResources();
        C10932b bVar = C10932b.f16861c;
        cVar.mo47900b(bVar, resources.getString(R.string.listview_merchant_error));
        C10932b bVar2 = C13481d.f21650g;
        cVar.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        C10932b bVar3 = C13481d.f21651h;
        cVar.mo47900b(bVar3, resources.getString(R.string.listview_merchant_maintenance));
        C10932b bVar4 = C13481d.f21649f;
        C11654c cVar11 = cVar10;
        cVar.mo47900b(bVar4, resources.getString(R.string.listview_merchant_network_problem));
        C10932b bVar5 = C10932b.f16862d;
        cVar.mo47900b(bVar5, resources.getString(R.string.listview_merchant_no_result));
        cVar2.mo47900b(bVar, resources.getString(R.string.listview_earnings_error));
        cVar2.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar2.mo47900b(bVar3, resources.getString(R.string.listview_earnings_maintenance));
        cVar2.mo47900b(bVar4, resources.getString(R.string.listview_earnings_network_problem));
        cVar2.mo47900b(bVar5, resources.getString(R.string.listview_earnings_no_result));
        cVar3.mo47900b(bVar, resources.getString(R.string.listview_merchant_error));
        cVar3.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar3.mo47900b(bVar3, resources.getString(R.string.listview_merchant_maintenance));
        cVar3.mo47900b(bVar4, resources.getString(R.string.listview_merchant_network_problem));
        cVar3.mo47900b(bVar5, resources.getString(R.string.listview_merchant_no_result));
        cVar4.mo47900b(bVar, resources.getString(R.string.listview_coupon_error));
        cVar4.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar4.mo47900b(bVar3, resources.getString(R.string.listview_coupon_maintenance));
        cVar4.mo47900b(bVar4, resources.getString(R.string.listview_coupon_network_problem));
        cVar4.mo47900b(bVar5, resources.getString(R.string.listview_coupon_no_result));
        cVar5.mo47900b(bVar, resources.getString(R.string.listview_search_error));
        cVar5.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar5.mo47900b(bVar3, resources.getString(R.string.listview_search_maintenance));
        cVar5.mo47900b(bVar4, resources.getString(R.string.listview_search_network_problem));
        cVar5.mo47900b(bVar5, resources.getString(R.string.listview_search_no_result));
        cVar6.mo47900b(bVar, resources.getString(R.string.listview_favorite_error));
        cVar6.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar6.mo47900b(bVar3, resources.getString(R.string.listview_favorite_maintenance));
        cVar6.mo47900b(bVar4, resources.getString(R.string.listview_favorite_network_problem));
        cVar6.mo47900b(bVar5, resources.getString(R.string.listview_favorite_no_result));
        cVar7.mo47900b(bVar, resources.getString(R.string.listview_review_merchant_error));
        cVar7.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar7.mo47900b(bVar3, resources.getString(R.string.listview_review_merchant_maintenance));
        cVar7.mo47900b(bVar4, resources.getString(R.string.listview_review_merchant_network_problem));
        cVar7.mo47900b(bVar5, resources.getString(R.string.listview_review_merchant_no_result));
        cVar8.mo47900b(bVar, resources.getString(R.string.listview_sponsored_user_error));
        cVar8.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar8.mo47900b(bVar3, resources.getString(R.string.listview_sponsored_user_maintenance));
        cVar8.mo47900b(bVar4, resources.getString(R.string.listview_sponsored_user_network_problem));
        cVar8.mo47900b(bVar5, resources.getString(R.string.listview_sponsored_user_no_result));
        C11654c cVar12 = cVar9;
        cVar12.mo47900b(bVar, resources.getString(R.string.support_ticket_list_default_error));
        cVar12.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar12.mo47900b(bVar3, resources.getString(R.string.support_ticket_list_maintenance));
        cVar12.mo47900b(bVar4, resources.getString(R.string.support_ticket_list_network_problem));
        cVar12.mo47900b(bVar5, resources.getString(R.string.support_ticket_list_no_result));
        C11654c cVar13 = cVar11;
        cVar13.mo47900b(bVar, resources.getString(R.string.country_default_error));
        cVar13.mo47900b(bVar2, resources.getString(R.string.error_timestamp));
        cVar13.mo47900b(bVar3, resources.getString(R.string.country_maintenance));
        cVar13.mo47900b(bVar4, resources.getString(R.string.country_network_problem));
        cVar13.mo47900b(bVar5, resources.getString(R.string.country_no_result));
    }
}
