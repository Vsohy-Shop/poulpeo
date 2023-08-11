package p303ab;

import android.view.View;
import com.poulpeo.p321ui.screens.offer.OfferActivity;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;

/* renamed from: ab.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10854c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Offer f16641b;

    /* renamed from: c */
    public final /* synthetic */ Merchant f16642c;

    /* renamed from: d */
    public final /* synthetic */ OfferActivity f16643d;

    public /* synthetic */ C10854c(Offer offer, Merchant merchant, OfferActivity offerActivity) {
        this.f16641b = offer;
        this.f16642c = merchant;
        this.f16643d = offerActivity;
    }

    public final void onClick(View view) {
        OfferActivity.m24556L2(this.f16641b, this.f16642c, this.f16643d, view);
    }
}
