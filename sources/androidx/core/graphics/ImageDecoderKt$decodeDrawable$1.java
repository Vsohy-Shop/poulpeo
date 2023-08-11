package androidx.core.graphics;

import android.graphics.ImageDecoder;
import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: ImageDecoder.kt */
public final class ImageDecoderKt$decodeDrawable$1 implements ImageDecoder.OnHeaderDecodedListener {
    final /* synthetic */ C13089p<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C11921v> $action;

    public ImageDecoderKt$decodeDrawable$1(C13089p<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C11921v> pVar) {
        this.$action = pVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C12775o.m28639i(imageDecoder, "decoder");
        C12775o.m28639i(imageInfo, "info");
        C12775o.m28639i(source, APIParams.SOURCE);
        this.$action.invoke(imageDecoder, imageInfo, source);
    }
}
