package com.rmn.api.p322v2.common.pinned_object;

/* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectAction */
public enum PinnedObjectAction {
    ADD,
    REMOVE;

    public static PinnedObjectAction getInverse(PinnedObjectAction pinnedObjectAction) {
        PinnedObjectAction pinnedObjectAction2 = ADD;
        if (pinnedObjectAction == pinnedObjectAction2) {
            return REMOVE;
        }
        if (pinnedObjectAction == REMOVE) {
            return pinnedObjectAction2;
        }
        return null;
    }
}
