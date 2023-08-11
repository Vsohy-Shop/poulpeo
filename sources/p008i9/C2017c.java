package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.api.p322v2.poulpeo.model.EarningEvent;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p009j9.C2036a;
import p010k9.C2039a;
import p012m9.C2057c;
import p012m9.C2061f;
import p012m9.C2062g;
import p012m9.C2065j;
import p432tb.C13477a;
import p463yc.C13867a;
import p463yc.C13873c;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.c */
/* compiled from: EarningsAdapter.kt */
public final class C2017c extends C13873c {
    @Deprecated

    /* renamed from: A */
    private static final int f572A = 102;
    @Deprecated

    /* renamed from: B */
    private static final int f573B = 103;

    /* renamed from: w */
    private static final C2018a f574w = new C2018a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f575x = 8;
    @Deprecated

    /* renamed from: y */
    private static final int f576y = 100;
    @Deprecated

    /* renamed from: z */
    private static final int f577z = 101;

    /* renamed from: v */
    private final C13477a f578v;

    /* renamed from: i9.c$a */
    /* compiled from: EarningsAdapter.kt */
    private static final class C2018a {
        private C2018a() {
        }

        public /* synthetic */ C2018a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2017c(C13867a.C13868a aVar, C13477a aVar2) {
        super(aVar);
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(aVar2, "controller");
        this.f578v = aVar2;
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType == C13867a.f22581i.mo53577d()) {
            Object item = getItem(i);
            if (item instanceof EarningAmount) {
                return f576y;
            }
            if (item instanceof EarningEvent) {
                return f577z;
            }
            if (item instanceof ResourceStringWrapper) {
                return f572A;
            }
            if (item instanceof C2036a) {
                return f573B;
            }
        }
        return itemViewType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == f576y) {
            return R.layout.row_earnings_amount;
        }
        if (i == C13873c.f22606t.mo53580a()) {
            return R.layout.row_earnings_group;
        }
        if (i == f577z) {
            return R.layout.row_earnings_event;
        }
        if (i == f572A) {
            return R.layout.row_earnings_header;
        }
        if (i == f573B) {
            return R.layout.row_list_error;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == f576y) {
            return new C2057c(view, mo53565o());
        }
        if (i == C13873c.f22606t.mo53580a()) {
            return new C2062g(view, mo53565o(), this.f578v);
        }
        if (i == f577z) {
            return new C2061f(view, mo53565o());
        }
        if (i == f572A) {
            return new C2065j(view, mo53565o());
        }
        if (i == f573B) {
            return new C2039a(view, mo53565o());
        }
        return super.mo23226t(view, i);
    }
}
