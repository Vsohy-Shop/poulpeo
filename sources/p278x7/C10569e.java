package p278x7;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.C4369g;
import com.bumptech.glide.C4371h;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p058d1.C7215b;
import p137k1.C8462g;
import p137k1.C8463h;
import p137k1.C8466j;
import p261w1.C10101a;
import p272x1.C10386b;

/* renamed from: x7.e */
/* compiled from: FiamImageLoader */
public class C10569e {

    /* renamed from: a */
    private final C4371h f16084a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, Set<C10101a>> f16085b = new HashMap();

    /* renamed from: x7.e$a */
    /* compiled from: FiamImageLoader */
    public static abstract class C10570a extends C10101a<Drawable> {

        /* renamed from: e */
        private ImageView f16086e;

        /* renamed from: m */
        private void m22436m(Drawable drawable) {
            ImageView imageView = this.f16086e;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }

        /* renamed from: g */
        public void mo44679g(@Nullable Drawable drawable) {
            C10584m.m22515a("Downloading Image Failed");
            m22436m(drawable);
            mo44616j(new Exception("Image loading failed!"));
        }

        /* renamed from: i */
        public void mo43367i(@Nullable Drawable drawable) {
            C10584m.m22515a("Downloading Image Cleared");
            m22436m(drawable);
            mo44617l();
        }

        /* renamed from: j */
        public abstract void mo44616j(Exception exc);

        /* renamed from: k */
        public void mo43366d(@NonNull Drawable drawable, @Nullable C10386b<? super Drawable> bVar) {
            C10584m.m22515a("Downloading Image Success!!!");
            m22436m(drawable);
            mo44617l();
        }

        /* renamed from: l */
        public abstract void mo44617l();

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo45493n(ImageView imageView) {
            this.f16086e = imageView;
        }
    }

    /* renamed from: x7.e$b */
    /* compiled from: FiamImageLoader */
    public class C10571b {

        /* renamed from: a */
        private final C4369g<Drawable> f16087a;

        /* renamed from: b */
        private C10570a f16088b;

        /* renamed from: c */
        private String f16089c;

        public C10571b(C4369g<Drawable> gVar) {
            this.f16087a = gVar;
        }

        /* renamed from: a */
        private void m22444a() {
            Set set;
            if (this.f16088b != null && !TextUtils.isEmpty(this.f16089c)) {
                synchronized (C10569e.this.f16085b) {
                    if (C10569e.this.f16085b.containsKey(this.f16089c)) {
                        set = (Set) C10569e.this.f16085b.get(this.f16089c);
                    } else {
                        set = new HashSet();
                        C10569e.this.f16085b.put(this.f16089c, set);
                    }
                    if (!set.contains(this.f16088b)) {
                        set.add(this.f16088b);
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo45494b(ImageView imageView, C10570a aVar) {
            C10584m.m22515a("Downloading Image Callback : " + aVar);
            aVar.mo45493n(imageView);
            this.f16087a.mo31207j0(aVar);
            this.f16088b = aVar;
            m22444a();
        }

        /* renamed from: c */
        public C10571b mo45495c(int i) {
            this.f16087a.mo44445L(i);
            C10584m.m22515a("Downloading Image Placeholder : " + i);
            return this;
        }

        /* renamed from: d */
        public C10571b mo45496d(Class cls) {
            this.f16089c = cls.getSimpleName();
            m22444a();
            return this;
        }
    }

    public C10569e(C4371h hVar) {
        this.f16084a = hVar;
    }

    /* renamed from: b */
    public void mo45490b(Class cls) {
        String simpleName = cls.getSimpleName();
        synchronized (simpleName) {
            if (this.f16085b.containsKey(simpleName)) {
                for (C10101a aVar : this.f16085b.get(simpleName)) {
                    if (aVar != null) {
                        this.f16084a.mo31215n(aVar);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public C10571b mo45491c(@Nullable String str) {
        C10584m.m22515a("Starting Downloading Image : " + str);
        return new C10571b((C4369g) this.f16084a.mo31224r(new C8462g(str, (C8463h) new C8466j.C8467a().mo42495a("Accept", "image/*").mo42497c())).mo44459f(C7215b.PREFER_ARGB_8888));
    }
}
