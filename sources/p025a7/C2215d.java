package p025a7;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: a7.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C2215d implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }
}
