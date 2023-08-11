package com.rmn.api.p322v2.main.json;

import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.json.ParsingManagerJson */
public class ParsingManagerJson {
    public static void assignEmptyValueToField(Field field, Object obj) {
        if (field.getType().equals(String.class)) {
            assignValueToField((ParsingMode) null, field, obj, "");
        } else {
            assignValueToField((ParsingMode) null, field, obj, (Object) null);
        }
    }

    public static boolean assignValueToField(ParsingMode parsingMode, Field field, Object obj, Object obj2) {
        if (field == null) {
            throw new IllegalArgumentException();
        } else if (obj != null) {
            Class<?> type = field.getType();
            if (!type.equals(Object.class) && !isParsableType(type)) {
                return false;
            }
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            if (obj2 == null) {
                try {
                    if (!type.isPrimitive()) {
                        field.set(obj, (Object) null);
                    } else if (type.equals(Boolean.TYPE)) {
                        field.setBoolean(obj, false);
                    } else if (type.equals(Integer.TYPE)) {
                        field.setInt(obj, 0);
                    } else if (type.equals(Long.TYPE)) {
                        field.setLong(obj, 0);
                    } else if (type.equals(Double.TYPE)) {
                        field.setDouble(obj, 0.0d);
                    }
                    return true;
                } catch (Exception e) {
                    C13633n.m31151g(ParsingManagerJson.class, e);
                    return false;
                } finally {
                    field.setAccessible(isAccessible);
                }
            } else {
                if (type.isPrimitive()) {
                    if (type.equals(Boolean.TYPE)) {
                        String str = "" + obj2;
                        if (!str.equals("true")) {
                            if (!str.equals("1")) {
                                field.setBoolean(obj, false);
                            }
                        }
                        field.setBoolean(obj, true);
                    } else if (type.equals(Integer.TYPE)) {
                        field.setInt(obj, Integer.parseInt("" + obj2));
                    } else if (type.equals(Long.TYPE)) {
                        field.setLong(obj, Long.parseLong("" + obj2));
                    } else if (type.equals(Double.TYPE)) {
                        field.setDouble(obj, Double.parseDouble("" + obj2));
                    }
                } else if (parsingMode == ParsingMode.NETWORK && IJsonNetworkParsable.class.isAssignableFrom(type) && (obj2 instanceof JSONObject)) {
                    IJsonNetworkParsable iJsonNetworkParsable = (IJsonNetworkParsable) newInstanceWithDefaultConstructor(type);
                    iJsonNetworkParsable.unserializeFromNetworkData((JSONObject) obj2);
                    field.set(obj, iJsonNetworkParsable);
                } else if (parsingMode == ParsingMode.CACHE && IJsonCacheSerialisable.class.isAssignableFrom(type) && (obj2 instanceof JSONObject)) {
                    IJsonCacheSerialisable iJsonCacheSerialisable = (IJsonCacheSerialisable) newInstanceWithDefaultConstructor(type);
                    iJsonCacheSerialisable.unserializeFromCacheData(obj2.toString());
                    field.set(obj, iJsonCacheSerialisable);
                } else if (!ModelRef.class.isAssignableFrom(type)) {
                    field.set(obj, obj2);
                } else if (obj2 instanceof JSONObject) {
                    Class[] genericTypes = getGenericTypes(field);
                    if (genericTypes.length > 0) {
                        AbstractModel abstractModel = (AbstractModel) newInstanceWithDefaultConstructor(genericTypes[0]);
                        abstractModel.unserializeFromCacheData(obj2.toString());
                        field.set(obj, new ModelRef(abstractModel));
                    } else {
                        throw new IllegalStateException("ModelReference must have 1 generic type extending AbstractModel");
                    }
                } else if (obj2 instanceof ModelRef) {
                    field.set(obj, obj2);
                } else if (obj2 instanceof AbstractModel) {
                    field.set(obj, new ModelRef((AbstractModel) obj2));
                }
                field.setAccessible(isAccessible);
                return true;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0261, code lost:
        if (r10.equals(r12) != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0147, code lost:
        if (r12.equals(r3) != false) goto L_0x0118;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0268 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0269  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object convertJSONValueToObjectValue(com.rmn.api.p322v2.main.json.ParsingMode r9, java.lang.Class<?> r10, java.lang.Object r11, boolean r12) {
        /*
            if (r10 == 0) goto L_0x0299
            if (r11 == 0) goto L_0x0293
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r11 == r0) goto L_0x0293
            java.lang.String r0 = "Not a parsable array type"
            if (r12 == 0) goto L_0x0019
            boolean r12 = isParsableType(r10)
            if (r12 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r0)
            throw r9
        L_0x0019:
            boolean r12 = r10.isEnum()
            r1 = 0
            if (r12 == 0) goto L_0x009c
            java.lang.Class<com.rmn.api.v2.main.json.IJsonSerialisableEnum> r12 = com.rmn.api.p322v2.main.json.IJsonSerialisableEnum.class
            boolean r12 = r12.isAssignableFrom(r10)
            if (r12 == 0) goto L_0x009c
            java.lang.Object[] r12 = r10.getEnumConstants()
            com.rmn.api.v2.main.json.IJsonSerialisableEnum[] r12 = (com.rmn.api.p322v2.main.json.IJsonSerialisableEnum[]) r12
            int r2 = r12.length
            r3 = r1
        L_0x0030:
            if (r3 >= r2) goto L_0x009c
            r4 = r12[r3]
            java.lang.Object r5 = r4.getJSONValue()
            if (r5 == 0) goto L_0x0081
            java.lang.Class r6 = r11.getClass()
            java.lang.Class r7 = r5.getClass()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0052
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x004f
            return r4
        L_0x004f:
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0052:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "Incompatible enum value and json value types : "
            r10.append(r12)
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r10.append(r11)
            java.lang.String r11 = " vs "
            r10.append(r11)
            java.lang.Class r11 = r5.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Enum json value is null for "
            r11.append(r12)
            java.lang.String r10 = r10.getSimpleName()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x009c:
            boolean r12 = r10.isArray()
            r2 = 1
            if (r12 == 0) goto L_0x0101
            java.lang.Class r10 = r10.getComponentType()
            boolean r12 = isParsableType(r10)
            if (r12 == 0) goto L_0x00fb
            boolean r12 = r11 instanceof org.json.JSONArray
            if (r12 == 0) goto L_0x00f3
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            org.json.JSONArray r11 = (org.json.JSONArray) r11
            int r0 = r11.length()
            r3 = r1
        L_0x00bd:
            if (r3 >= r0) goto L_0x00d7
            boolean r4 = r11.isNull(r3)
            if (r4 == 0) goto L_0x00c6
            goto L_0x00d4
        L_0x00c6:
            java.lang.Object r4 = r11.get(r3)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.Object r4 = convertJSONValueToObjectValue(r9, r10, r4, r1)     // Catch:{  }
            if (r4 != 0) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            r12.add(r4)
        L_0x00d4:
            int r3 = r3 + 1
            goto L_0x00bd
        L_0x00d7:
            int r9 = r12.size()
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r10, r9)
            java.util.Iterator r10 = r12.iterator()
        L_0x00e3:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f2
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Array.set(r9, r1, r11)
            int r1 = r1 + r2
            goto L_0x00e3
        L_0x00f2:
            return r9
        L_0x00f3:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Not a JSON Array"
            r9.<init>(r10)
            throw r9
        L_0x00fb:
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r0)
            throw r9
        L_0x0101:
            java.lang.Class r12 = r11.getClass()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r10.equals(r0)
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            r4 = 0
            if (r0 == 0) goto L_0x013b
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x011c
        L_0x0118:
            r4 = r11
        L_0x0119:
            r12 = r2
            goto L_0x0266
        L_0x011c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x012a
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0265
        L_0x012a:
            r12 = r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 != 0) goto L_0x0136
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L_0x0119
        L_0x0136:
            if (r12 != r2) goto L_0x0119
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L_0x0119
        L_0x013b:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r5 = r10.equals(r0)
            if (r5 == 0) goto L_0x014a
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0265
            goto L_0x0118
        L_0x014a:
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r6 = r10.equals(r5)
            java.lang.String r7 = ""
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            if (r6 == 0) goto L_0x0176
            boolean r0 = r12.equals(r8)
            if (r0 != 0) goto L_0x0162
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0265
        L_0x0162:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            goto L_0x0119
        L_0x0176:
            java.lang.Class r6 = java.lang.Double.TYPE
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x01c3
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x01ae
            java.lang.Class r6 = java.lang.Float.TYPE
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x01ae
            java.lang.Class<java.lang.Float> r6 = java.lang.Float.class
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x01ae
            boolean r5 = r12.equals(r5)
            if (r5 != 0) goto L_0x01ae
            boolean r5 = r12.equals(r8)
            if (r5 != 0) goto L_0x01ae
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01ae
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0265
        L_0x01ae:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            java.lang.Double r4 = java.lang.Double.valueOf(r12)
            goto L_0x0119
        L_0x01c3:
            java.lang.Class<java.util.Date> r6 = java.util.Date.class
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x0210
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r12.equals(r3)
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r12.equals(r5)
            if (r0 != 0) goto L_0x01e3
            boolean r12 = r12.equals(r8)
            if (r12 == 0) goto L_0x0265
        L_0x01e3:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r7)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            if (r12 == 0) goto L_0x0119
            long r5 = r12.longValue()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0119
            java.util.Date r4 = new java.util.Date
            long r5 = r12.longValue()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r7
            r4.<init>(r5)
            goto L_0x0119
        L_0x0210:
            com.rmn.api.v2.main.json.ParsingMode r0 = com.rmn.api.p322v2.main.json.ParsingMode.NETWORK
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            if (r9 != r0) goto L_0x0233
            java.lang.Class<com.rmn.api.v2.main.json.IJsonNetworkParsable> r0 = com.rmn.api.p322v2.main.json.IJsonNetworkParsable.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x0233
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0265
            java.lang.Object r12 = newInstanceWithDefaultConstructor(r10)
            r4 = r12
            com.rmn.api.v2.main.json.IJsonNetworkParsable r4 = (com.rmn.api.p322v2.main.json.IJsonNetworkParsable) r4
            r12 = r11
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            r4.unserializeFromNetworkData(r12)
            goto L_0x0119
        L_0x0233:
            com.rmn.api.v2.main.json.ParsingMode r0 = com.rmn.api.p322v2.main.json.ParsingMode.CACHE
            if (r9 != r0) goto L_0x0255
            java.lang.Class<com.rmn.api.v2.main.json.IJsonCacheSerialisable> r0 = com.rmn.api.p322v2.main.json.IJsonCacheSerialisable.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x0255
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x0265
            java.lang.Object r12 = newInstanceWithDefaultConstructor(r10)
            r4 = r12
            com.rmn.api.v2.main.json.IJsonCacheSerialisable r4 = (com.rmn.api.p322v2.main.json.IJsonCacheSerialisable) r4
            java.lang.String r12 = r11.toString()
            r4.unserializeFromCacheData(r12)
            goto L_0x0119
        L_0x0255:
            java.lang.Class<com.rmn.api.v2.main.model.ModelRef> r0 = com.rmn.api.p322v2.main.model.ModelRef.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 != 0) goto L_0x028b
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L_0x0265
            goto L_0x0118
        L_0x0265:
            r12 = r1
        L_0x0266:
            if (r12 == 0) goto L_0x0269
            return r4
        L_0x0269:
            java.lang.Exception r12 = new java.lang.Exception
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r0[r1] = r11
            java.lang.String r10 = r10.getSimpleName()
            r0[r2] = r10
            r10 = 2
            r0[r10] = r9
            java.lang.String r9 = "Adapted value of type %s not assigned into field of type %s for parsing mode : %s"
            java.lang.String r9 = java.lang.String.format(r9, r0)
            r12.<init>(r9)
            throw r12
        L_0x028b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Can't convert a JSON into a ModelReference, you must specify the concrete class extending AbstractModel"
            r9.<init>(r10)
            throw r9
        L_0x0293:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L_0x0299:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.json.ParsingManagerJson.convertJSONValueToObjectValue(com.rmn.api.v2.main.json.ParsingMode, java.lang.Class, java.lang.Object, boolean):java.lang.Object");
    }

    private static Class<?> getClassAtSuperClassLevel(Class<?> cls, int i) {
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        Class<? super Object> cls2 = cls;
        while (i2 < i) {
            i2++;
            cls2 = cls2.getSuperclass();
        }
        return cls2;
    }

    private static Class<?>[] getGenericTypes(Field field) {
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return new Class[0];
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
        Class<?>[] clsArr = new Class[actualTypeArguments.length];
        for (int i = 0; i < actualTypeArguments.length; i++) {
            clsArr[i] = (Class) actualTypeArguments[i];
        }
        return clsArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        throw new java.lang.IllegalArgumentException("Can't access the field value of " + r3.getName() + " in class " + r3.getType().getSimpleName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r3.setAccessible(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object getValueFromField(java.lang.reflect.Field r3, java.lang.Object r4) {
        /*
            if (r3 == 0) goto L_0x004b
            if (r4 == 0) goto L_0x0045
            boolean r0 = r3.isAccessible()
            r1 = 1
            r3.setAccessible(r1)
            java.lang.Object r4 = r3.get(r4)     // Catch:{ Exception -> 0x0016 }
            r3.setAccessible(r0)
            return r4
        L_0x0014:
            r4 = move-exception
            goto L_0x0041
        L_0x0016:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0014 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0014 }
            r1.<init>()     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = "Can't access the field value of "
            r1.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = r3.getName()     // Catch:{ all -> 0x0014 }
            r1.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = " in class "
            r1.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.Class r2 = r3.getType()     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ all -> 0x0014 }
            r1.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0014 }
            r4.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r4     // Catch:{ all -> 0x0014 }
        L_0x0041:
            r3.setAccessible(r0)
            throw r4
        L_0x0045:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L_0x004b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.json.ParsingManagerJson.getValueFromField(java.lang.reflect.Field, java.lang.Object):java.lang.Object");
    }

    public static boolean isParsableObject(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        } else if (!isParsableType(obj.getClass())) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isParsableType(Class<?> cls) {
        if (cls != null) {
            boolean z = true;
            if (!cls.equals(Boolean.TYPE) && !cls.equals(Boolean.class) && !cls.equals(Integer.TYPE) && !cls.equals(Integer.class) && !cls.equals(Long.TYPE) && !cls.equals(Long.class) && !cls.equals(Double.TYPE) && !cls.equals(Double.class)) {
                if (cls.equals(String.class) || cls.equals(Date.class) || cls.equals(JSONObject.class) || cls.equals(JSONArray.class) || IJsonNetworkParsable.class.isAssignableFrom(cls) || IJsonCacheSerialisable.class.isAssignableFrom(cls) || ModelRef.class.isAssignableFrom(cls)) {
                    return true;
                }
                if (cls.isEnum() && IJsonSerialisableEnum.class.isAssignableFrom(cls)) {
                    return true;
                }
                z = false;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType == null) {
                        return false;
                    }
                    return isParsableType(componentType);
                }
            }
            return z;
        }
        throw new IllegalArgumentException();
    }

    private static Object newInstanceWithDefaultConstructor(Class<?> cls) {
        Class<?> enclosingClass = cls.getEnclosingClass();
        if (enclosingClass == null || Modifier.isStatic(cls.getModifiers())) {
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                boolean isAccessible = declaredConstructor.isAccessible();
                declaredConstructor.setAccessible(true);
                try {
                    return declaredConstructor.newInstance(new Object[0]);
                } finally {
                    declaredConstructor.setAccessible(isAccessible);
                }
            } catch (Exception e) {
                throw new IllegalStateException("No default constructor was found for type " + cls.getSimpleName(), e);
            }
        } else {
            throw new UnsupportedOperationException("Nested class " + cls.getSimpleName() + " in " + enclosingClass.getSimpleName() + " must be declared static to avoid a new instance of the " + enclosingClass.getSimpleName() + " class");
        }
    }

    private static boolean serializeField(JSONObject jSONObject, Object obj, String str) {
        return serializeField(jSONObject, str, obj, str);
    }

    public static boolean serializeObject(JSONObject jSONObject, Object obj) {
        return serializeObjectExcludingFields(jSONObject, obj, (Set<String>) null);
    }

    public static boolean serializeObjectExcludingFields(JSONObject jSONObject, Object obj, String... strArr) {
        return serializeObjectExcludingFields(jSONObject, obj, 0, strArr);
    }

    public static boolean serializeObjectIncludingOnlyFields(JSONObject jSONObject, Object obj, String... strArr) {
        return serializeObjectIncludingOnlyFields(jSONObject, obj, 0, strArr);
    }

    public static boolean unserializeField(ParsingMode parsingMode, JSONObject jSONObject, Object obj, String str) {
        return unserializeField(parsingMode, jSONObject, str, obj, 0, str);
    }

    public static boolean unserializeObject(ParsingMode parsingMode, JSONObject jSONObject, Object obj) {
        return unserializeObjectExcludingFields(parsingMode, jSONObject, obj, (Set<String>) null);
    }

    public static boolean unserializeObjectExcludingFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, String... strArr) {
        return unserializeObjectExcludingFields(parsingMode, jSONObject, obj, 0, strArr);
    }

    public static boolean unserializeObjectIncludingOnlyFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, String... strArr) {
        return unserializeObjectIncludingOnlyFields(parsingMode, jSONObject, obj, 0, strArr);
    }

    private static boolean serializeField(JSONObject jSONObject, Object obj, int i, String str) {
        return serializeField(jSONObject, str, obj, i, str);
    }

    public static boolean serializeObject(JSONObject jSONObject, Object obj, int i) {
        return serializeObjectExcludingFields(jSONObject, obj, i, (Set<String>) null);
    }

    public static boolean serializeObjectExcludingFields(JSONObject jSONObject, Object obj, int i, String... strArr) {
        return serializeObjectExcludingFields(jSONObject, obj, i, (Set<String>) strArr != null ? new HashSet(Arrays.asList(strArr)) : null);
    }

    public static boolean serializeObjectIncludingOnlyFields(JSONObject jSONObject, Object obj, int i, String... strArr) {
        if (strArr != null && strArr.length > 0) {
            return serializeObjectIncludingOnlyFields(jSONObject, obj, i, (Set<String>) new HashSet(Arrays.asList(strArr)));
        }
        throw new IllegalArgumentException();
    }

    public static boolean unserializeField(ParsingMode parsingMode, JSONObject jSONObject, Object obj, int i, String str) {
        return unserializeField(parsingMode, jSONObject, str, obj, i, str);
    }

    public static boolean unserializeObject(ParsingMode parsingMode, JSONObject jSONObject, Object obj, int i) {
        return unserializeObjectExcludingFields(parsingMode, jSONObject, obj, i, (Set<String>) null);
    }

    public static boolean unserializeObjectExcludingFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, int i, String... strArr) {
        return unserializeObjectExcludingFields(parsingMode, jSONObject, obj, i, (Set<String>) strArr != null ? new HashSet(Arrays.asList(strArr)) : null);
    }

    public static boolean unserializeObjectIncludingOnlyFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, int i, String... strArr) {
        return unserializeObjectIncludingOnlyFields(parsingMode, jSONObject, obj, (Set<String>) strArr != null ? new HashSet(Arrays.asList(strArr)) : null);
    }

    public static boolean serializeField(JSONObject jSONObject, String str, Object obj, String str2) {
        return serializeField(jSONObject, str, obj, 0, str2);
    }

    public static boolean unserializeField(ParsingMode parsingMode, JSONObject jSONObject, String str, Object obj, String str2) {
        return unserializeField(parsingMode, jSONObject, str, obj, 0, str2);
    }

    public static boolean serializeField(JSONObject jSONObject, String str, Object obj, int i, String str2) {
        Field field;
        Object jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4 = jSONObject;
        String str3 = str;
        Object obj2 = obj;
        String str4 = str2;
        if (jSONObject4 == null) {
            throw new IllegalArgumentException();
        } else if (str3 == null || str3.equals("")) {
            throw new IllegalArgumentException();
        } else if (obj2 == null) {
            throw new IllegalArgumentException();
        } else if (str4 == null || str4.equals("")) {
            throw new IllegalArgumentException();
        } else {
            Class<?> classAtSuperClassLevel = getClassAtSuperClassLevel(obj.getClass(), i);
            if (str4.contains("$")) {
                return true;
            }
            try {
                field = classAtSuperClassLevel.getDeclaredField(str4);
            } catch (Exception unused) {
                field = null;
            }
            Class<ParsingManagerJson> cls = ParsingManagerJson.class;
            if (field == null) {
                C13633n.m31155k(cls, "Field " + str4 + " was not found for class " + obj.getClass().getSimpleName() + " (" + classAtSuperClassLevel.getSimpleName() + ")");
                return false;
            } else if (Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
                return true;
            } else {
                Class<?> type = field.getType();
                if (!isParsableType(type)) {
                    C13633n.m31155k(cls, "Field " + str4 + " of type " + type.getSimpleName() + " can't be serialized for " + obj.getClass().getSimpleName() + " (" + classAtSuperClassLevel.getSimpleName() + ")");
                    return false;
                }
                Object valueFromField = getValueFromField(field, obj2);
                if (valueFromField == null) {
                    return true;
                }
                Class<ModelRef> cls2 = ModelRef.class;
                Class<IJsonCacheSerialisable> cls3 = IJsonCacheSerialisable.class;
                if (type.isArray()) {
                    JSONArray jSONArray = new JSONArray();
                    int length = Array.getLength(valueFromField);
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj3 = Array.get(valueFromField, i2);
                        if (obj3 != null) {
                            if (cls3.isAssignableFrom(obj3.getClass())) {
                                try {
                                    jSONObject3 = new JSONObject(((IJsonCacheSerialisable) obj3).serializeToCacheData());
                                } catch (Exception unused2) {
                                }
                            } else {
                                if (cls2.isAssignableFrom(obj3.getClass())) {
                                    jSONObject3 = new JSONObject(((ModelRef) obj3).get().serializeToCacheData());
                                }
                                jSONArray.put(obj3);
                            }
                            obj3 = jSONObject3;
                            jSONArray.put(obj3);
                        }
                    }
                    try {
                        jSONObject4.put(str3, jSONArray);
                        return true;
                    } catch (JSONException unused3) {
                        return false;
                    }
                } else if (!type.isEnum() || !IJsonSerialisableEnum.class.isAssignableFrom(type)) {
                    if (type.equals(Date.class)) {
                        valueFromField = Long.valueOf(((Date) valueFromField).getTime() / 1000);
                    } else if (!type.equals(String.class)) {
                        if (cls3.isAssignableFrom(type)) {
                            try {
                                jSONObject2 = new JSONObject(((IJsonCacheSerialisable) valueFromField).serializeToCacheData());
                            } catch (Exception unused4) {
                                C13633n.m31155k(cls, "Field " + str4 + " of type " + type.getSimpleName() + " instance of IJsonCacheSerialisable : serialization failed for " + obj.getClass().getSimpleName() + " (" + classAtSuperClassLevel.getSimpleName() + ")");
                                return false;
                            }
                        } else if (cls2.isAssignableFrom(type)) {
                            try {
                                jSONObject2 = new JSONObject(((ModelRef) valueFromField).get().serializeToCacheData());
                            } catch (Exception unused5) {
                                C13633n.m31155k(cls, "Field " + str4 + " of type " + type.getSimpleName() + " instance of ModelReference : serialization failed for " + obj.getClass().getSimpleName() + " (" + classAtSuperClassLevel.getSimpleName() + ")");
                                return false;
                            }
                        }
                        valueFromField = jSONObject2;
                    } else if (((String) valueFromField).equals("")) {
                        return true;
                    }
                    try {
                        jSONObject4.put(str3, valueFromField);
                        return true;
                    } catch (JSONException unused6) {
                        return false;
                    }
                } else {
                    IJsonSerialisableEnum iJsonSerialisableEnum = (IJsonSerialisableEnum) valueFromField;
                    Object jSONValue = iJsonSerialisableEnum.getJSONValue();
                    if (jSONValue == null) {
                        throw new IllegalStateException("Null value for json gotten from enum " + type.getName() + " : " + iJsonSerialisableEnum);
                    } else if (!isParsableObject(jSONValue)) {
                        C13633n.m31155k(cls, "Field enum " + str4 + " of type " + type.getSimpleName() + " can't be serialized for " + obj.getClass().getSimpleName() + " (" + classAtSuperClassLevel.getSimpleName() + ") : " + jSONValue.getClass().getSimpleName());
                        return false;
                    } else {
                        try {
                            jSONObject4.put(str3, jSONValue);
                            return true;
                        } catch (JSONException unused7) {
                            return false;
                        }
                    }
                }
            }
        }
    }

    public static boolean serializeObjectExcludingFields(JSONObject jSONObject, Object obj, Set<String> set) {
        return serializeObjectExcludingFields(jSONObject, obj, 0, set);
    }

    public static boolean unserializeField(ParsingMode parsingMode, JSONObject jSONObject, String str, Object obj, int i, String str2) {
        Field field;
        Class<?> classAtSuperClassLevel = getClassAtSuperClassLevel(obj.getClass(), i);
        try {
            field = classAtSuperClassLevel.getDeclaredField(str2);
        } catch (Exception unused) {
            field = null;
        }
        if (field == null) {
            C13633n.m31155k(ParsingManagerJson.class, "Field " + str2 + " was not found for class " + obj.getClass().getSimpleName() + " (" + classAtSuperClassLevel.getSimpleName() + ")");
            return false;
        }
        return unserializeField(parsingMode, jSONObject, str, obj, obj.getClass(), i, str2, field.getType());
    }

    public static boolean unserializeObjectExcludingFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, Set<String> set) {
        return unserializeObjectExcludingFields(parsingMode, jSONObject, obj, 0, set);
    }

    public static boolean unserializeObjectIncludingOnlyFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, Set<String> set) {
        return unserializeObjectIncludingOnlyFields(parsingMode, jSONObject, obj, 0, set);
    }

    public static boolean serializeObjectExcludingFields(JSONObject jSONObject, Object obj, int i, Set<String> set) {
        if (jSONObject == null) {
            throw new IllegalArgumentException();
        } else if (obj != null) {
            if (i < 0) {
                i = 0;
            }
            Class cls = obj.getClass();
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 <= i; i2++) {
                Field[] declaredFields = cls.getDeclaredFields();
                HashSet hashSet2 = new HashSet();
                for (Field field : declaredFields) {
                    if (field != null) {
                        hashSet2.add(field.getName());
                    }
                }
                if (set != null) {
                    for (String next : set) {
                        if (next == null || next.equals("")) {
                            C13633n.m31155k(ParsingManagerJson.class, "Field to serialize \"" + next + "\" can't be ignored for Class " + obj.getClass().getSimpleName() + " (" + cls.getSimpleName() + ")");
                        } else {
                            hashSet2.remove(next);
                        }
                    }
                }
                hashSet.addAll(hashSet2);
                cls = cls.getSuperclass();
            }
            return serializeObjectIncludingOnlyFields(jSONObject, obj, i, (Set<String>) hashSet);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean unserializeObjectExcludingFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, int i, Set<String> set) {
        if (jSONObject == null) {
            throw new IllegalArgumentException();
        } else if (obj != null) {
            if (i < 0) {
                i = 0;
            }
            Class cls = obj.getClass();
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 <= i; i2++) {
                Field[] declaredFields = cls.getDeclaredFields();
                HashSet hashSet2 = new HashSet();
                for (Field field : declaredFields) {
                    if (field != null) {
                        hashSet2.add(field.getName());
                    }
                }
                if (set != null) {
                    for (String next : set) {
                        if (next == null || next.equals("")) {
                            C13633n.m31155k(ParsingManagerJson.class, "Field to unserialize \"" + next + "\" can't be ignored for Class " + obj.getClass().getSimpleName() + " (" + cls.getSimpleName() + ")");
                        } else {
                            hashSet2.remove(next);
                        }
                    }
                }
                hashSet.addAll(hashSet2);
                cls = cls.getSuperclass();
            }
            return unserializeObjectIncludingOnlyFields(parsingMode, jSONObject, obj, i, (Set<String>) hashSet);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean unserializeObjectIncludingOnlyFields(ParsingMode parsingMode, JSONObject jSONObject, Object obj, int i, Set<String> set) {
        if (jSONObject == null) {
            throw new IllegalArgumentException();
        } else if (obj == null) {
            throw new IllegalArgumentException();
        } else if (set == null || set.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            if (i < 0) {
                i = 0;
            }
            Class cls = obj.getClass();
            boolean z = true;
            for (int i2 = 0; i2 <= i; i2++) {
                for (Field field : cls.getDeclaredFields()) {
                    if (field != null) {
                        String name = field.getName();
                        if (set.contains(name) && !name.contains("$") && !Modifier.isFinal(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                            assignEmptyValueToField(field, obj);
                            z = z && unserializeField(parsingMode, jSONObject, obj, i2, name);
                        }
                    }
                }
                cls = cls.getSuperclass();
            }
            return z;
        }
    }

    public static boolean serializeObjectIncludingOnlyFields(JSONObject jSONObject, Object obj, Set<String> set) {
        return serializeObjectIncludingOnlyFields(jSONObject, obj, 0, set);
    }

    public static boolean serializeObjectIncludingOnlyFields(JSONObject jSONObject, Object obj, int i, Set<String> set) {
        if (jSONObject == null) {
            throw new IllegalArgumentException();
        } else if (obj == null) {
            throw new IllegalArgumentException();
        } else if (set == null || set.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            if (i < 0) {
                i = 0;
            }
            HashSet<String> hashSet = new HashSet<>(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    hashSet.add(next);
                }
            }
            for (String remove : hashSet) {
                jSONObject.remove(remove);
            }
            Class cls = obj.getClass();
            boolean z = true;
            for (int i2 = 0; i2 <= i; i2++) {
                Field[] declaredFields = cls.getDeclaredFields();
                HashSet hashSet2 = new HashSet();
                for (Field field : declaredFields) {
                    if (field != null) {
                        hashSet2.add(field.getName());
                    }
                }
                for (String next2 : set) {
                    if (hashSet2.contains(next2)) {
                        z = z && serializeField(jSONObject, obj, i2, next2);
                    }
                }
                cls = cls.getSuperclass();
            }
            return z;
        }
    }

    public static boolean unserializeField(ParsingMode parsingMode, JSONObject jSONObject, String str, Object obj, String str2, Class<?> cls) {
        return unserializeField(parsingMode, jSONObject, str, obj, obj.getClass(), 0, str2, cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean unserializeField(com.rmn.api.p322v2.main.json.ParsingMode r20, org.json.JSONObject r21, java.lang.String r22, java.lang.Object r23, java.lang.Class<?> r24, int r25, java.lang.String r26, java.lang.Class<?> r27) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            r0 = r24
            r4 = r26
            r5 = r27
            java.lang.String r6 = ") can't be parsed in "
            java.lang.String r7 = "\" of type ("
            java.lang.String r8 = "Field \""
            java.lang.Class<com.rmn.api.v2.main.json.ParsingManagerJson> r9 = com.rmn.api.p322v2.main.json.ParsingManagerJson.class
            if (r2 == 0) goto L_0x0222
            if (r23 == 0) goto L_0x021c
            if (r4 == 0) goto L_0x0216
            java.lang.String r10 = ""
            boolean r11 = r4.equals(r10)
            if (r11 != 0) goto L_0x0216
            java.lang.Class r11 = r23.getClass()
            java.lang.Class<com.rmn.api.v2.main.model.ModelRef> r12 = com.rmn.api.p322v2.main.model.ModelRef.class
            boolean r13 = r11.equals(r12)
            java.lang.String r14 = " : "
            if (r13 == 0) goto L_0x0055
            java.lang.Class<com.rmn.api.v2.main.model.AbstractModel> r13 = com.rmn.api.p322v2.main.model.AbstractModel.class
            boolean r13 = r13.isAssignableFrom(r0)
            if (r13 == 0) goto L_0x0039
            goto L_0x005b
        L_0x0039:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't pass a "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " for objectToUnserializeClass if the object class is a ModelReference it must inherit from AbstractModel"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0055:
            boolean r13 = r0.isAssignableFrom(r11)
            if (r13 == 0) goto L_0x01f9
        L_0x005b:
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x006a
            r11 = r23
            com.rmn.api.v2.main.model.ModelRef r11 = (com.rmn.api.p322v2.main.model.ModelRef) r11
            com.rmn.api.v2.main.model.AbstractModel r11 = r11.get()
            goto L_0x006c
        L_0x006a:
            r11 = r23
        L_0x006c:
            java.lang.Class r13 = getClassAtSuperClassLevel(r24, r25)
            java.lang.String r0 = "$"
            boolean r0 = r4.contains(r0)
            r15 = 1
            if (r0 == 0) goto L_0x007a
            return r15
        L_0x007a:
            r16 = 0
            java.lang.reflect.Field r0 = r13.getDeclaredField(r4)     // Catch:{ Exception -> 0x0084 }
            r15 = r0
            r17 = r6
            goto L_0x008d
        L_0x0084:
            r0 = move-exception
            r15 = r0
            p446vd.C13633n.m31157m(r9, r15)
            r17 = r6
            r15 = r16
        L_0x008d:
            java.lang.String r6 = ")"
            r18 = r7
            java.lang.String r7 = " ("
            r19 = 0
            if (r15 != 0) goto L_0x00c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Field "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " was not found for class "
            r0.append(r1)
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = r13.getSimpleName()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p446vd.C13633n.m31155k(r9, r0)
            return r19
        L_0x00c9:
            java.lang.Class r0 = r15.getType()
            boolean r4 = r5.equals(r0)
            if (r4 != 0) goto L_0x0105
            boolean r4 = r0.isAssignableFrom(r5)
            if (r4 != 0) goto L_0x0105
            boolean r4 = r0.equals(r12)
            if (r4 == 0) goto L_0x00e0
            goto L_0x0105
        L_0x00e0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incompatible field types for class "
            r2.append(r3)
            java.lang.String r3 = r27.getSimpleName()
            r2.append(r3)
            r2.append(r14)
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0105:
            int r0 = r15.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 == 0) goto L_0x0111
            r4 = 1
            return r4
        L_0x0111:
            r4 = 1
            int r0 = r15.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L_0x011d
            return r4
        L_0x011d:
            boolean r0 = r5.equals(r12)
            if (r0 == 0) goto L_0x0136
            java.lang.Class[] r0 = getGenericTypes(r15)
            int r4 = r0.length
            if (r4 <= 0) goto L_0x012e
            r0 = r0[r19]
            r5 = r0
            goto L_0x0136
        L_0x012e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ModelReference must have 1 generic type extending AbstractModel"
            r0.<init>(r1)
            throw r0
        L_0x0136:
            if (r3 == 0) goto L_0x0150
            boolean r0 = r3.equals(r10)
            if (r0 == 0) goto L_0x013f
            goto L_0x0150
        L_0x013f:
            boolean r0 = r21.has(r22)
            if (r0 == 0) goto L_0x0156
            boolean r0 = r21.isNull(r22)
            if (r0 != 0) goto L_0x0156
            java.lang.Object r0 = r21.opt(r22)
            goto L_0x0158
        L_0x0150:
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r2 == r0) goto L_0x0156
            r0 = r2
            goto L_0x0158
        L_0x0156:
            r0 = r16
        L_0x0158:
            if (r0 != 0) goto L_0x015f
            assignEmptyValueToField(r15, r11)
            r2 = 1
            return r2
        L_0x015f:
            r2 = 1
            java.lang.Object r0 = convertJSONValueToObjectValue(r1, r5, r0, r2)     // Catch:{ Exception -> 0x01b7 }
            java.lang.Class r2 = r15.getType()
            java.lang.Class<java.util.Date> r3 = java.util.Date.class
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01b2
            if (r0 != 0) goto L_0x01b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = r15.getName()
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            java.lang.String r1 = r5.getSimpleName()
            r0.append(r1)
            r2 = r17
            r0.append(r2)
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = r13.getSimpleName()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p446vd.C13633n.m31155k(r9, r0)
            return r19
        L_0x01b2:
            boolean r0 = assignValueToField(r1, r15, r11, r0)
            return r0
        L_0x01b7:
            r0 = move-exception
            r2 = r17
            r1 = r18
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r4 = r15.getName()
            r0.append(r4)
            r0.append(r1)
            java.lang.String r1 = r5.getSimpleName()
            r0.append(r1)
            r0.append(r2)
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = r13.getSimpleName()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p446vd.C13633n.m31156l(r9, r0, r3)
            return r19
        L_0x01f9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incompatible object types for class "
            r2.append(r3)
            r2.append(r0)
            r2.append(r14)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0216:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x021c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0222:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.json.ParsingManagerJson.unserializeField(com.rmn.api.v2.main.json.ParsingMode, org.json.JSONObject, java.lang.String, java.lang.Object, java.lang.Class, int, java.lang.String, java.lang.Class):boolean");
    }
}
