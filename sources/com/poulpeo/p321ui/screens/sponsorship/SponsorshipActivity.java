package com.poulpeo.p321ui.screens.sponsorship;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.views.listview.ExpandableListView;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p008i9.C2032l;
import p360id.C12136d;
import p368jd.C12616b;
import p373kb.C12644a;
import p373kb.C12647d;
import p373kb.C12650e;
import p432tb.C13479c;
import p440ud.C13566l;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.sponsorship.SponsorshipActivity */
/* compiled from: SponsorshipActivity.kt */
public final class SponsorshipActivity extends C12616b implements C12650e {

    /* renamed from: p */
    public static final C11216a f17717p = new C11216a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17718q = 8;

    /* renamed from: m */
    private final int f17719m = R.string.sponsorship_title;

    /* renamed from: n */
    private C12647d f17720n;

    /* renamed from: o */
    public Map<Integer, View> f17721o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.sponsorship.SponsorshipActivity$a */
    /* compiled from: SponsorshipActivity.kt */
    public static final class C11216a {
        private C11216a() {
        }

        public /* synthetic */ C11216a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46494a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, SponsorshipActivity.class);
        }
    }

    /* renamed from: A2 */
    public View mo46489A2(int i) {
        Map<Integer, View> map = this.f17721o;
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

    /* renamed from: L */
    public void mo46490L(String str, String str2) {
        C12775o.m28639i(str, "sponsorCode");
        C12775o.m28639i(str2, "sponsorUrl");
        new C12644a(this, str, str2).onShareButtonClicked();
    }

    /* renamed from: O */
    public void mo46491O() {
        ((ExpandableListView) mo46489A2(C13865f.sponsoredUserListView)).mo47890R0();
    }

    /* renamed from: Q1 */
    public void mo46492Q1() {
        C12136d.m26467i(this, R.string.listview_sponsored_user_error);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("SponsorshipActivity", true);
        setContentView(R.layout.activity_sponsorship);
        C12647d dVar = new C12647d(this, new C12647d.C12649b(new C13566l(this), new C13689a(mo47878o2()), ((ExpandableListView) mo46489A2(C13865f.sponsoredUserListView)).getExpandableListViewController(), C13479c.f21636k.mo53083a(this).mo53081k(), new ResourceStringWrapper(R.string.sponsorship_no_result_error_title), new ResourceStringWrapper(R.string.sponsorship_no_result_error_message)));
        this.f17720n = dVar;
        dVar.mo45812o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12647d dVar = this.f17720n;
        if (dVar == null) {
            C12775o.m28656z("controller");
            dVar = null;
        }
        dVar.mo45814q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12647d dVar = this.f17720n;
        if (dVar == null) {
            C12775o.m28656z("controller");
            dVar = null;
        }
        dVar.mo45816s2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12647d dVar = this.f17720n;
        if (dVar == null) {
            C12775o.m28656z("controller");
            dVar = null;
        }
        dVar.mo45818u2();
    }

    /* renamed from: v0 */
    public void mo46493v0(boolean z) {
        int i = C13865f.sponsoredUserListView;
        ExpandableListView expandableListView = (ExpandableListView) mo46489A2(i);
        C12775o.m28638h(expandableListView, "sponsoredUserListView");
        ((ExpandableListView) mo46489A2(i)).setAdapter(new C2032l(expandableListView, ((ExpandableListView) mo46489A2(i)).getExpandableListViewController(), z, this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17719m;
    }
}
