package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;

/* renamed from: com.rmn.api.v2.poulpeo.model.EarningType */
public enum EarningType implements IJsonSerialisableEnum {
    CASHBACK((String) null) {
        public Object getJSONValue() {
            return APIResourceDescriptors.RESOURCE_TYPE_CASHBACK;
        }
    },
    REVIEW((String) null) {
        public Object getJSONValue() {
            return "review";
        }
    },
    SPONSORSHIP((String) null) {
        public Object getJSONValue() {
            return "sponsorship";
        }
    },
    BONUS((String) null) {
        public Object getJSONValue() {
            return "bonus";
        }
    },
    EXCEPTIONAL_BONUS((String) null) {
        public Object getJSONValue() {
            return "exceptional_bonus";
        }
    },
    EXCEPTIONAL_CASHBACK((String) null) {
        public Object getJSONValue() {
            return "exceptional_cashback";
        }
    };
}
