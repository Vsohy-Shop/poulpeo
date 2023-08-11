package com.rmn.api.p322v2.poulpeo.model;

import androidx.core.app.NotificationCompat;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPHome;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;

/* renamed from: com.rmn.api.v2.poulpeo.model.HomeSectionType */
public enum HomeSectionType implements IJsonSerialisableEnum {
    BANNER((String) null) {
        public ICacheMethodType getCacheMethod() {
            return CacheMethodsPLPHome.GET_HOME_SECTION_BANNER;
        }

        public Object getJSONValue() {
            return "banner";
        }

        public RMNMethodReturnType getReturnType() {
            return PLPMethodReturns.HOME_SECTION_BANNER_DETAIL;
        }

        public BaseHomeSection newHomeSection() {
            return new HomeSectionBanner();
        }
    },
    MERCHANT((String) null) {
        public ICacheMethodType getCacheMethod() {
            return CacheMethodsPLPHome.GET_HOME_SECTION_MERCHANT;
        }

        public Object getJSONValue() {
            return "merchant";
        }

        public RMNMethodReturnType getReturnType() {
            return PLPMethodReturns.HOME_SECTION_MERCHANT_DETAIL;
        }

        public BaseHomeSection newHomeSection() {
            return new HomeSectionMerchant();
        }
    },
    EVENT((String) null) {
        public ICacheMethodType getCacheMethod() {
            return CacheMethodsPLPHome.GET_HOME_SECTION_EVENT;
        }

        public Object getJSONValue() {
            return NotificationCompat.CATEGORY_EVENT;
        }

        public RMNMethodReturnType getReturnType() {
            return PLPMethodReturns.HOME_SECTION_EVENT_DETAIL;
        }

        public BaseHomeSection newHomeSection() {
            return new HomeSectionEvent();
        }
    };

    public static HomeSectionType findHomeSectionType(String str) {
        for (HomeSectionType homeSectionType : values()) {
            if (homeSectionType.getJSONValue().equals(str)) {
                return homeSectionType;
            }
        }
        return null;
    }

    public abstract ICacheMethodType getCacheMethod();

    public abstract RMNMethodReturnType getReturnType();

    public abstract BaseHomeSection newHomeSection();
}
