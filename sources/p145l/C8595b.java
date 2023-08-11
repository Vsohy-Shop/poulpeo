package p145l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.SourceDebugExtension;
import p080f.C7539e;
import p115i.C8042f;
import p145l.C8606i;
import p205r.C9345k;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nBitmapFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFetcher.kt\ncoil/fetch/BitmapFetcher\n+ 2 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 3 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,29:1\n45#2:30\n28#3:31\n*S KotlinDebug\n*F\n+ 1 BitmapFetcher.kt\ncoil/fetch/BitmapFetcher\n*L\n16#1:30\n16#1:31\n*E\n"})
/* renamed from: l.b */
/* compiled from: BitmapFetcher.kt */
public final class C8595b implements C8606i {

    /* renamed from: a */
    private final Bitmap f12283a;

    /* renamed from: b */
    private final C9345k f12284b;

    /* renamed from: l.b$a */
    /* compiled from: BitmapFetcher.kt */
    public static final class C8596a implements C8606i.C8607a<Bitmap> {
        /* renamed from: b */
        public C8606i mo42681a(Bitmap bitmap, C9345k kVar, C7539e eVar) {
            return new C8595b(bitmap, kVar);
        }
    }

    public C8595b(Bitmap bitmap, C9345k kVar) {
        this.f12283a = bitmap;
        this.f12284b = kVar;
    }

    /* renamed from: a */
    public Object mo42680a(C12074d<? super C8605h> dVar) {
        return new C8604g(new BitmapDrawable(this.f12284b.mo43742g().getResources(), this.f12283a), false, C8042f.MEMORY);
    }
}
