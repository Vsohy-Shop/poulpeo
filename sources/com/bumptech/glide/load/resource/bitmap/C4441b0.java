package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p058d1.C7219f;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p106h1.C7885d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b0 */
/* compiled from: VideoDecoder */
public class C4441b0<T> implements C7224i<T, Bitmap> {

    /* renamed from: d */
    public static final C7219f<Long> f3996d = C7219f.m13984a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C4442a());

    /* renamed from: e */
    public static final C7219f<Integer> f3997e = C7219f.m13984a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C4443b());

    /* renamed from: f */
    private static final C4447e f3998f = new C4447e();

    /* renamed from: a */
    private final C4448f<T> f3999a;

    /* renamed from: b */
    private final C7885d f4000b;

    /* renamed from: c */
    private final C4447e f4001c;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$a */
    /* compiled from: VideoDecoder */
    class C4442a implements C7219f.C7221b<Long> {

        /* renamed from: a */
        private final ByteBuffer f4002a = ByteBuffer.allocate(8);

        C4442a() {
        }

        /* renamed from: b */
        public void mo31400a(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f4002a) {
                this.f4002a.position(0);
                messageDigest.update(this.f4002a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$b */
    /* compiled from: VideoDecoder */
    class C4443b implements C7219f.C7221b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f4003a = ByteBuffer.allocate(4);

        C4443b() {
        }

        /* renamed from: b */
        public void mo31400a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f4003a) {
                    this.f4003a.position(0);
                    messageDigest.update(this.f4003a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$c */
    /* compiled from: VideoDecoder */
    private static final class C4444c implements C4448f<AssetFileDescriptor> {
        private C4444c() {
        }

        /* synthetic */ C4444c(C4442a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo31403a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$e */
    /* compiled from: VideoDecoder */
    static class C4447e {
        C4447e() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo31409a() {
            return new MediaMetadataRetriever();
        }
    }

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$f */
    /* compiled from: VideoDecoder */
    interface C4448f<T> {
        /* renamed from: a */
        void mo31403a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$g */
    /* compiled from: VideoDecoder */
    static final class C4449g implements C4448f<ParcelFileDescriptor> {
        C4449g() {
        }

        /* renamed from: b */
        public void mo31403a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C4441b0(C7885d dVar, C4448f<T> fVar) {
        this(dVar, fVar, f3998f);
    }

    /* renamed from: c */
    public static C7224i<AssetFileDescriptor, Bitmap> m5344c(C7885d dVar) {
        return new C4441b0(dVar, new C4444c((C4442a) null));
    }

    @RequiresApi(api = 23)
    /* renamed from: d */
    public static C7224i<ByteBuffer, Bitmap> m5345d(C7885d dVar) {
        return new C4441b0(dVar, new C4445d());
    }

    @Nullable
    /* renamed from: e */
    private static Bitmap m5346e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C4456i iVar) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || iVar == C4456i.f4019f) {
            bitmap = null;
        } else {
            bitmap = m5348g(mediaMetadataRetriever, j, i, i2, i3, iVar);
        }
        if (bitmap == null) {
            return m5347f(mediaMetadataRetriever, j, i);
        }
        return bitmap;
    }

    /* renamed from: f */
    private static Bitmap m5347f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: g */
    private static Bitmap m5348g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C4456i iVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = iVar.mo31420b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    /* renamed from: h */
    public static C7224i<ParcelFileDescriptor, Bitmap> m5349h(C7885d dVar) {
        return new C4441b0(dVar, new C4449g());
    }

    /* renamed from: a */
    public C7744c<Bitmap> mo31395a(@NonNull T t, int i, int i2, @NonNull C7222g gVar) {
        long longValue = ((Long) gVar.mo40779c(f3996d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) gVar.mo40779c(f3997e);
            if (num == null) {
                num = 2;
            }
            C4456i iVar = (C4456i) gVar.mo40779c(C4456i.f4021h);
            if (iVar == null) {
                iVar = C4456i.f4020g;
            }
            C4456i iVar2 = iVar;
            MediaMetadataRetriever a = this.f4001c.mo31409a();
            try {
                this.f3999a.mo31403a(a, t);
                Bitmap e = m5346e(a, longValue, num.intValue(), i, i2, iVar2);
                a.release();
                return C4452e.m5369c(e, this.f4000b);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    /* renamed from: b */
    public boolean mo31396b(@NonNull T t, @NonNull C7222g gVar) {
        return true;
    }

    @VisibleForTesting
    C4441b0(C7885d dVar, C4448f<T> fVar, C4447e eVar) {
        this.f4000b = dVar;
        this.f3999a = fVar;
        this.f4001c = eVar;
    }

    @RequiresApi(23)
    /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$d */
    /* compiled from: VideoDecoder */
    static final class C4445d implements C4448f<ByteBuffer> {
        C4445d() {
        }

        /* renamed from: b */
        public void mo31403a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C4446a(byteBuffer));
        }

        /* renamed from: com.bumptech.glide.load.resource.bitmap.b0$d$a */
        /* compiled from: VideoDecoder */
        class C4446a extends MediaDataSource {

            /* renamed from: b */
            final /* synthetic */ ByteBuffer f4004b;

            C4446a(ByteBuffer byteBuffer) {
                this.f4004b = byteBuffer;
            }

            public long getSize() {
                return (long) this.f4004b.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f4004b.limit())) {
                    return -1;
                }
                this.f4004b.position((int) j);
                int min = Math.min(i2, this.f4004b.remaining());
                this.f4004b.get(bArr, i, min);
                return min;
            }

            public void close() {
            }
        }
    }
}
