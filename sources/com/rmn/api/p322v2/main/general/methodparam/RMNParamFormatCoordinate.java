package com.rmn.api.p322v2.main.general.methodparam;

/* renamed from: com.rmn.api.v2.main.general.methodparam.RMNParamFormatCoordinate */
public class RMNParamFormatCoordinate extends RMNParamFormatDouble {
    private static final int NUMBER_OF_DECIMALS = 1;

    public Object formatValueForCache(Object obj) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (isCorrectValueType(cls)) {
                int pow = (int) Math.pow(10.0d, 1.0d);
                if (cls.equals(Integer.class)) {
                    obj = Double.valueOf((double) ((Integer) obj).intValue());
                }
                double d = (double) pow;
                return Double.valueOf(Math.floor(((Double) obj).doubleValue() * d) / d);
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
