package com.rmn.api.p322v2.main.general.methodparam;

import java.util.Date;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatTimestamp */
public class RMNParamFormatTimestamp extends RMNParamFormat {
    public String convertValueOverriden(Object obj) {
        Long l;
        if (String.class.isAssignableFrom(obj.getClass())) {
            String str = (String) obj;
            if (str.equals("")) {
                return "";
            }
            try {
                l = Long.valueOf(Long.parseLong(str));
            } catch (Exception unused) {
                return "";
            }
        } else {
            if (Date.class.isAssignableFrom(obj.getClass())) {
                l = Long.valueOf(((Date) obj).getTime() / 1000);
            } else {
                l = (Long) formatValue(obj);
            }
        }
        return l.toString();
    }

    public Class<?> getParamType() {
        return Long.TYPE;
    }

    public boolean isCorrectValueType(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.equals(String.class) && !cls.equals(Date.class) && !cls.equals(Long.TYPE) && !cls.equals(Long.class)) {
            return false;
        } else {
            return true;
        }
    }
}
