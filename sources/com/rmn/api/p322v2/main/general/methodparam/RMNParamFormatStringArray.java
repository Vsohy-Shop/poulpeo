package com.rmn.api.p322v2.main.general.methodparam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatStringArray */
public final class RMNParamFormatStringArray extends RMNParamFormatString {
    public String[] convertArrayValueOverriden(Object obj) {
        Class<?> cls = obj.getClass();
        Class<String> cls2 = String.class;
        if (cls.isAssignableFrom(cls2)) {
            return new String[]{convertValue(obj)};
        }
        ArrayList arrayList = new ArrayList();
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                arrayList.add((String) formatValue(Array.get(obj, i)));
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            for (Object next : (Collection) obj) {
                if (next.getClass().equals(cls2)) {
                    arrayList.add((String) formatValue(next));
                } else {
                    throw new IllegalStateException("The element must be a String : " + next.getClass());
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Object formatValueForCache(Object obj) {
        Class<?> cls = obj.getClass();
        Class<String> cls2 = String.class;
        boolean z = true;
        if (cls.isAssignableFrom(cls2)) {
            return new String[]{convertValue(obj)};
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                arrayList.add((String) formatValue(Array.get(obj, i)));
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            for (Object next : (Collection) obj) {
                if (next.getClass().equals(cls2)) {
                    arrayList.add((String) formatValue(next));
                } else {
                    throw new IllegalStateException("The element must be a String : " + next.getClass());
                }
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public boolean isArray() {
        return true;
    }

    public boolean isCorrectValueType(Class<?> cls) {
        if (cls != null) {
            Class<String> cls2 = String.class;
            if (cls.equals(cls2)) {
                return true;
            }
            if ((!cls.isArray() || !cls.getComponentType().equals(cls2)) && !Collection.class.isAssignableFrom(cls)) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException();
    }
}
