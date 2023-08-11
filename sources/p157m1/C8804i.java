package p157m1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.C4456i;
import com.bumptech.glide.load.resource.bitmap.C4467m;
import com.bumptech.glide.load.resource.bitmap.C4474q;
import p058d1.C7215b;
import p058d1.C7219f;
import p058d1.C7222g;
import p058d1.C7223h;
import p058d1.C7224i;
import p094g1.C7744c;

@RequiresApi(api = 28)
/* renamed from: m1.i */
/* compiled from: ImageDecoderResourceDecoder */
public abstract class C8804i<T> implements C7224i<ImageDecoder.Source, T> {

    /* renamed from: a */
    final C4474q f12751a = C4474q.m5438a();

    /* renamed from: m1.i$a */
    /* compiled from: ImageDecoderResourceDecoder */
    class C8805a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f12752a;

        /* renamed from: b */
        final /* synthetic */ int f12753b;

        /* renamed from: c */
        final /* synthetic */ boolean f12754c;

        /* renamed from: d */
        final /* synthetic */ C7215b f12755d;

        /* renamed from: e */
        final /* synthetic */ C4456i f12756e;

        /* renamed from: f */
        final /* synthetic */ C7223h f12757f;

        /* renamed from: m1.i$a$a */
        /* compiled from: ImageDecoderResourceDecoder */
        class C8806a implements ImageDecoder.OnPartialImageListener {
            C8806a() {
            }

            public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C8805a(int i, int i2, boolean z, C7215b bVar, C4456i iVar, C7223h hVar) {
            this.f12752a = i;
            this.f12753b = i2;
            this.f12754c = z;
            this.f12755d = bVar;
            this.f12756e = iVar;
            this.f12757f = hVar;
        }

        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (C8804i.this.f12751a.mo31432c(this.f12752a, this.f12753b, this.f12754c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f12755d == C7215b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C8806a());
            Size a = imageInfo.getSize();
            int i = this.f12752a;
            if (i == Integer.MIN_VALUE) {
                i = a.getWidth();
            }
            int i2 = this.f12753b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = a.getHeight();
            }
            float b = this.f12756e.mo31420b(a.getWidth(), a.getHeight(), i, i2);
            int round = Math.round(((float) a.getWidth()) * b);
            int round2 = Math.round(((float) a.getHeight()) * b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + a.getWidth() + "x" + a.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f12757f == C7223h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C7744c<T> mo31412c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    @Nullable
    /* renamed from: d */
    public final C7744c<T> mo31395a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull C7222g gVar) {
        boolean z;
        C7215b bVar = (C7215b) gVar.mo40779c(C4467m.f4026f);
        C4456i iVar = (C4456i) gVar.mo40779c(C4456i.f4021h);
        C7219f fVar = C4467m.f4030j;
        if (gVar.mo40779c(fVar) == null || !((Boolean) gVar.mo40779c(fVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        return mo31412c(source, i, i2, new C8805a(i, i2, z, bVar, iVar, (C7223h) gVar.mo40779c(C4467m.f4027g)));
    }

    /* renamed from: e */
    public final boolean mo31396b(@NonNull ImageDecoder.Source source, @NonNull C7222g gVar) {
        return true;
    }
}
