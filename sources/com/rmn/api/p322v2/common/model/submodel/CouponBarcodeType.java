package com.rmn.api.p322v2.common.model.submodel;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.common.model.submodel.CouponBarcodeType */
public enum CouponBarcodeType implements IJsonSerialisableEnum {
    EAN_8((String) null) {
        public Object getJSONValue() {
            return "ean_8";
        }
    },
    EAN_13((String) null) {
        public Object getJSONValue() {
            return "ean_13";
        }
    },
    EAN_128((String) null) {
        public Object getJSONValue() {
            return "ean_128";
        }
    },
    UPC((String) null) {
        public Object getJSONValue() {
            return "upc";
        }
    },
    CODE_39((String) null) {
        public Object getJSONValue() {
            return "code_39";
        }
    },
    ITF((String) null) {
        public Object getJSONValue() {
            return "itf";
        }
    },
    QR_CODE((String) null) {
        public Object getJSONValue() {
            return "qr_code";
        }
    },
    QR_CODE_MICRO((String) null) {
        public Object getJSONValue() {
            return "micro_qr_code";
        }
    };
}
