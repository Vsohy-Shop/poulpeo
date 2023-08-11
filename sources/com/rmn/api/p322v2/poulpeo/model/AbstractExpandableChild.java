package com.rmn.api.p322v2.poulpeo.model;

/* renamed from: com.rmn.api.v2.poulpeo.model.AbstractExpandableChild */
public abstract class AbstractExpandableChild {
    private boolean groupIsLast;
    private int nbChildrenInGroup = 1;
    private int position;

    public int getNbChildrenInGroup() {
        return this.nbChildrenInGroup;
    }

    public int getPosition() {
        return this.position;
    }

    public boolean groupIsLast() {
        return this.groupIsLast;
    }

    public boolean isFirst() {
        if (this.position == 0) {
            return true;
        }
        return false;
    }

    public boolean isLast() {
        if (this.position == this.nbChildrenInGroup - 1) {
            return true;
        }
        return false;
    }

    public void setChildrenInfo(int i, int i2, boolean z) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        } else if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i2 < i) {
            this.nbChildrenInGroup = i;
            this.position = i2;
            this.groupIsLast = z;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
