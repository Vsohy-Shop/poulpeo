package com.appboy.p054ui;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;

/* renamed from: com.appboy.ui.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4211k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppboyXamarinFormsFeedFragment f3333b;

    /* renamed from: c */
    public final /* synthetic */ FeedUpdatedEvent f3334c;

    /* renamed from: d */
    public final /* synthetic */ ListView f3335d;

    public /* synthetic */ C4211k(AppboyXamarinFormsFeedFragment appboyXamarinFormsFeedFragment, FeedUpdatedEvent feedUpdatedEvent, ListView listView) {
        this.f3333b = appboyXamarinFormsFeedFragment;
        this.f3334c = feedUpdatedEvent;
        this.f3335d = listView;
    }

    public final void run() {
        this.f3333b.lambda$onActivityCreated$2(this.f3334c, this.f3335d);
    }
}
