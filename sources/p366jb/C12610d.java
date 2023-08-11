package p366jb;

import android.os.Handler;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.utils.AndroidUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p368jd.C12616b;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: jb.d */
/* compiled from: SendDataActivity.kt */
public abstract class C12610d extends C12616b implements C12611e {

    /* renamed from: m */
    private EditText f20241m;

    /* renamed from: n */
    public Map<Integer, View> f20242n = new LinkedHashMap();

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m27971F2(C12610d dVar) {
        C12775o.m28639i(dVar, "this$0");
        int i = C13865f.imageButtonSubmit;
        ((ImageButton) dVar.mo46191D2(i)).setEnabled(true);
        EditText editText = dVar.f20241m;
        if (editText != null) {
            editText.setEnabled(true);
        }
        Toolbar z2 = dVar.mo50354z2();
        if (z2 != null) {
            z2.setVisibility(8);
        }
        ((ImageButton) dVar.mo46191D2(i)).setVisibility(8);
        ViewParent parent = ((ImageButton) dVar.mo46191D2(i)).getParent();
        C12775o.m28637g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        TransitionManager.beginDelayedTransition((ViewGroup) parent);
        int i2 = C13865f.viewOverlay;
        ViewGroup.LayoutParams layoutParams = dVar.mo46191D2(i2).getLayoutParams();
        C12775o.m28637g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        int dimensionPixelOffset = dVar.getResources().getDimensionPixelOffset(R.dimen.send_data_overlay_animation_negative_margin);
        layoutParams2.setMargins(dimensionPixelOffset, dimensionPixelOffset, 0, 0);
        dVar.mo46191D2(i2).setLayoutParams(layoutParams2);
        ((RelativeLayout) dVar.mo46191D2(C13865f.layoutCommentLoading)).setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m27972J2(C12610d dVar) {
        C12775o.m28639i(dVar, "this$0");
        dVar.mo50334E2();
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m27973K2(C12610d dVar) {
        C12775o.m28639i(dVar, "this$0");
        dVar.finish();
    }

    /* renamed from: D2 */
    public View mo46191D2(int i) {
        Map<Integer, View> map = this.f20242n;
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
    /* renamed from: E2 */
    public final void mo50334E2() {
        int i = C13865f.imageButtonSubmit;
        ViewParent parent = ((ImageButton) mo46191D2(i)).getParent();
        C12775o.m28637g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        TransitionManager.beginDelayedTransition((ViewGroup) parent);
        Toolbar z2 = mo50354z2();
        if (z2 != null) {
            z2.setVisibility(0);
        }
        ((ImageButton) mo46191D2(i)).setVisibility(0);
        int i2 = C13865f.viewOverlay;
        ViewGroup.LayoutParams layoutParams = mo46191D2(i2).getLayoutParams();
        C12775o.m28637g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = 0;
        layoutParams2.width = 0;
        layoutParams2.setMargins(0, 0, 0, 0);
        mo46191D2(i2).setLayoutParams(layoutParams2);
        ((RelativeLayout) mo46191D2(C13865f.layoutCommentLoading)).setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public abstract int mo46192G2();

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public abstract int mo46193H2();

    /* renamed from: I0 */
    public void mo50335I0() {
        AndroidUtil.hideSoftKeyboard(this, true);
        ((ImageButton) mo46191D2(C13865f.imageButtonSubmit)).setEnabled(false);
        EditText editText = this.f20241m;
        if (editText != null) {
            editText.setEnabled(false);
        }
        new Handler().postDelayed(new C12607a(this), 400);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public abstract int mo46194I2();

    /* access modifiers changed from: protected */
    /* renamed from: L2 */
    public final void mo50336L2(EditText editText) {
        this.f20241m = editText;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public final void mo50337M2() {
        int i = C13865f.layoutSendResult;
        ViewParent parent = ((LinearLayout) mo46191D2(i)).getParent();
        C12775o.m28637g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        TransitionManager.beginDelayedTransition((ViewGroup) parent);
        ((ProgressBar) mo46191D2(C13865f.progress)).setVisibility(8);
        ((TextView) mo46191D2(C13865f.textViewCancel)).setVisibility(8);
        ((LinearLayout) mo46191D2(i)).setVisibility(0);
    }

    /* renamed from: W0 */
    public void mo50338W0(String str) {
        C12775o.m28639i(str, "errorMessage");
        ((TextView) mo46191D2(C13865f.textViewSendResultTitle)).setText(getString(mo46192G2()));
        ((TextView) mo46191D2(C13865f.textViewSendResultSubtitle)).setText(str);
        mo50337M2();
        new Handler().postDelayed(new C12609c(this), (long) getResources().getInteger(R.integer.send_data_action_delay));
    }

    /* renamed from: r0 */
    public void mo46480r0() {
        ((TextView) mo46191D2(C13865f.textViewSendResultTitle)).setText(getString(mo46194I2()));
        ((TextView) mo46191D2(C13865f.textViewSendResultSubtitle)).setText(getString(mo46193H2()));
        mo50337M2();
        new Handler().postDelayed(new C12608b(this), (long) getResources().getInteger(R.integer.send_data_action_delay));
    }
}
