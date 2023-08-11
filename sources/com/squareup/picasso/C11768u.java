package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.C11751p;
import okio.C13179y0;

/* renamed from: com.squareup.picasso.u */
/* compiled from: RequestHandler */
public abstract class C11768u {

    /* renamed from: com.squareup.picasso.u$a */
    /* compiled from: RequestHandler */
    public static final class C11769a {

        /* renamed from: a */
        private final C11751p.C11757e f18386a;

        /* renamed from: b */
        private final Bitmap f18387b;

        /* renamed from: c */
        private final C13179y0 f18388c;

        /* renamed from: d */
        private final int f18389d;

        public C11769a(@NonNull Bitmap bitmap, @NonNull C11751p.C11757e eVar) {
            this((Bitmap) C11774x.m25298d(bitmap, "bitmap == null"), (C13179y0) null, eVar, 0);
        }

        @Nullable
        /* renamed from: a */
        public Bitmap mo48778a() {
            return this.f18387b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo48779b() {
            return this.f18389d;
        }

        @NonNull
        /* renamed from: c */
        public C11751p.C11757e mo48780c() {
            return this.f18386a;
        }

        @Nullable
        /* renamed from: d */
        public C13179y0 mo48781d() {
            return this.f18388c;
        }

        public C11769a(@NonNull C13179y0 y0Var, @NonNull C11751p.C11757e eVar) {
            this((Bitmap) null, (C13179y0) C11774x.m25298d(y0Var, "source == null"), eVar, 0);
        }

        C11769a(@Nullable Bitmap bitmap, @Nullable C13179y0 y0Var, @NonNull C11751p.C11757e eVar, int i) {
            if ((bitmap != null) != (y0Var == null ? false : true)) {
                this.f18387b = bitmap;
                this.f18388c = y0Var;
                this.f18386a = (C11751p.C11757e) C11774x.m25298d(eVar, "loadedFrom == null");
                this.f18389d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    static void m25266a(int i, int i2, int i3, int i4, BitmapFactory.Options options, C11764s sVar) {
        int i5;
        double floor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                floor = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                floor = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor3 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                if (sVar.f18347l) {
                    i5 = Math.max(floor2, floor3);
                } else {
                    i5 = Math.min(floor2, floor3);
                }
            }
            i5 = (int) floor;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    /* renamed from: b */
    static void m25267b(int i, int i2, BitmapFactory.Options options, C11764s sVar) {
        m25266a(i, i2, options.outWidth, options.outHeight, options, sVar);
    }

    /* renamed from: d */
    static BitmapFactory.Options m25268d(C11764s sVar) {
        boolean z;
        boolean c = sVar.mo48763c();
        if (sVar.f18354s != null) {
            z = true;
        } else {
            z = false;
        }
        if (!c && !z && !sVar.f18353r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c;
        boolean z2 = sVar.f18353r;
        options.inInputShareable = z2;
        options.inPurgeable = z2;
        if (z) {
            options.inPreferredConfig = sVar.f18354s;
        }
        return options;
    }

    /* renamed from: g */
    static boolean m25269g(BitmapFactory.Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract boolean mo48661c(C11764s sVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo48732e() {
        return 0;
    }

    @Nullable
    /* renamed from: f */
    public abstract C11769a mo48662f(C11764s sVar, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo48733h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo48734i() {
        return false;
    }
}
