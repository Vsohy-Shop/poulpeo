package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.C4481v;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p070e1.C7438m;
import p106h1.C7883b;

/* renamed from: com.bumptech.glide.load.a */
/* compiled from: ImageHeaderParserUtils */
public final class C4375a {

    /* renamed from: com.bumptech.glide.load.a$a */
    /* compiled from: ImageHeaderParserUtils */
    class C4376a implements C4382g {

        /* renamed from: a */
        final /* synthetic */ InputStream f3753a;

        C4376a(InputStream inputStream) {
            this.f3753a = inputStream;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo31242a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo31239b(this.f3753a);
            } finally {
                this.f3753a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    /* compiled from: ImageHeaderParserUtils */
    class C4377b implements C4382g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f3754a;

        C4377b(ByteBuffer byteBuffer) {
            this.f3754a = byteBuffer;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo31242a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.mo31238a(this.f3754a);
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    /* compiled from: ImageHeaderParserUtils */
    class C4378c implements C4382g {

        /* renamed from: a */
        final /* synthetic */ C7438m f3755a;

        /* renamed from: b */
        final /* synthetic */ C7883b f3756b;

        C4378c(C7438m mVar, C7883b bVar) {
            this.f3755a = mVar;
            this.f3756b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo31242a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.v r1 = new com.bumptech.glide.load.resource.bitmap.v     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                e1.m r3 = r4.f3755a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo41085a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                h1.b r3 = r4.f3756b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo31239b(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                e1.m r0 = r4.f3755a
                r0.mo41085a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                e1.m r0 = r4.f3755a
                r0.mo41085a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C4375a.C4378c.mo31242a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    /* compiled from: ImageHeaderParserUtils */
    class C4379d implements C4381f {

        /* renamed from: a */
        final /* synthetic */ InputStream f3757a;

        /* renamed from: b */
        final /* synthetic */ C7883b f3758b;

        C4379d(InputStream inputStream, C7883b bVar) {
            this.f3757a = inputStream;
            this.f3758b = bVar;
        }

        /* renamed from: a */
        public int mo31243a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo31240c(this.f3757a, this.f3758b);
            } finally {
                this.f3757a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    /* compiled from: ImageHeaderParserUtils */
    class C4380e implements C4381f {

        /* renamed from: a */
        final /* synthetic */ C7438m f3759a;

        /* renamed from: b */
        final /* synthetic */ C7883b f3760b;

        C4380e(C7438m mVar, C7883b bVar) {
            this.f3759a = mVar;
            this.f3760b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo31243a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.v r1 = new com.bumptech.glide.load.resource.bitmap.v     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                e1.m r3 = r4.f3759a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo41085a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                h1.b r3 = r4.f3760b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                h1.b r0 = r4.f3760b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo31240c(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                e1.m r0 = r4.f3759a
                r0.mo41085a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                e1.m r0 = r4.f3759a
                r0.mo41085a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C4375a.C4380e.mo31243a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    /* compiled from: ImageHeaderParserUtils */
    private interface C4381f {
        /* renamed from: a */
        int mo31243a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    /* compiled from: ImageHeaderParserUtils */
    private interface C4382g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo31242a(ImageHeaderParser imageHeaderParser);
    }

    @RequiresApi(21)
    /* renamed from: a */
    public static int m5111a(@NonNull List<ImageHeaderParser> list, @NonNull C7438m mVar, @NonNull C7883b bVar) {
        return m5113c(list, new C4380e(mVar, bVar));
    }

    /* renamed from: b */
    public static int m5112b(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C7883b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C4481v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m5113c(list, new C4379d(inputStream, bVar));
    }

    /* renamed from: c */
    private static int m5113c(@NonNull List<ImageHeaderParser> list, C4381f fVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.mo31243a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    @RequiresApi(21)
    @NonNull
    /* renamed from: d */
    public static ImageHeaderParser.ImageType m5114d(@NonNull List<ImageHeaderParser> list, @NonNull C7438m mVar, @NonNull C7883b bVar) {
        return m5117g(list, new C4378c(mVar, bVar));
    }

    @NonNull
    /* renamed from: e */
    public static ImageHeaderParser.ImageType m5115e(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull C7883b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C4481v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m5117g(list, new C4376a(inputStream));
    }

    @NonNull
    /* renamed from: f */
    public static ImageHeaderParser.ImageType m5116f(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m5117g(list, new C4377b(byteBuffer));
    }

    @NonNull
    /* renamed from: g */
    private static ImageHeaderParser.ImageType m5117g(@NonNull List<ImageHeaderParser> list, C4382g gVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = gVar.mo31242a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
