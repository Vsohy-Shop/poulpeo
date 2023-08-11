package com.poulpeo.p321ui.screens.merchant;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p102g9.C7832a;
import p102g9.C7834c;
import p368jd.C12616b;
import p431ta.C13465p;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p445vc.C13619h;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.merchant.MerchantInfoActivity */
/* compiled from: MerchantInfoActivity.kt */
public final class MerchantInfoActivity extends C12616b {

    /* renamed from: o */
    public static final C11163a f17491o = new C11163a((DefaultConstructorMarker) null);

    /* renamed from: p */
    public static final int f17492p = 8;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final IntentDelegate.String f17493q = new IntentDelegate.String("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final IntentDelegate.String f17494r = new IntentDelegate.String("merchantName");
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final IntentDelegate.String f17495s = new IntentDelegate.String("description");

    /* renamed from: m */
    private final int f17496m;

    /* renamed from: n */
    public Map<Integer, View> f17497n = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.merchant.MerchantInfoActivity$a */
    /* compiled from: MerchantInfoActivity.kt */
    public static final class C11163a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17498a;

        static {
            Class<C11163a> cls = C11163a.class;
            f17498a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "merchantName", "getMerchantName(Landroid/content/Intent;)Ljava/lang/String;", 0)), C12764h0.m28590f(new C12783v(cls, "description", "getDescription(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11163a() {
        }

        public /* synthetic */ C11163a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m24373d(Intent intent) {
            return MerchantInfoActivity.f17495s.getValue(intent, (KProperty<?>) f17498a[2]);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final String m24374e(Intent intent) {
            return MerchantInfoActivity.f17493q.getValue(intent, (KProperty<?>) f17498a[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m24375f(Intent intent) {
            return MerchantInfoActivity.f17494r.getValue(intent, (KProperty<?>) f17498a[1]);
        }

        /* renamed from: h */
        private final void m24376h(Intent intent, String str) {
            MerchantInfoActivity.f17495s.setValue(intent, (KProperty<?>) f17498a[2], str);
        }

        /* renamed from: i */
        private final void m24377i(Intent intent, String str) {
            MerchantInfoActivity.f17493q.setValue(intent, (KProperty<?>) f17498a[0], str);
        }

        /* renamed from: j */
        private final void m24378j(Intent intent, String str) {
            MerchantInfoActivity.f17494r.setValue(intent, (KProperty<?>) f17498a[1], str);
        }

        /* renamed from: g */
        public final Intent mo46360g(Context context, Merchant merchant) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(merchant, "merchant");
            Intent intent = new Intent(context, MerchantInfoActivity.class);
            C11163a aVar = MerchantInfoActivity.f17491o;
            String str = merchant.f18063id;
            C12775o.m28638h(str, "merchant.id");
            aVar.m24377i(intent, str);
            String str2 = merchant.name;
            C12775o.m28638h(str2, "merchant.name");
            aVar.m24378j(intent, str2);
            String plainTextDescription = merchant.getPlainTextDescription();
            C12775o.m28638h(plainTextDescription, "merchant.plainTextDescription");
            aVar.m24376h(intent, plainTextDescription);
            return intent;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m24367F2(MerchantInfoActivity merchantInfoActivity, View view) {
        C12775o.m28639i(merchantInfoActivity, "this$0");
        C13619h hVar = C13619h.f21932a;
        C11163a aVar = f17491o;
        Intent intent = merchantInfoActivity.getIntent();
        C12775o.m28638h(intent, "intent");
        hVar.mo53284e("merchant-certified", "faq", aVar.m24375f(intent));
        WebActivity.f17745z.mo46529h(merchantInfoActivity);
    }

    /* renamed from: B2 */
    public View mo46359B2(int i) {
        Map<Integer, View> map = this.f17497n;
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
        super.onCreate(bundle);
        setContentView(R.layout.activity_merchant_info);
        mo50358x2("MerchantInfoActivity", false);
        C11163a aVar = f17491o;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        ((TextView) mo46359B2(C13865f.textViewMerchantName)).setText(aVar.m24375f(intent));
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        ((TextView) mo46359B2(C13865f.textViewDescription)).setText(aVar.m24373d(intent2));
        ((Button) mo46359B2(C13865f.buttonHelp)).setOnClickListener(new C13465p(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C7832a a = C7834c.m15321a(this);
        ContextContainer o2 = mo47878o2();
        C11163a aVar = f17491o;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String b = aVar.m24374e(intent);
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        a.mo41540g(o2, b, aVar.m24375f(intent2));
        C13618g gVar = C13618g.f21930b;
        Intent intent3 = getIntent();
        C12775o.m28638h(intent3, "intent");
        String c = aVar.m24375f(intent3);
        C13616e eVar = new C13616e("merchant-info-" + c, C13617f.MERCHANT);
        Intent intent4 = getIntent();
        C12775o.m28638h(intent4, "intent");
        String b2 = aVar.m24374e(intent4);
        Intent intent5 = getIntent();
        C12775o.m28638h(intent5, "intent");
        gVar.mo53280e(eVar.mo53275f(b2, aVar.m24375f(intent5)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17496m;
    }
}
