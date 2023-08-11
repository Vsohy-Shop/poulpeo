package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import p014o9.C2075d;
import p463yc.C13867a;
import p463yc.C13871b;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.h */
/* compiled from: MerchantSearchAdapter.kt */
public final class C2024h extends C13871b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2024h(C13867a.C13868a aVar) {
        super(aVar);
        C12775o.m28639i(aVar, "listener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == C13867a.f22581i.mo53577d()) {
            return R.layout.row_merchant_search;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == C13867a.f22581i.mo53577d()) {
            return new C2075d(view, mo53565o());
        }
        return super.mo23226t(view, i);
    }
}
