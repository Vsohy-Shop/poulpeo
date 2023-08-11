package com.rmn.apiclient.core.data_access.base.call;

/* renamed from: com.rmn.apiclient.core.data_access.base.call.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11587a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ BaseCall f18031b;

    public /* synthetic */ C11587a(BaseCall baseCall) {
        this.f18031b = baseCall;
    }

    public final void run() {
        this.f18031b.notifyListeners();
    }
}
