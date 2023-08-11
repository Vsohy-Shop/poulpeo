package androidx.core.util;

import android.util.AtomicFile;
import androidx.annotation.RequiresApi;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p454wf.C13726d;

/* compiled from: AtomicFile.kt */
public final class AtomicFileKt {
    @RequiresApi(17)
    public static final byte[] readBytes(AtomicFile atomicFile) {
        C12775o.m28639i(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        C12775o.m28638h(readFully, "readFully()");
        return readFully;
    }

    @RequiresApi(17)
    public static final String readText(AtomicFile atomicFile, Charset charset) {
        C12775o.m28639i(atomicFile, "<this>");
        C12775o.m28639i(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        C12775o.m28638h(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String readText$default(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C13726d.f22152b;
        }
        return readText(atomicFile, charset);
    }

    @RequiresApi(17)
    public static final void tryWrite(AtomicFile atomicFile, Function1<? super FileOutputStream, C11921v> function1) {
        C12775o.m28639i(atomicFile, "<this>");
        C12775o.m28639i(function1, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            C12775o.m28638h(startWrite, "stream");
            function1.invoke(startWrite);
            C12773m.m28629b(1);
            atomicFile.finishWrite(startWrite);
            C12773m.m28628a(1);
        } catch (Throwable th) {
            C12773m.m28629b(1);
            atomicFile.failWrite(startWrite);
            C12773m.m28628a(1);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeBytes(AtomicFile atomicFile, byte[] bArr) {
        C12775o.m28639i(atomicFile, "<this>");
        C12775o.m28639i(bArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            C12775o.m28638h(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @RequiresApi(17)
    public static final void writeText(AtomicFile atomicFile, String str, Charset charset) {
        C12775o.m28639i(atomicFile, "<this>");
        C12775o.m28639i(str, "text");
        C12775o.m28639i(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C12775o.m28638h(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C13726d.f22152b;
        }
        writeText(atomicFile, str, charset);
    }
}
