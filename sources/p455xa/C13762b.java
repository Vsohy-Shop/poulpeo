package p455xa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import java.util.Date;
import p311bd.C10930a;
import p402od.C13063b;
import p455xa.C13766e;

/* renamed from: xa.b */
/* compiled from: MerchantEventSectionGridControllerOld */
public class C13762b extends C13766e {

    /* renamed from: xa.b$a */
    /* compiled from: MerchantEventSectionGridControllerOld */
    public static class C13763a extends C13766e.C13767a {
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: h */
        public final Date f22195h;

        public C13763a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @Nullable String str, long j, @Nullable Date date) {
            super(contextContainer, logoutListener, aVar, cVar, str, j);
            this.f22195h = date;
        }
    }

    public C13762b(@NonNull C13063b bVar, @NonNull C13763a aVar) {
        super(bVar, aVar);
    }

    @NonNull
    /* renamed from: K2 */
    private C13761a m31610K2() {
        return (C13761a) mo50962B2();
    }

    /* renamed from: L2 */
    private boolean m31611L2() {
        if (m31612M2().f22195h == null || m31612M2().f22195h.getTime() <= 0 || new Date().getTime() <= m31612M2().f22195h.getTime()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: M2 */
    private C13763a m31612M2() {
        return (C13763a) this.f16656c;
    }

    /* renamed from: p2 */
    public void mo45813p2() {
        if (m31611L2()) {
            m31610K2().mo46398n1();
        }
        super.mo45813p2();
    }
}
