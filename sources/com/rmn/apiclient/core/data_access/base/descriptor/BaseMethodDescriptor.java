package com.rmn.apiclient.core.data_access.base.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;

public abstract class BaseMethodDescriptor {
    @Nullable
    public final BodyDescriptor<?> bodyDescriptor;
    @Nullable
    public final IDocumentDescriptor documentDescriptor;
    @NonNull
    public final String name;
    @NonNull
    public final ParamDescriptorSet paramDescriptors;
    @NonNull
    public final MethodVerb verb;

    public BaseMethodDescriptor(@NonNull MethodVerb methodVerb, @NonNull String str, @Nullable ParamDescriptorSet paramDescriptorSet, @Nullable BodyDescriptor<?> bodyDescriptor2, @Nullable IDocumentDescriptor iDocumentDescriptor) {
        this.verb = methodVerb;
        this.name = str;
        if (paramDescriptorSet == null) {
            this.paramDescriptors = new ParamDescriptorSet(new ParamDescriptor[0]);
        } else {
            this.paramDescriptors = paramDescriptorSet;
        }
        this.bodyDescriptor = bodyDescriptor2;
        this.documentDescriptor = iDocumentDescriptor;
    }

    public boolean hasBodyDescriptor() {
        if (this.bodyDescriptor != null) {
            return true;
        }
        return false;
    }

    public boolean hasDocumentDescriptor() {
        if (this.documentDescriptor != null) {
            return true;
        }
        return false;
    }
}
