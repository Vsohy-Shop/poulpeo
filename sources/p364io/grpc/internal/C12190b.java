package p364io.grpc.internal;

import p111h6.C8003j;
import p364io.grpc.C12563n;
import p458xd.C13780c0;

/* renamed from: io.grpc.internal.b */
/* compiled from: AbstractManagedChannelImplBuilder */
public abstract class C12190b<T extends C12563n<T>> extends C12563n<T> {
    protected C12190b() {
    }

    /* renamed from: a */
    public C13780c0 mo49713a() {
        return mo49714c().mo49713a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C12563n<?> mo49714c();

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", mo49714c()).toString();
    }
}
