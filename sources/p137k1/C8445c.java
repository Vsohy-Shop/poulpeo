package p137k1;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p058d1.C7217d;
import p058d1.C7222g;
import p294z1.C10778a;

/* renamed from: k1.c */
/* compiled from: ByteBufferEncoder */
public class C8445c implements C7217d<ByteBuffer> {
    /* renamed from: c */
    public boolean mo31397a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull C7222g gVar) {
        try {
            C10778a.m22921e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
