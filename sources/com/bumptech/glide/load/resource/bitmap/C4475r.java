package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C4375a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import p070e1.C7435k;
import p070e1.C7438m;
import p106h1.C7883b;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
/* compiled from: ImageReader */
interface C4475r {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$a */
    /* compiled from: ImageReader */
    public static final class C4476a implements C4475r {

        /* renamed from: a */
        private final C7435k f4050a;

        /* renamed from: b */
        private final C7883b f4051b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f4052c;

        C4476a(InputStream inputStream, List<ImageHeaderParser> list, C7883b bVar) {
            this.f4051b = (C7883b) C10791j.m22948d(bVar);
            this.f4052c = (List) C10791j.m22948d(list);
            this.f4050a = new C7435k(inputStream, bVar);
        }

        /* renamed from: a */
        public int mo31434a() {
            return C4375a.m5112b(this.f4052c, this.f4050a.mo41085a(), this.f4051b);
        }

        @Nullable
        /* renamed from: b */
        public Bitmap mo31435b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f4050a.mo41085a(), (Rect) null, options);
        }

        /* renamed from: c */
        public void mo31436c() {
            this.f4050a.mo41102c();
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo31437d() {
            return C4375a.m5115e(this.f4052c, this.f4050a.mo41085a(), this.f4051b);
        }
    }

    /* renamed from: a */
    int mo31434a();

    @Nullable
    /* renamed from: b */
    Bitmap mo31435b(BitmapFactory.Options options);

    /* renamed from: c */
    void mo31436c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo31437d();

    @RequiresApi(21)
    /* renamed from: com.bumptech.glide.load.resource.bitmap.r$b */
    /* compiled from: ImageReader */
    public static final class C4477b implements C4475r {

        /* renamed from: a */
        private final C7883b f4053a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f4054b;

        /* renamed from: c */
        private final C7438m f4055c;

        C4477b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C7883b bVar) {
            this.f4053a = (C7883b) C10791j.m22948d(bVar);
            this.f4054b = (List) C10791j.m22948d(list);
            this.f4055c = new C7438m(parcelFileDescriptor);
        }

        /* renamed from: a */
        public int mo31434a() {
            return C4375a.m5111a(this.f4054b, this.f4055c, this.f4053a);
        }

        @Nullable
        /* renamed from: b */
        public Bitmap mo31435b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f4055c.mo41085a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo31437d() {
            return C4375a.m5114d(this.f4054b, this.f4055c, this.f4053a);
        }

        /* renamed from: c */
        public void mo31436c() {
        }
    }
}
