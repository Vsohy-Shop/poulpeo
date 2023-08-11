package com.rmn.api.p322v2.main.sqlite;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* renamed from: com.rmn.api.v2.main.sqlite.DatabaseManager */
public class DatabaseManager {
    public static Class<?> getArrayTypeFromType(Class<?> cls) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (cls.isArray()) {
            throw new UnsupportedOperationException("Arrays in Arrays not supported yet");
        } else if (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class)) {
            return Class.forName("[Z");
        } else {
            if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
                return Class.forName("[I");
            }
            if (cls.equals(Double.TYPE) || cls.equals(Double.class)) {
                return Class.forName("[D");
            }
            if (cls.equals(String.class)) {
                return String[].class;
            }
            throw new UnsupportedOperationException("Not supported yet, getArrayTypeFromType : " + cls.getSimpleName());
        }
    }

    public static int getClassChecksum(Class<?> cls, int i) {
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (cls.isPrimitive() || cls.equals(String.class) || cls.equals(Date.class)) {
            return cls.getSimpleName().hashCode();
        } else {
            HashMap hashMap = new HashMap();
            int i2 = 0;
            hashMap.put(cls, 0);
            Class<? super Object> cls2 = cls;
            do {
                i2 += getClassChecksum(cls2, (Map<Class<?>, Integer>) hashMap);
                i--;
                cls2 = cls2.getSuperclass();
            } while (i >= 0);
            return i2;
        }
    }

    public static String getSQLRequestCreateTableIfNotExists(String str, Set<KeySQLColumn> set) {
        String str2;
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (set == null) {
            throw new IllegalArgumentException();
        } else if (!set.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS ");
            sb.append(str);
            sb.append(" (");
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (KeySQLColumn next : set) {
                if (!z) {
                    z = true;
                } else {
                    sb.append(", ");
                }
                if (next.isPrimaryKey()) {
                    i2++;
                }
                if (next.isNotNull()) {
                    str2 = " NOT NULL";
                } else {
                    str2 = "";
                }
                sb.append(next.getName());
                sb.append(" ");
                sb.append(next.getSqlType().getSQL());
                sb.append(str2);
            }
            if (i2 > 0) {
                sb.append(", PRIMARY KEY (");
                for (KeySQLColumn next2 : set) {
                    if (next2.isPrimaryKey()) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(next2.getName());
                        i++;
                    }
                }
                sb.append(")");
            }
            sb.append(")");
            return sb.toString();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static String getSQLRequestDropTableIfExists(String str) {
        return "DROP TABLE IF EXISTS " + str + ";";
    }

    public static String getWhereClauseAndFillArgs(List<Map<KeySQLColumn, Object>> list, List<String> list2) {
        if (list == null) {
            throw new IllegalArgumentException();
        } else if (list2 == null) {
            throw new IllegalArgumentException();
        } else if (list2.size() > 0) {
            throw new IllegalStateException("There must be no args in the list of args to fill");
        } else if (list.isEmpty()) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (Map next : list) {
                if (next.size() > 0) {
                    if (z) {
                        sb.append(" OR ");
                    }
                    sb.append("(");
                    boolean z2 = false;
                    for (Map.Entry entry : next.entrySet()) {
                        if (z2) {
                            sb.append(" AND ");
                        }
                        KeySQLColumn keySQLColumn = (KeySQLColumn) entry.getKey();
                        try {
                            Object convertParam = keySQLColumn.getSqlType().convertParam(entry.getValue());
                            if (convertParam == null) {
                                sb.append(keySQLColumn.getName());
                                sb.append(" IS NULL");
                            } else {
                                sb.append(keySQLColumn.getName());
                                sb.append("=?");
                                list2.add(convertParam.toString());
                            }
                            z2 = true;
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    sb.append(")");
                    z = true;
                }
            }
            return sb.toString();
        }
    }

    public static boolean isArraySerializable(Object obj) {
        if (obj == null) {
            return false;
        }
        return isArraySerializable(obj);
    }

    public static String serializeArray(Object obj) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                JSONArray jSONArray = new JSONArray();
                int length = Array.getLength(obj);
                if (length <= 0) {
                    return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                }
                Class<?> componentType = cls.getComponentType();
                int i = 0;
                if (componentType.equals(boolean[].class) || componentType.equals(Boolean[].class)) {
                    while (i < length) {
                        jSONArray.put(Array.getBoolean(obj, i));
                        i++;
                    }
                } else if (componentType.equals(int[].class) || componentType.equals(Integer[].class)) {
                    while (i < length) {
                        jSONArray.put(Array.getInt(obj, i));
                        i++;
                    }
                } else if (componentType.equals(double[].class) || componentType.equals(Double[].class)) {
                    while (i < length) {
                        jSONArray.put(Array.getDouble(obj, i));
                        i++;
                    }
                } else if (componentType.equals(String[].class)) {
                    while (i < length) {
                        jSONArray.put((String) Array.get(obj, i));
                        i++;
                    }
                } else {
                    while (i < length) {
                        jSONArray.put(Array.get(obj, i));
                        i++;
                    }
                }
                return jSONArray.toString();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static Object[] unserializeArray(String str, Class<?> cls) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (cls == null) {
            throw new IllegalArgumentException();
        } else if (cls.isArray()) {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            int i = 0;
            if (length <= 0) {
                return new Object[0];
            }
            Object[] objArr = new Object[length];
            if (cls.equals(boolean[].class) || cls.equals(Boolean[].class)) {
                while (i < length) {
                    Array.set(objArr, i, Boolean.valueOf(jSONArray.getBoolean(i)));
                    i++;
                }
            } else if (cls.equals(int[].class) || cls.equals(Integer[].class)) {
                while (i < length) {
                    Array.set(objArr, i, Integer.valueOf(jSONArray.getInt(i)));
                    i++;
                }
            } else if (cls.equals(double[].class) || cls.equals(Double[].class)) {
                while (i < length) {
                    Array.set(objArr, i, Double.valueOf(jSONArray.getDouble(i)));
                    i++;
                }
            } else if (cls.equals(String[].class)) {
                while (i < length) {
                    Array.set(objArr, i, jSONArray.getString(i));
                    i++;
                }
            } else {
                throw new UnsupportedOperationException("Not defined yet");
            }
            return objArr;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isArraySerializable(Class<?> cls) {
        Class<?> componentType;
        if (cls == null) {
            throw new IllegalArgumentException();
        } else if (!cls.isArray() || (componentType = cls.getComponentType()) == null) {
            return false;
        } else {
            if (componentType.equals(Boolean.TYPE) || componentType.equals(Boolean.class) || componentType.equals(Integer.TYPE) || componentType.equals(Integer.class) || componentType.equals(Double.TYPE) || componentType.equals(Double.class) || componentType.equals(String.class)) {
                return true;
            }
            return false;
        }
    }

    private static int getClassChecksum(Class<?> cls, Map<Class<?>, Integer> map) {
        int i;
        int i2;
        Field[] declaredFields = cls.getDeclaredFields();
        HashMap hashMap = new HashMap(declaredFields.length);
        for (Field field : declaredFields) {
            if (field != null) {
                hashMap.put(field.getName(), field);
            }
        }
        int i3 = 1;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Field field2 = (Field) entry.getValue();
            if (!str.contains("$") && !Modifier.isFinal(field2.getModifiers()) && !Modifier.isStatic(field2.getModifiers())) {
                Class<?> type = field2.getType();
                if (!type.isPrimitive()) {
                    Class<String> cls2 = String.class;
                    if (!type.equals(cls2)) {
                        Class<Date> cls3 = Date.class;
                        if (!type.equals(cls3)) {
                            if (type.isArray()) {
                                Class<?> componentType = type.getComponentType();
                                if (componentType.isPrimitive() || componentType.equals(cls2) || componentType.equals(cls3)) {
                                    i = type.getSimpleName().hashCode();
                                } else {
                                    if (map.containsKey(componentType)) {
                                        i2 = map.get(componentType).intValue();
                                    } else {
                                        map.put(componentType, 0);
                                        i2 = getClassChecksum(componentType, map);
                                        map.put(componentType, Integer.valueOf(i2));
                                    }
                                    i = (i2 + 31) * 31;
                                }
                            } else if (map.containsKey(type)) {
                                i = map.get(type).intValue();
                            } else {
                                map.put(type, 0);
                                int classChecksum = getClassChecksum(type, map);
                                map.put(type, Integer.valueOf(classChecksum));
                                i = classChecksum;
                            }
                            i3 = (i3 * 31) + ((i + 31) * 31) + str.hashCode();
                        }
                    }
                }
                i = type.getSimpleName().hashCode();
                i3 = (i3 * 31) + ((i + 31) * 31) + str.hashCode();
            }
        }
        return i3;
    }

    public static String getWhereClauseAndFillArgs(Map<KeySQLColumn, Object> map, String[] strArr) {
        if (map == null) {
            throw new IllegalArgumentException();
        } else if (map.size() <= 0) {
            throw new IllegalArgumentException();
        } else if (strArr == null) {
            throw new IllegalArgumentException();
        } else if (strArr.length == map.size()) {
            String str = "";
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                int i2 = i + 1;
                if (i > 0) {
                    str = str + " AND ";
                }
                KeySQLColumn keySQLColumn = (KeySQLColumn) next.getKey();
                try {
                    str = str + keySQLColumn.getName() + "=?";
                    strArr[i2] = keySQLColumn.getSqlType().convertParam(next.getValue()).toString();
                    i = i2;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return str;
        } else {
            throw new IllegalStateException("There must be no args in the list of args to fill");
        }
    }
}
