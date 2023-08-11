package p334ed;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: ed.c */
/* compiled from: OverlayTextFragment.kt */
public class C11888c extends C11884a {

    /* renamed from: g */
    private TextView f18572g;

    /* renamed from: h */
    private TextView f18573h;

    /* renamed from: i */
    private String f18574i;

    /* renamed from: j */
    private Integer f18575j;

    /* renamed from: k */
    private String f18576k;

    /* renamed from: l */
    private Integer f18577l;

    /* renamed from: m */
    public Map<Integer, View> f18578m = new LinkedHashMap();

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public final void mo49092N0(Bundle bundle) {
        if (bundle != null) {
            this.f18574i = bundle.getString("messageString");
            Serializable serializable = bundle.getSerializable("messageStringId");
            C12775o.m28637g(serializable, "null cannot be cast to non-null type kotlin.Int");
            this.f18575j = (Integer) serializable;
            Serializable serializable2 = bundle.getSerializable("subMessageStringId");
            C12775o.m28637g(serializable2, "null cannot be cast to non-null type kotlin.Int");
            this.f18577l = (Integer) serializable2;
            this.f18576k = bundle.getString("subMessageString");
        }
    }

    /* renamed from: R0 */
    public C11888c mo49093R0(int i) {
        this.f18575j = Integer.valueOf(i);
        mo49094l2();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public void mo49094l2() {
        boolean z;
        TextView textView = this.f18572g;
        boolean z2 = true;
        if (textView != null) {
            Integer num = this.f18575j;
            if (num != null) {
                C12775o.m28636f(num);
                textView.setText(num.intValue());
            } else {
                String str = this.f18574i;
                if (str == null || C13754v.m31532t(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    textView.setText(this.f18574i);
                } else {
                    textView.setText(R.string.loading);
                }
            }
            textView.setVisibility(0);
        }
        TextView textView2 = this.f18573h;
        if (textView2 != null) {
            Integer num2 = this.f18577l;
            if (num2 != null) {
                C12775o.m28636f(num2);
                textView2.setText(num2.intValue());
                textView2.setVisibility(0);
                return;
            }
            String str2 = this.f18576k;
            if (str2 != null && !C13754v.m31532t(str2)) {
                z2 = false;
            }
            if (!z2) {
                textView2.setText(this.f18576k);
                textView2.setVisibility(0);
                return;
            }
            textView2.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo49092N0(bundle);
        setCancelable(false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.loading_overlay_layout, viewGroup);
        this.f18572g = (TextView) inflate.findViewById(R.id.messageTextView);
        this.f18573h = (TextView) inflate.findViewById(R.id.subMessageTextView);
        mo49094l2();
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C12775o.m28639i(bundle, "bundle");
        super.onSaveInstanceState(bundle);
        bundle.putString("messageString", this.f18574i);
        bundle.putSerializable("messageStringId", this.f18575j);
        bundle.putSerializable("subMessageStringId", this.f18577l);
        bundle.putString("subMessageString", this.f18576k);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        setStyle(2, 16973829);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
