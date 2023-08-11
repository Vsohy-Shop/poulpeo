package p382lc;

import java.util.Timer;
import java.util.TimerTask;
import p440ud.C13566l;

/* renamed from: lc.e */
/* compiled from: JavaUtilTimerWrapper */
public class C12823e {

    /* renamed from: a */
    private C13566l f20489a;

    /* renamed from: b */
    private Timer f20490b = new Timer();

    /* renamed from: lc.e$a */
    /* compiled from: JavaUtilTimerWrapper */
    class C12824a extends TimerTask {

        /* renamed from: b */
        final /* synthetic */ C12823e f20491b;

        /* renamed from: c */
        final /* synthetic */ C12826c f20492c;

        C12824a(C12823e eVar, C12826c cVar) {
            this.f20491b = eVar;
            this.f20492c = cVar;
        }

        public void run() {
            this.f20491b.mo50724b(this.f20492c);
        }
    }

    /* renamed from: lc.e$b */
    /* compiled from: JavaUtilTimerWrapper */
    class C12825b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12826c f20494b;

        C12825b(C12826c cVar) {
            this.f20494b = cVar;
        }

        public void run() {
            this.f20494b.run();
        }
    }

    /* renamed from: lc.e$c */
    /* compiled from: JavaUtilTimerWrapper */
    public interface C12826c {
        void run();
    }

    public C12823e(C13566l lVar) {
        this.f20489a = lVar;
    }

    /* renamed from: a */
    public void mo50723a() {
        this.f20490b.cancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo50724b(C12826c cVar) {
        this.f20489a.mo53218a().runOnUiThread(new C12825b(cVar));
    }

    /* renamed from: c */
    public void mo50725c(C12826c cVar, int i, int i2) {
        this.f20490b.schedule(new C12824a(this, cVar), (long) i, (long) i2);
    }
}
