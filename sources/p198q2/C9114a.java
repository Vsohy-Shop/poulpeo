package p198q2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.a */
/* compiled from: AttributionIdentifiers.kt */
public final class C9114a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f13290f = C9114a.class.getCanonicalName();

    /* renamed from: g */
    public static C9114a f13291g;

    /* renamed from: h */
    public static final C9115a f13292h = new C9115a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f13293a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f13294b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f13295c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f13296d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f13297e;

    /* renamed from: q2.a$a */
    /* compiled from: AttributionIdentifiers.kt */
    public static final class C9115a {
        private C9115a() {
        }

        public /* synthetic */ C9115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final C9114a m18558a(C9114a aVar) {
            aVar.f13294b = System.currentTimeMillis();
            C9114a.f13291g = aVar;
            return aVar;
        }

        /* renamed from: b */
        private final C9114a m18559b(Context context) {
            C9114a c = m18560c(context);
            if (c != null) {
                return c;
            }
            C9114a d = m18561d(context);
            if (d == null) {
                return new C9114a();
            }
            return d;
        }

        /* renamed from: c */
        private final C9114a m18560c(Context context) {
            Object L;
            try {
                if (!m18563g(context)) {
                    return null;
                }
                boolean z = false;
                Method D = C9138d0.m18602D("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (!(D == null || (L = C9138d0.m18610L((Object) null, D, context)) == null)) {
                    Method C = C9138d0.m18601C(L.getClass(), "getId", new Class[0]);
                    Method C2 = C9138d0.m18601C(L.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (C != null) {
                        if (C2 != null) {
                            C9114a aVar = new C9114a();
                            aVar.f13293a = (String) C9138d0.m18610L(L, C, new Object[0]);
                            Boolean bool = (Boolean) C9138d0.m18610L(L, C2, new Object[0]);
                            if (bool != null) {
                                z = bool.booleanValue();
                            }
                            aVar.f13297e = z;
                            return aVar;
                        }
                    }
                }
                return null;
            } catch (Exception e) {
                C9138d0.m18624Z("android_id", e);
                return null;
            }
        }

        /* renamed from: d */
        private final C9114a m18561d(Context context) {
            C9118c cVar = new C9118c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, cVar, 1)) {
                    try {
                        C9116b bVar = new C9116b(cVar.mo43384a());
                        C9114a aVar = new C9114a();
                        aVar.f13293a = bVar.mo43381E();
                        aVar.f13297e = bVar.mo43382G();
                        return aVar;
                    } catch (Exception e) {
                        C9138d0.m18624Z("android_id", e);
                    } finally {
                        context.unbindService(cVar);
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* renamed from: f */
        private final String m18562f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        /* renamed from: g */
        private final boolean m18563g(Context context) {
            Method D = C9138d0.m18602D("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (D == null) {
                return false;
            }
            Object L = C9138d0.m18610L((Object) null, D, context);
            if (!(L instanceof Integer) || (!C12775o.m28634d(L, 0))) {
                return false;
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0080 A[Catch:{ Exception -> 0x00f2, all -> 0x00f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[Catch:{ Exception -> 0x00f2, all -> 0x00f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ Exception -> 0x00f2, all -> 0x00f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0116  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p198q2.C9114a mo43379e(android.content.Context r13) {
            /*
                r12 = this;
                java.lang.String r0 = "limit_tracking"
                java.lang.String r1 = "androidid"
                java.lang.String r2 = "aid"
                java.lang.String r3 = "context"
                kotlin.jvm.internal.C12775o.m28639i(r13, r3)
                q2.a r3 = r12.m18559b(r13)
                r4 = 0
                android.os.Looper r5 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                boolean r5 = kotlin.jvm.internal.C12775o.m28634d(r5, r6)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                if (r5 != 0) goto L_0x00e8
                q2.a r5 = p198q2.C9114a.f13291g     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                if (r5 == 0) goto L_0x0033
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                long r8 = r5.f13294b     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                long r6 = r6 - r8
                r8 = 3600000(0x36ee80, double:1.7786363E-317)
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 >= 0) goto L_0x0033
                return r5
            L_0x0033:
                java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                java.lang.String r6 = "com.facebook.katana.provider.AttributionIdProvider"
                r8 = 0
                android.content.pm.ProviderInfo r5 = r5.resolveContentProvider(r6, r8)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                android.content.pm.PackageManager r6 = r13.getPackageManager()     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                java.lang.String r9 = "com.facebook.wakizashi.provider.AttributionIdProvider"
                android.content.pm.ProviderInfo r6 = r6.resolveContentProvider(r9, r8)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                if (r5 == 0) goto L_0x0063
                java.lang.String r5 = r5.packageName     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                java.lang.String r8 = "contentProviderInfo.packageName"
                kotlin.jvm.internal.C12775o.m28638h(r5, r8)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                boolean r5 = p198q2.C9163j.m18750a(r13, r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                if (r5 == 0) goto L_0x0063
                java.lang.String r5 = "content://com.facebook.katana.provider.AttributionIdProvider"
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
            L_0x0061:
                r6 = r5
                goto L_0x007a
            L_0x0063:
                if (r6 == 0) goto L_0x0079
                java.lang.String r5 = r6.packageName     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                java.lang.String r6 = "wakizashiProviderInfo.packageName"
                kotlin.jvm.internal.C12775o.m28638h(r5, r6)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                boolean r5 = p198q2.C9163j.m18750a(r13, r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                if (r5 == 0) goto L_0x0079
                java.lang.String r5 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                goto L_0x0061
            L_0x0079:
                r6 = r4
            L_0x007a:
                java.lang.String r5 = r12.m18562f(r13)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                if (r5 == 0) goto L_0x0083
                r3.f13296d = r5     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
            L_0x0083:
                if (r6 != 0) goto L_0x008a
                q2.a r13 = r12.m18558a(r3)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                return r13
            L_0x008a:
                android.content.ContentResolver r5 = r13.getContentResolver()     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                r8 = 0
                r9 = 0
                r10 = 0
                android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                if (r13 == 0) goto L_0x00de
                boolean r5 = r13.moveToFirst()     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r5 != 0) goto L_0x009e
                goto L_0x00de
            L_0x009e:
                int r2 = r13.getColumnIndex(r2)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                int r1 = r13.getColumnIndex(r1)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                int r0 = r13.getColumnIndex(r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                java.lang.String r2 = r13.getString(r2)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                r3.f13295c = r2     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r1 <= 0) goto L_0x00cd
                if (r0 <= 0) goto L_0x00cd
                java.lang.String r2 = r3.mo43375h()     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r2 != 0) goto L_0x00cd
                java.lang.String r1 = r13.getString(r1)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                r3.f13293a = r1     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                r3.f13297e = r0     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
            L_0x00cd:
                r13.close()
                q2.a r13 = r12.m18558a(r3)
                return r13
            L_0x00d5:
                r0 = move-exception
                r4 = r13
                r13 = r0
                goto L_0x0114
            L_0x00d9:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
                goto L_0x00f4
            L_0x00de:
                q2.a r0 = r12.m18558a(r3)     // Catch:{ Exception -> 0x00d9, all -> 0x00d5 }
                if (r13 == 0) goto L_0x00e7
                r13.close()
            L_0x00e7:
                return r0
            L_0x00e8:
                com.facebook.FacebookException r13 = new com.facebook.FacebookException     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                java.lang.String r0 = "getAttributionIdentifiers cannot be called on the main thread."
                r13.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
                throw r13     // Catch:{ Exception -> 0x00f2, all -> 0x00f0 }
            L_0x00f0:
                r13 = move-exception
                goto L_0x0114
            L_0x00f2:
                r13 = move-exception
                r0 = r4
            L_0x00f4:
                java.lang.String r1 = p198q2.C9114a.f13290f     // Catch:{ all -> 0x0112 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
                r2.<init>()     // Catch:{ all -> 0x0112 }
                java.lang.String r3 = "Caught unexpected exception in getAttributionId(): "
                r2.append(r3)     // Catch:{ all -> 0x0112 }
                r2.append(r13)     // Catch:{ all -> 0x0112 }
                java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0112 }
                p198q2.C9138d0.m18626a0(r1, r13)     // Catch:{ all -> 0x0112 }
                if (r0 == 0) goto L_0x0111
                r0.close()
            L_0x0111:
                return r4
            L_0x0112:
                r13 = move-exception
                r4 = r0
            L_0x0114:
                if (r4 == 0) goto L_0x0119
                r4.close()
            L_0x0119:
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p198q2.C9114a.C9115a.mo43379e(android.content.Context):q2.a");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: h */
        public final boolean mo43380h(Context context) {
            C12775o.m28639i(context, "context");
            C9114a e = mo43379e(context);
            if (e == null || !e.mo43378l()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: q2.a$b */
    /* compiled from: AttributionIdentifiers.kt */
    private static final class C9116b implements IInterface {

        /* renamed from: b */
        public static final C9117a f13298b = new C9117a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final IBinder f13299a;

        /* renamed from: q2.a$b$a */
        /* compiled from: AttributionIdentifiers.kt */
        public static final class C9117a {
            private C9117a() {
            }

            public /* synthetic */ C9117a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C9116b(IBinder iBinder) {
            C12775o.m28639i(iBinder, "binder");
            this.f13299a = iBinder;
        }

        /* renamed from: E */
        public final String mo43381E() {
            Parcel obtain = Parcel.obtain();
            C12775o.m28638h(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            C12775o.m28638h(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f13299a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: G */
        public final boolean mo43382G() {
            Parcel obtain = Parcel.obtain();
            C12775o.m28638h(obtain, "Parcel.obtain()");
            Parcel obtain2 = Parcel.obtain();
            C12775o.m28638h(obtain2, "Parcel.obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f13299a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f13299a;
        }
    }

    /* renamed from: k */
    public static final C9114a m18553k(Context context) {
        return f13292h.mo43379e(context);
    }

    /* renamed from: h */
    public final String mo43375h() {
        if (!FacebookSdk.isInitialized() || !FacebookSdk.getAdvertiserIDCollectionEnabled()) {
            return null;
        }
        return this.f13293a;
    }

    /* renamed from: i */
    public final String mo43376i() {
        return this.f13296d;
    }

    /* renamed from: j */
    public final String mo43377j() {
        return this.f13295c;
    }

    /* renamed from: l */
    public final boolean mo43378l() {
        return this.f13297e;
    }

    /* renamed from: q2.a$c */
    /* compiled from: AttributionIdentifiers.kt */
    private static final class C9118c implements ServiceConnection {

        /* renamed from: b */
        private final AtomicBoolean f13300b = new AtomicBoolean(false);

        /* renamed from: c */
        private final BlockingQueue<IBinder> f13301c = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder mo43384a() {
            if (!this.f13300b.compareAndSet(true, true)) {
                IBinder take = this.f13301c.take();
                C12775o.m28638h(take, "queue.take()");
                return take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f13301c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
