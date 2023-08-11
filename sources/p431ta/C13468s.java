package p431ta;

import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnFailureListener;

/* renamed from: ta.s */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13468s implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ C13470u f21606a;

    /* renamed from: b */
    public final /* synthetic */ int f21607b;

    public /* synthetic */ C13468s(C13470u uVar, int i) {
        this.f21606a = uVar;
        this.f21607b = i;
    }

    public final void onFailure(CallException callException) {
        this.f21606a.m30648E2(this.f21607b, callException);
    }
}
