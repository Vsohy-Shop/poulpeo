package p041ba;

import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.utils_common.IListener;
import java.util.List;

/* renamed from: ba.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2950b implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ C2951c f1366a;

    /* renamed from: b */
    public final /* synthetic */ List f1367b;

    /* renamed from: c */
    public final /* synthetic */ IListener f1368c;

    public /* synthetic */ C2950b(C2951c cVar, List list, IListener iListener) {
        this.f1366a = cVar;
        this.f1367b = list;
        this.f1368c = iListener;
    }

    public final void onComplete(BaseCall baseCall) {
        this.f1366a.m2449z2(this.f1367b, this.f1368c, baseCall);
    }
}
