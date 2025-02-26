plugins {
    id("flipper.android-lib")
    id("com.squareup.anvil")
    id("kotlin-kapt")
}

android.namespace = "com.flipperdevices.updater.impl"

dependencies {
    implementation(projects.components.updater.api)
    implementation(projects.components.updater.subghz)

    implementation(projects.components.bridge.api)
    implementation(projects.components.bridge.pbutils)
    implementation(projects.components.bridge.service.api)
    implementation(projects.components.deeplink.api)

    implementation(projects.components.core.di)
    implementation(projects.components.core.log)
    implementation(projects.components.core.ktx)
    implementation(projects.components.core.preference)
    implementation(projects.components.core.ui.lifecycle)
    implementation(projects.components.core.ui.res)

    implementation(projects.components.analytics.metric.api)

    implementation(libs.lifecycle.runtime.ktx)

    // Dagger deps
    implementation(libs.dagger)
    kapt(libs.dagger.kapt)

    // Testing
    testImplementation(projects.components.core.test)
    testImplementation(libs.junit)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.ktx.testing)
    testImplementation(libs.roboelectric)
    testImplementation(libs.lifecycle.test)
    testImplementation(libs.kotlin.coroutines.test)
    testImplementation(projects.components.updater.downloader)
    testImplementation(libs.ktor.client)
    testImplementation(libs.ktor.negotiation)
    testImplementation(libs.ktor.serialization)
    testImplementation(libs.ktor.mock)
    testImplementation(libs.kotlin.serialization.json)
}
