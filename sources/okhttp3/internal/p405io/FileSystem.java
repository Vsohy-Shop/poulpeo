package okhttp3.internal.p405io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.C12775o;
import okio.C13145j0;
import okio.C13175w0;
import okio.C13179y0;

/* renamed from: okhttp3.internal.io.FileSystem */
/* compiled from: FileSystem.kt */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* renamed from: okhttp3.internal.io.FileSystem$Companion */
    /* compiled from: FileSystem.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: okhttp3.internal.io.FileSystem$Companion$SystemFileSystem */
        /* compiled from: FileSystem.kt */
        private static final class SystemFileSystem implements FileSystem {
            public C13175w0 appendingSink(File file) {
                C12775o.m28639i(file, "file");
                try {
                    return C13145j0.m29736a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C13145j0.m29736a(file);
                }
            }

            public void delete(File file) {
                C12775o.m28639i(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(C12775o.m28647q("failed to delete ", file));
                }
            }

            public void deleteContents(File file) {
                C12775o.m28639i(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        i++;
                        if (file2.isDirectory()) {
                            C12775o.m28638h(file2, "file");
                            deleteContents(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException(C12775o.m28647q("failed to delete ", file2));
                        }
                    }
                    return;
                }
                throw new IOException(C12775o.m28647q("not a readable directory: ", file));
            }

            public boolean exists(File file) {
                C12775o.m28639i(file, "file");
                return file.exists();
            }

            public void rename(File file, File file2) {
                C12775o.m28639i(file, TypedValues.TransitionType.S_FROM);
                C12775o.m28639i(file2, TypedValues.TransitionType.S_TO);
                delete(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            public C13175w0 sink(File file) {
                C12775o.m28639i(file, "file");
                try {
                    return C13147k0.m29767h(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C13147k0.m29767h(file, false, 1, (Object) null);
                }
            }

            public long size(File file) {
                C12775o.m28639i(file, "file");
                return file.length();
            }

            public C13179y0 source(File file) {
                C12775o.m28639i(file, "file");
                return C13145j0.m29746k(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    C13175w0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    C13175w0 sink(File file);

    long size(File file);

    C13179y0 source(File file);
}
