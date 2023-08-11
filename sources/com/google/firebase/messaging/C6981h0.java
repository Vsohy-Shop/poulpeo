package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;
import p151l5.C8729l;
import p151l5.C8730m;
import p231t4.C9713p;
import p276x5.C10410i;

/* renamed from: com.google.firebase.messaging.h0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6981h0 implements Closeable {

    /* renamed from: b */
    private final URL f9309b;
    @Nullable

    /* renamed from: c */
    private Task<Bitmap> f9310c;
    @Nullable

    /* renamed from: d */
    private volatile InputStream f9311d;

    private C6981h0(URL url) {
        this.f9309b = url;
    }

    /* renamed from: b */
    private byte[] m12304b() {
        URLConnection openConnection = this.f9309b.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f9311d = inputStream;
                byte[] b = C8729l.m17654b(C8729l.m17653a(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String valueOf = String.valueOf(this.f9309b);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                    sb.append("Downloaded ");
                    sb.append(b.length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (b.length <= 1048576) {
                    return b;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable unused) {
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    @Nullable
    /* renamed from: c */
    public static C6981h0 m12305c(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C6981h0(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                str2 = new String("Not downloading image, bad URL: ");
            }
            Log.w("FirebaseMessaging", str2);
            return null;
        }
    }

    /* renamed from: A */
    public void mo39930A(Executor executor) {
        this.f9310c = C10410i.m21829c(executor, new C6978g0(this));
    }

    /* renamed from: a */
    public Bitmap mo39931a() {
        Log.i("FirebaseMessaging", "Starting download of: ".concat(String.valueOf(this.f9309b)));
        byte[] b = m12304b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(String.valueOf(this.f9309b)));
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: ".concat(String.valueOf(this.f9309b)));
    }

    public void close() {
        try {
            C8730m.m17656a(this.f9311d);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    /* renamed from: k */
    public Task<Bitmap> mo39933k() {
        return (Task) C9713p.m20275j(this.f9310c);
    }
}
