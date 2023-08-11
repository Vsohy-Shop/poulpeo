package androidx.core.net;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.C12775o;

/* compiled from: Uri.kt */
public final class UriKt {
    public static final File toFile(Uri uri) {
        C12775o.m28639i(uri, "<this>");
        if (C12775o.m28634d(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    public static final Uri toUri(String str) {
        C12775o.m28639i(str, "<this>");
        Uri parse = Uri.parse(str);
        C12775o.m28638h(parse, "parse(this)");
        return parse;
    }

    public static final Uri toUri(File file) {
        C12775o.m28639i(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        C12775o.m28638h(fromFile, "fromFile(this)");
        return fromFile;
    }
}
