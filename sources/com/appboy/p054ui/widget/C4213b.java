package com.appboy.p054ui.widget;

import android.view.View;
import com.appboy.models.cards.CaptionedImageCard;

/* renamed from: com.appboy.ui.widget.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4213b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CaptionedImageCardView f3338b;

    /* renamed from: c */
    public final /* synthetic */ CaptionedImageCard f3339c;

    public /* synthetic */ C4213b(CaptionedImageCardView captionedImageCardView, CaptionedImageCard captionedImageCard) {
        this.f3338b = captionedImageCardView;
        this.f3339c = captionedImageCard;
    }

    public final void onClick(View view) {
        this.f3338b.lambda$onSetCard$0(this.f3339c, view);
    }
}
