package com.rmn.api.p322v2.main.sqlite;

import com.rmn.api.p322v2.main.json.IJsonCacheableModel;
import com.rmn.iosadapters.android.content.ContentValuesWrapper;
import com.rmn.iosadapters.android.database.AndroidDatabaseCursorWrapper;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.main.sqlite.SQLType */
public enum SQLType {
    INT((String) null) {
        /* renamed from: a */
        public Integer convertParam(Object obj) {
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            if (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class)) {
                if (obj.equals(Boolean.TRUE)) {
                    return 1;
                }
                return 0;
            } else if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
                return (Integer) obj;
            } else {
                if (cls.equals(Float.TYPE) || cls.equals(Float.class)) {
                    return Integer.valueOf((int) ((Float) obj).floatValue());
                }
                if (cls.equals(Double.TYPE) || cls.equals(Double.class)) {
                    return Integer.valueOf((int) ((Double) obj).doubleValue());
                }
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: b */
        public Integer retrieveValue(AndroidDatabaseCursorWrapper androidDatabaseCursorWrapper, String str, Class<?> cls) {
            if (androidDatabaseCursorWrapper == null) {
                throw new IllegalArgumentException();
            } else if (str == null) {
                throw new IllegalArgumentException();
            } else if (cls == null) {
                throw new IllegalArgumentException();
            } else if (isCorrectValueType(cls)) {
                int c = androidDatabaseCursorWrapper.mo47848c(str);
                if (c >= 0) {
                    return Integer.valueOf(androidDatabaseCursorWrapper.mo47851f(c));
                }
                throw new Exception("Not found");
            } else {
                throw new IllegalArgumentException();
            }
        }

        public String getSQL() {
            return "INTEGER";
        }

        public boolean isCorrectValueArrayType(Class<?> cls) {
            if (cls != null) {
                return false;
            }
            throw new IllegalArgumentException();
        }

        public boolean isCorrectValueType(Class<?> cls) {
            if (cls == null) {
                throw new IllegalArgumentException();
            } else if (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class) || cls.equals(Integer.TYPE) || cls.equals(Integer.class) || cls.equals(Float.TYPE) || cls.equals(Double.class) || cls.equals(Double.TYPE) || cls.equals(Double.TYPE)) {
                return true;
            } else {
                return false;
            }
        }
    },
    DOUBLE((String) null) {
        /* renamed from: a */
        public Double convertParam(Object obj) {
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
                return Double.valueOf((double) ((Integer) obj).intValue());
            }
            if (cls.equals(Float.TYPE) || cls.equals(Float.class)) {
                return Double.valueOf((double) ((Float) obj).floatValue());
            }
            if (cls.equals(Double.TYPE) || cls.equals(Double.class)) {
                return (Double) obj;
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public Double retrieveValue(AndroidDatabaseCursorWrapper androidDatabaseCursorWrapper, String str, Class<?> cls) {
            if (androidDatabaseCursorWrapper == null) {
                throw new IllegalArgumentException();
            } else if (str == null) {
                throw new IllegalArgumentException();
            } else if (cls == null) {
                throw new IllegalArgumentException();
            } else if (isCorrectValueType(cls)) {
                int c = androidDatabaseCursorWrapper.mo47848c(str);
                if (c >= 0) {
                    return Double.valueOf(androidDatabaseCursorWrapper.mo47850e(c));
                }
                throw new Exception("Not found");
            } else {
                throw new IllegalArgumentException();
            }
        }

        public String getSQL() {
            return "DOUBLE";
        }

        public boolean isCorrectValueArrayType(Class<?> cls) {
            if (cls != null) {
                return false;
            }
            throw new IllegalArgumentException();
        }

        public boolean isCorrectValueType(Class<?> cls) {
            if (cls == null) {
                throw new IllegalArgumentException();
            } else if (cls.equals(Integer.TYPE) || cls.equals(Integer.class) || cls.equals(Float.TYPE) || cls.equals(Double.class) || cls.equals(Double.TYPE) || cls.equals(Double.TYPE)) {
                return true;
            } else {
                return false;
            }
        }
    },
    TEXT((String) null) {
        /* renamed from: a */
        public String convertParam(Object obj) {
            if (obj == null) {
                return null;
            }
            Class<?> cls = obj.getClass();
            if (cls.equals(String.class)) {
                return (String) obj;
            }
            Class<IJsonCacheableModel> cls2 = IJsonCacheableModel.class;
            if (cls.equals(cls2) || cls.isInstance(cls2)) {
                return ((IJsonCacheableModel) obj).serializeToCacheData();
            }
            if (cls.isArray()) {
                return DatabaseManager.serializeArray(obj);
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public String retrieveValue(AndroidDatabaseCursorWrapper androidDatabaseCursorWrapper, String str, Class<?> cls) {
            if (androidDatabaseCursorWrapper == null) {
                throw new IllegalArgumentException();
            } else if (str == null) {
                throw new IllegalArgumentException();
            } else if (cls == null) {
                throw new IllegalArgumentException();
            } else if (isCorrectValueType(cls)) {
                int c = androidDatabaseCursorWrapper.mo47848c(str);
                if (c >= 0) {
                    return androidDatabaseCursorWrapper.mo47852g(c);
                }
                throw new Exception("Not found");
            } else {
                throw new IllegalArgumentException();
            }
        }

        public String getSQL() {
            return "TEXT";
        }

        public boolean isCorrectValueArrayType(Class<?> cls) {
            if (cls == null) {
                throw new IllegalArgumentException();
            } else if (cls.isArray()) {
                return false;
            } else {
                if (SQLType.INT.isCorrectValueType(cls) || SQLType.DOUBLE.isCorrectValueType(cls) || cls.equals(String.class)) {
                    return true;
                }
                Class<IJsonCacheableModel> cls2 = IJsonCacheableModel.class;
                if (!cls.equals(cls2) && !cls2.isAssignableFrom(cls)) {
                    return false;
                }
                return true;
            }
        }

        public boolean isCorrectValueType(Class<?> cls) {
            if (cls == null) {
                throw new IllegalArgumentException();
            } else if (cls.equals(String.class)) {
                return true;
            } else {
                Class<IJsonCacheableModel> cls2 = IJsonCacheableModel.class;
                if (cls.equals(cls2) || cls2.isAssignableFrom(cls)) {
                    return true;
                }
                if (!cls.isArray() || !isCorrectValueArrayType(cls.getComponentType())) {
                    return false;
                }
                return true;
            }
        }
    };

    public static SQLType getSqlType(Class<?> cls) {
        if (cls.equals(Boolean.TYPE) || cls.equals(Boolean.class) || cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
            return INT;
        }
        if (cls.equals(Float.TYPE) || cls.equals(Float.class) || cls.equals(Double.TYPE) || cls.equals(Double.class)) {
            return DOUBLE;
        }
        return TEXT;
    }

    public final boolean addValue(ContentValuesWrapper contentValuesWrapper, String str, Object obj) {
        if (contentValuesWrapper == null) {
            throw new IllegalArgumentException();
        } else if (str == null) {
            throw new IllegalArgumentException();
        } else if (obj == null) {
            contentValuesWrapper.mo47842d(str);
            return true;
        } else {
            try {
                contentValuesWrapper.mo47841c(str, convertParam(obj).toString());
                return true;
            } catch (Exception e) {
                C13633n.m31151g(SQLType.class, e);
                return false;
            }
        }
    }

    public abstract Object convertParam(Object obj);

    public abstract String getSQL();

    public abstract boolean isCorrectValueArrayType(Class<?> cls);

    public abstract boolean isCorrectValueType(Class<?> cls);

    public abstract Object retrieveValue(AndroidDatabaseCursorWrapper androidDatabaseCursorWrapper, String str, Class<?> cls);
}
