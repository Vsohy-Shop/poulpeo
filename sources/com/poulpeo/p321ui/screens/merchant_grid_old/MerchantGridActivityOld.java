package com.poulpeo.p321ui.screens.merchant_grid_old;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.merchant.MerchantActivity;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.utils.AndroidUtil;
import com.rmn.utils.AsyncImageLoader;
import com.rmn.utils.IntentDelegate;
import com.squareup.picasso.Callback;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p360id.C12134b;
import p360id.C12139g;
import p368jd.C12616b;
import p402od.C13061a;
import p445vc.C13619h;
import p455xa.C13761a;
import p455xa.C13764c;
import p455xa.C13766e;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant_grid_old.MerchantGridActivityOld */
/* compiled from: MerchantGridActivityOld.kt */
public class MerchantGridActivityOld extends C12616b implements C13761a {

    /* renamed from: p */
    public static final C11176a f17549p = new C11176a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17550q = 8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final IntentDelegate.String f17551r = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final IntentDelegate.StringNullable f17552s = new IntentDelegate.StringNullable("sectionTag");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final IntentDelegate.StringNullable f17553t = new IntentDelegate.StringNullable("illustration");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final IntentDelegate.StringNullable f17554u = new IntentDelegate.StringNullable("eventId");
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final IntentDelegate.Long f17555v = new IntentDelegate.Long("dateEnd");
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final IntentDelegate.String f17556w = new IntentDelegate.String("title");
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final IntentDelegate.Long f17557x = new IntentDelegate.Long("timestamp");

    /* renamed from: m */
    private final int f17558m = R.string.menu_merchant_grid;

    /* renamed from: n */
    private C13061a f17559n;

    /* renamed from: o */
    public Map<Integer, View> f17560o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant_grid_old.MerchantGridActivityOld$a */
    /* compiled from: MerchantGridActivityOld.kt */
    public static final class C11176a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17561a;

        static {
            Class<C11176a> cls = C11176a.class;
            f17561a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "sectionTag", "getSectionTag(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "illustration", "getIllustration(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "eventId", "getEventId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "dateEnd", "getDateEnd(Landroid/content/Intent;)J", 0)), C12764h0.m28590f(new C12783v(cls, "title", "getTitle(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "timestamp", "getTimestamp(Landroid/content/Intent;)J", 0))};
        }

        private C11176a() {
        }

        public /* synthetic */ C11176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final long m24471h(Intent intent) {
            return MerchantGridActivityOld.f17555v.getValue(intent, (KProperty<?>) f17561a[4]).longValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final String m24472i(Intent intent) {
            return MerchantGridActivityOld.f17554u.getValue(intent, (KProperty<?>) f17561a[3]);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final String m24473j(Intent intent) {
            return MerchantGridActivityOld.f17553t.getValue(intent, (KProperty<?>) f17561a[2]);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final String m24474k(Intent intent) {
            return MerchantGridActivityOld.f17551r.getValue(intent, (KProperty<?>) f17561a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final String m24475l(Intent intent) {
            return MerchantGridActivityOld.f17552s.getValue(intent, (KProperty<?>) f17561a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final long m24476m(Intent intent) {
            return MerchantGridActivityOld.f17557x.getValue(intent, (KProperty<?>) f17561a[6]).longValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final String m24477n(Intent intent) {
            return MerchantGridActivityOld.f17556w.getValue(intent, (KProperty<?>) f17561a[5]);
        }

        /* renamed from: p */
        private final void m24478p(Intent intent, String str) {
            MerchantGridActivityOld.f17551r.setValue(intent, (KProperty<?>) f17561a[0], str);
        }

        /* renamed from: q */
        private final void m24479q(Intent intent, String str) {
            MerchantGridActivityOld.f17556w.setValue(intent, (KProperty<?>) f17561a[5], str);
        }

        /* renamed from: o */
        public final Intent mo46399o(Context context, String str, String str2) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "merchantId");
            C12775o.m28639i(str2, "title");
            Intent intent = new Intent(context, MerchantGridActivityOld.class);
            C11176a aVar = MerchantGridActivityOld.f17549p;
            aVar.m24478p(intent, str);
            aVar.m24479q(intent, str2);
            return intent;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24457J2(MerchantGridActivityOld merchantGridActivityOld, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(merchantGridActivityOld, "this$0");
        merchantGridActivityOld.onBackPressed();
    }

    /* renamed from: K2 */
    private final void m24458K2(String str, C13766e eVar) {
        AsyncImageLoader.loadImage((ImageView) mo46395B2(C13865f.imageViewBackground), (Object) null, str, (Callback) new C11177b(this, eVar));
    }

    /* renamed from: B2 */
    public View mo46395B2(int i) {
        Map<Integer, View> map = this.f17560o;
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

    /* renamed from: D */
    public void mo46396D(BaseMerchant baseMerchant) {
        boolean z;
        C12775o.m28639i(baseMerchant, "merchant");
        C11176a aVar = f17549p;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String e = aVar.m24475l(intent);
        if (e == null || e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!C12775o.m28634d(e, "top_cashback") && !C12775o.m28634d(e, "top_merchant") && !C12775o.m28634d(e, NotificationCompat.CATEGORY_RECOMMENDATION)) {
                e = "event-" + e;
            }
            C13619h.f21932a.mo53281b(e, "click", baseMerchant);
        }
        MerchantActivity.C11159a aVar2 = MerchantActivity.f17469w;
        String merchantIdString = baseMerchant.getMerchantIdString();
        C12775o.m28638h(merchantIdString, "merchant.merchantIdString");
        startActivity(MerchantActivity.C11159a.m24356i(aVar2, this, merchantIdString, false, (String) null, 8, (Object) null));
    }

    /* renamed from: m */
    public void mo46397m(boolean z) {
        ImageView imageView = (ImageView) mo46395B2(C13865f.imageViewBackground);
        C12775o.m28638h(imageView, "imageViewBackground");
        C12139g.m26475d(imageView, z, 0, 2, (Object) null);
    }

    /* renamed from: n1 */
    public void mo46398n1() {
        AlertDialog.Builder cancelable = new AlertDialog.Builder(this).setTitle((int) R.string.event_expired_title).setMessage((int) R.string.event_expired_message).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C13764c(this)).setCancelable(false);
        C12775o.m28638h(cancelable, "Builder(this)\n          …    .setCancelable(false)");
        C12134b.m26457c(cancelable, this, (Function1) null, 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x020d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r35) {
        /*
            r34 = this;
            r0 = r34
            super.onCreate(r35)
            com.poulpeo.ui.screens.merchant_grid_old.MerchantGridActivityOld$a r1 = f17549p
            android.content.Intent r2 = r34.getIntent()
            java.lang.String r3 = "intent"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            java.lang.String r9 = r1.m24474k(r2)
            android.content.Intent r2 = r34.getIntent()
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            java.lang.String r15 = r1.m24475l(r2)
            r2 = 0
            r8 = 1
            if (r15 == 0) goto L_0x003a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "MerchantGridActivity - "
            r4.append(r5)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            r0.mo50358x2(r4, r8)
            ef.v r4 = p336ef.C11921v.f18618a
            goto L_0x003b
        L_0x003a:
            r4 = r2
        L_0x003b:
            if (r4 != 0) goto L_0x0051
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "MerchantGridActivity - similar - "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r0.mo50358x2(r4, r8)
        L_0x0051:
            r4 = 2131558443(0x7f0d002b, float:1.8742202E38)
            r0.setContentView(r4)
            android.content.Intent r4 = r34.getIntent()
            kotlin.jvm.internal.C12775o.m28638h(r4, r3)
            java.lang.String r7 = r1.m24473j(r4)
            android.content.Intent r4 = r34.getIntent()
            kotlin.jvm.internal.C12775o.m28638h(r4, r3)
            java.lang.String r4 = r1.m24472i(r4)
            android.content.Intent r5 = r34.getIntent()
            kotlin.jvm.internal.C12775o.m28638h(r5, r3)
            java.lang.String r5 = r1.m24477n(r5)
            android.content.Intent r6 = r34.getIntent()
            kotlin.jvm.internal.C12775o.m28638h(r6, r3)
            long r22 = r1.m24476m(r6)
            r25 = 0
            if (r15 == 0) goto L_0x0091
            int r6 = r15.length()
            if (r6 != 0) goto L_0x008e
            goto L_0x0091
        L_0x008e:
            r6 = r25
            goto L_0x0092
        L_0x0091:
            r6 = r8
        L_0x0092:
            if (r6 == 0) goto L_0x00a9
            int r6 = r9.length()
            if (r6 != 0) goto L_0x009c
            r6 = r8
            goto L_0x009e
        L_0x009c:
            r6 = r25
        L_0x009e:
            if (r6 != 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The sectionTag or merchantId is mandatory"
            r1.<init>(r2)
            throw r1
        L_0x00a9:
            androidx.appcompat.app.ActionBar r6 = r34.getSupportActionBar()
            if (r6 != 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            r6.setTitle((java.lang.CharSequence) r5)
        L_0x00b3:
            t9.d r5 = new t9.d
            int r6 = p462yb.C13865f.merchantGridView
            android.view.View r10 = r0.mo46395B2(r6)
            com.rmn.ui.views.listview.BaseListView r10 = (com.rmn.p324ui.views.listview.BaseListView) r10
            java.lang.String r11 = "merchantGridView"
            kotlin.jvm.internal.C12775o.m28638h(r10, r11)
            r28 = 1
            r29 = -1
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            com.poulpeo.ui.screens.merchant_grid.a$b r32 = com.poulpeo.p321ui.screens.merchant_grid.C11173a.C11175b.SIMILAR
            java.lang.String r33 = ""
            r26 = r5
            r27 = r10
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            android.view.View r10 = r0.mo46395B2(r6)
            com.rmn.ui.views.listview.BaseListView r10 = (com.rmn.p324ui.views.listview.BaseListView) r10
            r10.setAdapter(r5)
            android.view.View r5 = r0.mo46395B2(r6)
            com.rmn.ui.views.listview.BaseListView r5 = (com.rmn.p324ui.views.listview.BaseListView) r5
            com.rmn.ui.views.listview.j r10 = new com.rmn.ui.views.listview.j
            int r11 = p462yb.C13865f.imageViewBackground
            android.view.View r11 = r0.mo46395B2(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            java.lang.String r12 = "imageViewBackground"
            kotlin.jvm.internal.C12775o.m28638h(r11, r12)
            r12 = 1062333317(0x3f51eb85, float:0.82)
            r10.<init>(r11, r12)
            r5.setOnScrollListener(r10)
            wb.a r12 = new wb.a
            com.rmn.iosadapters.android.content.ContextContainer r5 = r34.mo47878o2()
            r12.<init>(r5)
            if (r4 == 0) goto L_0x0111
            int r4 = r4.length()
            if (r4 != 0) goto L_0x010e
            goto L_0x0111
        L_0x010e:
            r4 = r25
            goto L_0x0112
        L_0x0111:
            r4 = r8
        L_0x0112:
            if (r4 != 0) goto L_0x015d
            java.util.Date r4 = new java.util.Date
            android.content.Intent r5 = r34.getIntent()
            kotlin.jvm.internal.C12775o.m28638h(r5, r3)
            long r9 = r1.m24471h(r5)
            r4.<init>(r9)
            xa.b r5 = new xa.b
            xa.b$a r9 = new xa.b$a
            com.rmn.iosadapters.android.content.ContextContainer r17 = r34.mo47878o2()
            android.view.View r10 = r0.mo46395B2(r6)
            com.rmn.ui.views.listview.BaseListView r10 = (com.rmn.p324ui.views.listview.BaseListView) r10
            bd.a r19 = r10.getBaseListViewController()
            tb.c$a r10 = p432tb.C13479c.f21636k
            tb.c r10 = r10.mo53083a(r0)
            com.rmn.ui.views.listview.c r20 = r10.mo53076f()
            android.content.Intent r10 = r34.getIntent()
            kotlin.jvm.internal.C12775o.m28638h(r10, r3)
            java.lang.String r21 = r1.m24475l(r10)
            r16 = r9
            r18 = r12
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            r5.<init>(r0, r9)
            r0.f17559n = r5
        L_0x0159:
            r13 = r6
            r12 = r7
            r10 = r8
            goto L_0x01b2
        L_0x015d:
            if (r15 == 0) goto L_0x0187
            xa.e r1 = new xa.e
            xa.e$a r3 = new xa.e$a
            com.rmn.iosadapters.android.content.ContextContainer r11 = r34.mo47878o2()
            android.view.View r4 = r0.mo46395B2(r6)
            com.rmn.ui.views.listview.BaseListView r4 = (com.rmn.p324ui.views.listview.BaseListView) r4
            bd.a r13 = r4.getBaseListViewController()
            tb.c$a r4 = p432tb.C13479c.f21636k
            tb.c r4 = r4.mo53083a(r0)
            com.rmn.ui.views.listview.c r14 = r4.mo53076f()
            r10 = r3
            r16 = r22
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.<init>(r0, r3)
            r0.f17559n = r1
            goto L_0x0159
        L_0x0187:
            xa.f r1 = new xa.f
            xa.f$a r3 = new xa.f$a
            com.rmn.iosadapters.android.content.ContextContainer r5 = r34.mo47878o2()
            android.view.View r4 = r0.mo46395B2(r6)
            com.rmn.ui.views.listview.BaseListView r4 = (com.rmn.p324ui.views.listview.BaseListView) r4
            bd.a r10 = r4.getBaseListViewController()
            tb.c$a r4 = p432tb.C13479c.f21636k
            tb.c r4 = r4.mo53083a(r0)
            com.rmn.ui.views.listview.c r11 = r4.mo53076f()
            r4 = r3
            r13 = r6
            r6 = r12
            r12 = r7
            r7 = r10
            r10 = r8
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r1.<init>(r0, r3)
            r0.f17559n = r1
        L_0x01b2:
            r1 = 2131361908(0x7f0a0074, float:1.8343582E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r3 = "findViewById(R.id.appbar)"
            kotlin.jvm.internal.C12775o.m28638h(r1, r3)
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            kotlin.jvm.internal.C12775o.m28637g(r3, r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            android.view.View r4 = r0.mo46395B2(r13)
            com.rmn.ui.views.listview.BaseListView r4 = (com.rmn.p324ui.views.listview.BaseListView) r4
            com.rmn.ui.toolbar.ToolbarBehavior r4 = r4.mo47889M0()
            r3.setBehavior(r4)
            r1.requestLayout()
            if (r12 == 0) goto L_0x01e7
            boolean r1 = p454wf.C13754v.m31532t(r12)
            if (r1 == 0) goto L_0x01e4
            goto L_0x01e7
        L_0x01e4:
            r8 = r25
            goto L_0x01e8
        L_0x01e7:
            r8 = r10
        L_0x01e8:
            java.lang.String r1 = "controller"
            if (r8 != 0) goto L_0x0205
            od.a r3 = r0.f17559n
            if (r3 != 0) goto L_0x01f4
            kotlin.jvm.internal.C12775o.m28656z(r1)
            r3 = r2
        L_0x01f4:
            boolean r3 = r3 instanceof p455xa.C13766e
            if (r3 == 0) goto L_0x0205
            od.a r3 = r0.f17559n
            if (r3 != 0) goto L_0x0200
            kotlin.jvm.internal.C12775o.m28656z(r1)
            r3 = r2
        L_0x0200:
            xa.e r3 = (p455xa.C13766e) r3
            r0.m24458K2(r12, r3)
        L_0x0205:
            od.a r3 = r0.f17559n
            if (r3 != 0) goto L_0x020d
            kotlin.jvm.internal.C12775o.m28656z(r1)
            goto L_0x020e
        L_0x020d:
            r2 = r3
        L_0x020e:
            r2.mo45812o2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.poulpeo.p321ui.screens.merchant_grid_old.MerchantGridActivityOld.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C13061a aVar = this.f17559n;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45814q2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C13061a aVar = this.f17559n;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45816s2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13061a aVar = this.f17559n;
        if (aVar == null) {
            C12775o.m28656z("controller");
            aVar = null;
        }
        aVar.mo45818u2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17558m;
    }

    /* renamed from: com.poulpeo.ui.screens.merchant_grid_old.MerchantGridActivityOld$b */
    /* compiled from: MerchantGridActivityOld.kt */
    public static final class C11177b implements Callback {

        /* renamed from: a */
        final /* synthetic */ MerchantGridActivityOld f17562a;

        /* renamed from: b */
        final /* synthetic */ C13766e f17563b;

        C11177b(MerchantGridActivityOld merchantGridActivityOld, C13766e eVar) {
            this.f17562a = merchantGridActivityOld;
            this.f17563b = eVar;
        }

        public void onSuccess() {
            MerchantGridActivityOld merchantGridActivityOld = this.f17562a;
            int i = C13865f.imageViewBackground;
            Drawable drawable = ((ImageView) merchantGridActivityOld.mo46395B2(i)).getDrawable();
            if (drawable instanceof BitmapDrawable) {
                ((ImageView) this.f17562a.mo46395B2(i)).setImageBitmap(AndroidUtil.applyGradient(((BitmapDrawable) drawable).getBitmap(), Math.round(this.f17562a.getResources().getDimension(R.dimen.grid_event_illustration_gradient_height)), Math.round(this.f17562a.getResources().getDimension(R.dimen.grid_event_illustration_gradient_offset))));
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f17562a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.density;
            Display defaultDisplay = this.f17562a.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.f17563b.mo53425J2(((((float) point.x) * 0.708f) / f) * 0.53f);
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
        }
    }
}
