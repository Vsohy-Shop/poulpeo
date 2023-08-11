package p070e1;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import java.io.FileNotFoundException;
import java.io.IOException;
import p058d1.C7214a;
import p070e1.C7422d;

/* renamed from: e1.l */
/* compiled from: LocalUriFetcher */
public abstract class C7437l<T> implements C7422d<T> {

    /* renamed from: b */
    private final Uri f10284b;

    /* renamed from: c */
    private final ContentResolver f10285c;

    /* renamed from: d */
    private T f10286d;

    public C7437l(ContentResolver contentResolver, Uri uri) {
        this.f10285c = contentResolver;
        this.f10284b = uri;
    }

    /* renamed from: b */
    public void mo41074b() {
        T t = this.f10286d;
        if (t != null) {
            try {
                mo41070c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo41070c(T t);

    @NonNull
    /* renamed from: d */
    public C7214a mo41077d() {
        return C7214a.LOCAL;
    }

    /* renamed from: e */
    public final void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super T> aVar) {
        try {
            T f = mo41071f(this.f10284b, this.f10285c);
            this.f10286d = f;
            aVar.mo31271f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo31269c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo41071f(Uri uri, ContentResolver contentResolver);

    public void cancel() {
    }
}
