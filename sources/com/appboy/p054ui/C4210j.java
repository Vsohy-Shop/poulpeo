package com.appboy.p054ui;

import android.widget.ListView;
import com.appboy.events.FeedUpdatedEvent;
import p031b0.C2811f;

/* renamed from: com.appboy.ui.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4210j implements C2811f {

    /* renamed from: a */
    public final /* synthetic */ AppboyXamarinFormsFeedFragment f3331a;

    /* renamed from: b */
    public final /* synthetic */ ListView f3332b;

    public /* synthetic */ C4210j(AppboyXamarinFormsFeedFragment appboyXamarinFormsFeedFragment, ListView listView) {
        this.f3331a = appboyXamarinFormsFeedFragment;
        this.f3332b = listView;
    }

    /* renamed from: a */
    public final void mo28291a(Object obj) {
        this.f3331a.lambda$onActivityCreated$3(this.f3332b, (FeedUpdatedEvent) obj);
    }
}
