package com.rmn.apiclient.core.model;

import androidx.annotation.Nullable;
import java.net.URL;

public interface IRemoteImageConfig extends IModel {
    @Nullable
    URL newRemoteImageUrl(@Nullable String str);
}
