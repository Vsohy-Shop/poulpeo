package com.rmn.api.p322v2.poulpeo.model;

import com.rmn.api.p322v2.main.json.IJsonSerialisableEnum;

/* renamed from: com.rmn.api.v2.poulpeo.model.PaymentMethod */
public enum PaymentMethod implements IJsonSerialisableEnum {
    IBAN((String) null) {
        public Object getJSONValue() {
            return "IBAN";
        }
    },
    PAYPAL((String) null) {
        public Object getJSONValue() {
            return "PAYPAL";
        }
    };

    public static PaymentMethod findPaymentMethod(String str) {
        for (PaymentMethod paymentMethod : values()) {
            if (paymentMethod.getJSONValue().equals(str)) {
                return paymentMethod;
            }
        }
        return null;
    }
}
