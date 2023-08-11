package com.poulpeo.p321ui.screens.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.poulpeo.R;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.BaseListView;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p008i9.C2025i;
import p258v9.C10058c;
import p311bd.C10930a;
import p368jd.C12616b;
import p399oa.C13029h;
import p399oa.C13031i;
import p432tb.C13479c;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.home.PageActivity */
/* compiled from: PageActivity.kt */
public final class PageActivity extends C12616b implements C13031i {

    /* renamed from: q */
    public static final C11133a f17333q = new C11133a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final int f17334r = 8;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final IntentDelegate.String f17335s = new IntentDelegate.String("title");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final IntentDelegate.String f17336t = new IntentDelegate.String("pageId");

    /* renamed from: m */
    private final int f17337m;

    /* renamed from: n */
    private C13029h f17338n;

    /* renamed from: o */
    private C10058c f17339o;

    /* renamed from: p */
    public Map<Integer, View> f17340p = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.home.PageActivity$a */
    /* compiled from: PageActivity.kt */
    public static final class C11133a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17341a;

        static {
            Class<C11133a> cls = C11133a.class;
            f17341a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "title", "getTitle(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "pageId", "getPageId(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11133a() {
        }

        public /* synthetic */ C11133a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String m24098c(Intent intent) {
            return PageActivity.f17336t.getValue(intent, (KProperty<?>) f17341a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m24099d(Intent intent) {
            return PageActivity.f17335s.getValue(intent, (KProperty<?>) f17341a[0]);
        }

        /* renamed from: f */
        private final void m24100f(Intent intent, String str) {
            PageActivity.f17336t.setValue(intent, (KProperty<?>) f17341a[1], str);
        }

        /* renamed from: g */
        private final void m24101g(Intent intent, String str) {
            PageActivity.f17335s.setValue(intent, (KProperty<?>) f17341a[0], str);
        }

        /* renamed from: e */
        public final Intent mo46270e(Context context, String str, String str2) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "title");
            C12775o.m28639i(str2, "pageId");
            Intent intent = new Intent(context, PageActivity.class);
            C11133a aVar = PageActivity.f17333q;
            aVar.m24101g(intent, str);
            aVar.m24100f(intent, str2);
            return intent;
        }
    }

    /* renamed from: A2 */
    public View mo46269A2(int i) {
        Map<Integer, View> map = this.f17340p;
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
    public void onCreate(Bundle bundle) {
        C10058c cVar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_page);
        C11133a aVar = f17333q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        mo50358x2("PageActivity-" + aVar.m24098c(intent), true);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            Intent intent2 = getIntent();
            C12775o.m28638h(intent2, "intent");
            supportActionBar.setTitle((CharSequence) aVar.m24099d(intent2));
        }
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        this.f17339o = new C10058c(aVar.m24098c(intent3));
        ContextContainer o2 = mo47878o2();
        C13689a aVar2 = new C13689a(mo47878o2());
        int i = C13865f.pageListView;
        C10930a baseListViewController = ((BaseListView) mo46269A2(i)).getBaseListViewController();
        C11654c f = C13479c.f21636k.mo53083a(this).mo53076f();
        Intent intent4 = getIntent();
        C12775o.m28638h(intent4, "intent");
        String a = aVar.m24098c(intent4);
        C10058c cVar2 = this.f17339o;
        if (cVar2 == null) {
            C12775o.m28656z("pageReload");
            cVar = null;
        } else {
            cVar = cVar2;
        }
        C13029h hVar = new C13029h(this, new C13029h.C13030a(o2, aVar2, baseListViewController, f, a, cVar));
        this.f17338n = hVar;
        hVar.mo45812o2();
        BaseListView baseListView = (BaseListView) mo46269A2(i);
        BaseListView baseListView2 = (BaseListView) mo46269A2(i);
        C12775o.m28638h(baseListView2, "pageListView");
        C13029h hVar2 = this.f17338n;
        if (hVar2 == null) {
            C12775o.m28656z("controller");
            hVar2 = null;
        }
        CallManager A2 = hVar2.mo50943A2();
        C12775o.m28638h(A2, "controller.callManager");
        C10058c cVar3 = this.f17339o;
        if (cVar3 == null) {
            C12775o.m28656z("pageReload");
            cVar3 = null;
        }
        Intent intent5 = getIntent();
        C12775o.m28638h(intent5, "intent");
        baseListView.setAdapter(new C2025i(baseListView2, A2, cVar3, "page-" + aVar.m24098c(intent5)));
        ((BaseListView) mo46269A2(i)).getRecyclerView().setVerticalScrollBarEnabled(false);
        ((BaseListView) mo46269A2(i)).getRecyclerView().setItemAnimator((RecyclerView.ItemAnimator) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C13029h hVar = this.f17338n;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo45814q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C13029h hVar = this.f17338n;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo45816s2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13029h hVar = this.f17338n;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo45818u2();
        C13618g gVar = C13618g.f21930b;
        C11133a aVar = f17333q;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String a = aVar.m24098c(intent);
        gVar.mo53280e(new C13616e("page-" + a, C13617f.PAGE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17337m;
    }
}
