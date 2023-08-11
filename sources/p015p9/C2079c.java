package p015p9;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: p9.c */
/* compiled from: NoContentViewHolder.kt */
public final class C2079c extends C14080a {

    /* renamed from: g */
    private final TextView f723g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2079c(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewTitle)");
        this.f723g = (TextView) findViewById;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        TextView textView = this.f723g;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.ui.wrappers.ResourceStringWrapper");
        textView.setText(((ResourceStringWrapper) obj).mo47912a(mo53840J0()));
    }
}
