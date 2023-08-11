package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import p058d1.C7217d;
import p058d1.C7222g;
import p117i1.C8064a;

/* renamed from: com.bumptech.glide.load.engine.e */
/* compiled from: DataCacheWriter */
class C4392e<DataType> implements C8064a.C8066b {

    /* renamed from: a */
    private final C7217d<DataType> f3793a;

    /* renamed from: b */
    private final DataType f3794b;

    /* renamed from: c */
    private final C7222g f3795c;

    C4392e(C7217d<DataType> dVar, DataType datatype, C7222g gVar) {
        this.f3793a = dVar;
        this.f3794b = datatype;
        this.f3795c = gVar;
    }

    /* renamed from: a */
    public boolean mo31276a(@NonNull File file) {
        return this.f3793a.mo31397a(this.f3794b, file, this.f3795c);
    }
}
