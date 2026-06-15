plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":game"))
}

application {
    mainClass.set("com.survivalcoding.test.Main")
}
