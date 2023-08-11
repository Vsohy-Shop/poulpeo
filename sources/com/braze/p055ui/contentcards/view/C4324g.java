package com.braze.p055ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.braze.ui.contentcards.view.g */
/* compiled from: ShortNewsContentCardView.kt */
public class C4324g extends C4319c<ShortNewsCard> {

    /* renamed from: b */
    public static final C4325a f3603b = new C4325a((DefaultConstructorMarker) null);

    /* renamed from: com.braze.ui.contentcards.view.g$a */
    /* compiled from: ShortNewsContentCardView.kt */
    public static final class C4325a {
        private C4325a() {
        }

        public /* synthetic */ C4325a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.braze.ui.contentcards.view.g$b */
    /* compiled from: ShortNewsContentCardView.kt */
    private final class C4326b extends C4322e {

        /* renamed from: e */
        private final TextView f3604e;

        /* renamed from: f */
        private final TextView f3605f;

        /* renamed from: g */
        private final ImageView f3606g;

        /* renamed from: h */
        final /* synthetic */ C4324g f3607h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4326b(C4324g gVar, View view) {
            super(view, gVar.isUnreadIndicatorEnabled());
            C12775o.m28639i(gVar, "this$0");
            C12775o.m28639i(view, "view");
            this.f3607h = gVar;
            this.f3604e = (TextView) view.findViewById(C4193R.C4196id.com_braze_content_cards_short_news_card_title);
            this.f3605f = (TextView) view.findViewById(C4193R.C4196id.com_braze_content_cards_short_news_card_description);
            this.f3606g = (ImageView) view.findViewById(C4193R.C4196id.com_braze_content_cards_short_news_card_image);
        }

        /* renamed from: N0 */
        public final TextView mo31075N0() {
            return this.f3605f;
        }

        /* renamed from: R0 */
        public final ImageView mo31076R0() {
            return this.f3606g;
        }

        /* renamed from: l2 */
        public final TextView mo31077l2() {
            return this.f3604e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4324g(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* renamed from: b */
    public void mo31061b(C4322e eVar, Card card) {
        boolean z;
        String str;
        C12775o.m28639i(eVar, "viewHolder");
        C12775o.m28639i(card, "card");
        if (card instanceof ShortNewsCard) {
            super.mo31061b(eVar, card);
            C4326b bVar = (C4326b) eVar;
            TextView l2 = bVar.mo31077l2();
            if (l2 != null) {
                setOptionalTextView(l2, ((ShortNewsCard) card).getTitle());
            }
            TextView N0 = bVar.mo31075N0();
            if (N0 != null) {
                setOptionalTextView(N0, ((ShortNewsCard) card).getDescription());
            }
            ShortNewsCard shortNewsCard = (ShortNewsCard) card;
            String domain = shortNewsCard.getDomain();
            if (domain == null || C13754v.m31532t(domain)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = card.getUrl();
            } else {
                str = shortNewsCard.getDomain();
            }
            if (str != null) {
                bVar.mo31073b0(str);
            }
            mo31066f(bVar.mo31076R0(), 1.0f, shortNewsCard.getImageUrl(), card);
            mo31065e(bVar.mo31076R0());
            View view = eVar.itemView;
            view.setContentDescription(shortNewsCard.getTitle() + " . " + shortNewsCard.getDescription());
        }
    }

    /* renamed from: d */
    public C4322e mo31062d(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4193R.C4197layout.com_braze_short_news_content_card, viewGroup, false);
        C12775o.m28638h(inflate, "view");
        setViewBackground(inflate);
        return new C4326b(this, inflate);
    }
}
