package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.C4467m;
import java.io.IOException;
import java.io.InputStream;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;
import p106h1.C7883b;
import p106h1.C7885d;
import p294z1.C10783d;
import p294z1.C10789h;

/* renamed from: com.bumptech.glide.load.resource.bitmap.x */
/* compiled from: StreamBitmapDecoder */
public class C4484x implements C7224i<InputStream, Bitmap> {

    /* renamed from: a */
    private final C4467m f4068a;

    /* renamed from: b */
    private final C7883b f4069b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.x$a */
    /* compiled from: StreamBitmapDecoder */
    static class C4485a implements C4467m.C4469b {

        /* renamed from: a */
        private final C4481v f4070a;

        /* renamed from: b */
        private final C10783d f4071b;

        C4485a(C4481v vVar, C10783d dVar) {
            this.f4070a = vVar;
            this.f4071b = dVar;
        }

        /* renamed from: a */
        public void mo31427a() {
            this.f4070a.mo31444b();
        }

        /* renamed from: b */
        public void mo31428b(C7885d dVar, Bitmap bitmap) {
            IOException a = this.f4071b.mo45683a();
            if (a != null) {
                if (bitmap != null) {
                    dVar.mo31429c(bitmap);
                }
                throw a;
            }
        }
    }

    public C4484x(C4467m mVar, C7883b bVar) {
        this.f4068a = mVar;
        this.f4069b = bVar;
    }

    /* renamed from: c */
    public C7744c<Bitmap> mo31395a(@NonNull InputStream inputStream, int i, int i2, @NonNull C7222g gVar) {
        C4481v vVar;
        boolean z;
        if (inputStream instanceof C4481v) {
            vVar = (C4481v) inputStream;
            z = false;
        } else {
            z = true;
            vVar = new C4481v(inputStream, this.f4069b);
        }
        C10783d b = C10783d.m22925b(vVar);
        try {
            return this.f4068a.mo31423g(new C10789h(b), i, i2, gVar, new C4485a(vVar, b));
        } finally {
            b.mo45685c();
            if (z) {
                vVar.mo31445c();
            }
        }
    }

    /* renamed from: d */
    public boolean mo31396b(@NonNull InputStream inputStream, @NonNull C7222g gVar) {
        return this.f4068a.mo31425p(inputStream);
    }
}
