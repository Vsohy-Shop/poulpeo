package com.appboy;

public final class Constants {
    public static final String APPBOY = "Appboy";
    public static final String APPBOY_ACTION_CLICKED_ACTION = "com.appboy.action.APPBOY_ACTION_CLICKED";
    public static final String APPBOY_ACTION_ID_KEY = "appboy_action_id";
    public static final String APPBOY_ACTION_INDEX_KEY = "appboy_action_index";
    public static final String APPBOY_ACTION_RECEIVER_GEOFENCE_LOCATION_UPDATE_INTENT_ACTION = "com.appboy.action.receiver.APPBOY_GEOFENCE_LOCATION_UPDATE";
    public static final String APPBOY_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION = "com.appboy.action.receiver.APPBOY_GEOFENCE_UPDATE";
    public static final String APPBOY_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION = "com.appboy.action.receiver.SINGLE_LOCATION_UPDATE";
    public static final String APPBOY_ACTION_TYPE_KEY = "appboy_action_type";
    public static final String APPBOY_ACTION_URI_KEY = "appboy_action_uri";
    public static final String APPBOY_ACTION_USE_WEBVIEW_KEY = "appboy_action_use_webview";
    public static final String APPBOY_CAMPAIGN_ID = "appboy_campaign_id";
    public static final String APPBOY_CANCEL_NOTIFICATION_ACTION = "com.appboy.action.CANCEL_NOTIFICATION";
    public static final int APPBOY_DEFAULT_NOTIFICATION_ID = -1;
    public static final int APPBOY_GEOFENCE_MAX_NUM_TO_REGISTER_DEFAULT = 20;
    public static final int APPBOY_MAX_PURCHASE_QUANTITY = 100;
    public static final int APPBOY_MINIMUM_NOTIFICATION_DURATION_MILLIS = 1000;
    public static final String APPBOY_PUSH_ACCENT_KEY = "ac";
    public static final String APPBOY_PUSH_ACTION_ID_KEY_TEMPLATE = "ab_a*_id";
    public static final String APPBOY_PUSH_ACTION_TEXT_KEY_TEMPLATE = "ab_a*_t";
    public static final String APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE = "ab_a*_a";
    public static final String APPBOY_PUSH_ACTION_TYPE_NONE = "ab_none";
    public static final String APPBOY_PUSH_ACTION_TYPE_OPEN = "ab_open";
    public static final String APPBOY_PUSH_ACTION_TYPE_URI = "ab_uri";
    public static final String APPBOY_PUSH_ACTION_URI_KEY_TEMPLATE = "ab_a*_uri";
    public static final String APPBOY_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE = "ab_a*_use_webview";
    public static final String APPBOY_PUSH_APPBOY_KEY = "_ab";
    public static final String APPBOY_PUSH_BIG_IMAGE_URL_KEY = "appboy_image_url";
    public static final String APPBOY_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY = "ab_iu";
    public static final String APPBOY_PUSH_BIG_SUMMARY_TEXT_KEY = "ab_bs";
    public static final String APPBOY_PUSH_BIG_TITLE_TEXT_KEY = "ab_bt";
    public static final String APPBOY_PUSH_CAMPAIGN_ID_KEY = "cid";
    public static final String APPBOY_PUSH_CATEGORY_KEY = "ab_ct";
    public static final String APPBOY_PUSH_CLICKED_ACTION = "com.appboy.action.APPBOY_PUSH_CLICKED";
    public static final String APPBOY_PUSH_CONTENT_CARD_SYNC_DATA_KEY = "ab_cd";
    public static final String APPBOY_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY = "ab_cd_uid";
    public static final String APPBOY_PUSH_CONTENT_KEY = "a";
    public static final String APPBOY_PUSH_CUSTOM_NOTIFICATION_ID = "n";
    public static final String APPBOY_PUSH_DEEP_LINK_KEY = "uri";
    public static final String APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID = "com_appboy_default_notification_channel";
    public static final String APPBOY_PUSH_DELETED_ACTION = "com.appboy.action.APPBOY_PUSH_DELETED";
    public static final String APPBOY_PUSH_EXTRAS_KEY = "extra";
    public static final String APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY = "ab_push_fetch_test_triggers_key";
    public static final String APPBOY_PUSH_INLINE_IMAGE_STYLE_KEY = "ab_iip";
    public static final String APPBOY_PUSH_LARGE_ICON_KEY = "ab_li";
    public static final String APPBOY_PUSH_NOTIFICATION_BADGE_COUNT_KEY = "ab_bc";
    public static final String APPBOY_PUSH_NOTIFICATION_CHANNEL_ID_KEY = "ab_nc";
    public static final String APPBOY_PUSH_NOTIFICATION_DURATION_KEY = "nd";
    public static final String APPBOY_PUSH_NOTIFICATION_ID = "nid";
    public static final String APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE = "d";
    public static final String APPBOY_PUSH_NOTIFICATION_SOUND_KEY = "sd";
    public static final String APPBOY_PUSH_NOTIFICATION_TAG = "appboy_notification";
    public static final String APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY = "ab_use_webview";
    public static final String APPBOY_PUSH_PRIORITY_KEY = "p";
    public static final String APPBOY_PUSH_PUBLIC_NOTIFICATION_KEY = "ab_pn";
    public static final String APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS = "appboy_push_received_timestamp";
    public static final String APPBOY_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE = "ab_c*_uri";
    public static final String APPBOY_PUSH_STORY_ID_KEY_TEMPLATE = "ab_c*_id";
    public static final String APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE = "ab_c*_i";
    public static final String APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED = "appboy_story_newly_received";
    public static final String APPBOY_PUSH_STORY_KEY = "ab_c";
    public static final String APPBOY_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE = "ab_c*_st_j";
    public static final String APPBOY_PUSH_STORY_SUBTITLE_KEY_TEMPLATE = "ab_c*_st";
    public static final String APPBOY_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE = "ab_c*_t_j";
    public static final String APPBOY_PUSH_STORY_TITLE_KEY_TEMPLATE = "ab_c*_t";
    public static final String APPBOY_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE = "ab_c*_use_webview";
    public static final String APPBOY_PUSH_SUMMARY_TEXT_KEY = "s";
    public static final String APPBOY_PUSH_SYNC_GEOFENCES_KEY = "ab_sync_geos";
    public static final String APPBOY_PUSH_TITLE_KEY = "t";
    public static final String APPBOY_PUSH_UNINSTALL_TRACKING_KEY = "appboy_uninstall_tracking";
    public static final String APPBOY_PUSH_VISIBILITY_KEY = "ab_vs";
    public static final String APPBOY_SDK_VERSION = "23.3.0";
    public static final String APPBOY_STORY_CLICKED_ACTION = "com.appboy.action.APPBOY_STORY_CLICKED";
    public static final String APPBOY_STORY_INDEX_KEY = "appboy_story_index";
    public static final String APPBOY_STORY_PAGE_ID = "appboy_story_page_id";
    public static final String APPBOY_STORY_TRAVERSE_CLICKED_ACTION = "com.appboy.action.STORY_TRAVERSE";
    public static final String APPBOY_WEBVIEW_URL_EXTRA = "url";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE = "ab_c_mp*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE = "ab_c_mt*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE = "ab_c_mw*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE = "ab_c_pi*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE = "ab_c_pb*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE = "ab_c_pt*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE = "ab_c_pn*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE = "ab_c_pu*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY = "ab_c_rpi";
    public static final String BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY = "ab_c_si";
    public static final String BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY = "ab_cp";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_DELETED = "com.braze.push.intent.NOTIFICATION_DELETED";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_OPENED = "com.braze.push.intent.NOTIFICATION_OPENED";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED = "com.braze.push.intent.NOTIFICATION_RECEIVED";
    public static final String BRAZE_WEBVIEW_URL_EXTRA = "url";
    public static final long EVENT_PROPERTIES_MAX_SIZE_BYTES = 51200;
    public static final Constants INSTANCE = new Constants();
    public static final int JSON_TO_STRING_INDENT_SPACES = 2;
    public static final String LOG_TAG_PREFIX = "Braze v23.3.0 .";
    public static final int TRAFFIC_STATS_THREAD_TAG = 1337;
    public static final long USER_ID_MAX_LENGTH_BYTES = 997;

    private Constants() {
    }

    public static /* synthetic */ void getAPPBOY_ACTION_CLICKED_ACTION$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_ACTION_ID_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_ACTION_INDEX_KEY$annotations() {
    }

    /* renamed from: getAPPBOY_ACTION_RECEIVER_GEOFENCE_LOCATION_UPDATE_INTENT_ACTION$annotations */
    public static /* synthetic */ void m4805xfded0d73() {
    }

    /* renamed from: getAPPBOY_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION$annotations */
    public static /* synthetic */ void m4806xd77ac79d() {
    }

    /* renamed from: getAPPBOY_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION$annotations */
    public static /* synthetic */ void m4807x8f2a857b() {
    }

    public static /* synthetic */ void getAPPBOY_ACTION_TYPE_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_ACTION_URI_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_ACTION_USE_WEBVIEW_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_CAMPAIGN_ID$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_CANCEL_NOTIFICATION_ACTION$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_DEFAULT_NOTIFICATION_ID$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_GEOFENCE_MAX_NUM_TO_REGISTER_DEFAULT$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_MAX_PURCHASE_QUANTITY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_MINIMUM_NOTIFICATION_DURATION_MILLIS$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACCENT_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_ID_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_TEXT_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_TYPE_NONE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_TYPE_OPEN$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_TYPE_URI$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_URI_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_APPBOY_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_BIG_IMAGE_URL_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_BIG_SUMMARY_TEXT_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_BIG_TITLE_TEXT_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_CAMPAIGN_ID_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_CATEGORY_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_CLICKED_ACTION$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_CONTENT_CARD_SYNC_DATA_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_CONTENT_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_CUSTOM_NOTIFICATION_ID$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_DEEP_LINK_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_DELETED_ACTION$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_EXTRAS_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_INLINE_IMAGE_STYLE_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_LARGE_ICON_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_NOTIFICATION_BADGE_COUNT_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_NOTIFICATION_CHANNEL_ID_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_NOTIFICATION_DURATION_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_NOTIFICATION_ID$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_NOTIFICATION_SOUND_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_NOTIFICATION_TAG$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_PRIORITY_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_PUBLIC_NOTIFICATION_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_ID_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_IS_NEWLY_RECEIVED$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_KEY$annotations() {
    }

    /* renamed from: getAPPBOY_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE$annotations */
    public static /* synthetic */ void m4808xe109001d() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_SUBTITLE_KEY_TEMPLATE$annotations() {
    }

    /* renamed from: getAPPBOY_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE$annotations */
    public static /* synthetic */ void m4809xfe86dbf() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_TITLE_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_SUMMARY_TEXT_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_SYNC_GEOFENCES_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_TITLE_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_UNINSTALL_TRACKING_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_PUSH_VISIBILITY_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_SDK_VERSION$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_STORY_CLICKED_ACTION$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_STORY_INDEX_KEY$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_STORY_PAGE_ID$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_STORY_TRAVERSE_CLICKED_ACTION$annotations() {
    }

    public static /* synthetic */ void getAPPBOY_WEBVIEW_URL_EXTRA$annotations() {
    }

    /* renamed from: getBRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE$annotations */
    public static /* synthetic */ void m4810x600bc199() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE$annotations() {
    }

    /* renamed from: getBRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE$annotations */
    public static /* synthetic */ void m4811x40dd7388() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE$annotations() {
    }

    /* renamed from: getBRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE$annotations */
    public static /* synthetic */ void m4812xd7dc00af() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE$annotations() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY$annotations() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY$annotations() {
    }

    public static /* synthetic */ void getBRAZE_CONVERSATIONAL_PUSH_STYLE_KEY$annotations() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_INTENT_NOTIFICATION_DELETED$annotations() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_INTENT_NOTIFICATION_OPENED$annotations() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED$annotations() {
    }

    public static /* synthetic */ void getBRAZE_WEBVIEW_URL_EXTRA$annotations() {
    }

    public static /* synthetic */ void getEVENT_PROPERTIES_MAX_SIZE_BYTES$annotations() {
    }

    public static /* synthetic */ void getJSON_TO_STRING_INDENT_SPACES$annotations() {
    }

    public static /* synthetic */ void getTRAFFIC_STATS_THREAD_TAG$annotations() {
    }

    public static /* synthetic */ void getUSER_ID_MAX_LENGTH_BYTES$annotations() {
    }
}
