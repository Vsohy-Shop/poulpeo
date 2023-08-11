package com.braze.p055ui.contentcards.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.widget.BaseCardView;
import kotlin.jvm.internal.C12775o;
import p146l0.C8619a;
import p146l0.C8622c;
import p206r0.C9359b;
import p216s0.C9422a;

/* renamed from: com.braze.ui.contentcards.view.c */
/* compiled from: BaseContentCardView.kt */
public abstract class C4319c<T extends Card> extends BaseCardView<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4319c(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m4985c(C4319c cVar, Card card, C8622c cVar2, View view) {
        C12775o.m28639i(cVar, "this$0");
        C12775o.m28639i(card, "$card");
        cVar.handleCardClick(cVar.applicationContext, card, cVar2);
    }

    /* renamed from: b */
    public void mo31061b(C4322e eVar, Card card) {
        boolean z;
        C12775o.m28639i(eVar, "viewHolder");
        C12775o.m28639i(card, "card");
        eVar.mo31071J0(card.isPinned());
        boolean z2 = true;
        if (!this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() || card.isIndicatorHighlighted()) {
            z = false;
        } else {
            z = true;
        }
        eVar.mo31072M0(z);
        C8622c uriActionForCard = BaseCardView.getUriActionForCard(card);
        eVar.itemView.setOnClickListener(new C4318b(this, card, uriActionForCard));
        if (uriActionForCard == null) {
            z2 = false;
        }
        eVar.mo31074t0(z2);
    }

    /* renamed from: d */
    public abstract C4322e mo31062d(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo31065e(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    /* renamed from: f */
    public final void mo31066f(ImageView imageView, float f, String str, Card card) {
        C12775o.m28639i(card, "card");
        if (imageView != null && str != null) {
            setImageViewToUrl(imageView, str, f, card);
        }
    }

    /* access modifiers changed from: protected */
    public boolean isClickHandled(Context context, Card card, C8619a aVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(card, "card");
        C9359b b = C9422a.f14005b.mo43843a().mo43841b();
        if (b != null && b.mo43785a(context, card, aVar)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void setViewBackground(View view) {
        C12775o.m28639i(view, "view");
        view.setBackground(getResources().getDrawable(C4193R.C4195drawable.com_braze_content_card_background));
        view.setForeground(getResources().getDrawable(C4193R.C4195drawable.com_braze_content_card_scrim));
    }
}
