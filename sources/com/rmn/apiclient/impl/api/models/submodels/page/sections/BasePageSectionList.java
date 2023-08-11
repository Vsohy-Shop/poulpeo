package com.rmn.apiclient.impl.api.models.submodels.page.sections;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.descriptor.ProxyMethodDescriptor;
import com.rmn.apiclient.core.model.BaseModel;
import com.rmn.apiclient.impl.api.methods.ContainerApi;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.apiclient.impl.api.models.submodels.page.SectionRepresentation;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasePageSectionList extends BasePageSection {
    @Nullable
    public final String description = null;
    public final int limit = BaseModel.defaultNumber();
    @Nullable
    public final URL link = null;
    @Nullable
    private final String[] list_technical_name = null;
    @Nullable
    public final SectionRepresentation.List representation = SectionRepresentation.List.VERTICAL;
    private final boolean sponsored = BaseModel.defaultBoolean();
    @Nullable
    public final String title = null;

    @Nullable
    private List<APIParam<?>> getAdditionalCallParams(@NonNull ProxyMethodDescriptor proxyMethodDescriptor) {
        Object tryCastToParamType;
        if (this.link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if ("api".equals(this.link.getHost())) {
            for (String split : this.link.getQuery().split("&")) {
                String[] split2 = split.split("=");
                if (split2.length == 2) {
                    String str = split2[0];
                    String str2 = split2[1];
                    ParamDescriptor<?> findParamDescriptor = proxyMethodDescriptor.paramDescriptors.findParamDescriptor(str);
                    if (!(findParamDescriptor == null || (tryCastToParamType = findParamDescriptor.tryCastToParamType(str2)) == null)) {
                        arrayList.add(new APIParam(str, tryCastToParamType));
                    }
                }
            }
        }
        return arrayList;
    }

    private ContainerApi.GetContainerContent newMethodGetContainerContent(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
        ContainerApi.GetContainerContent getContainerContent = new ContainerApi.GetContainerContent(str, strategyChain);
        List<APIParam<?>> additionalCallParams = getAdditionalCallParams(getContainerContent.getMethodDescriptor());
        if (additionalCallParams != null) {
            for (APIParam<?> addParam : additionalCallParams) {
                getContainerContent.getProxyInputBuilder().addParam(addParam);
            }
        }
        return getContainerContent;
    }

    @NonNull
    public String getTechnicalName() {
        return this.list_technical_name[0];
    }

    @Nullable
    public String[] getTechnicalNames() {
        String[] strArr = this.list_technical_name;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public boolean isSponsored() {
        return this.sponsored;
    }

    public boolean isValid() {
        String[] strArr = this.list_technical_name;
        if (strArr == null || strArr.length <= 0 || TextUtils.isEmpty(strArr[0])) {
            return false;
        }
        return true;
    }

    @NonNull
    public List<ContainerApi.GetContainerContent> newMethodsGetContainerContent(@NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
        ArrayList arrayList = new ArrayList(this.list_technical_name.length);
        for (String newMethodGetContainerContent : this.list_technical_name) {
            arrayList.add(newMethodGetContainerContent(newMethodGetContainerContent, strategyChain));
        }
        return arrayList;
    }
}
