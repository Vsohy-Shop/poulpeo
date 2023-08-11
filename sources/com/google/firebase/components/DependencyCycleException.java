package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import p202q6.C9284d;

public class DependencyCycleException extends DependencyException {

    /* renamed from: b */
    private final List<C9284d<?>> f9148b;

    public DependencyCycleException(List<C9284d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f9148b = list;
    }
}
