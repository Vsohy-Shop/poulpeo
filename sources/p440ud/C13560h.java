package p440ud;

import android.widget.ProgressBar;

/* renamed from: ud.h */
/* compiled from: ProgressViewWrapper */
public class C13560h extends C13574r {
    public C13560h(ProgressBar progressBar) {
        super(progressBar);
    }

    /* renamed from: i */
    public ProgressBar mo53207i() {
        return (ProgressBar) mo53243a();
    }

    /* renamed from: j */
    public void mo53208j(float f) {
        mo53207i().setProgress((int) (f * 100.0f));
    }

    /* renamed from: k */
    public void mo53209k() {
        mo53207i().setEnabled(true);
    }

    /* renamed from: l */
    public void mo53210l() {
        mo53207i().setEnabled(false);
    }
}
