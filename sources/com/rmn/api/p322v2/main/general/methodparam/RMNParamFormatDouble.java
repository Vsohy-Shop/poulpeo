package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatDouble */
public class RMNParamFormatDouble extends RMNParamFormat {
    public String convertValueOverriden(Object obj) {
        return ((Double) formatValue(obj)).toString();
    }

    public Object formatValueOverriden(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
            return Double.valueOf((double) ((Integer) obj).intValue());
        }
        return (Double) obj;
    }

    public Class<?> getParamType() {
        return Double.TYPE;
    }

    public boolean isCorrectValueType(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.equals(Integer.TYPE) && !cls.equals(Integer.class) && !cls.equals(Double.TYPE) && !cls.equals(Double.class)) {
            return false;
        } else {
            return true;
        }
    }
}
