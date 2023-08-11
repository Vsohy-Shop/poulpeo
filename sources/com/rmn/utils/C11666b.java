package com.rmn.utils;

import android.content.Context;
import com.rmn.utils_common.IListener;

/* renamed from: com.rmn.utils.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11666b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f18161b;

    /* renamed from: c */
    public final /* synthetic */ IListener f18162c;

    public /* synthetic */ C11666b(Context context, IListener iListener) {
        this.f18161b = context;
        this.f18162c = iListener;
    }

    public final void run() {
        AndroidUtil.lambda$retrieveAdvertisingInfoAsync$1(this.f18161b, this.f18162c);
    }
}
