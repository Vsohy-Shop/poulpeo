package p070e1;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import java.io.IOException;
import p058d1.C7214a;
import p070e1.C7422d;

/* renamed from: e1.b */
/* compiled from: AssetPathFetcher */
public abstract class C7420b<T> implements C7422d<T> {

    /* renamed from: b */
    private final String f10260b;

    /* renamed from: c */
    private final AssetManager f10261c;

    /* renamed from: d */
    private T f10262d;

    public C7420b(AssetManager assetManager, String str) {
        this.f10261c = assetManager;
        this.f10260b = str;
    }

    /* renamed from: b */
    public void mo41074b() {
        T t = this.f10262d;
        if (t != null) {
            try {
                mo41075c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo41075c(T t);

    @NonNull
    /* renamed from: d */
    public C7214a mo41077d() {
        return C7214a.LOCAL;
    }

    /* renamed from: e */
    public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super T> aVar) {
        try {
            T f = mo41079f(this.f10261c, this.f10260b);
            this.f10262d = f;
            aVar.mo31271f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo31269c(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract T mo41079f(AssetManager assetManager, String str);

    public void cancel() {
    }
}
