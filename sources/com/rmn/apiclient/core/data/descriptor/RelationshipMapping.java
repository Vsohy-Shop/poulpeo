package com.rmn.apiclient.core.data.descriptor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RelationshipMapping {
    @NonNull
    public final String fieldNameForRelationship;
    @NonNull
    public final String relationshipJsonTag;
    @NonNull
    private final Set<String> resourceIdsTypes;

    public RelationshipMapping(@NonNull String str, @NonNull String str2, @NonNull String... strArr) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        } else if (!TextUtils.isEmpty(str2)) {
            this.fieldNameForRelationship = str;
            this.relationshipJsonTag = str2;
            this.resourceIdsTypes = new HashSet(Arrays.asList(strArr));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @NonNull
    public Set<String> getResourceIdsTypes() {
        return new HashSet(this.resourceIdsTypes);
    }
}
