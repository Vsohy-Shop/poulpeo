package p291y9;

import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.utils_common.IListener;
import java.util.Set;

/* renamed from: y9.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10724g implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ Set f16364a;

    /* renamed from: b */
    public final /* synthetic */ IListener f16365b;

    public /* synthetic */ C10724g(Set set, IListener iListener) {
        this.f16364a = set;
        this.f16365b = iListener;
    }

    public final void onComplete(BaseCall baseCall) {
        C10725h.m22859J2(this.f16364a, this.f16365b, baseCall);
    }
}
