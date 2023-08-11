package com.poulpeo.p321ui.screens.contact_info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import com.rmn.utils.ErrorUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p360id.C12136d;
import p368jd.C12616b;
import p387ma.C12889p;
import p387ma.C12892s;
import p387ma.C12894t;
import p438ub.C13542a;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13558g;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.contact_info.UpdateLoginInfoActivity */
/* compiled from: UpdateLoginInfoActivity.kt */
public final class UpdateLoginInfoActivity extends C12616b implements C12894t {

    /* renamed from: p */
    public static final C11122a f17303p = new C11122a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17304q = 8;

    /* renamed from: m */
    private final int f17305m = R.string.update_login_info_title;

    /* renamed from: n */
    private C12892s f17306n;

    /* renamed from: o */
    public Map<Integer, View> f17307o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdateLoginInfoActivity$a */
    /* compiled from: UpdateLoginInfoActivity.kt */
    public static final class C11122a {
        private C11122a() {
        }

        public /* synthetic */ C11122a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46242a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, UpdateLoginInfoActivity.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m24024C2(UpdateLoginInfoActivity updateLoginInfoActivity, View view) {
        C12775o.m28639i(updateLoginInfoActivity, "this$0");
        updateLoginInfoActivity.startActivity(ResetPasswordActivity.f17279p.mo46217c(updateLoginInfoActivity, "update-login-info"));
    }

    /* renamed from: B2 */
    public View mo46237B2(int i) {
        Map<Integer, View> map = this.f17307o;
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
    public void mo46238b(C13551d dVar) {
        C12775o.m28639i(dVar, "wrapper");
        if (dVar.mo53192o() == ((EditText) mo46237B2(C13865f.editTextPassword))) {
            C12892s sVar = this.f17306n;
            if (sVar == null) {
                C12775o.m28656z("controller");
                sVar = null;
            }
            sVar.mo50807D2();
        }
    }

    /* renamed from: c */
    public void mo46239c(String str) {
        C12775o.m28639i(str, "message");
        ErrorUtil.displayAccountError(this, str);
    }

    /* renamed from: l */
    public void mo46240l(C13551d dVar, String str) {
        C12775o.m28639i(dVar, "editTextWrapper");
        C12775o.m28639i(str, "message");
        dVar.mo53192o().setError(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_update_login_info);
        mo50358x2("UpdateLoginInfoActivity", true);
        ((Button) mo46237B2(C13865f.buttonResetPassword)).setOnClickListener(new C12889p(this));
        C12892s sVar = new C12892s(this, new C12892s.C12893a(mo47878o2(), new C13689a(mo47878o2()), C13542a.f21790p.mo53187a(this).mo53185j(), new C13551d((EditText) mo46237B2(C13865f.editTextLogin)), new C13551d((EditText) mo46237B2(C13865f.editTextEmail)), new C13551d((EditText) mo46237B2(C13865f.editTextPassword)), new C13548a((Button) mo46237B2(C13865f.buttonSaveChanges)), new C13558g((ProgressBar) mo46237B2(C13865f.progressbarLoader)), new ResourceStringWrapper(R.string.update_user_info_empty_error)));
        this.f17306n = sVar;
        sVar.mo50808s2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12892s sVar = this.f17306n;
        if (sVar == null) {
            C12775o.m28656z("controller");
            sVar = null;
        }
        sVar.mo50809t2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12892s sVar = this.f17306n;
        if (sVar == null) {
            C12775o.m28656z("controller");
            sVar = null;
        }
        sVar.mo50810v2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12892s sVar = this.f17306n;
        if (sVar == null) {
            C12775o.m28656z("controller");
            sVar = null;
        }
        sVar.mo50811w2();
    }

    /* renamed from: u */
    public void mo46241u() {
        C12136d.m26467i(this, R.string.update_login_info_success);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17305m;
    }
}
