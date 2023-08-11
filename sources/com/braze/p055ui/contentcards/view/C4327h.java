package com.braze.p055ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;

/* renamed from: com.braze.ui.contentcards.view.h */
/* compiled from: TextAnnouncementContentCardView.kt */
public class C4327h extends C4319c<TextAnnouncementCard> {

    /* renamed from: com.braze.ui.contentcards.view.h$a */
    /* compiled from: TextAnnouncementContentCardView.kt */
    private final class C4328a extends C4322e {

        /* renamed from: e */
        private final TextView f3608e;

        /* renamed from: f */
        private final TextView f3609f;

        /* renamed from: g */
        final /* synthetic */ C4327h f3610g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4328a(C4327h hVar, View view) {
            super(view, hVar.isUnreadIndicatorEnabled());
            C12775o.m28639i(hVar, "this$0");
            C12775o.m28639i(view, "view");
            this.f3610g = hVar;
            this.f3608e = (TextView) view.findViewById(C4193R.C4196id.com_braze_content_cards_text_announcement_card_title);
            this.f3609f = (TextView) view.findViewById(C4193R.C4196id.com_braze_content_cards_text_announcement_card_description);
        }

        /* renamed from: N0 */
        public final TextView mo31078N0() {
            return this.f3609f;
        }

        /* renamed from: R0 */
        public final TextView mo31079R0() {
            return this.f3608e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4327h(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* renamed from: b */
    public void mo31061b(C4322e eVar, Card card) {
        boolean z;
        String str;
        C12775o.m28639i(eVar, "viewHolder");
        C12775o.m28639i(card, "card");
        if (card instanceof TextAnnouncementCard) {
            super.mo31061b(eVar, card);
            C4328a aVar = (C4328a) eVar;
            TextView R0 = aVar.mo31079R0();
            if (R0 != null) {
                setOptionalTextView(R0, ((TextAnnouncementCard) card).getTitle());
            }
            TextView N0 = aVar.mo31078N0();
            if (N0 != null) {
                setOptionalTextView(N0, ((TextAnnouncementCard) card).getDescription());
            }
            TextAnnouncementCard textAnnouncementCard = (TextAnnouncementCard) card;
            String domain = textAnnouncementCard.getDomain();
            if (domain == null || C13754v.m31532t(domain)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = card.getUrl();
            } else {
                str = textAnnouncementCard.getDomain();
            }
            if (str != null) {
                aVar.mo31073b0(str);
            }
            View view = eVar.itemView;
            view.setContentDescription(textAnnouncementCard.getTitle() + " . " + textAnnouncementCard.getDescription());
        }
    }

    /* renamed from: d */
    public C4322e mo31062d(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4193R.C4197layout.com_braze_text_announcement_content_card, viewGroup, false);
        C12775o.m28638h(inflate, "view");
        setViewBackground(inflate);
        return new C4328a(this, inflate);
    }
}
