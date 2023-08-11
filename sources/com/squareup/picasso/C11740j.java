package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p452wd.C13694a;

/* renamed from: com.squareup.picasso.j */
/* compiled from: LruCache */
public final class C11740j implements C13694a {

    /* renamed from: a */
    final LruCache<String, C11742b> f18257a;

    /* renamed from: com.squareup.picasso.j$a */
    /* compiled from: LruCache */
    class C11741a extends LruCache<String, C11742b> {
        C11741a(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, C11742b bVar) {
            return bVar.f18260b;
        }
    }

    /* renamed from: com.squareup.picasso.j$b */
    /* compiled from: LruCache */
    static final class C11742b {

        /* renamed from: a */
        final Bitmap f18259a;

        /* renamed from: b */
        final int f18260b;

        C11742b(Bitmap bitmap, int i) {
            this.f18259a = bitmap;
            this.f18260b = i;
        }
    }

    public C11740j(@NonNull Context context) {
        this(C11774x.m25296b(context));
    }

    /* renamed from: a */
    public int mo48714a() {
        return this.f18257a.maxSize();
    }

    /* renamed from: b */
    public void mo48715b(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int i = C11774x.m25303i(bitmap);
        if (i > mo48714a()) {
            this.f18257a.remove(str);
        } else {
            this.f18257a.put(str, new C11742b(bitmap, i));
        }
    }

    @Nullable
    public Bitmap get(@NonNull String str) {
        C11742b bVar = this.f18257a.get(str);
        if (bVar != null) {
            return bVar.f18259a;
        }
        return null;
    }

    public int size() {
        return this.f18257a.size();
    }

    public C11740j(int i) {
        this.f18257a = new C11741a(i);
    }
}
