# AnimatedToast                                    [![](https://jitpack.io/v/saksham1211/AnimatedToast.svg)](https://jitpack.io/#saksham1211/AnimatedToast)
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
## Screenshots(_GIFs_):- 

![](https://user-images.githubusercontent.com/35836123/53662989-6ccc6a00-3c8a-11e9-8cee-322300c7f9de.gif)
(**Success Toast**)
![](https://user-images.githubusercontent.com/35836123/53663054-a2715300-3c8a-11e9-8d28-43a691edb6f4.gif)
(**Failure Toast**)


# Contributing:- 
Please fork this repository and contribute back using pull requests.

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated but will be thoroughly reviewed .

### Contact:- Let's become friends 
* [Github](https://github.com/saksham1211)

* [Instagram](https://www.instagram.com/saksham.dubey_/)

* [LinkedIn](https://www.linkedin.com/in/sakshamdubey/)

* [Twitter](https://twitter.com/saksham1211)

_Made with_ :heart: _for the community_
