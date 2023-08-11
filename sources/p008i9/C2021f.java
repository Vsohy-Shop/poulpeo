package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014o9.C2072b;
import p463yc.C13867a;
import p463yc.C13871b;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.f */
/* compiled from: MerchantCellAdapter.kt */
public class C2021f extends C13871b {

    /* renamed from: t */
    private final int f580t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2021f(C13867a.C13868a aVar, int i, int i2) {
        super(aVar, i2);
        C12775o.m28639i(aVar, "listener");
        this.f580t = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final int mo23227A() {
        return this.f580t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == C13867a.f22581i.mo53577d()) {
            return R.layout.view_cell_merchant;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i != C13867a.f22581i.mo53577d()) {
            return super.mo23226t(view, i);
        }
        return new C2072b(view, mo53565o(), this.f580t, false, false, 24, (DefaultConstructorMarker) null);
    }
}
