package com.rmn.apiclient.impl.jsonapi.structure;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IResourceId;
import java.util.Objects;

public class JSONAPIResourceId implements IResourceId {
    @NonNull

    /* renamed from: id */
    private final String f18066id;
    @NonNull
    private final String type;

    public JSONAPIResourceId(@NonNull String str, @NonNull String str2) {
        this.type = str;
        this.f18066id = str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSONAPIResourceId)) {
            return false;
        }
        JSONAPIResourceId jSONAPIResourceId = (JSONAPIResourceId) obj;
        if (!this.type.equals(jSONAPIResourceId.type) || !this.f18066id.equals(jSONAPIResourceId.f18066id)) {
            return false;
        }
        return true;
    }

    @NonNull
    public String getId() {
        return this.f18066id;
    }

    @NonNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.type, this.f18066id});
    }

    @NonNull
    public String toString() {
        return "[" + this.type + "," + this.f18066id + "]";
    }
}
