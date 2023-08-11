package com.rmn.api.p322v2.main.cache;

import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;

/* renamed from: com.rmn.api.v2.main.cache.CacheResponseObject */
public class CacheResponseObject extends RMNResponseObjectImmutable {
    public CacheResponseObject(RMNMethodReturnType rMNMethodReturnType) {
        super(rMNMethodReturnType);
    }

    private boolean isCorrectType(Class<?> cls) {
        Class<?> componentType;
        Class<?> returnType = getmethodReturnType().getReturnType();
        if (returnType.equals(cls)) {
            return true;
        }
        Class cls2 = Boolean.TYPE;
        Class<Boolean> cls3 = Boolean.class;
        if ((!returnType.equals(cls2) && !returnType.equals(cls3)) || (!cls.equals(cls2) && !cls.equals(cls3))) {
            Class cls4 = Integer.TYPE;
            Class<Integer> cls5 = Integer.class;
            if ((!returnType.equals(cls4) && !returnType.equals(cls5)) || (!cls.equals(cls4) && !cls.equals(cls5))) {
                Class<Double> cls6 = Double.class;
                if ((!returnType.equals(Double.TYPE) && !returnType.equals(cls6)) || (!cls.equals(Double.TYPE) && !cls.equals(cls6))) {
                    Class<boolean[]> cls7 = boolean[].class;
                    Class<Boolean[]> cls8 = Boolean[].class;
                    if ((!returnType.equals(cls7) && !returnType.equals(cls8)) || (!cls.equals(cls7) && !cls.equals(cls8))) {
                        Class<int[]> cls9 = int[].class;
                        Class<Integer[]> cls10 = Integer[].class;
                        if ((!returnType.equals(cls9) && !returnType.equals(cls10)) || (!cls.equals(cls9) && !cls.equals(cls10))) {
                            Class<double[]> cls11 = double[].class;
                            Class<Double[]> cls12 = Double[].class;
                            if ((!returnType.equals(cls11) && !returnType.equals(cls12)) || (!cls.equals(cls11) && !cls.equals(cls12))) {
                                if (!returnType.isArray() || !cls.isArray() || (componentType = returnType.getComponentType()) == null || !componentType.equals(cls.getComponentType())) {
                                    return false;
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public void setResponseObject(Object obj) {
        if (obj != null) {
            Class<?> returnType = getmethodReturnType().getReturnType();
            Class<?> cls = obj.getClass();
            if (isCorrectType(cls)) {
                this.retrievedObject = obj;
                return;
            }
            throw new IllegalStateException("No match between return type and response : before (" + returnType.getSimpleName() + " - " + cls.getSimpleName() + "), after (" + getmethodReturnType().getReturnType().getSimpleName() + " - " + obj.getClass().getSimpleName() + ")");
        }
        throw new IllegalArgumentException();
    }
}
