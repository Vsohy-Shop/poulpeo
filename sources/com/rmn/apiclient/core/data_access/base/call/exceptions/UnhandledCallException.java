package com.rmn.apiclient.core.data_access.base.call.exceptions;

import com.rmn.apiclient.core.data_access.base.call.CallException;

public class UnhandledCallException extends CallException {
    public UnhandledCallException() {
        super("No processor returned an output with a success or failure status");
    }
}
