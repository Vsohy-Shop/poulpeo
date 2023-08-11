package p440ud;

import android.widget.RatingBar;

/* renamed from: ud.i */
/* compiled from: RatingBarWrapper */
public class C13561i extends C13574r {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f21817c = 0.0f;

    /* renamed from: ud.i$a */
    /* compiled from: RatingBarWrapper */
    class C13562a implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C13563b f21818a;

        C13562a(C13563b bVar) {
            this.f21818a = bVar;
        }

        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            if (z) {
                if (f < C13561i.this.f21817c) {
                    ratingBar.setRating(C13561i.this.f21817c);
                    f = C13561i.this.f21817c;
                }
                this.f21818a.mo49565a(C13561i.this, f, true);
            }
        }
    }

    /* renamed from: ud.i$b */
    /* compiled from: RatingBarWrapper */
    public interface C13563b {
        /* renamed from: a */
        void mo49565a(C13561i iVar, float f, boolean z);
    }

    public C13561i(RatingBar ratingBar) {
        super(ratingBar);
    }

    /* renamed from: j */
    public float mo53211j() {
        return mo53212k().getRating();
    }

    /* renamed from: k */
    public RatingBar mo53212k() {
        return (RatingBar) mo53243a();
    }

    /* renamed from: l */
    public void mo53213l(float f) {
        this.f21817c = f;
    }

    /* renamed from: m */
    public void mo53214m(C13563b bVar) {
        if (bVar == null) {
            mo53212k().setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener) null);
        } else {
            mo53212k().setOnRatingBarChangeListener(new C13562a(bVar));
        }
    }
}
