package p455xa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsHome;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11660i;
import p305ad.C10861a;
import p311bd.C10930a;
import p402od.C13063b;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;

/* renamed from: xa.e */
/* compiled from: MerchantSectionGridControllerOld */
public class C13766e extends C13765d {

    /* renamed from: f */
    private boolean f22197f;
    @Nullable

    /* renamed from: g */
    private Float f22198g;

    /* renamed from: xa.e$a */
    /* compiled from: MerchantSectionGridControllerOld */
    public static class C13767a extends C10861a.C10862a {
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: f */
        public final String f22199f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final long f22200g;

        public C13767a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @Nullable String str, long j) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f22199f = str;
            this.f22200g = j;
        }
    }

    public C13766e(@NonNull C13063b bVar, @NonNull C13767a aVar) {
        super(bVar, aVar);
    }

    @NonNull
    /* renamed from: I2 */
    private C13767a m31620I2() {
        return (C13767a) this.f16656c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public void mo50961A2() {
        Float f;
        super.mo50961A2();
        if (this.f22197f && (f = this.f22198g) != null) {
            mo53425J2(f.floatValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public void mo50841D2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2) {
        this.f16652e.cancelAndRemoveAllActions();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsHome.APP_GET_MERCHANTS_BY_TAG, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.SECTION_TAG, m31620I2().f22199f);
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, Integer.valueOf(i));
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, Integer.valueOf(i2));
        proxyBundleInput.addParamValue(PLPMethodParameters.TIMESTAMP, Long.valueOf(m31620I2().f22200g));
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: J2 */
    public void mo53425J2(float f) {
        this.f22197f = true;
        this.f22198g = Float.valueOf(f);
        mo45811n2().mo45952J2(C11660i.class);
        if (mo45811n2().mo45977y2() > 0) {
            int z2 = mo45811n2().mo45978z2();
            for (int i = 0; i < z2; i++) {
                mo45811n2().mo45944A2(new C11660i(f), 0);
            }
            mo50962B2().mo46397m(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45813p2() {
        super.mo45813p2();
        mo50962B2().mo46397m(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        super.mo45819v2();
        if (m31620I2().f22199f != null) {
            C13618g.f21930b.mo53280e(new C13616e(m31620I2().f22199f, C13617f.MERCHANT_LIST));
        }
    }
}
