package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ParamSet implements Iterable<APIParam<?>> {
    @NonNull
    private final Set<APIParam<?>> params;

    public ParamSet() {
        this.params = new HashSet();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamSet)) {
            return false;
        }
        ParamSet paramSet = (ParamSet) obj;
        int size = this.params.size();
        if (size != paramSet.params.size()) {
            return false;
        }
        APIParam[] aPIParamArr = (APIParam[]) this.params.toArray(new APIParam[size]);
        APIParam[] aPIParamArr2 = (APIParam[]) paramSet.params.toArray(new APIParam[size]);
        for (int i = 0; i < size; i++) {
            if (!aPIParamArr[i].equals(aPIParamArr2[i])) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public APIParam<?> findParam(@NonNull String str, @NonNull Class<?> cls) {
        Class<?> type;
        for (APIParam<?> next : this.params) {
            if (str.equals(next.name) && (type = next.getType()) != null && cls.isAssignableFrom(type)) {
                return next;
            }
        }
        return null;
    }

    @NonNull
    public final Set<APIParam<?>> getParams() {
        return new TreeSet(this.params);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.params});
    }

    @NonNull
    public Iterator<APIParam<?>> iterator() {
        return this.params.iterator();
    }

    public ParamSet(@NonNull Set<APIParam<?>> set) {
        this.params = new TreeSet(set);
    }
}
