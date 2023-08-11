package p190p4;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import p200q4.C9238l;
import p231t4.C9713p;

/* renamed from: p4.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9054c {
    @NonNull
    /* renamed from: a */
    public static <R extends C9056e> C9052b<R> m18392a(@NonNull R r, @NonNull C4733c cVar) {
        C9713p.m20276k(r, "Result must not be null");
        C9713p.m20267b(!r.getStatus().mo32381I(), "Status code must not be SUCCESS");
        C9060i iVar = new C9060i(cVar, r);
        iVar.mo32442j(r);
        return iVar;
    }

    @NonNull
    /* renamed from: b */
    public static C9052b<Status> m18393b(@NonNull Status status, @NonNull C4733c cVar) {
        C9713p.m20276k(status, "Result must not be null");
        C9238l lVar = new C9238l(cVar);
        lVar.mo32442j(status);
        return lVar;
    }
}
