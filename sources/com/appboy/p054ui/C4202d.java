package com.appboy.p054ui;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;
import p031b0.C2811f;

/* renamed from: com.appboy.ui.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4202d implements C2811f {

    /* renamed from: a */
    public final /* synthetic */ AppboyFeedFragment f3324a;

    /* renamed from: b */
    public final /* synthetic */ ListView f3325b;

    public /* synthetic */ C4202d(AppboyFeedFragment appboyFeedFragment, ListView listView) {
        this.f3324a = appboyFeedFragment;
        this.f3325b = listView;
    }

    /* renamed from: a */
    public final void mo28291a(Object obj) {
        this.f3324a.lambda$onViewCreated$3(this.f3325b, (FeedUpdatedEvent) obj);
    }
}
