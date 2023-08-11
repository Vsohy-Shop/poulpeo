package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;
import com.rmn.api.p322v2.main.model.AbstractModel;

/* renamed from: com.rmn.api.v2.common.model.submodel.CloudListType */
public enum CloudListType implements IJsonSerialisableEnum {
    MERCHANT((String) null) {
        public Class<? extends AbstractModel> getElemClass(String str) {
            return BaseMerchant.class;
        }

        public Object getJSONValue() {
            return "merchant";
        }
    },
    COUPON_INSTORE((String) null) {
        public Class<? extends AbstractModel> getElemClass(String str) {
            return BaseCoupon.class;
        }

        public Object getJSONValue() {
            return "coupon-instore";
        }
    },
    COUPON_WEB((String) null) {
        public Class<? extends AbstractModel> getElemClass(String str) {
            return BaseCoupon.class;
        }

        public Object getJSONValue() {
            return "coupon";
        }
    },
    COUPON_HYBRID((String) null) {
        public Class<? extends AbstractModel> getElemClass(String str) {
            if (str == null || str.equals("")) {
                return null;
            }
            Class<BaseCoupon> cls = BaseCoupon.class;
            if (!CloudListType.hasPrefix(str, CloudListType.PREFIX_ID_COUPON_WEB) && !CloudListType.hasPrefix(str, CloudListType.PREFIX_ID_COUPON_INSTORE)) {
                return null;
            }
            return cls;
        }

        public String getIdPrefix(Class<?> cls) {
            Class<BaseCoupon> cls2 = BaseCoupon.class;
            if (cls2.equals(cls)) {
                return CloudListType.PREFIX_ID_COUPON_WEB;
            }
            if (cls2.equals(cls)) {
                return CloudListType.PREFIX_ID_COUPON_INSTORE;
            }
            return "";
        }

        public Object getJSONValue() {
            return "coupon-hybride";
        }

        public Object parseId(String str) {
            String str2;
            if (CloudListType.hasPrefix(str, CloudListType.PREFIX_ID_COUPON_WEB)) {
                str2 = str.substring(4, str.length());
            } else if (CloudListType.hasPrefix(str, CloudListType.PREFIX_ID_COUPON_INSTORE)) {
                str2 = str.substring(8, str.length());
            } else {
                str2 = null;
            }
            if (str2 != null && !str2.equals("")) {
                try {
                    return Integer.valueOf(Integer.parseInt(str2));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
    };
    
    public static final String PREFIX_ID_COUPON_INSTORE = "instore_";
    public static final String PREFIX_ID_COUPON_WEB = "web_";

    /* access modifiers changed from: private */
    public static boolean hasPrefix(String str, String str2) {
        if (str.length() <= str2.length() || !str.substring(0, str2.length()).equals(str2)) {
            return false;
        }
        return true;
    }

    public abstract Class<? extends AbstractModel> getElemClass(String str);

    public String getIdPrefix(Class<?> cls) {
        return "";
    }

    public Object parseId(String str) {
        if (str != null && !str.equals("")) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
