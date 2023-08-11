package p137k1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;
import p058d1.C7222g;
import p137k1.C8476n;

/* renamed from: k1.u */
/* compiled from: StringLoader */
public class C8494u<Data> implements C8476n<String, Data> {

    /* renamed from: a */
    private final C8476n<Uri, Data> f12103a;

    /* renamed from: k1.u$a */
    /* compiled from: StringLoader */
    public static final class C8495a implements C8478o<String, AssetFileDescriptor> {
        /* renamed from: b */
        public C8476n<String, AssetFileDescriptor> mo42462b(@NonNull C8484r rVar) {
            return new C8494u(rVar.mo42520d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: k1.u$b */
    /* compiled from: StringLoader */
    public static class C8496b implements C8478o<String, ParcelFileDescriptor> {
        @NonNull
        /* renamed from: b */
        public C8476n<String, ParcelFileDescriptor> mo42462b(@NonNull C8484r rVar) {
            return new C8494u(rVar.mo42520d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: k1.u$c */
    /* compiled from: StringLoader */
    public static class C8497c implements C8478o<String, InputStream> {
        @NonNull
        /* renamed from: b */
        public C8476n<String, InputStream> mo42462b(@NonNull C8484r rVar) {
            return new C8494u(rVar.mo42520d(Uri.class, InputStream.class));
        }
    }

    public C8494u(C8476n<Uri, Data> nVar) {
        this.f12103a = nVar;
    }

    @Nullable
    /* renamed from: e */
    private static Uri m17019e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m17020f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return m17020f(str);
        }
        return parse;
    }

    /* renamed from: f */
    private static Uri m17020f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C8476n.C8477a<Data> mo42458b(@NonNull String str, int i, int i2, @NonNull C7222g gVar) {
        Uri e = m17019e(str);
        if (e == null || !this.f12103a.mo42457a(e)) {
            return null;
        }
        return this.f12103a.mo42458b(e, i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull String str) {
        return true;
    }
}
