package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNMethodParam */
public class RMNMethodParam {
    private RMNParamFormat format;
    private boolean isRequired;
    private String keyName;

    public RMNMethodParam(boolean z, String str, RMNParamFormat rMNParamFormat) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (rMNParamFormat != null) {
            this.isRequired = z;
            this.keyName = str;
            this.format = rMNParamFormat;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String[] convertArrayValue(Object obj) {
        return this.format.convertArrayValue(obj);
    }

    public String convertValue(Object obj) {
        return this.format.convertValue(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RMNMethodParam rMNMethodParam = (RMNMethodParam) obj;
        RMNParamFormat rMNParamFormat = this.format;
        if (rMNParamFormat == null) {
            if (rMNMethodParam.format != null) {
                return false;
            }
        } else if (!rMNParamFormat.equals(rMNMethodParam.format)) {
            return false;
        }
        if (this.isRequired != rMNMethodParam.isRequired) {
            return false;
        }
        String str = this.keyName;
        if (str == null) {
            if (rMNMethodParam.keyName != null) {
                return false;
            }
        } else if (!str.equals(rMNMethodParam.keyName)) {
            return false;
        }
        return true;
    }

    public Object formatValue(Object obj) {
        return this.format.formatValue(obj);
    }

    public Object formatValueForCache(Object obj) {
        return this.format.formatValueForCache(obj);
    }

    public String getKeyName() {
        return this.keyName;
    }

    public Class<?> getParamType() {
        return this.format.getParamType();
    }

    public int hashCode() {
        int i;
        int i2;
        RMNParamFormat rMNParamFormat = this.format;
        int i3 = 0;
        if (rMNParamFormat == null) {
            i = 0;
        } else {
            i = rMNParamFormat.hashCode();
        }
        int i4 = (i + 31) * 31;
        if (this.isRequired) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.keyName;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }

    public boolean isArray() {
        return this.format.isArray();
    }

    public boolean isCorrectValueType(Class<?> cls) {
        return this.format.isCorrectValueType(cls);
    }

    public boolean isRequired() {
        return this.isRequired;
    }
}
