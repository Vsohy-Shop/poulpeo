package p291y9;

import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.utils_common.IListener;
import java.util.Set;

/* renamed from: y9.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10722e implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ Set f16360a;

    /* renamed from: b */
    public final /* synthetic */ IListener f16361b;

    public /* synthetic */ C10722e(Set set, IListener iListener) {
        this.f16360a = set;
        this.f16361b = iListener;
    }

    public final void onComplete(BaseCall baseCall) {
        C10725h.m22858I2(this.f16360a, this.f16361b, baseCall);
    }
}
