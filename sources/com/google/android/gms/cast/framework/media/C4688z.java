package com.google.android.gms.cast.framework.media;

import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;
import p150l4.C8707r;
import p150l4.C8712u;

/* renamed from: com.google.android.gms.cast.framework.media.z */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C4688z implements C8712u {

    /* renamed from: a */
    final /* synthetic */ C4636b0 f4800a;

    C4688z(C4636b0 b0Var) {
        this.f4800a = b0Var;
    }

    /* renamed from: a */
    public final void mo32238a(long j) {
        try {
            C4636b0 b0Var = this.f4800a;
            b0Var.mo32442j(new C4634a0(b0Var, new Status(2103)));
        } catch (IllegalStateException e) {
            C4648h.f4728m.mo42757d(e, "Result already set when calling onRequestReplaced", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo32239b(long j, int i, @Nullable Object obj) {
        JSONObject jSONObject;
        MediaError mediaError = null;
        if (true != (obj instanceof C8707r)) {
            obj = null;
        }
        try {
            C4636b0 b0Var = this.f4800a;
            Status status = new Status(i);
            if (obj != null) {
                jSONObject = ((C8707r) obj).f12491a;
            } else {
                jSONObject = null;
            }
            if (obj != null) {
                mediaError = ((C8707r) obj).f12492b;
            }
            b0Var.mo32442j(new C4638c0(status, jSONObject, mediaError));
        } catch (IllegalStateException e) {
            C4648h.f4728m.mo42757d(e, "Result already set when calling onRequestCompleted", new Object[0]);
        }
    }
}
