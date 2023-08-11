package p259w;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.WorkerThread;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p115i.C8044h;
import p215s.C9405b;
import p215s.C9413h;
import p215s.C9414i;

@SourceDebugExtension({"SMAP\nDrawableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,96:1\n1#2:97\n219#3:98\n223#3:99\n219#3:105\n223#3:106\n95#4:100\n38#5:101\n49#5:102\n60#5:103\n71#5:104\n*S KotlinDebug\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n*L\n54#1:98\n55#1:99\n89#1:105\n90#1:106\n61#1:100\n63#1:101\n63#1:102\n63#1:103\n63#1:104\n*E\n"})
/* renamed from: w.k */
/* compiled from: DrawableUtils.kt */
public final class C10073k {

    /* renamed from: a */
    public static final C10073k f15222a = new C10073k();

    private C10073k() {
    }

    /* renamed from: b */
    private final boolean m21168b(Bitmap bitmap, Bitmap.Config config) {
        if (bitmap.getConfig() == C10061a.m21124e(config)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m21169c(boolean z, Bitmap bitmap, C9414i iVar, C9413h hVar) {
        int i;
        int i2;
        if (z) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (C9405b.m19458a(iVar)) {
            i = bitmap.getWidth();
        } else {
            i = C10070i.m21140A(iVar.mo43835b(), hVar);
        }
        if (C9405b.m19458a(iVar)) {
            i2 = bitmap.getHeight();
        } else {
            i2 = C10070i.m21140A(iVar.mo43834a(), hVar);
        }
        if (C8044h.m15819c(width, height, i, i2, hVar) == 1.0d) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: a */
    public final Bitmap mo44647a(Drawable drawable, Bitmap.Config config, C9414i iVar, C9413h hVar, boolean z) {
        int i;
        int i2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (m21168b(bitmap, config) && m21169c(z, bitmap, iVar, hVar)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int p = C10070i.m21156p(mutate);
        int i3 = 512;
        if (p <= 0) {
            p = 512;
        }
        int i4 = C10070i.m21149i(mutate);
        if (i4 > 0) {
            i3 = i4;
        }
        if (C9405b.m19458a(iVar)) {
            i = p;
        } else {
            i = C10070i.m21140A(iVar.mo43835b(), hVar);
        }
        if (C9405b.m19458a(iVar)) {
            i2 = i3;
        } else {
            i2 = C10070i.m21140A(iVar.mo43834a(), hVar);
        }
        double c = C8044h.m15819c(p, i3, i, i2, hVar);
        int b = C13265c.m30133b(((double) p) * c);
        int b2 = C13265c.m30133b(c * ((double) i3));
        Bitmap createBitmap = Bitmap.createBitmap(b, b2, C10061a.m21124e(config));
        C12775o.m28638h(createBitmap, "createBitmap(width, height, config)");
        Rect bounds = mutate.getBounds();
        int i5 = bounds.left;
        int i6 = bounds.top;
        int i7 = bounds.right;
        int i8 = bounds.bottom;
        mutate.setBounds(0, 0, b, b2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i5, i6, i7, i8);
        return createBitmap;
    }
}
