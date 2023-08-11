package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;

public class APIParam<T> implements Comparable<T> {
    @NonNull
    public final String name;
    @Nullable
    public final T value;

    public APIParam(@NonNull String str, @Nullable T t) {
        this.name = str;
        this.value = t;
    }

    public int compareTo(@Nullable T t) {
        String str;
        if (t instanceof APIParam) {
            APIParam aPIParam = (APIParam) t;
            int compareTo = this.name.compareTo(aPIParam.name);
            if (compareTo != 0) {
                return compareTo;
            }
            String str2 = "";
            if (getType() == null) {
                str = str2;
            } else {
                str = getType().getName();
            }
            if (aPIParam.getType() != null) {
                str2 = aPIParam.getType().getName();
            }
            return str.compareTo(str2);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(@Nullable Object obj) {
        T t;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIParam)) {
            return false;
        }
        APIParam aPIParam = (APIParam) obj;
        Class type = getType();
        Class type2 = aPIParam.getType();
        if (!this.name.equals(aPIParam.name) || (((type != null || type2 != null) && (type == null || !type.equals(type2))) || (t = this.value) == null || !t.equals(aPIParam.value))) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getStringValue() {
        T t = this.value;
        if (t == null) {
            return "";
        }
        if (t instanceof Date) {
            return String.valueOf(((Date) t).getTime());
        }
        if (!(t instanceof Collection)) {
            return t.toString();
        }
        Collection collection = (Collection) t;
        if (collection.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Nullable
    public Class<T> getType() {
        T t = this.value;
        if (t == null) {
            return null;
        }
        return t.getClass();
    }

    public boolean hasValue() {
        if (this.value != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, getType(), this.value});
    }
}
