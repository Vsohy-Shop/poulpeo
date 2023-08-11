package com.braze.p055ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;

/* renamed from: com.braze.ui.contentcards.view.d */
/* compiled from: CaptionedImageContentCardView.kt */
public class C4320d extends C4319c<CaptionedImageCard> {

    /* renamed from: com.braze.ui.contentcards.view.d$a */
    /* compiled from: CaptionedImageContentCardView.kt */
    private final class C4321a extends C4322e {

        /* renamed from: e */
        private final TextView f3596e;

        /* renamed from: f */
        private final TextView f3597f;

        /* renamed from: g */
        private final ImageView f3598g;

        /* renamed from: h */
        final /* synthetic */ C4320d f3599h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4321a(C4320d dVar, View view) {
            super(view, dVar.isUnreadIndicatorEnabled());
            C12775o.m28639i(dVar, "this$0");
            C12775o.m28639i(view, "view");
            this.f3599h = dVar;
            this.f3596e = (TextView) view.findViewById(C4193R.C4196id.com_braze_content_cards_captioned_image_title);
            this.f3597f = (TextView) view.findViewById(C4193R.C4196id.com_braze_content_cards_captioned_image_description);
            this.f3598g = (ImageView) view.findViewById(C4193R.C4196id.com_braze_content_cards_captioned_image_card_image);
        }

        /* renamed from: N0 */
        public final TextView mo31068N0() {
            return this.f3597f;
        }

        /* renamed from: R0 */
        public final ImageView mo31069R0() {
            return this.f3598g;
        }

        /* renamed from: l2 */
        public final TextView mo31070l2() {
            return this.f3596e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4320d(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* renamed from: b */
    public void mo31061b(C4322e eVar, Card card) {
        boolean z;
        String str;
        C12775o.m28639i(eVar, "viewHolder");
        C12775o.m28639i(card, "card");
        if (card instanceof CaptionedImageCard) {
            super.mo31061b(eVar, card);
            C4321a aVar = (C4321a) eVar;
            TextView l2 = aVar.mo31070l2();
            if (l2 != null) {
                setOptionalTextView(l2, ((CaptionedImageCard) card).getTitle());
            }
            TextView N0 = aVar.mo31068N0();
            if (N0 != null) {
                setOptionalTextView(N0, ((CaptionedImageCard) card).getDescription());
            }
            CaptionedImageCard captionedImageCard = (CaptionedImageCard) card;
            String domain = captionedImageCard.getDomain();
            if (domain == null || C13754v.m31532t(domain)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = card.getUrl();
            } else {
                str = captionedImageCard.getDomain();
            }
            if (str != null) {
                aVar.mo31073b0(str);
            }
            mo31066f(aVar.mo31069R0(), captionedImageCard.getAspectRatio(), captionedImageCard.getImageUrl(), card);
            View view = eVar.itemView;
            view.setContentDescription(captionedImageCard.getTitle() + " .  " + captionedImageCard.getDescription());
        }
    }

    /* renamed from: d */
    public C4322e mo31062d(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4193R.C4197layout.com_braze_captioned_image_content_card, viewGroup, false);
        C12775o.m28638h(inflate, "view");
        setViewBackground(inflate);
        return new C4321a(this, inflate);
    }
}
