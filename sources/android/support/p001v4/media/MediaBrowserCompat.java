package android.support.p001v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p001v4.media.session.C0084b;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import androidx.media.MediaBrowserProtocol;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005b.C1995b;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: b */
    static final boolean f12b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    private final C0028d f13a;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends C1995b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo53a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m166r(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends C1995b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo53a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.m166r(bundle);
            }
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    private static class C0023a {
        @DoNotInline
        /* renamed from: a */
        static MediaDescription m17a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        /* renamed from: b */
        static int m18b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    private static class C0024b extends Handler {

        /* renamed from: a */
        private final WeakReference<C0032h> f16a;

        /* renamed from: b */
        private WeakReference<Messenger> f17b;

        C0024b(C0032h hVar) {
            this.f16a = new WeakReference<>(hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo61a(Messenger messenger) {
            this.f17b = new WeakReference<>(messenger);
        }

        public void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.f17b;
            if (weakReference != null && weakReference.get() != null && this.f16a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.m163a(data);
                C0032h hVar = this.f16a.get();
                Messenger messenger = this.f17b.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        MediaSessionCompat.m163a(bundle);
                        hVar.mo76a(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (MediaSessionCompat.Token) data.getParcelable(MediaBrowserProtocol.DATA_MEDIA_SESSION_TOKEN), bundle);
                    } else if (i == 2) {
                        hVar.mo78g(messenger);
                    } else if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                        MediaSessionCompat.m163a(bundle2);
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS);
                        MediaSessionCompat.m163a(bundle3);
                        hVar.mo77d(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        hVar.mo78g(messenger);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    interface C0028d {
        @NonNull
        /* renamed from: b */
        MediaSessionCompat.Token mo73b();

        /* renamed from: c */
        void mo74c();

        /* renamed from: f */
        void mo75f();
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0030f extends C0029e {
        C0030f(Context context, ComponentName componentName, C0025c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    @RequiresApi(26)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0031g extends C0030f {
        C0031g(Context context, ComponentName componentName, C0025c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    interface C0032h {
        /* renamed from: a */
        void mo76a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        /* renamed from: d */
        void mo77d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        /* renamed from: g */
        void mo78g(Messenger messenger);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    private static class C0033i {

        /* renamed from: a */
        private Messenger f29a;

        /* renamed from: b */
        private Bundle f30b;

        public C0033i(IBinder iBinder, Bundle bundle) {
            this.f29a = new Messenger(iBinder);
            this.f30b = bundle;
        }

        /* renamed from: b */
        private void m38b(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f29a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo79a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.f30b);
            m38b(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo80c(Messenger messenger) {
            m38b(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    private static class C0034j {

        /* renamed from: a */
        private final List<C0035k> f31a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f32b = new ArrayList();

        /* renamed from: a */
        public C0035k mo81a(Bundle bundle) {
            for (int i = 0; i < this.f32b.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.f32b.get(i), bundle)) {
                    return this.f31a.get(i);
                }
            }
            return null;
        }

        /* renamed from: b */
        public List<C0035k> mo82b() {
            return this.f31a;
        }

        /* renamed from: c */
        public List<Bundle> mo83c() {
            return this.f32b;
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0025c cVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13a = new C0031g(context, componentName, cVar, bundle);
        } else {
            this.f13a = new C0030f(context, componentName, cVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo50a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f13a.mo75f();
    }

    /* renamed from: b */
    public void mo51b() {
        this.f13a.mo74c();
    }

    @NonNull
    /* renamed from: c */
    public MediaSessionCompat.Token mo52c() {
        return this.f13a.mo73b();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0022a();

        /* renamed from: b */
        private final int f14b;

        /* renamed from: c */
        private final MediaDescriptionCompat f15c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
        class C0022a implements Parcelable.Creator<MediaItem> {
            C0022a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.mo97e())) {
                this.f14b = i;
                this.f15c = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        /* renamed from: a */
        public static MediaItem m12a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.m49a(C0023a.m17a(mediaItem)), C0023a.m18b(mediaItem));
        }

        /* renamed from: b */
        public static List<MediaItem> m13b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m12a(a));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        @NonNull
        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f14b + ", mDescription=" + this.f15c + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14b);
            this.f15c.writeToParcel(parcel, i);
        }

        MediaItem(Parcel parcel) {
            this.f14b = parcel.readInt();
            this.f15c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static class C0025c {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new C0026a();
        C0027b mConnectionCallbackInternal;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$a */
        private class C0026a extends MediaBrowser.ConnectionCallback {
            C0026a() {
            }

            public void onConnected() {
                C0027b bVar = C0025c.this.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.mo71h();
                }
                C0025c.this.onConnected();
            }

            public void onConnectionFailed() {
                C0027b bVar = C0025c.this.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.mo72i();
                }
                C0025c.this.onConnectionFailed();
            }

            public void onConnectionSuspended() {
                C0027b bVar = C0025c.this.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.mo70e();
                }
                C0025c.this.onConnectionSuspended();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$c$b */
        interface C0027b {
            /* renamed from: e */
            void mo70e();

            /* renamed from: h */
            void mo71h();

            /* renamed from: i */
            void mo72i();
        }

        /* access modifiers changed from: package-private */
        public void setInternalConnectionCallback(C0027b bVar) {
            this.mConnectionCallbackInternal = bVar;
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    static class C0029e implements C0028d, C0032h, C0025c.C0027b {

        /* renamed from: a */
        final Context f19a;

        /* renamed from: b */
        protected final MediaBrowser f20b;

        /* renamed from: c */
        protected final Bundle f21c;

        /* renamed from: d */
        protected final C0024b f22d = new C0024b(this);

        /* renamed from: e */
        private final ArrayMap<String, C0034j> f23e = new ArrayMap<>();

        /* renamed from: f */
        protected int f24f;

        /* renamed from: g */
        protected C0033i f25g;

        /* renamed from: h */
        protected Messenger f26h;

        /* renamed from: i */
        private MediaSessionCompat.Token f27i;

        /* renamed from: j */
        private Bundle f28j;

        C0029e(Context context, ComponentName componentName, C0025c cVar, Bundle bundle) {
            Bundle bundle2;
            this.f19a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f21c = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
            cVar.setInternalConnectionCallback(this);
            this.f20b = new MediaBrowser(context, componentName, cVar.mConnectionCallbackFwk, bundle2);
        }

        @NonNull
        /* renamed from: b */
        public MediaSessionCompat.Token mo73b() {
            if (this.f27i == null) {
                this.f27i = MediaSessionCompat.Token.m191a(this.f20b.getSessionToken());
            }
            return this.f27i;
        }

        /* renamed from: c */
        public void mo74c() {
            Messenger messenger;
            C0033i iVar = this.f25g;
            if (!(iVar == null || (messenger = this.f26h) == null)) {
                try {
                    iVar.mo80c(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f20b.disconnect();
        }

        /* renamed from: d */
        public void mo77d(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f26h == messenger) {
                C0034j jVar = this.f23e.get(str);
                if (jVar != null) {
                    C0035k a = jVar.mo81a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo86c(str);
                            return;
                        }
                        this.f28j = bundle2;
                        a.mo84a(str, list);
                        this.f28j = null;
                    } else if (list == null) {
                        a.mo87d(str, bundle);
                    } else {
                        this.f28j = bundle2;
                        a.mo85b(str, list, bundle);
                        this.f28j = null;
                    }
                } else if (MediaBrowserCompat.f12b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: e */
        public void mo70e() {
            this.f25g = null;
            this.f26h = null;
            this.f27i = null;
            this.f22d.mo61a((Messenger) null);
        }

        /* renamed from: f */
        public void mo75f() {
            this.f20b.connect();
        }

        /* renamed from: h */
        public void mo71h() {
            try {
                Bundle extras = this.f20b.getExtras();
                if (extras != null) {
                    this.f24f = extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                    IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                    if (binder != null) {
                        this.f25g = new C0033i(binder, this.f21c);
                        Messenger messenger = new Messenger(this.f22d);
                        this.f26h = messenger;
                        this.f22d.mo61a(messenger);
                        try {
                            this.f25g.mo79a(this.f19a, this.f26h);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    C0084b E = C0084b.C0085a.m424E(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                    if (E != null) {
                        this.f27i = MediaSessionCompat.Token.m192b(this.f20b.getSessionToken(), E);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }

        /* renamed from: i */
        public void mo72i() {
        }

        /* renamed from: g */
        public void mo78g(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo76a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    public static abstract class C0035k {

        /* renamed from: a */
        final MediaBrowser.SubscriptionCallback f33a;

        /* renamed from: b */
        final IBinder f34b = new Binder();

        /* renamed from: c */
        WeakReference<C0034j> f35c;

        @RequiresApi(21)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$a */
        private class C0036a extends MediaBrowser.SubscriptionCallback {
            C0036a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public List<MediaItem> mo88a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            public void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                C0034j jVar;
                WeakReference<C0034j> weakReference = C0035k.this.f35c;
                if (weakReference == null) {
                    jVar = null;
                } else {
                    jVar = weakReference.get();
                }
                if (jVar == null) {
                    C0035k.this.mo84a(str, MediaItem.m13b(list));
                    return;
                }
                List<MediaItem> b = MediaItem.m13b(list);
                List<C0035k> b2 = jVar.mo82b();
                List<Bundle> c = jVar.mo83c();
                for (int i = 0; i < b2.size(); i++) {
                    Bundle bundle = c.get(i);
                    if (bundle == null) {
                        C0035k.this.mo84a(str, b);
                    } else {
                        C0035k.this.mo85b(str, mo88a(b, bundle), bundle);
                    }
                }
            }

            public void onError(@NonNull String str) {
                C0035k.this.mo86c(str);
            }
        }

        @RequiresApi(26)
        /* renamed from: android.support.v4.media.MediaBrowserCompat$k$b */
        private class C0037b extends C0036a {
            C0037b() {
                super();
            }

            public void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.m163a(bundle);
                C0035k.this.mo85b(str, MediaItem.m13b(list), bundle);
            }

            public void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.m163a(bundle);
                C0035k.this.mo87d(str, bundle);
            }
        }

        public C0035k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f33a = new C0037b();
            } else {
                this.f33a = new C0036a();
            }
        }

        /* renamed from: c */
        public void mo86c(@NonNull String str) {
        }

        /* renamed from: a */
        public void mo84a(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        /* renamed from: d */
        public void mo87d(@NonNull String str, @NonNull Bundle bundle) {
        }

        /* renamed from: b */
        public void mo85b(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends C1995b {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo53a(int i, Bundle bundle) {
        }
    }
}
