package com.google.android.gms.internal.cast;

import android.content.Context;
import androidx.mediarouter.media.MediaRouter;

/* renamed from: com.google.android.gms.internal.cast.s */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5120s {

    /* renamed from: a */
    private final Context f5517a;

    /* renamed from: b */
    public MediaRouter f5518b;

    C5120s(Context context) {
        this.f5517a = context;
    }

    /* renamed from: a */
    public final MediaRouter mo32994a() {
        if (this.f5518b == null) {
            this.f5518b = MediaRouter.getInstance(this.f5517a);
        }
        return this.f5518b;
    }

    /* renamed from: b */
    public final void mo32995b(MediaRouter.Callback callback) {
        MediaRouter a = mo32994a();
        if (a != null) {
            a.removeCallback(callback);
        }
    }
}
