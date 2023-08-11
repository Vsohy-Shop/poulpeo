package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormat */
public abstract class RMNParamFormat {
    public String[] convertArrayValue(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (isCorrectValueType(obj.getClass())) {
            return convertArrayValueOverriden(obj);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public String[] convertArrayValueOverriden(Object obj) {
        return new String[]{convertValue(obj)};
    }

    public final String convertValue(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (isCorrectValueType(obj.getClass())) {
            return convertValueOverriden(obj);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract String convertValueOverriden(Object obj);

    public final Object formatValue(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (isCorrectValueType(obj.getClass())) {
            return formatValueOverriden(obj);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Object formatValueForCache(Object obj) {
        return formatValue(obj);
    }

    public abstract Class<?> getParamType();

    public boolean isArray() {
        return false;
    }

    public abstract boolean isCorrectValueType(Class<?> cls);

    /* access modifiers changed from: protected */
    public Object formatValueOverriden(Object obj) {
        return obj;
    }
}
