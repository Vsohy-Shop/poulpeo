package p440ud;

import android.view.View;

/* renamed from: ud.r */
/* compiled from: ViewWrapper */
public class C13574r {

    /* renamed from: a */
    private C13576b f21832a;

    /* renamed from: b */
    private View f21833b;

    /* renamed from: ud.r$a */
    /* compiled from: ViewWrapper */
    class C13575a implements View.OnClickListener {
        C13575a() {
        }

        public void onClick(View view) {
            C13574r.this.mo53244b();
        }
    }

    /* renamed from: ud.r$b */
    /* compiled from: ViewWrapper */
    public interface C13576b {
        /* renamed from: E */
        void mo49068E(C13574r rVar);
    }

    public C13574r(View view) {
        if (view != null) {
            this.f21833b = view;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public View mo53243a() {
        return this.f21833b;
    }

    /* renamed from: b */
    public void mo53244b() {
        C13576b bVar = this.f21832a;
        if (bVar != null) {
            bVar.mo49068E(this);
        }
    }

    /* renamed from: c */
    public boolean mo53245c() {
        if (mo53243a().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo53246d(C13550c cVar) {
        if (cVar.f21820a > 0) {
            mo53243a().setBackgroundResource(cVar.f21820a);
        } else {
            mo53243a().setBackground(cVar.f21808b);
        }
    }

    /* renamed from: e */
    public void mo53247e(boolean z) {
        mo53243a().setEnabled(z);
    }

    /* renamed from: f */
    public void mo53229f(C13576b bVar) {
        this.f21832a = bVar;
        mo53243a().setOnClickListener(new C13575a());
    }

    /* renamed from: g */
    public void mo53230g(C13573q qVar) {
        mo53243a().setVisibility(qVar.f21831b);
    }

    /* renamed from: h */
    public void mo53248h(boolean z) {
        if (z) {
            mo53230g(C13573q.VISIBLE);
        } else {
            mo53230g(C13573q.GONE);
        }
    }
}
