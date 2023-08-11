package com.poulpeo.p321ui.screens.review_merchant;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.AndroidUtil;
import com.rmn.utils.IntentDelegate;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p102g9.C7832a;
import p102g9.C7834c;
import p358ib.C12113a;
import p358ib.C12114b;
import p358ib.C12115c;
import p358ib.C12116d;
import p358ib.C12120h;
import p358ib.C12123i;
import p360id.C12134b;
import p360id.C12136d;
import p366jb.C12610d;
import p404of.C13074a;
import p438ub.C13542a;
import p440ud.C13549b;
import p440ud.C13550c;
import p440ud.C13556e;
import p440ud.C13561i;
import p440ud.C13565k;
import p440ud.C13571o;
import p440ud.C13572p;
import p440ud.C13574r;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.review_merchant.ReviewMerchantAddActivity */
/* compiled from: ReviewMerchantAddActivity.kt */
public final class ReviewMerchantAddActivity extends C12610d implements C12123i {

    /* renamed from: w */
    public static final C11211a f17689w = new C11211a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f17690x = 8;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final IntentDelegate.Int f17691y = new IntentDelegate.Int("merchantId");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final IntentDelegate.String f17692z = new IntentDelegate.String("merchantName");

    /* renamed from: o */
    private final int f17693o = R.string.review_merchant_add_title;

    /* renamed from: p */
    private final int f17694p = R.string.review_merchant_add_error_title;

    /* renamed from: q */
    private final int f17695q = R.string.review_merchant_add_success_title;

    /* renamed from: r */
    private final int f17696r = R.string.review_merchant_add_success_subtitle;

    /* renamed from: s */
    private C12120h f17697s;

    /* renamed from: t */
    private final Lazy f17698t = C11901h.m25690b(new C11212b(this));

    /* renamed from: u */
    private MenuItem f17699u;

    /* renamed from: v */
    public Map<Integer, View> f17700v = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.review_merchant.ReviewMerchantAddActivity$a */
    /* compiled from: ReviewMerchantAddActivity.kt */
    public static final class C11211a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17701a;

        static {
            Class<C11211a> cls = C11211a.class;
            f17701a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "merchantId", "getMerchantId(Landroid/content/Intent;)I", 0)), C12764h0.m28590f(new C12783v(cls, "merchantName", "getMerchantName(Landroid/content/Intent;)Ljava/lang/String;", 0))};
        }

        private C11211a() {
        }

        public /* synthetic */ C11211a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final int m24755c(Intent intent) {
            return ReviewMerchantAddActivity.f17691y.getValue(intent, (KProperty<?>) f17701a[0]).intValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m24756d(Intent intent) {
            return ReviewMerchantAddActivity.f17692z.getValue(intent, (KProperty<?>) f17701a[1]);
        }

        /* renamed from: f */
        private final void m24757f(Intent intent, int i) {
            ReviewMerchantAddActivity.f17691y.setValue(intent, (KProperty<?>) f17701a[0], i);
        }

        /* renamed from: g */
        private final void m24758g(Intent intent, String str) {
            ReviewMerchantAddActivity.f17692z.setValue(intent, (KProperty<?>) f17701a[1], str);
        }

        /* renamed from: e */
        public final Intent mo46481e(Context context, int i, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "merchantName");
            Intent intent = new Intent(context, ReviewMerchantAddActivity.class);
            C11211a aVar = ReviewMerchantAddActivity.f17689w;
            aVar.m24757f(intent, i);
            aVar.m24758g(intent, str);
            return intent;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.review_merchant.ReviewMerchantAddActivity$b */
    /* compiled from: ReviewMerchantAddActivity.kt */
    static final class C11212b extends C12777p implements C13074a<C13689a> {

        /* renamed from: g */
        final /* synthetic */ ReviewMerchantAddActivity f17702g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11212b(ReviewMerchantAddActivity reviewMerchantAddActivity) {
            super(0);
            this.f17702g = reviewMerchantAddActivity;
        }

        /* renamed from: b */
        public final C13689a invoke() {
            return new C13689a(this.f17702g.mo47878o2());
        }
    }

    /* renamed from: T2 */
    private final C13689a m24737T2() {
        return (C13689a) this.f17698t.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m24738U2(ReviewMerchantAddActivity reviewMerchantAddActivity, View view, boolean z) {
        C12775o.m28639i(reviewMerchantAddActivity, "this$0");
        if (z) {
            reviewMerchantAddActivity.m24741X2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m24739V2(ReviewMerchantAddActivity reviewMerchantAddActivity, View view) {
        C12775o.m28639i(reviewMerchantAddActivity, "this$0");
        reviewMerchantAddActivity.m24741X2();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m24740W2(ReviewMerchantAddActivity reviewMerchantAddActivity, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(reviewMerchantAddActivity, "this$0");
        reviewMerchantAddActivity.mo46478f2();
    }

    /* renamed from: X2 */
    private final void m24741X2() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new C12116d(instance, this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m24742Y2(Calendar calendar, ReviewMerchantAddActivity reviewMerchantAddActivity, DatePicker datePicker, int i, int i2, int i3) {
        C12775o.m28639i(reviewMerchantAddActivity, "this$0");
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
        C12120h hVar = reviewMerchantAddActivity.f17697s;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo49569G2(calendar.getTime());
    }

    /* renamed from: D2 */
    public View mo46191D2(int i) {
        Map<Integer, View> map = this.f17700v;
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
    /* renamed from: G2 */
    public int mo46192G2() {
        return this.f17694p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public int mo46193H2() {
        return this.f17696r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public int mo46194I2() {
        return this.f17695q;
    }

    /* renamed from: J */
    public void mo46476J() {
        C12136d.m26467i(this, R.string.review_merchant_get_user_data_error_message);
        finish();
    }

    /* renamed from: U0 */
    public void mo46477U0() {
        ((TextInputLayout) mo46191D2(C13865f.textInputContent)).requestFocus();
        AndroidUtil.showSoftKeyboard(this);
    }

    /* renamed from: f2 */
    public void mo46478f2() {
        startActivity(WebActivity.f17745z.mo46525d(this));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50358x2("ReviewMerchantAddActivity", false);
        setContentView(R.layout.activity_review_merchant_add);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setElevation(0.0f);
        }
        int i = C13865f.textInputContent;
        mo50336L2(((TextInputLayout) mo46191D2(i)).getEditText());
        ((TextView) mo46191D2(C13865f.textViewCancel)).setVisibility(8);
        int i2 = C13865f.textInputDateOrder;
        EditText editText = ((TextInputLayout) mo46191D2(i2)).getEditText();
        if (editText != null) {
            editText.setOnFocusChangeListener(new C12114b(this));
        }
        EditText editText2 = ((TextInputLayout) mo46191D2(i2)).getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new C12115c(this));
        }
        ContextContainer o2 = mo47878o2();
        C13689a T2 = m24737T2();
        C11211a aVar = f17689w;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        int a = aVar.m24755c(intent);
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        String b = aVar.m24756d(intent2);
        C13572p pVar = r10;
        C13572p pVar2 = new C13572p((TextView) mo46191D2(C13865f.textViewMerchantName));
        C13561i iVar = r11;
        C13561i iVar2 = new C13561i((RatingBar) mo46191D2(C13865f.ratingBar));
        C13571o oVar = r12;
        C13571o oVar2 = new C13571o((TextInputLayout) mo46191D2(i));
        C13571o oVar3 = r1;
        C13571o oVar4 = new C13571o((TextInputLayout) mo46191D2(i2));
        C13572p pVar3 = r1;
        C13572p pVar4 = new C13572p((TextView) mo46191D2(C13865f.textViewCharCounter));
        C13572p pVar5 = r1;
        C13572p pVar6 = new C13572p((TextView) mo46191D2(C13865f.textViewMinCharCounter));
        C13556e eVar = r1;
        C12120h.C12122b bVar = r4;
        C13556e eVar2 = new C13556e((ImageButton) mo46191D2(C13865f.imageButtonSubmit));
        C13574r rVar = r1;
        C13574r rVar2 = new C13574r((RelativeLayout) mo46191D2(C13865f.layoutCharCount));
        C13574r rVar3 = r1;
        C13574r rVar4 = new C13574r((TextView) mo46191D2(C13865f.textViewPaymentConditions));
        C13565k kVar = r1;
        C13565k kVar2 = new C13565k(R.plurals.review_merchant_add_min_char_count_label);
        C13549b a2 = C13549b.m30936a(mo47878o2(), R.color.text_indicator_negative);
        C13550c cVar = r1;
        C13550c cVar2 = new C13550c(ContextCompat.getDrawable(this, R.drawable.shape_rectangle_rounded_red));
        C13549b a3 = C13549b.m30936a(mo47878o2(), R.color.text_indicator_positive);
        C13550c cVar3 = r1;
        C13550c cVar4 = new C13550c(ContextCompat.getDrawable(this, R.drawable.shape_rectangle_rounded_blue));
        C12120h.C12122b bVar2 = new C12120h.C12122b(o2, T2, a, b, pVar, iVar, oVar, oVar3, pVar3, pVar5, eVar, rVar, rVar3, kVar, a2, cVar, a3, cVar3, C13542a.f21790p.mo53187a(this).mo53180e());
        C12120h hVar = new C12120h(this, bVar);
        this.f17697s = hVar;
        hVar.mo49570z2();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C12775o.m28639i(menu, "menu");
        getMenuInflater().inflate(R.menu.review_merchant_add_menu, menu);
        this.f17699u = menu.findItem(R.id.action_info);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12120h hVar = this.f17697s;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo49566A2();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C12775o.m28639i(menuItem, "item");
        if (menuItem != this.f17699u) {
            return super.onOptionsItemSelected(menuItem);
        }
        AndroidUtil.hideSoftKeyboard(this, false);
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setTitle((int) R.string.review_merchant_add_info_dialog_title).setMessage((int) R.string.review_merchant_add_info_dialog_message).setPositiveButton((int) R.string.review_merchant_add_info_dialog_positive_button_label, (DialogInterface.OnClickListener) null).setNegativeButton((int) R.string.review_merchant_add_info_dialog_negative_button_label, (DialogInterface.OnClickListener) new C12113a(this));
        C12775o.m28638h(negativeButton, "Builder(this)\n          …creen()\n                }");
        C12134b.m26457c(negativeButton, this, (Function1) null, 2, (Object) null);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12120h hVar = this.f17697s;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo49567B2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C7832a a = C7834c.m15321a(this);
        ContextContainer o2 = mo47878o2();
        C11211a aVar = f17689w;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        String valueOf = String.valueOf(aVar.m24755c(intent));
        Intent intent2 = getIntent();
        C12775o.m28638h(intent2, "intent");
        a.mo41540g(o2, valueOf, aVar.m24756d(intent2));
        C12120h hVar = this.f17697s;
        if (hVar == null) {
            C12775o.m28656z("controller");
            hVar = null;
        }
        hVar.mo49568C2();
    }

    /* renamed from: r0 */
    public void mo46480r0() {
        setResult(101);
        super.mo46480r0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17693o;
    }

    /* renamed from: D1 */
    public void mo46475D1() {
    }
}
