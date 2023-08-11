package com.poulpeo.p321ui.screens.contact_info;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
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
import p387ma.C12895u;
import p387ma.C12896v;
import p387ma.C12898w;
import p438ub.C13542a;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13558g;
import p444vb.C13608a;
import p450wb.C13689a;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePasswordActivity */
/* compiled from: UpdatePasswordActivity.kt */
public final class UpdatePasswordActivity extends C12616b implements C12898w {

    /* renamed from: p */
    public static final C11123a f17308p = new C11123a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f17309q = 8;

    /* renamed from: m */
    private final int f17310m = R.string.update_password_title;

    /* renamed from: n */
    private C12896v f17311n;

    /* renamed from: o */
    public Map<Integer, View> f17312o = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.contact_info.UpdatePasswordActivity$a */
    /* compiled from: UpdatePasswordActivity.kt */
    public static final class C11123a {
        private C11123a() {
        }

        public /* synthetic */ C11123a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46248a(Context context) {
            C12775o.m28639i(context, "context");
            return new Intent(context, UpdatePasswordActivity.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m24033C2(UpdatePasswordActivity updatePasswordActivity, View view) {
        C12775o.m28639i(updatePasswordActivity, "this$0");
        updatePasswordActivity.startActivity(ResetPasswordActivity.f17279p.mo46217c(updatePasswordActivity, "update-password"));
    }

    /* renamed from: B2 */
    public View mo46243B2(int i) {
        Map<Integer, View> map = this.f17312o;
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
    public void mo46244b(C13551d dVar) {
        C12775o.m28639i(dVar, "wrapper");
        if (dVar.mo53192o() == ((EditText) mo46243B2(C13865f.editTextNewPassword))) {
            C12896v vVar = this.f17311n;
            if (vVar == null) {
                C12775o.m28656z("controller");
                vVar = null;
            }
            vVar.mo50819x2();
        }
    }

    /* renamed from: c */
    public void mo46245c(String str) {
        C12775o.m28639i(str, "message");
        ErrorUtil.displayAccountError(this, str);
    }

    /* renamed from: l */
    public void mo46246l(C13551d dVar, String str) {
        C12775o.m28639i(dVar, "editTextWrapper");
        C12775o.m28639i(str, "message");
        dVar.mo53192o().setError(str);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_update_password);
        mo50358x2("UpdatePasswordActivity", true);
        ((Button) mo46243B2(C13865f.buttonResetPassword)).setOnClickListener(new C12895u(this));
        int i = C13865f.editTextNewPassword;
        TextView textView = (TextView) mo46243B2(C13865f.textViewUppercase);
        C12775o.m28638h(textView, "textViewUppercase");
        TextView textView2 = (TextView) mo46243B2(C13865f.textViewNumeric);
        C12775o.m28638h(textView2, "textViewNumeric");
        TextView textView3 = (TextView) mo46243B2(C13865f.textViewLength);
        C12775o.m28638h(textView3, "textViewLength");
        ((EditText) mo46243B2(i)).addTextChangedListener(new C13608a(this, textView, textView2, textView3));
        C12896v vVar = new C12896v(this, new C12896v.C12897a(mo47878o2(), new C13689a(mo47878o2()), C13542a.f21790p.mo53187a(this).mo53185j(), new C13551d((EditText) mo46243B2(C13865f.editTextOldPassword)), new C13551d((EditText) mo46243B2(i)), new C13548a((Button) mo46243B2(C13865f.buttonSaveChanges)), new C13558g((ProgressBar) mo46243B2(C13865f.progressbarLoader)), new ResourceStringWrapper(R.string.update_user_info_empty_error), new ResourceStringWrapper(R.string.update_user_info_invalid_password)));
        this.f17311n = vVar;
        vVar.mo50814o2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C12896v vVar = this.f17311n;
        if (vVar == null) {
            C12775o.m28656z("controller");
            vVar = null;
        }
        vVar.mo50815p2();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C12896v vVar = this.f17311n;
        if (vVar == null) {
            C12775o.m28656z("controller");
            vVar = null;
        }
        vVar.mo50816r2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C12896v vVar = this.f17311n;
        if (vVar == null) {
            C12775o.m28656z("controller");
            vVar = null;
        }
        vVar.mo50817s2();
    }

    /* renamed from: y */
    public void mo46247y() {
        C12136d.m26467i(this, R.string.update_password_success);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f17310m;
    }
}
