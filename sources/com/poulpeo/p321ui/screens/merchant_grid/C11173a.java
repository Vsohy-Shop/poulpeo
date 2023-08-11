package com.poulpeo.p321ui.screens.merchant_grid;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.poulpeo.R;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.views.listview.C11661j;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p236t9.C9772d;
import p360id.C12139g;
import p368jd.C12616b;
import p449wa.C13671a;
import p449wa.C13672b;
import p449wa.C13680h;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant_grid.a */
/* compiled from: BaseMerchantGridActivity.kt */
public abstract class C11173a extends C12616b implements C13680h {

    /* renamed from: p */
    public static final C11174a f17536p = new C11174a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17537q = 8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final IntentDelegate.String f17538r = new IntentDelegate.String("title");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final IntentDelegate.String f17539s = new IntentDelegate.String("listTechName");

    /* renamed from: m */
    private final int f17540m = R.string.menu_merchant_grid;

    /* renamed from: n */
    protected C13672b f17541n;

    /* renamed from: o */
    public Map<Integer, View> f17542o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant_grid.a$a */
    /* compiled from: BaseMerchantGridActivity.kt */
    public static final class C11174a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17543a;

        static {
            Class<C11174a> cls = C11174a.class;
            f17543a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "title", "getTitle(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "listTechName", "getListTechName(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11174a() {
        }

        public /* synthetic */ C11174a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final String mo46390a(Intent intent) {
            C12775o.m28639i(intent, "<this>");
            return C11173a.f17539s.getValue(intent, (KProperty<?>) f17543a[1]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final String mo46391b(Intent intent) {
            C12775o.m28639i(intent, "<this>");
            return C11173a.f17538r.getValue(intent, (KProperty<?>) f17543a[0]);
        }

        /* renamed from: c */
        public final Intent mo46392c(Context context, Class<?> cls, String str, String str2) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(cls, "screenClass");
            C12775o.m28639i(str, "title");
            C12775o.m28639i(str2, "listTechName");
            Intent intent = new Intent(context, cls);
            C11174a aVar = C11173a.f17536p;
            aVar.mo46394e(intent, str);
            aVar.mo46393d(intent, str2);
            return intent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo46393d(Intent intent, String str) {
            C12775o.m28639i(intent, "<this>");
            C12775o.m28639i(str, "<set-?>");
            C11173a.f17539s.setValue(intent, (KProperty<?>) f17543a[1], str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final void mo46394e(Intent intent, String str) {
            C12775o.m28639i(intent, "<this>");
            C12775o.m28639i(str, "<set-?>");
            C11173a.f17538r.setValue(intent, (KProperty<?>) f17543a[0], str);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_grid.a$b */
    /* compiled from: BaseMerchantGridActivity.kt */
    public enum C11175b {
        CAMPAIGNS,
        CONTAINER,
        SIMILAR,
        SEARCH
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m24434H2(C11173a aVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(aVar, "this$0");
        aVar.finish();
    }

    /* renamed from: B2 */
    public View mo46381B2(int i) {
        Map<Integer, View> map = this.f17542o;
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

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public abstract C11175b mo46382E2();

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public final C13672b mo46386F2() {
        C13672b bVar = this.f17541n;
        if (bVar != null) {
            return bVar;
        }
        C12775o.m28656z("controller");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public abstract C13672b mo46383G2();

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public final void mo46387I2(C13672b bVar) {
        C12775o.m28639i(bVar, "<set-?>");
        this.f17541n = bVar;
    }

    /* renamed from: d */
    public void mo46388d() {
        new AlertDialog.Builder(this).setTitle("Une erreur est survenue").setMessage("Il nous est impossible pour l'instant de vous afficher la section. Veuillez réessayer plus tard.").setPositiveButton("RETOUR", new C13671a(this)).show();
    }

    /* renamed from: m */
    public void mo46389m(boolean z) {
        ImageView imageView = (ImageView) mo46381B2(C13865f.imageViewBackground);
        C12775o.m28638h(imageView, "imageViewBackground");
        C12139g.m26475d(imageView, z, 0, 2, (Object) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_merchant_grid);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C11174a aVar = f17536p;
            Intent intent = getIntent();
            C12775o.m28638h(intent, "intent");
            supportActionBar.setTitle((CharSequence) aVar.mo46391b(intent));
        }
        View findViewById = findViewById(R.id.appbar);
        C12775o.m28638h(findViewById, "findViewById(R.id.appbar)");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        C12775o.m28637g(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        int i = C13865f.merchantGridView;
        ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(((BaseListView) mo46381B2(i)).mo47889M0());
        appBarLayout.requestLayout();
        BaseListView baseListView = (BaseListView) mo46381B2(i);
        C12775o.m28638h(baseListView, "merchantGridView");
        C11174a aVar2 = f17536p;
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        String b = aVar2.mo46391b(intent2);
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        ((BaseListView) mo46381B2(i)).setAdapter(new C9772d(baseListView, 1, -1, b, aVar2.mo46390a(intent3), mo46382E2(), ""));
        ImageView imageView = (ImageView) mo46381B2(C13865f.imageViewBackground);
        C12775o.m28638h(imageView, "imageViewBackground");
        ((BaseListView) mo46381B2(i)).setOnScrollListener(new C11661j(imageView, 0.82f));
        mo46387I2(mo46383G2());
        mo46386F2().mo45812o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo46386F2().mo45814q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo46386F2().mo45816s2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo46386F2().mo45818u2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17540m;
    }
}
