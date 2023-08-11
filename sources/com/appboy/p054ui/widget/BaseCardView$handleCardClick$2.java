package com.appboy.p054ui.widget;

import com.appboy.models.cards.Card;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: com.appboy.ui.widget.BaseCardView$handleCardClick$2 */
/* compiled from: BaseCardView.kt */
final class BaseCardView$handleCardClick$2 extends C12777p implements C13074a<String> {
    final /* synthetic */ Card $card;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseCardView$handleCardClick$2(Card card) {
        super(0);
        this.$card = card;
    }

    public final String invoke() {
        return C12775o.m28647q("Card action is non-null. Attempting to perform action on card: ", this.$card.getId());
    }
}
