package com.poulpeo.p321ui.screens.contact_info;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.textfield.TextInputLayout;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.Civility;
import com.rmn.api.p322v2.poulpeo.model.Country;
import com.rmn.api.p322v2.poulpeo.model.PaymentMethod;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.ErrorUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p334ed.C11884a;
import p334ed.C11887b;
import p336ef.C11921v;
import p360id.C12134b;
import p360id.C12136d;
import p368jd.C12616b;
import p387ma.C12869d0;
import p387ma.C12874e0;
import p387ma.C12899x;
import p387ma.C12900y;
import p387ma.C12901z;
import p404of.C13074a;
import p428sd.C13399d;
import p438ub.C13542a;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13571o;
import p440ud.C13574r;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePaymentInfoActivity */
/* compiled from: UpdatePaymentInfoActivity.kt */
public final class UpdatePaymentInfoActivity extends C12616b implements C12874e0 {

    /* renamed from: p */
    public static final C11124a f17313p = new C11124a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17314q = 8;

    /* renamed from: m */
    private final int f17315m = R.string.update_payment_info_title;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C12869d0 f17316n;

    /* renamed from: o */
    public Map<Integer, View> f17317o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePaymentInfoActivity$a */
    /* compiled from: UpdatePaymentInfoActivity.kt */
    public static final class C11124a {
        private C11124a() {
        }

        public /* synthetic */ C11124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46258a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, UpdatePaymentInfoActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePaymentInfoActivity$c */
    /* compiled from: UpdatePaymentInfoActivity.kt */
    static final class C11126c extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ Button f17319g;

        /* renamed from: h */
        final /* synthetic */ EditText f17320h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11126c(Button button, EditText editText) {
            super(0);
            this.f17319g = button;
            this.f17320h = editText;
        }

        public final void invoke() {
            Button button = this.f17319g;
            Editable text = this.f17320h.getText();
            C12775o.m28638h(text, "editTextPassword.text");
            button.setEnabled(text.length() > 0);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePaymentInfoActivity$d */
    /* compiled from: UpdatePaymentInfoActivity.kt */
    public static final class C11127d extends ArrayAdapter<Civility> {
        C11127d(UpdatePaymentInfoActivity updatePaymentInfoActivity, Civility[] civilityArr) {
            super(updatePaymentInfoActivity, 17367049, civilityArr);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C12775o.m28639i(viewGroup, "parent");
            View view2 = super.getView(i, view, viewGroup);
            C12775o.m28637g(view2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) view2;
            textView.setTextColor(0);
            return textView;
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePaymentInfoActivity$e */
    /* compiled from: UpdatePaymentInfoActivity.kt */
    public static final class C11128e implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ UpdatePaymentInfoActivity f17321b;

        C11128e(UpdatePaymentInfoActivity updatePaymentInfoActivity) {
            this.f17321b = updatePaymentInfoActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Object itemAtPosition = ((Spinner) this.f17321b.mo46249D2(C13865f.spinnerCivility)).getItemAtPosition(i);
            C12775o.m28637g(itemAtPosition, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.Civility");
            Civility civility = (Civility) itemAtPosition;
            C12869d0 F2 = this.f17321b.f17316n;
            if (F2 == null) {
                C12775o.m28656z("controller");
                F2 = null;
            }
            F2.mo50784H2(civility);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C12869d0 F2 = this.f17321b.f17316n;
            if (F2 == null) {
                C12775o.m28656z("controller");
                F2 = null;
            }
            F2.mo50784H2(Civility.UNDEFINED);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePaymentInfoActivity$f */
    /* compiled from: UpdatePaymentInfoActivity.kt */
    static final class C11129f extends C12777p implements Function1<AlertDialog, C11921v> {

        /* renamed from: g */
        final /* synthetic */ UpdatePaymentInfoActivity f17322g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11129f(UpdatePaymentInfoActivity updatePaymentInfoActivity) {
            super(1);
            this.f17322g = updatePaymentInfoActivity;
        }

        /* renamed from: a */
        public final void mo46265a(AlertDialog alertDialog) {
            C12775o.m28639i(alertDialog, "it");
            this.f17322g.m24046G2(alertDialog);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46265a((AlertDialog) obj);
            return C11921v.f18618a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public final void m24046G2(AlertDialog alertDialog) {
        View findViewById = alertDialog.findViewById(R.id.editTextPassword);
        C12775o.m28636f(findViewById);
        EditText editText = (EditText) findViewById;
        Button button = alertDialog.getButton(-1);
        Button button2 = (Button) alertDialog.findViewById(R.id.buttonResetPassword);
        if (button2 != null) {
            button2.setOnClickListener(new C12901z(this));
        }
        C11126c cVar = new C11126c(button, editText);
        cVar.invoke();
        editText.addTextChangedListener(new C11125b(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m24047H2(UpdatePaymentInfoActivity updatePaymentInfoActivity, View view) {
        C12775o.m28639i(updatePaymentInfoActivity, "this$0");
        updatePaymentInfoActivity.startActivity(ResetPasswordActivity.f17279p.mo46217c(updatePaymentInfoActivity, "update-payment-info"));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m24048I2(UpdatePaymentInfoActivity updatePaymentInfoActivity, View view, boolean z) {
        C12775o.m28639i(updatePaymentInfoActivity, "this$0");
        if (z) {
            ((EditText) updatePaymentInfoActivity.mo46249D2(C13865f.editTextCountry)).clearFocus();
            updatePaymentInfoActivity.startActivityForResult(SearchCountryActivity.f17287r.mo46222a(updatePaymentInfoActivity), 2519);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24049J2(UpdatePaymentInfoActivity updatePaymentInfoActivity, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(updatePaymentInfoActivity, "this$0");
        C12775o.m28637g(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        EditText editText = (EditText) ((AlertDialog) dialogInterface).findViewById(R.id.editTextPassword);
        if (editText != null) {
            C12869d0 d0Var = updatePaymentInfoActivity.f17316n;
            if (d0Var == null) {
                C12775o.m28656z("controller");
                d0Var = null;
            }
            d0Var.mo50786K2(editText.getText().toString());
        }
    }

    /* renamed from: D2 */
    public View mo46249D2(int i) {
        Map<Integer, View> map = this.f17317o;
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

    /* renamed from: b */
    public void mo46250b(C13551d dVar) {
        C12775o.m28639i(dVar, "wrapper");
    }

    /* renamed from: c */
    public void mo46251c(String str) {
        C12775o.m28639i(str, "message");
        ErrorUtil.displayAccountError(this, str);
    }

    /* renamed from: g */
    public void mo46252g() {
        C11884a.f18565e.mo49089a(this, "overlay");
    }

    /* renamed from: h */
    public void mo46253h() {
        C11884a.f18565e.mo49090c(this, "overlay", new C11887b());
    }

    /* renamed from: j */
    public void mo46254j() {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setTitle((int) R.string.update_payment_info_password).setView((int) R.layout.view_password_popup).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C12900y(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(this)\n          …id.R.string.cancel, null)");
        C12134b.m26456b(negativeButton, this, new C11129f(this));
    }

    /* renamed from: j0 */
    public void mo46255j0() {
        C12136d.m26467i(this, R.string.update_payment_info_success);
        finish();
    }

    /* renamed from: j2 */
    public void mo46256j2(C13571o oVar, String str) {
        C12775o.m28639i(oVar, "wrapper");
        C12775o.m28639i(str, "message");
        oVar.mo53232j().setError(str);
    }

    /* renamed from: k */
    public void mo46257k() {
        C12136d.m26467i(this, R.string.update_payment_info_retrieve_fail);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 2519 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("code");
            boolean z2 = true;
            if (stringExtra == null || stringExtra.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String stringExtra2 = intent.getStringExtra("label");
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    C12869d0 d0Var = this.f17316n;
                    Set set = null;
                    if (d0Var == null) {
                        C12775o.m28656z("controller");
                        d0Var = null;
                    }
                    String[] stringArrayExtra = intent.getStringArrayExtra("paymentMethods");
                    if (stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList();
                        for (String findPaymentMethod : stringArrayExtra) {
                            PaymentMethod findPaymentMethod2 = PaymentMethod.findPaymentMethod(findPaymentMethod);
                            if (findPaymentMethod2 != null) {
                                arrayList.add(findPaymentMethod2);
                            }
                        }
                        set = C12686e0.m28209F0(arrayList);
                    }
                    d0Var.mo50785I2(new Country(stringExtra, stringExtra2, set));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_update_payment_info);
        mo50358x2("UpdatePaymentInfoActivity", true);
        int i = C13865f.spinnerCivility;
        ((Spinner) mo46249D2(i)).setAdapter(new C11127d(this, Civility.values()));
        ((Spinner) mo46249D2(i)).setOnItemSelectedListener(new C11128e(this));
        ((EditText) mo46249D2(C13865f.editTextCountry)).setOnFocusChangeListener(new C12899x(this));
        ContextContainer o2 = mo47878o2();
        C13689a aVar = r6;
        C13689a aVar2 = new C13689a(mo47878o2());
        C13399d j = C13542a.f21790p.mo53187a(this).mo53185j();
        C13574r rVar = r8;
        C13574r rVar2 = new C13574r((ScrollView) mo46249D2(C13865f.f22404v1));
        C13571o oVar = r9;
        C13571o oVar2 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputCivility));
        C13574r rVar3 = r10;
        C13574r rVar4 = new C13574r((Spinner) mo46249D2(i));
        C13571o oVar3 = r1;
        C13571o oVar4 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputLastName));
        C13571o oVar5 = r1;
        C13571o oVar6 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputFirstName));
        C13571o oVar7 = r1;
        C13571o oVar8 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputCountry));
        C13574r rVar5 = r1;
        C13574r rVar6 = new C13574r((Spinner) mo46249D2(C13865f.spinnerCountry));
        C13571o oVar9 = r1;
        C13571o oVar10 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputIban));
        C13571o oVar11 = r1;
        C13571o oVar12 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputBic));
        C13571o oVar13 = r1;
        C13571o oVar14 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputEmailPaypal));
        C13571o oVar15 = r1;
        C13571o oVar16 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputAddress));
        C13571o oVar17 = r1;
        C13571o oVar18 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputZip));
        C13571o oVar19 = r1;
        C13571o oVar20 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputCity));
        C13571o oVar21 = r1;
        C13571o oVar22 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputPhone));
        C13571o oVar23 = r1;
        C13571o oVar24 = new C13571o((TextInputLayout) mo46249D2(C13865f.textInputMobile));
        C13548a aVar3 = r1;
        C13548a aVar4 = new C13548a((Button) mo46249D2(C13865f.buttonSaveChanges));
        C12869d0 d0Var = new C12869d0(this, new C12869d0.C12870a(o2, aVar, j, rVar, oVar, rVar3, oVar3, oVar5, oVar7, rVar5, oVar9, oVar11, oVar13, oVar15, oVar17, oVar19, oVar21, oVar23, aVar3));
        this.f17316n = d0Var;
        d0Var.mo50788y2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12869d0 d0Var = this.f17316n;
        if (d0Var == null) {
            C12775o.m28656z("controller");
            d0Var = null;
        }
        d0Var.mo50789z2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12869d0 d0Var = this.f17316n;
        if (d0Var == null) {
            C12775o.m28656z("controller");
            d0Var = null;
        }
        d0Var.mo50781A2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12869d0 d0Var = this.f17316n;
        if (d0Var == null) {
            C12775o.m28656z("controller");
            d0Var = null;
        }
        d0Var.mo50782C2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17315m;
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePaymentInfoActivity$b */
    /* compiled from: UpdatePaymentInfoActivity.kt */
    public static final class C11125b implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ C13074a<C11921v> f17318b;

        C11125b(C13074a<C11921v> aVar) {
            this.f17318b = aVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f17318b.invoke();
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
