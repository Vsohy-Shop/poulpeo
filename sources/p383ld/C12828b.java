package p383ld;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.facebook.C4509a;
import com.facebook.C4546i;
import com.facebook.C4549j;
import com.facebook.C4580s;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.C4615a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.poulpeo.R;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import com.rmn.utils.AndroidUtil;
import com.rmn.utils.GoogleLoginUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p021a3.C2182p;
import p021a3.C2189r;
import p317cd.C11036a;
import p317cd.C11037b;
import p317cd.C11039c;
import p336ef.C11921v;
import p360id.C12136d;
import p368jd.C12616b;
import p395nc.C12993f;
import p395nc.C12994g;
import p404of.C13074a;
import p409pc.C13200d;
import p433tc.C13486a;
import p440ud.C13566l;
import p446vd.C13633n;

@StabilityInferred(parameters = 0)
/* renamed from: ld.b */
/* compiled from: BaseLoginActivity.kt */
public abstract class C12828b extends C12616b implements TextWatcher, View.OnClickListener, C4549j<C2189r>, C11039c {

    /* renamed from: I */
    public static final C12829a f20498I = new C12829a((DefaultConstructorMarker) null);

    /* renamed from: J */
    public static final int f20499J = 8;

    /* renamed from: A */
    private boolean f20500A;

    /* renamed from: B */
    private final Lazy f20501B = C11901h.m25690b(C12832d.f20524g);

    /* renamed from: C */
    private boolean f20502C;

    /* renamed from: D */
    private boolean f20503D;

    /* renamed from: E */
    private boolean f20504E;

    /* renamed from: F */
    private boolean f20505F;

    /* renamed from: G */
    private final C13074a<C11921v> f20506G;

    /* renamed from: H */
    public Map<Integer, View> f20507H = new LinkedHashMap();

    /* renamed from: m */
    private EditText f20508m;

    /* renamed from: n */
    protected EditText f20509n;

    /* renamed from: o */
    private ProgressBar f20510o;

    /* renamed from: p */
    private Button f20511p;

    /* renamed from: q */
    private View f20512q;

    /* renamed from: r */
    private ProgressBar f20513r;

    /* renamed from: s */
    private final Lazy f20514s = C11901h.m25690b(C12830b.f20522g);

    /* renamed from: t */
    protected TextView f20515t;

    /* renamed from: u */
    private int f20516u;

    /* renamed from: v */
    private C4509a f20517v;

    /* renamed from: w */
    private String f20518w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public String f20519x;

    /* renamed from: y */
    private C11037b f20520y;

    /* renamed from: z */
    private boolean f20521z;

    /* renamed from: ld.b$a */
    /* compiled from: BaseLoginActivity.kt */
    public static final class C12829a {
        private C12829a() {
        }

        public /* synthetic */ C12829a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ld.b$b */
    /* compiled from: BaseLoginActivity.kt */
    static final class C12830b extends C12777p implements C13074a<C4546i> {

        /* renamed from: g */
        public static final C12830b f20522g = new C12830b();

        C12830b() {
            super(0);
        }

        /* renamed from: b */
        public final C4546i invoke() {
            return C4546i.C4547a.m5605a();
        }
    }

    /* renamed from: ld.b$c */
    /* compiled from: BaseLoginActivity.kt */
    static final class C12831c extends C12777p implements Function1<C12994g, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C12828b f20523g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12831c(C12828b bVar) {
            super(1);
            this.f20523g = bVar;
        }

        /* renamed from: a */
        public final void mo50752a(C12994g gVar) {
            C12775o.m28639i(gVar, "it");
            if (gVar instanceof C12994g.C12995a) {
                this.f20523g.mo46108Y1((String) null);
            } else if (gVar instanceof C12994g.C12996b) {
                this.f20523g.mo50736N2().mo46087g3();
                C13633n.m31166v(((C12994g.C12996b) gVar).mo50911a());
                C12828b bVar = this.f20523g;
                bVar.mo46108Y1(bVar.getString(R.string.apple_sign_in_error));
            } else if (gVar instanceof C12994g.C12997c) {
                this.f20523g.f20519x = ((C12994g.C12997c) gVar).mo50915a();
                this.f20523g.mo50736N2().mo46086c3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo50752a((C12994g) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: ld.b$d */
    /* compiled from: BaseLoginActivity.kt */
    static final class C12832d extends C12777p implements C13074a<PasswordTransformationMethod> {

        /* renamed from: g */
        public static final C12832d f20524g = new C12832d();

        C12832d() {
            super(0);
        }

        /* renamed from: b */
        public final PasswordTransformationMethod invoke() {
            return new PasswordTransformationMethod();
        }
    }

    /* renamed from: L2 */
    private final C4546i m28783L2() {
        return (C4546i) this.f20514s.getValue();
    }

    /* renamed from: V2 */
    private final void m28784V2(Exception exc) {
        mo50736N2().mo46087g3();
        this.f20500A = false;
        mo50736N2().mo46080W2(false);
        if (!mo50736N2().mo46098u2()) {
            C13633n.m31150f(this, "Google Error", exc);
            mo50733F2(R.string.error_google);
            if (exc != null) {
                C13486a.f21657a.mo53089b(exc);
            }
        }
    }

    /* renamed from: W2 */
    static /* synthetic */ void m28785W2(C12828b bVar, Exception exc, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                exc = null;
            }
            bVar.m28784V2(exc);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onGoogleLoginError");
    }

    /* renamed from: X2 */
    private final void m28786X2(Intent intent) {
        C11921v vVar;
        String str;
        boolean z = false;
        this.f20500A = false;
        if (!mo50736N2().mo46098u2()) {
            Task<GoogleSignInAccount> c = C4615a.m5956c(intent);
            if (c != null) {
                try {
                    GoogleSignInAccount m = c.mo35462m(ApiException.class);
                    if (m != null) {
                        str = m.mo31850M();
                    } else {
                        str = null;
                    }
                    this.f20518w = str;
                    if (str == null || str.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        m28784V2((Exception) null);
                        return;
                    }
                    C13633n.m31162r("Google Access Token retrieved");
                    mo50736N2().mo46086c3();
                    vVar = C11921v.f18618a;
                } catch (Exception e) {
                    C13633n.m31150f(this, "Google Error", e);
                    m28784V2(e);
                    return;
                }
            } else {
                vVar = null;
            }
            if (vVar == null) {
                m28785W2(this, (Exception) null, 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m28787c3(EditText editText, C12828b bVar) {
        C12775o.m28639i(editText, "$editTextPassword");
        C12775o.m28639i(bVar, "this$0");
        Drawable[] compoundDrawables = editText.getCompoundDrawables();
        C12775o.m28638h(compoundDrawables, "editTextPassword.compoundDrawables");
        int intrinsicWidth = compoundDrawables[2].getIntrinsicWidth();
        TextView textView = bVar.f20515t;
        if (textView != null) {
            int i = bVar.f20516u;
            textView.setPadding(i, i, intrinsicWidth + i, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public final void mo50730C2() {
        Button button = this.f20511p;
        if (button != null) {
            button.animate().scaleX(0.0f).scaleY(0.0f).setInterpolator(new AnticipateInterpolator());
        }
        ProgressBar progressBar = this.f20510o;
        if (progressBar != null) {
            progressBar.setEnabled(true);
        }
        EditText editText = this.f20508m;
        if (editText != null) {
            editText.setEnabled(false);
        }
        EditText editText2 = this.f20509n;
        if (editText2 != null) {
            editText2.setEnabled(false);
        }
        Button I2 = mo46272I2();
        if (I2 != null) {
            I2.setEnabled(false);
        }
        Button J2 = mo46273J2();
        if (J2 != null) {
            J2.setEnabled(false);
        }
        Button H2 = mo46271H2();
        if (H2 != null) {
            H2.setEnabled(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public final void mo50731D2() {
        Button button = this.f20511p;
        if (button != null) {
            button.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator());
        }
        ProgressBar progressBar = this.f20510o;
        if (progressBar != null) {
            progressBar.setEnabled(false);
        }
        EditText editText = this.f20508m;
        if (editText != null) {
            editText.setEnabled(true);
        }
        EditText editText2 = this.f20509n;
        if (editText2 != null) {
            editText2.setEnabled(true);
        }
        Button I2 = mo46272I2();
        if (I2 != null) {
            I2.setEnabled(true);
        }
        Button J2 = mo46273J2();
        if (J2 != null) {
            J2.setEnabled(true);
        }
        Button H2 = mo46271H2();
        if (H2 != null) {
            H2.setEnabled(true);
        }
    }

    /* renamed from: E1 */
    public String mo46103E1() {
        String str = this.f20518w;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public boolean mo50732E2(boolean z, boolean z2) {
        Editable editable;
        boolean z3;
        boolean z4;
        EditText editText = this.f20508m;
        Editable editable2 = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        EditText editText2 = this.f20509n;
        if (editText2 != null) {
            editable2 = editText2.getText();
        }
        if (editable == null || C13754v.m31532t(editable)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            EditText editText3 = this.f20508m;
            if (editText3 != null) {
                editText3.requestFocus();
            }
            EditText editText4 = this.f20508m;
            if (editText4 != null) {
                editText4.setError(getResources().getString(R.string.account_error_email_empty));
            }
            return false;
        } else if (!z2 || Patterns.EMAIL_ADDRESS.matcher(editable).matches()) {
            if (z) {
                if (editable2 == null || editable2.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    mo50747b3(R.string.account_error_password_empty);
                    return false;
                }
            }
            return true;
        } else {
            EditText editText5 = this.f20508m;
            if (editText5 != null) {
                editText5.requestFocus();
            }
            EditText editText6 = this.f20508m;
            if (editText6 != null) {
                editText6.setError(getResources().getString(R.string.account_email_format_error));
            }
            return false;
        }
    }

    /* renamed from: F1 */
    public ResourceStringWrapper mo46104F1() {
        return new ResourceStringWrapper(R.string.login_access_token_fail);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public final void mo50733F2(int i) {
        mo46108Y1(getString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public final void mo50734G2() {
        ProgressBar progressBar = this.f20513r;
        if (progressBar != null) {
            progressBar.setEnabled(true);
        }
        View view = this.f20512q;
        if (view != null) {
            view.setVisibility(0);
        }
        Button I2 = mo46272I2();
        if (I2 != null) {
            I2.setEnabled(false);
        }
        Button J2 = mo46273J2();
        if (J2 != null) {
            J2.setEnabled(false);
        }
        Button H2 = mo46271H2();
        if (H2 != null) {
            H2.setEnabled(false);
        }
    }

    /* renamed from: H */
    public void mo46105H() {
        mo50731D2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public abstract Button mo46271H2();

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public abstract Button mo46272I2();

    /* access modifiers changed from: protected */
    /* renamed from: J2 */
    public abstract Button mo46273J2();

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public final Button mo50735K2() {
        return this.f20511p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public abstract int mo46274M2();

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public final C11037b mo50736N2() {
        C11037b bVar = this.f20520y;
        if (bVar != null) {
            return bVar;
        }
        C12775o.m28656z("controller");
        return null;
    }

    /* renamed from: O1 */
    public String mo46106O1() {
        String n;
        C4509a aVar = this.f20517v;
        if (aVar == null || (n = aVar.mo31500n()) == null) {
            return "";
        }
        return n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public C13074a<C11921v> mo50737O2() {
        return this.f20506G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public final PasswordTransformationMethod mo50738P2() {
        return (PasswordTransformationMethod) this.f20501B.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public final void mo50739Q2() {
        ProgressBar progressBar = this.f20513r;
        if (progressBar != null) {
            progressBar.setEnabled(false);
        }
        View view = this.f20512q;
        if (view != null) {
            view.setVisibility(4);
        }
        Button I2 = mo46272I2();
        if (I2 != null) {
            I2.setEnabled(true);
        }
        Button J2 = mo46273J2();
        if (J2 != null) {
            J2.setEnabled(true);
        }
        Button H2 = mo46271H2();
        if (H2 != null) {
            H2.setEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public final void mo50740R2() {
        if (!mo50736N2().mo46099v2()) {
            mo50734G2();
            boolean z = true;
            this.f20500A = true;
            mo50736N2().mo46080W2(true);
            mo50736N2().mo46081X2(true);
            String str = this.f20519x;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                mo50736N2().mo46086c3();
                return;
            }
            C12993f fVar = C12993f.f20794f;
            fVar.mo50904e();
            fVar.mo50903d(this, new C12831c(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public final void mo50741S2() {
        String str;
        if (!mo50736N2().mo46099v2()) {
            mo50734G2();
            boolean z = true;
            this.f20500A = true;
            mo50736N2().mo46080W2(true);
            mo50736N2().mo46082Y2(true);
            C4509a aVar = this.f20517v;
            if (aVar != null) {
                str = aVar.mo31500n();
            } else {
                str = null;
            }
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                mo50736N2().mo46086c3();
                return;
            }
            C2182p.m1687e().mo23456k();
            C2182p.m1687e().mo23455j(this, C12726w.m28527n("public_profile", NotificationCompat.CATEGORY_EMAIL));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public final void mo50742T2() {
        if (!mo50736N2().mo46099v2()) {
            mo50734G2();
            boolean z = true;
            this.f20500A = true;
            mo50736N2().mo46080W2(true);
            mo50736N2().mo46083Z2(true);
            String str = this.f20518w;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                mo50736N2().mo46086c3();
                return;
            }
            GoogleSignInClient newGoogleSignIn = GoogleLoginUtil.INSTANCE.newGoogleSignIn(this);
            newGoogleSignIn.mo31859D();
            startActivityForResult(newGoogleSignIn.mo31857B(), 5479);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public abstract C11037b mo46275U2();

    /* renamed from: X */
    public void mo46107X(ResourceStringWrapper resourceStringWrapper) {
        C12775o.m28639i(resourceStringWrapper, "errorMessage");
        mo50733F2(resourceStringWrapper.f18146a);
    }

    /* renamed from: Y1 */
    public void mo46108Y1(String str) {
        mo50736N2().mo46080W2(false);
        mo50731D2();
        mo50739Q2();
        if (str != null) {
            C12136d.m26468j(this, str);
        }
    }

    /* renamed from: Y2 */
    public void mo31593a(C2189r rVar) {
        C12775o.m28639i(rVar, "loginResult");
        boolean z = false;
        this.f20500A = false;
        if (!mo50736N2().mo46098u2()) {
            C4509a a = rVar.mo23468a();
            if (a != null) {
                String n = a.mo31500n();
                if (n == null || n.length() == 0) {
                    z = true;
                }
                if (!z) {
                    this.f20517v = a;
                    C13633n.m31162r("FB Access Token retrieved");
                    mo50736N2().mo46086c3();
                    return;
                }
            }
            mo31595t0(new FacebookException("Facebook connect succeeded but loginResult doesn't have the accessToken"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public final void mo50744Z2(Button button) {
        this.f20511p = button;
    }

    /* renamed from: a2 */
    public String mo46109a2() {
        String c;
        C4580s b = C4580s.f4310j.mo31736b();
        if (b == null || (c = b.mo31725c()) == null) {
            return "";
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo50745a3() {
        Editable editable;
        C11037b N2 = mo50736N2();
        EditText editText = this.f20508m;
        Editable editable2 = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        EditText editText2 = this.f20509n;
        if (editText2 != null) {
            editable2 = editText2.getText();
        }
        N2.mo46079V2(valueOf, String.valueOf(editable2));
    }

    public void afterTextChanged(Editable editable) {
        C12775o.m28639i(editable, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public final void mo50747b3(int i) {
        EditText editText = this.f20509n;
        C12775o.m28637g(editText, "null cannot be cast to non-null type android.widget.EditText");
        editText.requestFocus();
        editText.setError(getString(i));
        new Handler().post(new C12827a(editText, this));
        this.f20521z = true;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C12775o.m28639i(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        if (this.f20521z) {
            EditText editText = this.f20509n;
            C12775o.m28636f(editText);
            if (editText.getError() == null) {
                TextView textView = this.f20515t;
                if (textView != null) {
                    int i4 = this.f20516u;
                    textView.setPadding(i4, i4, i4, i4);
                }
                this.f20521z = false;
            }
        }
    }

    /* renamed from: c0 */
    public String mo46110c0() {
        String str = this.f20519x;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    public void mo46111e() {
        AndroidUtil.hideSoftKeyboard(this, true);
    }

    /* renamed from: e0 */
    public void mo46112e0(boolean z, boolean z2, boolean z3) {
        String str;
        C11036a s2 = mo50736N2().mo46096s2();
        C12775o.m28638h(s2, "controller.actionHandler");
        s2.mo46068a(mo50736N2().mo46072D2(), new ContextContainer(this));
        if (z) {
            str = "facebook";
        } else if (z2) {
            str = com.adjust.sdk.Constants.REFERRER_API_GOOGLE;
        } else if (z3) {
            str = "apple";
        } else {
            str = NotificationCompat.CATEGORY_EMAIL;
        }
        if (mo50736N2().mo46074F2()) {
            C13200d.f21007a.mo52838p(this, str);
        } else {
            C13200d.f21007a.mo52837o(this, str);
        }
        setResult(350);
        finish();
        s2.mo46069b(new C13566l(this));
    }

    /* renamed from: f1 */
    public ResourceStringWrapper mo46113f1() {
        return new ResourceStringWrapper(R.string.error_timestamp);
    }

    /* renamed from: m0 */
    public void mo46114m0(String str) {
        C12775o.m28639i(str, "breadcrumb");
        C13486a.f21657a.mo53090c(str);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m28783L2().mo31586a(i, i2, intent);
        if (i2 == 350) {
            setResult(350);
            finish();
        } else if (i == 5479) {
            m28786X2(intent);
        } else if (i == 1337 && i2 == -1 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("newsletter_is_checked", false);
            mo50736N2().mo46085b3(true);
            mo50736N2().mo46084a3(booleanExtra);
            if (intent.getBooleanExtra("is_facebook_signup", false)) {
                this.f20502C = true;
            } else if (intent.getBooleanExtra("is_google_signup", false)) {
                this.f20503D = true;
            } else if (intent.getBooleanExtra("is_apple_signup", false)) {
                this.f20504E = true;
            } else {
                this.f20505F = true;
            }
        }
    }

    public void onCancel() {
        this.f20500A = false;
        mo50736N2().mo46080W2(false);
        mo50739Q2();
        C13633n.m31162r("FB Cancelled");
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (view == mo46272I2()) {
            mo50741S2();
            mo46286e3();
        } else if (view == mo46273J2()) {
            this.f20518w = null;
            mo50742T2();
            mo46287f3();
        } else if (view == mo46271H2()) {
            this.f20519x = null;
            mo50740R2();
            mo46285d3();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2182p.m1687e().mo23459o(m28783L2(), this);
        setContentView(mo46274M2());
        this.f20508m = (EditText) findViewById(R.id.editTextEmail);
        this.f20509n = (EditText) findViewById(R.id.editTextPassword);
        this.f20510o = (ProgressBar) findViewById(R.id.progressbarLoader);
        Button I2 = mo46272I2();
        if (I2 != null) {
            I2.setOnClickListener(this);
        }
        Button J2 = mo46273J2();
        if (J2 != null) {
            J2.setOnClickListener(this);
        }
        Button H2 = mo46271H2();
        if (H2 != null) {
            H2.setOnClickListener(this);
        }
        this.f20512q = findViewById(R.id.layoutLoader);
        this.f20513r = (ProgressBar) findViewById(R.id.progressBarLoaderLayout);
        EditText editText = this.f20509n;
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        this.f20516u = (int) getResources().getDimension(R.dimen.activity_horizontal_margin);
        EditText editText2 = this.f20509n;
        if (editText2 != null) {
            editText2.setTransformationMethod(mo50738P2());
        }
        this.f20520y = mo46275U2();
        mo50736N2().mo46075L2();
    }

    public void onDestroy() {
        super.onDestroy();
        mo50736N2().mo46076M2();
    }

    public void onPause() {
        super.onPause();
        mo50736N2().mo46077O2();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        C12775o.m28639i(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        EditText editText = this.f20508m;
        if (editText != null && this.f20509n != null) {
            C12775o.m28636f(editText);
            editText.setText(bundle.getString("mEmail"));
            EditText editText2 = this.f20509n;
            C12775o.m28636f(editText2);
            editText2.setText(bundle.getString("mPassword"));
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        mo50736N2().mo46078P2();
        if (this.f20502C) {
            this.f20502C = false;
            mo50741S2();
        } else if (this.f20503D) {
            this.f20503D = false;
            mo50742T2();
        } else if (this.f20504E) {
            this.f20504E = false;
            mo50740R2();
        } else if (this.f20505F) {
            this.f20505F = false;
            C13074a<C11921v> O2 = mo50737O2();
            if (O2 != null) {
                O2.invoke();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C12775o.m28639i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        EditText editText = this.f20508m;
        if (editText != null && this.f20509n != null) {
            C12775o.m28636f(editText);
            bundle.putString("mEmail", editText.getText().toString());
            EditText editText2 = this.f20509n;
            C12775o.m28636f(editText2);
            bundle.putString("mPassword", editText2.getText().toString());
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C12775o.m28639i(charSequence, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public int mo47879r2() {
        if (this.f20500A) {
            return 0;
        }
        return super.mo47879r2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public int mo47880s2() {
        if (this.f20500A) {
            return 0;
        }
        return super.mo47880s2();
    }

    /* renamed from: t */
    public void mo46116t(ResourceStringWrapper resourceStringWrapper) {
        C12775o.m28639i(resourceStringWrapper, "errorMessage");
        mo50733F2(resourceStringWrapper.f18146a);
        C13486a aVar = C13486a.f21657a;
        aVar.mo53091d("Access token failed : " + resourceStringWrapper);
    }

    /* renamed from: t0 */
    public void mo31595t0(FacebookException facebookException) {
        C12775o.m28639i(facebookException, "exception");
        mo50736N2().mo46087g3();
        this.f20500A = false;
        mo50736N2().mo46080W2(false);
        if (!mo50736N2().mo46098u2()) {
            C13633n.m31150f(this, "FB Error", facebookException);
            mo50733F2(R.string.error_facebook);
            C13486a.f21657a.mo53089b(facebookException);
        }
    }

    /* renamed from: u1 */
    public String mo46117u1() {
        String str;
        GoogleSignInAccount b = C4615a.m5955b(this);
        if (b != null) {
            str = b.mo31846I();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public void mo46285d3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public void mo46286e3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo46287f3() {
    }
}
