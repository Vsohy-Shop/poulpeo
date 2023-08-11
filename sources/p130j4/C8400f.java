package p130j4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.C4882e;
import p150l4.C8675b;

/* renamed from: j4.f */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8400f extends AsyncTask {

    /* renamed from: c */
    private static final C8675b f11955c = new C8675b("FetchBitmapTask");
    @Nullable

    /* renamed from: a */
    private final C8403i f11956a;

    /* renamed from: b */
    private final C8396b f11957b;

    public C8400f(Context context, int i, int i2, boolean z, long j, int i3, int i4, int i5, C8396b bVar, byte[] bArr) {
        this.f11957b = bVar;
        this.f11956a = C4882e.m6937e(context.getApplicationContext(), this, new C8399e(this, (C8398d) null), i, i2, false, 2097152, 5, 333, 10000);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        C8403i iVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (iVar = this.f11956a) == null) {
            return null;
        }
        try {
            return iVar.mo42421m0(uri);
        } catch (RemoteException e) {
            f11955c.mo42755b(e, "Unable to call %s on %s.", "doFetch", C8403i.class.getSimpleName());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C8396b bVar = this.f11957b;
        if (bVar != null) {
            bVar.mo42415b(bitmap);
        }
    }
}
