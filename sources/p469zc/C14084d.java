package p469zc;

import android.view.View;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: zc.d */
/* compiled from: LazyLoadingViewHolder.kt */
public final class C14084d extends C14080a {

    /* renamed from: g */
    private final ProgressBar f23009g;

    /* renamed from: h */
    private final boolean f23010h;

    /* renamed from: i */
    private final boolean f23011i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14084d(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.progressbarLoader);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.progressbarLoader)");
        this.f23009g = (ProgressBar) findViewById;
    }

    /* renamed from: R0 */
    public boolean mo23238R0() {
        return this.f23011i;
    }

    /* renamed from: l2 */
    public boolean mo53579l2() {
        return this.f23010h;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        this.f23009g.setEnabled(true);
    }
}
