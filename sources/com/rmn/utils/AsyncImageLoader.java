package com.rmn.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11767t;
import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;

public class AsyncImageLoader {

    /* renamed from: com.rmn.utils.AsyncImageLoader$a */
    class C11663a implements Callback {

        /* renamed from: a */
        final /* synthetic */ ImageView f18147a;

        /* renamed from: b */
        final /* synthetic */ Object f18148b;

        /* renamed from: c */
        final /* synthetic */ ImageView f18149c;

        /* renamed from: d */
        final /* synthetic */ Callback f18150d;

        /* renamed from: e */
        final /* synthetic */ int f18151e;

        C11663a(ImageView imageView, Object obj, ImageView imageView2, Callback callback, int i) {
            this.f18147a = imageView;
            this.f18148b = obj;
            this.f18149c = imageView2;
            this.f18150d = callback;
            this.f18151e = i;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            Object tag = this.f18149c.getTag();
            if (tag != null && tag.equals(this.f18148b)) {
                AsyncImageLoader.setPlaceholderImage(this.f18149c, this.f18151e);
                Callback callback = this.f18150d;
                if (callback != null) {
                    callback.mo23239a(exc);
                }
            }
        }

        public void onSuccess() {
            Drawable drawable = this.f18147a.getDrawable();
            if (drawable != null) {
                if (this.f18148b == null || this.f18149c.getTag().equals(this.f18148b)) {
                    this.f18149c.setImageDrawable(drawable);
                    Callback callback = this.f18150d;
                    if (callback != null) {
                        callback.onSuccess();
                    }
                }
            }
        }
    }

    public static void loadImage(ImageView imageView, @Nullable Object obj, String str) {
        loadImage(imageView, obj, str, 0, (Callback) null, (NetworkPolicy) null);
    }

    public static void registerImageView(ImageView imageView, Object obj) {
        imageView.setTag(obj);
    }

    /* access modifiers changed from: private */
    public static void setPlaceholderImage(ImageView imageView, int i) {
        if (i > 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageBitmap((Bitmap) null);
        }
    }

    public static void loadImage(ImageView imageView, @Nullable Object obj, String str, Callback callback) {
        loadImage(imageView, obj, str, 0, callback, (NetworkPolicy) null);
    }

    public static void loadImage(ImageView imageView, @Nullable Object obj, String str, int i) {
        loadImage(imageView, obj, str, i, (Callback) null, (NetworkPolicy) null);
    }

    public static void loadImage(ImageView imageView, @Nullable Object obj, String str, int i, Callback callback) {
        loadImage(imageView, obj, str, i, callback, (NetworkPolicy) null);
    }

    public static void loadImage(ImageView imageView, @Nullable Object obj, String str, int i, Callback callback, NetworkPolicy networkPolicy) {
        setPlaceholderImage(imageView, i);
        if (str != null && !str.equals("")) {
            registerImageView(imageView, obj);
            ImageView imageView2 = new ImageView(imageView.getContext());
            C11767t j = C11751p.m25225g().mo48743j(str);
            if (networkPolicy != null) {
                j.mo48775e(networkPolicy, new NetworkPolicy[0]);
            }
            j.mo48774d(imageView2, new C11663a(imageView2, obj, imageView, callback, i));
        }
    }
}
