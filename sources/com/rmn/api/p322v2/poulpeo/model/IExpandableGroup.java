package com.rmn.api.p322v2.poulpeo.model;

import java.util.List;

/* renamed from: com.rmn.api.v2.poulpeo.model.IExpandableGroup */
public interface IExpandableGroup {
    List<AbstractExpandableChild> getChildren();

    String getGroupId();
}
