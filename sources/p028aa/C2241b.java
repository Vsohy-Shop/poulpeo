package p028aa;

import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p258v9.C10056a;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: aa.b */
/* compiled from: ErrorSectionViewHolder.kt */
public final class C2241b extends C14080a {

    /* renamed from: g */
    private final Button f1044g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2241b(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.buttonRetry);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.buttonRetry)");
        this.f1044g = (Button) findViewById;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m1935o2(C2241b bVar, Object obj, View view) {
        C12775o.m28639i(bVar, "this$0");
        C13867a.C13868a M0 = bVar.mo53841M0();
        if (M0 != null) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type com.poulpeo.ui.cms.model.PageErrorModel");
            M0.mo46342E((C10056a) obj);
        }
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        this.f1044g.setOnClickListener(new C2240a(this, obj));
    }
}
