package androidx.core.location;

import android.location.Location;
import java.util.function.Consumer;

/* renamed from: androidx.core.location.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1658u implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ androidx.core.util.Consumer f508b;

    public /* synthetic */ C1658u(androidx.core.util.Consumer consumer) {
        this.f508b = consumer;
    }

    public final void accept(Object obj) {
        this.f508b.accept((Location) obj);
    }
}
