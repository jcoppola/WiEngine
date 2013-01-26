/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_wiyun_engine_nodes_ColorLayer */

#ifndef _Included_com_wiyun_engine_nodes_ColorLayer
#define _Included_com_wiyun_engine_nodes_ColorLayer
#ifdef __cplusplus
extern "C" {
#endif
#undef com_wiyun_engine_nodes_ColorLayer_INVALID_TAG
#define com_wiyun_engine_nodes_ColorLayer_INVALID_TAG -1L
/*
 * Class:     com_wiyun_engine_nodes_ColorLayer
 * Method:    nativeInit
 * Signature: (Lcom/wiyun/engine/types/WYColor4B;)V
 */
JNIEXPORT void JNICALL Java_com_wiyun_engine_nodes_ColorLayer_nativeInit
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_wiyun_engine_nodes_ColorLayer
 * Method:    getAlpha
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_wiyun_engine_nodes_ColorLayer_getAlpha
  (JNIEnv *, jobject);

/*
 * Class:     com_wiyun_engine_nodes_ColorLayer
 * Method:    setAlpha
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_com_wiyun_engine_nodes_ColorLayer_setAlpha
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_wiyun_engine_nodes_ColorLayer
 * Method:    nativeGetColor
 * Signature: (Lcom/wiyun/engine/types/WYColor3B;)V
 */
JNIEXPORT void JNICALL Java_com_wiyun_engine_nodes_ColorLayer_nativeGetColor
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_wiyun_engine_nodes_ColorLayer
 * Method:    nativeSetColor
 * Signature: (III)V
 */
JNIEXPORT void JNICALL Java_com_wiyun_engine_nodes_ColorLayer_nativeSetColor
  (JNIEnv *, jobject, jint, jint, jint);

#ifdef __cplusplus
}
#endif
#endif