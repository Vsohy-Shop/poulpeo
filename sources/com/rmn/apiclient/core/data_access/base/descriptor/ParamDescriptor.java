package com.rmn.apiclient.core.data_access.base.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.call.ParamType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import p446vd.C13633n;

public class ParamDescriptor<T> {
    public final boolean isMandatory;
    @NonNull
    public final String name;
    @NonNull
    public final ParamType paramType;
    @NonNull
    public final Class<T> type;

    public ParamDescriptor(@NonNull String str, @NonNull Class<T> cls) {
        this(str, cls, false);
    }

    public static ParamDescriptor<String> newPathParam(@NonNull String str) {
        return new ParamDescriptor<>(str, String.class, ParamType.PATH, true);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamDescriptor)) {
            return false;
        }
        ParamDescriptor paramDescriptor = (ParamDescriptor) obj;
        if (!this.name.equals(paramDescriptor.name) || !this.type.equals(paramDescriptor.type) || this.paramType != paramDescriptor.paramType) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.type, this.paramType});
    }

    public boolean isParamValid(@NonNull APIParam<T> aPIParam) {
        if (!this.name.equals(aPIParam.name) || !this.type.equals(aPIParam.getType())) {
            return false;
        }
        return true;
    }

    @Nullable
    public T tryCastToParamType(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Class<T> cls = this.type;
        if (cls == String.class) {
            return str;
        }
        if (cls == Boolean.class) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (cls == Integer.class) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (cls == Float.class) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (cls == Double.class) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (cls == Array.class) {
            return str.split(",");
        }
        if (cls == Collection.class) {
            return Arrays.asList(str.split(","));
        }
        C13633n.m31163s(this, "Type not managed for param casting from String : " + this.type);
        return null;
    }

    public ParamDescriptor(@NonNull String str, @NonNull Class<T> cls, boolean z) {
        this(str, cls, ParamType.DEFAULT, z);
    }

    public ParamDescriptor(@NonNull String str, @NonNull Class<T> cls, @NonNull ParamType paramType2, boolean z) {
        if (paramType2 != ParamType.PATH || z) {
            this.name = str;
            this.type = cls;
            this.paramType = paramType2;
            this.isMandatory = z;
            return;
        }
        throw new IllegalArgumentException("A param with type PATH must be mandatory");
    }
}
