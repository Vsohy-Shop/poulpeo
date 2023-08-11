package p469zc;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.p324ui.views.listview.C11657f;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: zc.c */
/* compiled from: HeaderViewHolder.kt */
public final class C14083c extends C14080a {

    /* renamed from: g */
    private final TextView f23008g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14083c(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.titleHeader);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.titleHeader)");
        this.f23008g = (TextView) findViewById;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        TextView textView = this.f23008g;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.ui.views.listview.HeaderElement");
        textView.setText(((C11657f) obj).f18131a);
    }
}
