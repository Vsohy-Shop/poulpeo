package com.rmn.api.p322v2.main.general;

import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormat;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatBoolean;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatCoordinate;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatDouble;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatID;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatInteger;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatString;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatStringArray;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormatTimestamp;

/* renamed from: com.rmn.api.v2.main.general.BaseMethodParameters */
public abstract class BaseMethodParameters {
    protected static final RMNParamFormat RMN_FORMAT_ARRAY = new RMNParamFormatStringArray();
    protected static final RMNParamFormat RMN_FORMAT_BOOLEAN = new RMNParamFormatBoolean();
    protected static final RMNParamFormat RMN_FORMAT_COORDINATE = new RMNParamFormatCoordinate();
    protected static final RMNParamFormat RMN_FORMAT_DOUBLE = new RMNParamFormatDouble();
    protected static final RMNParamFormat RMN_FORMAT_ID = new RMNParamFormatID();
    protected static final RMNParamFormat RMN_FORMAT_INTEGER = new RMNParamFormatInteger();
    protected static final RMNParamFormat RMN_FORMAT_STRING = new RMNParamFormatString();
    protected static final RMNParamFormat RMN_FORMAT_TIMESTAMP = new RMNParamFormatTimestamp();
}
