package p010k9;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p009j9.C2036a;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: k9.a */
/* compiled from: ListErrorViewHolder.kt */
public final class C2039a extends C14080a {

    /* renamed from: g */
    private final TextView f609g;

    /* renamed from: h */
    private final TextView f610h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2039a(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewTitle)");
        this.f609g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewMessage);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.textViewMessage)");
        this.f610h = (TextView) findViewById2;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C2036a aVar2 = (C2036a) obj;
        TextView textView = this.f609g;
        C12775o.m28636f(aVar2);
        textView.setText(aVar2.mo23229b().f18146a);
        if (aVar2.mo23228a() == null) {
            this.f610h.setVisibility(8);
            return;
        }
        this.f610h.setVisibility(0);
        this.f610h.setText(aVar2.mo23228a().f18146a);
    }
}
