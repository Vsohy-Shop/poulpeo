package com.rmn.api.p322v2.poulpeo.cache.methods;

import com.rmn.api.p322v2.main.cache.BaseCacheMethodType;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.BaseCacheAccess;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessList;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAccessSingleElement;
import com.rmn.api.p322v2.main.cache.cacheaccess.CacheAggregated;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToIdArray;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableParamsToInt;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.poulpeo.cache.PLPModelCaches;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.SupportTicket;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsSupportTicket */
public class CacheMethodsSupportTicket {
    public static final ICacheMethodType GET_DETAILS = new BaseCacheMethodType(new CacheAccessElement(PLPMethodParameters.ID_SUPPORT_TICKET_REQUIRED, PLPMethodReturns.SUPPORT_TICKET_DETAIL, PLPModelCaches.CACHE_MODEL_SUPPORT_TICKET));
    public static final ICacheMethodType GET_LIST = new BaseCacheMethodType(new CacheAggregated(new C11411a()));
    public static final ICacheMethodType SUPPORT_TICKET_HELP_GET_DETAILS;
    /* access modifiers changed from: private */
    public static final CacheAccessSingleElement cacheTypeSupportTicketHelp;

    /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsSupportTicket$a */
    class C11411a extends ArrayList<BaseCacheAccess> {

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsSupportTicket$a$a */
        class C11412a extends HashSet<RMNMethodParam> {
            C11412a() {
                add(PLPMethodParameters.SUPPORT_TICKET_STATUS_FILTER);
                add(PLPMethodParameters.OFFSET);
                add(PLPMethodParameters.LIMIT);
            }
        }

        /* renamed from: com.rmn.api.v2.poulpeo.cache.methods.CacheMethodsSupportTicket$a$b */
        class C11413b extends HashSet<RMNMethodParam> {
            C11413b() {
                add(PLPMethodParameters.SUPPORT_TICKET_STATUS_FILTER);
            }
        }

        C11411a() {
            add(new CacheAccessList(PLPMethodReturns.SUPPORT_TICKET_ARRAY, PLPMethodReturns.TOTAL_COUNT, PLPModelCaches.CACHE_MODEL_SUPPORT_TICKET, new CacheTableParamsToIdArray(SupportTicket.class, PLPMethodNames.SUPPORT_TICKET_GET_LIST, 24, new C11412a(), PLPModelCaches.CACHE_MODEL_SUPPORT_TICKET.getIdType()), new CacheTableParamsToInt(SupportTicket.class, PLPMethodNames.SUPPORT_TICKET_GET_LIST, 24, new C11413b())));
            add(CacheMethodsSupportTicket.cacheTypeSupportTicketHelp);
        }
    }

    static {
        CacheAccessSingleElement cacheAccessSingleElement = new CacheAccessSingleElement(PLPMethodReturns.SUPPORT_TICKET_HELP, PLPModelCaches.CACHE_MODEL_SUPPORT_TICKET_HELP);
        cacheTypeSupportTicketHelp = cacheAccessSingleElement;
        SUPPORT_TICKET_HELP_GET_DETAILS = new BaseCacheMethodType(cacheAccessSingleElement);
    }

    public static ICacheMethodType[] getMethodTypes() {
        return new ICacheMethodType[]{GET_LIST};
    }
}
