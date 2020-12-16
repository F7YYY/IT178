package org.andengine.opengl.c;

public enum c {
    UNDEFINED(-1, -1, -1, -1),
    RGBA_4444(6408, 6408, 32819, 16),
    RGBA_5551(6407, 6408, 32820, 16),
    RGBA_8888(6408, 6408, 5121, 32),
    RGB_565(6407, 6407, 33635, 16),
    A_8(6406, 6406, 5121, 8),
    I_8(6409, 6409, 5121, 8),
    AI_88(6410, 6410, 5121, 16);
    
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    private c(int i2, int i3, int i4, int i5) {
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
    }

    public int a() {
        return this.i;
    }

    public int b() {
        return this.j;
    }

    public int c() {
        return this.k;
    }
}
