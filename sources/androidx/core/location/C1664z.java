package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* renamed from: androidx.core.location.z */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1664z implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Consumer f510b;

    /* renamed from: c */
    public final /* synthetic */ Location f511c;

    public /* synthetic */ C1664z(Consumer consumer, Location location) {
        this.f510b = consumer;
        this.f511c = location;
    }

    public final void run() {
        this.f510b.accept(this.f511c);
    }
}
