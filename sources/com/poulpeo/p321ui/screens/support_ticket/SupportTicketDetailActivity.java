package com.poulpeo.p321ui.screens.support_ticket;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.api.p322v2.poulpeo.model.Invoice;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import com.rmn.utils.IntentDelegate;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p336ef.C11921v;
import p360id.C12134b;
import p360id.C12136d;
import p368jd.C12616b;
import p381lb.C12795a;
import p381lb.C12796b;
import p381lb.C12797c;
import p381lb.C12801d;
import p394nb.C12978c;
import p428sd.C13399d;
import p438ub.C13542a;
import p440ud.C13549b;
import p440ud.C13572p;
import p440ud.C13574r;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketDetailActivity */
/* compiled from: SupportTicketDetailActivity.kt */
public final class SupportTicketDetailActivity extends C12616b implements C12801d {

    /* renamed from: p */
    public static final C11217a f17722p = new C11217a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17723q = 8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final IntentDelegate.Int f17724r = new IntentDelegate.Int("supportTicketId");

    /* renamed from: m */
    private final int f17725m;

    /* renamed from: n */
    private C12797c f17726n;

    /* renamed from: o */
    public Map<Integer, View> f17727o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketDetailActivity$a */
    /* compiled from: SupportTicketDetailActivity.kt */
    public static final class C11217a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17728a = {C12764h0.m28590f(new C12783v(C11217a.class, "supportTicketId", "getSupportTicketId(Landroid/content/Intent;)I", 0))};

        private C11217a() {
        }

        public /* synthetic */ C11217a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m24815b(Intent intent) {
            return SupportTicketDetailActivity.f17724r.getValue(intent, (KProperty<?>) f17728a[0]).intValue();
        }

        /* renamed from: d */
        private final void m24816d(Intent intent, int i) {
            SupportTicketDetailActivity.f17724r.setValue(intent, (KProperty<?>) f17728a[0], i);
        }

        /* renamed from: c */
        public final Intent mo46505c(Context context, int i) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, SupportTicketDetailActivity.class);
            SupportTicketDetailActivity.f17722p.m24816d(intent, i);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.support_ticket.SupportTicketDetailActivity$b */
    /* compiled from: SupportTicketDetailActivity.kt */
    static final class C11218b extends C12777p implements Function1<AlertDialog, C11921v> {

        /* renamed from: g */
        public static final C11218b f17729g = new C11218b();

        C11218b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo46506a(AlertDialog alertDialog) {
            C12775o.m28639i(alertDialog, "it");
            Window window = alertDialog.getWindow();
            if (window != null) {
                window.setGravity(80);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46506a((AlertDialog) obj);
            return C11921v.f18618a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m24798E2(SupportTicketDetailActivity supportTicketDetailActivity, String str, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(supportTicketDetailActivity, "this$0");
        C12775o.m28639i(str, "$url");
        supportTicketDetailActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: F2 */
    private final void m24799F2(File file) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(FileProvider.getUriForFile(this, getString(R.string.file_provider_authority), file));
        intent.setFlags(1);
        try {
            mo47883t2(intent);
        } catch (ActivityNotFoundException unused) {
            mo46496I(getString(R.string.support_ticket_invoice_invalid_format_error), false);
        }
    }

    /* renamed from: G2 */
    private final void m24800G2(Invoice invoice) {
        File f = C12136d.m26464f(this, m24802I2(invoice));
        if (f == null) {
            mo46496I(getString(R.string.support_ticket_invoice_default_error), false);
        } else if (f.exists()) {
            m24799F2(f);
        } else {
            C12797c cVar = this.f17726n;
            if (cVar == null) {
                C12775o.m28656z("controller");
                cVar = null;
            }
            cVar.mo50702r2(invoice.getInvoiceId());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m24801H2(SupportTicketDetailActivity supportTicketDetailActivity, Invoice[] invoiceArr, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(supportTicketDetailActivity, "this$0");
        C12775o.m28639i(invoiceArr, "$invoices");
        supportTicketDetailActivity.m24800G2(invoiceArr[i]);
    }

    /* renamed from: I2 */
    private final String m24802I2(Invoice invoice) {
        int invoiceId = invoice.getInvoiceId();
        String title = invoice.getTitle();
        return invoiceId + "-" + title;
    }

    /* renamed from: C2 */
    public View mo46495C2(int i) {
        Map<Integer, View> map = this.f17727o;
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

    /* renamed from: I */
    public void mo46496I(String str, boolean z) {
        if (str != null) {
            C12136d.m26468j(this, str);
        }
        if (z) {
            finish();
        }
    }

    /* renamed from: N */
    public void mo46497N(Invoice invoice) {
        boolean z;
        C12775o.m28639i(invoice, "invoice");
        String data = invoice.getData();
        if (data == null || C13754v.m31532t(data)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo46496I(getString(R.string.support_ticket_invoice_default_error), false);
            return;
        }
        String I2 = m24802I2(invoice);
        String data2 = invoice.getData();
        C12775o.m28638h(data2, "invoice.data");
        File d = C12136d.m26462d(this, I2, data2);
        if (d == null) {
            mo46496I(getString(R.string.support_ticket_invoice_default_error), false);
        } else {
            m24799F2(d);
        }
    }

    /* renamed from: R1 */
    public void mo46498R1(Invoice[] invoiceArr) {
        C12775o.m28639i(invoiceArr, "invoices");
        ArrayList arrayList = new ArrayList(invoiceArr.length);
        for (Invoice title : invoiceArr) {
            arrayList.add(title.getTitle());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C12775o.m28637g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        AlertDialog.Builder items = new AlertDialog.Builder(this).setItems((CharSequence[]) ((String[]) array), (DialogInterface.OnClickListener) new C12795a(this, invoiceArr));
        C12775o.m28638h(items, "Builder(this)\n          …which])\n                }");
        C12134b.m26456b(items, this, C11218b.f17729g);
    }

    /* renamed from: T */
    public void mo46499T(String str, String str2, String[] strArr) {
        if (str != null && str2 != null) {
            startActivity(WebActivity.f17745z.mo46522a(this, str2, str, strArr));
        }
    }

    /* renamed from: b2 */
    public void mo46500b2(String str) {
        C12775o.m28639i(str, "url");
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setTitle((int) R.string.add_support_ticket_add_invoice_in_browser_dialog_title).setMessage((CharSequence) getString(R.string.add_support_ticket_add_invoice_in_browser_dialog_message)).setPositiveButton((CharSequence) getString(R.string.add_support_ticket_add_invoice_in_browser_dialog_ok), (DialogInterface.OnClickListener) new C12796b(this, str)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(this)\n          …id.R.string.cancel, null)");
        C12134b.m26457c(negativeButton, this, (Function1) null, 2, (Object) null);
    }

    /* renamed from: i2 */
    public void mo46501i2(C13574r rVar) {
        C12775o.m28639i(rVar, "historyWrapper");
        ((LinearLayout) mo46495C2(C13865f.layoutHistoryContainer)).addView(rVar.mo53243a());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("SupportTicketDetailActivity", true);
        setContentView(R.layout.activity_support_ticket_detail);
        ContextContainer o2 = mo47878o2();
        C13689a aVar = r5;
        C13689a aVar2 = new C13689a(mo47878o2());
        C13542a.C13543a aVar3 = C13542a.f21790p;
        C13399d g = aVar3.mo53187a(this).mo53182g();
        C13399d h = aVar3.mo53187a(this).mo53183h();
        C11217a aVar4 = f17722p;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        int a = aVar4.m24815b(intent);
        C13572p pVar = r9;
        C13572p pVar2 = new C13572p((TextView) mo46495C2(C13865f.textViewReference));
        C13572p pVar3 = r10;
        C13572p pVar4 = new C13572p((TextView) mo46495C2(C13865f.textViewMerchant));
        C13572p pVar5 = r11;
        C13572p pVar6 = new C13572p((TextView) mo46495C2(C13865f.textViewType));
        C13572p pVar7 = r12;
        C13572p pVar8 = new C13572p((TextView) mo46495C2(C13865f.textViewDate));
        C13572p pVar9 = r13;
        C13572p pVar10 = new C13572p((TextView) mo46495C2(C13865f.textViewOrderDate));
        C13572p pVar11 = r14;
        C13572p pVar12 = new C13572p((TextView) mo46495C2(C13865f.textViewOrderReference));
        C13572p pVar13 = r15;
        C13572p pVar14 = new C13572p((TextView) mo46495C2(C13865f.textViewOrderAmount));
        C13572p pVar15 = r1;
        C13572p pVar16 = new C13572p((TextView) mo46495C2(C13865f.textViewOrderCashbackAmount));
        C13572p pVar17 = r1;
        C13572p pVar18 = new C13572p((TextView) mo46495C2(C13865f.textViewOrderCashbackRate));
        C13572p pVar19 = r1;
        C13572p pVar20 = new C13572p((TextView) mo46495C2(C13865f.textViewOrderInvoices));
        C13572p pVar21 = r1;
        C13572p pVar22 = new C13572p((TextView) mo46495C2(C13865f.textViewOrderComment));
        C13574r rVar = r1;
        C13574r rVar2 = new C13574r((RelativeLayout) mo46495C2(C13865f.layoutProgressView));
        ResourceStringWrapper resourceStringWrapper = r1;
        ResourceStringWrapper resourceStringWrapper2 = new ResourceStringWrapper(R.string.support_ticket_detail_order_invoices_add);
        ResourceStringWrapper resourceStringWrapper3 = r1;
        ResourceStringWrapper resourceStringWrapper4 = new ResourceStringWrapper(R.string.support_ticket_detail_order_invoices_read);
        C12797c cVar = new C12797c(this, new C12797c.C12800c(o2, aVar, g, h, a, pVar, pVar3, pVar5, pVar7, pVar9, pVar11, pVar13, pVar15, pVar17, pVar19, pVar21, rVar, resourceStringWrapper, resourceStringWrapper3));
        this.f17726n = cVar;
        cVar.mo50703y2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12797c cVar = this.f17726n;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        cVar.mo50704z2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12797c cVar = this.f17726n;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        cVar.mo50700A2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12797c cVar = this.f17726n;
        if (cVar == null) {
            C12775o.m28656z("controller");
            cVar = null;
        }
        cVar.mo50701B2();
    }

    /* renamed from: w */
    public C13574r mo46502w(C13549b bVar, String str, String str2) {
        C12775o.m28639i(bVar, "indicatorColor");
        C12775o.m28639i(str, "subtitle");
        C12775o.m28639i(str2, "title");
        LinearLayout linearLayout = (LinearLayout) mo46495C2(C13865f.layoutHistoryContainer);
        C12775o.m28638h(linearLayout, "layoutHistoryContainer");
        return new C13574r(new C12978c(this, linearLayout, bVar, str, str2).mo50884a());
    }

    /* renamed from: w0 */
    public void mo46503w0() {
        ((LinearLayout) mo46495C2(C13865f.layoutHistoryContainer)).removeAllViews();
    }

    /* renamed from: x0 */
    public void mo46504x0(String str) {
        C12775o.m28639i(str, "screenTitle");
        setTitle((CharSequence) str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17725m;
    }
}
