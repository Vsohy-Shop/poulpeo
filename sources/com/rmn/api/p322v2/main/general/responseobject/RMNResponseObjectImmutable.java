package com.rmn.api.p322v2.main.general.responseobject;

import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;

/* renamed from: com.rmn.api.v2.main.general.responseobject.RMNResponseObjectImmutable */
public abstract class RMNResponseObjectImmutable {
    private RMNMethodReturnType methodReturnType;
    protected Object retrievedObject;

    public RMNResponseObjectImmutable(RMNMethodReturnType rMNMethodReturnType) {
        if (rMNMethodReturnType != null) {
            this.methodReturnType = rMNMethodReturnType;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final Object getRetrievedObject() {
        return this.retrievedObject;
    }

    public RMNMethodReturnType getmethodReturnType() {
        return this.methodReturnType;
    }
}
