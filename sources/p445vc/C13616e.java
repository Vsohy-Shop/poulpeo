package p445vc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;

/* renamed from: vc.e */
/* compiled from: GTMScreenEventRMN */
public class C13616e extends C13615d {
    public C13616e(@NonNull String str, @NonNull C13617f fVar) {
        super(str, fVar);
    }

    @NonNull
    /* renamed from: h */
    private C13616e m31070h(String str, @Nullable String str2, @NonNull C13613b bVar, @NonNull C13614c cVar) {
        mo53271b(C13612a.OFFER_ID, str);
        if (str2 != null) {
            mo53271b(C13612a.OFFER_TITLE, str2);
        }
        mo53271b(C13612a.FAMILY_OFFER, bVar.f21892b);
        mo53271b(C13612a.SUB_FAMILY_OFFER, cVar.f21905b);
        return this;
    }

    @NonNull
    @Deprecated
    /* renamed from: d */
    public C13616e mo53273d(int i, @Nullable String str) {
        mo53270a(C13612a.MERCHANT_ID, i);
        if (str != null) {
            mo53271b(C13612a.MERCHANT_NAME, str);
        }
        return this;
    }

    @NonNull
    /* renamed from: e */
    public C13616e mo53274e(@Nullable Merchant merchant) {
        if (merchant == null) {
            return this;
        }
        return mo53273d(Integer.parseInt(merchant.f18063id), merchant.name);
    }

    @NonNull
    /* renamed from: f */
    public C13616e mo53275f(String str, @Nullable String str2) {
        mo53271b(C13612a.MERCHANT_ID, str);
        if (str2 != null) {
            mo53271b(C13612a.MERCHANT_NAME, str2);
        }
        return this;
    }

    @NonNull
    /* renamed from: g */
    public C13616e mo53276g(@Nullable Offer offer) {
        if (offer == null) {
            return this;
        }
        return mo53274e(offer.getMerchant()).m31070h(offer.f18063id, offer.title, C13613b.m31065a(offer), C13614c.m31066a(offer));
    }
}
