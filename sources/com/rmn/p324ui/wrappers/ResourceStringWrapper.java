package com.rmn.p324ui.wrappers;

import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: com.rmn.ui.wrappers.ResourceStringWrapper */
public class ResourceStringWrapper {

    /* renamed from: a */
    public int f18146a;

    public ResourceStringWrapper() {
    }

    /* renamed from: a */
    public String mo47912a(ContextContainer contextContainer) {
        return contextContainer.mo47843a().getResources().getString(this.f18146a);
    }

    /* renamed from: b */
    public String mo47913b(ContextContainer contextContainer, Object... objArr) {
        return contextContainer.mo47843a().getResources().getString(this.f18146a, objArr);
    }

    public ResourceStringWrapper(int i) {
        this.f18146a = i;
    }
}
