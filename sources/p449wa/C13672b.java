package p449wa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import p305ad.C10861a;
import p311bd.C10930a;
import p396nd.C12998a;

/* renamed from: wa.b */
/* compiled from: BaseMerchantGridController */
public abstract class C13672b extends C12998a {
    @NonNull

    /* renamed from: f */
    protected final CallManager f22020f = new CallManager(mo45820l2());

    /* renamed from: wa.b$a */
    /* compiled from: BaseMerchantGridController */
    public static class C13673a extends C10861a.C10862a {
        public C13673a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar) {
            super(contextContainer, logoutListener, aVar, cVar);
        }
    }

    public C13672b(@NonNull C13680h hVar, @NonNull C13673a aVar) {
        super(hVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45813p2() {
        super.mo45813p2();
        mo53345y2().mo46389m(false);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: y2 */
    public C13680h mo53345y2() {
        return (C13680h) this.f16655b;
    }
}
