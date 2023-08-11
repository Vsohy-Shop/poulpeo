package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.File;
import java.nio.charset.Charset;
import okio.C13127d;
import okio.C13133f;
import okio.C13145j0;
import okio.C13179y0;

public abstract class RequestBody {
    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() {
        return -1;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(C13127d dVar);

    public static RequestBody create(final MediaType mediaType, final C13133f fVar) {
        return new RequestBody() {
            public long contentLength() {
                return (long) fVar.mo52590H();
            }

            public MediaType contentType() {
                return mediaType;
            }

            public void writeTo(C13127d dVar) {
                dVar.mo52517b0(fVar);
            }
        };
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() {
                public long contentLength() {
                    return (long) i2;
                }

                public MediaType contentType() {
                    return mediaType;
                }

                public void writeTo(C13127d dVar) {
                    dVar.write(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() {
                public long contentLength() {
                    return file.length();
                }

                public MediaType contentType() {
                    return mediaType;
                }

                public void writeTo(C13127d dVar) {
                    C13179y0 y0Var = null;
                    try {
                        y0Var = C13145j0.m29746k(file);
                        dVar.mo52494K(y0Var);
                    } finally {
                        Util.closeQuietly((Closeable) y0Var);
                    }
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
