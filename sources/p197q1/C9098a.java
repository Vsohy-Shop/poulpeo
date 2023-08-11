package p197q1;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.C4375a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p044c1.C3865a;
import p044c1.C3868c;
import p044c1.C3869d;
import p044c1.C3870e;
import p058d1.C7215b;
import p058d1.C7222g;
import p058d1.C7224i;
import p106h1.C7883b;
import p106h1.C7885d;
import p157m1.C8808k;
import p294z1.C10787f;
import p294z1.C10792k;

/* renamed from: q1.a */
/* compiled from: ByteBufferGifDecoder */
public class C9098a implements C7224i<ByteBuffer, C9102c> {

    /* renamed from: f */
    private static final C9099a f13238f = new C9099a();

    /* renamed from: g */
    private static final C9100b f13239g = new C9100b();

    /* renamed from: a */
    private final Context f13240a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f13241b;

    /* renamed from: c */
    private final C9100b f13242c;

    /* renamed from: d */
    private final C9099a f13243d;

    /* renamed from: e */
    private final C9101b f13244e;

    @VisibleForTesting
    /* renamed from: q1.a$a */
    /* compiled from: ByteBufferGifDecoder */
    static class C9099a {
        C9099a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3865a mo43326a(C3865a.C3866a aVar, C3868c cVar, ByteBuffer byteBuffer, int i) {
            return new C3870e(aVar, cVar, byteBuffer, i);
        }
    }

    @VisibleForTesting
    /* renamed from: q1.a$b */
    /* compiled from: ByteBufferGifDecoder */
    static class C9100b {

        /* renamed from: a */
        private final Queue<C3869d> f13245a = C10792k.m22954e(0);

        C9100b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C3869d mo43327a(ByteBuffer byteBuffer) {
            C3869d poll;
            poll = this.f13245a.poll();
            if (poll == null) {
                poll = new C3869d();
            }
            return poll.mo29911p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo43328b(C3869d dVar) {
            dVar.mo29909a();
            this.f13245a.offer(dVar);
        }
    }

    public C9098a(Context context, List<ImageHeaderParser> list, C7885d dVar, C7883b bVar) {
        this(context, list, dVar, bVar, f13239g, f13238f);
    }

    @Nullable
    /* renamed from: c */
    private C9105e m18477c(ByteBuffer byteBuffer, int i, int i2, C3869d dVar, C7222g gVar) {
        Bitmap.Config config;
        long b = C10787f.m22932b();
        try {
            C3868c c = dVar.mo29910c();
            if (c.mo29906b() > 0) {
                if (c.mo29907c() == 0) {
                    if (gVar.mo40779c(C9112i.f13285a) == C7215b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    C3865a a = this.f13243d.mo43326a(this.f13244e, c, byteBuffer, m18478e(c, i, i2));
                    a.mo29894e(config);
                    a.mo29890b();
                    Bitmap a2 = a.mo29889a();
                    if (a2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C10787f.m22931a(b));
                        }
                        return null;
                    }
                    C9105e eVar = new C9105e(new C9102c(this.f13240a, a, C8808k.m17827c(), i, i2, a2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C10787f.m22931a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C10787f.m22931a(b));
            }
        }
    }

    /* renamed from: e */
    private static int m18478e(C3868c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo29905a() / i2, cVar.mo29908d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo29908d() + "x" + cVar.mo29905a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public C9105e mo31395a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C7222g gVar) {
        C3869d a = this.f13242c.mo43327a(byteBuffer);
        try {
            return m18477c(byteBuffer, i, i2, a, gVar);
        } finally {
            this.f13242c.mo43328b(a);
        }
    }

    /* renamed from: f */
    public boolean mo31396b(@NonNull ByteBuffer byteBuffer, @NonNull C7222g gVar) {
        if (((Boolean) gVar.mo40779c(C9112i.f13286b)).booleanValue() || C4375a.m5116f(this.f13241b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    C9098a(Context context, List<ImageHeaderParser> list, C7885d dVar, C7883b bVar, C9100b bVar2, C9099a aVar) {
        this.f13240a = context.getApplicationContext();
        this.f13241b = list;
        this.f13243d = aVar;
        this.f13244e = new C9101b(dVar, bVar);
        this.f13242c = bVar2;
    }
}
