package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;

@RequiresApi(21)
/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class C4480u implements C7224i<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C4467m f4059a;

    public C4480u(C4467m mVar) {
        this.f4059a = mVar;
    }

    @Nullable
    /* renamed from: c */
    public C7744c<Bitmap> mo31395a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull C7222g gVar) {
        return this.f4059a.mo31421d(parcelFileDescriptor, i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull C7222g gVar) {
        return this.f4059a.mo31424o(parcelFileDescriptor);
    }
}
