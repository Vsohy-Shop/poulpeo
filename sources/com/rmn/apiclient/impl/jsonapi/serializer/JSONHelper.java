package com.rmn.apiclient.impl.jsonapi.serializer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p446vd.C13633n;

public class JSONHelper {
    public static boolean add(@NonNull JSONArray jSONArray, @Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        jSONArray.put(obj);
        return true;
    }

    @NonNull
    public static Iterator<String> getNonNullKeys(@NonNull JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        ArrayList arrayList = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != JSONObject.NULL) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    public static boolean has(@NonNull JSONObject jSONObject, @NonNull String str) {
        return jSONObject.has(str);
    }

    @Nullable
    public static Object opt(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.opt(str);
    }

    @Nullable
    public static JSONArray optJSONArray(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optJSONArray(str);
    }

    @Nullable
    public static JSONObject optJSONObject(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    @NonNull
    public static String optNonNullString(@NonNull JSONObject jSONObject, @NonNull String str) {
        String optNullableString = optNullableString(jSONObject, str);
        if (optNullableString != null) {
            return optNullableString;
        }
        return "";
    }

    @Nullable
    public static String optNullableString(@NonNull JSONObject jSONObject, @NonNull String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static boolean put(@NonNull JSONObject jSONObject, @NonNull String str, @Nullable Object obj) {
        try {
            jSONObject.put(str, obj);
            return true;
        } catch (Exception e) {
            C13633n.m31165u(JSONHelper.class, e);
            return false;
        }
    }

    @Nullable
    public static Object opt(@NonNull JSONArray jSONArray, int i) {
        if (jSONArray.isNull(i)) {
            return null;
        }
        return jSONArray.opt(i);
    }

    @Nullable
    public static JSONArray optJSONArray(@NonNull JSONArray jSONArray, int i) {
        if (jSONArray.isNull(i)) {
            return null;
        }
        return jSONArray.optJSONArray(i);
    }

    @Nullable
    public static JSONObject optJSONObject(@NonNull JSONObject jSONObject, int i) {
        JSONArray names = jSONObject.names();
        if (names == null) {
            return null;
        }
        return jSONObject.optJSONObject(names.optString(i));
    }

    @Nullable
    public static JSONObject optJSONObject(@NonNull JSONArray jSONArray, int i) {
        if (jSONArray.isNull(i)) {
            return null;
        }
        return jSONArray.optJSONObject(i);
    }
}
