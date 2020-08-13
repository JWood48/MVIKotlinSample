object Deps {

    object Jetbrains {
        object Kotlin : Group(name = "org.jetbrains.kotlin") {
            private const val version = "1.3.72"
            //private const val version = "1.4.0-rc"

            object Plugin {
                object Gradle : Dependency(group = Kotlin, name = "kotlin-gradle-plugin", version = version)
            }

            object StdLib {
                object Common : Dependency(group = Kotlin, name = "kotlin-stdlib-common", version = version)
                object Jdk7 : Dependency(group = Kotlin, name = "kotlin-stdlib-jdk7", version = version)
                object Js : Dependency(group = Kotlin, name = "kotlin-stdlib-js", version = version)
            }

            object Reflect : Dependency(group = Kotlin, name = "kotlin-reflect", version = version)

            object Test {
                object Common : Dependency(group = Kotlin, name = "kotlin-test-common", version = version)
                object Js : Dependency(group = Kotlin, name = "kotlin-test-js", version = version)
                object Junit : Dependency(group = Kotlin, name = "kotlin-test-junit", version = version)
            }

            object TestAnnotations {
                object Common : Dependency(group = Kotlin, name = "kotlin-test-annotations-common", version = version)
            }
        }

        object Kotlinx : Group(name = "org.jetbrains.kotlinx") {
            object Coroutines {
                private const val version = "1.3.5"

                object Core : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core", version = version) {
                    object Common : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-common", version = version)
                    object Native : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-native", version = version)
                    object Js : Dependency(group = Kotlinx, name = "kotlinx-coroutines-core-js", version = version)
                }

                object Android : Dependency(group = Kotlinx, name = "kotlinx-coroutines-android", version = version)
            }
        }
    }

    object Android {
        object Tools {
            object Build : Group(name = "com.android.tools.build") {
                object Gradle : Dependency(group = Build, name = "gradle", version = "3.6.0")
            }
        }
    }

    /*

    object MviKotlin {
    const val mvikotlin = "com.arkivanov.mvikotlin:mvikotlin:${Versions.mvikotlin}"
    const val mvikotlinMain = "com.arkivanov.mvikotlin:mvikotlin-main:${Versions.mvikotlin}"
    const val mvikotlinLogging = "com.arkivanov.mvikotlin:mvikotlin-logging:${Versions.mvikotlin}"
    const val mvikotlinTimetravel = "com.arkivanov.mvikotlin:mvikotlin-timetravel:${Versions.mvikotlin}"
    const val mvikotlinExtReaktive = "com.arkivanov.mvikotlin:mvikotlin-extensions-reaktive:${Versions.mvikotlin}"
    const val mvikotlinExtCoroutines = "com.arkivanov.mvikotlin:mvikotlin-extensions-coroutines:${Versions.mvikotlin}"
    const val mvikotlinExtAndroidx = "com.arkivanov.mvikotlin:mvikotlin-extensions-androidx:${Versions.mvikotlin}"
    const val mvikotlinRx = "com.arkivanov.mvikotlin:rx:${Versions.mvikotlin}"

}

    *
    * */



            object MviKotlin : Group(name = "com.arkivanov.mvikotlin") {
                const val version = "2.0.0-rc2"

                object Core : Dependency(group = MviKotlin, name = "mvikotlin", version = version)
                object Main : Dependency(group = MviKotlin, name = "mvikotlin-main", version = version)
                object Logging : Dependency(group = MviKotlin, name = "mvikotlin-logging", version = version)
                object Timetravel : Dependency(group = MviKotlin, name = "mvikotlin-timetravel", version = version)
                object ExtReaktive : Dependency(group = MviKotlin, name = "mvikotlin-extensions-reaktive", version = version)
                object ExtCoroutines : Dependency(group = MviKotlin, name = "mvikotlin-extensions-coroutines", version = version)
                object ExtAndroid : Dependency(group = MviKotlin, name = "mvikotlin-extensions-androidx", version = version)
                object Rx : Dependency(group = MviKotlin, name = "rx", version = version)
                object RxInt : Dependency(group = MviKotlin, name = "rx-internal", version = version)
            }





    object AndroidX {
        object Core : Group(name = "androidx.core") {
            object Ktx : Dependency(group = Core, name = "core-ktx", version = "1.1.0")
        }

        object AppCompat : Group(name = "androidx.appcompat") {
            object AppCompat : Dependency(group = AndroidX.AppCompat, name = "appcompat", version = "1.1.0")
        }

        object RecyclerView : Group(name = "androidx.recyclerview") {
            object RecyclerView : Dependency(group = AndroidX.RecyclerView, name = "recyclerview", version = "1.1.0")
        }

        object ConstraintLayout : Group(name = "androidx.constraintlayout") {
            object ConstraintLayout : Dependency(group = AndroidX.ConstraintLayout, name = "constraintlayout", version = "1.1.3")
        }

        object DrawerLayout : Group(name = "androidx.drawerlayout") {
            object DrawerLayout : Dependency(group = AndroidX.DrawerLayout, name = "drawerlayout", version = "1.0.0")
        }

        object Lifecycle : Group(name = "androidx.lifecycle") {
            object LifecycleCommonJava8 : Dependency(group = Lifecycle, name = "lifecycle-common-java8", version = "2.2.0")
            object LifecycleViewModel : Dependency(group = Lifecycle, name = "lifecycle-viewmodel", version = "2.2.0")
            object LifecycleViewModelSavedState : Dependency(group = Lifecycle, name = "lifecycle-viewmodel-savedstate", version = "2.2.0")
            object LifecycleRuntime : Dependency(group = Lifecycle, name = "lifecycle-runtime", version = "2.2.0")
        }
    }

    object Badoo {
        object Reaktive : Group(name = "com.badoo.reaktive") {
            private const val version = "1.1.14"

            object Reaktive : Dependency(group = Badoo.Reaktive, name = "reaktive", version = version)
            object ReaktiveAnnotations : Dependency(group = Badoo.Reaktive, name = "reaktive-annotations", version = version)
            object ReaktiveTesting : Dependency(group = Badoo.Reaktive, name = "reaktive-testing", version = version)
            object Utils : Dependency(group = Badoo.Reaktive, name = "utils", version = version)
        }
    }

    object TouchLab : Group(name = "co.touchlab") {
        object KotlinXcodeSync : Dependency(group = TouchLab, name = "kotlinxcodesync", version = "0.2")
    }

    open class Group(val name: String)

    open class Dependency private constructor(
        private val notation: String
    ) : CharSequence by notation {
        constructor(group: Group, name: String, version: String) : this("${group.name}:$name:$version")

        override fun toString(): String = notation
    }
}
