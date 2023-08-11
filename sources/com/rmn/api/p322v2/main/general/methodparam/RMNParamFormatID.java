package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatID */
public class RMNParamFormatID extends RMNParamFormatInteger {
    public String convertValueOverriden(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() > 0) {
            return num.toString();
        }
        throw new IllegalArgumentException("An id can't have a negative value or a 0 value : " + num);
    }
}
