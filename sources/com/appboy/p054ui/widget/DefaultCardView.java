package com.appboy.p054ui.widget;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.feed.view.BaseFeedCardView;
import p126j0.C8266c;

/* renamed from: com.appboy.ui.widget.DefaultCardView */
public class DefaultCardView extends BaseFeedCardView<Card> {
    private static final String TAG = C8266c.m16405n(DefaultCardView.class);

    public DefaultCardView(Context context) {
        this(context, (Card) null);
    }

    /* access modifiers changed from: protected */
    public int getLayoutResource() {
        return C4193R.C4197layout.com_appboy_default_card;
    }

    public void onSetCard(Card card) {
        String str = TAG;
        C8266c.m16416z(str, "onSetCard called for blank view with: " + card.toString());
    }

    public DefaultCardView(Context context, Card card) {
        super(context);
        if (card != null) {
            setCard(card);
        }
    }
}
