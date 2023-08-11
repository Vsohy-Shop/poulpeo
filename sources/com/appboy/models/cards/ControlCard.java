package com.appboy.models.cards;

import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import kotlin.jvm.internal.C12775o;
import org.json.JSONObject;
import p042bo.app.C3023b2;
import p042bo.app.C3096d2;
import p116i0.C8063a;

public final class ControlCard extends Card {
    private final CardType cardType = CardType.CONTROL;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ControlCard(JSONObject jSONObject, CardKey.Provider provider, C3023b2 b2Var, C8063a<?> aVar, C3096d2 d2Var) {
        super(jSONObject, provider, b2Var, aVar, d2Var);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(provider, "cardKeysProvider");
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public String toString() {
        return "ControlCard{" + super.toString() + '}';
    }
}
