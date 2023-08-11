package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatString */
public class RMNParamFormatString extends RMNParamFormat {
    public String convertValueOverriden(Object obj) {
        return (String) formatValue(obj);
    }

    public Class<?> getParamType() {
        return String.class;
    }

    public boolean isCorrectValueType(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (cls.equals(String.class)) {
            return true;
        } else {
            return false;
        }
    }
}
