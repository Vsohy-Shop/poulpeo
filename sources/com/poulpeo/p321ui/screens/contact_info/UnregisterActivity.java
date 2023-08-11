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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.UnregisterMotive;
import com.rmn.utils.ErrorUtil;
import java.util.LinkedHashMap;
import java.util.Map;
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
import p387ma.C12883k;
import p387ma.C12884l;
import p387ma.C12885m;
import p387ma.C12886n;
import p387ma.C12888o;
import p404of.C13074a;
import p438ub.C13542a;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13572p;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.contact_info.UnregisterActivity */
/* compiled from: UnregisterActivity.kt */
public final class UnregisterActivity extends C12616b implements C12888o {

    /* renamed from: p */
    public static final C11116a f17292p = new C11116a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17293q = 8;

    /* renamed from: m */
    private final int f17294m = R.string.unregister_title;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C12886n f17295n;

    /* renamed from: o */
    public Map<Integer, View> f17296o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.contact_info.UnregisterActivity$a */
    /* compiled from: UnregisterActivity.kt */
    public static final class C11116a {
        private C11116a() {
        }

        public /* synthetic */ C11116a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46229a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, UnregisterActivity.class);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UnregisterActivity$c */
    /* compiled from: UnregisterActivity.kt */
    static final class C11118c extends C12777p implements C13074a<C11921v> {

        /* renamed from: g */
        final /* synthetic */ Button f17298g;

        /* renamed from: h */
        final /* synthetic */ EditText f17299h;

        /* renamed from: i */
        final /* synthetic */ CheckBox f17300i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11118c(Button button, EditText editText, CheckBox checkBox) {
            super(0);
            this.f17298g = button;
            this.f17299h = editText;
            this.f17300i = checkBox;
        }

        public final void invoke() {
            Button button = this.f17298g;
            Editable text = this.f17299h.getText();
            C12775o.m28638h(text, "editTextPassword.text");
            boolean z = true;
            if (!(text.length() > 0) || !this.f17300i.isChecked()) {
                z = false;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UnregisterActivity$d */
    /* compiled from: UnregisterActivity.kt */
    public static final class C11119d extends ArrayAdapter<UnregisterMotive> {
        C11119d(UnregisterActivity unregisterActivity, UnregisterMotive[] unregisterMotiveArr) {
            super(unregisterActivity, 17367049, unregisterMotiveArr);
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

    /* renamed from: com.poulpeo.ui.screens.contact_info.UnregisterActivity$e */
    /* compiled from: UnregisterActivity.kt */
    public static final class C11120e implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ UnregisterActivity f17301b;

        C11120e(UnregisterActivity unregisterActivity) {
            this.f17301b = unregisterActivity;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            Object itemAtPosition = ((Spinner) this.f17301b.mo46223D2(C13865f.spinnerMotive)).getItemAtPosition(i);
            C12775o.m28637g(itemAtPosition, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.UnregisterMotive");
            UnregisterMotive unregisterMotive = (UnregisterMotive) itemAtPosition;
            C12886n F2 = this.f17301b.f17295n;
            if (F2 == null) {
                C12775o.m28656z("controller");
                F2 = null;
            }
            F2.mo50804v2(unregisterMotive);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            C12886n F2 = this.f17301b.f17295n;
            if (F2 == null) {
                C12775o.m28656z("controller");
                F2 = null;
            }
            F2.mo50804v2(UnregisterMotive.UNDEFINED);
        }
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UnregisterActivity$f */
    /* compiled from: UnregisterActivity.kt */
    static final class C11121f extends C12777p implements Function1<AlertDialog, C11921v> {

        /* renamed from: g */
        final /* synthetic */ UnregisterActivity f17302g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11121f(UnregisterActivity unregisterActivity) {
            super(1);
            this.f17302g = unregisterActivity;
        }

        /* renamed from: a */
        public final void mo46236a(AlertDialog alertDialog) {
            C12775o.m28639i(alertDialog, "it");
            this.f17302g.m24010G2(alertDialog);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46236a((AlertDialog) obj);
            return C11921v.f18618a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public final void m24010G2(AlertDialog alertDialog) {
        View findViewById = alertDialog.findViewById(R.id.editTextPassword);
        C12775o.m28636f(findViewById);
        EditText editText = (EditText) findViewById;
        View findViewById2 = alertDialog.findViewById(R.id.checkboxAccept);
        C12775o.m28636f(findViewById2);
        CheckBox checkBox = (CheckBox) findViewById2;
        Button button = alertDialog.getButton(-1);
        Button button2 = (Button) alertDialog.findViewById(R.id.buttonResetPassword);
        if (button2 != null) {
            button2.setOnClickListener(new C12884l(this));
        }
        C11118c cVar = new C11118c(button, editText, checkBox);
        cVar.invoke();
        editText.addTextChangedListener(new C11117b(cVar));
        checkBox.setOnCheckedChangeListener(new C12885m(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m24011H2(UnregisterActivity unregisterActivity, View view) {
        C12775o.m28639i(unregisterActivity, "this$0");
        unregisterActivity.startActivity(ResetPasswordActivity.f17279p.mo46217c(unregisterActivity, "unregister"));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m24012I2(C13074a aVar, CompoundButton compoundButton, boolean z) {
        C12775o.m28639i(aVar, "$updateButtonOk");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m24013J2(UnregisterActivity unregisterActivity, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(unregisterActivity, "this$0");
        C12775o.m28637g(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        EditText editText = (EditText) ((AlertDialog) dialogInterface).findViewById(R.id.editTextPassword);
        if (editText != null) {
            C12886n nVar = unregisterActivity.f17295n;
            if (nVar == null) {
                C12775o.m28656z("controller");
                nVar = null;
            }
            nVar.mo50805w2(editText.getText().toString());
        }
    }

    /* renamed from: D2 */
    public View mo46223D2(int i) {
        Map<Integer, View> map = this.f17296o;
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

    /* renamed from: c */
    public void mo46224c(String str) {
        C12775o.m28639i(str, "message");
        ErrorUtil.displayAccountError(this, str);
    }

    /* renamed from: g */
    public void mo46225g() {
        C11884a.f18565e.mo49089a(this, "overlay");
    }

    /* renamed from: h */
    public void mo46226h() {
        C11884a.f18565e.mo49090c(this, "overlay", new C11887b());
    }

    /* renamed from: j */
    public void mo46227j() {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setTitle((int) R.string.unregister_password_popup).setView((int) R.layout.view_unregister_password_popup).setPositiveButton((int) R.string.unregister_password_validate, (DialogInterface.OnClickListener) new C12883k(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(this)\n          …id.R.string.cancel, null)");
        C12134b.m26456b(negativeButton, this, new C11121f(this));
    }

    /* renamed from: m1 */
    public void mo46228m1() {
        C12136d.m26468j(this, getString(R.string.unregister_missing_motive));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_unregister);
        mo50358x2("UnregisterActivity", true);
        int i = C13865f.spinnerMotive;
        ((Spinner) mo46223D2(i)).setAdapter(new C11119d(this, UnregisterMotive.values()));
        ((Spinner) mo46223D2(i)).setOnItemSelectedListener(new C11120e(this));
        C12886n nVar = new C12886n(this, new C12886n.C12887a(mo47878o2(), new C13689a(mo47878o2()), C13542a.f21790p.mo53187a(this).mo53184i(), new C13551d((EditText) mo46223D2(C13865f.editTextMotive)), new C13551d((EditText) mo46223D2(C13865f.editTextSuggestion)), new C13572p((TextView) mo46223D2(C13865f.textViewNbCharacter)), new C13548a((Button) mo46223D2(C13865f.buttonUnregister))));
        this.f17295n = nVar;
        nVar.mo50799o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12886n nVar = this.f17295n;
        if (nVar == null) {
            C12775o.m28656z("controller");
            nVar = null;
        }
        nVar.mo50800p2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12886n nVar = this.f17295n;
        if (nVar == null) {
            C12775o.m28656z("controller");
            nVar = null;
        }
        nVar.mo50801q2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12886n nVar = this.f17295n;
        if (nVar == null) {
            C12775o.m28656z("controller");
            nVar = null;
        }
        nVar.mo50802r2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17294m;
    }

    /* renamed from: com.poulpeo.ui.screens.contact_info.UnregisterActivity$b */
    /* compiled from: UnregisterActivity.kt */
    public static final class C11117b implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ C13074a<C11921v> f17297b;

        C11117b(C13074a<C11921v> aVar) {
            this.f17297b = aVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f17297b.invoke();
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
