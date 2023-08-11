package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: androidx.core.location.n */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1644n implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Consumer f503b;

    /* renamed from: c */
    public final /* synthetic */ Location f504c;

    public /* synthetic */ C1644n(Consumer consumer, Location location) {
        this.f503b = consumer;
        this.f504c = location;
    }

    public final void run() {
        this.f503b.accept(this.f504c);
    }
}
