package p455xa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import p305ad.C10861a;
import p311bd.C10930a;
import p402od.C13063b;

/* renamed from: xa.f */
/* compiled from: MerchantSimilarGridControllerOld */
public class C13768f extends C13765d {

    /* renamed from: xa.f$a */
    /* compiled from: MerchantSimilarGridControllerOld */
    public static class C13769a extends C10861a.C10862a {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final String f22201f;

        public C13769a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull String str) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f22201f = str;
        }
    }

    public C13768f(@NonNull C13063b bVar, @NonNull C13769a aVar) {
        super(bVar, aVar);
    }

    @NonNull
    /* renamed from: I2 */
    private C13769a m31628I2() {
        return (C13769a) this.f16656c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public void mo50841D2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2) {
        this.f16652e.cancelAndRemoveAllActions();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPMerchant.GET_SIMILAR, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(Integer.parseInt(m31628I2().f22201f)));
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, Integer.valueOf(i));
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, Integer.valueOf(i2));
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }
}
