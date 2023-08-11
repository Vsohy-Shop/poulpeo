package com.rmn.apiclient.core.json;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.reflection.ReflectionUtils;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONHelper;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p446vd.C13633n;

public final class JSONSerializationManager {
    public static final JSONSerializationManager instance = new JSONSerializationManager();

    private JSONSerializationManager() {
    }

    @Nullable
    private <TJ, TF> IAttributeTypeDriver<TJ, TF> findDriver(@NonNull Class<TJ> cls, @NonNull Class<TF> cls2) {
        for (IAttributeTypeDriver<?, ?> iAttributeTypeDriver : C11605a.f18062a) {
            if (iAttributeTypeDriver.isJsonType(cls) && iAttributeTypeDriver.isFieldType(cls2)) {
                return iAttributeTypeDriver;
            }
        }
        return null;
    }

    @Nullable
    private Class<?>[] getGenericTypes(@NonNull Field field) {
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
        Class<?>[] clsArr = new Class[actualTypeArguments.length];
        for (int i = 0; i < actualTypeArguments.length; i++) {
            clsArr[i] = (Class) actualTypeArguments[i];
        }
        return clsArr;
    }

    public <T> void deserialize(@Nullable JSONObject jSONObject, @NonNull T t) {
        if (jSONObject != null) {
            Iterator<String> nonNullKeys = JSONHelper.getNonNullKeys(jSONObject);
            while (nonNullKeys.hasNext()) {
                String next = nonNullKeys.next();
                Field field = ReflectionUtils.getField(t, next);
                if (field != null) {
                    ReflectionUtils.setValue(deserializeFieldValue(field.getType(), getGenericTypes(field), JSONHelper.opt(jSONObject, next)), t, field);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [TF, TJ, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <TJ, TF> TF deserializeFieldValue(@androidx.annotation.NonNull java.lang.Class<TF> r4, @androidx.annotation.Nullable java.lang.Class<?>[] r5, @androidx.annotation.Nullable TJ r6) {
        /*
            r3 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class r1 = r6.getClass()
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x000f
            return r6
        L_0x000f:
            com.rmn.apiclient.core.json.IAttributeTypeDriver r1 = r3.findDriver(r1, r4)
            if (r1 != 0) goto L_0x0016
            return r0
        L_0x0016:
            java.lang.Object r4 = r1.convertFromJsonToField(r4, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.apiclient.core.json.JSONSerializationManager.deserializeFieldValue(java.lang.Class, java.lang.Class[], java.lang.Object):java.lang.Object");
    }

    @Nullable
    public <T> T deserializeObject(@NonNull Class<T> cls, @Nullable JSONObject jSONObject) {
        T newInstance = ReflectionUtils.newInstance(cls);
        if (newInstance == null) {
            return null;
        }
        deserialize(jSONObject, newInstance);
        return newInstance;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [TF, TJ, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <TJ, TF> TJ serializeFieldValue(@androidx.annotation.NonNull java.lang.Class<TJ> r4, @androidx.annotation.Nullable TF r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Class r1 = r5.getClass()
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L_0x000f
            return r5
        L_0x000f:
            com.rmn.apiclient.core.json.IAttributeTypeDriver r4 = r3.findDriver(r4, r1)
            if (r4 != 0) goto L_0x0016
            return r0
        L_0x0016:
            java.lang.Object r4 = r4.convertFromFieldToJson(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.apiclient.core.json.JSONSerializationManager.serializeFieldValue(java.lang.Class, java.lang.Object):java.lang.Object");
    }

    @Nullable
    public JSONObject serializeObject(@Nullable Object obj) {
        return serializeObjectExcluding(obj, new String[0]);
    }

    @Nullable
    public JSONObject serializeObjectExcluding(@Nullable Object obj, @NonNull String... strArr) {
        if (obj == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet(Arrays.asList(strArr));
        for (Field name : ReflectionUtils.getAllFields(obj)) {
            String name2 = name.getName();
            if (!hashSet2.contains(name2)) {
                hashSet.add(name2);
            }
        }
        return serializeObjectIncluding(obj, (String[]) hashSet.toArray(new String[0]));
    }

    @Nullable
    public JSONObject serializeObjectIncluding(@Nullable Object obj, @NonNull String... strArr) {
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        for (Field next : ReflectionUtils.getAllFields(obj)) {
            String name = next.getName();
            if (hashSet.contains(name)) {
                try {
                    jSONObject.putOpt(name, ReflectionUtils.getValue(obj, next));
                } catch (JSONException e) {
                    C13633n.m31165u(this, e);
                }
            }
        }
        return jSONObject;
    }
}
