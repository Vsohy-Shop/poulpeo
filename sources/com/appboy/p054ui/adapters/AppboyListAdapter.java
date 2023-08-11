package com.appboy.p054ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p054ui.feed.view.BaseFeedCardView;
import com.appboy.p054ui.widget.BannerImageCardView;
import com.appboy.p054ui.widget.CaptionedImageCardView;
import com.appboy.p054ui.widget.DefaultCardView;
import com.appboy.p054ui.widget.ShortNewsCardView;
import com.appboy.p054ui.widget.TextAnnouncementCardView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p126j0.C8266c;

/* renamed from: com.appboy.ui.adapters.AppboyListAdapter */
public class AppboyListAdapter extends ArrayAdapter<Card> {
    private static final String TAG = C8266c.m16405n(AppboyListAdapter.class);
    private final Set<String> mCardIdImpressions = new HashSet();
    private final Context mContext;

    public AppboyListAdapter(Context context, int i, List<Card> list) {
        super(context, i, list);
        this.mContext = context;
    }

    private void logCardImpression(Card card) {
        String id = card.getId();
        if (!this.mCardIdImpressions.contains(id)) {
            this.mCardIdImpressions.add(id);
            card.logImpression();
            String str = TAG;
            C8266c.m16413w(str, "Logged impression for card " + id);
        } else {
            String str2 = TAG;
            C8266c.m16413w(str2, "Already counted impression for card " + id);
        }
        if (!card.getViewed()) {
            card.setViewed(true);
        }
    }

    public void batchSetCardsToRead(int i, int i2) {
        if (getCount() == 0) {
            C8266c.m16401j(TAG, "mAdapter is empty in setting some cards to viewed.");
            return;
        }
        int min = Math.min(getCount(), i2);
        for (int max = Math.max(0, i); max < min; max++) {
            Card card = (Card) getItem(max);
            if (card == null) {
                C8266c.m16401j(TAG, "Card was null in setting some cards to viewed.");
                return;
            }
            if (!card.isIndicatorHighlighted()) {
                card.setIndicatorHighlighted(true);
            }
        }
    }

    public int getItemViewType(int i) {
        Card card = (Card) getItem(i);
        if (card instanceof BannerImageCard) {
            return 1;
        }
        if (card instanceof CaptionedImageCard) {
            return 2;
        }
        if (card instanceof ShortNewsCard) {
            return 3;
        }
        if (card instanceof TextAnnouncementCard) {
            return 4;
        }
        return 0;
    }

    @NonNull
    public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        BaseFeedCardView baseFeedCardView;
        Card card = (Card) getItem(i);
        if (view != null) {
            String str = TAG;
            C8266c.m16413w(str, "Reusing convertView for rendering of item " + i);
            baseFeedCardView = (BaseFeedCardView) view;
        } else if (card instanceof BannerImageCard) {
            baseFeedCardView = new BannerImageCardView(this.mContext);
        } else if (card instanceof CaptionedImageCard) {
            baseFeedCardView = new CaptionedImageCardView(this.mContext);
        } else if (card instanceof ShortNewsCard) {
            baseFeedCardView = new ShortNewsCardView(this.mContext);
        } else if (card instanceof TextAnnouncementCard) {
            baseFeedCardView = new TextAnnouncementCardView(this.mContext);
        } else {
            baseFeedCardView = new DefaultCardView(this.mContext);
        }
        String str2 = TAG;
        C8266c.m16413w(str2, "Using view of type: " + baseFeedCardView.getClass().getName() + " for card at position " + i + ": " + card.toString());
        baseFeedCardView.setCard(card);
        logCardImpression(card);
        return baseFeedCardView;
    }

    public int getViewTypeCount() {
        return 5;
    }

    public synchronized void replaceFeed(List<Card> list) {
        Card card;
        int i = 0;
        setNotifyOnChange(false);
        if (list == null) {
            clear();
            notifyDataSetChanged();
            return;
        }
        String str = TAG;
        C8266c.m16401j(str, "Replacing existing feed of " + getCount() + " cards with new feed containing " + list.size() + " cards.");
        int size = list.size();
        int i2 = 0;
        while (i < getCount()) {
            Card card2 = (Card) getItem(i);
            if (i2 < size) {
                card = list.get(i2);
            } else {
                card = null;
            }
            if (card == null || !card.equals(card2)) {
                remove(card2);
            } else {
                i++;
                i2++;
            }
        }
        super.addAll(list.subList(i2, size));
        notifyDataSetChanged();
    }

    public void resetCardImpressionTracker() {
        this.mCardIdImpressions.clear();
    }

    public synchronized void add(Card card) {
        super.add(card);
    }
}
