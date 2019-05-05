// Save as "HelloJNI.c"
#include <jni.h>        // JNI header provided by JDK
#include <string.h>
#include <stdio.h>      // C Standard IO Header
#include "MyInterface.h"

JNIEXPORT void JNICALL Java_MyInterface_sayHello (JNIEnv *env, jclass jcl){
	printf("Hello World!\n");
   	return;
}
