package androidx.webkit.internal;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;

public class AssetHelper {
    public static final String DEFAULT_MIME_TYPE = "text/plain";
    private static final String TAG = "AssetHelper";
    @NonNull
    private Context mContext;

    public AssetHelper(@NonNull Context context) {
        this.mContext = context;
    }

    @NonNull
    public static String getCanonicalDirPath(@NonNull File file) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    @Nullable
    public static File getCanonicalFileIfChild(@NonNull File file, @NonNull String str) {
        String canonicalDirPath = getCanonicalDirPath(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(canonicalDirPath)) {
            return new File(canonicalPath);
        }
        return null;
    }

    @NonNull
    public static File getDataDir(@NonNull Context context) {
        return context.getDataDir();
    }

    private int getFieldId(@NonNull String str, @NonNull String str2) {
        return this.mContext.getResources().getIdentifier(str2, str, this.mContext.getPackageName());
    }

    private int getValueType(int i) {
        TypedValue typedValue = new TypedValue();
        this.mContext.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    @NonNull
    public static String guessMimeType(@NonNull String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName == null) {
            return DEFAULT_MIME_TYPE;
        }
        return guessContentTypeFromName;
    }

    @NonNull
    private static InputStream handleSvgzStream(@NonNull String str, @NonNull InputStream inputStream) {
        if (str.endsWith(".svgz")) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    @NonNull
    public static InputStream openFile(@NonNull File file) {
        return handleSvgzStream(file.getPath(), new FileInputStream(file));
    }

    @NonNull
    private static String removeLeadingSlash(@NonNull String str) {
        if (str.length() <= 1 || str.charAt(0) != '/') {
            return str;
        }
        return str.substring(1);
    }

    @NonNull
    public InputStream openAsset(@NonNull String str) {
        String removeLeadingSlash = removeLeadingSlash(str);
        return handleSvgzStream(removeLeadingSlash, this.mContext.getAssets().open(removeLeadingSlash, 2));
    }

    @NonNull
    public InputStream openResource(@NonNull String str) {
        String removeLeadingSlash = removeLeadingSlash(str);
        String[] split = removeLeadingSlash.split("/", -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            int fieldId = getFieldId(str2, str3);
            int valueType = getValueType(fieldId);
            if (valueType == 3) {
                return handleSvgzStream(removeLeadingSlash, this.mContext.getResources().openRawResource(fieldId));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", new Object[]{removeLeadingSlash, Integer.valueOf(valueType)}));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + removeLeadingSlash);
    }
}
