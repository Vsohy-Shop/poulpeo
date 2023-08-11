package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p011l9.C2041b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.b */
/* compiled from: CountryAdapter.kt */
public final class C2016b extends C13867a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2016b(C13867a.C13868a aVar) {
        super(aVar, 0, 2, (DefaultConstructorMarker) null);
        C12775o.m28639i(aVar, "listener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == C13867a.f22581i.mo53577d()) {
            return R.layout.row_country;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == C13867a.f22581i.mo53577d()) {
            return new C2041b(view, mo53565o());
        }
        return super.mo23226t(view, i);
    }
}
