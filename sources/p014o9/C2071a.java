package p014o9;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p360id.C12139g;
import p457xc.C13771a;
import p457xc.C13772b;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: o9.a */
/* compiled from: MerchantActionCellViewHolderOld.kt */
public final class C2071a extends C2072b implements C13772b {

    /* renamed from: l */
    private final C13771a<BaseMerchant> f699l;

    /* renamed from: m */
    private final ImageView f700m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2071a(View view, C13867a.C13868a aVar, int i, C13771a aVar2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, aVar, i, aVar2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        super.mo23234m2(aVar, obj);
        this.f700m.setActivated(this.f699l.mo53433h(mo23258q2()));
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (!C12139g.m26473b(this.f700m)) {
            super.onClick(view);
        } else if (this.f699l.mo53428c() || view == this.f700m) {
            ImageView imageView = this.f700m;
            imageView.setActivated(!imageView.isActivated());
            if (this.f700m.isActivated()) {
                this.f699l.mo53427b(mo23258q2());
            } else if (this.f699l.mo53433h(mo23258q2())) {
                this.f699l.mo53434i(mo23258q2());
            }
            super.onClick(view);
        }
    }

    /* renamed from: v */
    public void mo23257v(boolean z) {
        C12139g.m26475d(this.f700m, z, 0, 2, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2071a(View view, C13867a.C13868a aVar, int i, C13771a<BaseMerchant> aVar2, boolean z, boolean z2) {
        super(view, aVar, i, z, z2);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(aVar2, "actionCellManager");
        this.f699l = aVar2;
        View findViewById = view.findViewById(R.id.actionView);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.actionView)");
        ImageView imageView = (ImageView) findViewById;
        this.f700m = imageView;
        aVar2.mo53426a(this);
        imageView.setOnClickListener(this);
        imageView.setImageDrawable(aVar2.mo53430e().mo53216a(mo53840J0()));
        C12139g.m26475d(imageView, aVar2.mo53429d(), 0, 2, (Object) null);
    }
}
