package p102g9;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.iosadapters.android.content.ContextContainer;
import p401oc.C13059a;
import p415qc.C13240e;
import p415qc.C13242g;
import p446vd.C13633n;

/* renamed from: g9.a */
/* compiled from: PLPTrackableScreenController */
public class C7832a extends C13059a {
    public C7832a(@NonNull String str, boolean z) {
        super(str, z);
    }

    /* renamed from: e */
    public void mo41538e(@NonNull ContextContainer contextContainer, @Nullable Offer offer) {
        String str;
        if (TextUtils.isEmpty(this.f20871a)) {
            C13633n.m31166v("WARNING trackPageViewWithCoupon : trackingScreenName is null");
            return;
        }
        C13240e eVar = new C13240e(contextContainer);
        if (offer != null) {
            eVar.mo52888c(C13242g.f21097i, offer.merchantRelationship.f18064id);
            Merchant merchant = offer.getMerchant();
            if (merchant != null) {
                str = merchant.name;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.mo52888c(C13242g.f21098j, str);
            }
            eVar.mo52888c(C13242g.f21101m, offer.f18063id);
            String str2 = offer.title;
            if (!TextUtils.isEmpty(str2)) {
                eVar.mo52888c(C13242g.f21102n, str2);
            }
        }
        C13059a.m29454c(eVar, this.f20871a);
    }

    /* renamed from: f */
    public void mo41539f(@NonNull ContextContainer contextContainer, @Nullable Merchant merchant) {
        String str;
        String str2;
        if (merchant != null) {
            str2 = merchant.f18063id;
            str = merchant.name;
        } else {
            str2 = null;
            str = null;
        }
        mo41540g(contextContainer, str2, str);
    }

    /* renamed from: g */
    public void mo41540g(@NonNull ContextContainer contextContainer, @Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(this.f20871a)) {
            C13633n.m31166v("WARNING trackPageViewWithMerchant : self.trackingScreenName is null");
            return;
        }
        C13240e eVar = new C13240e(contextContainer);
        if (!TextUtils.isEmpty(str)) {
            eVar.mo52888c(C13242g.f21097i, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            eVar.mo52888c(C13242g.f21098j, str2);
        }
        C13059a.m29454c(eVar, this.f20871a);
    }

    /* renamed from: h */
    public void mo41541h(ContextContainer contextContainer, String str) {
        if (TextUtils.isEmpty(this.f20871a)) {
            C13633n.m31166v("WARNING trackPageViewWithUrl : trackingScreenName is null");
        } else if (TextUtils.isEmpty(str)) {
            C13059a.m29453b(contextContainer, this.f20871a);
        } else {
            C13240e eVar = new C13240e(contextContainer);
            C13059a.m29454c(eVar, this.f20871a + ":" + str);
        }
    }
}
