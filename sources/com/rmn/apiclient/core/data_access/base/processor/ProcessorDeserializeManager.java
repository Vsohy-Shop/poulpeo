package com.rmn.apiclient.core.data_access.base.processor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data.descriptor.IResourceDescriptor;
import com.rmn.apiclient.core.data.descriptor.RelationshipMapping;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.core.data.serializer.IDocumentSerializer;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.core.model.ModelRelationshipList;
import com.rmn.apiclient.core.reflection.ReflectionUtils;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIDocumentDescriptor;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIDocument;
import com.rmn.apiclient.impl.jsonapi.structure.JSONAPIResourceId;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public class ProcessorDeserializeManager {
    private static void assignModelRelationship(@NonNull IDocument iDocument, @NonNull ResourceDescriptorSet resourceDescriptorSet, @NonNull IModel iModel, @NonNull RelationshipMapping relationshipMapping) {
        IResourceDescriptor<?> findResourceDescriptor;
        ModelRelationshipList modelRelationshipList;
        IResource<?> findResource;
        Field field = ReflectionUtils.getField(iModel, relationshipMapping.fieldNameForRelationship);
        if (field != null && (findResourceDescriptor = resourceDescriptorSet.findResourceDescriptor(relationshipMapping.getResourceIdsTypes())) != null) {
            String resourceType = findResourceDescriptor.getResourceType();
            Class<?> type = field.getType();
            if (ModelRelationship.class.isAssignableFrom(type)) {
                ModelRelationship modelRelationship = (ModelRelationship) ReflectionUtils.getValue(iModel, field);
                if (modelRelationship != null && (findResource = iDocument.findResource(new JSONAPIResourceId(resourceType, modelRelationship.f18064id))) != null) {
                    modelRelationship.updateModelReference(findResource.getModelReference());
                }
            } else if (ModelRelationshipList.class.isAssignableFrom(type) && (modelRelationshipList = (ModelRelationshipList) ReflectionUtils.getValue(iModel, field)) != null) {
                HashSet hashSet = new HashSet();
                for (String jSONAPIResourceId : modelRelationshipList.getIds()) {
                    IResource<?> findResource2 = iDocument.findResource(new JSONAPIResourceId(resourceType, jSONAPIResourceId));
                    if (findResource2 != null) {
                        hashSet.add(findResource2.getModelReference());
                    }
                }
                modelRelationshipList.updateModelReferences(hashSet);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.rmn.apiclient.core.data.structure.IResource, com.rmn.apiclient.core.data.structure.IResource<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void assignModelRelationships(@androidx.annotation.NonNull com.rmn.apiclient.core.data.structure.IDocument r4, @androidx.annotation.NonNull com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet r5, @androidx.annotation.NonNull com.rmn.apiclient.core.data.structure.IResource<?> r6) {
        /*
            com.rmn.apiclient.core.data.structure.IResourceId r0 = r6.getResourceId()
            java.lang.String r0 = r0.getType()
            com.rmn.apiclient.core.data.descriptor.IResourceDescriptor r0 = r5.findResourceDescriptor((java.lang.String) r0)
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            com.rmn.apiclient.core.data.structure.RelationshipSet r1 = r6.getRelationships()
            java.util.Iterator r1 = r1.iterator()
        L_0x0017:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r1.next()
            com.rmn.apiclient.core.data.structure.IRelationship r2 = (com.rmn.apiclient.core.data.structure.IRelationship) r2
            com.rmn.apiclient.core.data.descriptor.RelationshipMappingSet r3 = r0.getRelationshipMappings()
            java.lang.String r2 = r2.getName()
            com.rmn.apiclient.core.data.descriptor.RelationshipMapping r2 = r3.findWithRelationshipName(r2)
            if (r2 != 0) goto L_0x0032
            goto L_0x0017
        L_0x0032:
            com.rmn.apiclient.core.model.IModel r3 = r6.getModel()
            assignModelRelationship(r4, r5, r3, r2)
            goto L_0x0017
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager.assignModelRelationships(com.rmn.apiclient.core.data.structure.IDocument, com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet, com.rmn.apiclient.core.data.structure.IResource):void");
    }

    @Nullable
    private static IDocument deserialize(@NonNull IDocumentSerializer iDocumentSerializer, @Nullable String str) {
        if (str == null) {
            return null;
        }
        return (JSONAPIDocument) iDocumentSerializer.deserialize(new JSONObject(str));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.rmn.apiclient.core.data_access.base.call.BaseOutput, com.rmn.apiclient.core.data_access.base.call.BaseOutput<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void processDeserialize(@androidx.annotation.NonNull com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor<?, ?> r2, @androidx.annotation.NonNull com.rmn.apiclient.core.data.serializer.IDocumentSerializer r3, @androidx.annotation.NonNull com.rmn.apiclient.core.data_access.base.call.BaseOutput<?> r4, int r5, @androidx.annotation.NonNull com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener<com.rmn.apiclient.core.data_access.base.call.BaseOutput<?>> r6, @androidx.annotation.NonNull com.rmn.apiclient.core.data_access.base.call.IOutputFactory r7) {
        /*
            java.lang.String r0 = r4.getRawResponse()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x000e
            r6.onActionProcessed(r2, r4)
            return
        L_0x000e:
            com.rmn.apiclient.core.data.structure.IDocument r3 = deserialize(r3, r0)     // Catch:{ Exception -> 0x0033 }
            if (r3 == 0) goto L_0x0021
            com.rmn.apiclient.core.data_access.base.call.BaseInput r5 = r4.getInput()
            com.rmn.apiclient.core.data_access.base.descriptor.BaseMethodDescriptor r5 = r5.getMethodDescriptor()
            com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor r5 = r5.documentDescriptor
            processResolveRelationships(r2, r5, r3)
        L_0x0021:
            com.rmn.apiclient.core.data_access.base.call.OutputStatus r5 = com.rmn.apiclient.core.data_access.base.call.OutputStatus.SUCCESS
            com.rmn.apiclient.core.data_access.base.call.IOutputBuilder r4 = r7.newBuilder(r4, r5)
            com.rmn.apiclient.core.data_access.base.call.IOutputBuilder r3 = r4.setDocument(r3)
            com.rmn.apiclient.core.data_access.base.call.BaseOutput r3 = r3.build()
            r6.onActionProcessed(r2, r3)
            return
        L_0x0033:
            r3 = move-exception
            java.lang.Class<com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager> r1 = com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager.class
            p446vd.C13633n.m31165u(r1, r3)
            com.rmn.apiclient.core.data_access.base.call.OutputStatus r3 = com.rmn.apiclient.core.data_access.base.call.OutputStatus.FAILURE
            com.rmn.apiclient.core.data_access.base.call.IOutputBuilder r3 = r7.newBuilder(r4, r3)
            com.rmn.apiclient.core.data_access.base.call.exceptions.ParsingCallException r4 = new com.rmn.apiclient.core.data_access.base.call.exceptions.ParsingCallException
            r4.<init>(r5, r0)
            com.rmn.apiclient.core.data_access.base.call.IOutputBuilder r3 = r3.setException(r4)
            com.rmn.apiclient.core.data_access.base.call.BaseOutput r3 = r3.build()
            r6.onActionProcessed(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.apiclient.core.data_access.base.processor.ProcessorDeserializeManager.processDeserialize(com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor, com.rmn.apiclient.core.data.serializer.IDocumentSerializer, com.rmn.apiclient.core.data_access.base.call.BaseOutput, int, com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener, com.rmn.apiclient.core.data_access.base.call.IOutputFactory):void");
    }

    public static void processResolveRelationships(@NonNull BaseActionProcessor<?, ?> baseActionProcessor, @Nullable IDocumentDescriptor iDocumentDescriptor, @NonNull IDocument iDocument) {
        if (iDocumentDescriptor instanceof JSONAPIDocumentDescriptor) {
            Iterator<IResource<?>> it = iDocument.getDataResources().iterator();
            while (it.hasNext()) {
                assignModelRelationships(iDocument, ((JSONAPIDocumentDescriptor) iDocumentDescriptor).resourceDescriptors, it.next());
            }
            Iterator<IResource<?>> it2 = iDocument.getIncludedResources().iterator();
            while (it2.hasNext()) {
                assignModelRelationships(iDocument, ((JSONAPIDocumentDescriptor) iDocumentDescriptor).resourceDescriptors, it2.next());
            }
        }
    }
}
