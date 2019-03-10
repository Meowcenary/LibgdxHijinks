package com.libgdxtest.screens;

import com.badlogic.gdx.graphics.Texture;

public class Button {
    public Texture activeImage;
    public Texture inactiveImage;
    public int height;
    public int width;

    public Button (String activeImage, String inactiveImage, int height, int width) {
       this.activeImage = new Texture(activeImage);
       this.inactiveImage = new Texture(inactiveImage);
       this.height = height;
       this.width = width;
    }
}
