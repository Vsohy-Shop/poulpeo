package com.appboy.p054ui.widget;

import android.view.View;
import com.appboy.models.cards.BannerImageCard;

/* renamed from: com.appboy.ui.widget.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4212a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ BannerImageCardView f3336b;

    /* renamed from: c */
    public final /* synthetic */ BannerImageCard f3337c;

    public /* synthetic */ C4212a(BannerImageCardView bannerImageCardView, BannerImageCard bannerImageCard) {
        this.f3336b = bannerImageCardView;
        this.f3337c = bannerImageCard;
    }

    public final void onClick(View view) {
        this.f3336b.lambda$onSetCard$0(this.f3337c, view);
    }
}
