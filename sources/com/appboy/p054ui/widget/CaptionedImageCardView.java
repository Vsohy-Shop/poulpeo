package com.appboy.p054ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.feed.view.BaseFeedCardView;
import p126j0.C8266c;
import p146l0.C8619a;

/* renamed from: com.appboy.ui.widget.CaptionedImageCardView */
public class CaptionedImageCardView extends BaseFeedCardView<CaptionedImageCard> {
    private static final String TAG = C8266c.m16405n(CaptionedImageCardView.class);
    private float mAspectRatio;
    private C8619a mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
    private final TextView mTitle;

    public CaptionedImageCardView(Context context) {
        this(context, (CaptionedImageCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(CaptionedImageCard captionedImageCard, View view) {
        handleCardClick(this.applicationContext, captionedImageCard, this.mCardAction);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C4193R.C4197layout.com_appboy_captioned_image_card;
    }

    public CaptionedImageCardView(Context context, CaptionedImageCard captionedImageCard) {
        super(context);
        this.mAspectRatio = 1.3333334f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(C4193R.C4196id.com_appboy_captioned_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        this.mTitle = (TextView) findViewById(C4193R.C4196id.com_appboy_captioned_image_title);
        this.mDescription = (TextView) findViewById(C4193R.C4196id.com_appboy_captioned_image_description);
        this.mDomain = (TextView) findViewById(C4193R.C4196id.com_appboy_captioned_image_card_domain);
        if (captionedImageCard != null) {
            setCard(captionedImageCard);
        }
        setBackground(getResources().getDrawable(C4193R.C4195drawable.com_appboy_card_background));
    }

    public void onSetCard(CaptionedImageCard captionedImageCard) {
        this.mTitle.setText(captionedImageCard.getTitle());
        this.mDescription.setText(captionedImageCard.getDescription());
        setOptionalTextView(this.mDomain, captionedImageCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(captionedImageCard);
        setOnClickListener(new C4213b(this, captionedImageCard));
        this.mAspectRatio = captionedImageCard.getAspectRatio();
        setImageViewToUrl(this.mImage, captionedImageCard.getImageUrl(), this.mAspectRatio, captionedImageCard);
    }
}
