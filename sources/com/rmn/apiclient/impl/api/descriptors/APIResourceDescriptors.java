package com.rmn.apiclient.impl.api.descriptors;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.core.data.descriptor.RelationshipMapping;
import com.rmn.apiclient.core.data.descriptor.RelationshipMappingSet;
import com.rmn.apiclient.core.data.serializer.FieldParser;
import com.rmn.apiclient.core.data.serializer.SpecificParserList;
import com.rmn.apiclient.core.data.validator.DefaultValidator;
import com.rmn.apiclient.core.data.validator.FieldValidatorSet;
import com.rmn.apiclient.core.data.validator.LazyFieldValidator;
import com.rmn.apiclient.core.data.validator.StrictFieldValidator;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheDescriptor;
import com.rmn.apiclient.core.json.JSONSerializationManager;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.core.reflection.EnumUtils;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.models.AffiliateNetwork;
import com.rmn.apiclient.impl.api.models.AppConfig;
import com.rmn.apiclient.impl.api.models.Campaign;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.MerchantBonus;
import com.rmn.apiclient.impl.api.models.MerchantInfo;
import com.rmn.apiclient.impl.api.models.MerchantLight;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.Page;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.PageSectionType;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIResourceDescriptor;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p310bc.C10921a;
import p310bc.C10922b;
import p310bc.C10923c;
import p310bc.C10924d;
import p310bc.C10925e;
import p310bc.C10926f;
import p310bc.C10927g;
import p310bc.C10928h;
import p310bc.C10929i;
import p446vd.C13633n;

public final class APIResourceDescriptors {
    @NonNull
    public static final JSONAPIResourceDescriptor<AffiliateNetwork> AFFILIATE_NETWORK;
    @NonNull
    public static final JSONAPIResourceDescriptor<AppConfig> APP_CONFIG;
    @NonNull
    public static final JSONAPIResourceDescriptor<Campaign> CAMPAIGN;
    @NonNull
    public static final JSONAPIResourceDescriptor<CashbackObject> CASHBACK_OBJECT;
    @NonNull
    public static final JSONAPIResourceDescriptor<Merchant> MERCHANT;
    @NonNull
    public static final JSONAPIResourceDescriptor<MerchantBonus> MERCHANT_BONUS;
    @NonNull
    public static final JSONAPIResourceDescriptor<MerchantInfo> MERCHANT_INFO;
    @NonNull
    public static final JSONAPIResourceDescriptor<MerchantLight> MERCHANT_LIGHT;
    @NonNull
    public static final JSONAPIResourceDescriptor<Offer> OFFER;
    @NonNull
    public static final JSONAPIResourceDescriptor<Page> PAGE;
    @NonNull
    public static final String RESOURCE_TYPE_AFFILIATE_NETWORK = "affiliateNetwork";
    @NonNull
    public static final String RESOURCE_TYPE_APPLICATION = "application";
    @NonNull
    public static final String RESOURCE_TYPE_CAMPAIGN = "campaign";
    @NonNull
    public static final String RESOURCE_TYPE_CASHBACK = "cashback";
    @NonNull
    public static final String RESOURCE_TYPE_CONTAINER = "container";
    @NonNull
    public static final String RESOURCE_TYPE_MERCHANT = "merchant";
    @NonNull
    public static final String RESOURCE_TYPE_MERCHANT_BONUS = "merchantBonus";
    @NonNull
    public static final String RESOURCE_TYPE_MERCHANT_INFO = "merchantInfo";
    @NonNull
    public static final String RESOURCE_TYPE_OFFER = "offer";
    @NonNull
    public static final String RESOURCE_TYPE_PAGE = "page";
    @NonNull
    public static final String RESOURCE_TYPE_TAG = "tag";

    static {
        LazyFieldValidator.FieldValidationFunction checkNotNull = checkNotNull();
        Boolean bool = Boolean.FALSE;
        FieldValidatorSet fieldValidatorSet = new FieldValidatorSet(new LazyFieldValidator("welcomeBonusAmount", checkNotNull(), 0), new LazyFieldValidator("uaebBonusAmount", checkNotNull(), 0), new LazyFieldValidator("sponsorshipBonusAmount", checkNotNull(), 0), new LazyFieldValidator("paymentThreshold", checkNotNull(), 0), new LazyFieldValidator("forceRecaptcha", checkNotNull, bool), new LazyFieldValidator("tabUnderEnabled", checkNotNull(), bool), new LazyFieldValidator("reviewMinCharCount", checkNotNull(), 0), new LazyFieldValidator("reviewMaxCharCount", checkNotNull(), 0), new LazyFieldValidator("reviewMinPaidCharCount", checkNotNull(), 0));
        CacheDescriptor cacheDescriptor = APICacheDescriptors.CACHE_DESCRIPTOR;
        APP_CONFIG = new JSONAPIResourceDescriptor<>(AppConfig.class, RESOURCE_TYPE_APPLICATION, fieldValidatorSet, cacheDescriptor);
        FieldValidatorSet fieldValidatorSet2 = new FieldValidatorSet(new LazyFieldValidator(HintConstants.AUTOFILL_HINT_NAME, checkNotNull(), ""));
        RelationshipMappingSet relationshipMappingSet = new RelationshipMappingSet(new RelationshipMapping("cashbackObjectRelationship", APIIncludes.CURRENT_CASHBACK_OBJECT, RESOURCE_TYPE_CASHBACK));
        String str = HintConstants.AUTOFILL_HINT_NAME;
        CacheDescriptor cacheDescriptor2 = cacheDescriptor;
        MERCHANT_LIGHT = new JSONAPIResourceDescriptor(MerchantLight.class, "merchant", fieldValidatorSet2, relationshipMappingSet, cacheDescriptor2);
        MERCHANT = new JSONAPIResourceDescriptor(Merchant.class, "merchant", new FieldValidatorSet(new LazyFieldValidator(str, checkNotNull(), ""), new LazyFieldValidator("description", checkNotNull(), ""), new LazyFieldValidator("grade", checkNotNull(), ""), new LazyFieldValidator("autocheckTips", checkNotNull(), "")), new RelationshipMappingSet(new RelationshipMapping("merchantInfoRelationship", "merchantInfo", "merchantInfo"), new RelationshipMapping("cashbackObjectRelationship", APIIncludes.CURRENT_CASHBACK_OBJECT, RESOURCE_TYPE_CASHBACK)), cacheDescriptor2);
        MERCHANT_INFO = new JSONAPIResourceDescriptor<>(MerchantInfo.class, "merchantInfo", cacheDescriptor);
        Class<CashbackObject> cls = CashbackObject.class;
        CASHBACK_OBJECT = new JSONAPIResourceDescriptor<>(cls, RESOURCE_TYPE_CASHBACK, new FieldValidatorSet(new StrictFieldValidator("specificationCommissionType", checkNotNull()), new LazyFieldValidator("specificationUsersSpecificationStandardConditionGenerated", checkNotNull(), "")), cacheDescriptor);
        Class<MerchantBonus> cls2 = MerchantBonus.class;
        MERCHANT_BONUS = new JSONAPIResourceDescriptor<>(cls2, RESOURCE_TYPE_MERCHANT_BONUS, new FieldValidatorSet(new StrictFieldValidator("amount", new C10922b()), new StrictFieldValidator(JSONAPIResourceIdSerializer.FIELD_TYPE, checkNotNull()), new DefaultValidator(new C10923c(), "The bonus can't be displayed because it ended or is not started")), cacheDescriptor);
        CacheDescriptor cacheDescriptor3 = cacheDescriptor;
        OFFER = new JSONAPIResourceDescriptor(Offer.class, RESOURCE_TYPE_OFFER, new SpecificParserList(new FieldParser("hasShipping", new C10924d()), new FieldParser("hasGift", new C10925e())), new FieldValidatorSet(new StrictFieldValidator("offerTypeId", checkNotNull()), new LazyFieldValidator("title", checkNotNull(), ""), new LazyFieldValidator("shortTitle", checkNotNull(), ""), new LazyFieldValidator("description", checkNotNull(), ""), new LazyFieldValidator("descriptionHtml", checkNotNull(), ""), new DefaultValidator(new C10926f(), "The offer can't be displayed because it ended or is not started")), new RelationshipMappingSet(new RelationshipMapping("merchantRelationship", "merchant", "merchant"), new RelationshipMapping("cashbackObjectRelationship", APIIncludes.CURRENT_CASHBACK_OBJECT, RESOURCE_TYPE_CASHBACK), new RelationshipMapping("tagsRelationship", APIIncludes.TAGS, RESOURCE_TYPE_TAG)), cacheDescriptor3);
        PAGE = new JSONAPIResourceDescriptor(Page.class, RESOURCE_TYPE_PAGE, new SpecificParserList(new FieldParser("components", new C10927g())), new FieldValidatorSet(new LazyFieldValidator("shortTitle", checkNotNull(), "")), cacheDescriptor);
        CAMPAIGN = new JSONAPIResourceDescriptor(Campaign.class, RESOURCE_TYPE_CAMPAIGN, new SpecificParserList(new FieldParser("dataIllustration", new C10928h())), new FieldValidatorSet(new StrictFieldValidator("dataTarget", checkNotNull())), new RelationshipMappingSet(new RelationshipMapping("targetRelationship", TypedValues.AttributesType.S_TARGET, "merchant", RESOURCE_TYPE_OFFER, RESOURCE_TYPE_CONTAINER, RESOURCE_TYPE_PAGE)), cacheDescriptor3);
        AFFILIATE_NETWORK = new JSONAPIResourceDescriptor<>(AffiliateNetwork.class, RESOURCE_TYPE_AFFILIATE_NETWORK, cacheDescriptor);
    }

    @NonNull
    private static <M> LazyFieldValidator.FieldValidationFunction<M, String> checkNotEmpty() {
        return new C10921a();
    }

    @NonNull
    private static <M> LazyFieldValidator.FieldValidationFunction<M, Object> checkNotNull() {
        return new C10929i();
    }

    /* access modifiers changed from: private */
    @Nullable
    public static RemoteImage extractCampaignIllustration(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = JSONHelper.optJSONObject(jSONObject, "dataIllustrations");
        if (optJSONObject2 == null || (optJSONObject = JSONHelper.optJSONObject(optJSONObject2, 0)) == null) {
            return null;
        }
        return new RemoteImage(optJSONObject.optString("path"));
    }

    /* access modifiers changed from: private */
    @NonNull
    public static List<BasePageSection> extractPageSections(@NonNull JSONObject jSONObject) {
        JSONArray optJSONArray = JSONHelper.optJSONArray(jSONObject, "blocks");
        if (optJSONArray != null) {
            JSONObject optJSONObject = JSONHelper.optJSONObject(optJSONArray, 0);
            if (optJSONObject != null) {
                JSONArray optJSONArray2 = JSONHelper.optJSONArray(optJSONObject, "components");
                if (optJSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject optJSONObject2 = JSONHelper.optJSONObject(optJSONArray2, i);
                        if (optJSONObject2 != null) {
                            String optNullableString = JSONHelper.optNullableString(optJSONObject2, JSONAPIResourceIdSerializer.FIELD_TYPE);
                            PageSectionType pageSectionType = (PageSectionType) EnumUtils.findWithSerializedValue(PageSectionType.class, optNullableString);
                            if (pageSectionType == null) {
                                C13633n.m31148d("Ignored unknown section type in page at pos " + i + " : " + optNullableString);
                            } else {
                                BasePageSection newSection = pageSectionType.newSection();
                                JSONSerializationManager.instance.deserialize(optJSONObject2, newSection);
                                if (!newSection.isValid()) {
                                    C13633n.m31148d("Parsed section but is not valid at pos " + i + " : " + optNullableString);
                                } else {
                                    arrayList.add(newSection);
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    throw new IllegalArgumentException("No sections after in page after parsing");
                }
                throw new IllegalArgumentException("Components not found in page json");
            }
            throw new IllegalArgumentException("Couldn't find any block in the page json");
        }
        throw new IllegalArgumentException("Wrong page json");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$checkNotEmpty$4(Object obj, String str) {
        return !TextUtils.isEmpty(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$checkNotNull$3(Object obj, Object obj2) {
        if (obj2 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(MerchantBonus merchantBonus, Float f) {
        if (f == null || f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$1(JSONObject jSONObject) {
        boolean z;
        if (jSONObject.optJSONObject("shipping") != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$2(JSONObject jSONObject) {
        boolean z;
        if (jSONObject.optJSONObject("gift") != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
