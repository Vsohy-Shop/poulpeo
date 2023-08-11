package com.rmn.api.p322v2.main.sqlite;

import java.lang.reflect.Array;

/* renamed from: com.rmn.api.v2.main.sqlite.KeySQLColumn */
public class KeySQLColumn {
    private boolean isNotNull;
    private boolean isPrimaryKey;
    private String name;
    private SQLType sqlType;
    private int superClassDepth;
    private Class<?> type;

    public KeySQLColumn(String str, Class<?> cls, boolean z, boolean z2) {
        this(str, cls, 0, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeySQLColumn keySQLColumn = (KeySQLColumn) obj;
        if (this.isPrimaryKey != keySQLColumn.isPrimaryKey) {
            return false;
        }
        String str = this.name;
        if (str == null) {
            if (keySQLColumn.name != null) {
                return false;
            }
        } else if (!str.equals(keySQLColumn.name)) {
            return false;
        }
        Class<?> cls = this.type;
        if (cls == null) {
            if (keySQLColumn.type != null) {
                return false;
            }
        } else if (!cls.equals(keySQLColumn.type)) {
            return false;
        }
        return true;
    }

    public int getColumnCheckSum() {
        int i;
        int i2;
        if (this.isPrimaryKey) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i + 31) * 31;
        String str = this.name;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        return ((i3 + i2) * 31) + DatabaseManager.getClassChecksum(this.type, this.superClassDepth);
    }

    public String getName() {
        return this.name;
    }

    public SQLType getSqlType() {
        return this.sqlType;
    }

    public Class<?> getType() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int i2;
        if (this.isPrimaryKey) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i + 31) * 31;
        String str = this.name;
        int i4 = 0;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i5 = (i3 + i2) * 31;
        Class<?> cls = this.type;
        if (cls != null) {
            i4 = cls.hashCode();
        }
        return i5 + i4;
    }

    public boolean isCorrectValueType(Object obj) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (this.sqlType.isCorrectValueType(cls)) {
                return true;
            }
            if (!cls.isArray()) {
                return false;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                Object obj2 = Array.get(obj, i);
                if (obj2 == null) {
                    if (this.isNotNull) {
                        return false;
                    }
                } else if (!this.sqlType.isCorrectValueArrayType(obj2.getClass())) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public boolean isNotNull() {
        return this.isNotNull;
    }

    public boolean isPrimaryKey() {
        return this.isPrimaryKey;
    }

    public KeySQLColumn(String str, Class<?> cls, int i, boolean z, boolean z2) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (cls != null) {
            this.name = str;
            this.type = cls;
            if (i < 0) {
                this.superClassDepth = 0;
            } else {
                this.superClassDepth = i;
            }
            this.isPrimaryKey = z;
            this.isNotNull = z2;
            this.sqlType = SQLType.getSqlType(cls);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
