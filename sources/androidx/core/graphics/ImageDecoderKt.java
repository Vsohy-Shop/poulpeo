package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: ImageDecoder.kt */
public final class ImageDecoderKt {
    @RequiresApi(28)
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, C13089p<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C11921v> pVar) {
        C12775o.m28639i(source, "<this>");
        C12775o.m28639i(pVar, "action");
        Bitmap a = ImageDecoder.decodeBitmap(source, new ImageDecoderKt$decodeBitmap$1(pVar));
        C12775o.m28638h(a, "crossinline action: Imag…ction(info, source)\n    }");
        return a;
    }

    @RequiresApi(28)
    public static final Drawable decodeDrawable(ImageDecoder.Source source, C13089p<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C11921v> pVar) {
        C12775o.m28639i(source, "<this>");
        C12775o.m28639i(pVar, "action");
        Drawable a = ImageDecoder.decodeDrawable(source, new ImageDecoderKt$decodeDrawable$1(pVar));
        C12775o.m28638h(a, "crossinline action: Imag…ction(info, source)\n    }");
        return a;
    }
}
