package p063d6;

import android.content.Context;
import android.content.Intent;
import p037b6.C2894b;
import p037b6.C2900e;
import p037b6.C2920o;
import p099g6.C7781c;
import p099g6.C7790l;

/* renamed from: d6.k */
public final class C7277k {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C2900e f10007c = new C2900e("ReviewService");

    /* renamed from: a */
    final C2920o<C2894b> f10008a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f10009b;

    public C7277k(Context context) {
        this.f10009b = context.getPackageName();
        Context context2 = context;
        this.f10008a = new C2920o(context2, f10007c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C7273g.f10001a);
    }

    /* renamed from: a */
    public final C7781c<C7267a> mo40841a() {
        f10007c.mo28424f("requestInAppReview (%s)", this.f10009b);
        C7790l lVar = new C7790l();
        this.f10008a.mo28460c(new C7274h(this, lVar, lVar));
        return lVar.mo41434a();
    }
}
