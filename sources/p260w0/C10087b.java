package p260w0;

import android.content.Context;
import android.view.View;
import com.braze.p055ui.inappmessage.views.InAppMessageFullView;
import p069e0.C7389i;

/* renamed from: w0.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10087b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f15247b;

    /* renamed from: c */
    public final /* synthetic */ InAppMessageFullView f15248c;

    /* renamed from: d */
    public final /* synthetic */ C7389i f15249d;

    /* renamed from: e */
    public final /* synthetic */ Context f15250e;

    /* renamed from: f */
    public final /* synthetic */ View f15251f;

    public /* synthetic */ C10087b(View view, InAppMessageFullView inAppMessageFullView, C7389i iVar, Context context, View view2) {
        this.f15247b = view;
        this.f15248c = inAppMessageFullView;
        this.f15249d = iVar;
        this.f15250e = context;
        this.f15251f = view2;
    }

    public final void run() {
        C10088c.m21196d(this.f15247b, this.f15248c, this.f15249d, this.f15250e, this.f15251f);
    }
}
