package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatBoolean */
public class RMNParamFormatBoolean extends RMNParamFormat {
    public String convertValueOverriden(Object obj) {
        if (((Boolean) formatValue(obj)).booleanValue()) {
            return "1";
        }
        return "0";
    }

    public Class<?> getParamType() {
        return Boolean.TYPE;
    }

    public boolean isCorrectValueType(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.equals(Boolean.TYPE) && !cls.equals(Boolean.class)) {
            return false;
        } else {
            return true;
        }
    }
}
