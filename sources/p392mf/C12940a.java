package p392mf;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C12775o;

/* renamed from: mf.a */
/* compiled from: IOStreams.kt */
public final class C12940a {
    /* renamed from: a */
    public static final long m29242a(InputStream inputStream, OutputStream outputStream, int i) {
        C12775o.m28639i(inputStream, "<this>");
        C12775o.m28639i(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m29243b(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m29242a(inputStream, outputStream, i);
    }

    /* renamed from: c */
    public static final byte[] m29244c(InputStream inputStream) {
        C12775o.m28639i(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m29243b(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C12775o.m28638h(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
