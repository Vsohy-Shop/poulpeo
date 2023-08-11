package androidx.compose.p002ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.res.ImageVectorCache */
/* compiled from: VectorResources.android.kt */
public final class ImageVectorCache {
    private final HashMap<Key, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.res.ImageVectorCache$ImageVectorEntry */
    /* compiled from: VectorResources.android.kt */
    public static final class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;
        private final ImageVector imageVector;

        public ImageVectorEntry(ImageVector imageVector2, int i) {
            C12775o.m28639i(imageVector2, "imageVector");
            this.imageVector = imageVector2;
            this.configFlags = i;
        }

        public static /* synthetic */ ImageVectorEntry copy$default(ImageVectorEntry imageVectorEntry, ImageVector imageVector2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                imageVector2 = imageVectorEntry.imageVector;
            }
            if ((i2 & 2) != 0) {
                i = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector2, i);
        }

        public final ImageVector component1() {
            return this.imageVector;
        }

        public final int component2() {
            return this.configFlags;
        }

        public final ImageVectorEntry copy(ImageVector imageVector2, int i) {
            C12775o.m28639i(imageVector2, "imageVector");
            return new ImageVectorEntry(imageVector2, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            if (C12775o.m28634d(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags) {
                return true;
            }
            return false;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }

        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + Integer.hashCode(this.configFlags);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.res.ImageVectorCache$Key */
    /* compiled from: VectorResources.android.kt */
    public static final class Key {
        public static final int $stable = 8;

        /* renamed from: id */
        private final int f377id;
        private final Resources.Theme theme;

        public Key(Resources.Theme theme2, int i) {
            C12775o.m28639i(theme2, "theme");
            this.theme = theme2;
            this.f377id = i;
        }

        public static /* synthetic */ Key copy$default(Key key, Resources.Theme theme2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                theme2 = key.theme;
            }
            if ((i2 & 2) != 0) {
                i = key.f377id;
            }
            return key.copy(theme2, i);
        }

        public final Resources.Theme component1() {
            return this.theme;
        }

        public final int component2() {
            return this.f377id;
        }

        public final Key copy(Resources.Theme theme2, int i) {
            C12775o.m28639i(theme2, "theme");
            return new Key(theme2, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (C12775o.m28634d(this.theme, key.theme) && this.f377id == key.f377id) {
                return true;
            }
            return false;
        }

        public final int getId() {
            return this.f377id;
        }

        public final Resources.Theme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + Integer.hashCode(this.f377id);
        }

        public String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.f377id + ')';
        }
    }

    public final void clear() {
        this.map.clear();
    }

    public final ImageVectorEntry get(Key key) {
        C12775o.m28639i(key, "key");
        WeakReference weakReference = this.map.get(key);
        if (weakReference != null) {
            return (ImageVectorEntry) weakReference.get();
        }
        return null;
    }

    public final void prune(int i) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Key, WeakReference<ImageVectorEntry>> next = it.next();
            C12775o.m28638h(next, "it.next()");
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) ((WeakReference) next.getValue()).get();
            if (imageVectorEntry == null || Configuration.needNewResources(i, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(Key key, ImageVectorEntry imageVectorEntry) {
        C12775o.m28639i(key, "key");
        C12775o.m28639i(imageVectorEntry, "imageVectorEntry");
        this.map.put(key, new WeakReference(imageVectorEntry));
    }
}
