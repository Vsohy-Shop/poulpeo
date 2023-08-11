package com.appboy.models.push;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.Person;
import androidx.core.view.GravityCompat;
import androidx.webkit.ProxyConfig;
import com.appboy.Constants;
import com.braze.configuration.C4218b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p126j0.C8272d;
import p126j0.C8278g;
import p270x.C10345g;
import p404of.C13074a;

public final class BrazeNotificationPayload {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private C4218b configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private Map<String, String> extras;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private boolean shouldFetchTestTriggers;
    private boolean shouldRefreshFeatureFlags;
    private boolean shouldSyncGeofences;
    private String summaryText;
    private String titleText;

    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle bundle, int i) {
            C12775o.m28639i(bundle, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.type = companion.getTemplateFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_ID_KEY_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_URI_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE);
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_ACTION_TEXT_KEY_TEMPLATE);
        }

        public final String getActionId() {
            return this.actionId;
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUri() {
            return this.uri;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void putIntoBundle(Bundle bundle) {
            C12775o.m28639i(bundle, "destination");
            bundle.putInt(Constants.APPBOY_ACTION_INDEX_KEY, this.actionIndex);
            bundle.putString(Constants.APPBOY_ACTION_TYPE_KEY, this.type);
            bundle.putString(Constants.APPBOY_ACTION_ID_KEY, this.actionId);
            bundle.putString(Constants.APPBOY_ACTION_URI_KEY, this.uri);
            bundle.putString(Constants.APPBOY_ACTION_USE_WEBVIEW_KEY, this.useWebview);
        }

        public final void setActionId(String str) {
            this.actionId = str;
        }

        public final void setActionIndex(int i) {
            this.actionIndex = i;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setUri(String str) {
            this.uri = str;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("Type", this.type));
            sb.append(companion.stringAndKey("Id", this.actionId));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            sb.append(companion.stringAndKey("Text", this.text));
            return sb.toString();
        }
    }

    public static final class Companion {

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$a */
        static final class C4179a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C4179a f3297b = new C4179a();

            C4179a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse action field boolean. Returning default.";
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$b */
        static final class C4180b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C4180b f3298b = new C4180b();

            C4180b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse action field long. Returning default.";
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$c */
        static final class C4181c extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3299b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3300c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4181c(String str, Bundle bundle) {
                super(0);
                this.f3299b = str;
                this.f3300c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse long with key " + this.f3299b + " and bundle: " + this.f3300c;
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$d */
        static final class C4182d extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3301b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3302c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4182d(String str, Bundle bundle) {
                super(0);
                this.f3301b = str;
                this.f3302c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse non blank string with key " + this.f3301b + " and bundle: " + this.f3302c;
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$e */
        static final class C4183e extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3303b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3304c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4183e(String str, Bundle bundle) {
                super(0);
                this.f3303b = str;
                this.f3304c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.f3303b + " and bundle: " + this.f3304c;
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$f */
        static final class C4184f extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3305b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3306c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4184f(String str, Bundle bundle) {
                super(0);
                this.f3305b = str;
                this.f3306c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string with key " + this.f3305b + " and bundle: " + this.f3306c;
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$g */
        static final class C4185g extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3307b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3308c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4185g(String str, Bundle bundle) {
                super(0);
                this.f3307b = str;
                this.f3308c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as boolean with key " + this.f3307b + " and bundle: " + this.f3308c;
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$h */
        static final class C4186h extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3309b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3310c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4186h(String str, Bundle bundle) {
                super(0);
                this.f3309b = str;
                this.f3310c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as color int with key " + this.f3309b + " and bundle: " + this.f3310c;
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$i */
        static final class C4187i extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3311b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3312c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4187i(String str, Bundle bundle) {
                super(0);
                this.f3311b = str;
                this.f3312c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.f3311b + " and bundle: " + this.f3312c;
            }
        }

        /* renamed from: com.appboy.models.push.BrazeNotificationPayload$Companion$j */
        static final class C4188j extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f3313b;

            /* renamed from: c */
            final /* synthetic */ Bundle f3314c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4188j(String str, Bundle bundle) {
                super(0);
                this.f3313b = str;
                this.f3314c = bundle;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as long with key " + this.f3313b + " and bundle: " + this.f3314c;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String stringAndKey(String str, Object obj) {
            if (obj == null) {
                return "";
            }
            return 10 + str + " = " + obj;
        }

        public final Bundle getAttachedAppboyExtras(Bundle bundle) {
            return getAttachedBrazeExtras(bundle);
        }

        public final Bundle getAttachedBrazeExtras(Bundle bundle) {
            if (bundle == null) {
                return new Bundle();
            }
            if (bundle.containsKey(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED) && !bundle.getBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                Bundle bundle2 = bundle.getBundle(Constants.APPBOY_PUSH_EXTRAS_KEY);
                if (bundle2 == null) {
                    return new Bundle();
                }
                return bundle2;
            } else if (C10345g.m21724a()) {
                return new Bundle(bundle);
            } else {
                Object obj = bundle.get(Constants.APPBOY_PUSH_EXTRAS_KEY);
                if (obj instanceof String) {
                    return C8278g.m16460n((String) obj);
                }
                if (obj instanceof Bundle) {
                    return (Bundle) obj;
                }
                return new Bundle();
            }
        }

        public final int getPushStoryGravityAtIndex(int i, Bundle bundle, String str) {
            boolean z;
            C12775o.m28639i(bundle, "notificationExtras");
            C12775o.m28639i(str, "actionFieldKeyTemplate");
            String string = bundle.getString(C13754v.m31521A(str, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i), false, 4, (Object) null));
            if (string == null || C13754v.m31532t(string)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int hashCode = string.hashCode();
                if (hashCode == -1364013995) {
                    string.equals("center");
                } else if (hashCode != 100571) {
                    if (hashCode == 109757538 && string.equals("start")) {
                        return 8388611;
                    }
                } else if (!string.equals("end")) {
                    return 17;
                } else {
                    return GravityCompat.END;
                }
            }
            return 17;
        }

        public final String getTemplateFieldAtIndex(int i, Bundle bundle, String str) {
            C12775o.m28639i(bundle, "notificationExtras");
            C12775o.m28639i(str, "actionFieldKeyTemplate");
            return getTemplateFieldAtIndex(i, bundle, str, "");
        }

        public final Long parseLong(Bundle bundle, String str) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    return Long.valueOf(bundle.getLong(str));
                }
                return null;
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4181c(str, bundle), 7, (Object) null);
                return null;
            }
        }

        public final String parseNonBlankString(Bundle bundle, String str) {
            boolean z;
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                String parseString = parseString(bundle, str);
                if (parseString == null || C13754v.m31532t(parseString)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return parseString;
                }
                return null;
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4182d(str, bundle), 7, (Object) null);
                return null;
            }
        }

        public final int parseObjectAsInteger(Bundle bundle, String str, int i) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        return Integer.parseInt(obj.toString());
                    }
                }
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4183e(str, bundle), 7, (Object) null);
            }
            return i;
        }

        public final String parseString(Bundle bundle, String str) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    return bundle.getString(str);
                }
                return null;
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4184f(str, bundle), 7, (Object) null);
                return null;
            }
        }

        public final boolean parseStringAsBoolean(Bundle bundle, String str) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return false;
                }
                return Boolean.parseBoolean(string);
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4185g(str, bundle), 7, (Object) null);
                return false;
            }
        }

        public final Integer parseStringAsColorInt(Bundle bundle, String str) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                return Integer.valueOf((int) Long.parseLong(string));
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4186h(str, bundle), 7, (Object) null);
                return null;
            }
        }

        public final Integer parseStringAsInteger(Bundle bundle, String str) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                return Integer.valueOf(Integer.parseInt(string));
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4187i(str, bundle), 7, (Object) null);
                return null;
            }
        }

        public final Long parseStringAsLong(Bundle bundle, String str) {
            C12775o.m28639i(bundle, "bundle");
            C12775o.m28639i(str, "key");
            try {
                if (!bundle.containsKey(str)) {
                    return null;
                }
                String string = bundle.getString(str);
                if (string == null) {
                    return null;
                }
                return Long.valueOf(Long.parseLong(string));
            } catch (Exception unused) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4188j(str, bundle), 7, (Object) null);
                return null;
            }
        }

        private Companion() {
        }

        public final String getTemplateFieldAtIndex(int i, Bundle bundle, String str, String str2) {
            C12775o.m28639i(bundle, "notificationExtras");
            C12775o.m28639i(str, "actionFieldKeyTemplate");
            String string = bundle.getString(C13754v.m31521A(str, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i), false, 4, (Object) null));
            return string == null ? str2 : string;
        }

        public final boolean getTemplateFieldAtIndex(int i, Bundle bundle, String str, boolean z) {
            C12775o.m28639i(bundle, "notificationExtras");
            C12775o.m28639i(str, "actionFieldKeyTemplate");
            String string = bundle.getString(C13754v.m31521A(str, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i), false, 4, (Object) null));
            if (string == null) {
                return z;
            }
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4179a.f3297b, 4, (Object) null);
                return z;
            }
        }

        public final long getTemplateFieldAtIndex(int i, Bundle bundle, String str, long j) {
            C12775o.m28639i(bundle, "notificationExtras");
            C12775o.m28639i(str, "actionFieldKeyTemplate");
            String string = bundle.getString(C13754v.m31521A(str, ProxyConfig.MATCH_ALL_SCHEMES, String.valueOf(i), false, 4, (Object) null));
            if (string == null) {
                return j;
            }
            try {
                return Long.parseLong(string);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4180b.f3298b, 4, (Object) null);
                return j;
            }
        }
    }

    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle bundle, int i) {
            C12775o.m28639i(bundle, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.message = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            this.timestamp = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE, 0);
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE);
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("Message", this.message));
            sb.append(companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)));
            sb.append(companion.stringAndKey("PersonId", this.personId));
            return sb.toString();
        }
    }

    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle bundle, int i) {
            C12775o.m28639i(bundle, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            this.name = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE);
            this.uri = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE, (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE, false);
            this.isBot = companion.getTemplateFieldAtIndex(i, bundle, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE, false);
        }

        public final String getName() {
            return this.name;
        }

        public final Person getPerson() {
            Person build = new Person.Builder().setKey(this.personId).setName(this.name).setUri(this.uri).setBot(this.isBot).setImportant(this.isImportant).build();
            C12775o.m28638h(build, "Builder()\n              …\n                .build()");
            return build;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final String getUri() {
            return this.uri;
        }

        public final boolean isBot() {
            return this.isBot;
        }

        public final boolean isImportant() {
            return this.isImportant;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("PersonId", this.personId));
            sb.append(companion.stringAndKey("Name", this.name));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)));
            sb.append(companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot)));
            return sb.toString();
        }
    }

    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle bundle, int i) {
            C12775o.m28639i(bundle, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.campaignId = companion.parseString(bundle, Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_TITLE_KEY_TEMPLATE);
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_SUBTITLE_KEY_TEMPLATE);
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_ID_KEY_TEMPLATE, "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE);
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, Constants.APPBOY_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE);
        }

        public final int getActionIndex() {
            return this.actionIndex;
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public final void setActionIndex(int i) {
            this.actionIndex = i;
        }

        public final void setBitmapUrl(String str) {
            this.bitmapUrl = str;
        }

        public final void setDeeplink(String str) {
            this.deeplink = str;
        }

        public final void setStoryPageId(String str) {
            this.storyPageId = str;
        }

        public final void setSubtitle(String str) {
            this.subtitle = str;
        }

        public final void setSubtitleGravity(int i) {
            this.subtitleGravity = i;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTitleGravity(int i) {
            this.titleGravity = i;
        }

        public final void setUseWebview(String str) {
            this.useWebview = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("CampaignId", this.campaignId));
            sb.append(companion.stringAndKey("Title", this.title));
            sb.append(companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity)));
            sb.append(companion.stringAndKey("Subtitle", this.subtitle));
            sb.append(companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity)));
            sb.append(companion.stringAndKey("BitmapUrl", this.bitmapUrl));
            sb.append(companion.stringAndKey("StoryPageId", this.storyPageId));
            sb.append(companion.stringAndKey("Deeplink", this.deeplink));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            return sb.toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle) {
        this(bundle, (Bundle) null, (Context) null, (C4218b) null, 14, (DefaultConstructorMarker) null);
    }

    public static final Bundle getAttachedAppboyExtras(Bundle bundle) {
        return Companion.getAttachedAppboyExtras(bundle);
    }

    public static final Bundle getAttachedBrazeExtras(Bundle bundle) {
        return Companion.getAttachedBrazeExtras(bundle);
    }

    public static final int getPushStoryGravityAtIndex(int i, Bundle bundle, String str) {
        return Companion.getPushStoryGravityAtIndex(i, bundle, str);
    }

    public static final long getTemplateFieldAtIndex(int i, Bundle bundle, String str, long j) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, j);
    }

    public static final Long parseLong(Bundle bundle, String str) {
        return Companion.parseLong(bundle, str);
    }

    public static final String parseNonBlankString(Bundle bundle, String str) {
        return Companion.parseNonBlankString(bundle, str);
    }

    public static final int parseObjectAsInteger(Bundle bundle, String str, int i) {
        return Companion.parseObjectAsInteger(bundle, str, i);
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || C13754v.m31532t(templateFieldAtIndex)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i));
                i++;
            } else {
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        String parseNonBlankString = Companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY);
        brazeNotificationPayload.bigImageUrl = parseNonBlankString;
        boolean z2 = false;
        if (parseNonBlankString == null || C13754v.m31532t(parseNonBlankString)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str = brazeNotificationPayload.extras.get(Constants.APPBOY_PUSH_BIG_IMAGE_URL_KEY);
            if (str == null || C13754v.m31532t(str)) {
                z2 = true;
            }
            if (!z2) {
                brazeNotificationPayload.bigImageUrl = str;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_BIG_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_BIG_TITLE_TEXT_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CONTENT_CARD_SYNC_DATA_KEY);
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        boolean z2;
        Companion companion = Companion;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY);
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY);
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE);
            if (templateFieldAtIndex == null || C13754v.m31532t(templateFieldAtIndex)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i));
            i++;
        }
        int i2 = 0;
        while (true) {
            String templateFieldAtIndex2 = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, Constants.BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE);
            if (templateFieldAtIndex2 == null || C13754v.m31532t(templateFieldAtIndex2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i2);
                brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
                i2++;
            } else {
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        Companion companion = Companion;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_DURATION_KEY);
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey(Constants.APPBOY_PUSH_STORY_KEY);
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CATEGORY_KEY);
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_VISIBILITY_KEY);
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_BADGE_COUNT_KEY);
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_PUBLIC_NOTIFICATION_KEY);
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CUSTOM_NOTIFICATION_ID);
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS);
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey(Constants.APPBOY_PUSH_INLINE_IMAGE_STYLE_KEY);
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey(Constants.BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY);
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_PRIORITY_KEY);
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY);
        brazeNotificationPayload.shouldSyncGeofences = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_SYNC_GEOFENCES_KEY);
        brazeNotificationPayload.shouldRefreshFeatureFlags = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "br_ffr");
        if (brazeNotificationPayload.notificationExtras.containsKey(Constants.APPBOY_PUSH_UNINSTALL_TRACKING_KEY) || brazeNotificationPayload.brazeExtras.containsKey(Constants.APPBOY_PUSH_UNINSTALL_TRACKING_KEY)) {
            z = true;
        } else {
            z = false;
        }
        brazeNotificationPayload.isUninstallTrackingPush = z;
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        brazeNotificationPayload.pushStoryPageIndex = Companion.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, Constants.APPBOY_STORY_INDEX_KEY, 0);
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            if (templateFieldAtIndex == null || C13754v.m31532t(templateFieldAtIndex)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i));
                i++;
            } else {
                brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED, false);
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_TITLE_KEY);
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_CONTENT_KEY);
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_LARGE_ICON_KEY);
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_KEY);
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, Constants.APPBOY_PUSH_ACCENT_KEY);
    }

    public static final String parseString(Bundle bundle, String str) {
        return Companion.parseString(bundle, str);
    }

    public static final boolean parseStringAsBoolean(Bundle bundle, String str) {
        return Companion.parseStringAsBoolean(bundle, str);
    }

    public static final Integer parseStringAsColorInt(Bundle bundle, String str) {
        return Companion.parseStringAsColorInt(bundle, str);
    }

    public static final Integer parseStringAsInteger(Bundle bundle, String str) {
        return Companion.parseStringAsInteger(bundle, str);
    }

    public static final Long parseStringAsLong(Bundle bundle, String str) {
        return Companion.parseStringAsLong(bundle, str);
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final C4218b getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final Long getNotificationReceivedTimestampMillis() {
        return this.notificationReceivedTimestampMillis;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldRefreshFeatureFlags() {
        return this.shouldRefreshFeatureFlags;
    }

    public final boolean getShouldSyncGeofences() {
        return this.shouldSyncGeofences;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final boolean isConversationalPush() {
        return this.isConversationalPush;
    }

    public final boolean isInlineImagePush() {
        return this.isInlineImagePush;
    }

    public final boolean isNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    public final boolean isPushStory() {
        return this.isPushStory;
    }

    public final boolean isUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setAccentColor(Integer num) {
        this.accentColor = num;
    }

    public final void setActionButtons(List<ActionButton> list) {
        C12775o.m28639i(list, "actionButtons");
        this.actionButtonsInternal = list;
    }

    public final void setBigImageUrl(String str) {
        this.bigImageUrl = str;
    }

    public final void setBigSummaryText(String str) {
        this.bigSummaryText = str;
    }

    public final void setBigTitleText(String str) {
        this.bigTitleText = str;
    }

    public final void setBrazeExtras(Bundle bundle) {
        C12775o.m28639i(bundle, "<set-?>");
        this.brazeExtras = bundle;
    }

    public final void setConfigurationProvider(C4218b bVar) {
        this.configurationProvider = bVar;
    }

    public final void setContentCardSyncData(String str) {
        this.contentCardSyncData = str;
    }

    public final void setContentCardSyncUserId(String str) {
        this.contentCardSyncUserId = str;
    }

    public final void setContentText(String str) {
        this.contentText = str;
    }

    public final void setContext(Context context2) {
        this.context = context2;
    }

    public final void setConversationShortcutId(String str) {
        this.conversationShortcutId = str;
    }

    public final void setConversationalPush(boolean z) {
        this.isConversationalPush = z;
    }

    public final void setCustomNotificationId(Integer num) {
        this.customNotificationId = num;
    }

    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    public final void setExtras(Map<String, String> map) {
        C12775o.m28639i(map, "<set-?>");
        this.extras = map;
    }

    public final void setInlineImagePush(boolean z) {
        this.isInlineImagePush = z;
    }

    public final void setIsInlineImagePush(boolean z) {
        this.isInlineImagePush = z;
    }

    public final void setLargeIcon(String str) {
        this.largeIcon = str;
    }

    public final void setNewlyReceivedPushStory(boolean z) {
        this.isNewlyReceivedPushStory = z;
    }

    public final void setNotificationBadgeNumber(Integer num) {
        this.notificationBadgeNumber = num;
    }

    public final void setNotificationCategory(String str) {
        this.notificationCategory = str;
    }

    public final void setNotificationChannelId(String str) {
        this.notificationChannelId = str;
    }

    public final void setNotificationPriorityInt(Integer num) {
        this.notificationPriorityInt = num;
    }

    public final void setNotificationReceivedTimestampMillis(Long l) {
        this.notificationReceivedTimestampMillis = l;
    }

    public final void setNotificationSound(String str) {
        this.notificationSound = str;
    }

    public final void setNotificationVisibility(Integer num) {
        this.notificationVisibility = num;
    }

    public final void setPublicNotificationExtras(String str) {
        this.publicNotificationExtras = str;
    }

    public final void setPushDuration(Integer num) {
        this.pushDuration = num;
    }

    public final void setPushStory(boolean z) {
        this.isPushStory = z;
    }

    public final void setPushStoryPageIndex(int i) {
        this.pushStoryPageIndex = i;
    }

    public final void setPushStoryPages(List<PushStoryPage> list) {
        C12775o.m28639i(list, "pushStoryPages");
        this.pushStoryPagesInternal = list;
    }

    public final void setShouldFetchTestTriggers(boolean z) {
        this.shouldFetchTestTriggers = z;
    }

    public final void setShouldRefreshFeatureFlags(boolean z) {
        this.shouldRefreshFeatureFlags = z;
    }

    public final void setShouldSyncGeofences(boolean z) {
        this.shouldSyncGeofences = z;
    }

    public final void setSummaryText(String str) {
        this.summaryText = str;
    }

    public final void setTitleText(String str) {
        this.titleText = str;
    }

    public final void setUninstallTrackingPush(boolean z) {
        this.isUninstallTrackingPush = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Companion companion = Companion;
        sb.append(companion.stringAndKey("PushDuration", this.pushDuration));
        sb.append(companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory)));
        sb.append(companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush)));
        sb.append(companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush)));
        sb.append(companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras));
        sb.append(companion.stringAndKey("NotificationChannelId", this.notificationChannelId));
        sb.append(companion.stringAndKey("NotificationCategory", this.notificationCategory));
        sb.append(companion.stringAndKey("NotificationVisibility", this.notificationVisibility));
        sb.append(companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber));
        sb.append(companion.stringAndKey("CustomNotificationId", this.customNotificationId));
        sb.append(companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis));
        sb.append(companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData));
        sb.append(companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId));
        sb.append(companion.stringAndKey("TitleText", this.titleText));
        sb.append(companion.stringAndKey("ContentText", this.contentText));
        sb.append(companion.stringAndKey("LargeIcon", this.largeIcon));
        sb.append(companion.stringAndKey("NotificationSound", this.notificationSound));
        sb.append(companion.stringAndKey("SummaryText", this.summaryText));
        sb.append(companion.stringAndKey("AccentColor", this.accentColor));
        sb.append(companion.stringAndKey("BigSummaryText", this.bigSummaryText));
        sb.append(companion.stringAndKey("BigTitleText", this.bigTitleText));
        sb.append(companion.stringAndKey("BigImageUrl", this.bigImageUrl));
        sb.append(companion.stringAndKey("ActionButtons", getActionButtons()));
        sb.append(companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex)));
        sb.append(companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal));
        sb.append(companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal));
        sb.append(companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal));
        sb.append(companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId));
        return sb.toString();
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2, (Context) null, (C4218b) null, 12, (DefaultConstructorMarker) null);
    }

    public static final String getTemplateFieldAtIndex(int i, Bundle bundle, String str) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context2) {
        this(bundle, bundle2, context2, (C4218b) null, 8, (DefaultConstructorMarker) null);
    }

    public static final String getTemplateFieldAtIndex(int i, Bundle bundle, String str, String str2) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, str2);
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context2, C4218b bVar) {
        Context context3;
        this.configurationProvider = bVar;
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.extras = C8272d.m16427b(bundle2);
        if (context2 == null) {
            context3 = null;
        } else {
            context3 = context2.getApplicationContext();
        }
        this.context = context3;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    public static final boolean getTemplateFieldAtIndex(int i, Bundle bundle, String str, boolean z) {
        return Companion.getTemplateFieldAtIndex(i, bundle, str, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context2, C4218b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle, (i & 2) != 0 ? Companion.getAttachedBrazeExtras(bundle) : bundle2, (i & 4) != 0 ? null : context2, (i & 8) != 0 ? null : bVar);
    }
}
