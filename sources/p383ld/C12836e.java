package p383ld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: ld.e */
/* compiled from: BaseSignUpActivity.kt */
public abstract class C12836e extends C12828b {

    /* renamed from: K */
    private final int f20532K = R.string.title_sign_up;

    /* renamed from: M */
    public Map<Integer, View> f20533M = new LinkedHashMap();

    /* access modifiers changed from: protected */
    /* renamed from: g3 */
    public final void mo50757g3() {
        mo50745a3();
        mo50730C2();
        mo50736N2().mo46086c3();
        mo46276h3();
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (!mo50736N2().mo46099v2()) {
            if (view.getId() == R.id.buttonSignUp) {
                mo50736N2().mo46082Y2(false);
                mo50736N2().mo46083Z2(false);
                mo50736N2().mo46081X2(false);
                mo50736N2().mo46080W2(true);
                if (mo50732E2(true, true)) {
                    mo50757g3();
                } else {
                    mo50736N2().mo46080W2(false);
                }
            } else {
                super.onClick(view);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo50744Z2((Button) findViewById(R.id.buttonSignUp));
        Button K2 = mo50735K2();
        if (K2 != null) {
            K2.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46199y2() {
        return this.f20532K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h3 */
    public void mo46276h3() {
    }
}
