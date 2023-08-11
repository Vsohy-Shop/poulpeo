package p278x7;

import android.os.CountDownTimer;

/* renamed from: x7.n */
/* compiled from: RenewableTimer */
public class C10585n {

    /* renamed from: a */
    private CountDownTimer f16117a;

    /* renamed from: x7.n$b */
    /* compiled from: RenewableTimer */
    public interface C10587b {
        void onFinish();
    }

    C10585n() {
    }

    /* renamed from: a */
    public void mo45539a() {
        CountDownTimer countDownTimer = this.f16117a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f16117a = null;
        }
    }

    /* renamed from: b */
    public void mo45540b(C10587b bVar, long j, long j2) {
        this.f16117a = new C10586a(j, j2, bVar).start();
    }

    /* renamed from: x7.n$a */
    /* compiled from: RenewableTimer */
    class C10586a extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C10587b f16118a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10586a(long j, long j2, C10587b bVar) {
            super(j, j2);
            this.f16118a = bVar;
        }

        public void onFinish() {
            this.f16118a.onFinish();
        }

        public void onTick(long j) {
        }
    }
}
