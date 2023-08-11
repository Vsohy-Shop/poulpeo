package p200q4;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Map;
import java.util.Set;
import p276x5.C10406g;

/* renamed from: q4.g0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9229g0 {

    /* renamed from: a */
    private final ArrayMap<C9218b<?>, ConnectionResult> f13566a;

    /* renamed from: b */
    private final ArrayMap<C9218b<?>, String> f13567b;

    /* renamed from: c */
    private final C10406g<Map<C9218b<?>, String>> f13568c;

    /* renamed from: d */
    private int f13569d;

    /* renamed from: e */
    private boolean f13570e;

    /* renamed from: a */
    public final Set<C9218b<?>> mo43527a() {
        return this.f13566a.keySet();
    }

    /* renamed from: b */
    public final void mo43528b(C9218b<?> bVar, ConnectionResult connectionResult, @Nullable String str) {
        this.f13566a.put(bVar, connectionResult);
        this.f13567b.put(bVar, str);
        this.f13569d--;
        if (!connectionResult.mo32338I()) {
            this.f13570e = true;
        }
        if (this.f13569d != 0) {
            return;
        }
        if (this.f13570e) {
            this.f13568c.mo45097b(new AvailabilityException(this.f13566a));
            return;
        }
        this.f13568c.mo45098c(this.f13567b);
    }
}
