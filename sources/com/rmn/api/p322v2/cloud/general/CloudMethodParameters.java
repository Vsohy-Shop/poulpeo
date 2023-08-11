package com.rmn.api.p322v2.cloud.general;

import com.rmn.api.p322v2.main.general.BaseMethodParameters;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodparam.RMNParamFormat;

/* renamed from: com.rmn.api.v2.cloud.general.CloudMethodParameters */
public class CloudMethodParameters extends BaseMethodParameters {
    public static final RMNMethodParam ID_LIST;
    public static final RMNMethodParam PUSH_APPLICATION_NAME_REQUIRED;
    public static final RMNMethodParam PUSH_APPLICATION_VERSION_REQUIRED;
    public static final RMNMethodParam PUSH_DEVICE_ID_REQUIRED;
    public static final RMNMethodParam PUSH_DEVICE_MODEL;
    public static final RMNMethodParam PUSH_DEVICE_NAME;
    public static final RMNMethodParam PUSH_DEVICE_TOKEN_REQUIRED;
    public static final RMNMethodParam PUSH_FINGER_PRINT_REQUIRED;
    public static final RMNMethodParam PUSH_PLATFORM_NAME;
    public static final RMNMethodParam PUSH_PLATFORM_VERSION;
    public static final RMNMethodParam PUSH_SCREEN_SIZE;
    public static final RMNMethodParam PUSH_SENDER;
    public static final RMNMethodParam PUSH_USER_AGENT;
    public static final RMNMethodParam PUSH_USER_ID;
    public static final RMNMethodParam PUSH_VIEWPORT;
    public static final RMNMethodParam WITH_ALL_VALUES;
    public static final RMNMethodParam WITH_SCHEDULING;

    static {
        RMNParamFormat rMNParamFormat = BaseMethodParameters.RMN_FORMAT_STRING;
        PUSH_APPLICATION_NAME_REQUIRED = new RMNMethodParam(true, "application_name", rMNParamFormat);
        PUSH_APPLICATION_VERSION_REQUIRED = new RMNMethodParam(true, "application_version", rMNParamFormat);
        PUSH_DEVICE_ID_REQUIRED = new RMNMethodParam(true, "device_id", rMNParamFormat);
        PUSH_DEVICE_NAME = new RMNMethodParam(false, "device_name", rMNParamFormat);
        PUSH_DEVICE_MODEL = new RMNMethodParam(false, "device_model", rMNParamFormat);
        PUSH_DEVICE_TOKEN_REQUIRED = new RMNMethodParam(true, "device_token", rMNParamFormat);
        PUSH_PLATFORM_NAME = new RMNMethodParam(false, "platform_name", rMNParamFormat);
        PUSH_PLATFORM_VERSION = new RMNMethodParam(false, "platform_version", rMNParamFormat);
        PUSH_USER_AGENT = new RMNMethodParam(false, "user_agent", rMNParamFormat);
        PUSH_USER_ID = new RMNMethodParam(false, "uid", rMNParamFormat);
        PUSH_SCREEN_SIZE = new RMNMethodParam(false, "screen_size", rMNParamFormat);
        PUSH_FINGER_PRINT_REQUIRED = new RMNMethodParam(true, "fp", rMNParamFormat);
        PUSH_VIEWPORT = new RMNMethodParam(false, "viewport", rMNParamFormat);
        PUSH_SENDER = new RMNMethodParam(false, "sender", rMNParamFormat);
        ID_LIST = new RMNMethodParam(true, "id_list", rMNParamFormat);
        RMNParamFormat rMNParamFormat2 = BaseMethodParameters.RMN_FORMAT_BOOLEAN;
        WITH_ALL_VALUES = new RMNMethodParam(false, "with_all_values", rMNParamFormat2);
        WITH_SCHEDULING = new RMNMethodParam(false, "with_scheduling", rMNParamFormat2);
    }
}
