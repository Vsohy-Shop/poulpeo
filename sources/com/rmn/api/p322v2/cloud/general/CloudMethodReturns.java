package com.rmn.api.p322v2.cloud.general;

import com.rmn.api.p322v2.common.model.CloudList;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;

/* renamed from: com.rmn.api.v2.cloud.general.CloudMethodReturns */
public class CloudMethodReturns {
    public static final RMNMethodReturnJSON CLOUD_LIST_DETAIL = new RMNMethodReturnJSON(true, RETURN_KEYNAME_ELEMENT, CloudList.class);
    public static final String RETURN_KEYNAME_ARRAY = "array";
    public static final String RETURN_KEYNAME_ELEMENT = "element";
    public static final String RETURN_KEYNAME_TOTAL = "total";
}
