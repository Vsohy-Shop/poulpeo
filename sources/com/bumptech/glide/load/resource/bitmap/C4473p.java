package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p106h1.C7883b;

@RequiresApi(27)
/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
/* compiled from: ExifInterfaceImageHeaderParser */
public final class C4473p implements ImageHeaderParser {
    @NonNull
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo31238a(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo31239b(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    /* renamed from: c */
    public int mo31240c(@NonNull InputStream inputStream, @NonNull C7883b bVar) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
