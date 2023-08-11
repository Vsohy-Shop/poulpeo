package p440ud;

import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;

/* renamed from: ud.g */
/* compiled from: LoaderWrapper */
public class C13558g extends C13574r {

    /* renamed from: c */
    private Handler f21815c;

    /* renamed from: ud.g$a */
    /* compiled from: LoaderWrapper */
    class C13559a implements Handler.Callback {
        C13559a() {
        }

        public boolean handleMessage(Message message) {
            C13558g.this.mo53203j();
            return false;
        }
    }

    public C13558g(ProgressBar progressBar) {
        super(progressBar);
    }

    /* renamed from: i */
    public ProgressBar mo53202i() {
        return (ProgressBar) mo53243a();
    }

    /* renamed from: j */
    public void mo53203j() {
        ProgressBar i = mo53202i();
        i.setIndeterminate(true);
        i.setEnabled(true);
        i.setVisibility(0);
    }

    /* renamed from: k */
    public void mo53204k(long j) {
        Handler handler = this.f21815c;
        if (handler != null) {
            handler.removeMessages(0);
        }
        Handler handler2 = new Handler(new C13559a());
        this.f21815c = handler2;
        handler2.sendEmptyMessageDelayed(0, j);
    }

    /* renamed from: l */
    public void mo53205l() {
        Handler handler = this.f21815c;
        if (handler != null) {
            handler.removeMessages(0);
            this.f21815c = null;
        }
        ProgressBar i = mo53202i();
        i.setEnabled(false);
        i.setVisibility(8);
    }
}
