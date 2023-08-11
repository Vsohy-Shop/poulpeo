package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import java.util.Arrays;

public class AffiliateNetwork extends BaseModel {
    @Nullable
    private final String[] domains = null;
    public final boolean forbiddenDomainsStatus = BaseModel.defaultBoolean();
    @Nullable
    public final String name;

    public AffiliateNetwork(@NonNull String str, @Nullable String str2) {
        super(str);
        this.name = str2;
    }

    @Nullable
    public String[] getDomains() {
        String[] strArr = this.domains;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public boolean hasDomain(@NonNull String str) {
        String[] strArr = this.domains;
        if (strArr == null) {
            return false;
        }
        for (String equals : strArr) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String toString() {
        return "AffiliateNetwork{id='" + this.f18063id + '\'' + ", name='" + this.name + '\'' + ", forbiddenDomainsStatus='" + this.forbiddenDomainsStatus + '\'' + ", domains='" + Arrays.deepToString(this.domains) + '\'' + '}';
    }
}
