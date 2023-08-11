package p051c8;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.abt.AbtException;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p172n6.C8929a;
import p172n6.C8930b;
import p223s7.C9557m;

/* renamed from: c8.b */
/* compiled from: AbtIntegrationHelper */
public class C3903b {

    /* renamed from: a */
    private final C8930b f2998a;
    @VisibleForTesting

    /* renamed from: b */
    Executor f2999b = Executors.newSingleThreadExecutor();

    public C3903b(C8930b bVar) {
        this.f2998a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m4420b(C9557m mVar) {
        try {
            C3961l2.m4602a("Updating active experiment: " + mVar.toString());
            this.f2998a.mo43072m(new C8929a(mVar.mo44038K(), mVar.mo44043R(), mVar.mo44041N(), new Date(mVar.mo44039L()), mVar.mo44042P(), mVar.mo44040M()));
        } catch (AbtException e) {
            C3961l2.m4603b("Unable to set experiment as active with ABT, missing analytics?\n" + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo29947c(C9557m mVar) {
        this.f2999b.execute(new C3898a(this, mVar));
    }
}
