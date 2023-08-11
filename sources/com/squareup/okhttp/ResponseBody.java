package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okio.C13121c;
import okio.C13130e;

public abstract class ResponseBody implements Closeable {
    private Reader reader;

    private Charset charset() {
        MediaType contentType = contentType();
        if (contentType != null) {
            return contentType.charset(Util.UTF_8);
        }
        return Util.UTF_8;
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        C13121c R0 = new C13121c().mo52504R0(str, charset);
        return create(mediaType, R0.size(), R0);
    }

    public final InputStream byteStream() {
        return source().mo52540r0();
    }

    /* JADX INFO: finally extract failed */
    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            C13130e source = source();
            try {
                byte[] s = source.mo52548s();
                Util.closeQuietly((Closeable) source);
                if (contentLength == -1 || contentLength == ((long) s.length)) {
                    return s;
                }
                throw new IOException("Content-Length and stream length disagree");
            } catch (Throwable th) {
                Util.closeQuietly((Closeable) source);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(byteStream(), charset());
        this.reader = inputStreamReader;
        return inputStreamReader;
    }

    public void close() {
        source().close();
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract C13130e source();

    public final String string() {
        return new String(bytes(), charset().name());
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, (long) bArr.length, new C13121c().write(bArr));
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final C13130e eVar) {
        if (eVar != null) {
            return new ResponseBody() {
                public long contentLength() {
                    return j;
                }

                public MediaType contentType() {
                    return mediaType;
                }

                public C13130e source() {
                    return eVar;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
