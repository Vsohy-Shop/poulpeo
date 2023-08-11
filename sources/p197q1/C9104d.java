package p197q1;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import p058d1.C7216c;
import p058d1.C7222g;
import p058d1.C7225j;
import p094g1.C7744c;
import p294z1.C10778a;

/* renamed from: q1.d */
/* compiled from: GifDrawableEncoder */
public class C9104d implements C7225j<C9102c> {
    @NonNull
    /* renamed from: b */
    public C7216c mo31398b(@NonNull C7222g gVar) {
        return C7216c.SOURCE;
    }

    /* renamed from: c */
    public boolean mo31397a(@NonNull C7744c<C9102c> cVar, @NonNull File file, @NonNull C7222g gVar) {
        try {
            C10778a.m22921e(cVar.get().mo43330c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
