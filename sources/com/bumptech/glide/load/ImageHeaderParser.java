package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p106h1.C7883b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: b */
        private final boolean f3752b;

        private ImageType(boolean z) {
            this.f3752b = z;
        }

        public boolean hasAlpha() {
            return this.f3752b;
        }
    }

    @NonNull
    /* renamed from: a */
    ImageType mo31238a(@NonNull ByteBuffer byteBuffer);

    @NonNull
    /* renamed from: b */
    ImageType mo31239b(@NonNull InputStream inputStream);

    /* renamed from: c */
    int mo31240c(@NonNull InputStream inputStream, @NonNull C7883b bVar);
}
