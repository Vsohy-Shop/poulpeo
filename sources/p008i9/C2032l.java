package p008i9;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.SponsorshipEvent;
import com.rmn.apiclient.impl.api.models.Campaign;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p009j9.C2036a;
import p009j9.C2037b;
import p010k9.C2039a;
import p011l9.C2042c;
import p011l9.C2044e;
import p011l9.C2046f;
import p011l9.C2047g;
import p373kb.C12650e;
import p432tb.C13477a;
import p463yc.C13867a;
import p463yc.C13873c;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: i9.l */
/* compiled from: SponsorshipAdapter.kt */
public final class C2032l extends C13873c {

    /* renamed from: y */
    public static final C2033a f597y = new C2033a((DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final int f598z = 8;

    /* renamed from: v */
    private final C13477a f599v;

    /* renamed from: w */
    private final boolean f600w;

    /* renamed from: x */
    private final C12650e f601x;

    /* renamed from: i9.l$a */
    /* compiled from: SponsorshipAdapter.kt */
    public static final class C2033a {
        private C2033a() {
        }

        public /* synthetic */ C2033a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2032l(C13867a.C13868a aVar, C13477a aVar2, boolean z, C12650e eVar) {
        super(aVar);
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(aVar2, "controller");
        C12775o.m28639i(eVar, "sponsorshipControllerListener");
        this.f599v = aVar2;
        this.f600w = z;
        this.f601x = eVar;
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        if (itemViewType == C13867a.f22581i.mo53577d()) {
            Object item = getItem(i);
            if (item instanceof C2037b) {
                return 100;
            }
            if (item instanceof SponsorshipEvent) {
                return 101;
            }
            if (item instanceof C2036a) {
                return 102;
            }
            if (item instanceof Campaign) {
                return 103;
            }
        }
        return itemViewType;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo23225p(int i) {
        if (i == 100) {
            return R.layout.row_sponsorship_header;
        }
        if (i == C13873c.f22606t.mo53580a()) {
            return R.layout.row_sponsored_user;
        }
        if (i == 101) {
            return R.layout.row_sponsorship_event;
        }
        if (i == 102) {
            return R.layout.row_list_error_sponsorship;
        }
        if (i == 103) {
            return R.layout.row_sponsorship_campaign;
        }
        return super.mo23225p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C14080a mo23226t(View view, int i) {
        C12775o.m28639i(view, "itemView");
        if (i == 100) {
            return new C2047g(view, mo53565o(), this.f600w);
        }
        if (i == C13873c.f22606t.mo53580a()) {
            return new C2042c(view, mo53565o(), this.f599v);
        }
        if (i == 101) {
            return new C2046f(view, mo53565o());
        }
        if (i == 102) {
            return new C2039a(view, mo53565o());
        }
        if (i == 103) {
            return new C2044e(view, mo53565o(), this.f601x);
        }
        return super.mo23226t(view, i);
    }
}
