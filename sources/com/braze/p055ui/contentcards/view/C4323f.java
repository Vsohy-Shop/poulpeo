package com.braze.p055ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;

/* renamed from: com.braze.ui.contentcards.view.f */
/* compiled from: DefaultContentCardView.kt */
public class C4323f extends C4319c<Card> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4323f(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* renamed from: b */
    public void mo31061b(C4322e eVar, Card card) {
        C12775o.m28639i(eVar, "viewHolder");
        C12775o.m28639i(card, "card");
    }

    /* renamed from: d */
    public C4322e mo31062d(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4193R.C4197layout.com_braze_default_content_card, viewGroup, false);
        C12775o.m28638h(inflate, "view");
        return new C4322e(inflate, false);
    }
}
