package com.appboy.p054ui.widget;

import android.view.View;
import com.appboy.models.cards.ShortNewsCard;

/* renamed from: com.appboy.ui.widget.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4214c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ShortNewsCardView f3340b;

    /* renamed from: c */
    public final /* synthetic */ ShortNewsCard f3341c;

    public /* synthetic */ C4214c(ShortNewsCardView shortNewsCardView, ShortNewsCard shortNewsCard) {
        this.f3340b = shortNewsCardView;
        this.f3341c = shortNewsCard;
    }

    public final void onClick(View view) {
        this.f3340b.lambda$onSetCard$0(this.f3341c, view);
    }
}
