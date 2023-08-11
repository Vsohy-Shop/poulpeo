package com.rmn.api.p322v2.main.general.methodreturn;

/* renamed from: com.rmn.api.v2.main.general.methodreturn.RMNMethodReturnType */
public class RMNMethodReturnType {
    private boolean isRequired;
    private String keyName;
    private Class<?> returnType;

    public RMNMethodReturnType(boolean z, String str, Class<?> cls) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (cls != null) {
            this.isRequired = z;
            this.keyName = str;
            this.returnType = cls;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RMNMethodReturnType rMNMethodReturnType = (RMNMethodReturnType) obj;
        String str = this.keyName;
        if (str == null) {
            if (rMNMethodReturnType.keyName != null) {
                return false;
            }
        } else if (!str.equals(rMNMethodReturnType.keyName)) {
            return false;
        }
        Class<?> cls = this.returnType;
        if (cls == null) {
            if (rMNMethodReturnType.returnType != null) {
                return false;
            }
        } else if (!cls.equals(rMNMethodReturnType.returnType)) {
            return false;
        }
        return true;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public Class<?> getReturnType() {
        return this.returnType;
    }

    public int hashCode() {
        int i;
        String str = this.keyName;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i + 31) * 31;
        Class<?> cls = this.returnType;
        if (cls != null) {
            i2 = cls.hashCode();
        }
        return i3 + i2;
    }

    public boolean isCorrectValueType(Class<?> cls) {
        if (this.returnType.equals(cls) || this.returnType.isAssignableFrom(cls)) {
            return true;
        }
        Class<?> cls2 = this.returnType;
        Class cls3 = Boolean.TYPE;
        Class<Boolean> cls4 = Boolean.class;
        if (cls2.equals(cls3) && cls.equals(cls4)) {
            return true;
        }
        if (this.returnType.equals(cls4) && cls.equals(cls3)) {
            return true;
        }
        Class<?> cls5 = this.returnType;
        Class cls6 = Integer.TYPE;
        Class<Integer> cls7 = Integer.class;
        if (cls5.equals(cls6) && cls.equals(cls7)) {
            return true;
        }
        if (this.returnType.equals(cls7) && cls.equals(cls6)) {
            return true;
        }
        Class<Double> cls8 = Double.class;
        if (this.returnType.equals(Double.TYPE) && cls.equals(cls8)) {
            return true;
        }
        if (!this.returnType.equals(cls8) || !cls.equals(Double.TYPE)) {
            return false;
        }
        return true;
    }

    public boolean isRequired() {
        return this.isRequired;
    }
}
