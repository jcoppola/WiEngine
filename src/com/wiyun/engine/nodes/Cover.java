/*
 * Copyright (c) 2010 WiYun Inc.
 * Author: luma(stubma@gmail.com)
 *
 * For all entities this program is free software; you can redistribute
 * it and/or modify it under the terms of the 'WiEngine' license with
 * the additional provision that 'WiEngine' must be credited in a manner
 * that can be be observed by end users, for example, in the credits or during
 * start up. (please find WiEngine logo in sdk's logo folder)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.wiyun.engine.nodes;

import com.wiyun.engine.BaseWYObject;
import com.wiyun.engine.opengl.Texture2D;
import com.wiyun.engine.types.WYVertex3D;

/**
 * 表示节点\link CoverFlow CoverFlowx\endlink的一个显示页面，CoverFlow
 * 用双向链表维护所有显示页面
 */
public class Cover extends BaseWYObject {
	protected Cover() {
	}
	
	protected Cover(int pointer){
		super(pointer);
	}
	
	/**
	 * 构造函数
	 *
	 * @param tex 贴图，为提高性能，建议使用2的n次方大小的正方形图片
	 */		
	protected Cover(Texture2D tex) {
		nativeInit(tex);
	}
	
	private native void nativeInit(Texture2D tex);
	
	/**
	 * 指定新位置
	 *
	 * @param posX 新位置x坐标
	 * @param posY 新位置y坐标
	 */
    public native void setPosition(float posX, float posY);
	
    private native int getPositionX();
    private native int getPositionY();   
    private native int getPositionZ();

    /**
	 * 获得当前位置, 调用此函数时应保证当前cover在显示状态
	 */    
    public WYVertex3D getPosition() {
    	return WYVertex3D.make(getPositionX(), getPositionY(), getPositionZ());
    }
    
	/**
	 * 设置绕Y中轴旋转的角度
	 *
	 * @param degree 角度，单位为度，右手规则
	 */
    public native void setRotateY(float degree);
	
	/**
	 * 获得绕Y中轴旋转的角度
	 */
    public native float getRotateY();
	
	/**
	 * 设置缩放
	 *
	 * @param scale 缩放系数
	 */	
    public native void setScale(float scale);

	/**
	 * 获得缩放系数
	 */	
    public native float getScale();
	
    
    private native int nativeGetTexture();

    /**
	 * 获得当前所用贴图
	 */		
    public Texture2D getTexture() {
    	return Texture2D.from(nativeGetTexture());
    }
	
	/**
	 * 设置贴图
	 *
	 * @param tex 新贴图
	 */			
    public native void setTexture(Texture2D tex);

    
    private native int nativeGetNext();    

    /**
	 * 获得链表中的下一个cover
	 */	
    public Cover GetNext() {
    	int pointer = nativeGetNext();
    	if(pointer != 0) {
    		return Cover.from(pointer);
    	}
    	return null;
    }
	
	/**
	 * 设置链表中的下一个cover
	 *
	 * @param next 下一个cover
	 */		
    public native void setNext(Cover next);

    private native int nativeGetPrev();	

    /**
	 * 获得链表中的前一个cover
	 */	
    public Cover getPrev() {
    	int pointer = nativeGetPrev();
    	if(pointer != 0) {
    		return Cover.from(pointer);
    	}
    	return null;
    }
    
	/**
	 * 设置链表中的前一个cover
	 *
	 * @param prev 前一个cover
	 */		
    public native void setPrev(Cover prev);

	/**
	 * 获得是否自动更新
	 */	
    public native boolean getAutoUpdate();

	/**
	 * 设置是否自动更新
	 *
	 * @param bEnable false表示关闭自动更新
	 */		
    public native void setAutoUpdate(boolean bEnable);
    
	/**
	 * 静态方法，创建一个新的cover对象
	 *
	 * @param tex 新cover对象的贴图
	 */		
	public static Cover make(Texture2D tex){
		return new Cover(tex);
	}
	
	/**
	 * 静态方法，从低层指针创建一个对象
	 *
	 * @param pointer native层指针
	 */		
	public static Cover from(int pointer){
		return pointer == 0 ? null : new Cover(pointer);
	}
}