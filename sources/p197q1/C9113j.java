package p197q1;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C4375a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p106h1.C7883b;

/* renamed from: q1.j */
/* compiled from: StreamGifDecoder */
public class C9113j implements C7224i<InputStream, C9102c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f13287a;

    /* renamed from: b */
    private final C7224i<ByteBuffer, C9102c> f13288b;

    /* renamed from: c */
    private final C7883b f13289c;

    public C9113j(List<ImageHeaderParser> list, C7224i<ByteBuffer, C9102c> iVar, C7883b bVar) {
        this.f13287a = list;
        this.f13288b = iVar;
        this.f13289c = bVar;
    }

    /* renamed from: e */
    private static byte[] m18541e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public C7744c<C9102c> mo31395a(@NonNull InputStream inputStream, int i, int i2, @NonNull C7222g gVar) {
        byte[] e = m18541e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f13288b.mo31395a(ByteBuffer.wrap(e), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull InputStream inputStream, @NonNull C7222g gVar) {
        if (((Boolean) gVar.mo40779c(C9112i.f13286b)).booleanValue() || C4375a.m5115e(this.f13287a, inputStream, this.f13289c) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }
}
