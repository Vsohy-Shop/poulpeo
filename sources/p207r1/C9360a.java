package p207r1;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p058d1.C7222g;
import p094g1.C7744c;
import p167n1.C8878b;

/* renamed from: r1.a */
/* compiled from: BitmapBytesTranscoder */
public class C9360a implements C9364e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f13918a;

    /* renamed from: b */
    private final int f13919b;

    public C9360a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Nullable
    /* renamed from: a */
    public C7744c<byte[]> mo43787a(@NonNull C7744c<Bitmap> cVar, @NonNull C7222g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cVar.get().compress(this.f13918a, this.f13919b, byteArrayOutputStream);
        cVar.recycle();
        return new C8878b(byteArrayOutputStream.toByteArray());
    }

    public C9360a(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.f13918a = compressFormat;
        this.f13919b = i;
    }
}
