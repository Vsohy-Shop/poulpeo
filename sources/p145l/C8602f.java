package p145l;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7539e;
import p115i.C8042f;
import p145l.C8606i;
import p205r.C9345k;
import p259w.C10070i;
import p259w.C10073k;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nDrawableFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableFetcher.kt\ncoil/fetch/DrawableFetcher\n+ 2 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 3 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,42:1\n45#2:43\n28#3:44\n*S KotlinDebug\n*F\n+ 1 DrawableFetcher.kt\ncoil/fetch/DrawableFetcher\n*L\n26#1:43\n26#1:44\n*E\n"})
/* renamed from: l.f */
/* compiled from: DrawableFetcher.kt */
public final class C8602f implements C8606i {

    /* renamed from: a */
    private final Drawable f12289a;

    /* renamed from: b */
    private final C9345k f12290b;

    /* renamed from: l.f$a */
    /* compiled from: DrawableFetcher.kt */
    public static final class C8603a implements C8606i.C8607a<Drawable> {
        /* renamed from: b */
        public C8606i mo42681a(Drawable drawable, C9345k kVar, C7539e eVar) {
            return new C8602f(drawable, kVar);
        }
    }

    public C8602f(Drawable drawable, C9345k kVar) {
        this.f12289a = drawable;
        this.f12290b = kVar;
    }

    /* renamed from: a */
    public Object mo42680a(C12074d<? super C8605h> dVar) {
        Drawable drawable;
        boolean u = C10070i.m21161u(this.f12289a);
        if (u) {
            drawable = new BitmapDrawable(this.f12290b.mo43742g().getResources(), C10073k.f15222a.mo44647a(this.f12289a, this.f12290b.mo43741f(), this.f12290b.mo43750n(), this.f12290b.mo43749m(), this.f12290b.mo43737c()));
        } else {
            drawable = this.f12289a;
        }
        return new C8604g(drawable, u, C8042f.MEMORY);
    }
}
