package org.andengine.opengl.view;

public enum b {
    STRICT,
    LOOSE_STENCIL,
    LOOSE_DEPTH_AND_STENCIL,
    ANY;

    public abstract boolean a(int i, int i2, int i3, int i4, int i5, int i6);
}
