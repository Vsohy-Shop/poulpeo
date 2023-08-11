package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p009j9.C2036a;
import p009j9.C2038c;
import p010k9.C2039a;
import p017r9.C2089c;
import p017r9.C2091e;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.m */
/* compiled from: SupportTicketListAdapter.kt */
public final class C2034m extends C13867a {

    /* renamed from: s */
    public static final C2035a f602s = new C2035a((DefaultConstructorMarker) null);

    /* renamed from: i9.m$a */
    /* compiled from: SupportTicketListAdapter.kt */
    public static final class C2035a {
        private C2035a() {
        }

        public /* synthetic */ C2035a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2034m(C13867a.C13868a aVar) {
        super(aVar, 0, 2, (DefaultConstructorMarker) null);
        C12775o.m28639i(aVar, "listener");
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType == C13867a.f22581i.mo53577d()) {
            Object item = getItem(i);
            if (item instanceof C2038c) {
                return 10;
            }
            if (item instanceof C2036a) {
                return 11;
            }
        }
        return itemViewType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == C13867a.f22581i.mo53577d()) {
            return R.layout.row_support_ticket;
        }
        if (i == 10) {
            return R.layout.row_support_ticket_header;
        }
        if (i == 11) {
            return R.layout.row_list_error_support_ticket;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == C13867a.f22581i.mo53577d()) {
            return new C2091e(view, mo53565o());
        }
        if (i == 10) {
            return new C2089c(view, mo53565o());
        }
        if (i == 11) {
            return new C2039a(view, mo53565o());
        }
        return super.mo23226t(view, i);
    }
}
