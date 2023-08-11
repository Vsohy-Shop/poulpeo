package com.bumptech.glide;

import com.bumptech.glide.C4374i;
import p272x1.C10384a;
import p272x1.C10387c;

/* renamed from: com.bumptech.glide.i */
/* compiled from: TransitionOptions */
public abstract class C4374i<CHILD extends C4374i<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    private C10387c<? super TranscodeType> f3750b = C10384a.m21767a();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (C4374i) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C10387c<? super TranscodeType> mo31236b() {
        return this.f3750b;
    }
}
