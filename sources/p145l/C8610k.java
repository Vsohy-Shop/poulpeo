package p145l;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.ProxyConfig;
import androidx.webkit.internal.AssetHelper;
import java.util.Map;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C13143j;
import p080f.C7539e;
import p115i.C8042f;
import p115i.C8056p;
import p115i.C8058q;
import p125j.C8216a;
import p145l.C8606i;
import p195q.C9079b;
import p205r.C9345k;
import p259w.C10070i;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nHttpUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n+ 2 FileSystem.kt\nokio/FileSystem\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n79#2:305\n160#2:306\n80#2:307\n81#2:313\n79#2:334\n160#2:335\n80#2:336\n81#2:342\n79#2:363\n160#2:364\n80#2:365\n81#2:371\n66#2:396\n67#2:402\n52#3,5:308\n60#3,7:314\n57#3,13:321\n52#3,5:337\n60#3,7:343\n57#3,13:350\n52#3,5:366\n60#3,7:372\n57#3,13:379\n64#3:395\n52#3,5:397\n60#3,7:403\n57#3,13:410\n215#4,2:392\n1#5:394\n*S KotlinDebug\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n*L\n162#1:305\n162#1:306\n162#1:307\n162#1:313\n167#1:334\n167#1:335\n167#1:336\n167#1:342\n170#1:363\n170#1:364\n170#1:365\n170#1:371\n255#1:396\n255#1:402\n162#1:308,5\n162#1:314,7\n162#1:321,13\n167#1:337,5\n167#1:343,7\n167#1:350,13\n170#1:366,5\n170#1:372,7\n170#1:379,13\n255#1:395\n255#1:397,5\n255#1:403,7\n255#1:410,13\n190#1:392,2\n*E\n"})
/* renamed from: l.k */
/* compiled from: HttpUriFetcher.kt */
public final class C8610k implements C8606i {

    /* renamed from: f */
    public static final C8611a f12295f = new C8611a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private static final CacheControl f12296g = new CacheControl.Builder().noCache().noStore().build();

    /* renamed from: h */
    private static final CacheControl f12297h = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* renamed from: a */
    private final String f12298a;

    /* renamed from: b */
    private final C9345k f12299b;

    /* renamed from: c */
    private final Lazy<Call.Factory> f12300c;

    /* renamed from: d */
    private final Lazy<C8216a> f12301d;

    /* renamed from: e */
    private final boolean f12302e;

    /* renamed from: l.k$a */
    /* compiled from: HttpUriFetcher.kt */
    public static final class C8611a {
        private C8611a() {
        }

        public /* synthetic */ C8611a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: l.k$b */
    /* compiled from: HttpUriFetcher.kt */
    public static final class C8612b implements C8606i.C8607a<Uri> {

        /* renamed from: a */
        private final Lazy<Call.Factory> f12303a;

        /* renamed from: b */
        private final Lazy<C8216a> f12304b;

        /* renamed from: c */
        private final boolean f12305c;

        public C8612b(Lazy<? extends Call.Factory> lazy, Lazy<? extends C8216a> lazy2, boolean z) {
            this.f12303a = lazy;
            this.f12304b = lazy2;
            this.f12305c = z;
        }

        /* renamed from: c */
        private final boolean m17327c(Uri uri) {
            if (C12775o.m28634d(uri.getScheme(), ProxyConfig.MATCH_HTTP) || C12775o.m28634d(uri.getScheme(), "https")) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public C8606i mo42681a(Uri uri, C9345k kVar, C7539e eVar) {
            if (!m17327c(uri)) {
                return null;
            }
            return new C8610k(uri.toString(), kVar, this.f12303a, this.f12304b, this.f12305c);
        }
    }

    @C12739f(mo50609c = "coil.fetch.HttpUriFetcher", mo50610f = "HttpUriFetcher.kt", mo50611l = {224}, mo50612m = "executeNetworkRequest")
    /* renamed from: l.k$c */
    /* compiled from: HttpUriFetcher.kt */
    static final class C8613c extends C12737d {

        /* renamed from: h */
        /* synthetic */ Object f12306h;

        /* renamed from: i */
        final /* synthetic */ C8610k f12307i;

        /* renamed from: j */
        int f12308j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8613c(C8610k kVar, C12074d<? super C8613c> dVar) {
            super(dVar);
            this.f12307i = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12306h = obj;
            this.f12308j |= Integer.MIN_VALUE;
            return this.f12307i.m17314c((Request) null, this);
        }
    }

    @C12739f(mo50609c = "coil.fetch.HttpUriFetcher", mo50610f = "HttpUriFetcher.kt", mo50611l = {77, 106}, mo50612m = "fetch")
    /* renamed from: l.k$d */
    /* compiled from: HttpUriFetcher.kt */
    static final class C8614d extends C12737d {

        /* renamed from: h */
        Object f12309h;

        /* renamed from: i */
        Object f12310i;

        /* renamed from: j */
        Object f12311j;

        /* renamed from: k */
        /* synthetic */ Object f12312k;

        /* renamed from: l */
        final /* synthetic */ C8610k f12313l;

        /* renamed from: m */
        int f12314m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8614d(C8610k kVar, C12074d<? super C8614d> dVar) {
            super(dVar);
            this.f12313l = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f12312k = obj;
            this.f12314m |= Integer.MIN_VALUE;
            return this.f12313l.mo42680a(this);
        }
    }

    public C8610k(String str, C9345k kVar, Lazy<? extends Call.Factory> lazy, Lazy<? extends C8216a> lazy2, boolean z) {
        this.f12298a = str;
        this.f12299b = kVar;
        this.f12300c = lazy;
        this.f12301d = lazy2;
        this.f12302e = z;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m17314c(okhttp3.Request r5, p355hf.C12074d<? super okhttp3.Response> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p145l.C8610k.C8613c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            l.k$c r0 = (p145l.C8610k.C8613c) r0
            int r1 = r0.f12308j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12308j = r1
            goto L_0x0018
        L_0x0013:
            l.k$c r0 = new l.k$c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f12306h
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f12308j
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p336ef.C11910n.m25701b(r6)
            goto L_0x0072
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p336ef.C11910n.m25701b(r6)
            boolean r6 = p259w.C10070i.m21158r()
            if (r6 == 0) goto L_0x005d
            r.k r6 = r4.f12299b
            r.a r6 = r6.mo43747k()
            boolean r6 = r6.mo43647b()
            if (r6 != 0) goto L_0x0057
            kotlin.Lazy<okhttp3.Call$Factory> r6 = r4.f12300c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = r5.execute()
            goto L_0x0075
        L_0x0057:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L_0x005d:
            kotlin.Lazy<okhttp3.Call$Factory> r6 = r4.f12300c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.f12308j = r3
            java.lang.Object r6 = p259w.C10062b.m21125a(r5, r0)
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L_0x0075:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto L_0x0092
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L_0x0092
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto L_0x008c
            p259w.C10070i.m21144d(r6)
        L_0x008c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L_0x0092:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p145l.C8610k.m17314c(okhttp3.Request, hf.d):java.lang.Object");
    }

    /* renamed from: d */
    private final String m17315d() {
        String h = this.f12299b.mo43743h();
        if (h == null) {
            return this.f12298a;
        }
        return h;
    }

    /* renamed from: e */
    private final C13143j m17316e() {
        C8216a value = this.f12301d.getValue();
        C12775o.m28636f(value);
        return value.getFileSystem();
    }

    /* renamed from: g */
    private final boolean m17317g(Request request, Response response) {
        if (!this.f12299b.mo43745i().mo43648c() || (this.f12302e && !C9079b.f13216c.mo43298b(request, response))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final Request m17318h() {
        Request.Builder headers = new Request.Builder().url(this.f12298a).headers(this.f12299b.mo43746j());
        for (Map.Entry next : this.f12299b.mo43751o().mo43773a().entrySet()) {
            Object key = next.getKey();
            C12775o.m28637g(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag((Class) key, next.getValue());
        }
        boolean b = this.f12299b.mo43745i().mo43647b();
        boolean b2 = this.f12299b.mo43747k().mo43647b();
        if (!b2 && b) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!b2 || b) {
            if (!b2 && !b) {
                headers.cacheControl(f12297h);
            }
        } else if (this.f12299b.mo43745i().mo43648c()) {
            headers.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            headers.cacheControl(f12296g);
        }
        return headers.build();
    }

    /* renamed from: i */
    private final C8216a.C8219c m17319i() {
        C8216a value;
        if (!this.f12299b.mo43745i().mo43647b() || (value = this.f12301d.getValue()) == null) {
            return null;
        }
        return value.mo42128b(m17315d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[Catch:{ IOException -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033 A[Catch:{ IOException -> 0x0034 }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p195q.C9076a m17320j(p125j.C8216a.C8219c r3) {
        /*
            r2 = this;
            r0 = 0
            okio.j r1 = r2.m17316e()     // Catch:{ IOException -> 0x0034 }
            okio.p0 r3 = r3.mo42138g()     // Catch:{ IOException -> 0x0034 }
            okio.y0 r3 = r1.mo50374q(r3)     // Catch:{ IOException -> 0x0034 }
            okio.e r3 = okio.C13145j0.m29739d(r3)     // Catch:{ IOException -> 0x0034 }
            q.a r1 = new q.a     // Catch:{ all -> 0x0020 }
            r1.<init>((okio.C13130e) r3)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            r3.close()     // Catch:{ all -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r3 = move-exception
            goto L_0x002d
        L_0x001e:
            r3 = r0
            goto L_0x002d
        L_0x0020:
            r1 = move-exception
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r3 = move-exception
            p336ef.C11894b.m25683a(r1, r3)     // Catch:{ IOException -> 0x0034 }
        L_0x002b:
            r3 = r1
            r1 = r0
        L_0x002d:
            if (r3 != 0) goto L_0x0033
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ IOException -> 0x0034 }
            return r1
        L_0x0033:
            throw r3     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145l.C8610k.m17320j(j.a$c):q.a");
    }

    /* renamed from: k */
    private final C8042f m17321k(Response response) {
        if (response.networkResponse() != null) {
            return C8042f.NETWORK;
        }
        return C8042f.DISK;
    }

    /* renamed from: l */
    private final C8056p m17322l(C8216a.C8219c cVar) {
        return C8058q.m15840c(cVar.getData(), m17316e(), m17315d(), cVar);
    }

    /* renamed from: m */
    private final C8056p m17323m(ResponseBody responseBody) {
        return C8058q.m15838a(responseBody.source(), this.f12299b.mo43742g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082 A[Catch:{ Exception -> 0x0108, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[Catch:{ Exception -> 0x0108, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bb A[Catch:{ Exception -> 0x0108, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9 A[Catch:{ Exception -> 0x0108, all -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0104 A[SYNTHETIC, Splitter:B:72:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0105 A[Catch:{ Exception -> 0x0108, all -> 0x0106 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p125j.C8216a.C8219c m17324n(p125j.C8216a.C8219c r6, okhttp3.Request r7, okhttp3.Response r8, p195q.C9076a r9) {
        /*
            r5 = this;
            boolean r7 = r5.m17317g(r7, r8)
            r0 = 0
            if (r7 != 0) goto L_0x000d
            if (r6 == 0) goto L_0x000c
            p259w.C10070i.m21144d(r6)
        L_0x000c:
            return r0
        L_0x000d:
            if (r6 == 0) goto L_0x0014
            j.a$b r6 = r6.mo42137D()
            goto L_0x0028
        L_0x0014:
            kotlin.Lazy<j.a> r6 = r5.f12301d
            java.lang.Object r6 = r6.getValue()
            j.a r6 = (p125j.C8216a) r6
            if (r6 == 0) goto L_0x0027
            java.lang.String r7 = r5.m17315d()
            j.a$b r6 = r6.mo42127a(r7)
            goto L_0x0028
        L_0x0027:
            r6 = r0
        L_0x0028:
            if (r6 != 0) goto L_0x002b
            return r0
        L_0x002b:
            int r7 = r8.code()     // Catch:{ Exception -> 0x0108 }
            r1 = 304(0x130, float:4.26E-43)
            r2 = 0
            if (r7 != r1) goto L_0x0088
            if (r9 == 0) goto L_0x0088
            okhttp3.Response$Builder r7 = r8.newBuilder()     // Catch:{ Exception -> 0x0108 }
            q.b$a r1 = p195q.C9079b.f13216c     // Catch:{ Exception -> 0x0108 }
            okhttp3.Headers r9 = r9.mo43289d()     // Catch:{ Exception -> 0x0108 }
            okhttp3.Headers r3 = r8.headers()     // Catch:{ Exception -> 0x0108 }
            okhttp3.Headers r9 = r1.mo43297a(r9, r3)     // Catch:{ Exception -> 0x0108 }
            okhttp3.Response$Builder r7 = r7.headers(r9)     // Catch:{ Exception -> 0x0108 }
            okhttp3.Response r7 = r7.build()     // Catch:{ Exception -> 0x0108 }
            okio.j r9 = r5.m17316e()     // Catch:{ Exception -> 0x0108 }
            okio.p0 r1 = r6.mo42135g()     // Catch:{ Exception -> 0x0108 }
            okio.w0 r9 = r9.mo42170p(r1, r2)     // Catch:{ Exception -> 0x0108 }
            okio.d r9 = okio.C13145j0.m29738c(r9)     // Catch:{ Exception -> 0x0108 }
            q.a r1 = new q.a     // Catch:{ all -> 0x0072 }
            r1.<init>((okhttp3.Response) r7)     // Catch:{ all -> 0x0072 }
            r1.mo43292g(r9)     // Catch:{ all -> 0x0072 }
            ef.v r7 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0072 }
            if (r9 == 0) goto L_0x0080
            r9.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0080
        L_0x0070:
            r0 = move-exception
            goto L_0x0080
        L_0x0072:
            r7 = move-exception
            if (r9 == 0) goto L_0x007d
            r9.close()     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            p336ef.C11894b.m25683a(r7, r9)     // Catch:{ Exception -> 0x0108 }
        L_0x007d:
            r4 = r0
            r0 = r7
            r7 = r4
        L_0x0080:
            if (r0 != 0) goto L_0x0087
            kotlin.jvm.internal.C12775o.m28636f(r7)     // Catch:{ Exception -> 0x0108 }
            goto L_0x00fc
        L_0x0087:
            throw r0     // Catch:{ Exception -> 0x0108 }
        L_0x0088:
            okio.j r7 = r5.m17316e()     // Catch:{ Exception -> 0x0108 }
            okio.p0 r9 = r6.mo42135g()     // Catch:{ Exception -> 0x0108 }
            okio.w0 r7 = r7.mo42170p(r9, r2)     // Catch:{ Exception -> 0x0108 }
            okio.d r7 = okio.C13145j0.m29738c(r7)     // Catch:{ Exception -> 0x0108 }
            q.a r9 = new q.a     // Catch:{ all -> 0x00ac }
            r9.<init>((okhttp3.Response) r8)     // Catch:{ all -> 0x00ac }
            r9.mo43292g(r7)     // Catch:{ all -> 0x00ac }
            ef.v r9 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00aa
            r7.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00aa
        L_0x00a8:
            r7 = move-exception
            goto L_0x00b9
        L_0x00aa:
            r7 = r0
            goto L_0x00b9
        L_0x00ac:
            r9 = move-exception
            if (r7 == 0) goto L_0x00b7
            r7.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r7 = move-exception
            p336ef.C11894b.m25683a(r9, r7)     // Catch:{ Exception -> 0x0108 }
        L_0x00b7:
            r7 = r9
            r9 = r0
        L_0x00b9:
            if (r7 != 0) goto L_0x0105
            kotlin.jvm.internal.C12775o.m28636f(r9)     // Catch:{ Exception -> 0x0108 }
            okio.j r7 = r5.m17316e()     // Catch:{ Exception -> 0x0108 }
            okio.p0 r9 = r6.getData()     // Catch:{ Exception -> 0x0108 }
            okio.w0 r7 = r7.mo42170p(r9, r2)     // Catch:{ Exception -> 0x0108 }
            okio.d r7 = okio.C13145j0.m29738c(r7)     // Catch:{ Exception -> 0x0108 }
            okhttp3.ResponseBody r9 = r8.body()     // Catch:{ all -> 0x00e9 }
            kotlin.jvm.internal.C12775o.m28636f(r9)     // Catch:{ all -> 0x00e9 }
            okio.e r9 = r9.source()     // Catch:{ all -> 0x00e9 }
            long r1 = r9.mo52527h0(r7)     // Catch:{ all -> 0x00e9 }
            java.lang.Long r9 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00e9 }
            if (r7 == 0) goto L_0x00f7
            r7.close()     // Catch:{ all -> 0x00e7 }
            goto L_0x00f7
        L_0x00e7:
            r0 = move-exception
            goto L_0x00f7
        L_0x00e9:
            r9 = move-exception
            if (r7 == 0) goto L_0x00f4
            r7.close()     // Catch:{ all -> 0x00f0 }
            goto L_0x00f4
        L_0x00f0:
            r7 = move-exception
            p336ef.C11894b.m25683a(r9, r7)     // Catch:{ Exception -> 0x0108 }
        L_0x00f4:
            r4 = r0
            r0 = r9
            r9 = r4
        L_0x00f7:
            if (r0 != 0) goto L_0x0104
            kotlin.jvm.internal.C12775o.m28636f(r9)     // Catch:{ Exception -> 0x0108 }
        L_0x00fc:
            j.a$c r6 = r6.mo42133a()     // Catch:{ Exception -> 0x0108 }
            p259w.C10070i.m21144d(r8)
            return r6
        L_0x0104:
            throw r0     // Catch:{ Exception -> 0x0108 }
        L_0x0105:
            throw r7     // Catch:{ Exception -> 0x0108 }
        L_0x0106:
            r6 = move-exception
            goto L_0x010d
        L_0x0108:
            r7 = move-exception
            p259w.C10070i.m21141a(r6)     // Catch:{ all -> 0x0106 }
            throw r7     // Catch:{ all -> 0x0106 }
        L_0x010d:
            p259w.C10070i.m21144d(r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p145l.C8610k.m17324n(j.a$c, okhttp3.Request, okhttp3.Response, q.a):j.a$c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127 A[Catch:{ Exception -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0143 A[Catch:{ Exception -> 0x019a }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo42680a(p355hf.C12074d<? super p145l.C8605h> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof p145l.C8610k.C8614d
            if (r0 == 0) goto L_0x0013
            r0 = r13
            l.k$d r0 = (p145l.C8610k.C8614d) r0
            int r1 = r0.f12314m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f12314m = r1
            goto L_0x0018
        L_0x0013:
            l.k$d r0 = new l.k$d
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f12312k
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f12314m
            r3 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x0047
            if (r2 != r5) goto L_0x003f
            java.lang.Object r1 = r0.f12311j
            okhttp3.Response r1 = (okhttp3.Response) r1
            java.lang.Object r2 = r0.f12310i
            j.a$c r2 = (p125j.C8216a.C8219c) r2
            java.lang.Object r0 = r0.f12309h
            l.k r0 = (p145l.C8610k) r0
            p336ef.C11910n.m25701b(r13)     // Catch:{ Exception -> 0x003c }
            goto L_0x017c
        L_0x003c:
            r13 = move-exception
            goto L_0x019d
        L_0x003f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0047:
            java.lang.Object r2 = r0.f12311j
            q.b r2 = (p195q.C9079b) r2
            java.lang.Object r6 = r0.f12310i
            j.a$c r6 = (p125j.C8216a.C8219c) r6
            java.lang.Object r8 = r0.f12309h
            l.k r8 = (p145l.C8610k) r8
            p336ef.C11910n.m25701b(r13)     // Catch:{ Exception -> 0x005b }
            r11 = r6
            r6 = r2
            r2 = r11
            goto L_0x0113
        L_0x005b:
            r13 = move-exception
            goto L_0x01a7
        L_0x005e:
            p336ef.C11910n.m25701b(r13)
            j.a$c r13 = r12.m17319i()
            if (r13 == 0) goto L_0x00eb
            okio.j r2 = r12.m17316e()     // Catch:{ Exception -> 0x01a4 }
            okio.p0 r8 = r13.mo42138g()     // Catch:{ Exception -> 0x01a4 }
            okio.i r2 = r2.mo52649l(r8)     // Catch:{ Exception -> 0x01a4 }
            java.lang.Long r2 = r2.mo52637d()     // Catch:{ Exception -> 0x01a4 }
            if (r2 != 0) goto L_0x007a
            goto L_0x0094
        L_0x007a:
            long r8 = r2.longValue()     // Catch:{ Exception -> 0x01a4 }
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0094
            l.m r0 = new l.m     // Catch:{ Exception -> 0x01a4 }
            i.p r1 = r12.m17322l(r13)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r2 = r12.f12298a     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r2 = r12.mo42695f(r2, r7)     // Catch:{ Exception -> 0x01a4 }
            i.f r3 = p115i.C8042f.DISK     // Catch:{ Exception -> 0x01a4 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x01a4 }
            return r0
        L_0x0094:
            boolean r2 = r12.f12302e     // Catch:{ Exception -> 0x01a4 }
            if (r2 == 0) goto L_0x00cf
            q.b$b r2 = new q.b$b     // Catch:{ Exception -> 0x01a4 }
            okhttp3.Request r8 = r12.m17318h()     // Catch:{ Exception -> 0x01a4 }
            q.a r9 = r12.m17320j(r13)     // Catch:{ Exception -> 0x01a4 }
            r2.<init>(r8, r9)     // Catch:{ Exception -> 0x01a4 }
            q.b r2 = r2.mo43300b()     // Catch:{ Exception -> 0x01a4 }
            okhttp3.Request r8 = r2.mo43296b()     // Catch:{ Exception -> 0x01a4 }
            if (r8 != 0) goto L_0x00f8
            q.a r8 = r2.mo43295a()     // Catch:{ Exception -> 0x01a4 }
            if (r8 == 0) goto L_0x00f8
            l.m r0 = new l.m     // Catch:{ Exception -> 0x01a4 }
            i.p r1 = r12.m17322l(r13)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r12.f12298a     // Catch:{ Exception -> 0x01a4 }
            q.a r2 = r2.mo43295a()     // Catch:{ Exception -> 0x01a4 }
            okhttp3.MediaType r2 = r2.mo43287b()     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r2 = r12.mo42695f(r3, r2)     // Catch:{ Exception -> 0x01a4 }
            i.f r3 = p115i.C8042f.DISK     // Catch:{ Exception -> 0x01a4 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x01a4 }
            return r0
        L_0x00cf:
            l.m r0 = new l.m     // Catch:{ Exception -> 0x01a4 }
            i.p r1 = r12.m17322l(r13)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r2 = r12.f12298a     // Catch:{ Exception -> 0x01a4 }
            q.a r3 = r12.m17320j(r13)     // Catch:{ Exception -> 0x01a4 }
            if (r3 == 0) goto L_0x00e1
            okhttp3.MediaType r7 = r3.mo43287b()     // Catch:{ Exception -> 0x01a4 }
        L_0x00e1:
            java.lang.String r2 = r12.mo42695f(r2, r7)     // Catch:{ Exception -> 0x01a4 }
            i.f r3 = p115i.C8042f.DISK     // Catch:{ Exception -> 0x01a4 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x01a4 }
            return r0
        L_0x00eb:
            q.b$b r2 = new q.b$b     // Catch:{ Exception -> 0x01a4 }
            okhttp3.Request r8 = r12.m17318h()     // Catch:{ Exception -> 0x01a4 }
            r2.<init>(r8, r7)     // Catch:{ Exception -> 0x01a4 }
            q.b r2 = r2.mo43300b()     // Catch:{ Exception -> 0x01a4 }
        L_0x00f8:
            okhttp3.Request r8 = r2.mo43296b()     // Catch:{ Exception -> 0x01a4 }
            kotlin.jvm.internal.C12775o.m28636f(r8)     // Catch:{ Exception -> 0x01a4 }
            r0.f12309h = r12     // Catch:{ Exception -> 0x01a4 }
            r0.f12310i = r13     // Catch:{ Exception -> 0x01a4 }
            r0.f12311j = r2     // Catch:{ Exception -> 0x01a4 }
            r0.f12314m = r6     // Catch:{ Exception -> 0x01a4 }
            java.lang.Object r6 = r12.m17314c(r8, r0)     // Catch:{ Exception -> 0x01a4 }
            if (r6 != r1) goto L_0x010e
            return r1
        L_0x010e:
            r8 = r12
            r11 = r2
            r2 = r13
            r13 = r6
            r6 = r11
        L_0x0113:
            okhttp3.Response r13 = (okhttp3.Response) r13     // Catch:{ Exception -> 0x01a1 }
            okhttp3.ResponseBody r9 = p259w.C10070i.m21165y(r13)     // Catch:{ Exception -> 0x01a1 }
            okhttp3.Request r10 = r6.mo43296b()     // Catch:{ Exception -> 0x019a }
            q.a r6 = r6.mo43295a()     // Catch:{ Exception -> 0x019a }
            j.a$c r2 = r8.m17324n(r2, r10, r13, r6)     // Catch:{ Exception -> 0x019a }
            if (r2 == 0) goto L_0x0143
            l.m r0 = new l.m     // Catch:{ Exception -> 0x019a }
            i.p r1 = r8.m17322l(r2)     // Catch:{ Exception -> 0x019a }
            java.lang.String r3 = r8.f12298a     // Catch:{ Exception -> 0x019a }
            q.a r4 = r8.m17320j(r2)     // Catch:{ Exception -> 0x019a }
            if (r4 == 0) goto L_0x0139
            okhttp3.MediaType r7 = r4.mo43287b()     // Catch:{ Exception -> 0x019a }
        L_0x0139:
            java.lang.String r3 = r8.mo42695f(r3, r7)     // Catch:{ Exception -> 0x019a }
            i.f r4 = p115i.C8042f.NETWORK     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x019a }
            return r0
        L_0x0143:
            long r6 = r9.contentLength()     // Catch:{ Exception -> 0x019a }
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0163
            l.m r0 = new l.m     // Catch:{ Exception -> 0x019a }
            i.p r1 = r8.m17323m(r9)     // Catch:{ Exception -> 0x019a }
            java.lang.String r3 = r8.f12298a     // Catch:{ Exception -> 0x019a }
            okhttp3.MediaType r4 = r9.contentType()     // Catch:{ Exception -> 0x019a }
            java.lang.String r3 = r8.mo42695f(r3, r4)     // Catch:{ Exception -> 0x019a }
            i.f r4 = r8.m17321k(r13)     // Catch:{ Exception -> 0x019a }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x019a }
            return r0
        L_0x0163:
            p259w.C10070i.m21144d(r13)     // Catch:{ Exception -> 0x019a }
            okhttp3.Request r3 = r8.m17318h()     // Catch:{ Exception -> 0x019a }
            r0.f12309h = r8     // Catch:{ Exception -> 0x019a }
            r0.f12310i = r2     // Catch:{ Exception -> 0x019a }
            r0.f12311j = r13     // Catch:{ Exception -> 0x019a }
            r0.f12314m = r5     // Catch:{ Exception -> 0x019a }
            java.lang.Object r0 = r8.m17314c(r3, r0)     // Catch:{ Exception -> 0x019a }
            if (r0 != r1) goto L_0x0179
            return r1
        L_0x0179:
            r1 = r13
            r13 = r0
            r0 = r8
        L_0x017c:
            okhttp3.Response r13 = (okhttp3.Response) r13     // Catch:{ Exception -> 0x003c }
            okhttp3.ResponseBody r1 = p259w.C10070i.m21165y(r13)     // Catch:{ Exception -> 0x019a }
            l.m r3 = new l.m     // Catch:{ Exception -> 0x019a }
            i.p r4 = r0.m17323m(r1)     // Catch:{ Exception -> 0x019a }
            java.lang.String r5 = r0.f12298a     // Catch:{ Exception -> 0x019a }
            okhttp3.MediaType r1 = r1.contentType()     // Catch:{ Exception -> 0x019a }
            java.lang.String r1 = r0.mo42695f(r5, r1)     // Catch:{ Exception -> 0x019a }
            i.f r0 = r0.m17321k(r13)     // Catch:{ Exception -> 0x019a }
            r3.<init>(r4, r1, r0)     // Catch:{ Exception -> 0x019a }
            return r3
        L_0x019a:
            r0 = move-exception
            r1 = r13
            r13 = r0
        L_0x019d:
            p259w.C10070i.m21144d(r1)     // Catch:{ Exception -> 0x01a1 }
            throw r13     // Catch:{ Exception -> 0x01a1 }
        L_0x01a1:
            r13 = move-exception
            r6 = r2
            goto L_0x01a7
        L_0x01a4:
            r0 = move-exception
            r6 = r13
            r13 = r0
        L_0x01a7:
            if (r6 == 0) goto L_0x01ac
            p259w.C10070i.m21144d(r6)
        L_0x01ac:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p145l.C8610k.mo42680a(hf.d):java.lang.Object");
    }

    @VisibleForTesting
    /* renamed from: f */
    public final String mo42695f(String str, MediaType mediaType) {
        String str2;
        String j;
        if (mediaType != null) {
            str2 = mediaType.toString();
        } else {
            str2 = null;
        }
        if ((str2 == null || C13754v.m31525E(str2, AssetHelper.DEFAULT_MIME_TYPE, false, 2, (Object) null)) && (j = C10070i.m21150j(MimeTypeMap.getSingleton(), str)) != null) {
            return j;
        }
        if (str2 != null) {
            return C13755w.m31553J0(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }
}
