package com.appboy.p054ui;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;

/* renamed from: com.appboy.ui.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4199a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppboyFeedFragment f3320b;

    /* renamed from: c */
    public final /* synthetic */ FeedUpdatedEvent f3321c;

    /* renamed from: d */
    public final /* synthetic */ ListView f3322d;

    public /* synthetic */ C4199a(AppboyFeedFragment appboyFeedFragment, FeedUpdatedEvent feedUpdatedEvent, ListView listView) {
        this.f3320b = appboyFeedFragment;
        this.f3321c = feedUpdatedEvent;
        this.f3322d = listView;
    }

    public final void run() {
        this.f3320b.lambda$onViewCreated$2(this.f3321c, this.f3322d);
    }
}
