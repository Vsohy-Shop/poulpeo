package com.rmn.api.p322v2.common.pinned_object;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.ICacheListenerClear;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleWrapper;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import p446vd.C13633n;
import p446vd.C13636q;

/* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectsManager */
public abstract class PinnedObjectsManager {
    private static final String KEY_LAST_PINNED_TIME = "lastPinnedTimeMs";
    private static final long NB_DAYS_BETWEEN_PINNED_UPDATES = 7;
    protected static final int OFFERS_EXPIRATION_NB_DAYS = 5;
    protected static final int PINNED_OBJECTS_MAX_LIMIT = 100;
    private static final int TIMER_RETRY_PERIOD_S = 10;
    private LocalPinnedObjectsComparator comparator = new LocalPinnedObjectsComparator();
    protected final ContextContainer contextContainer;
    /* access modifiers changed from: private */
    public final AndroidOsHandler handler = new AndroidOsHandler();
    /* access modifiers changed from: private */
    public boolean isRetrievingPinnedObjects = false;
    private boolean isTimerLocked;
    protected List<ModelRef<PinnedObject>> localPinnedObjects = new ArrayList();
    /* access modifiers changed from: private */
    public Map<ModelRef<PinnedObject>, PinnedObjectAction> pendingActions = new HashMap();
    private final List<PinnedObject> pendingLocalPinnedObjects = new ArrayList();
    private final ProxyActionsPool proxyPool = new ProxyActionsPool();
    private Timer timerActionsSending;

    /* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectsManager$a */
    class C11338a extends TimerTask {

        /* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectsManager$a$a */
        class C11339a implements Runnable {
            C11339a() {
            }

            public void run() {
                PinnedObjectsManager.this.sendAllPendingActions((LogoutListener) null);
            }
        }

        C11338a() {
        }

        public void run() {
            PinnedObjectsManager.this.handler.mo47872g(new C11339a());
        }
    }

    /* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectsManager$b */
    class C11340b implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ LogoutListener f17811b;

        /* renamed from: c */
        final /* synthetic */ IListener f17812c;

        C11340b(LogoutListener logoutListener, IListener iListener) {
            this.f17811b = logoutListener;
            this.f17812c = iListener;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            boolean z;
            boolean z2 = false;
            PinnedObjectsManager.this.isRetrievingPinnedObjects = false;
            ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
            if (status == ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
                PinnedObjectsManager.this.flushPendingLocalPinnedObjects(this.f17811b);
            } else if (status != ProxyBundleOutput.ProxyOutputStatus.OK) {
                IListener iListener = this.f17812c;
                if (iListener != null) {
                    iListener.mo40744J0(new ProxyBundleWrapper(proxyBundleInput, proxyBundleOutput));
                }
                PinnedObjectsManager.this.startTimerActionsSending(true);
                PinnedObjectsManager.this.flushPendingLocalPinnedObjects(this.f17811b);
            } else {
                PinnedObject[] responseObjectGetList = PinnedObjectsManager.this.getResponseObjectGetList(proxyBundleOutput);
                if (responseObjectGetList == null) {
                    IListener iListener2 = this.f17812c;
                    if (iListener2 != null) {
                        iListener2.mo40744J0(new ProxyBundleWrapper(proxyBundleInput, proxyBundleOutput));
                    }
                    PinnedObjectsManager.this.startTimerActionsSending(true);
                    PinnedObjectsManager.this.flushPendingLocalPinnedObjects(this.f17811b);
                    return;
                }
                PinnedObjectsManager.this.localPinnedObjects.clear();
                for (PinnedObject pinnedObject : responseObjectGetList) {
                    if (pinnedObject != null) {
                        PinnedObjectsManager.this.localPinnedObjects.add(ModelRef.getModelReferenceOrNew(pinnedObject));
                    }
                }
                if (!proxyBundleOutput.isCacheHit()) {
                    HashMap hashMap = new HashMap();
                    boolean z3 = false;
                    for (Map.Entry entry : PinnedObjectsManager.this.pendingActions.entrySet()) {
                        ModelRef modelRef = (ModelRef) entry.getKey();
                        PinnedObjectAction pinnedObjectAction = (PinnedObjectAction) entry.getValue();
                        Iterator<ModelRef<PinnedObject>> it = PinnedObjectsManager.this.localPinnedObjects.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().equals(modelRef)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (pinnedObjectAction == PinnedObjectAction.ADD && !z) {
                            PinnedObjectsManager.this.localPinnedObjects.add(modelRef);
                            hashMap.put(modelRef, pinnedObjectAction);
                        } else if (pinnedObjectAction == PinnedObjectAction.REMOVE && z) {
                            PinnedObjectsManager.this.localPinnedObjects.remove(modelRef);
                            hashMap.put(modelRef, pinnedObjectAction);
                        }
                        z3 = true;
                    }
                    PinnedObjectsManager.this.pendingActions = hashMap;
                    z2 = z3;
                }
                PinnedObjectsManager.this.sortLocalPinnedObjects();
                PinnedObjectsManager.this.startTimerActionsSending(true);
                IListener iListener3 = this.f17812c;
                if (iListener3 != null) {
                    iListener3.mo40744J0(new ProxyBundleWrapper(proxyBundleInput, proxyBundleOutput));
                }
                if (z2) {
                    PinnedObjectsManager.this.updateLocalPinnedObjectsCache();
                }
                PinnedObjectsManager.this.flushPendingLocalPinnedObjects(this.f17811b);
            }
        }
    }

    /* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectsManager$c */
    class C11341c implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ PinnedObject f17814b;

        /* renamed from: c */
        final /* synthetic */ PinnedObjectAction f17815c;

        /* renamed from: d */
        final /* synthetic */ LogoutListener f17816d;

        /* renamed from: e */
        final /* synthetic */ IListener f17817e;

        C11341c(PinnedObject pinnedObject, PinnedObjectAction pinnedObjectAction, LogoutListener logoutListener, IListener iListener) {
            this.f17814b = pinnedObject;
            this.f17815c = pinnedObjectAction;
            this.f17816d = logoutListener;
            this.f17817e = iListener;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
            if (status != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
                ProxyBundleOutput.ProxyOutputStatus proxyOutputStatus = ProxyBundleOutput.ProxyOutputStatus.REQUEST_FAILED;
                if (status == proxyOutputStatus) {
                    PinnedObjectsManager.this.putPendingAction(this.f17814b, this.f17815c, false, (IListener<ProxyBundleWrapper>) null, this.f17816d);
                    PinnedObjectsManager.this.startTimerActionsSending(false);
                }
                IListener iListener = this.f17817e;
                if (iListener != null) {
                    iListener.mo40744J0(new ProxyBundleWrapper(proxyBundleInput, proxyBundleOutput));
                }
                if (status != proxyOutputStatus) {
                    PinnedObjectsManager.this.updateLocalPinnedObjectsCache();
                }
            }
        }
    }

    PinnedObjectsManager(ContextContainer contextContainer2) {
        if (contextContainer2 != null) {
            this.contextContainer = contextContainer2;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void addPinnedObject(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, AbstractModel abstractModel, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (isLogged()) {
            PinnedObject pinnedObject = new PinnedObject(pinnedObjectType, pinnedObjectModel, new Date(), abstractModel);
            if (this.isRetrievingPinnedObjects) {
                this.pendingLocalPinnedObjects.add(pinnedObject);
            }
            addLocalPinnedObject(pinnedObject);
            putPendingAction(pinnedObject, PinnedObjectAction.ADD, true, iListener, logoutListener);
        }
    }

    /* access modifiers changed from: private */
    public void flushPendingLocalPinnedObjects(LogoutListener logoutListener) {
        if (!this.isRetrievingPinnedObjects) {
            for (PinnedObject next : this.pendingLocalPinnedObjects) {
                addLocalPinnedObject(next);
                putPendingAction(next, PinnedObjectAction.ADD, true, (IListener<ProxyBundleWrapper>) null, logoutListener);
            }
            this.pendingLocalPinnedObjects.clear();
        }
    }

    @Deprecated
    private boolean hasPinnedObject(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, int i) {
        for (ModelRef<PinnedObject> modelRef : this.localPinnedObjects) {
            PinnedObject pinnedObject = (PinnedObject) modelRef.get();
            if (pinnedObject.getType() == pinnedObjectType && pinnedObject.getModel() == pinnedObjectModel && pinnedObject.getModelId() == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(ProxyBundleWrapper proxyBundleWrapper) {
        if (proxyBundleWrapper != null) {
            long time = new Date().getTime();
            C13636q b = C13636q.m31181b(this.contextContainer);
            if (!b.mo53292a(KEY_LAST_PINNED_TIME)) {
                b.mo53302m(KEY_LAST_PINNED_TIME, time);
            } else if (b.mo53297h(KEY_LAST_PINNED_TIME, 0) > TimeUnit.DAYS.toMillis(NB_DAYS_BETWEEN_PINNED_UPDATES) + time) {
                b.mo53302m(KEY_LAST_PINNED_TIME, time);
                retrievePinnedObjects((IListener<ProxyBundleWrapper>) null, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, (LogoutListener) null);
            }
        }
    }

    private void removePinnedObject(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, AbstractModel abstractModel, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        PinnedObject pinnedObject = new PinnedObject(pinnedObjectType, pinnedObjectModel, new Date(), abstractModel);
        removeLocalPinnedObject(pinnedObject);
        putPendingAction(pinnedObject, PinnedObjectAction.REMOVE, isLogged(), iListener, logoutListener);
    }

    /* access modifiers changed from: private */
    public void sendAllPendingActions(LogoutListener logoutListener) {
        for (Map.Entry entry : new HashMap(this.pendingActions).entrySet()) {
            sendPendingAction((PinnedObject) ((ModelRef) entry.getKey()).get(), (PinnedObjectAction) entry.getValue(), (IListener<ProxyBundleWrapper>) null, logoutListener);
        }
    }

    private void sendPendingAction(PinnedObject pinnedObject, PinnedObjectAction pinnedObjectAction, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        removePendingAction(pinnedObject);
        if (this.pendingActions.isEmpty()) {
            stopTimerActionsSending(false);
        }
        this.proxyPool.executeProxyAction(new C11341c(pinnedObject, pinnedObjectAction, logoutListener, iListener), getProxyInputSend(pinnedObjectAction, pinnedObject, logoutListener));
    }

    /* access modifiers changed from: private */
    public void sortLocalPinnedObjects() {
        try {
            Collections.sort(this.localPinnedObjects, this.comparator);
        } catch (Exception e) {
            C13633n.m31165u(this, e);
        }
    }

    /* access modifiers changed from: package-private */
    public void addLocalPinnedObject(PinnedObject pinnedObject) {
        ModelRef modelReferenceOrNew = ModelRef.getModelReferenceOrNew(pinnedObject);
        this.localPinnedObjects.remove(modelReferenceOrNew);
        this.localPinnedObjects.add(modelReferenceOrNew);
        sortLocalPinnedObjects();
    }

    @Deprecated
    public void addMerchantReminder(BaseMerchant baseMerchant, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (baseMerchant != null) {
            addPinnedObject(PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, baseMerchant, iListener, logoutListener);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void addMerchantSave(BaseMerchant baseMerchant, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (baseMerchant != null) {
            addPinnedObject(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT, baseMerchant, iListener, logoutListener);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void addOfferSave(BaseCoupon baseCoupon, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (baseCoupon != null) {
            addPinnedObject(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON, baseCoupon, iListener, logoutListener);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public abstract CacheBundleInputAdd getCacheBundleInputAdd();

    /* access modifiers changed from: protected */
    public abstract ICacheMethodType getCacheMethodGetList();

    public List<PinnedObject> getMerchantsReminders() {
        return getPinnedObjects(PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT);
    }

    public List<PinnedObject> getMerchantsSave() {
        return getPinnedObjects(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT);
    }

    public List<PinnedObject> getOffersSaves() {
        return getPinnedObjects(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON);
    }

    /* access modifiers changed from: package-private */
    public Map<ModelRef<PinnedObject>, PinnedObjectAction> getPendingActions() {
        return this.pendingActions;
    }

    public List<PinnedObject> getPinnedObjects() {
        return getPinnedObjects((PinnedObjectType) null, (PinnedObjectModel) null);
    }

    /* access modifiers changed from: protected */
    public abstract ProxyBundleInput getProxyInputGetList(ProxyBundleInput.ProxySourcesOption proxySourcesOption, LogoutListener logoutListener);

    /* access modifiers changed from: protected */
    public abstract ProxyBundleInput getProxyInputSend(PinnedObjectAction pinnedObjectAction, PinnedObject pinnedObject, LogoutListener logoutListener);

    /* access modifiers changed from: protected */
    public ProxyActionsPool getProxyPool() {
        return this.proxyPool;
    }

    /* access modifiers changed from: protected */
    public abstract PinnedObject[] getResponseObjectGetList(ProxyBundleOutput proxyBundleOutput);

    /* access modifiers changed from: protected */
    public abstract IProxyMethodType getSendMethodType(PinnedObjectAction pinnedObjectAction);

    @Deprecated
    public boolean hasMerchantReminder(BaseMerchant baseMerchant) {
        if (baseMerchant != null) {
            return hasPinnedObject(PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, baseMerchant.getMerchantId());
        }
        throw new IllegalArgumentException();
    }

    public boolean hasMerchantSave(BaseMerchant baseMerchant) {
        if (baseMerchant != null) {
            return hasPinnedObject(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT, baseMerchant.getMerchantId());
        }
        throw new IllegalArgumentException();
    }

    public boolean hasOfferSave(BaseCoupon baseCoupon) {
        if (baseCoupon != null) {
            return hasPinnedObject(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON, baseCoupon.getCouponId());
        }
        throw new IllegalArgumentException();
    }

    public void init() {
        init((LocalPinnedObjectsComparator) null);
    }

    /* access modifiers changed from: protected */
    public abstract boolean isLogged();

    public void onLogIn() {
        if (isLogged()) {
            retrievePinnedObjects((IListener<ProxyBundleWrapper>) null, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, (LogoutListener) null);
            return;
        }
        throw new IllegalStateException("Not logged in");
    }

    public void onLogOut() {
        if (!isLogged()) {
            this.proxyPool.cancelAndRemoveAllActions();
            this.pendingActions.clear();
            stopTimerActionsSending(false);
            this.localPinnedObjects.clear();
            CacheBundleInputClear cacheBundleInputClear = new CacheBundleInputClear(this.contextContainer, getCacheMethodGetList());
            cacheBundleInputClear.getMethodType().getCache(this.contextContainer).executeCacheActionClear((ICacheListenerClear) null, cacheBundleInputClear);
            return;
        }
        throw new IllegalStateException("Still logged out");
    }

    /* access modifiers changed from: package-private */
    public void putPendingAction(PinnedObject pinnedObject, PinnedObjectAction pinnedObjectAction, boolean z, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        boolean z2;
        ModelRef modelReferenceOrNew = ModelRef.getModelReferenceOrNew(pinnedObject);
        if (this.pendingActions.get(modelReferenceOrNew) == PinnedObjectAction.getInverse(pinnedObjectAction)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.pendingActions.remove(modelReferenceOrNew);
        if (!z2) {
            this.pendingActions.put(modelReferenceOrNew, pinnedObjectAction);
            if (z) {
                sendPendingAction(pinnedObject, pinnedObjectAction, iListener, logoutListener);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void removeLocalPinnedObject(PinnedObject pinnedObject) {
        this.localPinnedObjects.remove(ModelRef.getModelReferenceOrNew(pinnedObject));
    }

    @Deprecated
    public void removeMerchantReminder(BaseMerchant baseMerchant, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (baseMerchant != null) {
            removePinnedObject(PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, baseMerchant, iListener, logoutListener);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void removeMerchantSave(BaseMerchant baseMerchant, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (baseMerchant != null) {
            removePinnedObject(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT, baseMerchant, iListener, logoutListener);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void removeOfferSave(BaseCoupon baseCoupon, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (baseCoupon != null) {
            removePinnedObject(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON, baseCoupon, iListener, logoutListener);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public void removePendingAction(PinnedObject pinnedObject) {
        this.pendingActions.remove(ModelRef.getModelReferenceOrNew(pinnedObject));
    }

    public void retrievePinnedObjects(IListener<ProxyBundleWrapper> iListener, ProxyBundleInput.ProxySourcesOption proxySourcesOption, LogoutListener logoutListener) {
        this.proxyPool.cancelAndRemoveAllActions();
        stopTimerActionsSending(true);
        this.isRetrievingPinnedObjects = true;
        this.proxyPool.executeProxyAction(new C11340b(logoutListener, iListener), getProxyInputGetList(proxySourcesOption, logoutListener));
    }

    /* access modifiers changed from: package-private */
    public void startTimerActionsSending(boolean z) {
        if (z || !this.isTimerLocked) {
            this.isTimerLocked = false;
            if (!this.pendingActions.isEmpty() && this.timerActionsSending == null) {
                Timer timer = new Timer();
                this.timerActionsSending = timer;
                timer.scheduleAtFixedRate(new C11338a(), 10000, 10000);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void stopTimerActionsSending(boolean z) {
        Timer timer = this.timerActionsSending;
        if (timer != null) {
            timer.cancel();
            this.timerActionsSending = null;
            this.isTimerLocked = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLocalPinnedObjectsCache() {
        CacheBundleInputAdd cacheBundleInputAdd = getCacheBundleInputAdd();
        cacheBundleInputAdd.getMethodType().getCache(this.contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, cacheBundleInputAdd);
    }

    public List<PinnedObject> getPinnedObjects(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel) {
        ArrayList arrayList = new ArrayList();
        for (ModelRef<PinnedObject> modelRef : this.localPinnedObjects) {
            PinnedObject pinnedObject = (PinnedObject) modelRef.get();
            if ((pinnedObjectType == null || pinnedObject.getType() == pinnedObjectType) && (pinnedObjectModel == null || pinnedObject.getModel() == pinnedObjectModel)) {
                arrayList.add(pinnedObject);
            }
        }
        return arrayList;
    }

    public void init(@Nullable LocalPinnedObjectsComparator localPinnedObjectsComparator) {
        if (localPinnedObjectsComparator != null) {
            this.comparator = localPinnedObjectsComparator;
        }
        if (isLogged()) {
            retrievePinnedObjects(new C11349g(this), ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, (LogoutListener) null);
        }
    }

    public boolean hasMerchantReminder(@NonNull String str) {
        return hasPinnedObject(PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, str);
    }

    private boolean hasPinnedObject(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, @NonNull String str) {
        for (ModelRef<PinnedObject> modelRef : this.localPinnedObjects) {
            PinnedObject pinnedObject = (PinnedObject) modelRef.get();
            if (pinnedObject.getType() == pinnedObjectType && pinnedObject.getModel() == pinnedObjectModel && String.valueOf(pinnedObject.getModelId()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
