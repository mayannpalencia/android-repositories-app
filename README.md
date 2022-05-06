# android-repositories-app
Pre-setup project for Live Coding challenge

## Preview
![Repositories App](https://user-images.githubusercontent.com/49086494/167051395-813c72da-e334-4f80-980f-eeb19f9650df.gif)


## Specification
- Android Studio Bumblebee 2021.1.1 Patch 3
- Language: Kotlin 1.6.20
- Minimum SDK: 23
- Target SDK: 32


## Libraries
* [Architecture][1] - Defines the boundaries between parts of the app and the responsibilities each part should have.
  * [Lifecycles][2] - Lifecycle-aware components perform actions in response to a change in the lifecycle status of another component, such as activities and fragments. These components help you produce better-organized, and often lighter-weight code, that is easier to maintain.
  * [LiveData][3] - An observable data holder class.
  * [ViewModel][4] - Designed to store and manage UI-related data in a lifecycle conscious way. 
* Third party
  * [Hilt][5] - A dependency injection library for Android that reduces the boilerplate of doing manual dependency injection.
  * [Kotlin Coroutines][6] - A concurrency design pattern that you can use on Android to simplify code that executes asynchronously.
  * [Retrofit][7] - A type-safe HTTP client for Android and Java.
  * [Glide][8] - A fast and efficient open source media management and image loading framework for Android that wraps media decoding, memory and disk caching, and resource pooling into a simple and easy to use interface.
  * [Lottie][9] - A mobile library for Android and iOS that parses Adobe After Effects animations exported as json with Bodymovin and renders them natively on mobile.
  

[1]: https://developer.android.com/jetpack/arch/
[2]: https://developer.android.com/topic/libraries/architecture/lifecycle
[3]: https://developer.android.com/topic/libraries/architecture/livedata
[4]: https://developer.android.com/topic/libraries/architecture/viewmodel
[5]: https://developer.android.com/training/dependency-injection/hilt-android
[6]: https://developer.android.com/kotlin/coroutines
[7]: https://square.github.io/retrofit/
[8]: https://github.com/bumptech/glide
[9]: https://github.com/airbnb/lottie-android
