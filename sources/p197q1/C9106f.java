package p197q1;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.load.resource.bitmap.C4452e;
import java.security.MessageDigest;
import p058d1.C7226k;
import p094g1.C7744c;

/* renamed from: q1.f */
/* compiled from: GifDrawableTransformation */
public class C9106f implements C7226k<C9102c> {

    /* renamed from: b */
    private final C7226k<Bitmap> f13260b;

    /* JADX WARNING: type inference failed for: r1v0, types: [d1.k<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9106f(p058d1.C7226k<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p294z1.C10791j.m22948d(r1)
            d1.k r1 = (p058d1.C7226k) r1
            r0.f13260b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p197q1.C9106f.<init>(d1.k):void");
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        this.f13260b.mo31272a(messageDigest);
    }

    @NonNull
    /* renamed from: b */
    public C7744c<C9102c> mo31430b(@NonNull Context context, @NonNull C7744c<C9102c> cVar, int i, int i2) {
        C9102c cVar2 = cVar.get();
        C4452e eVar = new C4452e(cVar2.mo43332e(), C4362b.m5041c(context).mo31177f());
        C7744c<Bitmap> b = this.f13260b.mo31430b(context, eVar, i, i2);
        if (!eVar.equals(b)) {
            eVar.recycle();
        }
        cVar2.mo43342m(this.f13260b, b.get());
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9106f) {
            return this.f13260b.equals(((C9106f) obj).f13260b);
        }
        return false;
    }

    public int hashCode() {
        return this.f13260b.hashCode();
    }
}
