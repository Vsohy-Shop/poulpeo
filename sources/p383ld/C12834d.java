package p383ld;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p317cd.C11041e;
import p317cd.C11043f;
import p360id.C12134b;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: ld.d */
/* compiled from: BaseSignInActivity.kt */
public abstract class C12834d extends C12828b {

    /* renamed from: K */
    private final int f20526K = R.layout.activity_signin;

    /* renamed from: M */
    private final int f20527M = R.string.title_sign_in;

    /* renamed from: X */
    private boolean f20528X;

    /* renamed from: Y */
    private final Lazy f20529Y = C11901h.m25690b(new C12835a(this));

    /* renamed from: Z */
    public Map<Integer, View> f20530Z = new LinkedHashMap();

    /* renamed from: ld.d$a */
    /* compiled from: BaseSignInActivity.kt */
    static final class C12835a extends C12777p implements C13074a<C11041e> {

        /* renamed from: g */
        final /* synthetic */ C12834d f20531g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12835a(C12834d dVar) {
            super(0);
            this.f20531g = dVar;
        }

        /* renamed from: b */
        public final C11041e invoke() {
            return new C11041e((C11043f) null, new C11041e.C11042a(this.f20531g.mo47878o2(), this.f20531g.mo50736N2().mo46100w2().f17115f, this.f20531g.mo50736N2().mo46100w2().f17119j, this.f20531g.mo50736N2().mo46071C2()));
        }
    }

    /* renamed from: h3 */
    private final C11041e m28835h3() {
        return (C11041e) this.f20529Y.getValue();
    }

    /* renamed from: j3 */
    private final void m28836j3() {
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this).setTitle((int) R.string.account_forgot_password_title).setMessage((int) R.string.account_forgot_password_alert).setPositiveButton((int) R.string.avatar_use, (DialogInterface.OnClickListener) new C12833c(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        C12775o.m28638h(negativeButton, "Builder(this)\n          …id.R.string.cancel, null)");
        C12134b.m26457c(negativeButton, this, (Function1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m28837k3(C12834d dVar, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(dVar, "this$0");
        C11041e h3 = dVar.m28835h3();
        String t2 = dVar.mo50736N2().mo46097t2();
        if (t2 == null) {
            t2 = "";
        }
        h3.mo46124u2(t2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public int mo46274M2() {
        return this.f20526K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public final void mo50755i3(boolean z) {
        this.f20528X = z;
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (!mo50736N2().mo46099v2()) {
            int id = view.getId();
            if (id == R.id.buttonSignIn) {
                mo50736N2().mo46080W2(true);
                mo50736N2().mo46082Y2(false);
                mo50736N2().mo46083Z2(false);
                mo50736N2().mo46081X2(false);
                if (mo50732E2(true, this.f20528X)) {
                    mo50745a3();
                    mo50730C2();
                    mo50736N2().mo46086c3();
                    mo46288l3();
                    return;
                }
                mo50736N2().mo46080W2(false);
            } else if (id != R.id.textViewForgotPassword) {
                super.onClick(view);
            } else if (mo50732E2(false, this.f20528X)) {
                mo50745a3();
                m28836j3();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50744Z2((Button) findViewById(R.id.buttonSignIn));
        Button K2 = mo50735K2();
        if (K2 != null) {
            K2.setOnClickListener(this);
        }
        TextView textView = (TextView) findViewById(R.id.textViewForgotPassword);
        this.f20515t = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        m28835h3().mo46120o2();
    }

    public void onDestroy() {
        super.onDestroy();
        m28835h3().mo46121p2();
    }

    public void onPause() {
        super.onPause();
        m28835h3().mo46122q2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m28835h3().mo46123s2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f20527M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l3 */
    public void mo46288l3() {
    }
}
