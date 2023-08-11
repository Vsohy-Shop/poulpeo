package com.rmn.api.p322v2.common.pinned_object;

import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.model.ModelRef;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleWrapper;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectsMultipleManager */
public abstract class PinnedObjectsMultipleManager extends PinnedObjectsManager {

    /* renamed from: com.rmn.api.v2.common.pinned_object.PinnedObjectsMultipleManager$a */
    class C11342a implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ List f17819b;

        /* renamed from: c */
        final /* synthetic */ PinnedObjectAction f17820c;

        /* renamed from: d */
        final /* synthetic */ LogoutListener f17821d;

        /* renamed from: e */
        final /* synthetic */ IListener f17822e;

        C11342a(List list, PinnedObjectAction pinnedObjectAction, LogoutListener logoutListener, IListener iListener) {
            this.f17819b = list;
            this.f17820c = pinnedObjectAction;
            this.f17821d = logoutListener;
            this.f17822e = iListener;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
            if (status != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
                if (status == ProxyBundleOutput.ProxyOutputStatus.REQUEST_FAILED) {
                    for (PinnedObject putPendingAction : this.f17819b) {
                        PinnedObjectsMultipleManager.this.putPendingAction(putPendingAction, this.f17820c, false, (IListener<ProxyBundleWrapper>) null, this.f17821d);
                    }
                    PinnedObjectsMultipleManager.this.startTimerActionsSending(false);
                }
                IListener iListener = this.f17822e;
                if (iListener != null) {
                    iListener.mo40744J0(new ProxyBundleWrapper(proxyBundleInput, proxyBundleOutput));
                }
                if (status != ProxyBundleOutput.ProxyOutputStatus.REQUEST_FAILED) {
                    PinnedObjectsMultipleManager.this.updateLocalPinnedObjectsCache();
                }
            }
        }
    }

    protected PinnedObjectsMultipleManager(ContextContainer contextContainer) {
        super(contextContainer);
    }

    private void addPinnedObjects(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, List<AbstractModel> list, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (isLogged()) {
            for (AbstractModel pinnedObject : list) {
                PinnedObject pinnedObject2 = new PinnedObject(pinnedObjectType, pinnedObjectModel, new Date(), pinnedObject);
                addLocalPinnedObject(pinnedObject2);
                putPendingAction(pinnedObject2, PinnedObjectAction.ADD, false, iListener, logoutListener);
            }
            sendAllPendingActions(iListener, logoutListener);
        }
    }

    private void removePendingActions(List<PinnedObject> list) {
        for (PinnedObject removePendingAction : list) {
            removePendingAction(removePendingAction);
        }
    }

    private void removePinnedObjects(PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, List<AbstractModel> list, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        for (AbstractModel pinnedObject : list) {
            PinnedObject pinnedObject2 = new PinnedObject(pinnedObjectType, pinnedObjectModel, new Date(), pinnedObject);
            removeLocalPinnedObject(pinnedObject2);
            putPendingAction(pinnedObject2, PinnedObjectAction.REMOVE, false, iListener, logoutListener);
        }
        if (isLogged()) {
            sendAllPendingActions(iListener, logoutListener);
        }
    }

    private void sendAllPendingActions(IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        for (Map.Entry next : getPendingActions().entrySet()) {
            PinnedObject pinnedObject = (PinnedObject) ((ModelRef) next.getKey()).get();
            PinnedObjectModel model = pinnedObject.getModel();
            PinnedObjectType type = pinnedObject.getType();
            PinnedObjectAction pinnedObjectAction = (PinnedObjectAction) next.getValue();
            if (model == PinnedObjectModel.MERCHANT) {
                sortPinnedObjetIntoList(pinnedObject, pinnedObjectAction, type, arrayList2, arrayList, arrayList6, arrayList5);
            } else if (model == PinnedObjectModel.COUPON) {
                sortPinnedObjetIntoList(pinnedObject, pinnedObjectAction, type, arrayList4, arrayList3, arrayList8, arrayList7);
            }
        }
        if (arrayList2.size() > 0) {
            sendPendingActions(arrayList2, PinnedObjectAction.ADD, iListener, PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, logoutListener);
        }
        if (arrayList.size() > 0) {
            sendPendingActions(arrayList, PinnedObjectAction.ADD, iListener, PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT, logoutListener);
        }
        if (arrayList4.size() > 0) {
            sendPendingActions(arrayList4, PinnedObjectAction.ADD, iListener, PinnedObjectType.REMINDER, PinnedObjectModel.COUPON, logoutListener);
        }
        if (arrayList3.size() > 0) {
            sendPendingActions(arrayList3, PinnedObjectAction.ADD, iListener, PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON, logoutListener);
        }
        if (arrayList6.size() > 0) {
            sendPendingActions(arrayList6, PinnedObjectAction.REMOVE, iListener, PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, logoutListener);
        }
        if (arrayList5.size() > 0) {
            sendPendingActions(arrayList5, PinnedObjectAction.REMOVE, iListener, PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT, logoutListener);
        }
        if (arrayList8.size() > 0) {
            sendPendingActions(arrayList8, PinnedObjectAction.REMOVE, iListener, PinnedObjectType.REMINDER, PinnedObjectModel.COUPON, logoutListener);
        }
        if (arrayList7.size() > 0) {
            sendPendingActions(arrayList7, PinnedObjectAction.REMOVE, iListener, PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON, logoutListener);
        }
    }

    private void sendPendingActions(List<PinnedObject> list, PinnedObjectAction pinnedObjectAction, IListener<ProxyBundleWrapper> iListener, PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, LogoutListener logoutListener) {
        removePendingActions(list);
        if (getPendingActions().isEmpty()) {
            stopTimerActionsSending(false);
        }
        List<PinnedObject> list2 = list;
        getProxyPool().executeProxyAction(new C11342a(list2, pinnedObjectAction, logoutListener, iListener), getProxyInputSend(pinnedObjectAction, list2, pinnedObjectType, pinnedObjectModel, logoutListener));
    }

    private void sortPinnedObjetIntoList(PinnedObject pinnedObject, PinnedObjectAction pinnedObjectAction, PinnedObjectType pinnedObjectType, List<PinnedObject> list, List<PinnedObject> list2, List<PinnedObject> list3, List<PinnedObject> list4) {
        if (pinnedObjectAction == PinnedObjectAction.ADD) {
            if (pinnedObjectType == PinnedObjectType.REMINDER) {
                list.add(pinnedObject);
            } else if (pinnedObjectType == PinnedObjectType.SAVE_FOR_LATER) {
                list2.add(pinnedObject);
            }
        } else if (pinnedObjectAction != PinnedObjectAction.REMOVE) {
        } else {
            if (pinnedObjectType == PinnedObjectType.REMINDER) {
                list3.add(pinnedObject);
            } else if (pinnedObjectType == PinnedObjectType.SAVE_FOR_LATER) {
                list4.add(pinnedObject);
            }
        }
    }

    public void addMerchantReminders(Collection<BaseMerchant> collection, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        addPinnedObjects(PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, arrayList, iListener, logoutListener);
    }

    public void addMerchantsSave(Collection<BaseMerchant> collection, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        addPinnedObjects(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT, arrayList, iListener, logoutListener);
    }

    public void addOffersSave(Collection<BaseCoupon> collection, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        addPinnedObjects(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON, arrayList, iListener, logoutListener);
    }

    /* access modifiers changed from: protected */
    public ProxyBundleInput getProxyInputSend(PinnedObjectAction pinnedObjectAction, PinnedObject pinnedObject, LogoutListener logoutListener) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(pinnedObject);
        return getProxyInputSend(pinnedObjectAction, arrayList, pinnedObject.getType(), pinnedObject.getModel(), logoutListener);
    }

    /* access modifiers changed from: protected */
    public abstract ProxyBundleInput getProxyInputSend(PinnedObjectAction pinnedObjectAction, List<PinnedObject> list, PinnedObjectType pinnedObjectType, PinnedObjectModel pinnedObjectModel, LogoutListener logoutListener);

    public void removeMerchantReminders(Collection<BaseMerchant> collection, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        removePinnedObjects(PinnedObjectType.REMINDER, PinnedObjectModel.MERCHANT, arrayList, iListener, logoutListener);
    }

    public void removeMerchantsSave(Collection<BaseMerchant> collection, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        removePinnedObjects(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.MERCHANT, arrayList, iListener, logoutListener);
    }

    public void removeOffersSave(Collection<BaseCoupon> collection, IListener<ProxyBundleWrapper> iListener, LogoutListener logoutListener) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        removePinnedObjects(PinnedObjectType.SAVE_FOR_LATER, PinnedObjectModel.COUPON, arrayList, iListener, logoutListener);
    }
}
