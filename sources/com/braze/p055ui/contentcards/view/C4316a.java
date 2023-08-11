package com.braze.p055ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;

/* renamed from: com.braze.ui.contentcards.view.a */
/* compiled from: BannerImageContentCardView.kt */
public class C4316a extends C4319c<BannerImageCard> {

    /* renamed from: com.braze.ui.contentcards.view.a$a */
    /* compiled from: BannerImageContentCardView.kt */
    private final class C4317a extends C4322e {

        /* renamed from: e */
        private final ImageView f3591e;

        /* renamed from: f */
        final /* synthetic */ C4316a f3592f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4317a(C4316a aVar, View view) {
            super(view, aVar.isUnreadIndicatorEnabled());
            C12775o.m28639i(aVar, "this$0");
            C12775o.m28639i(view, "view");
            this.f3592f = aVar;
            this.f3591e = (ImageView) view.findViewById(C4193R.C4196id.com_braze_content_cards_banner_image_card_image);
        }

        /* renamed from: N0 */
        public final ImageView mo31063N0() {
            return this.f3591e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4316a(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* renamed from: b */
    public void mo31061b(C4322e eVar, Card card) {
        C12775o.m28639i(eVar, "viewHolder");
        C12775o.m28639i(card, "card");
        if (card instanceof BannerImageCard) {
            super.mo31061b(eVar, card);
            BannerImageCard bannerImageCard = (BannerImageCard) card;
            mo31066f(((C4317a) eVar).mo31063N0(), bannerImageCard.getAspectRatio(), bannerImageCard.getImageUrl(), card);
        }
    }

    /* renamed from: d */
    public C4322e mo31062d(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4193R.C4197layout.com_braze_banner_image_content_card, viewGroup, false);
        C12775o.m28638h(inflate, "view");
        setViewBackground(inflate);
        return new C4317a(this, inflate);
    }
}
