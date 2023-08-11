package com.appboy.models.cards;

import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p042bo.app.C3023b2;
import p042bo.app.C3096d2;
import p116i0.C8063a;
import p126j0.C8278g;

public final class TextAnnouncementCard extends Card {
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String title;
    private final String url;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextAnnouncementCard(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C3023b2) null, (C8063a) null, (C3096d2) null, 28, (DefaultConstructorMarker) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(provider, "cardKeyProvider");
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return C13745o.m31511f("\n            TextAnnouncementCard{description='" + this.description + "'\n            title='" + this.title + "'\n            url='" + getUrl() + "'\n            domain='" + this.domain + "'\n            " + super.toString() + "}\n\n        ");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextAnnouncementCard(JSONObject jSONObject, CardKey.Provider provider, C3023b2 b2Var) {
        this(jSONObject, provider, b2Var, (C8063a) null, (C3096d2) null, 24, (DefaultConstructorMarker) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextAnnouncementCard(JSONObject jSONObject, CardKey.Provider provider, C3023b2 b2Var, C8063a<?> aVar) {
        this(jSONObject, provider, b2Var, aVar, (C3096d2) null, 16, (DefaultConstructorMarker) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(provider, "cardKeyProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextAnnouncementCard(JSONObject jSONObject, CardKey.Provider provider, C3023b2 b2Var, C8063a aVar, C3096d2 d2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, provider, (i & 4) != 0 ? null : b2Var, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : d2Var);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextAnnouncementCard(JSONObject jSONObject, CardKey.Provider provider, C3023b2 b2Var, C8063a<?> aVar, C3096d2 d2Var) {
        super(jSONObject, provider, b2Var, aVar, d2Var);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(provider, "cardKeyProvider");
        String string = jSONObject.getString(provider.getKey(CardKey.TEXT_ANNOUNCEMENT_DESCRIPTION));
        C12775o.m28638h(string, "jsonObject.getString(car…NNOUNCEMENT_DESCRIPTION))");
        this.description = string;
        this.title = C8278g.m16455i(jSONObject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_TITLE));
        this.url = C8278g.m16455i(jSONObject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_URL));
        this.domain = C8278g.m16455i(jSONObject, provider.getKey(CardKey.TEXT_ANNOUNCEMENT_DOMAIN));
        this.cardType = CardType.TEXT_ANNOUNCEMENT;
    }
}
