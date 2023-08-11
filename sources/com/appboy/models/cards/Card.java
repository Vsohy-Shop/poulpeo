package com.appboy.models.cards;

import com.appboy.enums.CardCategory;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.enums.Channel;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p042bo.app.C3023b2;
import p042bo.app.C3096d2;
import p042bo.app.C3785x1;
import p057d0.C7213c;
import p116i0.C8063a;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8278g;
import p404of.C13074a;

public class Card implements C7213c<JSONObject> {
    public static final C4160a Companion = new C4160a((DefaultConstructorMarker) null);
    private static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    private final C3023b2 brazeManager;
    private final C3096d2 cardAnalytics;
    private final C8063a<?> cardStorage;
    private final CardType cardType;
    private EnumSet<CardCategory> categories;
    private final Channel channel;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;

    /* renamed from: id */
    private final String f3281id;
    private boolean isClicked;
    private final boolean isContentCard;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final long updated;
    private final String url;
    private boolean wasViewedInternal;

    /* renamed from: com.appboy.models.cards.Card$a */
    public static final class C4160a {
        public /* synthetic */ C4160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4160a() {
        }
    }

    /* renamed from: com.appboy.models.cards.Card$b */
    public static final class C4161b extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f3282b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4161b(JSONArray jSONArray) {
            super(1);
            this.f3282b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo30592a(int i) {
            return Boolean.valueOf(this.f3282b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo30592a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$c */
    public static final class C4162c extends C12777p implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f3283b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4162c(JSONArray jSONArray) {
            super(1);
            this.f3283b = jSONArray;
        }

        /* renamed from: a */
        public final String mo30593a(int i) {
            Object obj = this.f3283b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo30593a(((Number) obj).intValue());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$d */
    static final class C4163d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C4163d f3284b = new C4163d();

        C4163d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot dismiss a card more than once. Doing nothing.";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$e */
    static final class C4164e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C4164e f3285b = new C4164e();

        C4164e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log card as dismissed.";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$f */
    static final class C4165f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C4165f f3286b = new C4165f();

        C4165f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to mark card indicator as highlighted.";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$g */
    static final class C4166g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C4166g f3287b = new C4166g();

        C4166g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Card ID cannot be null";
        }
    }

    /* renamed from: com.appboy.models.cards.Card$h */
    static final class C4167h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Card f3288b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4167h(Card card) {
            super(0);
            this.f3288b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Logged click for card with id: ", this.f3288b.getId());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$i */
    static final class C4168i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Card f3289b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4168i(Card card) {
            super(0);
            this.f3289b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to log card clicked for id: ", this.f3289b.getId());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$j */
    static final class C4169j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Card f3290b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4169j(Card card) {
            super(0);
            this.f3290b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to log card as clicked for id: ", this.f3290b.getId());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$k */
    static final class C4170k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Card f3291b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4170k(Card card) {
            super(0);
            this.f3291b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Logging impression event for card with id: ", this.f3291b.getId());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$l */
    static final class C4171l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Card f3292b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4171l(Card card) {
            super(0);
            this.f3292b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Logging control impression event for card with id: ", this.f3292b.getId());
        }
    }

    /* renamed from: com.appboy.models.cards.Card$m */
    static final class C4172m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Card f3293b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4172m(Card card) {
            super(0);
            this.f3293b = card;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to log card impression for card id: ", this.f3293b.getId());
        }
    }

    public Card(JSONObject jSONObject, CardKey.Provider provider, C3023b2 b2Var, C8063a<?> aVar, C3096d2 d2Var) {
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(provider, "cardKeysProvider");
        this.jsonObject = jSONObject;
        this.brazeManager = b2Var;
        this.cardStorage = aVar;
        this.cardAnalytics = d2Var;
        this.extras = C8278g.m16450d(jSONObject.optJSONObject(provider.getKey(CardKey.EXTRAS)));
        String string = jSONObject.getString(provider.getKey(CardKey.ID));
        C12775o.m28638h(string, "jsonObject.getString(car…vider.getKey(CardKey.ID))");
        this.f3281id = string;
        this.isContentCard = provider.isContentCardProvider();
        this.cardType = CardType.DEFAULT;
        this.channel = provider.isContentCardProvider() ? Channel.CONTENT_CARD : Channel.NEWS_FEED;
        this.wasViewedInternal = jSONObject.optBoolean(provider.getKey(CardKey.VIEWED));
        this.isDismissedInternal = jSONObject.optBoolean(provider.getKey(CardKey.DISMISSED), false);
        this.isPinned = jSONObject.optBoolean(provider.getKey(CardKey.PINNED), false);
        this.created = jSONObject.getLong(provider.getKey(CardKey.CREATED));
        this.expiresAt = jSONObject.optLong(provider.getKey(CardKey.EXPIRES_AT), -1);
        this.openUriInWebView = jSONObject.optBoolean(provider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.isRemoved = jSONObject.optBoolean(provider.getKey(CardKey.REMOVED), false);
        JSONArray optJSONArray = jSONObject.optJSONArray(provider.getKey(CardKey.CATEGORIES));
        if (optJSONArray == null || optJSONArray.length() == 0) {
            this.categories = EnumSet.of(CardCategory.NO_CATEGORY);
        } else {
            EnumSet<CardCategory> noneOf = EnumSet.noneOf(CardCategory.class);
            for (String str : C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, optJSONArray.length())), new C4161b(optJSONArray)), new C4162c(optJSONArray))) {
                CardCategory cardCategory = CardCategory.get(str);
                if (cardCategory != null) {
                    noneOf.add(cardCategory);
                }
            }
            this.categories = noneOf;
        }
        this.updated = this.jsonObject.optLong(provider.getKey(CardKey.UPDATED), this.created);
        this.isDismissibleByUser = this.jsonObject.optBoolean(provider.getKey(CardKey.DISMISSIBLE), false);
        this.isIndicatorHighlightedInternal = this.jsonObject.optBoolean(provider.getKey(CardKey.READ), this.wasViewedInternal);
        this.isClicked = this.jsonObject.optBoolean(provider.getKey(CardKey.CLICKED), false);
        this.isTest = this.jsonObject.optBoolean(provider.getKey(CardKey.IS_TEST), false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C12775o.m28634d(getClass(), obj.getClass())) {
            return false;
        }
        Card card = (Card) obj;
        if (this.updated != card.updated || !C12775o.m28634d(this.f3281id, card.f3281id)) {
            return false;
        }
        return true;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final EnumSet<CardCategory> getCategories() {
        return this.categories;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final long getCreated() {
        return this.created;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.f3281id;
    }

    public final ICardListener getListener() {
        return this.listener;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public final long getUpdated() {
        return this.updated;
    }

    public String getUrl() {
        return this.url;
    }

    public final boolean getViewed() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        long j = this.updated;
        return (this.f3281id.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final boolean isContentCard() {
        return this.isContentCard;
    }

    public final boolean isControl() {
        if (getCardType() == CardType.CONTROL) {
            return true;
        }
        return false;
    }

    public final boolean isDismissed() {
        return this.isDismissedInternal;
    }

    public final boolean isDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j = this.expiresAt;
        if (j == -1 || j > C8273e.m16436i()) {
            return false;
        }
        return true;
    }

    public final boolean isInCategorySet(EnumSet<CardCategory> enumSet) {
        C12775o.m28639i(enumSet, "categories");
        EnumSet<CardCategory> enumSet2 = this.categories;
        if (enumSet2 == null) {
            return false;
        }
        Iterator<CardCategory> it = enumSet.iterator();
        while (it.hasNext()) {
            if (enumSet2.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isIndicatorHighlighted() {
        return this.isIndicatorHighlightedInternal;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isRemoved() {
        return this.isRemoved;
    }

    public final boolean isTest() {
        return this.isTest;
    }

    public final boolean isValidCard() {
        if (!C13754v.m31532t(this.f3281id)) {
            return true;
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4166g.f3287b, 6, (Object) null);
        return false;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4168i(this), 6, (Object) null);
                return false;
            }
            C3785x1 a = this.cardAnalytics.mo28819a(this.f3281id);
            if (a != null) {
                this.brazeManager.mo28641a(a);
            }
            this.cardStorage.markCardAsClicked(this.f3281id);
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4167h(this), 7, (Object) null);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C4169j(this), 4, (Object) null);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager == null || this.cardAnalytics == null || this.cardStorage == null || !isValidCard()) {
                return false;
            }
            if (!isControl()) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C4170k(this), 6, (Object) null);
                C3785x1 c = this.cardAnalytics.mo28821c(this.f3281id);
                if (c != null) {
                    this.brazeManager.mo28641a(c);
                }
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C4171l(this), 6, (Object) null);
                C3785x1 b = this.cardAnalytics.mo28820b(this.f3281id);
                if (b != null) {
                    this.brazeManager.mo28641a(b);
                }
            }
            this.cardStorage.markCardAsViewed(this.f3281id);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, new C4172m(this), 4, (Object) null);
            return false;
        }
    }

    public final void setDismissed(boolean z) {
        if (!this.isDismissedInternal || !z) {
            this.isDismissedInternal = z;
            C8063a<?> aVar = this.cardStorage;
            if (aVar != null) {
                aVar.markCardAsDismissed(this.f3281id);
            }
            if (z) {
                try {
                    if (this.brazeManager != null && this.cardAnalytics != null && isValidCard()) {
                        C3785x1 d = this.cardAnalytics.mo28822d(this.f3281id);
                        if (d != null) {
                            this.brazeManager.mo28641a(d);
                        }
                    }
                } catch (Exception e) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C4164e.f3285b, 4, (Object) null);
                }
            }
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4163d.f3284b, 6, (Object) null);
        }
    }

    public final void setDismissibleByUser(boolean z) {
        this.isDismissibleByUser = z;
    }

    public final void setIndicatorHighlighted(boolean z) {
        C8063a<?> aVar;
        this.isIndicatorHighlightedInternal = z;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (z && (aVar = this.cardStorage) != null) {
            try {
                aVar.markCardAsVisuallyRead(this.f3281id);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.D, e, false, C4165f.f3286b, 4, (Object) null);
            }
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setPinned(boolean z) {
        this.isPinned = z;
    }

    public final void setTest(boolean z) {
        this.isTest = z;
    }

    public final void setViewed(boolean z) {
        this.wasViewedInternal = z;
        C8063a<?> aVar = this.cardStorage;
        if (aVar != null) {
            aVar.markCardAsViewed(this.f3281id);
        }
    }

    public String toString() {
        return C13745o.m31511f("\n            Card{\n            extras=" + this.extras + "\n            id='" + this.f3281id + "'\n            created=" + this.created + "\n            updated=" + this.updated + "\n            expiresAt=" + this.expiresAt + "\n            categories=" + this.categories + "\n            isContentCard=" + this.isContentCard + "\n            viewed=" + this.wasViewedInternal + "\n            isRead=" + this.isIndicatorHighlightedInternal + "\n            isDismissed=" + this.isDismissedInternal + "\n            isRemoved=" + this.isRemoved + "\n            isPinned=" + this.isPinned + "\n            isClicked=" + this.isClicked + "\n            openUriInWebview=" + this.openUriInWebView + "\n            isDismissibleByUser=" + this.isDismissibleByUser + "\n            isTest=" + this.isTest + "\n            json=" + C8278g.m16456j(this.jsonObject) + "\n            }\n\n        ");
    }

    public JSONObject forJsonPut() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    public static /* synthetic */ void getViewed$annotations() {
    }

    public static /* synthetic */ void isDismissed$annotations() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Card(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C3023b2) null, (C8063a<?>) null, (C3096d2) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(provider, "cardKeyProvider");
    }
}
