package com.appboy.p054ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.feed.AppboyFeedManager;
import com.appboy.p054ui.feed.AppboyImageSwitcher;
import com.appboy.p054ui.widget.BaseCardView;
import p126j0.C8266c;
import p146l0.C8619a;

/* renamed from: com.appboy.ui.feed.view.BaseFeedCardView */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = C8266c.m16405n(BaseCardView.class);

    public BaseFeedCardView(Context context) {
        super(context);
        AppboyImageSwitcher appboyImageSwitcher;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        AppboyImageSwitcher appboyImageSwitcher2 = (AppboyImageSwitcher) findViewById(C4193R.C4196id.com_appboy_newsfeed_item_read_indicator_image_switcher);
        this.imageSwitcher = appboyImageSwitcher2;
        if (appboyImageSwitcher2 != null) {
            appboyImageSwitcher2.setFactory(new C4206b(this));
        }
        if (!isUnreadIndicatorEnabled() && (appboyImageSwitcher = this.imageSwitcher) != null) {
            appboyImageSwitcher.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View lambda$new$0() {
        return new ImageView(this.applicationContext);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setCard$1() {
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    public Card getCard() {
        return this.card;
    }

    /* access modifiers changed from: protected */
    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        return findViewById(C4193R.C4196id.com_appboy_stubbed_feed_image_view);
    }

    /* access modifiers changed from: protected */
    public boolean isClickHandled(Context context, Card card, C8619a aVar) {
        return AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void onSetCard(T t);

    public void setCard(T t) {
        this.card = t;
        onSetCard(t);
        this.card.setListener(new C4205a(this));
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }
}
