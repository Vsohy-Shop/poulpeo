package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.RequiresApi;
import p094g1.C7744c;
import p106h1.C7885d;
import p106h1.C7886e;
import p157m1.C8804i;

@RequiresApi(api = 28)
/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
/* compiled from: BitmapImageDecoderResourceDecoder */
public final class C4451d extends C8804i<Bitmap> {

    /* renamed from: b */
    private final C7885d f4009b = new C7886e();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C7744c<Bitmap> mo31412c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        Bitmap a = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + a.getWidth() + "x" + a.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new C4452e(a, this.f4009b);
    }
}
