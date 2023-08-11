package p043c0;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import com.appboy.C4149R;
import com.appboy.Constants;
import com.appboy.models.cards.Card;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p042bo.app.C3169h;
import p069e0.C7358a;
import p126j0.C8233a;
import p126j0.C8242b;
import p126j0.C8266c;
import p281y.C10606a;
import p292z.C10734d;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13933b1;
import p466yf.C13970h;
import p466yf.C13988j2;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: c0.a */
public final class C3840a implements C3864b {

    /* renamed from: f */
    public static final C3842b f2854f = new C3842b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f2855g = C8266c.m16405n(C3840a.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ReentrantLock f2856a = new ReentrantLock();

    /* renamed from: b */
    private final LruCache<String, Bitmap> f2857b = new C3841a(C8242b.m16361i());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3169h f2858c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f2859d = true;

    /* renamed from: e */
    private boolean f2860e;

    /* renamed from: c0.a$a */
    public static final class C3841a extends LruCache<String, Bitmap> {

        /* renamed from: a */
        final /* synthetic */ int f2861a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3841a(int i) {
            super(i);
            this.f2861a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(bitmap, "image");
            return bitmap.getByteCount();
        }
    }

    /* renamed from: c0.a$b */
    public static final class C3842b {
        public /* synthetic */ C3842b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final File mo29867a(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "uniqueName");
            return new File(context.getCacheDir().getPath() + File.separator + str);
        }

        private C3842b() {
        }
    }

    /* renamed from: c0.a$c */
    static final class C3843c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2862g;

        /* renamed from: h */
        final /* synthetic */ C3840a f2863h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3843c(String str, C3840a aVar) {
            super(0);
            this.f2862g = str;
            this.f2863h = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Got bitmap from mem cache for key " + this.f2862g + "\nMemory cache stats: " + this.f2863h.mo29862o();
        }
    }

    /* renamed from: c0.a$d */
    static final class C3844d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2864g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3844d(String str) {
            super(0);
            this.f2864g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Got bitmap from disk cache for key ", this.f2864g);
        }
    }

    /* renamed from: c0.a$e */
    static final class C3845e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2865g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3845e(String str) {
            super(0);
            this.f2865g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("No cache hit for bitmap: ", this.f2865g);
        }
    }

    /* renamed from: c0.a$f */
    static final class C3846f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2866g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3846f(String str) {
            super(0);
            this.f2866g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Disk cache still starting. Cannot retrieve key from disk cache: ", this.f2866g);
        }
    }

    /* renamed from: c0.a$g */
    static final class C3847g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2867g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3847g(String str) {
            super(0);
            this.f2867g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Getting bitmap from disk cache for key: ", this.f2867g);
        }
    }

    /* renamed from: c0.a$h */
    static final class C3848h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C3848h f2868g = new C3848h();

        C3848h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with blank image url";
        }
    }

    /* renamed from: c0.a$i */
    static final class C3849i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C3849i f2869g = new C3849i();

        C3849i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cache is currently in offline mode. Not downloading bitmap.";
        }
    }

    /* renamed from: c0.a$j */
    static final class C3850j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2870g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3850j(String str) {
            super(0);
            this.f2870g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to get bitmap from url. Url: ", this.f2870g);
        }
    }

    @C12739f(mo50609c = "com.braze.images.DefaultBrazeImageLoader$initDiskCacheTask$1", mo50610f = "DefaultBrazeImageLoader.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: c0.a$k */
    static final class C3851k extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f2871h;

        /* renamed from: i */
        final /* synthetic */ Context f2872i;

        /* renamed from: j */
        final /* synthetic */ C3840a f2873j;

        /* renamed from: c0.a$k$a */
        static final class C3852a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C3852a f2874g = new C3852a();

            C3852a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Initializing disk cache";
            }
        }

        /* renamed from: c0.a$k$b */
        static final class C3853b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C3853b f2875g = new C3853b();

            C3853b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Disk cache initialized";
            }
        }

        /* renamed from: c0.a$k$c */
        static final class C3854c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C3854c f2876g = new C3854c();

            C3854c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Caught exception creating new disk cache. Unable to create new disk cache";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3851k(Context context, C3840a aVar, C12074d<? super C3851k> dVar) {
            super(2, dVar);
            this.f2872i = context;
            this.f2873j = aVar;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3851k) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3851k(this.f2872i, this.f2873j, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f2871h == 0) {
                C11910n.m25701b(obj);
                File a = C3840a.f2854f.mo29867a(this.f2872i, "appboy.imageloader.lru.cache");
                ReentrantLock f = this.f2873j.f2856a;
                C3840a aVar = this.f2873j;
                f.lock();
                try {
                    C8266c cVar = C8266c.f11641a;
                    C8266c.m16397f(cVar, C3840a.f2855g, (C8266c.C8267a) null, (Throwable) null, false, C3852a.f2874g, 14, (Object) null);
                    aVar.f2858c = new C3169h(a, 1, 1, 52428800);
                    C8266c.m16397f(cVar, C3840a.f2855g, (C8266c.C8267a) null, (Throwable) null, false, C3853b.f2875g, 14, (Object) null);
                    aVar.f2859d = false;
                } catch (Exception e) {
                    C8266c.m16397f(C8266c.f11641a, C3840a.f2855g, C8266c.C8267a.f11649e, e, false, C3854c.f2876g, 8, (Object) null);
                } catch (Throwable th) {
                    f.unlock();
                    throw th;
                }
                C11921v vVar = C11921v.f18618a;
                f.unlock();
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: c0.a$l */
    static final class C3855l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2877g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3855l(String str) {
            super(0);
            this.f2877g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Adding bitmap to mem cache for key ", this.f2877g);
        }
    }

    /* renamed from: c0.a$m */
    static final class C3856m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2878g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3856m(String str) {
            super(0);
            this.f2878g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Skipping disk cache for key: ", this.f2878g);
        }
    }

    /* renamed from: c0.a$n */
    static final class C3857n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2879g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3857n(String str) {
            super(0);
            this.f2879g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Adding bitmap to disk cache for key ", this.f2879g);
        }
    }

    /* renamed from: c0.a$o */
    static final class C3858o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C3858o f2880g = new C3858o();

        C3858o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with a blank image url";
        }
    }

    /* renamed from: c0.a$p */
    static final class C3859p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f2881g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3859p(String str) {
            super(0);
            this.f2881g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to render url into view. Url: ", this.f2881g);
        }
    }

    @C12739f(mo50609c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1", mo50610f = "DefaultBrazeImageLoader.kt", mo50611l = {249}, mo50612m = "invokeSuspend")
    /* renamed from: c0.a$q */
    static final class C3860q extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f2882h;

        /* renamed from: i */
        final /* synthetic */ C3840a f2883i;

        /* renamed from: j */
        final /* synthetic */ Context f2884j;

        /* renamed from: k */
        final /* synthetic */ String f2885k;

        /* renamed from: l */
        final /* synthetic */ C10734d f2886l;

        /* renamed from: m */
        final /* synthetic */ ImageView f2887m;

        /* renamed from: c0.a$q$a */
        static final class C3861a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f2888g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3861a(String str) {
                super(0);
                this.f2888g = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Failed to retrieve bitmap from url: ", this.f2888g);
            }
        }

        @C12739f(mo50609c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1$2", mo50610f = "DefaultBrazeImageLoader.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: c0.a$q$b */
        static final class C3862b extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f2889h;

            /* renamed from: i */
            final /* synthetic */ String f2890i;

            /* renamed from: j */
            final /* synthetic */ ImageView f2891j;

            /* renamed from: k */
            final /* synthetic */ Bitmap f2892k;

            /* renamed from: l */
            final /* synthetic */ C10734d f2893l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3862b(String str, ImageView imageView, Bitmap bitmap, C10734d dVar, C12074d<? super C3862b> dVar2) {
                super(2, dVar2);
                this.f2890i = str;
                this.f2891j = imageView;
                this.f2892k = bitmap;
                this.f2893l = dVar;
            }

            /* renamed from: a */
            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C3862b) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C3862b(this.f2890i, this.f2891j, this.f2892k, this.f2893l, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f2889h == 0) {
                    C11910n.m25701b(obj);
                    String str = this.f2890i;
                    Object tag = this.f2891j.getTag(C4149R.string.com_braze_image_lru_cache_image_url_key);
                    if (tag != null) {
                        if (C12775o.m28634d(str, (String) tag)) {
                            this.f2891j.setImageBitmap(this.f2892k);
                            if (this.f2893l == C10734d.BASE_CARD_VIEW) {
                                C8242b.m16366n(this.f2892k, this.f2891j);
                            }
                        }
                        return C11921v.f18618a;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3860q(C3840a aVar, Context context, String str, C10734d dVar, ImageView imageView, C12074d<? super C3860q> dVar2) {
            super(2, dVar2);
            this.f2883i = aVar;
            this.f2884j = context;
            this.f2885k = str;
            this.f2886l = dVar;
            this.f2887m = imageView;
        }

        /* renamed from: a */
        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C3860q) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C3860q(this.f2883i, this.f2884j, this.f2885k, this.f2886l, this.f2887m, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f2882h;
            if (i == 0) {
                C11910n.m25701b(obj);
                TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
                Bitmap n = this.f2883i.mo29861n(this.f2884j, this.f2885k, this.f2886l);
                if (n == null) {
                    C8266c.m16397f(C8266c.f11641a, C3840a.f2855g, (C8266c.C8267a) null, (Throwable) null, false, new C3861a(this.f2885k), 14, (Object) null);
                } else {
                    C13988j2 c2 = C13933b1.m32212c();
                    C3862b bVar = new C3862b(this.f2885k, this.f2887m, n, this.f2886l, (C12074d<? super C3862b>) null);
                    this.f2882h = 1;
                    if (C13970h.m32378g(c2, bVar, this) == c) {
                        return c;
                    }
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }
    }

    /* renamed from: c0.a$r */
    static final class C3863r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ boolean f2894g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3863r(boolean z) {
            super(0);
            this.f2894g = z;
        }

        /* renamed from: a */
        public final String invoke() {
            String str;
            if (this.f2894g) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            return C12775o.m28647q("DefaultBrazeImageLoader outbound network requests are now ", str);
        }
    }

    public C3840a(Context context) {
        C12775o.m28639i(context, "context");
        m4231p(context);
    }

    /* renamed from: p */
    private final void m4231p(Context context) {
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3851k(context, this, (C12074d<? super C3851k>) null), 3, (Object) null);
    }

    /* renamed from: s */
    private final Bitmap m4232s(String str, Bitmap bitmap) {
        return this.f2857b.put(str, bitmap);
    }

    /* renamed from: t */
    private final void m4233t(Context context, String str, ImageView imageView, C10734d dVar) {
        String str2 = str;
        if (C13754v.m31532t(str)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3858o.f2880g, 7, (Object) null);
            return;
        }
        try {
            m4234u(context, imageView, dVar, str2);
        } catch (Throwable th) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, new C3859p(str2), 4, (Object) null);
        }
    }

    /* renamed from: u */
    private final void m4234u(Context context, ImageView imageView, C10734d dVar, String str) {
        imageView.setTag(C4149R.string.com_braze_image_lru_cache_image_url_key, str);
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C3860q(this, context, str, dVar, imageView, (C12074d<? super C3860q>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public void mo29852a(Context context, Card card, String str, ImageView imageView, C10734d dVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(card, "card");
        C12775o.m28639i(str, "imageUrl");
        C12775o.m28639i(imageView, "imageView");
        m4233t(context, str, imageView, dVar);
    }

    /* renamed from: b */
    public Bitmap mo29853b(Context context, Bundle bundle, String str, C10734d dVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "imageUrl");
        return mo29861n(context, str, dVar);
    }

    /* renamed from: c */
    public void mo29854c(Context context, C7358a aVar, String str, ImageView imageView, C10734d dVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(str, "imageUrl");
        C12775o.m28639i(imageView, "imageView");
        m4233t(context, str, imageView, dVar);
    }

    /* renamed from: d */
    public void mo29855d(boolean z) {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3863r(z), 6, (Object) null);
        this.f2860e = z;
    }

    /* renamed from: e */
    public Bitmap mo29856e(Context context, C7358a aVar, String str, C10734d dVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(str, "imageUrl");
        return mo29861n(context, str, dVar);
    }

    /* renamed from: j */
    public final Bitmap mo29857j(Context context, Uri uri, C10734d dVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, "imageUri");
        if (dVar == null) {
            dVar = C10734d.NO_BOUNDS;
        }
        return C8242b.m16355c(context, uri, dVar);
    }

    /* renamed from: k */
    public final Bitmap mo29858k(String str) {
        C12775o.m28639i(str, "key");
        Bitmap bitmap = this.f2857b.get(str);
        if (bitmap == null) {
            Bitmap l = mo29859l(str);
            if (l == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3845e(str), 7, (Object) null);
                return null;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3844d(str), 6, (Object) null);
            m4232s(str, l);
            return l;
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3843c(str, this), 6, (Object) null);
        return bitmap;
    }

    /* renamed from: l */
    public final Bitmap mo29859l(String str) {
        C12775o.m28639i(str, "key");
        ReentrantLock reentrantLock = this.f2856a;
        reentrantLock.lock();
        try {
            C3169h hVar = null;
            if (mo29863q()) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3846f(str), 6, (Object) null);
            } else {
                C3169h hVar2 = this.f2858c;
                if (hVar2 == null) {
                    C12775o.m28656z("diskLruCache");
                    hVar2 = null;
                }
                if (hVar2.mo28949a(str)) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3847g(str), 6, (Object) null);
                    C3169h hVar3 = this.f2858c;
                    if (hVar3 == null) {
                        C12775o.m28656z("diskLruCache");
                    } else {
                        hVar = hVar3;
                    }
                    Bitmap b = hVar.mo28950b(str);
                    reentrantLock.unlock();
                    return b;
                }
            }
            C11921v vVar = C11921v.f18618a;
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final Bitmap mo29860m(String str) {
        C12775o.m28639i(str, "key");
        return this.f2857b.get(str);
    }

    /* renamed from: n */
    public final Bitmap mo29861n(Context context, String str, C10734d dVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "imageUrl");
        if (C13754v.m31532t(str)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3848h.f2868g, 7, (Object) null);
            return null;
        }
        try {
            Bitmap k = mo29858k(str);
            if (k != null) {
                return k;
            }
            if (this.f2860e) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3849i.f2869g, 7, (Object) null);
            } else {
                Uri parse = Uri.parse(str);
                C12775o.m28638h(parse, "imageUri");
                Bitmap j = mo29857j(context, parse, dVar);
                if (j != null) {
                    mo29864r(str, j, C8233a.m16343e(parse));
                    return j;
                }
            }
            return null;
        } catch (Throwable th) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, new C3850j(str), 4, (Object) null);
        }
    }

    /* renamed from: o */
    public final LruCache<String, Bitmap> mo29862o() {
        return this.f2857b;
    }

    /* renamed from: q */
    public final boolean mo29863q() {
        return this.f2859d;
    }

    /* renamed from: r */
    public final void mo29864r(String str, Bitmap bitmap, boolean z) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(bitmap, "bitmap");
        if (mo29860m(str) == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3855l(str), 7, (Object) null);
            this.f2857b.put(str, bitmap);
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3856m(str), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.f2856a;
        reentrantLock.lock();
        try {
            if (!mo29863q()) {
                C3169h hVar = this.f2858c;
                C3169h hVar2 = null;
                if (hVar == null) {
                    C12775o.m28656z("diskLruCache");
                    hVar = null;
                }
                if (!hVar.mo28949a(str)) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3857n(str), 7, (Object) null);
                    C3169h hVar3 = this.f2858c;
                    if (hVar3 == null) {
                        C12775o.m28656z("diskLruCache");
                    } else {
                        hVar2 = hVar3;
                    }
                    hVar2.mo28948a(str, bitmap);
                }
            }
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
