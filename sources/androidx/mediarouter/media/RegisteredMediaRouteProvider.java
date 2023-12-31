package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class RegisteredMediaRouteProvider extends MediaRouteProvider implements ServiceConnection {
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    static final String TAG = "MediaRouteProviderProxy";
    private Connection mActiveConnection;
    private boolean mBound;
    private final ComponentName mComponentName;
    private boolean mConnectionReady;
    private ControllerCallback mControllerCallback;
    private final ArrayList<ControllerConnection> mControllerConnections = new ArrayList<>();
    final PrivateHandler mPrivateHandler;
    private boolean mStarted;

    private final class Connection implements IBinder.DeathRecipient {
        private int mNextControllerId = 1;
        private int mNextRequestId = 1;
        private final SparseArray<MediaRouter.ControlRequestCallback> mPendingCallbacks = new SparseArray<>();
        private int mPendingRegisterRequestId;
        private final ReceiveHandler mReceiveHandler;
        private final Messenger mReceiveMessenger;
        private final Messenger mServiceMessenger;
        private int mServiceVersion;

        public Connection(Messenger messenger) {
            this.mServiceMessenger = messenger;
            ReceiveHandler receiveHandler = new ReceiveHandler(this);
            this.mReceiveHandler = receiveHandler;
            this.mReceiveMessenger = new Messenger(receiveHandler);
        }

        private boolean sendRequest(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.mReceiveMessenger;
            try {
                this.mServiceMessenger.send(obtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e) {
                if (i == 2) {
                    return false;
                }
                Log.e(RegisteredMediaRouteProvider.TAG, "Could not send message to service.", e);
                return false;
            }
        }

        public void addMemberRoute(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_ID, str);
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(12, i2, i, (Object) null, bundle);
        }

        public void binderDied() {
            RegisteredMediaRouteProvider.this.mPrivateHandler.post(new Runnable() {
                public void run() {
                    Connection connection = Connection.this;
                    RegisteredMediaRouteProvider.this.onConnectionDied(connection);
                }
            });
        }

        public int createDynamicGroupRouteController(String str, MediaRouter.ControlRequestCallback controlRequestCallback) {
            int i = this.mNextControllerId;
            this.mNextControllerId = i + 1;
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_ID, str);
            sendRequest(11, i2, i, (Object) null, bundle);
            this.mPendingCallbacks.put(i2, controlRequestCallback);
            return i;
        }

        public int createRouteController(String str, String str2) {
            int i = this.mNextControllerId;
            this.mNextControllerId = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID, str);
            bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_LIBRARY_GROUP, str2);
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(3, i2, i, (Object) null, bundle);
            return i;
        }

        public void dispose() {
            sendRequest(2, 0, 0, (Object) null, (Bundle) null);
            this.mReceiveHandler.dispose();
            this.mServiceMessenger.getBinder().unlinkToDeath(this, 0);
            RegisteredMediaRouteProvider.this.mPrivateHandler.post(new Runnable() {
                public void run() {
                    Connection.this.failPendingCallbacks();
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void failPendingCallbacks() {
            int size = this.mPendingCallbacks.size();
            for (int i = 0; i < size; i++) {
                this.mPendingCallbacks.valueAt(i).onError((String) null, (Bundle) null);
            }
            this.mPendingCallbacks.clear();
        }

        public boolean onControlRequestFailed(int i, String str, Bundle bundle) {
            MediaRouter.ControlRequestCallback controlRequestCallback = this.mPendingCallbacks.get(i);
            if (controlRequestCallback == null) {
                return false;
            }
            this.mPendingCallbacks.remove(i);
            controlRequestCallback.onError(str, bundle);
            return true;
        }

        public boolean onControlRequestSucceeded(int i, Bundle bundle) {
            MediaRouter.ControlRequestCallback controlRequestCallback = this.mPendingCallbacks.get(i);
            if (controlRequestCallback == null) {
                return false;
            }
            this.mPendingCallbacks.remove(i);
            controlRequestCallback.onResult(bundle);
            return true;
        }

        public void onControllerReleasedByProvider(int i) {
            RegisteredMediaRouteProvider.this.onConnectionControllerReleasedByProvider(this, i);
        }

        public boolean onDescriptorChanged(Bundle bundle) {
            if (this.mServiceVersion == 0) {
                return false;
            }
            RegisteredMediaRouteProvider.this.onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
            return true;
        }

        public void onDynamicGroupRouteControllerCreated(int i, Bundle bundle) {
            MediaRouter.ControlRequestCallback controlRequestCallback = this.mPendingCallbacks.get(i);
            if (bundle == null || !bundle.containsKey(MediaRouteProviderProtocol.CLIENT_DATA_ROUTE_ID)) {
                controlRequestCallback.onError("DynamicGroupRouteController is created without valid route id.", bundle);
                return;
            }
            this.mPendingCallbacks.remove(i);
            controlRequestCallback.onResult(bundle);
        }

        public boolean onDynamicRouteDescriptorsChanged(int i, Bundle bundle) {
            MediaRouteDescriptor mediaRouteDescriptor;
            if (this.mServiceVersion == 0) {
                return false;
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable(MediaRouteProviderProtocol.DATA_KEY_GROUP_ROUTE_DESCRIPTOR);
            if (bundle2 != null) {
                mediaRouteDescriptor = MediaRouteDescriptor.fromBundle(bundle2);
            } else {
                mediaRouteDescriptor = null;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(MediaRouteProviderProtocol.DATA_KEY_DYNAMIC_ROUTE_DESCRIPTORS);
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.fromBundle((Bundle) it.next()));
            }
            RegisteredMediaRouteProvider.this.onDynamicRouteDescriptorChanged(this, i, mediaRouteDescriptor, arrayList);
            return true;
        }

        public boolean onGenericFailure(int i) {
            if (i == this.mPendingRegisterRequestId) {
                this.mPendingRegisterRequestId = 0;
                RegisteredMediaRouteProvider.this.onConnectionError(this, "Registration failed");
            }
            MediaRouter.ControlRequestCallback controlRequestCallback = this.mPendingCallbacks.get(i);
            if (controlRequestCallback == null) {
                return true;
            }
            this.mPendingCallbacks.remove(i);
            controlRequestCallback.onError((String) null, (Bundle) null);
            return true;
        }

        public boolean onGenericSuccess(int i) {
            return true;
        }

        public boolean onRegistered(int i, int i2, Bundle bundle) {
            if (this.mServiceVersion != 0 || i != this.mPendingRegisterRequestId || i2 < 1) {
                return false;
            }
            this.mPendingRegisterRequestId = 0;
            this.mServiceVersion = i2;
            RegisteredMediaRouteProvider.this.onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
            RegisteredMediaRouteProvider.this.onConnectionReady(this);
            return true;
        }

        public boolean register() {
            int i = this.mNextRequestId;
            this.mNextRequestId = i + 1;
            this.mPendingRegisterRequestId = i;
            if (!sendRequest(1, i, 4, (Object) null, (Bundle) null)) {
                return false;
            }
            try {
                this.mServiceMessenger.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void releaseRouteController(int i) {
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(4, i2, i, (Object) null, (Bundle) null);
        }

        public void removeMemberRoute(int i, String str) {
            Bundle bundle = new Bundle();
            bundle.putString(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_ID, str);
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(13, i2, i, (Object) null, bundle);
        }

        public void selectRoute(int i) {
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(5, i2, i, (Object) null, (Bundle) null);
        }

        public boolean sendControlRequest(int i, Intent intent, MediaRouter.ControlRequestCallback controlRequestCallback) {
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            if (!sendRequest(9, i2, i, intent, (Bundle) null)) {
                return false;
            }
            if (controlRequestCallback == null) {
                return true;
            }
            this.mPendingCallbacks.put(i2, controlRequestCallback);
            return true;
        }

        public void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
            Bundle bundle;
            int i = this.mNextRequestId;
            this.mNextRequestId = i + 1;
            if (mediaRouteDiscoveryRequest != null) {
                bundle = mediaRouteDiscoveryRequest.asBundle();
            } else {
                bundle = null;
            }
            sendRequest(10, i, 0, bundle, (Bundle) null);
        }

        public void setVolume(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, i2);
            int i3 = this.mNextRequestId;
            this.mNextRequestId = i3 + 1;
            sendRequest(7, i3, i, (Object) null, bundle);
        }

        public void unselectRoute(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_UNSELECT_REASON, i2);
            int i3 = this.mNextRequestId;
            this.mNextRequestId = i3 + 1;
            sendRequest(6, i3, i, (Object) null, bundle);
        }

        public void updateMemberRoutes(int i, List<String> list) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(MediaRouteProviderProtocol.CLIENT_DATA_MEMBER_ROUTE_IDS, new ArrayList(list));
            int i2 = this.mNextRequestId;
            this.mNextRequestId = i2 + 1;
            sendRequest(14, i2, i, (Object) null, bundle);
        }

        public void updateVolume(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, i2);
            int i3 = this.mNextRequestId;
            this.mNextRequestId = i3 + 1;
            sendRequest(8, i3, i, (Object) null, bundle);
        }
    }

    interface ControllerCallback {
        void onControllerReleasedByProvider(MediaRouteProvider.RouteController routeController);
    }

    interface ControllerConnection {
        void attachConnection(Connection connection);

        void detachConnection();

        int getControllerId();
    }

    private static final class PrivateHandler extends Handler {
        PrivateHandler() {
        }
    }

    private static final class ReceiveHandler extends Handler {
        private final WeakReference<Connection> mConnectionRef;

        public ReceiveHandler(Connection connection) {
            this.mConnectionRef = new WeakReference<>(connection);
        }

        private boolean processMessage(Connection connection, int i, int i2, int i3, Object obj, Bundle bundle) {
            String str;
            switch (i) {
                case 0:
                    connection.onGenericFailure(i2);
                    return true;
                case 1:
                    connection.onGenericSuccess(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onRegistered(i2, i3, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onControlRequestSucceeded(i2, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj != null && !(obj instanceof Bundle)) {
                        return false;
                    }
                    if (bundle == null) {
                        str = null;
                    } else {
                        str = bundle.getString(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
                    }
                    return connection.onControlRequestFailed(i2, str, (Bundle) obj);
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onDescriptorChanged((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (obj instanceof Bundle) {
                        connection.onDynamicGroupRouteControllerCreated(i2, (Bundle) obj);
                        return false;
                    }
                    Log.w(RegisteredMediaRouteProvider.TAG, "No further information on the dynamic group controller");
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return connection.onDynamicRouteDescriptorsChanged(i3, (Bundle) obj);
                    }
                    return false;
                case 8:
                    connection.onControllerReleasedByProvider(i3);
                    return false;
                default:
                    return false;
            }
        }

        public void dispose() {
            this.mConnectionRef.clear();
        }

        public void handleMessage(Message message) {
            Connection connection = this.mConnectionRef.get();
            if (connection != null) {
                if (!processMessage(connection, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && RegisteredMediaRouteProvider.DEBUG) {
                    Log.d(RegisteredMediaRouteProvider.TAG, "Unhandled message from server: " + message);
                }
            }
        }
    }

    private final class RegisteredDynamicController extends MediaRouteProvider.DynamicGroupRouteController implements ControllerConnection {
        private Connection mConnection;
        private int mControllerId = -1;
        String mGroupableSectionTitle;
        private final String mInitialMemberRouteId;
        private int mPendingSetVolume = -1;
        private int mPendingUpdateVolumeDelta;
        private boolean mSelected;
        String mTransferableSectionTitle;

        RegisteredDynamicController(String str) {
            this.mInitialMemberRouteId = str;
        }

        public void attachConnection(Connection connection) {
            C24591 r0 = new MediaRouter.ControlRequestCallback() {
                public void onError(String str, Bundle bundle) {
                    Log.d(RegisteredMediaRouteProvider.TAG, "Error: " + str + ", data: " + bundle);
                }

                public void onResult(Bundle bundle) {
                    RegisteredDynamicController.this.mGroupableSectionTitle = bundle.getString(MediaRouteProviderProtocol.DATA_KEY_GROUPABLE_SECION_TITLE);
                    RegisteredDynamicController.this.mTransferableSectionTitle = bundle.getString(MediaRouteProviderProtocol.DATA_KEY_TRANSFERABLE_SECTION_TITLE);
                }
            };
            this.mConnection = connection;
            int createDynamicGroupRouteController = connection.createDynamicGroupRouteController(this.mInitialMemberRouteId, r0);
            this.mControllerId = createDynamicGroupRouteController;
            if (this.mSelected) {
                connection.selectRoute(createDynamicGroupRouteController);
                int i = this.mPendingSetVolume;
                if (i >= 0) {
                    connection.setVolume(this.mControllerId, i);
                    this.mPendingSetVolume = -1;
                }
                int i2 = this.mPendingUpdateVolumeDelta;
                if (i2 != 0) {
                    connection.updateVolume(this.mControllerId, i2);
                    this.mPendingUpdateVolumeDelta = 0;
                }
            }
        }

        public void detachConnection() {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.releaseRouteController(this.mControllerId);
                this.mConnection = null;
                this.mControllerId = 0;
            }
        }

        public int getControllerId() {
            return this.mControllerId;
        }

        public String getGroupableSelectionTitle() {
            return this.mGroupableSectionTitle;
        }

        public String getTransferableSectionTitle() {
            return this.mTransferableSectionTitle;
        }

        public void onAddMemberRoute(@NonNull String str) {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.addMemberRoute(this.mControllerId, str);
            }
        }

        public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback controlRequestCallback) {
            Connection connection = this.mConnection;
            if (connection != null) {
                return connection.sendControlRequest(this.mControllerId, intent, controlRequestCallback);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void onDynamicRoutesChanged(MediaRouteDescriptor mediaRouteDescriptor, List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> list) {
            notifyDynamicRoutesChanged(mediaRouteDescriptor, list);
        }

        public void onRelease() {
            RegisteredMediaRouteProvider.this.onControllerReleased(this);
        }

        public void onRemoveMemberRoute(@NonNull String str) {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.removeMemberRoute(this.mControllerId, str);
            }
        }

        public void onSelect() {
            this.mSelected = true;
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.selectRoute(this.mControllerId);
            }
        }

        public void onSetVolume(int i) {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.setVolume(this.mControllerId, i);
                return;
            }
            this.mPendingSetVolume = i;
            this.mPendingUpdateVolumeDelta = 0;
        }

        public void onUnselect() {
            onUnselect(0);
        }

        public void onUpdateMemberRoutes(@Nullable List<String> list) {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.updateMemberRoutes(this.mControllerId, list);
            }
        }

        public void onUpdateVolume(int i) {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.updateVolume(this.mControllerId, i);
            } else {
                this.mPendingUpdateVolumeDelta += i;
            }
        }

        public void onUnselect(int i) {
            this.mSelected = false;
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.unselectRoute(this.mControllerId, i);
            }
        }
    }

    private final class RegisteredRouteController extends MediaRouteProvider.RouteController implements ControllerConnection {
        private Connection mConnection;
        private int mControllerId;
        private int mPendingSetVolume = -1;
        private int mPendingUpdateVolumeDelta;
        private final String mRouteGroupId;
        private final String mRouteId;
        private boolean mSelected;

        RegisteredRouteController(String str, String str2) {
            this.mRouteId = str;
            this.mRouteGroupId = str2;
        }

        public void attachConnection(Connection connection) {
            this.mConnection = connection;
            int createRouteController = connection.createRouteController(this.mRouteId, this.mRouteGroupId);
            this.mControllerId = createRouteController;
            if (this.mSelected) {
                connection.selectRoute(createRouteController);
                int i = this.mPendingSetVolume;
                if (i >= 0) {
                    connection.setVolume(this.mControllerId, i);
                    this.mPendingSetVolume = -1;
                }
                int i2 = this.mPendingUpdateVolumeDelta;
                if (i2 != 0) {
                    connection.updateVolume(this.mControllerId, i2);
                    this.mPendingUpdateVolumeDelta = 0;
                }
            }
        }

        public void detachConnection() {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.releaseRouteController(this.mControllerId);
                this.mConnection = null;
                this.mControllerId = 0;
            }
        }

        public int getControllerId() {
            return this.mControllerId;
        }

        public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback controlRequestCallback) {
            Connection connection = this.mConnection;
            if (connection != null) {
                return connection.sendControlRequest(this.mControllerId, intent, controlRequestCallback);
            }
            return false;
        }

        public void onRelease() {
            RegisteredMediaRouteProvider.this.onControllerReleased(this);
        }

        public void onSelect() {
            this.mSelected = true;
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.selectRoute(this.mControllerId);
            }
        }

        public void onSetVolume(int i) {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.setVolume(this.mControllerId, i);
                return;
            }
            this.mPendingSetVolume = i;
            this.mPendingUpdateVolumeDelta = 0;
        }

        public void onUnselect() {
            onUnselect(0);
        }

        public void onUpdateVolume(int i) {
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.updateVolume(this.mControllerId, i);
            } else {
                this.mPendingUpdateVolumeDelta += i;
            }
        }

        public void onUnselect(int i) {
            this.mSelected = false;
            Connection connection = this.mConnection;
            if (connection != null) {
                connection.unselectRoute(this.mControllerId, i);
            }
        }
    }

    public RegisteredMediaRouteProvider(Context context, ComponentName componentName) {
        super(context, new MediaRouteProvider.ProviderMetadata(componentName));
        this.mComponentName = componentName;
        this.mPrivateHandler = new PrivateHandler();
    }

    private void attachControllersToConnection() {
        int size = this.mControllerConnections.size();
        for (int i = 0; i < size; i++) {
            this.mControllerConnections.get(i).attachConnection(this.mActiveConnection);
        }
    }

    private void bind() {
        int i;
        if (!this.mBound) {
            boolean z = DEBUG;
            if (z) {
                Log.d(TAG, this + ": Binding");
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.mComponentName);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
                } else {
                    i = 1;
                }
                boolean bindService = getContext().bindService(intent, this, i);
                this.mBound = bindService;
                if (!bindService && z) {
                    Log.d(TAG, this + ": Bind failed");
                }
            } catch (SecurityException e) {
                if (DEBUG) {
                    Log.d(TAG, this + ": Bind failed", e);
                }
            }
        }
    }

    private MediaRouteProvider.DynamicGroupRouteController createDynamicGroupRouteController(String str) {
        MediaRouteProviderDescriptor descriptor = getDescriptor();
        if (descriptor == null) {
            return null;
        }
        List<MediaRouteDescriptor> routes = descriptor.getRoutes();
        int size = routes.size();
        for (int i = 0; i < size; i++) {
            if (routes.get(i).getId().equals(str)) {
                RegisteredDynamicController registeredDynamicController = new RegisteredDynamicController(str);
                this.mControllerConnections.add(registeredDynamicController);
                if (this.mConnectionReady) {
                    registeredDynamicController.attachConnection(this.mActiveConnection);
                }
                updateBinding();
                return registeredDynamicController;
            }
        }
        return null;
    }

    private MediaRouteProvider.RouteController createRouteController(String str, String str2) {
        MediaRouteProviderDescriptor descriptor = getDescriptor();
        if (descriptor == null) {
            return null;
        }
        List<MediaRouteDescriptor> routes = descriptor.getRoutes();
        int size = routes.size();
        for (int i = 0; i < size; i++) {
            if (routes.get(i).getId().equals(str)) {
                RegisteredRouteController registeredRouteController = new RegisteredRouteController(str, str2);
                this.mControllerConnections.add(registeredRouteController);
                if (this.mConnectionReady) {
                    registeredRouteController.attachConnection(this.mActiveConnection);
                }
                updateBinding();
                return registeredRouteController;
            }
        }
        return null;
    }

    private void detachControllersFromConnection() {
        int size = this.mControllerConnections.size();
        for (int i = 0; i < size; i++) {
            this.mControllerConnections.get(i).detachConnection();
        }
    }

    private void disconnect() {
        if (this.mActiveConnection != null) {
            setDescriptor((MediaRouteProviderDescriptor) null);
            this.mConnectionReady = false;
            detachControllersFromConnection();
            this.mActiveConnection.dispose();
            this.mActiveConnection = null;
        }
    }

    private ControllerConnection findControllerById(int i) {
        Iterator<ControllerConnection> it = this.mControllerConnections.iterator();
        while (it.hasNext()) {
            ControllerConnection next = it.next();
            if (next.getControllerId() == i) {
                return next;
            }
        }
        return null;
    }

    private boolean shouldBind() {
        if (!this.mStarted) {
            return false;
        }
        if (getDiscoveryRequest() == null && this.mControllerConnections.isEmpty()) {
            return false;
        }
        return true;
    }

    private void unbind() {
        if (this.mBound) {
            if (DEBUG) {
                Log.d(TAG, this + ": Unbinding");
            }
            this.mBound = false;
            disconnect();
            try {
                getContext().unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e(TAG, this + ": unbindService failed", e);
            }
        }
    }

    private void updateBinding() {
        if (shouldBind()) {
            bind();
        } else {
            unbind();
        }
    }

    public boolean hasComponentName(String str, String str2) {
        if (!this.mComponentName.getPackageName().equals(str) || !this.mComponentName.getClassName().equals(str2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void onConnectionControllerReleasedByProvider(Connection connection, int i) {
        if (this.mActiveConnection == connection) {
            ControllerConnection findControllerById = findControllerById(i);
            ControllerCallback controllerCallback = this.mControllerCallback;
            if (controllerCallback != null && (findControllerById instanceof MediaRouteProvider.RouteController)) {
                controllerCallback.onControllerReleasedByProvider((MediaRouteProvider.RouteController) findControllerById);
            }
            onControllerReleased(findControllerById);
        }
    }

    /* access modifiers changed from: package-private */
    public void onConnectionDescriptorChanged(Connection connection, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        if (this.mActiveConnection == connection) {
            if (DEBUG) {
                Log.d(TAG, this + ": Descriptor changed, descriptor=" + mediaRouteProviderDescriptor);
            }
            setDescriptor(mediaRouteProviderDescriptor);
        }
    }

    /* access modifiers changed from: package-private */
    public void onConnectionDied(Connection connection) {
        if (this.mActiveConnection == connection) {
            if (DEBUG) {
                Log.d(TAG, this + ": Service connection died");
            }
            disconnect();
        }
    }

    /* access modifiers changed from: package-private */
    public void onConnectionError(Connection connection, String str) {
        if (this.mActiveConnection == connection) {
            if (DEBUG) {
                Log.d(TAG, this + ": Service connection error - " + str);
            }
            unbind();
        }
    }

    /* access modifiers changed from: package-private */
    public void onConnectionReady(Connection connection) {
        if (this.mActiveConnection == connection) {
            this.mConnectionReady = true;
            attachControllersToConnection();
            MediaRouteDiscoveryRequest discoveryRequest = getDiscoveryRequest();
            if (discoveryRequest != null) {
                this.mActiveConnection.setDiscoveryRequest(discoveryRequest);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onControllerReleased(ControllerConnection controllerConnection) {
        this.mControllerConnections.remove(controllerConnection);
        controllerConnection.detachConnection();
        updateBinding();
    }

    public MediaRouteProvider.DynamicGroupRouteController onCreateDynamicGroupRouteController(@NonNull String str) {
        if (str != null) {
            return createDynamicGroupRouteController(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String str) {
        if (str != null) {
            return createRouteController(str, (String) null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest) {
        if (this.mConnectionReady) {
            this.mActiveConnection.setDiscoveryRequest(mediaRouteDiscoveryRequest);
        }
        updateBinding();
    }

    /* access modifiers changed from: package-private */
    public void onDynamicRouteDescriptorChanged(Connection connection, int i, MediaRouteDescriptor mediaRouteDescriptor, List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> list) {
        if (this.mActiveConnection == connection) {
            if (DEBUG) {
                Log.d(TAG, this + ": DynamicRouteDescriptors changed, descriptors=" + list);
            }
            ControllerConnection findControllerById = findControllerById(i);
            if (findControllerById instanceof RegisteredDynamicController) {
                ((RegisteredDynamicController) findControllerById).onDynamicRoutesChanged(mediaRouteDescriptor, list);
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        boolean z = DEBUG;
        if (z) {
            Log.d(TAG, this + ": Connected");
        }
        if (this.mBound) {
            disconnect();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (MediaRouteProviderProtocol.isValidRemoteMessenger(messenger)) {
                Connection connection = new Connection(messenger);
                if (connection.register()) {
                    this.mActiveConnection = connection;
                } else if (z) {
                    Log.d(TAG, this + ": Registration failed");
                }
            } else {
                Log.e(TAG, this + ": Service returned invalid messenger binder");
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (DEBUG) {
            Log.d(TAG, this + ": Service disconnected");
        }
        disconnect();
    }

    public void rebindIfDisconnected() {
        if (this.mActiveConnection == null && shouldBind()) {
            unbind();
            bind();
        }
    }

    public void setControllerCallback(@Nullable ControllerCallback controllerCallback) {
        this.mControllerCallback = controllerCallback;
    }

    public void start() {
        if (!this.mStarted) {
            if (DEBUG) {
                Log.d(TAG, this + ": Starting");
            }
            this.mStarted = true;
            updateBinding();
        }
    }

    public void stop() {
        if (this.mStarted) {
            if (DEBUG) {
                Log.d(TAG, this + ": Stopping");
            }
            this.mStarted = false;
            updateBinding();
        }
    }

    public String toString() {
        return "Service connection " + this.mComponentName.flattenToShortString();
    }

    public MediaRouteProvider.RouteController onCreateRouteController(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return createRouteController(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }
}
