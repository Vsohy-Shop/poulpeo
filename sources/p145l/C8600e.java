package p145l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.VisibleForTesting;
import java.io.InputStream;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13145j0;
import p080f.C7539e;
import p115i.C8041e;
import p115i.C8042f;
import p115i.C8058q;
import p145l.C8606i;
import p205r.C9345k;
import p215s.C9406c;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nContentUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentUriFetcher.kt\ncoil/fetch/ContentUriFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* renamed from: l.e */
/* compiled from: ContentUriFetcher.kt */
public final class C8600e implements C8606i {

    /* renamed from: a */
    private final Uri f12287a;

    /* renamed from: b */
    private final C9345k f12288b;

    /* renamed from: l.e$a */
    /* compiled from: ContentUriFetcher.kt */
    public static final class C8601a implements C8606i.C8607a<Uri> {
        /* renamed from: c */
        private final boolean m17299c(Uri uri) {
            return C12775o.m28634d(uri.getScheme(), "content");
        }

        /* renamed from: b */
        public C8606i mo42681a(Uri uri, C9345k kVar, C7539e eVar) {
            if (!m17299c(uri)) {
                return null;
            }
            return new C8600e(uri, kVar);
        }
    }

    public C8600e(Uri uri, C9345k kVar) {
        this.f12287a = uri;
        this.f12288b = kVar;
    }

    /* renamed from: d */
    private final Bundle m17295d() {
        C9406c.C9407a aVar;
        C9406c.C9407a aVar2;
        C9406c b = this.f12288b.mo43750n().mo43835b();
        if (b instanceof C9406c.C9407a) {
            aVar = (C9406c.C9407a) b;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        int i = aVar.f13981a;
        C9406c a = this.f12288b.mo43750n().mo43834a();
        if (a instanceof C9406c.C9407a) {
            aVar2 = (C9406c.C9407a) a;
        } else {
            aVar2 = null;
        }
        if (aVar2 == null) {
            return null;
        }
        int i2 = aVar2.f13981a;
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
        return bundle;
    }

    /* renamed from: a */
    public Object mo42680a(C12074d<? super C8605h> dVar) {
        ContentResolver contentResolver = this.f12288b.mo43742g().getContentResolver();
        InputStream inputStream = null;
        if (mo42685b(this.f12287a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f12287a, "r");
            if (openAssetFileDescriptor != null) {
                inputStream = openAssetFileDescriptor.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f12287a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !mo42686c(this.f12287a)) {
            inputStream = contentResolver.openInputStream(this.f12287a);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f12287a + "'.").toString());
            }
        } else {
            AssetFileDescriptor a = contentResolver.openTypedAssetFile(this.f12287a, "image/*", m17295d(), (CancellationSignal) null);
            if (a != null) {
                inputStream = a.createInputStream();
            }
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f12287a + "'.").toString());
            }
        }
        return new C8618m(C8058q.m15839b(C13145j0.m29739d(C13145j0.m29747l(inputStream)), this.f12288b.mo43742g(), new C8041e(this.f12287a)), contentResolver.getType(this.f12287a), C8042f.DISK);
    }

    @VisibleForTesting
    /* renamed from: b */
    public final boolean mo42685b(Uri uri) {
        if (!C12775o.m28634d(uri.getAuthority(), "com.android.contacts") || !C12775o.m28634d(uri.getLastPathSegment(), "display_photo")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r5 = r5.getPathSegments();
     */
    @androidx.annotation.VisibleForTesting
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42686c(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getAuthority()
            java.lang.String r1 = "media"
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.List r5 = r5.getPathSegments()
            int r0 = r5.size()
            r2 = 3
            if (r0 < r2) goto L_0x0036
            int r2 = r0 + -3
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r3 = "audio"
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r2, r3)
            if (r2 == 0) goto L_0x0036
            int r0 = r0 + -2
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r0 = "albums"
            boolean r5 = kotlin.jvm.internal.C12775o.m28634d(r5, r0)
            if (r5 == 0) goto L_0x0036
            r1 = 1
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145l.C8600e.mo42686c(android.net.Uri):boolean");
    }
}
