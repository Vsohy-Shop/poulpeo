package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p016q9.C2085a;
import p016q9.C2086b;
import p432tb.C13485e;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.k */
/* compiled from: ReviewMerchantListAdapter.kt */
public final class C2030k extends C13867a {

    /* renamed from: s */
    public static final C2031a f595s = new C2031a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private static final int f596t = 10;

    /* renamed from: i9.k$a */
    /* compiled from: ReviewMerchantListAdapter.kt */
    public static final class C2031a {
        private C2031a() {
        }

        public /* synthetic */ C2031a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2030k(C13867a.C13868a aVar) {
        super(aVar, 0, 2, (DefaultConstructorMarker) null);
        C12775o.m28639i(aVar, "listener");
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != C13867a.f22581i.mo53577d() || !(getItem(i) instanceof C13485e)) {
            return itemViewType;
        }
        return f596t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == C13867a.f22581i.mo53577d()) {
            return R.layout.row_review_merchant;
        }
        if (i == f596t) {
            return R.layout.row_review_merchant_header;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == C13867a.f22581i.mo53577d()) {
            return new C2086b(view, mo53565o());
        }
        if (i == f596t) {
            return new C2085a(view, mo53565o());
        }
        return super.mo23226t(view, i);
    }
}
