package p449wa;

import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.utils_common.IListener;
import java.util.List;

/* renamed from: wa.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13677f implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ C13678g f22024a;

    /* renamed from: b */
    public final /* synthetic */ List f22025b;

    /* renamed from: c */
    public final /* synthetic */ IListener f22026c;

    public /* synthetic */ C13677f(C13678g gVar, List list, IListener iListener) {
        this.f22024a = gVar;
        this.f22025b = list;
        this.f22026c = iListener;
    }

    public final void onComplete(BaseCall baseCall) {
        this.f22024a.m31317H2(this.f22025b, this.f22026c, baseCall);
    }
}
