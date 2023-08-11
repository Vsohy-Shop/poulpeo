package com.rmn.api.p322v2.common.pinned_object;

import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.main.model.ModelRef;
import java.util.Comparator;
import java.util.Date;

/* renamed from: com.rmn.api.v2.common.pinned_object.LocalPinnedObjectsComparator */
public class LocalPinnedObjectsComparator implements Comparator<ModelRef<PinnedObject>> {
    public int compare(ModelRef<PinnedObject> modelRef, ModelRef<PinnedObject> modelRef2) {
        PinnedObject pinnedObject = modelRef.get();
        PinnedObject pinnedObject2 = modelRef2.get();
        Date dateUpdate = pinnedObject.getDateUpdate() != null ? pinnedObject.getDateUpdate() : pinnedObject.getDateAdd();
        if (dateUpdate == null) {
            return 1;
        }
        Date dateUpdate2 = pinnedObject2.getDateUpdate() != null ? pinnedObject2.getDateUpdate() : pinnedObject2.getDateAdd();
        if (dateUpdate2 == null) {
            return -1;
        }
        return dateUpdate2.compareTo(dateUpdate);
    }
}
