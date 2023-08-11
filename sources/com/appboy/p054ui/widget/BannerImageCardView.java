package com.appboy.p054ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.feed.view.BaseFeedCardView;
import p126j0.C8266c;
import p146l0.C8619a;

/* renamed from: com.appboy.ui.widget.BannerImageCardView */
public class BannerImageCardView extends BaseFeedCardView<BannerImageCard> {
    private static final String TAG = C8266c.m16405n(BannerImageCardView.class);
    private float mAspectRatio;
    private C8619a mCardAction;
    private final ImageView mImage;

    public BannerImageCardView(Context context) {
        this(context, (BannerImageCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(BannerImageCard bannerImageCard, View view) {
        handleCardClick(this.applicationContext, bannerImageCard, this.mCardAction);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C4193R.C4197layout.com_appboy_banner_image_card;
    }

    public BannerImageCardView(Context context, BannerImageCard bannerImageCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(C4193R.C4196id.com_appboy_banner_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (bannerImageCard != null) {
            setCard(bannerImageCard);
        }
        setBackground(getResources().getDrawable(C4193R.C4195drawable.com_appboy_card_background));
    }

    public void onSetCard(BannerImageCard bannerImageCard) {
        if (bannerImageCard.getAspectRatio() != 0.0f) {
            this.mAspectRatio = bannerImageCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, bannerImageCard.getImageUrl(), this.mAspectRatio, bannerImageCard);
        this.mCardAction = BaseCardView.getUriActionForCard(bannerImageCard);
        setOnClickListener(new C4212a(this, bannerImageCard));
    }
}
