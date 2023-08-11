package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ma */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5861ma extends C5973ta {
    C5861ma(int i) {
        super(i, (C5861ma) null);
    }

    /* renamed from: a */
    public final void mo34188a() {
        if (!mo34450k()) {
            for (int i = 0; i < mo34440b(); i++) {
                Map.Entry h = mo34448h(i);
                if (((C5859m8) h.getKey()).mo34177x()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo34441c()) {
                if (((C5859m8) entry.getKey()).mo34177x()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo34188a();
    }
}
