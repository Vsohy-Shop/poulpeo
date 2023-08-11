package p431ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p008i9.C2019d;
import p013n9.C2068c;
import p360id.C12139g;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: ta.x */
/* compiled from: MerchantSimilarView.kt */
public final class C13474x {

    /* renamed from: h */
    public static final C13475a f21626h = new C13475a((DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final int f21627i = 8;

    /* renamed from: a */
    private final AppCompatActivity f21628a;

    /* renamed from: b */
    private final View f21629b;

    /* renamed from: c */
    private final TextView f21630c;

    /* renamed from: d */
    private final TextView f21631d;

    /* renamed from: e */
    private final ProgressBar f21632e;

    /* renamed from: f */
    private final ViewGroup f21633f;

    /* renamed from: g */
    private final C2068c f21634g;

    /* renamed from: ta.x$a */
    /* compiled from: MerchantSimilarView.kt */
    public static final class C13475a {
        private C13475a() {
        }

        public /* synthetic */ C13475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13474x(AppCompatActivity appCompatActivity, ViewGroup viewGroup, C13867a.C13868a aVar, boolean z) {
        C12775o.m28639i(appCompatActivity, "activity");
        C12775o.m28639i(viewGroup, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(aVar, "listener");
        this.f21628a = appCompatActivity;
        View inflate = LayoutInflater.from(appCompatActivity).inflate(R.layout.view_merchant_no_cashback, viewGroup, false);
        C12775o.m28638h(inflate, "from(activity).inflate(R…shback, container, false)");
        this.f21629b = inflate;
        View findViewById = inflate.findViewById(R.id.addFavoriteTextView);
        C12775o.m28638h(findViewById, "view.findViewById(R.id.addFavoriteTextView)");
        TextView textView = (TextView) findViewById;
        this.f21630c = textView;
        View findViewById2 = inflate.findViewById(R.id.addFavoriteLabelTextView);
        C12775o.m28638h(findViewById2, "view.findViewById(R.id.addFavoriteLabelTextView)");
        this.f21631d = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.progressBarLoader);
        C12775o.m28638h(findViewById3, "view.findViewById(R.id.progressBarLoader)");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        this.f21632e = progressBar;
        View findViewById4 = inflate.findViewById(R.id.layoutSimilarMerchants);
        C12775o.m28638h(findViewById4, "view.findViewById(R.id.layoutSimilarMerchants)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById4;
        this.f21633f = viewGroup2;
        textView.setOnClickListener(new C13473w(aVar));
        mo53069f(z);
        this.f21634g = new C2068c(viewGroup2, aVar, (C2019d) null, (Map<Object, Integer>) null, false);
        progressBar.setEnabled(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m30694b(C13867a.C13868a aVar, View view) {
        C12775o.m28639i(aVar, "$listener");
        aVar.mo46342E("ADD_FAVORITES");
    }

    /* renamed from: c */
    public final View mo53066c() {
        return this.f21629b;
    }

    /* renamed from: d */
    public final void mo53067d() {
        this.f21632e.setEnabled(false);
        C12139g.m26475d(this.f21632e, false, 0, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo53068e(List<? extends BaseMerchant> list, int i) {
        if (list != null && !list.isEmpty()) {
            this.f21632e.setEnabled(false);
            C12139g.m26475d(this.f21632e, false, 0, 2, (Object) null);
            C12139g.m26475d(this.f21633f, true, 0, 2, (Object) null);
            C2068c cVar = this.f21634g;
            String string = this.f21628a.getString(R.string.no_cashback_similar_merchants_section_title);
            C12775o.m28638h(string, "activity.getString(R.str…_merchants_section_title)");
            cVar.mo23256y2(string, list, i, "SIMILAR_MERCHANTS");
        }
    }

    /* renamed from: f */
    public final void mo53069f(boolean z) {
        if (z) {
            C12139g.m26475d(this.f21630c, false, 0, 2, (Object) null);
            this.f21631d.setText(this.f21628a.getString(R.string.no_cashback_favorite_on_label));
            return;
        }
        C12139g.m26475d(this.f21630c, true, 0, 2, (Object) null);
        this.f21631d.setText(this.f21628a.getString(R.string.no_cashback_favorite_off_label));
    }
}
