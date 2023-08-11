package p368jd;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import kotlin.jvm.internal.C12775o;
import p327dc.C11801a;

/* renamed from: jd.a */
/* compiled from: AppBarFragment.kt */
public abstract class C12615a extends C12619e {
    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public final ActionBar mo50352m2() {
        ActionBar supportActionBar = mo50355M0().getSupportActionBar();
        C12775o.m28636f(supportActionBar);
        return supportActionBar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public final Toolbar mo50353n2() {
        View view = getView();
        if (view != null) {
            return (Toolbar) view.findViewById(C11801a.toolBar);
        }
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        mo50355M0().setSupportActionBar(mo50353n2());
    }
}
