package p139k3;

import android.content.Context;
import java.io.Closeable;
import p230t3.C9609d;

/* renamed from: k3.u */
/* compiled from: TransportRuntimeComponent */
abstract class C8556u implements Closeable {

    /* renamed from: k3.u$a */
    /* compiled from: TransportRuntimeComponent */
    interface C8557a {
        /* renamed from: a */
        C8557a mo42591a(Context context);

        C8556u build();
    }

    C8556u() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C9609d mo42589a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C8555t mo42590b();

    public void close() {
        mo42589a().close();
    }
}
