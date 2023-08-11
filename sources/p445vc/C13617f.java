package p445vc;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;

/* renamed from: vc.f */
/* compiled from: GTMScreenType */
public enum C13617f {
    ONBOARDING("onboarding"),
    LOGIN("login"),
    SIGN_UP("signup"),
    CONSENT("consent"),
    WELCOME_POT("welcome-pot"),
    AGREEMENT("agreement"),
    HOME("home"),
    PAGE(APIResourceDescriptors.RESOURCE_TYPE_PAGE),
    INSTORE_CASHBACK("instore-cashback"),
    MERCHANT_LIST("merchant-list"),
    MERCHANT("merchant"),
    OFFER(APIResourceDescriptors.RESOURCE_TYPE_OFFER),
    POULPEO_PLUS("poulpeo-plus"),
    REVIEWS("reviews"),
    REVIEW_FORM("review-form"),
    PURCHASE("purchase"),
    VIDEO("video"),
    POT("pot"),
    PROFILE("profile");
    
    @NonNull

    /* renamed from: b */
    public final String f21929b;

    private C13617f(@NonNull String str) {
        this.f21929b = str;
    }
}
