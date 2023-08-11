package p042bo.app;

import android.app.Activity;
import java.util.List;
import p042bo.app.C2995a4;

/* renamed from: bo.app.b2 */
public interface C3023b2 {
    /* renamed from: a */
    static /* synthetic */ void m2597a(C3023b2 b2Var, long j, long j2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            b2Var.mo28632a(j, j2, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestContentCardsSync");
    }

    /* renamed from: a */
    String mo28631a();

    /* renamed from: a */
    void mo28632a(long j, long j2, int i);

    /* renamed from: a */
    void mo28633a(C2993a2 a2Var);

    /* renamed from: a */
    void mo28634a(C2995a4.C2996a aVar);

    /* renamed from: a */
    void mo28635a(C3042c2 c2Var);

    /* renamed from: a */
    void mo28636a(C3766w2 w2Var);

    /* renamed from: a */
    void mo28637a(C3790x5 x5Var, C3766w2 w2Var);

    /* renamed from: a */
    void mo28638a(Throwable th);

    /* renamed from: a */
    void mo28639a(List<String> list, long j);

    /* renamed from: a */
    void mo28640a(boolean z);

    /* renamed from: a */
    boolean mo28641a(C3785x1 x1Var);

    /* renamed from: b */
    void mo28642b();

    /* renamed from: b */
    void mo28643b(C3785x1 x1Var);

    /* renamed from: b */
    void mo28644b(Throwable th);

    /* renamed from: b */
    void mo28645b(boolean z);

    /* renamed from: c */
    boolean mo28646c();

    void closeSession(Activity activity);

    /* renamed from: d */
    void mo28648d();

    /* renamed from: e */
    void mo28649e();

    void openSession(Activity activity);

    void refreshFeatureFlags();
}
