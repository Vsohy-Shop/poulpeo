package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ef */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5731ef extends C5800j {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5697cf f6929d;

    public C5731ef(C5697cf cfVar) {
        super("internal.logger");
        this.f6929d = cfVar;
        this.f7018c.put("log", new C5714df(this, false, true));
        this.f7018c.put(NotificationCompat.GROUP_KEY_SILENT, new C6056yd(this, NotificationCompat.GROUP_KEY_SILENT));
        ((C5800j) this.f7018c.get(NotificationCompat.GROUP_KEY_SILENT)).mo33963k("log", new C5714df(this, true, true));
        this.f7018c.put("unmonitored", new C6073ze(this, "unmonitored"));
        ((C5800j) this.f7018c.get("unmonitored")).mo33963k("log", new C5714df(this, false, false));
    }

    /* renamed from: a */
    public final C5914q mo33875a(C6015w4 w4Var, List<C5914q> list) {
        return C5914q.f7289O;
    }
}
