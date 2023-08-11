package com.appboy.p054ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.feed.view.BaseFeedCardView;
import p126j0.C8266c;
import p146l0.C8619a;

/* renamed from: com.appboy.ui.widget.TextAnnouncementCardView */
public class TextAnnouncementCardView extends BaseFeedCardView<TextAnnouncementCard> {
    private static final String TAG = C8266c.m16405n(TextAnnouncementCardView.class);
    private C8619a mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, (TextAnnouncementCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(TextAnnouncementCard textAnnouncementCard, View view) {
        handleCardClick(this.applicationContext, textAnnouncementCard, this.mCardAction);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C4193R.C4197layout.com_appboy_text_announcement_card;
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textAnnouncementCard) {
        super(context);
        this.mTitle = (TextView) findViewById(C4193R.C4196id.com_appboy_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(C4193R.C4196id.com_appboy_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(C4193R.C4196id.com_appboy_text_announcement_card_domain);
        if (textAnnouncementCard != null) {
            setCard(textAnnouncementCard);
        }
        setBackground(getResources().getDrawable(C4193R.C4195drawable.com_appboy_card_background));
    }

    public void onSetCard(TextAnnouncementCard textAnnouncementCard) {
        this.mTitle.setText(textAnnouncementCard.getTitle());
        this.mDescription.setText(textAnnouncementCard.getDescription());
        setOptionalTextView(this.mDomain, textAnnouncementCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(textAnnouncementCard);
        setOnClickListener(new C4215d(this, textAnnouncementCard));
    }
}
