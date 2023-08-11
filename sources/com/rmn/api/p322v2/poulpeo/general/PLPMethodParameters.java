package com.rmn.api.p322v2.poulpeo.general;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.rmn.api.p322v2.main.general.BaseMethodParameters;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormat;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatEnum;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter;
import com.rmn.api.p322v2.poulpeo.model.UserSuggestSource;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;

/* renamed from: com.rmn.api.v2.poulpeo.general.PLPMethodParameters */
public class PLPMethodParameters extends BaseMethodParameters {
    public static final RMNMethodParam ACCESS_TOKEN;
    public static final RMNMethodParam ADDRESS;
    public static final RMNMethodParam AUTH_CODE;
    public static final RMNMethodParam BIC;
    public static final RMNMethodParam CITY;
    public static final RMNMethodParam CIVILITY;
    public static final RMNMethodParam CODE_TYPES;
    public static final RMNMethodParam COUNTRY_CODE;
    public static final RMNMethodParam COUPON_TYPES;
    public static final RMNMethodParam CURRENT_TERMS;
    public static final RMNMethodParam EARNING_STATUS_FILTER;
    public static final RMNMethodParam EARNING_TYPE_FILTER;
    public static final RMNMethodParam EMAIL;
    public static final RMNMethodParam EMAIL_OPTIONAL;
    public static final RMNMethodParam EMAIL_PAYPAL;
    public static final RMNMethodParam FIRST_NAME;
    public static final RMNMethodParam FULL;
    public static final RMNMethodParam HAS_CASHBACK;
    public static final RMNMethodParam IBAN;
    public static final RMNMethodParam IDS_ARRAY_REQUIRED;
    public static final RMNMethodParam ID_COUPON_OPTIONAL;
    public static final RMNMethodParam ID_COUPON_REQUIRED;
    public static final RMNMethodParam ID_INVOICE_REQUIRED;
    public static final RMNMethodParam ID_PLP_MERCHANT_REQUIRED;
    public static final RMNMethodParam ID_SUPPORT_TICKET_REQUIRED;
    public static final RMNMethodParam LAST_NAME;
    public static final RMNMethodParam LIMIT;
    public static final RMNMethodParam LOGIN_OPTIONAL;
    public static final RMNMethodParam MOBILE;
    public static final RMNMethodParam MOTIVE;
    public static final RMNMethodParam NEWSLETTER;
    public static final RMNMethodParam NEW_PASSWORD;
    public static final RMNMethodParam OFFSET;
    public static final RMNMethodParam OLD_PASSWORD;
    public static final RMNMethodParam ONLY_CASHBACK_CUMULATIVE;
    public static final RMNMethodParam OPEN_DATA;
    public static final RMNMethodParam PASSWORD;
    public static final RMNMethodParam PHONE;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_CASHBACK_ACCEPTED;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_CASHBACK_PENDING;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_MONTHLY;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_NEWSLETTER_BEST_OF;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_NEWSLETTER_CASHBACK_INCREASE;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_NEWSLETTER_PARTNERS;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_NEWSLETTER_RELATIONAL;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_REVIEW;
    public static final RMNMethodParam PLP_MAIL_NOTIFICATION_SPONSORSHIP;
    public static final RMNMethodParam PLP_PINNED_OBJECT_MODEL_OPTIONAL;
    public static final RMNMethodParam PLP_PINNED_OBJECT_MODEL_REQUIRED;
    public static final RMNMethodParam PLP_PINNED_OBJECT_TYPE_OPTIONAL;
    public static final RMNMethodParam PLP_PINNED_OBJECT_TYPE_REQUIRED;
    public static final RMNMethodParam PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE;
    public static final RMNMethodParam PLP_PUSH_NOTIFICATION_EARNING;
    public static final RMNMethodParam QUERY_REQUIRED;
    public static final RMNMethodParam REVIEW_MERCHANT_CONTENT;
    public static final RMNMethodParam REVIEW_MERCHANT_DATE_ORDER;
    public static final RMNMethodParam REVIEW_MERCHANT_SCORE = new RMNMethodParam(true, "score", BaseMethodParameters.RMN_FORMAT_DOUBLE);
    private static final RMNParamFormat RMN_FORMAT_ENUM_EARNING_STATUS_FILTER;
    private static final RMNParamFormat RMN_FORMAT_ENUM_EARNING_TYPE_FILTER;
    private static final RMNParamFormat RMN_FORMAT_ENUM_PINNED_OBJECT_MODEL;
    private static final RMNParamFormat RMN_FORMAT_ENUM_PINNED_OBJECT_TYPE;
    private static final RMNParamFormat RMN_FORMAT_ENUM_SORT;
    private static final RMNParamFormat RMN_FORMAT_ENUM_SUPPORT_TICKET_STATUS_FILTER;
    private static final RMNParamFormat RMN_FORMAT_ENUM_USER_SUGGEST_SOURCE;
    public static final RMNMethodParam SECTION_IDENTIFIER;
    public static final RMNMethodParam SECTION_TAG;
    public static final RMNMethodParam SORT_ORDER;
    public static final RMNMethodParam SORT_PROPERTY;
    public static final RMNMethodParam SPONSORSHIP_CODE;
    public static final RMNMethodParam SUGGESTION;
    public static final RMNMethodParam SUGGESTION_OPTIONAL;
    public static final RMNMethodParam SUPPORT_TICKET_STATUS_FILTER;
    public static final RMNMethodParam TERMS_ACCEPTED;
    public static final RMNMethodParam TIMESTAMP;
    public static final RMNMethodParam USER_SUGGEST_SOURCE;
    public static final RMNMethodParam WITH_DYNAMIC;
    public static final RMNMethodParam ZIP;

    static {
        RMNParamFormatEnum rMNParamFormatEnum = new RMNParamFormatEnum("asc", "desc");
        RMN_FORMAT_ENUM_SORT = rMNParamFormatEnum;
        RMNParamFormatEnum rMNParamFormatEnum2 = new RMNParamFormatEnum(APIResourceDescriptors.RESOURCE_TYPE_CASHBACK, "review", "sponsorship", "bonus");
        RMN_FORMAT_ENUM_EARNING_TYPE_FILTER = rMNParamFormatEnum2;
        RMNParamFormatEnum rMNParamFormatEnum3 = new RMNParamFormatEnum("pending", "accepted", "refused");
        RMN_FORMAT_ENUM_EARNING_STATUS_FILTER = rMNParamFormatEnum3;
        RMNParamFormatEnum rMNParamFormatEnum4 = new RMNParamFormatEnum("save_for_later", NotificationCompat.CATEGORY_REMINDER);
        RMN_FORMAT_ENUM_PINNED_OBJECT_TYPE = rMNParamFormatEnum4;
        RMNParamFormatEnum rMNParamFormatEnum5 = new RMNParamFormatEnum("coupon", "merchant");
        RMN_FORMAT_ENUM_PINNED_OBJECT_MODEL = rMNParamFormatEnum5;
        RMNParamFormatEnum rMNParamFormatEnum6 = new RMNParamFormatEnum(UserSuggestSource.COMMENT.toString(), UserSuggestSource.REVIEW.toString());
        RMN_FORMAT_ENUM_USER_SUGGEST_SOURCE = rMNParamFormatEnum6;
        RMNParamFormatEnum rMNParamFormatEnum7 = new RMNParamFormatEnum(SupportTicketStatusFilter.ALL.toString(), SupportTicketStatusFilter.PENDING.toString(), SupportTicketStatusFilter.REFUSED.toString(), SupportTicketStatusFilter.ACCEPTED.toString());
        RMN_FORMAT_ENUM_SUPPORT_TICKET_STATUS_FILTER = rMNParamFormatEnum7;
        RMNParamFormat rMNParamFormat = BaseMethodParameters.RMN_FORMAT_ID;
        ID_PLP_MERCHANT_REQUIRED = new RMNMethodParam(true, "id_merchant", rMNParamFormat);
        ID_COUPON_REQUIRED = new RMNMethodParam(true, "id_coupon", rMNParamFormat);
        RMNParamFormat rMNParamFormat2 = BaseMethodParameters.RMN_FORMAT_ARRAY;
        IDS_ARRAY_REQUIRED = new RMNMethodParam(true, "ids", rMNParamFormat2);
        ID_COUPON_OPTIONAL = new RMNMethodParam(false, "id_coupon", rMNParamFormat);
        RMNParamFormat rMNParamFormat3 = BaseMethodParameters.RMN_FORMAT_INTEGER;
        OFFSET = new RMNMethodParam(false, "offset", rMNParamFormat3);
        LIMIT = new RMNMethodParam(false, APIParams.LIMIT, rMNParamFormat3);
        RMNParamFormat rMNParamFormat4 = BaseMethodParameters.RMN_FORMAT_STRING;
        QUERY_REQUIRED = new RMNMethodParam(true, "query", rMNParamFormat4);
        SORT_PROPERTY = new RMNMethodParam(false, "sortProperty", rMNParamFormat4);
        SORT_ORDER = new RMNMethodParam(false, "sortOrder", rMNParamFormatEnum);
        RMNParamFormat rMNParamFormat5 = BaseMethodParameters.RMN_FORMAT_TIMESTAMP;
        TIMESTAMP = new RMNMethodParam(false, "timestamp", rMNParamFormat5);
        SUGGESTION = new RMNMethodParam(true, "suggestion", rMNParamFormat4);
        OPEN_DATA = new RMNMethodParam(true, "opendata", rMNParamFormat4);
        USER_SUGGEST_SOURCE = new RMNMethodParam(true, APIParams.SOURCE, rMNParamFormatEnum6);
        EMAIL = new RMNMethodParam(true, NotificationCompat.CATEGORY_EMAIL, rMNParamFormat4);
        PASSWORD = new RMNMethodParam(true, HintConstants.AUTOFILL_HINT_PASSWORD, rMNParamFormat4);
        ACCESS_TOKEN = new RMNMethodParam(false, "access_token", rMNParamFormat4);
        AUTH_CODE = new RMNMethodParam(false, "auth_code", rMNParamFormat4);
        SPONSORSHIP_CODE = new RMNMethodParam(false, "sponsorship_code", rMNParamFormat4);
        RMNParamFormat rMNParamFormat6 = BaseMethodParameters.RMN_FORMAT_BOOLEAN;
        TERMS_ACCEPTED = new RMNMethodParam(false, "terms_accepted", rMNParamFormat6);
        NEWSLETTER = new RMNMethodParam(false, "newsletter", rMNParamFormat6);
        FULL = new RMNMethodParam(false, "full", rMNParamFormat6);
        OLD_PASSWORD = new RMNMethodParam(true, "old_password", rMNParamFormat4);
        NEW_PASSWORD = new RMNMethodParam(false, "new_password", rMNParamFormat4);
        LOGIN_OPTIONAL = new RMNMethodParam(false, "login", rMNParamFormat4);
        EMAIL_OPTIONAL = new RMNMethodParam(false, NotificationCompat.CATEGORY_EMAIL, rMNParamFormat4);
        CIVILITY = new RMNMethodParam(false, "civility", rMNParamFormat4);
        LAST_NAME = new RMNMethodParam(false, "last_name", rMNParamFormat4);
        FIRST_NAME = new RMNMethodParam(false, "first_name", rMNParamFormat4);
        COUNTRY_CODE = new RMNMethodParam(false, "countryCode", rMNParamFormat4);
        IBAN = new RMNMethodParam(false, "iban", rMNParamFormat4);
        BIC = new RMNMethodParam(false, "bic", rMNParamFormat4);
        EMAIL_PAYPAL = new RMNMethodParam(false, "email_paypal", rMNParamFormat4);
        ADDRESS = new RMNMethodParam(false, "address", rMNParamFormat4);
        ZIP = new RMNMethodParam(false, "zip", rMNParamFormat4);
        CITY = new RMNMethodParam(false, "city", rMNParamFormat4);
        PHONE = new RMNMethodParam(false, HintConstants.AUTOFILL_HINT_PHONE, rMNParamFormat4);
        MOBILE = new RMNMethodParam(false, "mobile", rMNParamFormat4);
        HAS_CASHBACK = new RMNMethodParam(false, "hasCashback", rMNParamFormat6);
        COUPON_TYPES = new RMNMethodParam(false, "couponTypes", rMNParamFormat2);
        CODE_TYPES = new RMNMethodParam(false, "codeTypes", rMNParamFormat2);
        ONLY_CASHBACK_CUMULATIVE = new RMNMethodParam(false, "onlyCashbackCumulative", rMNParamFormat6);
        WITH_DYNAMIC = new RMNMethodParam(false, "withDynamic", rMNParamFormat6);
        SECTION_TAG = new RMNMethodParam(false, APIResourceDescriptors.RESOURCE_TYPE_TAG, rMNParamFormat4);
        SECTION_IDENTIFIER = new RMNMethodParam(false, "id", rMNParamFormat4);
        EARNING_TYPE_FILTER = new RMNMethodParam(false, "typeFilter", rMNParamFormatEnum2);
        EARNING_STATUS_FILTER = new RMNMethodParam(false, "statusFilter", rMNParamFormatEnum3);
        PLP_PINNED_OBJECT_TYPE_REQUIRED = new RMNMethodParam(true, JSONAPIResourceIdSerializer.FIELD_TYPE, rMNParamFormatEnum4);
        PLP_PINNED_OBJECT_MODEL_REQUIRED = new RMNMethodParam(true, "model", rMNParamFormatEnum5);
        PLP_PINNED_OBJECT_TYPE_OPTIONAL = new RMNMethodParam(false, JSONAPIResourceIdSerializer.FIELD_TYPE, rMNParamFormatEnum4);
        PLP_PINNED_OBJECT_MODEL_OPTIONAL = new RMNMethodParam(false, "model", rMNParamFormatEnum5);
        PLP_PUSH_NOTIFICATION_EARNING = new RMNMethodParam(false, "earning", rMNParamFormat6);
        PLP_PUSH_NOTIFICATION_CASHBACK_INCREASE = new RMNMethodParam(false, "cashback_increase", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_CASHBACK_PENDING = new RMNMethodParam(false, "cashback_pending", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_CASHBACK_ACCEPTED = new RMNMethodParam(false, "cashback_accepted", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_SPONSORSHIP = new RMNMethodParam(false, "sponsorship", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_REVIEW = new RMNMethodParam(false, "review", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_MONTHLY = new RMNMethodParam(false, "monthly", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_NEWSLETTER_CASHBACK_INCREASE = new RMNMethodParam(false, "newsletters_cashback_increase", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_NEWSLETTER_BEST_OF = new RMNMethodParam(false, "newsletters_best_of", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_NEWSLETTER_PARTNERS = new RMNMethodParam(false, "newsletters_partners", rMNParamFormat6);
        PLP_MAIL_NOTIFICATION_NEWSLETTER_RELATIONAL = new RMNMethodParam(false, "newsletters_relational", rMNParamFormat6);
        REVIEW_MERCHANT_CONTENT = new RMNMethodParam(true, "content", rMNParamFormat4);
        REVIEW_MERCHANT_DATE_ORDER = new RMNMethodParam(true, "date_order", rMNParamFormat5);
        SUPPORT_TICKET_STATUS_FILTER = new RMNMethodParam(false, "statusFilter", rMNParamFormatEnum7);
        ID_SUPPORT_TICKET_REQUIRED = new RMNMethodParam(true, "id_support_ticket", rMNParamFormat);
        ID_INVOICE_REQUIRED = new RMNMethodParam(true, "id_invoice", rMNParamFormat);
        CURRENT_TERMS = new RMNMethodParam(true, "current_terms", rMNParamFormat3);
        MOTIVE = new RMNMethodParam(true, "motive", rMNParamFormat4);
        SUGGESTION_OPTIONAL = new RMNMethodParam(false, "suggestion", rMNParamFormat4);
    }
}
