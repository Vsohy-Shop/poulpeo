package kotlin.p379io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C12775o;
import p392mf.C12942c;

/* renamed from: kotlin.io.FileSystemException */
/* compiled from: Exceptions.kt */
public class FileSystemException extends IOException {

    /* renamed from: b */
    private final File f20400b;

    /* renamed from: c */
    private final File f20401c;

    /* renamed from: d */
    private final String f20402d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(C12942c.m29246a(file, file2, str));
        C12775o.m28639i(file, "file");
        this.f20400b = file;
        this.f20401c = file2;
        this.f20402d = str;
    }
}
