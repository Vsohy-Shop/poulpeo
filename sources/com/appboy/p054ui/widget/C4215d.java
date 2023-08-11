package com.appboy.p054ui.widget;

import android.view.View;
import com.appboy.models.cards.TextAnnouncementCard;

/* renamed from: com.appboy.ui.widget.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4215d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ TextAnnouncementCardView f3342b;

    /* renamed from: c */
    public final /* synthetic */ TextAnnouncementCard f3343c;

    public /* synthetic */ C4215d(TextAnnouncementCardView textAnnouncementCardView, TextAnnouncementCard textAnnouncementCard) {
        this.f3342b = textAnnouncementCardView;
        this.f3343c = textAnnouncementCard;
    }

    public final void onClick(View view) {
        this.f3342b.lambda$onSetCard$0(this.f3343c, view);
    }
}
