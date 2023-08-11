package com.rmn.apiclient.impl.jsonapi.structure;

import androidx.annotation.Nullable;

public class JSONAPILinks {
    @Nullable
    public final String first;
    @Nullable
    public final String last;
    @Nullable
    public final String next;
    @Nullable
    public final String prev;

    public JSONAPILinks(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.first = str;
        this.last = str2;
        this.prev = str3;
        this.next = str4;
    }
}
