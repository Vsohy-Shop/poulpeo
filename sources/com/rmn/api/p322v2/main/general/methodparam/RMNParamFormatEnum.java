package com.rmn.api.p322v2.main.general.methodparam;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatEnum */
public class RMNParamFormatEnum extends RMNParamFormatString {
    private Set<String> possibleValues = new HashSet();

    public RMNParamFormatEnum(String... strArr) {
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                if (str == null) {
                    throw new IllegalArgumentException();
                } else if (!this.possibleValues.contains(str)) {
                    this.possibleValues.add(str);
                    i++;
                } else {
                    throw new IllegalArgumentException("Duplication of possible value");
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public String convertValueOverriden(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (this.possibleValues.contains(obj)) {
            return super.convertValueOverriden(obj);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
