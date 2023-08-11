package com.google.android.gms.cast.framework.media;

import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.C4648h;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.c0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C4638c0 implements C4648h.C4651c {

    /* renamed from: b */
    private final Status f4665b;
    @Nullable

    /* renamed from: c */
    private final JSONObject f4666c;
    @Nullable

    /* renamed from: d */
    private final MediaError f4667d;

    C4638c0(Status status, @Nullable JSONObject jSONObject, @Nullable MediaError mediaError) {
        this.f4665b = status;
        this.f4666c = jSONObject;
        this.f4667d = mediaError;
    }

    public final Status getStatus() {
        return this.f4665b;
    }
}
