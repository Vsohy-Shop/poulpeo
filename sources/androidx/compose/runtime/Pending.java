package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4528:1\n1#2:4529\n1855#3,2:4530\n1855#3,2:4532\n1855#3,2:4534\n1855#3,2:4536\n1855#3,2:4538\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n156#1:4530,2\n162#1:4532,2\n172#1:4534,2\n178#1:4536,2\n198#1:4538,2\n*E\n"})
/* compiled from: Composer.kt */
final class Pending {
    private int groupIndex;
    private final HashMap<Integer, GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;
    private final Lazy keyMap$delegate;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public Pending(List<KeyInfo> list, int i) {
        boolean z;
        C12775o.m28639i(list, "keyInfos");
        this.keyInfos = list;
        this.startIndex = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.usedKeys = new ArrayList();
            HashMap<Integer, GroupInfo> hashMap = new HashMap<>();
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                KeyInfo keyInfo = this.keyInfos.get(i3);
                hashMap.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(i3, i2, keyInfo.getNodes()));
                i2 += keyInfo.getNodes();
            }
            this.groupInfos = hashMap;
            this.keyMap$delegate = C11901h.m25690b(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final HashMap<Object, LinkedHashSet<KeyInfo>> getKeyMap() {
        return (HashMap) this.keyMap$delegate.getValue();
    }

    public final KeyInfo getNext(int i, Object obj) {
        Object obj2;
        if (obj != null) {
            obj2 = new JoinedKey(Integer.valueOf(i), obj);
        } else {
            obj2 = Integer.valueOf(i);
        }
        return (KeyInfo) ComposerKt.pop(getKeyMap(), obj2);
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        C12775o.m28639i(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        C12775o.m28639i(keyInfo, "keyInfo");
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(KeyInfo keyInfo, int i) {
        C12775o.m28639i(keyInfo, "keyInfo");
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(-1, i, 0));
    }

    public final void registerMoveNode(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i > i2) {
            Collection<GroupInfo> values = this.groupInfos.values();
            C12775o.m28638h(values, "groupInfos.values");
            for (GroupInfo groupInfo : values) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (i > nodeIndex || nodeIndex >= i + i3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    groupInfo.setNodeIndex((nodeIndex - i) + i2);
                } else {
                    if (i2 > nodeIndex || nodeIndex >= i) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        groupInfo.setNodeIndex(nodeIndex + i3);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<GroupInfo> values2 = this.groupInfos.values();
            C12775o.m28638h(values2, "groupInfos.values");
            for (GroupInfo groupInfo2 : values2) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (i > nodeIndex2 || nodeIndex2 >= i + i3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    groupInfo2.setNodeIndex((nodeIndex2 - i) + i2);
                } else {
                    if (i + 1 > nodeIndex2 || nodeIndex2 >= i2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        groupInfo2.setNodeIndex(nodeIndex2 - i3);
                    }
                }
            }
        }
    }

    public final void registerMoveSlot(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > i2) {
            Collection<GroupInfo> values = this.groupInfos.values();
            C12775o.m28638h(values, "groupInfos.values");
            for (GroupInfo groupInfo : values) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == i) {
                    groupInfo.setSlotIndex(i2);
                } else {
                    if (i2 > slotIndex || slotIndex >= i) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        groupInfo.setSlotIndex(slotIndex + 1);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<GroupInfo> values2 = this.groupInfos.values();
            C12775o.m28638h(values2, "groupInfos.values");
            for (GroupInfo groupInfo2 : values2) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == i) {
                    groupInfo2.setSlotIndex(i2);
                } else {
                    if (i + 1 > slotIndex2 || slotIndex2 >= i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        groupInfo2.setSlotIndex(slotIndex2 - 1);
                    }
                }
            }
        }
    }

    public final void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        C12775o.m28639i(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int i, int i2) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(i));
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = i2 - groupInfo.getNodeCount();
        groupInfo.setNodeCount(i2);
        if (nodeCount == 0) {
            return true;
        }
        Collection<GroupInfo> values = this.groupInfos.values();
        C12775o.m28638h(values, "groupInfos.values");
        for (GroupInfo groupInfo2 : values) {
            if (groupInfo2.getNodeIndex() >= nodeIndex2 && !C12775o.m28634d(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                groupInfo2.setNodeIndex(nodeIndex);
            }
        }
        return true;
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        C12775o.m28639i(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeCount();
        }
        return keyInfo.getNodes();
    }
}
