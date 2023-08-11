package com.braze.p055ui.inappmessage.views;

/* renamed from: com.braze.ui.inappmessage.views.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4359j implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InAppMessageModalView f3646b;

    /* renamed from: c */
    public final /* synthetic */ int f3647c;

    /* renamed from: d */
    public final /* synthetic */ int f3648d;

    /* renamed from: e */
    public final /* synthetic */ int f3649e;

    /* renamed from: f */
    public final /* synthetic */ double f3650f;

    public /* synthetic */ C4359j(InAppMessageModalView inAppMessageModalView, int i, int i2, int i3, double d) {
        this.f3646b = inAppMessageModalView;
        this.f3647c = i;
        this.f3648d = i2;
        this.f3649e = i3;
        this.f3650f = d;
    }

    public final void run() {
        InAppMessageModalView.m38726resizeGraphicFrameIfAppropriate$lambda2(this.f3646b, this.f3647c, this.f3648d, this.f3649e, this.f3650f);
    }
}
