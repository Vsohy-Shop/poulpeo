package p469zc;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.p324ui.views.listview.C11660i;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: zc.e */
/* compiled from: SpacingViewHolder.kt */
public final class C14085e extends C14080a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14085e(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.ui.views.listview.SpacingElement");
        this.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) TypedValue.applyDimension(1, ((C11660i) obj).f18132a, mo53843t0().getResources().getDisplayMetrics())));
    }
}
