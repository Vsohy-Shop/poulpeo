package com.braze.p055ui.inappmessage.views;

import android.view.View;
import android.view.ViewParent;

/* renamed from: com.braze.ui.inappmessage.views.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4354h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f3640b;

    /* renamed from: c */
    public final /* synthetic */ C4355i f3641c;

    /* renamed from: d */
    public final /* synthetic */ ViewParent f3642d;

    public /* synthetic */ C4354h(View view, C4355i iVar, ViewParent viewParent) {
        this.f3640b = view;
        this.f3641c = iVar;
        this.f3642d = viewParent;
    }

    public final void run() {
        C4355i.m38727setLargerCloseButtonClickArea$lambda5(this.f3640b, this.f3641c, this.f3642d);
    }
}
