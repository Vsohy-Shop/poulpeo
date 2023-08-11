package com.rmn.apiclient.core.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.IModel;
import java.util.Arrays;
import java.util.Set;
import p304ac.C10860a;

public class ModelReference<M extends IModel> {
    @NonNull
    private String cacheId;
    @NonNull
    private M model;

    public ModelReference(@NonNull M m, @Nullable Set<String> set) {
        this.model = m;
        this.cacheId = newCacheId(m.getId(), set);
    }

    @NonNull
    public static String newCacheId(@NonNull String str, @Nullable Set<String> set) {
        if (set == null || set.isEmpty()) {
            return str;
        }
        String[] strArr = (String[]) set.toArray(new String[0]);
        Arrays.sort(strArr);
        return str + "_" + C10860a.m23150a(",", strArr);
    }

    @NonNull
    public String getCacheId() {
        return this.cacheId;
    }

    @NonNull
    public String getId() {
        return this.model.getId();
    }

    @NonNull
    public M getModel() {
        return this.model;
    }

    public boolean isModelUnchanged(@NonNull M m) {
        if (m == this.model) {
            return true;
        }
        return false;
    }

    public void updateModel(@NonNull M m, @Nullable Set<String> set) {
        if (getId().equals(m.getId())) {
            this.model = m;
            this.cacheId = newCacheId(m.getId(), set);
            return;
        }
        throw new IllegalArgumentException("The model ids are different when updating model in ModelReference");
    }
}
