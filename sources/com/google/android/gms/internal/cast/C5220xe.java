package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.xe */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5220xe extends C4949hf {
    C5220xe(int i) {
        super(i, (C4932gf) null);
    }

    /* renamed from: a */
    public final void mo32824a() {
        if (!mo32835k()) {
            for (int i = 0; i < mo32825b(); i++) {
                Map.Entry h = mo32833h(i);
                if (((C5218xc) h.getKey()).mo33051x()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo32826c()) {
                if (((C5218xc) entry.getKey()).mo33051x()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo32824a();
    }
}
