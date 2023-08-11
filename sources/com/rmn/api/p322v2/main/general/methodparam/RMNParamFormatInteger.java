package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatInteger */
public class RMNParamFormatInteger extends RMNParamFormat {
    public String convertValueOverriden(Object obj) {
        return ((Integer) formatValue(obj)).toString();
    }

    public Class<?> getParamType() {
        return Integer.TYPE;
    }

    public boolean isCorrectValueType(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.equals(Integer.TYPE) && !cls.equals(Integer.class)) {
            return false;
        } else {
            return true;
        }
    }
}
