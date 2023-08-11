package p145l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13145j0;
import p080f.C7539e;
import p115i.C8042f;
import p115i.C8058q;
import p115i.C8061r;
import p145l.C8606i;
import p205r.C9345k;
import p259w.C10064d;
import p259w.C10070i;
import p259w.C10073k;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nResourceUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 4 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,100:1\n1#2:101\n45#3:102\n28#4:103\n*S KotlinDebug\n*F\n+ 1 ResourceUriFetcher.kt\ncoil/fetch/ResourceUriFetcher\n*L\n58#1:102\n58#1:103\n*E\n"})
/* renamed from: l.l */
/* compiled from: ResourceUriFetcher.kt */
public final class C8615l implements C8606i {

    /* renamed from: c */
    public static final C8616a f12315c = new C8616a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Uri f12316a;

    /* renamed from: b */
    private final C9345k f12317b;

    /* renamed from: l.l$a */
    /* compiled from: ResourceUriFetcher.kt */
    public static final class C8616a {
        private C8616a() {
        }

        public /* synthetic */ C8616a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: l.l$b */
    /* compiled from: ResourceUriFetcher.kt */
    public static final class C8617b implements C8606i.C8607a<Uri> {
        /* renamed from: c */
        private final boolean m17332c(Uri uri) {
            return C12775o.m28634d(uri.getScheme(), "android.resource");
        }

        /* renamed from: b */
        public C8606i mo42681a(Uri uri, C9345k kVar, C7539e eVar) {
            if (!m17332c(uri)) {
                return null;
            }
            return new C8615l(uri, kVar);
        }
    }

    public C8615l(Uri uri, C9345k kVar) {
        this.f12316a = uri;
        this.f12317b = kVar;
    }

    /* renamed from: b */
    private final Void m17330b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    /* renamed from: a */
    public Object mo42680a(C12074d<? super C8605h> dVar) {
        Integer j;
        Resources resources;
        Drawable drawable;
        String authority = this.f12316a.getAuthority();
        if (authority != null) {
            if (!(!C13754v.m31532t(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) C12686e0.m28232k0(this.f12316a.getPathSegments());
                if (str == null || (j = C13753u.m31517j(str)) == null) {
                    m17330b(this.f12316a);
                    throw new KotlinNothingValueException();
                }
                int intValue = j.intValue();
                Context g = this.f12317b.mo43742g();
                if (C12775o.m28634d(authority, g.getPackageName())) {
                    resources = g.getResources();
                } else {
                    resources = g.getPackageManager().getResourcesForApplication(authority);
                }
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String j2 = C10070i.m21150j(MimeTypeMap.getSingleton(), charSequence.subSequence(C13755w.m31575a0(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (C12775o.m28634d(j2, "text/xml")) {
                    if (C12775o.m28634d(authority, g.getPackageName())) {
                        drawable = C10064d.m21128a(g, intValue);
                    } else {
                        drawable = C10064d.m21131d(g, resources, intValue);
                    }
                    Drawable drawable2 = drawable;
                    boolean u = C10070i.m21161u(drawable2);
                    if (u) {
                        drawable2 = new BitmapDrawable(g.getResources(), C10073k.f15222a.mo44647a(drawable2, this.f12317b.mo43741f(), this.f12317b.mo43750n(), this.f12317b.mo43749m(), this.f12317b.mo43737c()));
                    }
                    return new C8604g(drawable2, u, C8042f.DISK);
                }
                TypedValue typedValue2 = new TypedValue();
                return new C8618m(C8058q.m15839b(C13145j0.m29739d(C13145j0.m29747l(resources.openRawResource(intValue, typedValue2))), g, new C8061r(authority, intValue, typedValue2.density)), j2, C8042f.DISK);
            }
        }
        m17330b(this.f12316a);
        throw new KotlinNothingValueException();
    }
}
