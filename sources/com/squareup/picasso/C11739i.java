package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.C11751p;

/* renamed from: com.squareup.picasso.i */
/* compiled from: ImageViewAction */
class C11739i extends C11720a<ImageView> {

    /* renamed from: m */
    Callback f18256m;

    C11739i(C11751p pVar, ImageView imageView, C11764s sVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, Callback callback, boolean z) {
        super(pVar, imageView, sVar, i, i2, i3, drawable, str, obj, z);
        this.f18256m = callback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo48648a() {
        super.mo48648a();
        if (this.f18256m != null) {
            this.f18256m = null;
        }
    }

    /* renamed from: b */
    public void mo48649b(Bitmap bitmap, C11751p.C11757e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f18187c.get();
            if (imageView != null) {
                C11751p pVar = this.f18185a;
                Bitmap bitmap2 = bitmap;
                C11751p.C11757e eVar2 = eVar;
                C11761q.m25243c(imageView, pVar.f18292d, bitmap2, eVar2, this.f18188d, pVar.f18300l);
                Callback callback = this.f18256m;
                if (callback != null) {
                    callback.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: c */
    public void mo48650c(Exception exc) {
        ImageView imageView = (ImageView) this.f18187c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.f18191g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable2 = this.f18192h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            Callback callback = this.f18256m;
            if (callback != null) {
                callback.mo23239a(exc);
            }
        }
    }
}
