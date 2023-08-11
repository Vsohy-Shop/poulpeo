package p231t4;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p190p4.C9052b;
import p231t4.C9709o;
import p276x5.C10406g;

/* renamed from: t4.k0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C9697k0 implements C9052b.C9053a {

    /* renamed from: a */
    final /* synthetic */ C9052b f14476a;

    /* renamed from: b */
    final /* synthetic */ C10406g f14477b;

    /* renamed from: c */
    final /* synthetic */ C9709o.C9710a f14478c;

    /* renamed from: d */
    final /* synthetic */ C9703m0 f14479d;

    C9697k0(C9052b bVar, C10406g gVar, C9709o.C9710a aVar, C9703m0 m0Var) {
        this.f14476a = bVar;
        this.f14477b = gVar;
        this.f14478c = aVar;
        this.f14479d = m0Var;
    }

    /* renamed from: a */
    public final void mo32523a(Status status) {
        if (status.mo32381I()) {
            this.f14477b.mo45098c(this.f14478c.mo31860a(this.f14476a.mo32436c(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f14477b.mo45097b(C9662b.m20102a(status));
    }
}
