package com.rmn.apiclient.impl.api.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.model.BaseModel;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class MerchantLight extends BaseModel {
    @Nullable
    private final Set<String> additionalDomains;
    @Nullable
    private final Set<String> cartDomains;
    @NonNull
    public final String name;
    @Nullable
    public final URL url;

    public MerchantLight(@NonNull String str) {
        this(str, "");
    }

    @NonNull
    public Set<String> getAdditionalDomains() {
        if (this.additionalDomains == null) {
            return new HashSet();
        }
        return new HashSet(this.additionalDomains);
    }

    @NonNull
    public Set<String> getCartDomains() {
        if (this.cartDomains == null) {
            return new HashSet();
        }
        return new HashSet(this.cartDomains);
    }

    @NonNull
    public String getId() {
        return this.f18063id;
    }

    @NonNull
    public String toString() {
        return "MerchantLight{id='" + this.f18063id + '\'' + ", name='" + this.name + '\'' + '}';
    }

    public MerchantLight(@NonNull String str, @NonNull String str2) {
        super(str);
        this.url = null;
        this.additionalDomains = null;
        this.cartDomains = null;
        this.name = str2;
    }
}
