package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13158p0;

@SourceDebugExtension({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/* renamed from: okio.i0 */
/* compiled from: NioSystemFileSystem.kt */
public final class C13142i0 extends C13164s {
    /* renamed from: u */
    private final Long m29716u(FileTime fileTime) {
        boolean z;
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return valueOf;
        }
        return null;
    }

    /* renamed from: c */
    public void mo50368c(C13158p0 p0Var, C13158p0 p0Var2) {
        C12775o.m28639i(p0Var, APIParams.SOURCE);
        C12775o.m28639i(p0Var2, TypedValues.AttributesType.S_TARGET);
        try {
            Path unused = Files.move(p0Var.mo52694k(), p0Var2.mo52694k(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        } catch (UnsupportedOperationException unused2) {
            throw new IOException("atomic move not supported");
        }
    }

    /* renamed from: m */
    public C13141i mo50372m(C13158p0 p0Var) {
        Path path;
        C13158p0 p0Var2;
        Long l;
        Long l2;
        C12775o.m28639i(p0Var, "path");
        Path k = p0Var.mo52694k();
        Long l3 = null;
        try {
            BasicFileAttributes a = Files.readAttributes(k, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            if (a.isSymbolicLink()) {
                path = Files.readSymbolicLink(k);
            } else {
                path = null;
            }
            boolean a2 = a.isRegularFile();
            boolean a3 = a.isDirectory();
            if (path != null) {
                p0Var2 = C13158p0.C13159a.m29808f(C13158p0.f20947c, path, false, 1, (Object) null);
            } else {
                p0Var2 = null;
            }
            Long valueOf = Long.valueOf(a.size());
            FileTime a4 = a.creationTime();
            if (a4 != null) {
                l = m29716u(a4);
            } else {
                l = null;
            }
            FileTime a5 = a.lastModifiedTime();
            if (a5 != null) {
                l2 = m29716u(a5);
            } else {
                l2 = null;
            }
            FileTime a6 = a.lastAccessTime();
            if (a6 != null) {
                l3 = m29716u(a6);
            }
            return new C13141i(a2, a3, p0Var2, valueOf, l, l2, l3, (Map) null, 128, (DefaultConstructorMarker) null);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    public String toString() {
        return "NioSystemFileSystem";
    }
}
