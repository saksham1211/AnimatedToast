# AnimatedToast
Spice up your native android Toast library and make new cool animated Toasts in Android Studio. This custom made library helps you to design cool animated Toasts easily with minimal lines of code.

## Prerequisites
Add this in your root build.gradle file (not your module build.gradle file):

```````````````````
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
````````````````````

## Dependency

`````````
dependencies {
	        implementation 'com.github.saksham1211:AnimatedToast:1.0.1'
	}
`````````

## Usage:- 

Each method always returns a Toast object, so you can customize the Toast much more.

To display a Toast:-

(This is the syntax)
``````
ToastAnim.makeText(context, "message", duration,animation,
               background).show();
````````

### Example :- 

```
ToastAnim.makeText(MainActivity.this, "FAIL", ToastAnim.LENGTH_LONG, R.raw.error,
                R.drawable.fail_shape).show();
 ```

