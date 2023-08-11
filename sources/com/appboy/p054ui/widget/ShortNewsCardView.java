package com.appboy.p054ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.feed.view.BaseFeedCardView;
import p126j0.C8266c;
import p146l0.C8619a;

/* renamed from: com.appboy.ui.widget.ShortNewsCardView */
public class ShortNewsCardView extends BaseFeedCardView<ShortNewsCard> {
    private static final String TAG = C8266c.m16405n(ShortNewsCardView.class);
    private final float mAspectRatio;
    private C8619a mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
    private final TextView mTitle;

    public ShortNewsCardView(Context context) {
        this(context, (ShortNewsCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(ShortNewsCard shortNewsCard, View view) {
        handleCardClick(this.applicationContext, shortNewsCard, this.mCardAction);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C4193R.C4197layout.com_appboy_short_news_card;
    }

    public ShortNewsCardView(Context context, ShortNewsCard shortNewsCard) {
        super(context);
        this.mAspectRatio = 1.0f;
        this.mDescription = (TextView) findViewById(C4193R.C4196id.com_appboy_short_news_card_description);
        this.mTitle = (TextView) findViewById(C4193R.C4196id.com_appboy_short_news_card_title);
        this.mDomain = (TextView) findViewById(C4193R.C4196id.com_appboy_short_news_card_domain);
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(C4193R.C4196id.com_appboy_short_news_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (shortNewsCard != null) {
            setCard(shortNewsCard);
        }
        setBackground(getResources().getDrawable(C4193R.C4195drawable.com_appboy_card_background));
    }

    public void onSetCard(ShortNewsCard shortNewsCard) {
        this.mDescription.setText(shortNewsCard.getDescription());
        setOptionalTextView(this.mTitle, shortNewsCard.getTitle());
        setOptionalTextView(this.mDomain, shortNewsCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(shortNewsCard);
        setOnClickListener(new C4214c(this, shortNewsCard));
        setImageViewToUrl(this.mImage, shortNewsCard.getImageUrl(), 1.0f, shortNewsCard);
    }
}
