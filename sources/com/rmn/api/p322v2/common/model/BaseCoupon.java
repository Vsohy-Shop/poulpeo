package com.rmn.api.p322v2.common.model;

import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.rmn.api.p322v2.cloud.general.CloudUtil;
import com.rmn.api.p322v2.common.model.submodel.AuthorInfo;
import com.rmn.api.p322v2.common.model.submodel.AuthorInfoKey;
import com.rmn.api.p322v2.common.model.submodel.CouponBarcodeType;
import com.rmn.api.p322v2.common.model.submodel.CouponCodeFormat;
import com.rmn.api.p322v2.common.model.submodel.CouponCodeType;
import com.rmn.api.p322v2.common.model.submodel.CouponDiscount;
import com.rmn.api.p322v2.common.model.submodel.CouponGift;
import com.rmn.api.p322v2.common.model.submodel.CouponKind;
import com.rmn.api.p322v2.common.model.submodel.CouponShipping;
import com.rmn.api.p322v2.common.model.submodel.CouponType;
import com.rmn.api.p322v2.common.model.submodel.IdExternal;
import com.rmn.api.p322v2.common.model.submodel.SupportStore;
import com.rmn.api.p322v2.main.json.ParsingManagerJson;
import com.rmn.api.p322v2.main.json.ParsingMode;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import p446vd.C13623d;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.common.model.BaseCoupon */
public class BaseCoupon extends AbstractModel {
    private String affiliation_url;
    private AuthorInfo authorInfo;
    private AuthorInfoKey authorInfoKey;
    private String code;
    private CouponBarcodeType code_barcode_type;
    private CouponCodeFormat code_format;
    private String code_picture;
    private CouponCodeType code_type;
    private String conditions;
    private boolean connexion_needed;
    private Date date_add;
    private Date date_end;
    private Date date_end_validity;
    private Date date_start;
    private Date date_start_validity;
    private String description;
    private CouponDiscount discount;
    private boolean exclusive;
    private CouponGift gift;
    private int id_coupon;
    private CouponType id_coupon_type;
    private IdExternal id_external;
    private int id_merchant;
    private String id_source;
    private int[] id_stores_address;
    private boolean is_cashback_cumulative;
    private ModelRef<BaseMerchant> merchant_info;
    private String mobile_illustration;
    private boolean permanent;
    private CouponShipping shipping;
    private String source;
    private SupportStore support_store;
    private int[] tags;
    private String title;
    private CouponKind type;
    private String url_aff;
    private boolean verified;

    private int getOldStoreId(String str) {
        try {
            return Integer.parseInt(str.replace("store_", ""));
        } catch (Exception e) {
            C13633n.m31157m(this, e);
            return 0;
        }
    }

    public AuthorInfo getAuthorInfo() {
        return this.authorInfo;
    }

    public AuthorInfoKey getAuthorInfoKey() {
        return this.authorInfoKey;
    }

    public CouponBarcodeType getBarcodeType() {
        return this.code_barcode_type;
    }

    public String getCode() {
        return this.code;
    }

    public CouponCodeFormat getCodeFormat() {
        return this.code_format;
    }

    public String getCodePicture() {
        return this.code_picture;
    }

    public CouponCodeType getCodeType() {
        return this.code_type;
    }

    public int getCouponId() {
        return this.id_coupon;
    }

    public ModelRef<BaseCoupon> getCouponModelReference() {
        return super.getModelRef();
    }

    public Date getDateAdd() {
        return this.date_add;
    }

    public Date getDateEnd() {
        if (this.date_end == null) {
            return null;
        }
        return new Date(this.date_end.getTime());
    }

    public Date getDateEndValidity() {
        if (this.date_end_validity == null) {
            return null;
        }
        return new Date(this.date_end_validity.getTime());
    }

    public Date getDateStart() {
        if (this.date_start == null) {
            return null;
        }
        return new Date(this.date_start.getTime());
    }

    public Date getDateStartValidity() {
        if (this.date_start_validity == null) {
            return null;
        }
        return new Date(this.date_start_validity.getTime());
    }

    public String getDescription() {
        String str;
        String str2 = this.description;
        if (str2 == null || str2.equals("")) {
            str = "";
        } else {
            str = "" + this.description;
        }
        String str3 = this.conditions;
        if (str3 == null || str3.equals("")) {
            return str;
        }
        if (!str.equals("")) {
            str = str + "\n\nConditions : ";
        }
        return str + this.conditions;
    }

    public CouponDiscount getDiscount() {
        return this.discount;
    }

    public String getExternalId(int i) {
        return getExternalId("" + i);
    }

    public CouponGift getGift() {
        return this.gift;
    }

    public Object getIdentifier() {
        return Integer.valueOf(getCouponId());
    }

    public String getIllustration() {
        return this.mobile_illustration;
    }

    public BaseMerchant getMerchant() {
        return (BaseMerchant) ModelRef.getModelOrNull(this.merchant_info);
    }

    public int getMerchantId() {
        return this.id_merchant;
    }

    public ModelRef<BaseMerchant> getMerchantRef() {
        return this.merchant_info;
    }

    public CouponKind getOfferKind() {
        return this.type;
    }

    public CouponType getOfferType() {
        CouponType couponType = this.id_coupon_type;
        if (couponType == CouponType.CODE_PROMO || couponType == CouponType.CARTE_CADEAU) {
            return couponType;
        }
        return CouponType.BON_PLAN;
    }

    public long getRemainingExpirationMs() {
        return getRemainingExpirationMs(new Date().getTime());
    }

    public CouponShipping getShipping() {
        return this.shipping;
    }

    public Set<Integer> getStoresAddressIds() {
        if (this.id_stores_address == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(this.id_stores_address.length);
        for (int valueOf : this.id_stores_address) {
            hashSet.add(Integer.valueOf(valueOf));
        }
        return hashSet;
    }

    public SupportStore getSupportStore() {
        return this.support_store;
    }

    public Set<Integer> getTags() {
        HashSet hashSet = new HashSet();
        int[] iArr = this.tags;
        if (iArr != null) {
            for (int valueOf : iArr) {
                hashSet.add(Integer.valueOf(valueOf));
            }
        }
        return hashSet;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingCouponId() {
        return "" + getCouponId();
    }

    public String getTrackingMerchantId() {
        return "" + getMerchantId();
    }

    public boolean hasAffiliationUrl() {
        if (!TextUtils.isEmpty(this.affiliation_url) && !TextUtils.isEmpty(this.url_aff)) {
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        long time = new Date().getTime();
        if (!isStarted(time) || isFinished(time)) {
            return false;
        }
        return true;
    }

    public boolean isAvailableAndValid() {
        long time = new Date().getTime();
        if (!isValidityStarted(time) || isFinished(time)) {
            return false;
        }
        return true;
    }

    public boolean isCashbackCumulative() {
        return this.is_cashback_cumulative;
    }

    public boolean isConnectionNeeded() {
        return this.connexion_needed;
    }

    public boolean isExclusive() {
        return this.exclusive;
    }

    public boolean isExpiredRecently(long j) {
        if (j > 0) {
            long remainingExpirationMs = getRemainingExpirationMs(new Date().getTime());
            if (remainingExpirationMs > 0 || (-remainingExpirationMs) > j) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Threshold must be a positive int");
    }

    public boolean isExpiringSoon(long j) {
        if (j > 0) {
            long remainingExpirationMs = getRemainingExpirationMs();
            if (remainingExpirationMs <= 0 || remainingExpirationMs > j) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Threshold must be a positive int");
    }

    public boolean isFinished() {
        return isFinished(new Date().getTime());
    }

    public boolean isHybrid() {
        return false;
    }

    public boolean isInstore() {
        if (this.type == CouponKind.INSTORE) {
            return true;
        }
        return false;
    }

    public boolean isModelValidAfterParsing() {
        CouponCodeType couponCodeType;
        if (this.id_coupon <= 0 || this.id_merchant <= 0 || this.id_coupon_type == null || (couponCodeType = this.code_type) == null) {
            return false;
        }
        if ((couponCodeType == CouponCodeType.UNIQUE && TextUtils.isEmpty(this.code)) || this.type == null) {
            return false;
        }
        if (!isInstore() || this.support_store != SupportStore.SPECIFIC) {
            return true;
        }
        int[] iArr = this.id_stores_address;
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    public boolean isOnline() {
        if (this.type == CouponKind.ONLINE) {
            return true;
        }
        return false;
    }

    public boolean isPermanent() {
        return this.permanent;
    }

    public boolean isStarted() {
        return isStarted(new Date().getTime());
    }

    public boolean isStartingSoon() {
        long time = new Date().getTime();
        if (!isStarted(time) || isValidityStarted(time)) {
            return false;
        }
        return true;
    }

    public boolean isValidityStarted(long j) {
        Date date = this.date_start_validity;
        if (date != null && j < date.getTime()) {
            return false;
        }
        return true;
    }

    public boolean isVerified() {
        return this.verified;
    }

    public String serializeToCacheData() {
        JSONObject jSONObject = new JSONObject();
        ParsingManagerJson.serializeObjectExcludingFields(jSONObject, (Object) this, "merchant_info");
        String jSONObject2 = jSONObject.toString();
        C13633n.m31159o(this, getClass().getSimpleName() + " serialized :\n" + jSONObject2);
        return jSONObject2;
    }

    public void setAuthorInfo(AuthorInfo authorInfo2) {
        if (authorInfo2 == null) {
            throw new IllegalArgumentException();
        } else if (this.authorInfo == null) {
            this.authorInfo = authorInfo2;
        } else {
            throw new IllegalStateException("Can't set the AuthorInfo twice on a coupon");
        }
    }

    public void setCode(String str) {
        if (str == null || str.equals("")) {
            C13633n.m31149e(this, "Try to assign a null or empty alphacode to a CouponStore");
        } else {
            this.code = str;
        }
    }

    /* access modifiers changed from: protected */
    public void setIllustration(String str) {
        this.mobile_illustration = str;
    }

    public void setMerchantRef(ModelRef<BaseMerchant> modelRef) {
        if (this.merchant_info != null) {
            C13633n.m31163s(this, "Try to set a Merchant for a Coupon but the Coupon already has a Merchant.");
        } else if (modelRef != null) {
            BaseMerchant baseMerchant = modelRef.get();
            if (baseMerchant.getMerchantId() == this.id_merchant) {
                this.merchant_info = modelRef;
                return;
            }
            throw new IllegalStateException("Try to set a Merchant of id " + baseMerchant.getMerchantId() + " into a Coupon model with a parent Merchant id " + this.id_merchant);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void unserializeFromCacheData(String str) {
        ParsingManagerJson.unserializeObjectExcludingFields(ParsingMode.CACHE, new JSONObject(str), (Object) this, "merchant_info");
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public void unserializeFromNetworkData(JSONObject jSONObject) {
        String str;
        ParsingMode parsingMode = ParsingMode.NETWORK;
        ParsingManagerJson.unserializeObject(parsingMode, jSONObject, this);
        if (this.type == null) {
            this.type = CouponKind.ONLINE;
        }
        if (this.id_coupon_type == null) {
            if (!TextUtils.isEmpty(this.code)) {
                this.id_coupon_type = CouponType.CODE_PROMO;
            } else {
                CouponCodeType couponCodeType = this.code_type;
                if (couponCodeType == null || couponCodeType == CouponCodeType.NEITHER) {
                    this.id_coupon_type = CouponType.BON_PLAN;
                }
            }
        }
        if (this.id_coupon <= 0) {
            ParsingManagerJson.unserializeField(parsingMode, jSONObject, "id_coupon_store", (Object) this, "id_coupon");
            if (this.id_coupon <= 0) {
                this.id_coupon = getOldStoreId(jSONObject.optString("id_coupon"));
            }
        }
        if (this.id_merchant <= 0) {
            ParsingManagerJson.unserializeField(parsingMode, jSONObject, "id_store", (Object) this, "id_merchant");
            if (this.id_merchant <= 0) {
                this.id_merchant = getOldStoreId(jSONObject.optString("id_merchant"));
            }
        }
        if (TextUtils.isEmpty(this.mobile_illustration)) {
            ParsingManagerJson.unserializeField(parsingMode, jSONObject, "illustration_mobile", (Object) this, "mobile_illustration");
        }
        if (this.merchant_info == null) {
            try {
                if (jSONObject.has("Merchant")) {
                    ParsingManagerJson.unserializeField(parsingMode, jSONObject, "Merchant", (Object) this, "merchant_info");
                } else if (jSONObject.has("store_info")) {
                    ParsingManagerJson.unserializeField(parsingMode, jSONObject, "store_info", (Object) this, "merchant_info");
                }
            } catch (Exception unused) {
            }
        }
        String str2 = this.description;
        if (str2 != null) {
            this.description = C13623d.m31111k(str2);
        }
        if (isInstore()) {
            if (this.code_format == null) {
                this.code_format = CouponCodeFormat.CLASSIC;
            }
            if (this.code_format == CouponCodeFormat.PICTURE) {
                String str3 = this.code_picture;
                if (str3 == null || str3.equals("")) {
                    this.code_format = CouponCodeFormat.CLASSIC;
                } else {
                    this.code_picture = CloudUtil.getFullUrl(this.code_picture);
                }
            } else if (this.code_barcode_type == null) {
                this.code_format = CouponCodeFormat.CLASSIC;
            }
        }
        setIllustration(CloudUtil.getFullUrl(getIllustration()));
        String str4 = this.source;
        if (!(str4 == null || (str = this.id_source) == null)) {
            this.authorInfoKey = new AuthorInfoKey(str4, str);
        }
        if (!isModelValidAfterParsing()) {
            throw new Exception("Automatic unserializing problem");
        }
    }

    public String getExternalId(String str) {
        if (this.id_external == null || str == null || str.equals("")) {
            return null;
        }
        return this.id_external.getExternalId(str);
    }

    public boolean isFinished(long j) {
        return getRemainingExpirationMs(j) <= 0;
    }

    public boolean isStarted(long j) {
        Date date = this.date_start;
        if (date != null && j < date.getTime()) {
            return false;
        }
        return true;
    }

    public long getRemainingExpirationMs(long j) {
        Date date;
        Date date2 = this.date_end_validity;
        if (date2 == null || date2.getTime() <= 0) {
            Date date3 = this.date_end;
            if (date3 == null || date3.getTime() <= 0) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            date = this.date_end;
        } else {
            date = this.date_end_validity;
        }
        return date.getTime() - j;
    }
}
