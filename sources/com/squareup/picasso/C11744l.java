package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;
import okio.C13145j0;
import okio.C13179y0;

/* renamed from: com.squareup.picasso.l */
/* compiled from: MediaStoreRequestHandler */
class C11744l extends C11731e {

    /* renamed from: b */
    private static final String[] f18268b = {"orientation"};

    /* renamed from: com.squareup.picasso.l$a */
    /* compiled from: MediaStoreRequestHandler */
    enum C11745a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: b */
        final int f18273b;

        /* renamed from: c */
        final int f18274c;

        /* renamed from: d */
        final int f18275d;

        private C11745a(int i, int i2, int i3) {
            this.f18273b = i;
            this.f18274c = i2;
            this.f18275d = i3;
        }
    }

    C11744l(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m25211k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f18268b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    static C11745a m25212l(int i, int i2) {
        C11745a aVar = C11745a.MICRO;
        if (i <= aVar.f18274c && i2 <= aVar.f18275d) {
            return aVar;
        }
        C11745a aVar2 = C11745a.MINI;
        if (i > aVar2.f18274c || i2 > aVar2.f18275d) {
            return C11745a.FULL;
        }
        return aVar2;
    }

    /* renamed from: c */
    public boolean mo48661c(C11764s sVar) {
        Uri uri = sVar.f18339d;
        if (!"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C11768u.C11769a mo48662f(C11764s sVar, int i) {
        boolean z;
        Bitmap bitmap;
        int i2;
        C11764s sVar2 = sVar;
        ContentResolver contentResolver = this.f18232a.getContentResolver();
        int k = m25211k(contentResolver, sVar2.f18339d);
        String type = contentResolver.getType(sVar2.f18339d);
        if (type == null || !type.startsWith("video/")) {
            z = false;
        } else {
            z = true;
        }
        if (sVar.mo48763c()) {
            C11745a l = m25212l(sVar2.f18343h, sVar2.f18344i);
            if (!z && l == C11745a.FULL) {
                return new C11768u.C11769a((Bitmap) null, C13145j0.m29747l(mo48687j(sVar)), C11751p.C11757e.DISK, k);
            }
            long parseId = ContentUris.parseId(sVar2.f18339d);
            BitmapFactory.Options d = C11768u.m25268d(sVar);
            d.inJustDecodeBounds = true;
            BitmapFactory.Options options = d;
            C11768u.m25266a(sVar2.f18343h, sVar2.f18344i, l.f18274c, l.f18275d, d, sVar);
            if (z) {
                if (l == C11745a.FULL) {
                    i2 = 1;
                } else {
                    i2 = l.f18273b;
                }
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, i2, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.f18273b, options);
            }
            if (bitmap != null) {
                return new C11768u.C11769a(bitmap, (C13179y0) null, C11751p.C11757e.DISK, k);
            }
        }
        return new C11768u.C11769a((Bitmap) null, C13145j0.m29747l(mo48687j(sVar)), C11751p.C11757e.DISK, k);
    }
}
