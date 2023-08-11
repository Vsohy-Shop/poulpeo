package com.poulpeo.p321ui.screens.review_merchant;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p008i9.C2030k;
import p102g9.C7832a;
import p102g9.C7834c;
import p311bd.C10930a;
import p358ib.C12124j;
import p358ib.C12125k;
import p358ib.C12129l;
import p360id.C12136d;
import p368jd.C12616b;
import p404of.C13074a;
import p432tb.C13479c;
import p434td.C13487a;
import p440ud.C13548a;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.review_merchant.ReviewMerchantListActivity */
/* compiled from: ReviewMerchantListActivity.kt */
public final class ReviewMerchantListActivity extends C12616b implements C12129l {

    /* renamed from: q */
    public static final C11213a f17703q = new C11213a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final int f17704r = 8;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final IntentDelegate.String f17705s = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final IntentDelegate.String f17706t = new IntentDelegate.String("merchantName");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final IntentDelegate.Double f17707u = new IntentDelegate.Double("score");
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final IntentDelegate.Int f17708v = new IntentDelegate.Int("numberReviews");

    /* renamed from: m */
    private final int f17709m = R.string.review_merchant_list_title;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C12125k f17710n;

    /* renamed from: o */
    private final Lazy f17711o = C11901h.m25690b(new C11215c(this));

    /* renamed from: p */
    public Map<Integer, View> f17712p = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.review_merchant.ReviewMerchantListActivity$a */
    /* compiled from: ReviewMerchantListActivity.kt */
    public static final class C11213a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17713a;

        static {
            Class<C11213a> cls = C11213a.class;
            f17713a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "merchantName", "getMerchantName(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "score", "getScore(Landroid/content/Intent;)D", 0)), C12764h0.m28590f(new C12783v(cls, "numberReviews", "getNumberReviews(Landroid/content/Intent;)I", 0))};
        }

        private C11213a() {
        }

        public /* synthetic */ C11213a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final String m24778e(Intent intent) {
            return ReviewMerchantListActivity.f17705s.getValue(intent, (KProperty<?>) f17713a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m24779f(Intent intent) {
            return ReviewMerchantListActivity.f17706t.getValue(intent, (KProperty<?>) f17713a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final int m24780g(Intent intent) {
            return ReviewMerchantListActivity.f17708v.getValue(intent, (KProperty<?>) f17713a[3]).intValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final double m24781h(Intent intent) {
            return ReviewMerchantListActivity.f17707u.getValue(intent, (KProperty<?>) f17713a[2]).doubleValue();
        }

        /* renamed from: j */
        private final void m24782j(Intent intent, String str) {
            ReviewMerchantListActivity.f17705s.setValue(intent, (KProperty<?>) f17713a[0], str);
        }

        /* renamed from: k */
        private final void m24783k(Intent intent, String str) {
            ReviewMerchantListActivity.f17706t.setValue(intent, (KProperty<?>) f17713a[1], str);
        }

        /* renamed from: l */
        private final void m24784l(Intent intent, int i) {
            ReviewMerchantListActivity.f17708v.setValue(intent, (KProperty<?>) f17713a[3], i);
        }

        /* renamed from: m */
        private final void m24785m(Intent intent, double d) {
            ReviewMerchantListActivity.f17707u.setValue(intent, (KProperty<?>) f17713a[2], d);
        }

        /* renamed from: i */
        public final Intent mo46487i(Context context, String str, String str2, double d, int i) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "merchantId");
            C12775o.m28639i(str2, "merchantName");
            Intent intent = new Intent(context, ReviewMerchantListActivity.class);
            C11213a aVar = ReviewMerchantListActivity.f17703q;
            aVar.m24782j(intent, str);
            aVar.m24783k(intent, str2);
            aVar.m24785m(intent, d);
            aVar.m24784l(intent, i);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.review_merchant.ReviewMerchantListActivity$b */
    /* compiled from: ReviewMerchantListActivity.kt */
    public static final class C11214b extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ ReviewMerchantListActivity f17714a;

        /* renamed from: b */
        final /* synthetic */ C13487a f17715b;

        C11214b(ReviewMerchantListActivity reviewMerchantListActivity, C13487a aVar) {
            this.f17714a = reviewMerchantListActivity;
            this.f17715b = aVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C12775o.m28639i(recyclerView, "recyclerView");
            C12125k C2 = this.f17714a.f17710n;
            if (C2 == null) {
                C12775o.m28656z("controller");
                C2 = null;
            }
            if (C2.mo49574O2()) {
                if (i2 > 1) {
                    this.f17715b.mo53092c();
                } else if (i2 < 0) {
                    this.f17715b.mo53093g();
                }
            }
        }
    }

    /* renamed from: com.poulpeo.ui.screens.review_merchant.ReviewMerchantListActivity$c */
    /* compiled from: ReviewMerchantListActivity.kt */
    static final class C11215c extends C12777p implements C13074a<C13689a> {

        /* renamed from: g */
        final /* synthetic */ ReviewMerchantListActivity f17716g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11215c(ReviewMerchantListActivity reviewMerchantListActivity) {
            super(0);
            this.f17716g = reviewMerchantListActivity;
        }

        /* renamed from: b */
        public final C13689a invoke() {
            return new C13689a(this.f17716g.mo47878o2());
        }
    }

    /* renamed from: H2 */
    private final C13689a m24767H2() {
        return (C13689a) this.f17711o.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m24768I2(ReviewMerchantListActivity reviewMerchantListActivity, View view) {
        C12775o.m28639i(reviewMerchantListActivity, "this$0");
        reviewMerchantListActivity.startActivity(WebActivity.f17745z.mo46525d(reviewMerchantListActivity));
    }

    /* renamed from: B2 */
    public View mo46483B2(int i) {
        Map<Integer, View> map = this.f17712p;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: V0 */
    public void mo46484V0(String str, String str2) {
        C12775o.m28639i(str, "merchantId");
        C12775o.m28639i(str2, "merchantName");
        try {
            startActivityForResult(ReviewMerchantAddActivity.f17689w.mo46481e(this, Integer.parseInt(str), str2), 56);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i1 */
    public void mo46485i1() {
        setResult(666);
    }

    /* renamed from: l0 */
    public void mo46486l0(String str) {
        if (str != null) {
            C12136d.m26468j(this, str);
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 56 && i2 == 101) {
            C12125k kVar = this.f17710n;
            if (kVar == null) {
                C12775o.m28656z("controller");
                kVar = null;
            }
            kVar.mo49575R2();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("ReviewMerchantListActivity", false);
        setContentView(R.layout.activity_review_merchant_list);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setElevation(0.0f);
        }
        ((TextView) mo46483B2(C13865f.textViewPaymentConditions)).setOnClickListener(new C12124j(this));
        int i = C13865f.reviewMerchantListView;
        BaseListView baseListView = (BaseListView) mo46483B2(i);
        C12775o.m28638h(baseListView, "reviewMerchantListView");
        ((BaseListView) mo46483B2(i)).setAdapter(new C2030k(baseListView));
        int i2 = C13865f.fabAddReview;
        Button button = (Button) mo46483B2(i2);
        C12775o.m28638h(button, "fabAddReview");
        ((BaseListView) mo46483B2(i)).setOnScrollListener(new C11214b(this, new C13487a(button)));
        ContextContainer o2 = mo47878o2();
        C13689a H2 = m24767H2();
        C10930a baseListViewController = ((BaseListView) mo46483B2(i)).getBaseListViewController();
        C11654c i3 = C13479c.f21636k.mo53083a(this).mo53079i();
        C11213a aVar = f17703q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar.m24778e(intent);
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        String b = aVar.m24779f(intent2);
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        double d = aVar.m24781h(intent3);
        Intent intent4 = getIntent();
        C12775o.m28638h(intent4, "intent");
        C12125k kVar = new C12125k(this, new C12125k.C12128c(o2, H2, baseListViewController, i3, a, b, d, aVar.m24780g(intent4), new C13548a((Button) mo46483B2(i2))));
        this.f17710n = kVar;
        kVar.mo45812o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12125k kVar = this.f17710n;
        if (kVar == null) {
            C12775o.m28656z("controller");
            kVar = null;
        }
        kVar.mo45814q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12125k kVar = this.f17710n;
        if (kVar == null) {
            C12775o.m28656z("controller");
            kVar = null;
        }
        kVar.mo45816s2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C7832a a = C7834c.m15321a(this);
        ContextContainer o2 = mo47878o2();
        C11213a aVar = f17703q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String str = aVar.m24778e(intent).toString();
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        a.mo41540g(o2, str, aVar.m24779f(intent2));
        C12125k kVar = this.f17710n;
        if (kVar == null) {
            C12775o.m28656z("controller");
            kVar = null;
        }
        kVar.mo45818u2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17709m;
    }
}
