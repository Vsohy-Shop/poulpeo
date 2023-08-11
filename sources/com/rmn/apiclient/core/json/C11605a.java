package com.rmn.apiclient.core.json;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.core.reflection.ReflectionUtils;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONHelper;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p446vd.C13633n;

/* renamed from: com.rmn.apiclient.core.json.a */
/* compiled from: JSONSerializationDrivers */
final class C11605a {
    @NonNull

    /* renamed from: a */
    static final IAttributeTypeDriver<?, ?>[] f18062a;

    /* renamed from: com.rmn.apiclient.core.json.a$a */
    /* compiled from: JSONSerializationDrivers */
    class C11606a extends BaseAttributeTypeDriver<Number, ISerializableEnumInt> {
        C11606a(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: a */
        public Number convertFromFieldToJson(@NonNull ISerializableEnumInt iSerializableEnumInt) {
            return Integer.valueOf(iSerializableEnumInt.getSerializedValue());
        }

        @Nullable
        /* renamed from: b */
        public ISerializableEnumInt convertFromJsonToField(@NonNull Class<ISerializableEnumInt> cls, @Nullable Class<?>[] clsArr, @NonNull Number number) {
            ISerializableEnumInt[] iSerializableEnumIntArr = (ISerializableEnumInt[]) cls.getEnumConstants();
            if (iSerializableEnumIntArr == null) {
                return null;
            }
            for (ISerializableEnumInt iSerializableEnumInt : iSerializableEnumIntArr) {
                if (number.equals(Integer.valueOf(iSerializableEnumInt.getSerializedValue()))) {
                    return iSerializableEnumInt;
                }
            }
            return null;
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            if (cls == this.fieldType || (cls.isEnum() && this.fieldType.isAssignableFrom(cls))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$b */
    /* compiled from: JSONSerializationDrivers */
    class C11607b extends BaseAttributeTypeDriver<String, ISerializableEnumString> {
        C11607b(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: a */
        public String convertFromFieldToJson(@NonNull ISerializableEnumString iSerializableEnumString) {
            return iSerializableEnumString.getSerializedValue();
        }

        @Nullable
        /* renamed from: b */
        public ISerializableEnumString convertFromJsonToField(@NonNull Class<ISerializableEnumString> cls, @Nullable Class<?>[] clsArr, @NonNull String str) {
            ISerializableEnumString[] iSerializableEnumStringArr = (ISerializableEnumString[]) cls.getEnumConstants();
            if (iSerializableEnumStringArr == null) {
                return null;
            }
            for (ISerializableEnumString iSerializableEnumString : iSerializableEnumStringArr) {
                if (str.equals(iSerializableEnumString.getSerializedValue())) {
                    return iSerializableEnumString;
                }
            }
            return null;
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            if (cls == this.fieldType || (cls.isEnum() && this.fieldType.isAssignableFrom(cls))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$c */
    /* compiled from: JSONSerializationDrivers */
    class C11608c implements IAttributeTypeDriver<JSONArray, Object> {
        C11608c() {
        }

        @NonNull
        /* renamed from: a */
        public JSONArray convertFromFieldToJson(@NonNull Object obj) {
            JSONArray jSONArray = new JSONArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject serializeObject = JSONSerializationManager.instance.serializeObject(Array.get(obj, i));
                    if (!(serializeObject == null || serializeObject == JSONObject.NULL)) {
                        jSONArray.put(serializeObject);
                    }
                } catch (Exception e) {
                    C13633n.m31165u(this, e);
                }
            }
            return jSONArray;
        }

        @Nullable
        /* renamed from: b */
        public Object convertFromJsonToField(@NonNull Class<Object> cls, @Nullable Class<?>[] clsArr, @NonNull JSONArray jSONArray) {
            Object[] newArrayInstance;
            int length = jSONArray.length();
            Class<?> componentType = cls.getComponentType();
            if (componentType == null || (newArrayInstance = ReflectionUtils.newArrayInstance(componentType, length)) == null) {
                return null;
            }
            for (int i = 0; i < length; i++) {
                newArrayInstance[i] = JSONSerializationManager.instance.deserializeFieldValue(componentType, (Class<?>[]) null, JSONHelper.opt(jSONArray, i));
            }
            return newArrayInstance;
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            return cls.isArray();
        }

        public boolean isJsonType(@NonNull Class<?> cls) {
            if (cls == JSONArray.class) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$d */
    /* compiled from: JSONSerializationDrivers */
    class C11609d implements IAttributeTypeDriver<JSONArray, Collection<Object>> {
        C11609d() {
        }

        @NonNull
        /* renamed from: a */
        public JSONArray convertFromFieldToJson(@NonNull Collection<Object> collection) {
            JSONArray jSONArray = new JSONArray();
            for (Object serializeObject : collection) {
                JSONObject serializeObject2 = JSONSerializationManager.instance.serializeObject(serializeObject);
                if (!(serializeObject2 == null || serializeObject2 == JSONObject.NULL)) {
                    jSONArray.put(serializeObject2);
                }
            }
            return jSONArray;
        }

        /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Class<java.util.Collection<java.lang.Object>>, java.lang.Class, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @androidx.annotation.Nullable
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.Collection<java.lang.Object> convertFromJsonToField(@androidx.annotation.NonNull java.lang.Class<java.util.Collection<java.lang.Object>> r6, @androidx.annotation.Nullable java.lang.Class<?>[] r7, @androidx.annotation.NonNull org.json.JSONArray r8) {
            /*
                r5 = this;
                r0 = 0
                if (r7 == 0) goto L_0x0063
                int r1 = r7.length
                r2 = 1
                if (r1 == r2) goto L_0x0008
                goto L_0x0063
            L_0x0008:
                r1 = 0
                r7 = r7[r1]
                if (r7 != 0) goto L_0x000e
                return r0
            L_0x000e:
                java.lang.Object r2 = com.rmn.apiclient.core.reflection.ReflectionUtils.newInstance(r6)
                java.util.Collection r2 = (java.util.Collection) r2
                int r3 = r8.length()
                if (r2 != 0) goto L_0x004d
                java.lang.Class<java.util.Set> r2 = java.util.Set.class
                boolean r2 = r2.isAssignableFrom(r6)
                if (r2 == 0) goto L_0x0028
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>(r3)
                goto L_0x004d
            L_0x0028:
                java.lang.Class<java.util.List> r2 = java.util.List.class
                boolean r2 = r2.isAssignableFrom(r6)
                if (r2 == 0) goto L_0x0036
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r3)
                goto L_0x004d
            L_0x0036:
                java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Not managed yet collection of subtype : "
                r8.append(r0)
                r8.append(r6)
                java.lang.String r6 = r8.toString()
                r7.<init>(r6)
                throw r7
            L_0x004d:
                if (r1 >= r3) goto L_0x0062
                com.rmn.apiclient.core.json.JSONSerializationManager r6 = com.rmn.apiclient.core.json.JSONSerializationManager.instance
                java.lang.Object r4 = com.rmn.apiclient.impl.jsonapi.serializer.JSONHelper.opt((org.json.JSONArray) r8, (int) r1)
                java.lang.Object r6 = r6.deserializeFieldValue(r7, r0, r4)
                if (r6 != 0) goto L_0x005c
                goto L_0x005f
            L_0x005c:
                r2.add(r6)
            L_0x005f:
                int r1 = r1 + 1
                goto L_0x004d
            L_0x0062:
                return r2
            L_0x0063:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rmn.apiclient.core.json.C11605a.C11609d.convertFromJsonToField(java.lang.Class, java.lang.Class[], org.json.JSONArray):java.util.Collection");
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            return Collection.class.isAssignableFrom(cls);
        }

        public boolean isJsonType(@NonNull Class<?> cls) {
            if (cls == JSONArray.class) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$e */
    /* compiled from: JSONSerializationDrivers */
    class C11610e implements IAttributeTypeDriver<JSONObject, Map<String, Object>> {
        C11610e() {
        }

        @NonNull
        /* renamed from: a */
        public JSONObject convertFromFieldToJson(@NonNull Map<String, Object> map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                Object key = next.getKey();
                Object value = next.getValue();
                if (key != null) {
                    String obj = key.toString();
                    JSONObject serializeObject = JSONSerializationManager.instance.serializeObject(value);
                    if (serializeObject != null) {
                        try {
                            jSONObject.put(obj, serializeObject);
                        } catch (JSONException e) {
                            C13633n.m31165u(this, e);
                        }
                    }
                }
            }
            return jSONObject;
        }

        @Nullable
        /* renamed from: b */
        public Map<String, Object> convertFromJsonToField(@NonNull Class<Map<String, Object>> cls, @Nullable Class<?>[] clsArr, @NonNull JSONObject jSONObject) {
            Class<?> cls2;
            Class<?> cls3;
            if (clsArr == null || clsArr.length != 2 || (cls2 = clsArr[0]) == null || (cls3 = clsArr[1]) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            Iterator<String> nonNullKeys = JSONHelper.getNonNullKeys(jSONObject);
            while (nonNullKeys.hasNext()) {
                String next = nonNullKeys.next();
                JSONSerializationManager jSONSerializationManager = JSONSerializationManager.instance;
                Object deserializeFieldValue = jSONSerializationManager.deserializeFieldValue(cls2, (Class<?>[]) null, next);
                if (deserializeFieldValue != null) {
                    hashMap.put(deserializeFieldValue.toString(), jSONSerializationManager.deserializeFieldValue(cls3, (Class<?>[]) null, JSONHelper.opt(jSONObject, next)));
                }
            }
            return hashMap;
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            return Map.class.isAssignableFrom(cls);
        }

        public boolean isJsonType(@NonNull Class<?> cls) {
            if (cls == JSONObject.class) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$f */
    /* compiled from: JSONSerializationDrivers */
    class C11611f extends BaseAttributeTypeDriver<JSONObject, Object> {
        C11611f(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @Nullable
        /* renamed from: a */
        public JSONObject convertFromFieldToJson(@NonNull Object obj) {
            return JSONSerializationManager.instance.serializeObject(obj);
        }

        @Nullable
        /* renamed from: b */
        public Object convertFromJsonToField(@NonNull Class<Object> cls, @Nullable Class<?>[] clsArr, @NonNull JSONObject jSONObject) {
            return JSONSerializationManager.instance.deserializeObject(cls, jSONObject);
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$l */
    /* compiled from: JSONSerializationDrivers */
    class C11617l extends BaseAttributeTypeDriver<Number, Date> {
        C11617l(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: a */
        public Number convertFromFieldToJson(@NonNull Date date) {
            return Integer.valueOf((int) (((float) date.getTime()) / 1000.0f));
        }

        @NonNull
        /* renamed from: b */
        public Date convertFromJsonToField(@NonNull Class<Date> cls, @Nullable Class<?>[] clsArr, @NonNull Number number) {
            return new Date(number.longValue() * 1000);
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$m */
    /* compiled from: JSONSerializationDrivers */
    class C11618m extends BaseAttributeTypeDriver<String, URL> {
        C11618m(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: a */
        public String convertFromFieldToJson(@NonNull URL url) {
            return url.toString();
        }

        @Nullable
        /* renamed from: b */
        public URL convertFromJsonToField(@NonNull Class<URL> cls, @Nullable Class<?>[] clsArr, @NonNull String str) {
            try {
                return new URL(str);
            } catch (MalformedURLException e) {
                C13633n.m31165u(this, e);
                return null;
            }
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$n */
    /* compiled from: JSONSerializationDrivers */
    class C11619n extends BaseAttributeTypeDriver<String, URI> {
        C11619n(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: a */
        public String convertFromFieldToJson(@NonNull URI uri) {
            return uri.toString();
        }

        @Nullable
        /* renamed from: b */
        public URI convertFromJsonToField(@NonNull Class<URI> cls, @Nullable Class<?>[] clsArr, @NonNull String str) {
            try {
                return new URI(str);
            } catch (URISyntaxException e) {
                C13633n.m31165u(this, e);
                return null;
            }
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$o */
    /* compiled from: JSONSerializationDrivers */
    class C11620o extends BaseAttributeTypeDriver<String, RemoteImage> {
        C11620o(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: a */
        public String convertFromFieldToJson(@NonNull RemoteImage remoteImage) {
            return remoteImage.imagePath;
        }

        @Nullable
        /* renamed from: b */
        public RemoteImage convertFromJsonToField(@NonNull Class<RemoteImage> cls, @Nullable Class<?>[] clsArr, @NonNull String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return new RemoteImage(str);
            } catch (Exception e) {
                C13633n.m31165u(this, e);
                return null;
            }
        }
    }

    static {
        Class<Number> cls = Number.class;
        Class<String> cls2 = String.class;
        f18062a = new IAttributeTypeDriver[]{new C11612g(Boolean.class, Boolean.TYPE), new C11613h(cls, Integer.TYPE), new C11614i(cls, Long.TYPE), new C11615j(cls, Float.TYPE), new C11616k(cls, Double.TYPE), new C11617l(cls, Date.class), new C11618m(cls2, URL.class), new C11619n(cls2, URI.class), new C11620o(cls2, RemoteImage.class), new C11606a(cls, ISerializableEnumInt.class), new C11607b(cls2, ISerializableEnumString.class), new C11608c(), new C11609d(), new C11610e(), new C11611f(JSONObject.class, Object.class)};
    }

    /* renamed from: com.rmn.apiclient.core.json.a$g */
    /* compiled from: JSONSerializationDrivers */
    class C11612g extends BaseAttributeTypeDriver<Boolean, Boolean> {
        C11612g(Class cls, Class cls2) {
            super(cls, cls2);
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            if (Boolean.class.isAssignableFrom(cls) || super.isFieldType(cls)) {
                return true;
            }
            return false;
        }

        @NonNull
        /* renamed from: a */
        public Boolean convertFromFieldToJson(@NonNull Boolean bool) {
            return bool;
        }

        @NonNull
        /* renamed from: b */
        public Boolean convertFromJsonToField(@NonNull Class<Boolean> cls, @Nullable Class<?>[] clsArr, @NonNull Boolean bool) {
            return bool;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$h */
    /* compiled from: JSONSerializationDrivers */
    class C11613h extends BaseAttributeTypeDriver<Number, Integer> {
        C11613h(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: b */
        public Integer convertFromJsonToField(@NonNull Class<Integer> cls, @Nullable Class<?>[] clsArr, @NonNull Number number) {
            return Integer.valueOf(number.intValue());
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            if (Integer.class.isAssignableFrom(cls) || super.isFieldType(cls)) {
                return true;
            }
            return false;
        }

        @NonNull
        /* renamed from: a */
        public Number convertFromFieldToJson(@NonNull Integer num) {
            return num;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$i */
    /* compiled from: JSONSerializationDrivers */
    class C11614i extends BaseAttributeTypeDriver<Number, Long> {
        C11614i(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: b */
        public Long convertFromJsonToField(@NonNull Class<Long> cls, @Nullable Class<?>[] clsArr, @NonNull Number number) {
            return Long.valueOf(number.longValue());
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            if (Long.class.isAssignableFrom(cls) || super.isFieldType(cls)) {
                return true;
            }
            return false;
        }

        @NonNull
        /* renamed from: a */
        public Number convertFromFieldToJson(@NonNull Long l) {
            return l;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$j */
    /* compiled from: JSONSerializationDrivers */
    class C11615j extends BaseAttributeTypeDriver<Number, Float> {
        C11615j(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: b */
        public Float convertFromJsonToField(@NonNull Class<Float> cls, @Nullable Class<?>[] clsArr, @NonNull Number number) {
            return Float.valueOf(number.floatValue());
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            if (Float.class.isAssignableFrom(cls) || super.isFieldType(cls)) {
                return true;
            }
            return false;
        }

        @NonNull
        /* renamed from: a */
        public Number convertFromFieldToJson(@NonNull Float f) {
            return f;
        }
    }

    /* renamed from: com.rmn.apiclient.core.json.a$k */
    /* compiled from: JSONSerializationDrivers */
    class C11616k extends BaseAttributeTypeDriver<Number, Double> {
        C11616k(Class cls, Class cls2) {
            super(cls, cls2);
        }

        @NonNull
        /* renamed from: b */
        public Double convertFromJsonToField(@NonNull Class<Double> cls, @Nullable Class<?>[] clsArr, @NonNull Number number) {
            return Double.valueOf(number.doubleValue());
        }

        public boolean isFieldType(@NonNull Class<?> cls) {
            if (Double.class.isAssignableFrom(cls) || super.isFieldType(cls)) {
                return true;
            }
            return false;
        }

        @NonNull
        /* renamed from: a */
        public Number convertFromFieldToJson(@NonNull Double d) {
            return d;
        }
    }
}
