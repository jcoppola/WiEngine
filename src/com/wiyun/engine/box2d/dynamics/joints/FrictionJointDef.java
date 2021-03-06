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
package com.wiyun.engine.box2d.dynamics.joints;

import com.wiyun.engine.types.WYPoint;

public class FrictionJointDef extends JointDef {
	public static FrictionJointDef make() {
		return new FrictionJointDef();
	}
	
	protected FrictionJointDef() {
		nativeNew();
	}

	private native void nativeNew();

	protected FrictionJointDef(int pointer) {
		super(pointer);
	}
	
	/**
	 * 设置锚点a
	 * 
	 * @param x 锚点a的x坐标
	 * @param y 锚点a的y坐标
	 */
	public native void setLocalAnchorA(float x, float y);
	
	/**
	 * 设置锚点b
	 * 
	 * @param x 锚点b的x坐标
	 * @param y 锚点b的y坐标
	 */
	public native void setLocalAnchorB(float x, float y);
	
	/**
	 * 设置可以施加的最大力
	 * 
	 * @param maxForce 最大力
	 */
	public native void setMaxForce(float maxForce);
	
	/**
	 * 获得可以施加的最大力
	 * 
	 * @return 可以施加的最大力
	 */
	public native float getMaxForce();
	
	/**
	 * 设置最大力矩
	 * 
	 * @param maxTorque 最大力矩
	 */
	public native void setMaxTorque(float maxTorque);
	
	/**
	 * 获得最大力矩
	 * 
	 * @return 最大力矩
	 */
	public native float getMaxTorque();
	
	/**
	 * 获得锚点a
	 * 
	 * @return {@link WYPoint}
	 */
	public WYPoint getLocalAnchorA() {
		WYPoint a = WYPoint.makeZero();
		nativeGetLocalAnchorA(a);
		return a;
	}
	
	private native void nativeGetLocalAnchorA(WYPoint a);
	
	/**
	 * 获得锚点b
	 * 
	 * @return {@link WYPoint}
	 */
	public WYPoint getLocalAnchorB() {
		WYPoint a = WYPoint.makeZero();
		nativeGetLocalAnchorB(a);
		return a;
	}
	
	private native void nativeGetLocalAnchorB(WYPoint a);
}
