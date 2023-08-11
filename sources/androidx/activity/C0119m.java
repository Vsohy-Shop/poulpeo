package androidx.activity;

import android.view.View;
import android.view.ViewTreeObserver;
import p308ag.C10912p;

/* renamed from: androidx.activity.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0119m implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: b */
    public final /* synthetic */ C10912p f171b;

    /* renamed from: c */
    public final /* synthetic */ View f172c;

    public /* synthetic */ C0119m(C10912p pVar, View view) {
        this.f171b = pVar;
        this.f172c = view;
    }

    public final void onScrollChanged() {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(this.f171b, this.f172c);
    }
}
