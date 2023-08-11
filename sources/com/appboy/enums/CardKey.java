package com.appboy.enums;

import com.appboy.Constants;
import com.facebook.applinks.AppLinkData;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8278g;
import p336ef.C11915r;
import p404of.C13074a;

public enum CardKey {
    ID("id", "id"),
    VIEWED("viewed", "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS(AppLinkData.ARGUMENTS_EXTRAS_KEY, "e"),
    OPEN_URI_IN_WEBVIEW("use_webview", "uw"),
    TYPE(JSONAPIResourceIdSerializer.FIELD_TYPE, "tp"),
    CATEGORIES("categories", ""),
    UPDATED("updated", ""),
    DISMISSED("", Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE),
    REMOVED("", "r"),
    PINNED("", Constants.APPBOY_PUSH_PRIORITY_KEY),
    DISMISSIBLE("", "db"),
    IS_TEST("", Constants.APPBOY_PUSH_TITLE_KEY),
    READ("", "read"),
    CLICKED("", "cl"),
    BANNER_IMAGE_IMAGE("image", "i"),
    BANNER_IMAGE_URL("url", "u"),
    BANNER_IMAGE_DOMAIN("domain", ""),
    BANNER_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE("image", "i"),
    CAPTIONED_IMAGE_TITLE("title", "tt"),
    CAPTIONED_IMAGE_DESCRIPTION("description", "ds"),
    CAPTIONED_IMAGE_URL("url", "u"),
    CAPTIONED_IMAGE_DOMAIN("domain", "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", "tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION("description", "ds"),
    TEXT_ANNOUNCEMENT_URL("url", "u"),
    TEXT_ANNOUNCEMENT_DOMAIN("domain", "dm"),
    SHORT_NEWS_IMAGE("image", "i"),
    SHORT_NEWS_TITLE("title", "tt"),
    SHORT_NEWS_DESCRIPTION("description", "ds"),
    SHORT_NEWS_URL("url", "u"),
    SHORT_NEWS_DOMAIN("domain", "dm");
    
    private static final String BANNER_IMAGE_KEY = "banner_image";
    private static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    private static final String CONTROL_KEY = "control";
    public static final C4157a Companion = null;
    private static final String SHORT_NEWS_KEY = "short_news";
    private static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    /* access modifiers changed from: private */
    public static final Map<String, CardType> cardTypeMap = null;
    private final String contentCardsKey;
    private final String feedKey;

    public static final class Provider {
        public static final Provider CONTENT_CARDS = null;
        public static final C4155a Companion = null;
        public static final Provider NEWS_FEED = null;
        private final boolean isContentCardProvider;

        /* renamed from: com.appboy.enums.CardKey$Provider$a */
        public static final class C4155a {
            public /* synthetic */ C4155a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C4155a() {
            }
        }

        /* renamed from: com.appboy.enums.CardKey$Provider$b */
        static final class C4156b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ JSONObject f3278b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4156b(JSONObject jSONObject) {
                super(0);
                this.f3278b = jSONObject;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Short News card doesn't contain image url, parsing type as Text Announcement. JSON: ", this.f3278b);
            }
        }

        static {
            Companion = new C4155a((DefaultConstructorMarker) null);
            CONTENT_CARDS = new Provider(true);
            NEWS_FEED = new Provider(false);
        }

        public Provider(boolean z) {
            this.isContentCardProvider = z;
        }

        public final CardType getCardTypeFromJson(JSONObject jSONObject) {
            boolean z;
            C12775o.m28639i(jSONObject, "jsonObject");
            String i = C8278g.m16455i(jSONObject, getKey(CardKey.TYPE));
            boolean z2 = false;
            if (i == null || i.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && this.isContentCardProvider && C12775o.m28634d(i, CardKey.SHORT_NEWS_KEY)) {
                String i2 = C8278g.m16455i(jSONObject, getKey(CardKey.SHORT_NEWS_IMAGE));
                if (i2 == null || i2.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C4156b(jSONObject), 6, (Object) null);
                    i = CardKey.TEXT_ANNOUNCEMENT_KEY;
                }
            }
            if (CardKey.cardTypeMap.containsKey(i)) {
                return (CardType) CardKey.cardTypeMap.get(i);
            }
            return CardType.DEFAULT;
        }

        public final String getKey(CardKey cardKey) {
            C12775o.m28639i(cardKey, "key");
            if (this.isContentCardProvider) {
                return cardKey.getContentCardsKey();
            }
            return cardKey.getFeedKey();
        }

        public final String getServerKeyFromCardType(CardType cardType) {
            C12775o.m28639i(cardType, "cardType");
            for (Map.Entry entry : CardKey.cardTypeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (cardType == ((CardType) entry.getValue())) {
                    return str;
                }
            }
            return null;
        }

        public final boolean isContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    /* renamed from: com.appboy.enums.CardKey$a */
    public static final class C4157a {
        public /* synthetic */ C4157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4157a() {
        }
    }

    static {
        Companion = new C4157a((DefaultConstructorMarker) null);
        cardTypeMap = C12716r0.m28419j(C11915r.m25707a(BANNER_IMAGE_KEY, CardType.BANNER), C11915r.m25707a(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE), C11915r.m25707a(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT), C11915r.m25707a(SHORT_NEWS_KEY, CardType.SHORT_NEWS), C11915r.m25707a(CONTROL_KEY, CardType.CONTROL));
    }

    private CardKey(String str, String str2) {
        this.feedKey = str;
        this.contentCardsKey = str2;
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
