package com.squareup.okhttp.internal.p325io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.C13145j0;
import okio.C13175w0;
import okio.C13179y0;

/* renamed from: com.squareup.okhttp.internal.io.FileSystem */
public interface FileSystem {
    public static final FileSystem SYSTEM = new FileSystem() {
        public C13175w0 appendingSink(File file) {
            try {
                return C13145j0.m29736a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C13145j0.m29736a(file);
            }
        }

        public void delete(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        public void deleteContents(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        public boolean exists(File file) {
            return file.exists();
        }

        public void rename(File file, File file2) {
            delete(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        public C13175w0 sink(File file) {
            try {
                return C13145j0.m29741f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C13145j0.m29741f(file);
            }
        }

        public long size(File file) {
            return file.length();
        }

        public C13179y0 source(File file) {
            return C13145j0.m29746k(file);
        }
    };

    C13175w0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    C13175w0 sink(File file);

    long size(File file);

    C13179y0 source(File file);
}
