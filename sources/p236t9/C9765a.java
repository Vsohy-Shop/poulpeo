package p236t9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: t9.a */
/* compiled from: BaseCellViewHolder.kt */
public abstract class C9765a extends C14080a {

    /* renamed from: g */
    private final boolean f14575g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9765a(View view, C13867a.C13868a aVar, boolean z) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        this.f14575g = z;
    }

    /* renamed from: n2 */
    public final void mo44287n2() {
        int i;
        int dimensionPixelOffset = mo53843t0().getResources().getDimensionPixelOffset(R.dimen.grid_cell_spacing);
        if (this.f14575g) {
            i = dimensionPixelOffset;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).setMargins(dimensionPixelOffset, dimensionPixelOffset, i, dimensionPixelOffset);
            this.itemView.setLayoutParams(layoutParams);
        } else if (layoutParams instanceof GridLayoutManager.LayoutParams) {
            ((GridLayoutManager.LayoutParams) layoutParams).setMargins(dimensionPixelOffset, dimensionPixelOffset, i, dimensionPixelOffset);
            this.itemView.setLayoutParams(layoutParams);
        }
    }
}
