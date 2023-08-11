package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n11670#2,3:156\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:156,3\n*E\n"})
/* renamed from: okio.s */
/* compiled from: JvmSystemFileSystem.kt */
public class C13164s extends C13143j {
    /* renamed from: r */
    private final List<C13158p0> m29824r(C13158p0 p0Var, boolean z) {
        File file = p0Var.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C12775o.m28638h(str, "it");
                arrayList.add(p0Var.mo52691i(str));
            }
            C12664a0.m28171z(arrayList);
            return arrayList;
        } else if (!z) {
            return null;
        } else {
            if (!file.exists()) {
                throw new FileNotFoundException("no such file: " + p0Var);
            }
            throw new IOException("failed to list " + p0Var);
        }
    }

    /* renamed from: s */
    private final void m29825s(C13158p0 p0Var) {
        if (mo52648j(p0Var)) {
            throw new IOException(p0Var + " already exists.");
        }
    }

    /* renamed from: t */
    private final void m29826t(C13158p0 p0Var) {
        if (!mo52648j(p0Var)) {
            throw new IOException(p0Var + " doesn't exist.");
        }
    }

    /* renamed from: b */
    public C13175w0 mo50367b(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        if (z) {
            m29826t(p0Var);
        }
        return C13145j0.m29742g(p0Var.toFile(), true);
    }

    /* renamed from: c */
    public void mo50368c(C13158p0 p0Var, C13158p0 p0Var2) {
        C12775o.m28639i(p0Var, APIParams.SOURCE);
        C12775o.m28639i(p0Var2, TypedValues.AttributesType.S_TARGET);
        if (!p0Var.toFile().renameTo(p0Var2.toFile())) {
            throw new IOException("failed to move " + p0Var + " to " + p0Var2);
        }
    }

    /* renamed from: g */
    public void mo50369g(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "dir");
        if (!p0Var.toFile().mkdir()) {
            C13141i m = mo50372m(p0Var);
            boolean z2 = false;
            if (m != null && m.mo52639f()) {
                z2 = true;
            }
            if (!z2) {
                throw new IOException("failed to create directory: " + p0Var);
            } else if (z) {
                throw new IOException(p0Var + " already exist.");
            }
        }
    }

    /* renamed from: i */
    public void mo50370i(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "path");
        if (!Thread.interrupted()) {
            File file = p0Var.toFile();
            if (file.delete()) {
                return;
            }
            if (file.exists()) {
                throw new IOException("failed to delete " + p0Var);
            } else if (z) {
                throw new FileNotFoundException("no such file: " + p0Var);
            }
        } else {
            throw new InterruptedIOException("interrupted");
        }
    }

    /* renamed from: k */
    public List<C13158p0> mo50371k(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "dir");
        List<C13158p0> r = m29824r(p0Var, true);
        C12775o.m28636f(r);
        return r;
    }

    /* renamed from: m */
    public C13141i mo50372m(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "path");
        File file = p0Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C13141i(isFile, isDirectory, (C13158p0) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null, (Map) null, 128, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public C13138h mo50373n(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        return new C13162r(false, new RandomAccessFile(p0Var.toFile(), "r"));
    }

    /* renamed from: p */
    public C13175w0 mo42170p(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        if (z) {
            m29825s(p0Var);
        }
        return C13147k0.m29767h(p0Var.toFile(), false, 1, (Object) null);
    }

    /* renamed from: q */
    public C13179y0 mo50374q(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        return C13145j0.m29746k(p0Var.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
