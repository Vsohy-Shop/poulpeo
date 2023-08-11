package com.rmn.apiclient.core.data_access.cache.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BodyContainer;

public class CacheBodyContainer extends BodyContainer<IDocument> {
    @Nullable
    public final String rawBody;

    public CacheBodyContainer(@NonNull IDocument iDocument, @Nullable String str) {
        super(iDocument);
        this.rawBody = str;
    }
}
